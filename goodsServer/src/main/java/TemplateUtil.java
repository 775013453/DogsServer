import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;


/**
  * @ClassName: TemplateUtil
  * @Description: 代码自动生成处理类，包括实体及dao,service,action
  * @author Ouyang
  * @date 2017年8月2日 下午4:32:59
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月2日 下午4:32:59
  */
public class TemplateUtil {
	
	public static Log log=LogFactory.getLog(TemplateUtil.class);  
	
	public static void createEntity(String pacStr,String className,List<Map<String, String>> pros){
		Configuration cfg = new Configuration(); 
	    try {  
	    	cfg.setObjectWrapper(new DefaultObjectWrapper());
	        cfg.setClassForTemplateLoading(TemplateUtil.class,pacStr);     
	        cfg.setDirectoryForTemplateLoading(
	        		new File(System.getProperty("user.dir")+"/src/main/resources/codeGenerator/"));
	        Template template = cfg.getTemplate("Entity.ftl" ); 
	        
	        String path=System.getProperty("user.dir")+
					"/src/main/java/"+pacStr.replace('.','/');
	  	  	File fileDir=new File(path+"/entity/");
	        File file=new File(path+"/entity/"+className+".java");
	        if(!fileDir.isDirectory()){
	          	fileDir.mkdirs();
	        }
	        if(!file.exists()){            	
	          	file.createNewFile();
	        }                    
	        FileOutputStream fos = new  FileOutputStream(file);   	         
	  
	        Map<String, Object> data = new  HashMap<String, Object>();  
	        data.put("package",pacStr);    
	        data.put("className",className);  	          
	        data.put("properties" , pros);  
	        template.process(data, new  OutputStreamWriter(fos,"utf-8" ));    
	        fos.flush();  
	        fos.close();  
	        log.info("====="+pacStr+".entity."+className+".java 生成成功=====");
	    }catch (IOException eio){  
	        eio.printStackTrace();  
	    }catch (TemplateException et){  
	        et.printStackTrace();  
	    }  
	}
	
	public static void codeGenerator(String pacStr,String className){		
		String[] strArr={"Dao.ftl","DaoImpl.ftl","Service.ftl","ServiceImpl.ftl","Controller.ftl"};	
		String[] suffix={"Dao","DaoImpl","Service","ServiceImpl","Controller"};		
		String[] pacArr={"/dao/","/dao/impl/","/service/","/service/impl/","/action/"};
		for(int i=0;i<strArr.length;i++){			
			Configuration cfg = new Configuration(); 
		    try {  
		    	cfg.setObjectWrapper(new DefaultObjectWrapper());
		        cfg.setClassForTemplateLoading(TemplateUtil.class,pacStr);     
		        cfg.setDirectoryForTemplateLoading(
		        		new File(System.getProperty("user.dir")+"/src/main/resources/codeGenerator/"));
		        Template template = cfg.getTemplate(strArr[i]); 		        
		        String path=System.getProperty("user.dir")+
						"/src/main/java/"+pacStr.replace('.','/');
		  	  	File fileDir=new File(path+pacArr[i]);	  	  	
		        File file=new File(path+pacArr[i]+className+suffix[i]+".java");
		        if(!fileDir.isDirectory()){
		          	fileDir.mkdirs();
		        }
		        if(!file.exists()){            	
		          	file.createNewFile();
		        }                    
		        FileOutputStream fos = new  FileOutputStream(file);   	         
  
		        Map<String, Object> data = new  HashMap<String, Object>();  
		        String[] entity=pacStr.split("\\.");
		        data.put("package",pacStr);
		        data.put("entityPath",entity[0]+"."+entity[1]+"."+entity[2]);
		        data.put("className",className);  	          
		        template.process(data, new  OutputStreamWriter(fos,"utf-8" ));    
		        fos.flush();  
		        fos.close(); 
		        log.info("====="+pacStr+"."+
		        pacArr[i].split("/")[1]+"."+className+suffix[i]+".java 生成成功=====");
		    }catch (IOException eio){  
		        eio.printStackTrace();  
		    }catch (TemplateException et){  
		        et.printStackTrace();  
		    }
		}  
	}
}

