import io.qameta.allure.Description;
import lombok.SneakyThrows;
import org.junit.Test;

import static utils.getProperties.getApplicationProperties;

public class apiTest {
//    String id = "2";
//    String sProm = getApplicationProperties("sProm");
//    String model = "company/search";
//
//
//    public apiTest(String id) throws Exception {
//        this.id = "{\"id\":" + id + ", \"paging\":{\"page\":0, \"rows\":100}}";
//    }

    @Test
    @Description("Получения текущего списка моделей в API")
    public void getModels() throws Exception {
        String url = getApplicationProperties("sProm")+getApplicationProperties("modelInfo");
        String response = utils.HttpClientExample.sendGet(url);
        System.out.println(response);
    }


}