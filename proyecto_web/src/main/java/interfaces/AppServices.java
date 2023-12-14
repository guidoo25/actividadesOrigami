package interfaces;

import java.util.List;
import javax.ejb.Local;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guido
 */
@Local
public interface AppServices {
    public Object methodGet(String url,Class clazz);
    
    public List methodListGet(String url, Class clazz);
    
    public Object methodPost(Object data,String  url,Class clazz);
    
    public Object methodListPost(Object data,String  url,Class clazz);

    
    
}
