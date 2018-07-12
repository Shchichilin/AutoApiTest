package utils;

import java.util.HashMap;
import java.util.Map;

public class dictionary {
    public static String organization(String model){
        Map<String, String> organization = new HashMap<String, String>();
        organization.put("model", "3441010551"); // для получения модели
        organization.put("event", "3441010551"); // для получения определённого свойства
        organization.put("address-history", "3804999814");
        organization.put("invalid-address","3250517943");
        organization.put("invalid-data","3442112524");
        organization.put("unfair-compliant-inclusion","1901117599");
        organization.put("unfair-compliant","6686023835");
        organization.put("established","7744001497");
        organization.put("established-history","7744001497");
        organization.put("planned-inspection","0101002156");
        organization.put("unplanned-inspection","0105025965");
        organization.put("trademarks","7826014923");
        organization.put("founder_in","7712040126");
        organization.put("leader_in","4205253730");
        organization.put("iplegallist","4821003030");
        organization.put("iplegal","5903037635");
        organization.put("headed","2312100526");
        organization.put("headed-history","2312100526");
        organization.put("founder-history","7704211201");
        organization.put("leader","3803100054");
        organization.put("leader-history","6166016158");
        organization.put("change-address-decision","7709305252");
        organization.put("source-file","5507245279");
        organization.put("okved","7730161765");
        organization.put("license","7704211201");
        organization.put("other","7704211201"); // # для получения всех остальных свойств
        //organization.put("","");
        String inn = organization.get(model);
        return inn;
    }

    public static String entrepreneur(String model){
        Map<String, String> entrepreneur = new HashMap<String, String>();
        entrepreneur.put("model","641901324491");
        entrepreneur.put("model-list","250500383158");
        entrepreneur.put("license","781612806543");
        entrepreneur.put("okved","772333709256");
        entrepreneur.put("planned-inspection","024700158025");
        entrepreneur.put("unfair-compliant-inclusion","190122108234");
        entrepreneur.put("unfair-compliant","190122108234");
        entrepreneur.put("unplanned-inspection","251100055570");
        entrepreneur.put("source-file","222500327630");
        entrepreneur.put("headed","190200291847");
        entrepreneur.put("leader_in","7712040126");
        entrepreneur.put("other","641901324491");
        String inn = entrepreneur.get(model);
        return inn;
    }
}
