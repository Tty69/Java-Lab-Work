import java.util.Random;

public class Random2
{
	public static void main (String [] args)
	{
	
		Random rand = new Random();
		
		int randNums = rand.nextInt(100);
		/*
		if (randNums % 2 == 0)
		{
			System.out.println(randNums + " Is an even number");

		}
		else
		{
			System.out.println(randNums + " Is an odd number"); 
		
		}
		*/

		String  name;
		if (randNums == 0){name = (" frozen");}
		else if (randNums < 15) {name =  (" cold");}
		else if (randNums < 26) {name =  (" cool");}
	      	else if (randNums < 41) {name =  (" warm");}
		else if (randNums < 61) {name =  (" hot");}
		else if (randNums < 81) { name =  (" very hot");}
		else if (randNums < 100) { name =  (" extremely hot");}  	
		else if (randNums == 100){ name = (" boiling");}
	      	else {
		name = ( "");
			
		}	
		
		System.out.println( randNums +  name);

	}

}
