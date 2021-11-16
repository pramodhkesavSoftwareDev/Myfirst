class PatternE {
    public static void main(String[] args) {
        for(int i=1;i<=7; i++)
    {
      System.out.print("* ");
    }
    System.out.println();
    for(int line=1; line<=7;line++)
    {
     
    System.out.print("* ");
    if(line==4)
    {
        for(int j=1;j<=6;j++){
      System.out.print("* ");
        }
    }
    System.out.println();
    }
    for(int i=1;i<=7; i++)
    {
      System.out.print("* ");
    }
    }
}
