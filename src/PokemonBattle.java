import java.util.*;

/* Main() battleStart(); then damage();  statsTable();. 
 * battleStart();I must have information that another Pokemon is coming, the question is in the name of our 
 *         Pokemon, what kind of Pokemon we have chosen, and the beginning of the game.
 * damage(); should include another Pokemon attack, Also the question is what with our Pokemon, level, 
 *         attack, defense, base \ base, STAB, HP, the decision how many of our Pokemon lost points, and how 
 *         much HP he has left.
 *statsTable(); It should have the name of the Pokemon, its level, then the dashed line,
 *         followed by HP, attack, defense, Sp. attacks, Sp. protection, speed, then the dashed line again, and
 *         the learned movements behind it.
 *  
 *  */

public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String name; 
		name = battleStart();
		int HP;
		HP = damage(name);
		statsTable(name, HP);
	}
	
	
	public static String battleStart() {
	  	System.out.println("Ano  ther trainer is issuing a challenge!");
		System.out.println();
		System.out.println("Zebstrika appeared.");
		System.out.println();
		System.out.print("Which Pokemon do you choose?");
		Scanner userInput = new Scanner(System.in);
	  	String name = userInput.nextLine();              /*typing input*/
	  	System.out.println();
	  	System.out.println("You chose "+ name +" !");
		System.out.println();
		System.out.println("It's a Pokemon battle "+ name +" between and Zebstrika!  Go!"); /**/
		System.out.println();
		System.out.println();
		return name;
		
	}

	   public static int damage(String name) {
		Scanner userInput = new Scanner(System.in);		
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println();
		System.out.println("Trainer, what are your "+ name +"'s stats?"); /**/
		System.out.println();
		System.out.print("Level:  ");
	  	int level = 40;                      /* use number from instructions */
		System.out.println(level);
		System.out.println();
		int attack = 52 ;                    /* use number from instructions */
		System.out.println("Attack:  "+ attack);
		System.out.println();
		int diffense = 51;                    /* use number from instructions */
		System.out.println("Defense:  " + diffense );
		System.out.println();
		System.out.print("Base:  "); 
	    int base = userInput.nextInt();         /*typing input*/
		System.out.println();
		System.out.print("STAB:  ");
		int STAB = userInput.nextInt() ;       /*typing input*/
		System.out.println();
		double stepOne = 2 * level + 10;
		double stepTwo = stepOne/250;
		double stepThree = stepTwo + (attack/diffense);
		double stepFour = stepThree * base + 2 ; 
		double random = 0.85 + (Math.random() * 0.15) ;
		double modifier = random * STAB;
		int demage = (int) (stepFour * modifier);
		int HP = base- demage;                     /* HP value */
		System.out.println("HP:  " + HP );
		System.out.println();
		System.out.println(name + " sustained "+ demage +" points damage.");  
		System.out.println();
		System.out.println("HP, after damage, are now "+ HP +".");       
		System.out.println();
		System.out.println();
		return HP;
	   }
	   
      public static void statsTable(String name, int HP) {
   
    	  System.out.println("Name     "+  name);   /*typing input*/
    	  System.out.println();
    	  System.out.println("Level    40");           /* use number from instructions */
    	  System.out.println();
    	  System.out.println("------------------------------");
    	  System.out.println();
    	  System.out.println("HP    	" + HP);           /*typing input*/
    	  System.out.println();
    	  System.out.println("ATTACK	52");           /* use number from instructions */
    	  System.out.println();
    	  System.out.println("DEFENSE   51");          /* use number from instructions */
    	  System.out.println();
    	  System.out.println("SP. ATK   121");         /* use number from instructions */
    	  System.out.println();
    	  System.out.println("SP. DEF   81");           /* use number from instructions */
    	  System.out.println();
    	  System.out.println("SPEED 	107");           /* use number from instructions */
    	  System.out.println();
    	  System.out.println("-------------------------------");
    	  System.out.println();
    	  System.out.println("");
    	  
      }
	   
}


