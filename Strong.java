public class Strong {
 
    public static void main(String[] args) {
         
int n=145,sum=0,r;
int k=n;
while(k!=0) {
    r=k%10;
    int f=fact(r);
    k=k/10;
    sum=sum+f;
}
if(sum==n)
{
    System.out.println(sum+" is strong number ");
}
else {
    System.out.println(sum+" is not a strong number");
}
    }
     static int fact(int r) {
        int mul=1;
        for(int i=1;i<=r;i++)
        {
            mul=mul*i;
        }
        return mul;
    }
    }
