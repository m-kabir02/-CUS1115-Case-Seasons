import java.util.Scanner;
public class CaseSeasons {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int season;
        System.out.print("Enter the season as an integer: ");
        season = kb.nextInt();

        switch(season) {
            case 1: {
                System.out.println("Winter");
                break;
            }
            case 2: {
                System.out.println("Spring");
                break;
            }
            case 3: {
                System.out.println("Summer");
                break;
            }
        case 4:
        {
        System.out.println("Fall");
        break;
    }
            }
    }}


    /*
Enter the season as an integer: 1
Winter
Enter the season as an integer: 2
Spring
Enter the season as an integer: 3
Summer
Enter the season as an integer: 4
Fall
     */

    /*
		switch(month)
    {
        case 12: case 1: case 2:
    {
        System.out.println("Winter");
        break;
    }
        case 3: case 4: case 5:
    {
        System.out.println("Spring");
        break;
    }
        case 6: case 7: case 8:
    {
        System.out.println("Summer");
        break;
    }
        case 9: case 10: case 11:
    {
        System.out.println("Fall");
        break;
    }
        default:
        {
            System.out.println("INVALID CHOICE! The month must be an integer 1 through 12.");
        }
    }
}
}
*/