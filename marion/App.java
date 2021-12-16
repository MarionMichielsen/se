package se.marion;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    
    public static void main(String[] args) {
        // BookValidator bv = new BookValidator();
        // bv.Run();

        // ScrabbleScore ss = new ScrabbleScore();
        // ss.Run();

        // Diamond d = new Diamond();
        // d.Generate();

        // ChatBot c = new ChatBot();
        // while(true){
        //     System.out.println("Mata in nåt att säga till chatboten");
        //     String input = System.console().readLine();
        //     System.out.println(c.generateResponse(input));
        //     System.out.println("Wanna continue?");
        //     String answer = System.console().readLine();
        //     if (answer.equals("NO")||answer.equals("N"))
        //         break;

        RobotName r = new RobotName();
        r.generateRobotName();
        }
    }

    

