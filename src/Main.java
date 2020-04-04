import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> listString = new Stack<>();
        System.out.println("Enter a string : ");
        String inputString = scanner.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            listString.push(inputString.substring(i, i + 1));
        }
        String[] temp = new String[inputString.length()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = listString.pop();
        }
        for (int i = 0; i < temp.length; i++) {
            listString.push(temp[i]);
        }
        for (int i = 0; i < listString.size(); i++) {
            System.out.print(listString.get(i) + " ");
        }
    }
}
