
public class ArrayTest {

	public static void main(String[] args) {
		
		int indscore[] = {100,200,65,50};
		
		int ausscore[] = new int[11];
		
		ausscore[0] = 100;
		ausscore[1] = 200;
		ausscore[2] = 65;
		ausscore[3] = 50;
		
		int indscoreTotal=0;
		int ausscoreTotal=0;
		
		for(int i=0;i<indscore.length;i++)
		{
			System.out.println("score is " +indscore[i]);
			
		}
		
		System.out.println("................................");
		
		for(int i=0;i<ausscore.length;i++)
		{
			System.out.println("score is " +ausscore[i]);
		}

	}

}
