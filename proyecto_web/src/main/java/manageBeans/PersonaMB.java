package manageBeans;

import java.util.List;

import javax.inject.Inject;

import Services.ejb.Appejb;
import config.enviroments;
import model.Persona;

public class PersonaMB {
    
    @Inject
    private Appejb appejb;

    private List<Persona> personas;

    public PersonaMB() {
    }

    public void init() {
        this.personas = appejb.methodListGet(enviroments.BASE_URL+"/consultarPersonas", Persona.class);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
    

