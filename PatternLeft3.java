public class PatternLeft3 {
 
    public static void main(String[] args) {
        PatternLeft3 ob=new PatternLeft3();
ob.pattern3(); 
}
void pattern3() {
         for(int i=5;i>=1;i--) {
             for(int j=i;j<=5;j++) {
                  
                 System.out.print(i+" ");
             }
             System.out.println();
         }
     }
}
/*Output:
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 */
