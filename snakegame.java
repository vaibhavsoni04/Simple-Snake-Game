import java.util.Scanner;

public class snakegame
{
    static int width = 20;
    static int height = 20;
    static int x = 0;
    static int y = 0;
    static int foodX;
    static int foodY;
    static int tail = 5;
    static int[] xTail = new int[100];
    static int[] yTail = new int[100];
    static boolean gameover = false;
    static boolean food = false;
    static String direction = "d";

    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake Game.");
        Scanner input = new Scanner(System.in);
        createFood();
        
        while (!gameover)
        {
            printBoard();
            
            System.out.println("Enter direction (up[w], down[s], left[a], right[d]): ");
            direction = input.nextLine();
            move();
            
            System.out.print("\033[H\033[2J");
            
            if (x == foodX && y == foodY)
            {
                tail++;
                food = false;
            }
            
            if (!food)
            {
                createFood();
            }
        }
        
        System.out.println("Game over!");
        input.close();
    }

    public static void createFood()
    {
        foodX = (int) (Math.random() * width);
        foodY = (int) (Math.random() * height);
        food = true;
    }
    
    public static void move()
    {
        for (int i = tail; i > 0; i--)
        {
            xTail[i] = xTail[i - 1];
            yTail[i] = yTail[i - 1];
        }
        
        xTail[0] = x;
        yTail[0] = y;
        
        if (direction.equals("d"))
        {
            x++;
        }
        else if (direction.equals("a"))
        {
            x--;
        }
        else if (direction.equals("w"))
        {
            y--;
        }
        else if (direction.equals("s"))
        {
            y++;
        }
        
        if (x > width)
        {
            gameover = true;
        }
        else if (x < 0)
        {
            gameover = true;
        }
        else if (y > height)
        {
            gameover = true;
        }
        else if (y < 0)
        {
            gameover = true;
        }
        
        for (int i = 0; i < tail; i++)
        {
            if (x == xTail[i] && y == yTail[i])
            {
                gameover = true;
            }
        }
    }

    public static void printBoard()
    {
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (i == y && j == x)
                {
                    System.out.print("\033[0;31mO\033[0m");
                }
                else if (i == foodY && j == foodX)
                {
                    System.out.print("\033[0;32mF\033[0m");
                }
                else
                {
                    boolean printed = false;
                    
                    for (int k = 0; k < tail; k++)
                    {
                        if (i == yTail[k] && j == xTail[k])
                        {
                            System.out.print("\033[0;33mo\033[0m");
                            printed = true;
                            break;
                        }
                    }
                    
                    if (!printed)
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}    
