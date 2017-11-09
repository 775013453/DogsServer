 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: CodeGgenerator
 * @Description: 代码生成应用程序
 * @author Ouyang
 * @date 2017年8月2日 下午4:32:59
 * @最后修改人 Ouyang
 * @最后修改时间 2017年8月2日 下午4:32:59
 */
public class  CodeGenerator {  
  
    /**  
     * @param args  
     */   
    public static void main(String[] args) {     	    	
          
        List<Map<String, String>> pros = new  ArrayList<Map<String, String>>();  
/*        Map<String, String> pro_1 = new  HashMap<String, String>();  
        pro_1.put("type" , String.class.getSimpleName());  
        pro_1.put("name" ,  "id" );  
        pros.add(pro_1);  */         
        Map<String, String> pro_2 = new  HashMap<String, String>();  
        pro_2.put("type" , String.class.getSimpleName());  
        pro_2.put("name" ,  "goodsId" );  
        pros.add(pro_2);           
        Map<String, String> pro_3 = new  HashMap<String, String>();  
        pro_3.put("type" , String.class.getSimpleName());  
        pro_3.put("name" ,  "salesVolume" );  
        pros.add(pro_3); 

        Map<String, String> pro_4 = new  HashMap<String, String>();  
        pro_4.put("type" , String.class.getSimpleName());  
        pro_4.put("name" ,  "salesSurplus" ); 
        pros.add(pro_4);
/*
        Map<String, String> pro_5 = new  HashMap<String, String>();  
        pro_5.put("type" , String.class.getSimpleName());  
        pro_5.put("name" ,  "goodsRelatepicDetail" );  
        pros.add(pro_5); */
/*
        Map<String, String> pro_6 = new  HashMap<String, String>();  
        pro_6.put("type" , Integer.class.getSimpleName());  
        pro_6.put("name" ,  "goodsRelatepicationCreatDate" );  
        pros.add(pro_6); 
        Map<String, String> pro_7 = new  HashMap<String, String>();  
        pro_7.put("type" , Integer.class.getSimpleName());  
        pro_7.put("name" ,  "goodsRelatepicationCouponId" );  
        pros.add(pro_7); 
        Map<String, String> pro_8 = new  HashMap<String, String>();  
        pro_8.put("type" , Integer.class.getSimpleName());  
        pro_8.put("name" ,  "goodsRelatepicationPrice" );  
        pros.add(pro_8); 
        Map<String, String> pro_9 = new  HashMap<String, String>();  
        pro_9.put("type" , Integer.class.getSimpleName());  
        pro_9.put("name" ,  "goodsRelatepicationName" );  
        pros.add(pro_9); 
        Map<String, String> pro_10 = new  HashMap<String, String>();  
        pro_10.put("type" , Integer.class.getSimpleName());  
        pro_10.put("name" ,  "goodsRelatepicationPic" );  
        pros.add(pro_10); */
/*        Map<String, String> pro_11 = new  HashMap<String, String>();  
        pro_11.put("type" , Integer.class.getSimpleName());  
        pro_11.put("name" ,  "used" );  
        pros.add(pro_11); 
*/
        
        TemplateUtil.createEntity("com.wondergroup.example.sales","sales",pros);
        TemplateUtil.codeGenerator("com.wondergroup.example.sales","sales");
    }  
  
}  