   import java.util.Scanner;
 public class ArrayScan {
 
    public static void main(String[] args) {
     
  ArrayScan obj=new ArrayScan();
  obj.getInput();
}
  private void getInput() {
         
        int total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int len=sc.nextInt();
        int[] marks=new int[len];
        for(int i=0;i<marks.length;i++) {
            System.out.println("Enter value");
            marks[i]=sc.nextInt();
        }
        System.out.println("Array values are");
        for(int j=0;j<marks.length;j++) {
             total =total+marks[j];
            System.out.println(marks[j]);
             
        }
        System.out.println("total is"+total);
        System.out.println("average is:"+total/marks.length);
    }
}