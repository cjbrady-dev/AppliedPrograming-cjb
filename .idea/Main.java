
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        
        System.out.print("Welcome to Sprint1 of Applied Programming in Java\n");
    
        System.out.println("I have created a small D&D game as suggested by the Module Description document.\n");

      
        final int trollDamagedelt = (int)(Math.random() * 16), swordDamageOut = 7, spellDamageOut = 9; // damage 
        int myAromor = 8; // defence buff
        
        int lifePoints = 25, trollLife = 35; // life bar/points
        String chrName;

        
        String race;
        System.out.println("Menu");
        System.out.println("1# Elf");
        System.out.println("2# Man");
        System.out.println("3# Dwarf");
        //Scanner myObj = new Scanner(System.in);
        System.out.println("Select your Race.\n");
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your selection by entering the item number.\n");
        
        int userChoice = myObj.nextInt(); //Read in choice
        System.out.println("Your choice is: " + userChoice + 
        "\n");

        
        
        switch (userChoice) {
            case 1:
            race = "Elf";
            System.out.println("Congratulations you are an Elf of Shadow wood veil.\n");
            break;

            case 2:
            race = "Man";
            System.out.println("Congratulations you are a man from the kingdom of Dorinan.\n");
            break;
            case 3:
            race = "Dwarf";
            System.out.println("Congratulations you are an Dwarf Hailing from the vast caverns of Calimon crags.\n");
            break;  
            
            default:
            System.out.println("Oops please try again.\n");
            break;
        }

        

        System.out.print("Sound of the wind blowing throw the rushes begins to stir your senses. \nYou blink your eyes several times and focus on the lake surface\n reflecting the image of the glowing moon in it's surface.\n You remeber that you had fallen asleep after a long days hike through\n the mountains to get to your destination.\n Slowly you sit up. Hearing a crashing sound in the woods\n you get you feet drawing your sword knowing you are well prepared\n to fight any foe that may be in the woods with you.\n You Have your Families sword and you know a few spells to ward of any foe.\n A troll clears the trees crashing through the woods into the lake only to stop in shock of the cold water.\n Unfortunately rather than hiding you stayed in the wide open and the\n troll instantly spots you.\n");

        System.out.print("You are attacked by a troll choose your weapon.\n");
        System.out.print("#1 Sword\n");
        System.out.print("#2 Spell\n");
        System.out.println("The troll life is currently " + trollLife + " points\n");

        int damageDelt; 
        while(trollLife > 0) {
            int attack = myObj.nextInt(); //Read in choice

            System.out.println(trollLife+"\n");

            System.out.print("You have wounded the troll choose your weapon.\n");
            System.out.print("#1 Sword\n");
            System.out.print("#2 Spell\n");

            
            switch (attack) {
                case 1:
                damageDelt = swordDamageOut;
                System.out.print("You have chosen to use your sword.\n");
                break;

                case 2:
                damageDelt = spellDamageOut;
                System.out.println("You have chosen to use a spell.\n");
                break;

                default:
                System.out.println("Oops try again.\n");
                damageDelt = 0;
                break;

                
                /* System.out.println("The troll attacks you, your life points are currently" + lifePoints);
                while(lifePoints > 0) {
                    
                    System.out.println("The troll kicked you, your life points are currently" + lifePoints);
                    
                    lifePoints -= trollDamagedelt; */

            }
            trollLife -= damageDelt;
        
        
        
            System.out.println(trollLife);
            
            if (trollLife < 0){
                System.out.println("you have vanquished the enemy, Hazzah!\n");
            } else {
                System.out.println("Alas you have yet to slay the beast. Sally Forth!\n");
            }
    }
    
    myObj.close();
    }
    
    }
//}