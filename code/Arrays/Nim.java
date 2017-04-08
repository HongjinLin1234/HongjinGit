package Arrays;

import support.ArgsProcessor;

public class Nim {
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int Total=ap.nextInt("What's the total number of sticks?");
		int Left=Total;
		int i=0;
		int Computertook=(int)Math.round(Math.random()+1);
		if (Total<=0){System.out.println("Wrong information given,Game over");}
		else{
		int Firstornot=ap.nextInt("Are you want to be the first to play?(1:Yes)(2:No)");
		
		if(Firstornot==1){
			System.out.println("Human Starts");
			while(Left>0)
			{
			   int Humantook=ap.nextInt("How much will you took?");
			   if((Humantook!=1)&&(Humantook!=2)){System.out.println("Wrong information given");
			 
			   }
			   else if(Left-Humantook<0){System.out.println("Wrong information given");
			 
			   }
			   else{
				   int Start=Left;
				   if(Start==0){break;}
				   Left=Left-Humantook;
				   System.out.println("Round "+i+","+Start+" sticks at start, human took "+Humantook+", so "+Left+" sticks Left" );
				   Start=Left;
				   i=i+1;
				   if(Start==0){break;}
				   Left=Left-Computertook;
				   if(Left<0){Computertook=Start;Left=0;}
				   System.out.println("Round "+i+","+Start+" sticks at start, computer took "+Computertook+", so "+Left+" sticks Left" );
				   i=i+1;
			   }
			}
			if(i%2==0)
			{
				System.out.println("Computer Win");
			}
			else{
				System.out.println("Human Win");
			}
			
		}
		if(Firstornot==2){
			System.out.println("Computer Starts");
			while(Left>0)
			{
				int Humantook=ap.nextInt("How much will you took?");
				   if ((Humantook!=1)&&(Humantook!=2)){
				   
				   System.out.println("Wrong information given");
				    }
				   else if(Left-Humantook<0){System.out.println("Wrong information given");
					 
				   }
				   else{
				int Start=Left;
				if(Start==0){break;}
				   Left=Left-Computertook;
				   if(Left<0){Computertook=Start;Left=0;}
				   System.out.println("Round "+i+","+Start+" sticks at start, computer took "+Computertook+", so "+Left+" sticks Left" );
				   Start=Left;
				   i=i+1;
				   if(Start==0){break;}
				   Left=Left-Humantook;
				   System.out.println("Round "+i+","+Start+" sticks at start, human took "+Humantook+", so "+Left+" sticks Left" );
				   i=i+1;
				   }
			}
			if(i%2==0)
			{
				System.out.println("Human Win");
			}
			else{
				System.out.println("Computer Win");
			}
		}
		else
		{System.out.println("Game Over");
	}
}
}
}	

