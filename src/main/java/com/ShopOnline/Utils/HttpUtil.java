package com.ShopOnline.Utils;

import java.io.BufferedReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtil {

	private String value;

	public HttpUtil(String value) {
		this.value = value;
	}

	public Long[] getIds() {
		StringBuilder builder = new StringBuilder(value);
		if(builder.toString().contains("\"id\":[")){
			builder.delete(0, builder.indexOf("[") + 1);
			builder.delete(builder.indexOf("]"), builder.length());
			String arr[] = builder.toString().split(",");
			Long[] ids = new Long[arr.length];
			for (int i = 0; i < arr.length; i++) {

				ids[i] = Long.parseLong(arr[i]);
			}
			
			return ids;

		}else {
		
			Long[] ids=new Long[1];
			builder.delete(0, builder.indexOf("\"id\":") + 5);
			builder.delete(builder.indexOf("}")==-1?builder.length():builder.indexOf("}"), builder.length());
			ids[0]=Long.parseLong(builder.toString());
			return ids;
		}
		
	}

	public <T> T toModel(Class<T> tClass) {

		try {
			return new ObjectMapper().readValue(value, tClass);
		} catch (JsonParseException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

	public static HttpUtil of(BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new HttpUtil(sb.toString());
	}

	public String getValue() {
		return value;
	}

}
