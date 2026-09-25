import java.util.Scanner;
public class test 
{
    public static void main(String[] args) 
    {

        boolean play;
        
        Scanner user;
        
            user = new Scanner(System.in);
            System.out.println("Would you like to play a game?(Y/N): ");
            String usr = user.next(); 
            play = usr.equalsIgnoreCase("Y");
            

            if (!play)
            {
                System.out.println("Goodbye");
            }
        
        while (play)
        {
            int player = 0;
            int house = 0;
        
            //gambling $$
            player = (int)(Math.random() * 11) + 1;
            int y = (int)(Math.random() *11) + 1;
            System.out.println(player + y + " HIT or STAND");
            String plyr = user.next();
            int z = player + y;

            if (z > 21)
                {
                 System.out.println("Player BUST... GAME OVER: " + z);
                }

            boolean pl = plyr.equalsIgnoreCase("HIT");

            while(pl)
            {
                int player2 = (int)(Math.random() * 11) + 1;
                int x = z + player2;
                System.out.println(z + " + " +  player2 + " = " + x + " HIT or STAND"); 
                plyr = user.next();
                z = x;

                pl = plyr.equalsIgnoreCase("HIT");
                if (z > 21)
                {
                 System.out.println("Player BUST... GAME OVER: " + z);
                }
                else if (!pl)
                {
                    break;
                }

            }

            if (z <= 21)
            {
                while (house < 17) 
                { 
                    int house2 = (int)(Math.random() * 11) + 1;
                    house += house2;
                    System.out.println("Player: " + z);
                    System.out.println("House: " + house);
                    user.nextLine();
                    
                    
                }

                if(house == 21)
                {
                    System.out.println("House WINS!!");
                    System.out.println("Player: " + z + " 🙁 ");
                    System.out.println("House: " + house + " XD ");
                    user.nextLine();
                    System.out.println("play again? (Y/N)");
                    plyr = user.next();
                    play = plyr.equalsIgnoreCase("Y");
                }

                else if (house <= 20)
                {
                    if (house < z)
                    {
                        System.out.println("Player WINS!!" + z);
                        user.nextLine();
                        System.out.println("play again? (Y/N)");
                        plyr = user.next();
                        play = plyr.equalsIgnoreCase("Y");
                    } 
                    
                    else
                    {
                        System.out.println("House WINS!!" + house);
                        user.nextLine();
                        System.out.println("play again? (Y/N)");
                        plyr = user.next();
                        play = plyr.equalsIgnoreCase("Y");
                    }
                }
                
                else if (house > 21)
                {
                    System.out.println("House bust " + house);
                    user.nextLine();
                    System.out.println("play again? (Y/N)");
                    plyr = user.next();
                    play = plyr.equalsIgnoreCase("Y");
                }
                
            }
            else if (z == 21)
            {
                System.out.println("Player WINS!! " + z);
                System.out.println("play again? (Y/N)");
                plyr = user.next();
                play = plyr.equalsIgnoreCase("Y");
            }
            
        }
        
        System.out.println("Thanks for playing ❤ :3");
        user.close();
    }
}