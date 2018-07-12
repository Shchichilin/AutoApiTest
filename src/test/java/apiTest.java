import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Description;
import org.junit.Test;
import utils.dictionary;

import java.util.ArrayList;

import static utils.getProperties.getApplicationProperties;

public class apiTest {
    ArrayList<String> modelList = new ArrayList<>();

//    String id;
//    String sProm = getApplicationProperties("sProm");
//    String model = "company/search";

//    public apiTest(String id) throws Exception {
//        this.id = "{\"id\":" + id + ", \"paging\":{\"page\":0, \"rows\":100}}";
//    }
//    public class Models {
//        public Models(String nameModel) {
//            this.nameModel = nameModel;
//        }
//
//        private String nameModel;
//
//        public String getNameMedels() {
//            return nameModel;}}

    @Test
    @Description("Получения текущего списка моделей из API")
    public void step1_getModels() throws Exception {
        String url = getApplicationProperties("sProm")+getApplicationProperties("modelInfo");
        String response = utils.HttpClientExample.sendGet(url);
        System.out.println(response +"\n");

        Pojo pojo =new ObjectMapper().readValue(response, Pojo.class);
        int count = pojo.result.items.size();

        for(int i = 0; i < count; i++){
            modelList.add(pojo.result.items.get(i));
        }
        System.out.println(modelList);
    }


    @Test
    @Description("Тестирование моделей API")
    public void step2_ModelOrganizationTest(){
        String inn = dictionary.organization("established");
        System.out.println(inn);

    }

}
