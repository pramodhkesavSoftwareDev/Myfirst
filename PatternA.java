public class PatternA {

	public static void main(String[] args) {
		PatternA alpha =new PatternA();
		
		alpha.alphabhetA();
		
			
	}
		
	private void alphabhetA() {
		for(int row =1; row<=9;row++)
		{
			if(row==5||row==1)
			{
			for(int star=1;star<=7;star++)
				{
			System.out.print("* ");
				}
			}
			
			else{
			
					System.out.print("*           *");
			}
		}
