import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int getAge(String prompt) {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        int age;

        try {
            System.out.print(prompt);
            age = Integer.parseInt(br.readLine());
            return age;
        } catch (Exception e) {
            return getAge(prompt);
        }
    }

    public static void main(String[] args) {
        int age = getAge("Enter age: ");

        if (age >= 21) {
            System.out.println("You get a paper wrist band");
        }
    }
}
