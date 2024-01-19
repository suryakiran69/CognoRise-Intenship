import java.util.*;
public class hang {
    private static String [] words={"java","pyhton","css"};
    private static String selectedword;
    static Random r=new Random();
    static char[] guessword;
    static int i=0;   //Incorrect guesses
    static int m=6;  //maximun guesses
    static String selectramdon(){
        return words[r.nextInt(words.length)];
    }
    static void  inguessedword(){
          for(int i=0;i<selectedword.length();i++){
            guessword[i]='_';
          }
    }
    static void display(){
        System.out.println("\n\nWord :");
        for(char c:guessword){
            System.out.print(c+" ");
        }
        System.out.println();
    }
    static boolean checkGuess(char f){
        boolean fo=false;
        for(int i=0;i<selectedword.length();i++){
            if(selectedword.charAt(i)==f){
                guessword[i]=f;
                fo=true;
            }
        }return fo;
    }
    static void displayHM(){
        String[] hangman={"  +---+\n" + "  |   |\n" + "      |\n" + "      |\n" + "      |\n" + "      |",

        "  +---+\n" + "  |   |\n" + "  O   |\n" + "      |\n" + "      |\n" + "      |",
        "  +---+\n" + "  |   |\n" + "  O   |\n" + "  |   |\n" + "      |\n" + "      |",
        "  +---+\n" + "  |   |\n" + "  O   |\n" + " /|   |\n" + "      |\n" + "      |",
        "  +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\  |\n" + "      |\n" + "      |",
        "  +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\  |\n" + " /    |\n" + "      |",
        "  +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\  |\n" + " / \\  |\n" + "      |"};
        System.out.println(hangman[i]);
    }
    static boolean gamewon(){
        for (char c:guessword){
            if(c=='_'){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the game \n you have 6 chances ");
        selectedword =selectramdon();
        guessword=new char[selectedword.length()];
        inguessedword();
        Scanner sc=new Scanner(System.in);
        while(i<m){
            display();
            System.out.println("Enter the letter: ");
            String in=sc.nextLine().toLowerCase();
            if(in.length()!=1 || !Character.isLetter(in.charAt(0))){
              System.out.println("Invaild data !!!");
              continue;
            }
            char gl=in.charAt(0);
            if(checkGuess(gl)){
                System.out.println("Good Guess...!");
            }
            else{
                displayHM();
                System.out.println("Incorrect Guess ");
                i++;
                System.out.println(i);
            }
            if(gamewon()){
              System.out.println("Congrats you won the game....!!!");
              break;
            }
        }
        if(i>=m){
            displayHM();
            System.out.println("You run out of attempts...");
            System.out.println("Better luck next time ");
        }
    }

}
