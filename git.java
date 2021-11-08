public class git{
public static void main(String[] args){
        int purse1=123456;
 
            int total=0;
        for(int i=0;i<6;i++){
            total=total+(purse1%10);
        System.out.println(purse1%10);
        purse1 = purse1/10;
        }
            System.out.println(" sum of digits are " +total);
 
        }
        }
