import java.util.Scanner;
 
public class Linear {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
Linear ln =new Linear();
ln.LinearSearch();
    }
 
    private void LinearSearch() {
        int[] marks= {90,81,80,100,99};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to search");
        int no=sc.nextInt();
    //linear search
        boolean got=false;
        for(int j=0;j<marks.length;j++) {
            if(no==marks[j]) {
                System.out.println("present at "+j);
                got=true;
                break;
            }
        }
        if(got==false) {
            System.out.println("Not present");
        }
    }
     
 
}