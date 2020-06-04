import  java.util.Scanner ;
public class MainTarjeta {
    public static void main (String args[]){
Scanner leer=new Scanner(System.in);

//Avisando al programa que hare un objeto tarjeta;
Tarjeta tarjeta;

int nCuenta, NIP, opcion;
System.out.print("Ingrese su numero de cuenta: ");
nCuenta=leer.nextInt();

System.out.print("Ingrese su numero de NIP: ");
NIP=leer.nextInt();

//instanciando y llamando al metodo
tarjeta=new Tarjeta().verificarCuenta(nCuenta, NIP);
System.out.println(tarjeta.toString());

System.out.println();
System.out.println();

System.out.println("Tu nombre es el siguiente chavo:"+tarjeta.nombre);

System.out.print("1.- Hacer un deposito");
System.out.print("\n2.- Hacer un retiro");
System.out.print("\n3.- Eliminar apartado");
System.out.print("\n4.- Imprimir datos de la cuenta");
System.out.print("\n5.- Salir");
System.out.print("\nElegir una opcion: ");
opcion=leer.nextInt();
switch(opcion){
    case 4:
        System.out.print(tarjeta.toString());
        break;
}

}    
    
}
