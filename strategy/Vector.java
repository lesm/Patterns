
/**
 * Write a description of class Vector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector extends DatoCompuesto{
    
    public Vector(double coordenadaX, double coordenadaY ){
        super(coordenadaX,coordenadaY);
        modoSuma = new SumaVector(this);
    }
    
    public double getMagnitud(){
        double magnitud = Math.sqrt(Math.pow(getX(),2)+Math.pow(getY(),2));
        return magnitud;
    }
}
