
package Logic;

public class Historias {
    private Persona persona;
    private Enfermedad enfermedad;
    private Medicamentos medicamentos;

    public Historias(Persona persona, Enfermedad enfermedad, Medicamentos medicamentos) {
        this.persona = persona;
        this.enfermedad = enfermedad;
        this.medicamentos = medicamentos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Medicamentos getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamentos medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    
    
    
}
