
/**
 * Write a description of class TestContador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestContador
{
    // instance variables - replace the example below with your own
    public static void main(String [] args){
        ContadorDeGanado contador = new ContadorDeGanado();
        contador.contar();
        contador.mostrar();
        
        for(int i=0; i<10; i++)
            contador.contar();
            
        contador.mostrar(); 
        
       
    }
        
}
