/* This code is based on the Python Project done last semester.
 * There is still a lot that the code can expand to, like adding the roll system
 * or perhaps having the enemy have a random chance to drop a better weapon. 
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Python 
{
	static ArrayList<String> inventory = new ArrayList<>();
	static String equippedWeapon = "Fists";
	static Scanner in = new Scanner(System.in);
	static int enemyHealth = 10;
	static int playerXP = 0;
	static int playerLevel = 1;
	
	public static void main(String[] args)
	{
		StartingMessage();
		in.close();
	}
	
	public static void StartingMessage()
	{
		System.out.print("Do You Wish To Enter?: ");
		String userInput = in.nextLine();
		
		if (userInput.equalsIgnoreCase("Yes"))
		{
			System.out.println("Entering...");
			CollectingInventory();
			SpawnEnemy();
			PlayerAction();
		}
		
		else if (userInput.equalsIgnoreCase("No"))
		{
			System.out.println("Exiting...");
		}
		
		else
		{
			System.out.println("Invalid Input");
			StartingMessage();
		}
	}
	
	public static void PlayerAction()
	{
		System.out.println("Available Commands: Inventory, Weapon, Attack, Experience");
		System.out.println("Type Stop To Stop Program.");
		String userInput = in.nextLine();
		while (!userInput.equalsIgnoreCase("Stop"))
		{
			if (userInput.equalsIgnoreCase("Inventory"))
			{
				Inventory();
			}
			
			else if (userInput.equalsIgnoreCase("Weapon"))
			{
				EquippedWeapon();
			}
			
			else if (userInput.equalsIgnoreCase("Attack"))
			{
				AttackingEnemy();
			}
			
			else if (userInput.equalsIgnoreCase("Experience"))
			{
				ShowExperience();
			}
			
			else
			{
				System.out.println("Invalid Input");
			}
			userInput = in.nextLine();
		}
	}
	
	public static void ShowExperience()
	{
		System.out.println("Current XP: " + playerXP);
		System.out.println("Current Level: " + playerLevel);
	}
	
	public static void AttackingEnemy()
	{
		System.out.println("Attacking The Enemy");
		enemyHealth = enemyHealth - WeaponStats();
		System.out.println("Enemy Has " + enemyHealth + " HP Left");
		
		if (enemyHealth <= 0)
		{
			System.out.println("You've Defeated The Enemy!");
			SpawnEnemy();
			GainXP();
		}
	}
	
	public static void GainXP()
	{
		playerXP += 5;
		System.out.println("You Gained 5XP!");
		PlayerLevel();
	}
	
	public static void PlayerLevel()
	{
		if (playerXP % 20 == 0)
		{
			playerLevel += 1;
			System.out.println("LEVEL UP!");
		}
	}
	public static void SpawnEnemy()
	{
		enemyHealth = 10;
	}
	
	public static void EquippedWeapon()
	{
		System.out.println("Weapon Stats");
		System.out.print(equippedWeapon);
		System.out.println(": Does " + WeaponStats() + " ATK");
		System.out.println(WeaponDescription());
	}
	
	public static int WeaponStats()
	{
		int weaponDamage = 0;
		
		if (equippedWeapon.equals("Fists"))
		{
			weaponDamage = 1;
		}
		
		if (equippedWeapon.equals("Copper Sword"))
		{
			weaponDamage = 5;
		}
		
		return weaponDamage;
	}
	
	public static String WeaponDescription()
	{
		String weaponDescription = "";
		
		if (equippedWeapon.equals("Fists"))
		{
			weaponDescription = "You Don't Got Much But Your Own Fists To Fight With";
		}
		
		if (equippedWeapon.equals("Copper Sword"))
		{
			weaponDescription = "A Sword Made From Copper, Gets The Job Done";
		}
		
		return weaponDescription;
	}
	
	public static void CollectingInventory()
	{
		inventory.add("Copper Sword");
	}
	
	public static void Inventory()
	{
		System.out.println("Opening Inventory");
		for (String item : inventory)
		{
			System.out.println(item);
		}
		System.out.println("Enter 'Exit' To Go Back To Main Commands");
		System.out.print("Enter Item Name To Retrieve Item: ");
		String userInput = in.nextLine();
		
		if (!userInput.equalsIgnoreCase("Stop"))
		{
			for (int i = 0; i < inventory.size(); i++)
			{
				if (userInput.equalsIgnoreCase(inventory.get(i)))
				{
					equippedWeapon = inventory.get(i);
					inventory.remove(i);
					break;
				}
			}
		}
	}
}