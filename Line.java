/*
 * @author Stefanie Elling
 * CSCI 221 HW 4
 * I certify that this is my own personal work but I did receive assistance from the CSL.
 *
 * Purpose: Use the point class to create lines that eventually form a grid
 */

public class Line{
    //instance variables
    private Point start;
    private Point end;

    /*Parameters two Point objects. In this constructor initialize the start and end point instance variables with the point objects passed into the constructor. Precondition:
• start != null and end != null, if either is null do nothing*/
    public Line (Point start, Point end){
        if (start!= null && end != null){
            this.start = start;
            this.end = end;
        }
    }

    /*Get the start point instance variable. Parameters none. Precondition: None. Returns Point object.*/
    public Point getStart() {
        return start;
    }
    /*Get the end point instance variable. Parameters none. Precondition: None. Returns Point object.*/
    public Point getEnd() {
        return end;
    }

    /*Set start point instance variable. Parameter start that meets the precondition:
• if start != null, set start instance variable to start object parameter, otherwise do nothing*/
    public void setStart(Point start) {
        if (start != null) {
            this.start.setPoint(start);
        }
    }

    /*Set end point instance variable. Parameter end that meets the precondition:
• if end != null, set end instance variable to end object parameter, otherwise do nothing*/
    public void setEnd(Point end) {
        if (end != null) {
            this.end.setPoint(end);
        }
    }

    /*
Evaluates if the start and end instances variables are valid (i.e. not null). Returns a Boolean. Precondition none.
 If start != null and end != null return true, otherwise return false.*/
    public boolean isValid(){
        if(start != null && end != null){
            return true;
        }
        return false;
    }

    public static void main (String [] args){
        Point hi = new Point();
        Point hello = new Point(4,5);
        Line line = new Line(hi, hello);
        System.out.println(line);
    }
}
