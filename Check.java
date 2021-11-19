import java.util.Scanner;
public class Check {
 
    public static void main(String[] args) {
     
Check ck =new Check();
ck.Findmax();
    }
 
    private void Findmax() {
        int[] marks= {90,81,80,100,99};
     
        int max=0;
        int min=marks[0];
        int i=0;
        int div=0;
        while(i<marks.length) {
            if(marks[i]>max) {
                max=marks[i];
            }
            if(marks[i]<min) {
                min=marks[i];
            }
            if(marks[i]%10==0) {
            System.out.println("10 divisibles "+marks[i]);
            }
            i++;
        }
        System.out.println("Maximum value is "+max);
        System.out.println("Minimum value is"+min);
    }
	}