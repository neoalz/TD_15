
package td_15;

public class Empleado {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String run;
    private byte edad;
    private char genero;
    private int sueldoBruto;       
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos set">
     public void setNombre(String nombre) {
        if(nombre.length()>2){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre debe contener mínimo 3 caracteres");
        }
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        if(apellidoPaterno.length()>1){
            this.apellidoPaterno = apellidoPaterno;
        }else{
            System.out.println("Apellido debe contener mínimo 2 caracteres");
        }
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        if(apellidoMaterno.length()>1){
            this.apellidoMaterno = apellidoMaterno;
        }else{
            System.out.println("Apellido debe contener mínimo 2 caracteres");
        }
    }

    public void setRun(String run) {
        if(run.length()<11 && run.length()> 8 && run.contains("-")){
            this.run = run;
        }else{
            System.out.println("Run debe contener entre 9 a 10 caracteres incluyendo el guión");
        }
    }

    public void setEdad(byte edad) {
        if(edad>17){
            this.edad = edad;
        }else{
            System.out.println("La edad debe ser mayor o igual a 18 años");
        }
    }

    public void setGenero(char genero) {
        genero = Character.toUpperCase(genero);// m , f o x las transforma en mayuscula (to uppercase)
        if(genero == 'M' || genero == 'F' || genero == 'X'){
            this.genero = genero;
        }else{
            System.out.println("Genero debe ser 'M', 'F' o 'X'");
        }
    }

    public void setSueldoBruto(int sueldoBruto) {
        if(sueldoBruto>326499){
            this.sueldoBruto = sueldoBruto;
        }else{
            System.out.println("El sueldo ingresado es menor al sueldo minimo legal de 326500");
        }
    }       
    //</editor-fold>
            
    //<editor-fold defaultstate="collapsed" desc="Metodos get">
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getRun() {
        return run;
    }

    public byte getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }         
   //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String run, byte edad, char genero, int sueldoBruto) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.run = run;
        this.edad = edad;
        this.genero = genero;
        this.sueldoBruto = sueldoBruto;
    }     
            
            
            
   //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Otros Metodos">
       /**
       * Calcula el sueldo liquido descontando:<br>
       * AFP: 10.77%<br>
       * SALUD: 7%<br>
       * AFC: 3%
       */
    public void calcularSueldoLiquido(){
        int sueldoLiquido = (int)(getSueldoBruto()*0.7923);
        System.out.println(sueldoLiquido);
    }

    /**
     * Imprime la información del empleado
     */
    public void imprimirInformacionEmpleado(){
        String info = "Empleado:" + 
                "\nnombre: " + nombre + 
                "\napellido Paterno: " + apellidoPaterno + 
                "\napellido Materno: " + apellidoMaterno + 
                "\nrun: " + run + 
                "\nedad: " + edad + 
                "\ngenero: " + genero + 
                "\nsueldoBruto: " + sueldoBruto + '}';
        System.out.println(info);
    }
    
    /**
     * Aumenta el Sueldo bruto según el IPC(porcentaje) recibido por parametro
     * @param ipc
     */
    public void aumentoSueldoSegunIPC(float ipc){
        setSueldoBruto((int)(getSueldoBruto()*(1+(ipc%100))));
    }    
   //</editor-fold>
     
}
