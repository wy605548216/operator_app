package com.lks.jwt;

import com.lks.pojo.MobileResult;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    private static final PathMatcher pathMatcher = new AntPathMatcher();

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        RequestParameterWrapper requestParameterWrapper = new RequestParameterWrapper(request);
        try {
            if(isProtectedUrl(request)) {
                //因为jwt用来验证身份的验证码是储存在header中的，而用swagger2时header中的值不好设置，需要进行修改，因此这里改成了从body中获取
                //String token = request.getHeader("Authorization");
                String token = request.getHeader("Authorization");
                //检查jwt令牌, 如果令牌不合法或者过期, 里面会直接抛出异常, 下面的catch部分会直接返回
                Map<String, Object> tokenMap = JwtUtil.validateToken(token);
                requestParameterWrapper.addParameters(tokenMap);
            }
        } catch (Exception e) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            PrintWriter out = null;
            MobileResult mobileResult = new MobileResult();
            mobileResult.setCode(700);
            mobileResult.setMessage("登录超时");
            mobileResult.setData("登录超时");
            String string = JSON.toJSONString(mobileResult);
            out = response.getWriter();
            out.append(string);
            return;
        }
        //如果jwt令牌通过了检测, 那么就把request传递给后面的RESTful api
        filterChain.doFilter(requestParameterWrapper, response);
    }


    //我们只对地址 /api 开头的api检查jwt. 不然的话登录/login也需要jwt
    private boolean isProtectedUrl(HttpServletRequest request) {
        return request.getServletPath().contains("api") && !request.getServletPath().contains("v2");
        // return pathMatcher.match("/api/**", request.getServletPath());
    }

}
