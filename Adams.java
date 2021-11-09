 public class Adams {
 
    public static void main(String[] args) {
         
int num =13;
int Sqnum=num*num;
System.out.println(Sqnum);
int rev=0;
while(num>0) {
    int rem=num%10;
    rev=(rev*10)+rem;
    num=num/10;
}
System.out.println(rev);
int Sqrev=rev*rev;
System.out.println(Sqrev);
int rev2=0;
while(Sqrev>0) {
    int rem=Sqrev%10;
    rev2=(rev2*10)+rem;
    Sqrev=Sqrev/10;
}
System.out.println(rev2);
if(Sqnum==rev2) {
    System.out.println("It is an Adams Number");
}
else {
    System.out.println("It is not an Adams Number");
}
    }
 
}