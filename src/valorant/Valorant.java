/*
 * Assignment Name: Valorant Compatibility 
 * Mahan Choudhury, Sec: A, Roll: 2054901002
 */
package valorant;
import java.util.Scanner;
import static valorant.Exception_1.input;

//Exception#1
class StartException extends Exception {

    StartException(String s) {
        super(s);
    }
}

class Exception_1 {

    static void input(int x) throws StartException {
        switch (x) {
            case 1:
                System.out.println("GAME STARTED");
                break;
            case 0:
                throw new StartException("GAME CLOSED");
            default:
                System.out.println("Please Press Correct DIGIT.");
                break;
        }
    }
}
//Exception#2

class EligibilityException extends Exception {

    EligibilityException(String s) {
        super(s);
    }
}

class Exception_2 {

    static void input2(int y) throws EligibilityException {
        if (y < 10) {
            throw new EligibilityException("Not Eligible");
        } else if (y >= 10) {
            System.out.println("You're eligible to play competitive match. The number of unrated matches you have won is " + y);
        }
    }
}
//Exception#3

class TeamMateException extends Exception {

    TeamMateException(String s) {
        super(s);
    }
}

class Exception_3 {

    static void input3(int z) throws TeamMateException {
        if (z == 5) {
            System.out.println("Only your friends will be on your team");
        } else if (z< 5 && z>0) {
            System.out.println("Random team mate will take the vacancy");
        } else {
            throw new TeamMateException("Please enter correct number of teammate");
        }
    }
}
//Exception#4

class AgentException extends Exception {

    AgentException(String s) {
        super(s);
    }
}

class Exception_4 {

    static void input4(int a) throws AgentException {
        switch (a) {
            case 1:
                System.out.println("Raze selected");
                break;
            case 2:
                System.out.println("Reyna Selected");
                break;
            case 3:
                System.out.println("Omen Selected");
                break;
            default:
                throw new AgentException("Invalid Agent");
        }
    }
}

class NetStabException extends Exception {

    NetStabException(String s) {
        super(s);
    }
}

class Exception_5 {

    static void input5(int b) throws NetStabException {
        if (b <= 100) {
            System.out.println("Good ping, suitable condition for playing!");
        } else if (b > 100 && b < 200) {
            System.out.println("Not good, but can be played");
        } else {
            throw new NetStabException("Call your ISP and fix the network issue!");
        }
    }
}

public class Valorant {

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Welcome to Valorant");
        System.out.println("Do you want to start the game?");
        System.out.println("Press 1 to start the game");
        System.out.println("Press 0 to close the game");
        System.out.print("Press: ");
        int int1 = obj1.nextInt();

        try {
            input(int1);
        } catch (StartException ex) {
            System.out.println(
                    "Exception: You have terminated Valorant!");
            System.exit(0);
        }
        System.out.print("Are you eligible for playing competitive matches?\n");
        System.out.print("Enter the number of unrated matches you have won: ");
        int int2 = obj1.nextInt();
        Exception_2 obj2 = new Exception_2();
        try {
            obj2.input2(int2);
        } catch (EligibilityException ey) {
            System.out.println("Sorry, You're not eligible. Win more unranked matches to unlock Competitive.");
            System.exit(0);
        }

        System.out.println("Now, you need 5 members to team up your squad");
        System.out.println("Enter the number of team members: ");

        int int3 = obj1.nextInt();
        Exception_3 obj3 = new Exception_3();
        try {
            obj3.input3(int3);
        } catch (TeamMateException ez) {
            System.out.println("Exception: Invalid Number of team mates!");
            System.exit(0);
        }

        System.out.print("Select your Agent\n");
        int int4 = obj1.nextInt();

        Exception_4 obj4 = new Exception_4();
        try {
            obj4.input4(int4);
        } catch (AgentException em) {
            System.out.println("Invalid Agent Selection");
            System.exit(0);
        }

        System.out.print("Check your network ping\n");
        int int5 = obj1.nextInt();

        Exception_5 obj5 = new Exception_5();
        try {
            obj5.input5(int5);
        } catch (NetStabException en) {
            System.out.println("HIGH PING");
            System.out.println(en.getMessage());
            System.exit(0);
        }
        
        System.out.println("Good luck! Play now!");
    }
}
     