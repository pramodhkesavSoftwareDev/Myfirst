public class PatternLeft2 {
 
    public static void main(String[] args) {
        PatternLeft2 ob=new PatternLeft2();
ob.pattern2(); 
}
void pattern2() {
         for(int i=5;i>=1;i--) {
             for(int j=5;j>=i;j--) {
                 System.out.print(j+" ");
             }
             System.out.println();
         }
     }
}
/*
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 
*/
