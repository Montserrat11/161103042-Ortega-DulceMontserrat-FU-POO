import java.util.Scanner;
public class PagodeImpuestos {
    public static void main (String args[]){
       Scanner leer=new Scanner(System.in);

        System.out.println("Introduzca su edad: ");
        int Edad=leer.nextInt();
        System.out.println("La edad es :"+Edad);

           if(Edad<=15){
            System.out.println("La respuesta es: NO "); 
            return;
}

        System.out.println("Introduzca su ingreso mensual: ");
        int Ingreso=leer.nextInt();
        System.out.println("El ingreso mensual es :"+Ingreso);


        System.out.println("¿Debes tributar?: ");

        if((Edad>=16)&&(Ingreso>=1000)){
        System.out.println("La respuesta es: SI ");    
}
        if (Edad>=16&&(Ingreso<=999)){
        System.out.println("La respuesta es: NO "); 
}


}    
    
}
