import java.util.*;
import java.util.Random;
public class ejercicio4{
    public static void main(String[] args){ 
    Random r = new Random();
    int [] a = new int [10];
    int may ;

    for (int i=0; i < a.length; i++ ){
        a[i]=r.nextInt(110);

    }
    for (int i=0; i < a.length; i++ ){
        System.out.print(a[i]+" , ");
    }

    may=a[0];

    for (int i=0; i < a.length; i++ ){
        if(a[i] > may ){
            may = a[i];

        }
    }
    System.out.println(" el mayor es "+may);
    

    for (int i=0; i < a.length; i++ ){
        a[i]=r.nextInt(110);

    }
    for (int i=0; i < a.length; i++ ){
        System.out.print(a[i]+" , ");
    }

    may=a[0];

    for (int i=0; i < a.length; i++ ){
        if(a[i] < may ){
            may = a[i];

        }
    }
    System.out.println(" el menor es "+may);

    }
}    