import java.util.*;
public class Table {
    public static void main(String[] args) {
        System.out.print("enter the nubmer which you want the print table:- ");
        Scanner sc = new  Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=10; i++){
            System.out.println(sum=n*i);
        }
    }
    
}
