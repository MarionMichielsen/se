package se.marion;

public class BookValidator {

    public void Run(){
        System.out.println("Please enter a ISBN10 number");
        String input = System.console().readLine();
        System.out.println("Is a valid format: "+isValidFormat(input));
        System.out.println("Is a valid number: "+calculateCheckTest(input));
    }

    public boolean isValidFormat(String input){
        if (input.length() != 13)
        return false;

        String[] parts =input.split("-");
        if (parts.length!= 4)
            return false;
        if (parts[0].length()<1 || parts[0].length()>5)
            return false;
        if (parts[1].length()<1 || parts[1].length()>7)
            return false;
        if (parts[2].length()<1 || parts[2].length()>6)
            return false;
        if (parts[3].length()!=1)
            return false;
        if (parts[3].equalsIgnoreCase("x"))
            parts[3] = "10";
        for (String part : parts) {
            for (char ch: part.toCharArray()) {
                if (!Character.isDigit(ch))
                    return false;
            }   
        }    
        return true;
    }

    public boolean calculateCheckTest(String input){
        int multiply = 10;
        int number = 0;
        int sum = 0;
        for (char c : input.toCharArray()) {
            if (c=='-')
                continue;
            try { number = Character.getNumericValue(c);
            } catch (Exception e) {
                if (c == 'X' || c == 'x')
                    number = 10;
            }
            sum += number * multiply;
            multiply--;   
        }
        if (sum%11== 0)
            return true;
            return false;
      }
}
