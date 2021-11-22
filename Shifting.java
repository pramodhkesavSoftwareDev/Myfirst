   import java.util.Scanner;
public class Shifting {
 
    public static void main(String[] args) {
         
 Shifting shift=new Shifting();
shift.Right();
}
 private void Right() {
         
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len=sc.nextInt();
        int[] ar=new int[len];
        for(int i=0;i<ar.length;i++) {
            System.out.println("Enter the numbers to shift");
            ar[i]=sc.nextInt();
        }
        System.out.println("Your Array before right shifting");
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+ "|");
        System.out.println();
        int temp = ar[ar.length-1]; //8
        for(int i =ar.length-1; i>=1;i--)
        {
            ar[i] = ar[i-1];
        }
            ar[0] = temp;   //  8
         
            System.out.println("Your Array after right shifting");
            for(int i=0;i<ar.length;i++)
                System.out.print(ar[i]+ "|"); 
            System.out.println();
         
    }
}