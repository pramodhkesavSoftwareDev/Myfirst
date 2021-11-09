public class Neon {
 
    public static void main(String[] args) {
         
int num=9;
int sum=0;
int sqrnum=num*num;
System.out.println(sqrnum);
while(sqrnum>0) {
    int rem=sqrnum%10;
    sum=sum+rem;
    sqrnum=sqrnum/10;
}
System.out.println("sum value now "+sum);
if(sum==num) {
    System.out.println("It is an Neon Number");
}
else {
    System.out.println("It is not an Neon Number");
}
    }
 
}