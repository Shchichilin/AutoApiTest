

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "item",
        "rows",
        "count"
})
class Paging {

    @JsonProperty("item")
    public int item;
    @JsonProperty("rows")
    public int rows;
    @JsonProperty("count")
    public int count;

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "result"
})
class Pojo {

    @JsonProperty("status")
    public boolean status;
    @JsonProperty("result")
    public Result result;

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "paging",
        "items"
})
class Result {

    @JsonProperty("paging")
    public Paging paging;
    @JsonProperty("items")
    public List<String> items = null;

}