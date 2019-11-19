import java.util.*;

public class PokemonBattle {
	static Scanner userInput = new Scanner (System.in);
	public static void main(String [] args) {
		String username = battleStart();
		int hp = Damage(username);
		StatsTable(username, hp);
	}
	public static String battleStart() {
		System.out.println ("Another trainer is issuing a challenge!/Zebstrika appeared./Which Pokemon do you choose?");
			String username = userInput.nextLine();
			System.out.println("You choose " + username + "!");
			System.out.println("It's a Pokemon battle betweem Alakazam and Zabstrika! Go!");
			System.out.println();
			return username;
	}
	
	public static int Damage(String username) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer what are your " + username + "'s stats");
		System.out.print("Level: ");
		int Level = userInput.nextInt();
		System.out.print("Attack: ");
		int Attack = userInput.nextInt();
		System.out.print("Defense: ");
		int Defense = userInput.nextInt(); 
		System.out.print("Base: ");
		int Base = userInput.nextInt();
		System.out.print("Stab: ");
		int Stab = userInput.nextInt();
		System.out.print("HP ");
		int HP = userInput.nextInt();
		System.out.println();
		double Modifier = (0.85 + (Math.random() * 0.15)) * Stab;
		int Damage = (int)((((2 * Level + 10) / (250)) + ((Attack/Defense) * Base + 2) * Modifier);
		int hp = HP - 10;
		System.out.println("HP, after damage, is now" + hp);
		System.out.println();
		return hp;
		
	}
	public static void StatsTable(String username, int hp) {
		System.out.println ("Name   " + username);
		System.out.println ("Level   40");
		System.out.println ("------------------------------");
		System.out.println ("HP   " + hp);
		System.out.println ("Attack   51");
		System.out.println ("Defense  51");
		System.out.println ("Sp. Atk 121");
		System.out.println ("Sp. Def  81");
		System.out.println ("Speed   107");
		System.out.println ("------------------------------");
		
	}
}
