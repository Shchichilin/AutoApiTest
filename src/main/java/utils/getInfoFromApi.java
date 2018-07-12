package utils;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class getInfoFromApi {
    private final Gson gson = new Gson();

    private Result getResponse(String json) {
        return gson.fromJson(json, Response.class).result;
    }

    public static List<String> getAlldata(String json) {
         final Gson gson = new Gson();
        Response result = gson.fromJson(json, Response.class);
        return Optional.ofNullable(result.result)
                .map(r -> r.items.stream()
                        .map(item -> item.included)
                        .collect(toList()))
                .orElse(Collections.singletonList("Пустой результат с API"));
    }

    private class Response {
        Result result;
    }

    private class Result {
        List<Item> items;
    }

    private class Item {
        String included;
    }
}
