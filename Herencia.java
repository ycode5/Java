public class Main {
    public static void main(String[] args) {

        Cliente cliente=new Cliente();
        cliente.setNombre("Maria");
        cliente.setEdad(29);
        cliente.setTelefono(15376945);
        cliente.setCredito(123);

        System.out.println("Mi nombre es " + cliente.getNombre());
        System.out.println("Tengo " + cliente.getEdad() + " años");
        System.out.println("Mi telefono es " + cliente.getTelefono());
        System.out.println("Mi credito es " + cliente.getCredito());

        Trabajador trabajador=new Trabajador();
        trabajador.setNombre("Miguel");
        trabajador.setEdad(26);
        trabajador.setTelefono(15768743);
        trabajador.setSalario(4000);

        System.out.println("mi nombre es " + trabajador.getNombre());
        System.out.println("Tengo " + trabajador.getEdad() + " años");
        System.out.println("Mi telefono es " + trabajador.getTelefono());
        System.out.println("Mi salario es de " + trabajador.getSalario());

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

class Cliente extends Persona{
    private Integer credito;

    public void setCredito(Integer credito ){
        this.credito=credito;
    }
    public Integer getCredito(){
        return this.credito;
    }


}

class Trabajador extends Persona{
    private Integer salario;

    public void setSalario(Integer salario){
        this.salario=salario;
    }
    public Integer getSalario(){
        return this.salario;
    }
}


