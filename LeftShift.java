import java.util.Scanner;
class LeftShift{
public static void main (String[] args)
{
LeftShift ls=new LeftShift();
ls.left();
}
private void left() {
         
        // Shifting all array elements towards left side once
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len=sc.nextInt();
        int[] ar=new int[len];
        for(int i=0;i<ar.length;i++) {
            System.out.println("Enter the numbers to shift");
            ar[i]=sc.nextInt();
        }
        System.out.println("Your Array before  left shifting");
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+ "|");
        System.out.println();
        int temp = ar[0]; //10
        for(int i =0; i<ar.length-1;i++)
        {
            ar[i] = ar[i+1];
        }
        ar[ar.length-1] = temp; //  8
         
            System.out.println("Your Array after left shifting");
            for(int i=0;i<ar.length;i++)
                System.out.print(ar[i]+ "|"); 
            System.out.println();
    }
	
	}