package Model;

/**
 * Represents a coordinate, all the coordinate's operations will be here
 * @author Rodrigo Zanella Ribeiro
 */
public class Coordinate {
    private float x;
    private float y;
    private float z;
    
    public Coordinate(int newX, int newY, int newZ){
        x = newX;
        y = newY;
        z = newZ;
    }
    
    public void setX(float newX){
        x = newX;
    }
    
    public void setY(float newY){
        y = newY;
    }
    
    public void setZ(float newZ){
       z = newZ;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
       return y;
    }
    
    public float getZ(){
        return z;
    }
}
