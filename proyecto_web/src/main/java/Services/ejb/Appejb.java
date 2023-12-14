package Services.ejb;

import java.net.URI;

import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.MediaType;



@Singleton
@ApplicationScoped
public class Appejb {
    private Gson gson;
    private GsonBuilder builder;

    public Appejb() {
        builder = new GsonBuilder();
        gson = builder.create();
    }

    public Object methodGET(String url, Class clazz) {
        try {
            RestTemplate rst = new RestTemplate();
            HttpHeaders headers = new HttpHeaders ();
            headers.setContentType(MediaType.APPLICATION_JSON);
            URI uri = new URI(url);
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<Object> response = rst.exchange(uri,HttpMethod.GET,request,clazz);
            if(response != null){
                return response.getBody();
            }

           
        } catch (Exception e) {
       e.printStackTrace();
        }
        return null;
    
    }

    public List methodListGet (String url,Class clazz){
        try{

            RestTemplate rst = new RestTemplate();
            HttpHeaders headers = new HttpHeaders ();
            headers.setContentType(MediaType.APPLICATION_JSON);
            URI uri = new URI(url);
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity <Object> response = rst.exchange(uri,HttpMethod.GET,request,clazz);
            if(response != null){
                return Arrays.asList(response.getBody());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
   


 
