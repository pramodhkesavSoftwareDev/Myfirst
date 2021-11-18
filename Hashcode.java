public class Hashcode {
 
    public static void main(String[] args) {
Hashcode a1=new Hashcode();
Hashcode a2=new Hashcode();
 
 
System.out.println(a1.hashCode());
System.out.println(a2.hashCode());
System.out.println(a1.toString());
System.out.println(a2.toString());
 
}
    public int hashCode() {
        return 123;
    }
    public String toString() {
        return "Hello";
    }
 
}
}
