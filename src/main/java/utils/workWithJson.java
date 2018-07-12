package utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class workWithJson {
        public static String sendPostRequest(String urlApi, String json, String model) throws Exception {
            org.apache.http.client.HttpClient httpClient = new DefaultHttpClient();
            HttpPost request = new HttpPost(urlApi + model);
            request.addHeader("content-type", "application/json");
            request.setEntity(new StringEntity(json));
            org.apache.http.HttpResponse response = httpClient.execute(request);
            return new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8")).readLine();
        }
}
