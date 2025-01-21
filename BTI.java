import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class BTI {
    public static void main(String[] args) {
        System.out.print("Enter the Binary value:");
        Scanner u=new Scanner(System.in);
        String n=u.nextLine();
        List<Integer> l=new ArrayList<>();
        int a=n.length();
        for(int i=0;i<a;i++){
            l.add(Character.getNumericValue(n.charAt(i)));
        }
        
        int b=l.size();
        int d=0;
        int e=0;
        for (int c = 0; c < b; c++) {
           
               int m=(int) Math.pow(2,b-c-1);
               d=d+(l.get(c)*m);
           
        }
        System.out.println("The Decimal value is: " + d);
    }
}