package se.marion;


public class ChatBot{

    public ChatBot(){
    
    }
    public String generateResponse(String input){
        if (input.isEmpty())
            return "Fine. Be that way!";
        if (isQuestion(input) && isStringUpperCase(input))
            return "Calm down, I know what I'm doing!";
        if (isQuestion(input))
            return "Sure";
        if (isStringUpperCase(input))
            return "Whoa, chill out!";
        return "Whatever.";
    }

    private static boolean isQuestion(String input){
        if (input.endsWith("?"))
            return true;
            return false;
    }
    private static boolean isStringUpperCase(String input){
        for(char c: input.toCharArray()){
            if(Character.isLowerCase(c))
                return false;
    }
        return true;
    }
  

}
