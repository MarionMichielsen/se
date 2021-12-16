package se.marion;
import java.util.Random;

public class RobotName {

    public void generateRobotName(){
        Random random = new Random();
        char letter1 = (char) (random.nextInt(26) + 'A');
        char letter2 = (char) (random.nextInt(26) + 'A');
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int num3 = random.nextInt(10);
        String robotname = Character.toString(letter1).concat(Character.toString(letter2)).
        concat(Integer.toString(num1)).concat(Integer.toString(num2)).concat(Integer.toString(num3));
        System.out.println(robotname);

    }
   

    
}
