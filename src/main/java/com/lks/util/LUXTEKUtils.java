package com.lks.util;

import com.lks.pojo.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class LUXTEKUtils {


	// 获取访问者的IP地址
	public static String getIpAddr(HttpServletRequest request) throws Exception {
		String ip = request.getHeader("X-Real-IP");
		if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
			return ip;
		}
		ip = request.getHeader("X-Forwarded-For");
		if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
			// 多次反向代理后会有多个IP值，第一个为真实IP。
			int index = ip.indexOf(',');
			if (index != -1) {
				return ip.substring(0, index);
			} else {
				return ip;
			}
		} else {
			return request.getRemoteAddr();
		}
	}


	// 生成管理员token
	public static String getManagerToken(SysUser sysUser) throws Exception {
		String md5 = UUID.randomUUID().toString();
		return md5.replace("-","");
	}


	// 管理员密码加密
	public static String encryptionManagerPWD(String password) {
		String md5 = MD5Tools.MD5(password);
		return md5;
	}

	// 支付密码加密
	public static String encryptionPayPWD(String payPwd) {
		String md5 = MD5Tools.MD5(payPwd);
		return md5;
	}

	// 校验图片格式
	public static boolean checkImg(String fileName) {
		if (StringUtils.isBlank(fileName)) {
			return false;
		}
		String[] arr = new String[] { ".jpg", ".png", ".bmp" };
		for (int i = 0; i <= arr.length; i++) {
			if (fileName.endsWith(arr[i])) {
				return true;
			}
		}
		return false;
	}

	// 判断微信和支付宝性别
	public static String getGender(String sex) {
		if (sex == null) {
			return null;
		}
		if ("1".equals(sex)) {
			return "男";
		}
		if ("2".equals(sex)) {
			return "女";
		}
		if ("F".equals(sex)) {
			return "女";
		}
		if ("M".equals(sex)) {
			return "男";
		}
		return null;
	}

}
