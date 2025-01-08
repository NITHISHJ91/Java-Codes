import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class DTB {
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        
        System.out.print("Enter the Decimal value:");
        int n=u.nextInt();
        int d=0;
        while(d==0){
            if(n==1){
                l.add(1);
                break;
            }
            else if(n%2==0){
                n=n/2;
                l.add(0);
                
            }
            else{
                n=Math.floorDiv(n,2);
                l.add(1);
                
            }
        }
        Collections.reverse(l);
        System.out.print("The binary value is:");
        int z=l.size();
        for(int q=0;q<z;q++){
            System.out.print(l.get(q));
        }
    }
}