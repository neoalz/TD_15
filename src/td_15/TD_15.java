
package td_15;

import java.util.Scanner;

public class TD_15 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = pedirValor("¿Cual es tu nombre?");
        String apellidoPaterno = pedirValor("¿Cual es tu nombre?");
        String apellidoMaterno = pedirValor("¿Cual es tu nombre?");
        String run = pedirValor("¿Cual es tu nombre?");
        byte edad = Byte.parseByte(pedirValor("¿Cual es tu nombre?"));
        char genero = pedirValor("¿Cual es tu nombre?").charAt(0);
        int sueldoBruto = Integer.parseInt(pedirValor("¿Cual es tu nombre?")); 
        
        Empleado empleado = new Empleado(nombre, apellidoPaterno, apellidoMaterno, run, edad, genero, sueldoBruto);
        
        empleado.imprimirInformacionEmpleado();
        
        empleado.calcularSueldoLiquido();
        
        float ipc = Float.parseFloat(pedirValor("¿Cual es el valor del IPC?"));
        empleado.aumentoSueldoSegunIPC(ipc);
        empleado.imprimirInformacionEmpleado();
        
    }
    
    public static String pedirValor(String solicitud){
        System.out.println(solicitud);
        String entrada = sc.next();
        return entrada;
    }
    
    
    
    
}
