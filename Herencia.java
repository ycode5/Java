public class Main {
    public static void main(String[] args) {

        Cliente cliente=new Cliente();
        Trabajador trabajador=new Trabajador();
        cliente.nombre ="Maria";
        cliente.edad=29;
        cliente.telefono=15376945;
        cliente.credito= 123.03;

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + " USD");

        trabajador.nombre="Miguel";
        trabajador.edad=26;
        trabajador.telefono=15768743;
        trabajador.salario= 4000.00;

        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");

        }
    }
class Persona{
     String nombre;
     Integer edad;
     Integer telefono;

}
class Cliente extends Persona{
     Double credito;

}

class Trabajador extends Persona{
     Double salario;

}



