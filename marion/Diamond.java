package se.marion;


public class Diamond {
    public void Generate(){
        while(true){
        System.out.println("Enter a character to print a diamond");
        String input = System.console().readLine();
        char letter = Character.toLowerCase(input.charAt(0));
        if (letter == '"')
            break;
        printDiamond(createNumber(letter), letter);
      }
    }
    
    public void printDiamond(int number, char letter){
        int index = 1;

        for (int i= 0; i<number+1; i++){
            if (index == 1){
                for (int j = 0; j< number*2+1; j++){
                    if (j== number)
                        System.out.print('A');
                    else 
                        System.out.print("*");
                }
                index++;
                System.out.println("");
            }
           else {

            for (int j = 0; j< (number-i); j++){
                System.out.print("*");
            }
            System.out.print(whatLetter(index));
            for (int j = 0; j<(i*2-1); j++){
                System.out.print("*");
            }
            System.out.print(whatLetter(index));
            for (int j = 0; j< (number-i); j++){
                System.out.print("*");
            }
            index++;
            System.out.println("");
        }
    }
        index = number;
        for (int i= number-1; i>=0; i--){

            if (index == 1){
                for (int j = 0; j< number*2+1; j++){
                    if (j== number)
                        System.out.print('A');
                    else 
                        System.out.print("*");
                }
                index--;
                System.out.println("");
            }

           else {
            for (int j = 0; j< (number-i); j++){
                System.out.print("*");
            }
            System.out.print(whatLetter(index));
            for (int j = 0; j<(i*2-1); j++){
                System.out.print("*");
            }
            System.out.print(whatLetter(index));
            for (int j = 0; j< (number-i); j++){
                System.out.print("*");
            }
            index--;
            System.out.println("");
        }
     }   
    }
            
    public char whatLetter(int number){
        char letter = 'A';
        return letter +=number-1;    
    }
    
    public int createNumber(char letter) {
        char a = 'a';
        return letter -a;
    }
 
}

