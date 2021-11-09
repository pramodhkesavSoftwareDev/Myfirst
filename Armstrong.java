public class Armstrong {
 
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
int num=370;
int armNo=0;
int rem;
int num2=num;
while(num>0) {
    rem =num%10;
    armNo=armNo+(rem*rem*rem);
    num=num/10;
     
}
if(num2==armNo) {
    System.out.println("It is an Armstrong number");
}
else {
    System.out.println("It is not an Armstromg number");
}
    }
 
}
