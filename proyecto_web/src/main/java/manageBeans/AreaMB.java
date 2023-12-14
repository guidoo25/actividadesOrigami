import interfaces.AppServices;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;


import config.enviroments;
import model.Area;


@ViewScoped
public class AreaMB  implements Serializable{
    @Inject
    private AppServices appservices;
    private List<Area> areas;
    
    @PostConstruct
    public void init(){
    areas = appservices.methodListGet(enviroments.BASE_URL+"/consultarProcesos", Area.class);
    }

    public AppServices getAppservices() {
        return appservices;
    }

    public void setAppservices(AppServices appservices) {
        this.appservices = appservices;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    private Object Area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
    
    


}