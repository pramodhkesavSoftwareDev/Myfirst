import java.util.Scanner;
public class AllShift {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
AllShift shift=new AllShift();
Scanner sc =new Scanner(System.in);
System.out.println("Enter the numbers of options given below for shifiting the numbers in array");
System.out.println(" 1.Left shifting 2.Right shifting 3.Lefttwice 4.Righttwice");
 
int input=sc.nextInt();
switch (input) {
case 1:
shift.left();
break; 
case 2:
shift.Right();
break;
case 3:
shift.lefttwice();
break;
case 4:
shift.Righttwice();
break;
default:
System.out.println("Check the number you enterted please select the given options only");
}
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
    private void lefttwice() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len=sc.nextInt();
        int[] ar=new int[len];
        for(int i=0;i<ar.length;i++) {
            System.out.println("Enter the numbers to shift");
            ar[i]=sc.nextInt();
        }
        for (int count=1;count<=2;count++) {
          
        System.out.println("Your Array before left shifting twice");
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+ "|");
        System.out.println();
        int temp = ar[0]; //10
        for(int i =0; i<ar.length-1;i++)
        {
            ar[i] = ar[i+1];
        }
        ar[ar.length-1] = temp; //  8
         
            System.out.println("Your Array after left shifting twice");
            for(int i=0;i<ar.length;i++)
                System.out.print(ar[i]+ "|"); 
            System.out.println();
        }
         
    }
 
    private void Righttwice() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len=sc.nextInt();
        int[] ar=new int[len];
        for(int i=0;i<ar.length;i++) {
            System.out.println("Enter the numbers to shift");
            ar[i]=sc.nextInt();
        }
        for(int count=1;count<=2;count++)
        {
            System.out.println("Your Array before Right shifting twice");
            for(int i=0;i<ar.length;i++)
                System.out.print(ar[i]+ "|");
            System.out.println();
            int temp = ar[0]; //10
            for(int i =0; i<ar.length-1;i++)
            {
                ar[i] = ar[i+1];
            }
            ar[ar.length-1] = temp; //  8
             
                 
                 
        System.out.println("Your Array after Right shifting twice");
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+ "|"); 
        System.out.println();
        }
    }
 
}