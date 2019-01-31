/*File name as "Main.java"*/
import java.util.*;

class Main
{
    public static void main(String[] arg) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Player p = new Player();
        String pname,pcountry,pskill;
        int option;
        System.out.println("Enter the player name");
        pname = sc.nextLine();
        System.out.println("Enter the country name");
        pcountry = sc.nextLine();
        System.out.println("Enter the skill");
        pskill = sc.nextLine();
        System.out.println("Player Details");
        p.setName(pname);
        System.out.println("Player Name :" +p.getName());
        p.setCountry(pcountry);
        System.out.println("Country Name :" +p.getCountry());
        p.setSkill(pskill);
        System.out.println("Skill :" +p.getSkill());
        System.out.println("Verify and Update Player Details");
        do
        {
            System.out.println("Menu");
            System.out.println("1.Update Player Name"); 
            System.out.println("2.Update Country Name");
            System.out.println("3.Update Skill");
            System.out.println("4.All informations Correct/Exit");
            System.out.println("Type 1 or 2 or 3 or 4");
            option = sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("The current player name is " +p.getName());
                    System.out.println("Enter the player name");
                    p.setName(sc.nextLine());
                    break;
                    
                case 2:
                    System.out.println("The current country name is " +p.getCountry());
                    System.out.println("Enter the country name");
                    pcountry = sc.nextLine();
                    p.setCountry(pcountry);
                    break;
                    
                case 3:
                    System.out.println("The current player skill is " +p.getSkill());
                    System.out.println("Enter the skill");
                    pskill = sc.nextLine();
                    p.setSkill(pskill);
                    break;
                    
                case 4:
                    System.out.println("Player Details");
                    System.out.println("Player Name :" +p.getName());
                    System.out.println("Country Name :" +p.getCountry());
                    System.out.println("Skill :" +p.getSkill());
            }
            sc.nextLine();
        }
        while((option==1)||(option==2)||(option==3)||(option==4));
    }
}
