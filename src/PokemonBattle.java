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
		Scanner userInput = new Scanner(System.in);
		battleStart();
		damage();

	}

	public static void battleStart(String userInput) {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println();
		System.out.println("Zebstrika appeared.");
		System.out.println();
		System.out.println("Which Pokemon do you choose?");
		System.out.println();
		String username = userInput.next();
		System.out.println("You chose " + username + " !");
		System.out.println();
		System.out.println("It’s a Pokemon battle between " + username + " and Zebstrika!  Go!");
		return username;
	}

	public static double damage() {
		double level = ; /* */
		double stepOne = 2* level + 10;
		double stepTwo = stepOne/250;
		double attack = ;    /* */
		double diffense= ;    /* */
		double stepThree = stepTwo + (attack/diffense);
		double base = ;      /* */
		double stepFour = stepThree * base + 2 ; 
		double random = 0.85 + (Math.random() * 0.15) ;
		double STAB = ;    /* */
		double modifier = random * STAB;
		int demage = (int) (stepFour * modifier);	
	System.out.println("Zebstrika used Thunderbolt!");
	System.out.println();
	System.out.println("Trainer, what are your " + username + " stats?");
	System.out.println("Level:" + level);
	System.out.println("Attack:"+ attack);
	System.out.println("Defense:" + diffense );
	System.out.println("");
	System.out.println("");
	return demage;	
	}

}
