public class PatternLeft6 {
 
    public static void main(String[] args) {
        PatternLeft6 ob=new PatternLeft6();
ob.pattern6();
}
void pattern6() {
             for(int i=1;i<=5;i++) {
                 for(int j=1;j<=i;j++) {
                     System.out.print(j+" ");
                 }
                 for(int k=5;k>=i;k--)
                 {
                     System.out.print(" *");
                     
                }
                  
                 System.out.println();
             }
         
         }
}
/*Output:
1  * * * * *
1 2  * * * *
1 2 3  * * *
1 2 3 4  * *
1 2 3 4 5  *  
*/
