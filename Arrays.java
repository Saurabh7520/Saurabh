import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] numb = new int [size];
         
        //for input
        for (int i = 0; i<size; i++) {
            numb[i] = sc.nextInt();
        }
         // number to find // binary search by SAURABH
        int x = sc.nextInt();

        //for output 
        for (int i =  0; i<numb.length; i++) {
            if (numb[i]== x) {
                System.out.println(i);
            }
        }
        
    }
}
