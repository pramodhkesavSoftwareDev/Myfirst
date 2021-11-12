class Pattern7{
public static void main(String[] args){
	Pattern7 p= new Pattern7();
	p.pyramid();
	p.pyramid();
}
	private void pyramid(){
int end=1;
for(int s=5;s>=1;s--){
for(int val=s-1;val>=end;val--){

System.out.print(" "+" ");
}
for(int i=1;i<=6-s;i++)
{
System.out.print("* ");
}
System.out.println();
}
}
}