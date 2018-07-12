package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class getModels {
    public static boolean getModels(String url, String model) throws Exception {
        String response = utils.HttpClientExample.sendGet(url);
        System.out.println(response +"\n");

        Pojo pojo = new ObjectMapper().readValue(response, Pojo.class);
        boolean a = pojo.result.items.contains(model);
        return a;
    }
}
