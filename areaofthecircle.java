import java.util.Scanner;
import java.util.*;

public class areaofthecircle {
    Scanner scan=new Scanner(System.in);
    double pi=3.14;
    int radius=scan.nextInt();
    

    public void area(){
        double area=pi*radius*radius;
        System.out.println("area of the circle is :- "+area);
    }
}
