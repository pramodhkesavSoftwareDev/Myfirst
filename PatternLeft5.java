public class PatternLeft5 {
 
    public static void main(String[] args) {
        PatternLeft5 ob=new PatternLeft5();
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
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 */ 

