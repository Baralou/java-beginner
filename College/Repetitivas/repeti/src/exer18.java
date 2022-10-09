import java.util.*;
public class exer18 {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        double x,y,z;
        x = data.nextFloat();
        double t = 19.06+0.211*Math.cos(0.08721 * x) +  (-5.51)*Math.sin(0.08721*x) ;

        System.out.println(t);



    }
}
