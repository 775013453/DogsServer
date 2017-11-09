package ${package}.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
  * @ClassName: ${className}
  * @Description: 实体类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
 
@Entity
@Table(name="t_user_info") 
  
public class ${className} implements Serializable{  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="id",nullable=true,unique=false)
    private  String id;
    
<#list properties as pro>
  
	@Column(name="${pro.name}",nullable=true,unique=false)
    private  ${pro.type} ${pro.name};  
</#list>  
      
<#list properties as pro> 
 
    public void set${pro.name?cap_first}(${pro.type} ${pro.name}){  
        this.${pro.name}=${pro.name};  
    }  
      
    public ${pro.type} get${pro.name?cap_first}(){  
        return this.${pro.name};  
    }       
</#list>  
}  