package com.tbk.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {
	public static void responseUtils(HttpServletResponse response,String result) throws IOException{
		response.setContentType("application/json");
	 	response.setCharacterEncoding("utf-8");
		response.getWriter().write(result);
	}
}
