
/**
 * CSCI 221 Spring 2020
 * HW 4, part 3
 * @author Stefanie Elling
 *
 */
public class TestGridUI {

    public static void main(String[] args) {
        GridUI grid = new GridUI();
        GridUI grid2 = new GridUI();
        GridUI grid3 = new GridUI();
        
        // Add code to draw each of the grids mentioned in part 3 of HW.
        int i = 0;
        int j = 0;
        /* While loop to draw points for vertical lines */
        while (i >= 0 && i <= 400){
            Point p1 = new Point(i, 0);
            Point p2 = new Point(i , 400);
            Line line = new Line(p1, p2);
            grid.addLine(line);
            i += 200;
        }
        /* While loop to draw points for horizontal lines*/
        while (j >= 0 && j <= 400){
            Point p3 = new Point(0, j);
            Point p4 = new Point(400, j);
            Line line2 = new Line(p3, p4);
            grid.addLine(line2);
            j += 200;
        }

        int a = 0;
        int b = 0;
        /* While loop to draw points for vertical lines */
        while (a >= 0 && a <= 400){
            Point p1 = new Point(a, 0);
            Point p2 = new Point(a , 400);
            Line line = new Line(p1, p2);
            grid2.addLine(line);
            a += 100;
        }
        /* While loop to draw points for horizontal lines*/
        while (b >= 0 && b <= 400){
            Point p3 = new Point(0, b);
            Point p4 = new Point(400, b);
            Line line2 = new Line(p3, p4);
            grid2.addLine(line2);
            b += 100;
        }
        int c = 0;
        int d = 0;
        /* While loop to draw points for vertical lines */
        while (c >= 0 && c <= 400){
            Point p1 = new Point(c, 0);
            Point p2 = new Point(c , 400);
            Line line = new Line(p1, p2);
            grid3.addLine(line);
            c += 50;
        }

        /* While loop to draw points for horizontal lines*/
        while (d >= 0 && d <= 400){
            Point p3 = new Point(0, d);
            Point p4 = new Point(400, d);
            Line line2 = new Line(p3, p4);
            grid3.addLine(line2);
            d += 50;
        }

    }

} // end TestGrid
