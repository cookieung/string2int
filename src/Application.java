import java.util.Scanner;

public class Application {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while(!input.equals("end")) {
            Integer result = 0;
            Integer digit = 0;
            for(int i = input.length() - 1; i >= 0 ; i--) {
                char current = input.charAt(i);
                if(Character.isDigit(current)) {
                    int val = Integer.valueOf(input.substring(i, i+1));
                    result += val * Double.valueOf(Math.pow(10, digit)).intValue();
                    digit++;
                }
            }
            System.out.println(result);
            input = scan.nextLine();
        }
        System.out.println("Thank you!");
    }
}
