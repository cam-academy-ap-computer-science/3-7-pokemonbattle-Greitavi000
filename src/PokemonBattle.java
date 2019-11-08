import java.util.*;

/* Main() battleStart(); then damage();  statsTable();. 
 * battleStart();I must have information that another Pokemon is coming, the question is in the name of our 
 *         Pokemon, what kind of Pokemon we have chosen, and the beginning of the game.
 * damage(); should include another Pokemon attack, Also the question is what with our Pokemon, level, 
 *         attack, defense, base \ base, STAB, HP, the decision how many of our Pokemon lost points, and how 
 *         much HP he has left.
 *statsTable(); It should have the name of the Pokemon, its level, then the dashed line,
 *         followed by HP, attack, defense, Sp. attacks, Sp.protection, speed, then the dashed line again, and
 *         the learned movements behind it.
 *  
 *  */

public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String name; 
		name = battleStart();
		damage(name);
		statsTable(name);
	}
	
	
	public static String battleStart() {
	  	System.out.println("Ano  ther trainer is issuing a challenge!");
		System.out.println();
		System.out.println("Zebstrika appeared.");
		System.out.println();
		System.out.print("Which Pokemon do you choose?");
		Scanner userInput = new Scanner(System.in);
	  	String name = userInput.nextLine();
	  	System.out.println();
	  	System.out.println("You chose "+ name +" !"); /**/
		System.out.println();
		System.out.println("It's a Pokemon battle "+ name +" between and Zebstrika!  Go!"); /**/
		System.out.println();
		System.out.println();
		return name;
		
	}

	   public static void damage(String name) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println();
		System.out.println("Trainer, what are your "+ name +"'s stats?"); /**/
		System.out.println();
		System.out.print("Level:  ");
	  	int level = userInput.nextInt(); 
		System.out.println(level);
		System.out.println();
		int attack = 52 ;    /* */
		System.out.println("Attack:  "+ attack);
		System.out.println();
		int diffense= 51;    /* */
		System.out.println("Defense:  " + diffense );
		System.out.println();
		int base = 1 ;      /* */
		System.out.println("Base:  " + base);
		System.out.println();
		int STAB = 1 ;    /* */
		System.out.println("STAB:  "+STAB);
		System.out.println();
		int HP = 96;  /* */
		System.out.println("HP:  " + HP );
		System.out.println();
		double stepOne = 2 * level + 10;
		double stepTwo = stepOne/250;
		double stepThree = stepTwo + (attack/diffense);
		double stepFour = stepThree * base + 2 ; 
		double random = 0.85 + (Math.random() * 0.15) ;
		double modifier = random * STAB;
		int demage = (int) (stepFour * modifier);
		System.out.println(name + "sustained "+ demage +" points damage.");  /**/
		System.out.println();
		System.out.println("HP, after damage, are now "+ HP +".");
		System.out.println();
		System.out.println();
	
	}
	   
      public static void statsTable(String name) {
   
    	  System.out.println("Name     "+  name);   /**/
    	  System.out.println();
    	  System.out.println("Level    40");
    	  System.out.println();
    	  System.out.println("------------------------------");
    	  System.out.println();
    	  System.out.println("HP    	96");
    	  System.out.println();
    	  System.out.println("ATTACK	52");
    	  System.out.println();
    	  System.out.println("DEFENSE   51");
    	  System.out.println();
    	  System.out.println("SP. ATK   121");
    	  System.out.println();
    	  System.out.println("SP. DEF   81");
    	  System.out.println();
    	  System.out.println("SPEED 	107");
    	  System.out.println();
    	  System.out.println("-------------------------------");
    	  System.out.println();
    	  System.out.println("");
    	  
      }
	   

}
