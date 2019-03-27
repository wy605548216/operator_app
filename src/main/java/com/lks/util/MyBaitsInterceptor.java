package com.lks.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component
//拦截Executor类的query方法
@Intercepts({
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}),
        })
public class MyBaitsInterceptor implements Interceptor {


    private static String picUrl;

    @Override
    /***
     * 返回结果集拦截
     */
    public Object intercept(Invocation invocation) throws Throwable {
        Object result = invocation.proceed(); //执行请求方法，并将所得结果保存到result中
        if (result instanceof Map) {
            MyBaitsInterceptor.iteMap((Map) result);
        }
        if (result instanceof ArrayList) {
            ArrayList resultList = (ArrayList) result;
            for (int i = 0; i < resultList.size(); i++) {
                if (resultList.get(i) instanceof Map) {
                    MyBaitsInterceptor.iteMap((Map) resultList.get(i));
                }
            }
        }
        return result;
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

    public static void iteMap(Map obj){
        Set<String> set = obj.keySet();
        for (String k : set){
            if (k.contains("Img") || k.contains("img") && StringUtils.isNotBlank(obj.get(k).toString())){
                obj.put(k,picUrl+obj.get(k));
            }
        }
    }

    @Value("${url.pic}")
    public void setPicUrl(String picUrl) {
        MyBaitsInterceptor.picUrl = picUrl;
    }
}
