import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Description;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import org.junit.Assert;
import org.junit.Test;
import utils.dictionary;
import utils.getModels;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utils.getProperties.getApplicationProperties;

public class apiTest {
    ArrayList<String> modelList = new ArrayList<>();
    String url = getApplicationProperties("sProm")+getApplicationProperties("modelInfo");

    public apiTest() throws Exception {
    }

//    List moddelsList;


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
    public void step0_getModels() throws Exception {
        String url = getApplicationProperties("sProm")+getApplicationProperties("modelInfo");
        String response = utils.HttpClientExample.sendGet(url);
        System.out.println(response +"\n");

//        Pojo pojo =new ObjectMapper().readValue(response, Pojo.class);
//        int count = pojo.result.items.size();
//        moddelsList = pojo.result.items;
//        System.out.println(pojo.result.items);
//        if (pojo.result.items.contains("organization")){
//            System.out.println("dgfhdfshdfghdfhdfghdfgh");
//        }
//        for(int i = 0; i < count; i++){
//            modelList.add(pojo.result.items.get(i));
//        }
//        System.out.println(modelList);
    }


    @Test
    @Description("Тестирование моделей API")
    public void step1_ModelOrganizationTest() throws Exception {
        if (!getModels.getModels(url, "organization")){
            Assert.fail("Не найдена модель organization в API");
        }

    }

}
