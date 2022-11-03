public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("Carla");
        persona.setEdad(20);
        persona.setTelefono(15534645);

        System.out.println("Mi nombre es " + persona.getNombre());
        System.out.println("Tengo " + persona.getEdad() + "años");
        System.out.println("Mi telefono es " + persona.getTelefono());

        }

    }
class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(Integer edad) {
        this.edad=edad;
    }
    public  Integer getEdad(){

        return this.edad;
    }
    public void setTelefono(Integer telefono){
        this.telefono=telefono;
    }
    public Integer getTelefono(){

        return this.telefono;
    }




}
