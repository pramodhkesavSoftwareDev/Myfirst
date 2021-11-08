public class git{
public static void main(String[] args){
int purse1=123456;
//int noOfdigits=0;
	int total=0;
while(purse1>0){
	total=total+(purse1%10);
System.out.println(purse1%10);
purse1 = purse1/10;
}
	System.out.println(" sum of digits are " +total);
//System.out.println(" no of digits are " +noOfdigits);
}
}