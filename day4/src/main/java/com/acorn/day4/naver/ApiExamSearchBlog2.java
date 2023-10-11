package com.acorn.day4.naver;

//네이버 검색 API 예제 - 블로그 검색
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;


@Component
public class ApiExamSearchBlog2 {


 public static void main(String[] args) {
    
	 ApiExamSearchBlog2 api = new ApiExamSearchBlog2();
	 String result = api.getNaverAPI();
	 System.out.println( result);
	 
	 
	 
	 ArrayList<ItemDTO> list = api.fromJSONItems(result);
	 System.out.println( list);
	 

 }
 


 public ArrayList<ItemDTO> fromJSONItems(String result) {
	 
	 
	 JSONObject rjson = new JSONObject( result);
	 System.out.println( rjson);
	 JSONArray items = rjson.getJSONArray("items");
	 
	 
	 ArrayList<ItemDTO> list = new ArrayList<>();
	 
	 
	 
	 for(int i=0; i<items.length(); i++) {
		 JSONObject item = items.getJSONObject(i);
		 System.out.println( item);
		 String title = item.getString("title");
		 String link = item.getString("link");
		 String image = item.getString("image");
		 String lprice = item.getString("lprice");
		 
		 
		 ItemDTO itemdto = new ItemDTO();
		 itemdto.setTitle(title);
		 itemdto.setLink(link);
		 itemdto.setImage(image);
		 itemdto.setLprice(lprice);
		 list.add(itemdto);
		 
	 }
	 
	 
	 System.out.println("ArryList = " + list);
	 return list;
 }
 
 
 
 
 //함수로 만든 이유는 실행할 때 호출하려고
 public String getNaverAPI() {
	 String clientId = "sHR2ECkMFubno3bUM1Cm"; //애플리케이션 클라이언트 아이디
     String clientSecret = "_rH7na2aX0"; //애플리케이션 클라이언트 시크릿


     String text = null;
     try {
         text = URLEncoder.encode("빵", "UTF-8");
     } catch (UnsupportedEncodingException e) {
         throw new RuntimeException("검색어 인코딩 실패",e);
     }


     String apiURL = "https://openapi.naver.com/v1/search/shop?query=" + text;    // JSON 결과
     //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // XML 결과


     Map<String, String> requestHeaders = new HashMap<>();
     requestHeaders.put("X-Naver-Client-Id", clientId);
     requestHeaders.put("X-Naver-Client-Secret", clientSecret);
     String responseBody = get(apiURL,requestHeaders);


     System.out.println(responseBody);
     
     
     return responseBody;
 }


 private static String get(String apiUrl, Map<String, String> requestHeaders){
     HttpURLConnection con = connect(apiUrl);
     try {
         con.setRequestMethod("GET");
         for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
             con.setRequestProperty(header.getKey(), header.getValue());
         }


         int responseCode = con.getResponseCode();
         if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
             return readBody(con.getInputStream());
         } else { // 오류 발생
             return readBody(con.getErrorStream());
         }
     } catch (IOException e) {
         throw new RuntimeException("API 요청과 응답 실패", e);
     } finally {
         con.disconnect();
     }
 }


 private static HttpURLConnection connect(String apiUrl){
     try {
         URL url = new URL(apiUrl);
         return (HttpURLConnection)url.openConnection();
     } catch (MalformedURLException e) {
         throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
     } catch (IOException e) {
         throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
     }
 }


 private static String readBody(InputStream body){
     InputStreamReader streamReader = new InputStreamReader(body);


     try (BufferedReader lineReader = new BufferedReader(streamReader)) {
         StringBuilder responseBody = new StringBuilder();


         String line;
         while ((line = lineReader.readLine()) != null) {
             responseBody.append(line);
         }


         return responseBody.toString();
     } catch (IOException e) {
         throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
     }
 }
}
