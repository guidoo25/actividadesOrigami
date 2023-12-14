package manageBeans;
import Services.ejb.Appejb;
import config.enviroments;
import model.Proceso;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import java.util.List;


@ManagedBean
@ViewScoped
public class ProcesoMB {

    @Inject
    private Appejb appejb;

    private List<Proceso> procesos;

    public ProcesoMB() {
    }

    public void init() {
        this.procesos = appejb.methodListGet(enviroments.BASE_URL+"/consultarProcesos", Proceso.class);
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<Proceso> procesos) {
        this.procesos = procesos;
    }
}