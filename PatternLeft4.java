public class PatternLeft4 {
 
    public static void main(String[] args) {
        PatternLeft4 ob=new PatternLeft4();
ob.pattern4(); 
}
void pattern4() {
         for(int i=1;i<=5;i++) {
             for(int j=1;j<=i;j++) {
                  
                 System.out.print(j+" ");
             }
             System.out.println();
         }
     }
}
/*Output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 */
