 

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
          
       /* List<Map<String, String>> pros = new  ArrayList<Map<String, String>>();  
        Map<String, String> pro_1 = new  HashMap<String, String>();  
        pro_1.put("type" , String.class.getSimpleName());  
        pro_1.put("name" ,  "id" );  
        pros.add(pro_1);*/              
        
        /*TemplateUtil.createEntity("com.wondergroup.example.sales","sales",pros);*/
        TemplateUtil.codeGenerator("com.wondergroup.example.handle.SysConponTable","SysConponTable");
        TemplateUtil.codeGenerator("com.wondergroup.example.handle.SysGoodsdetailTable","SysGoodsdetailTable");
        TemplateUtil.codeGenerator("com.wondergroup.example.handle.SysGoodsTable","SysGoodsTable");
        TemplateUtil.codeGenerator("com.wondergroup.example.handle.SysOrdersTable","SysOrdersTable");
        TemplateUtil.codeGenerator("com.wondergroup.example.handle.SysReceiveAddr","SysReceiveAddr");
        TemplateUtil.codeGenerator("com.wondergroup.example.handle.SysScoreTable","SysScoreTable");
        TemplateUtil.codeGenerator("com.wondergroup.example.handle.SysUserTable","SysUserTable");
    }  
  
}  