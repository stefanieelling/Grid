/*
* @author Stefanie Elling
* CSCI 221 HW 4
* I certify that this is my own personal work but I did receive assistance from the CSL.
*
* Purpose: Implementing the point class
*/
public class Point {

    //instance variables
    private int x;
    private int y;

    /*No parameters.
    In this no argument constructor initialize the x and y instance variables to 0.
    Precondition: None.*/
    public Point(){
        x = 0;
        y = 0;
    }

    /*Overloaded constructor that initializes the new point
     object's x and y instance variables values. Precondition:
• point != null
• ifx>=0andx<=GridConstants.MAX_PANEL_WIDTH set x instance variable to value in parameter, otherwise set x instance variable to 0
• ify>=0andy<= GridConstants.MAX_PANEL_HEIGHT set y instance variable to value in parameter, otherwise set y instance variable to 0*/
    public Point(Point point){
        if (point != null){
            if (point.getX() >= 0 && point.getX() <= GridConstants.MAX_PANEL_WIDTH){
                this.x = point.getX();
            }
            else {
                this.x = 0;
            }
            if (point.getY() >= 0 && point.getY() <= GridConstants.MAX_PANEL_HEIGHT){
                this.y = point.getY();
            }
            else {
                this.y = 0;
            }
        }
    }

    /*Overloaded constructor that initializes the x and y
     instance variable values using primitive values. ifx>=0andx<= GridConstants.MAX_PANEL_WIDTH set x instance variable to value in parameter, otherwise set x instance variable to 0
     if y>=0 and y<= GridConstants.MAX_PANEL_HEIGHT set y instance variable to value in parameter, otherwise set y instance variable to 0*/
    public Point(int x, int y){
        if (x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH){
            this.x = x;
        }
        else {
            this.x = 0;
        }
        if (y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT){
            this.y = y;
        }
        else {
            this.y = 0;
        }
    }

    /*Gets the x coordinate instance variable. Parameters none. Precondition: None. Returns int. */
    public int getX(){
        return x;
    }
    /*Gets the y coordinate instance variable. Parameters none. Precondition: None. Returns int. */
    public int getY(){
        return y;
    }
    /*Set the x coordinate value. Parameter x that meets the precondition:
• ifx>=0andx<= GridConstants.MAX_PANEL_WIDTH set x instance variable to value in parameter, otherwise set x instance variable to 0*/
    public void setX (int x){
        if (x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH){
            this.x = x;
        }
        else {
            this.x = 0;
        }
    }
    /*Set the y coordinate value. Parameter y that meets the precondition:
• ify>=0andy<= GridConstants.MAX_PANEL_HEIGHT set y instance variable to value in parameter, otherwise set y instance variable to 0*/
    public void setY (int y){
        if (y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT){
            this.y = y;
        }
        else {
            this.y = 0;
        }
    }
    /*Set to an existing point object. Parameter p that meets the precondition:
• p != null, if p == null do nothing.
• Additionally, the x and y values
stored in the provided point object must meet preconditions outlined in the setX() and setY() methods.*/
    public void setPoint(Point p){
        if (p != null){
            x = p.getX();
            y = p.getY();
            p.setX(x);
            p.setY(y);
        }
    }

    /*String method that shows the point*/
    public String toString(){
        return "Point: " + x + " " + y;
    }

    /*main method for testing purposes*/
    public static void main (String [] args){
        Point hi = new Point();
        System.out.println(hi);
        Point hello = new Point(4,5);
        System.out.println(hello);
        Point bye = new Point(hello);
        System.out.println(bye);
        bye.setPoint(hi);
        System.out.println(bye);

    }

}
