import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Description;
import org.junit.Test;
import utils.dictionary;

import static utils.getProperties.getApplicationProperties;

public class apiTest {
//    String id;
//    String sProm = getApplicationProperties("sProm");
//    String model = "company/search";


//    public apiTest(String id) throws Exception {
//        this.id = "{\"id\":" + id + ", \"paging\":{\"page\":0, \"rows\":100}}";
//    }

    @Test
    @Description("Получения текущего списка моделей в API")
    public void getModels() throws Exception {
        String url = getApplicationProperties("sProm")+getApplicationProperties("modelInfo");
        String response = utils.HttpClientExample.sendGet(url);
        System.out.println(response +"\n");

        ObjectMapper objectMapper = new ObjectMapper();
        Pojo pojo =new ObjectMapper().readValue(response, Pojo.class);
        System.out.println(pojo.result.items.get(0));
    }


    @Test
    @Description("Тестирование моделей API")
    public void testApiModels(){
        String inn = dictionary.organization("established");
        System.out.println(inn);
    }

}
