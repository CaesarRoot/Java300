import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regax {
    public static void main(String[] args){
        Regax regax = new Regax();
        regax.start();
    }

    public void start(){
        Pattern p = Pattern.compile("^[a-zA-Z]{2}\\s*-[1-9]{4}$");
        Scanner scanner = new Scanner(System.in);
        Matcher m = p.matcher(scanner.nextLine());
        if(m.find()){
            System.out.print("Right Pattern");
        }
        else {
            System.out.print("Wrong Pattern");
        }
    }
}
