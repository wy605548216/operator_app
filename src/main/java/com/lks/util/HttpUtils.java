package com.lks.util;



import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import net.sf.json.JSONObject;

import java.io.*;


/**
 * 用于模拟HTTP请求中GET/POST方式
 * 
 * @author landa
 *
 */
public class HttpUtils {

	public static JSONObject doGetPay(String requestUrl, String Bearer)  {
		HttpClient client = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(requestUrl);
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		httpget.setHeader("Authorization", Bearer);
		String res;
		try {
			res = client.execute(httpget, responseHandler);
			JSONObject JSONO=JSONObject.fromObject(res);
			return JSONO;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	};

}