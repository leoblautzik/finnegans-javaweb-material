
/**
 * Write a description of class ContadorDeGanado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContadorDeGanado
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ContadorDeGanado
     */
    public ContadorDeGanado()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void contar()
    {
        // put your code here
        x++;
    }
    
    public void mostrar()
    {
         System.out.println(x);
    }
    
    public void resetear()
    {
        x=0;       
    }
    
}
