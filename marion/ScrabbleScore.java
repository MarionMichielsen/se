package se.marion;

public class ScrabbleScore {

    public void Run(){
        int totalpoints = 0;

        while (true){
        int extravalue = 1;
        int whichLetter = -1;
        int multiply = 1;

        System.out.println("Please enter your word to play SCRABBLE. Enter X to exit");
        String word = System.console().readLine().toLowerCase();
        if (word.equals("x"))
            break;
        System.out.println("Is there a double or tripple letter? Enter yes or no");
        String answer1 = System.console().readLine().toLowerCase();
        if (answer1.equals("yes")){
            System.out.println("Double or Tripple? Enter D or T");
            String dOrT = System.console().readLine().toLowerCase();
            if (dOrT.equals("d"))
                extravalue = 2;
            if (dOrT.equals("t"))
                extravalue = 3;
            System.out.println("What is the index of the letter with the extra value?");
            whichLetter = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Do you have double or triple word value?");
        String answer2 = System.console().readLine().toLowerCase();
        if (answer2.equals("yes")){
            System.out.println("Double or Tripple? Enter D or T");
            String dOrT2 = System.console().readLine().toLowerCase();
            if (dOrT2.equals("d"))
                multiply = 2;
            if (dOrT2.equals("t"))
                multiply = 3;
        }    totalpoints+=(calculatePoints(word, multiply, extravalue, whichLetter));
    }       
    
    System.out.println("Thank you for playing. Your total score is: "+totalpoints);
    }
        public int calculatePoints(String word, int multiply, int extravalue, int whichLetter){
            int value = 0;
            int count = 0;
            int points = 0;
            int score = 0;
        
        for (char c : word.toCharArray()){
           if (c == 'a' || c== 'e' || c== 'i' || c=='u' || c=='o' || c=='l' || c=='n' || c=='r' || c=='s' || c== 't')
               value = 1;
               if (c == 'd' || c== 'g')
               value = 2;
               if (c == 'b' || c== 'c' || c== 'm' || c=='p' )
               value = 3;
               if (c == 'f' || c== 'h' || c== 'v' || c=='w'|| c=='y' )
               value = 4;
               if (c == 'k' )
               value = 5;
               if (c == 'j' || c== 'x')
               value = 8;
               if (c == 'q' || c== 'z')
               value = 10;
               if (count == whichLetter)
               value = value*extravalue;
               points+=value;
               count++;
            }
        score = multiply*points;
        System.out.println("Your wordscore is: "+score);
        return score;
        }
    }

    

