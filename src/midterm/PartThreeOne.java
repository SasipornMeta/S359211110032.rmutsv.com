package midterm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PartThreeOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int count = 1;
        int birthday = 0;
        int year = 2561;

        for (int i=1;i<=3;i++){
            System.out.print("Enter Year " +count+ " :");
            birthday = Integer.parseInt(reader.readLine());

            int Age = year-birthday;
            System.out.println("Age : "+Age);
                count++;
                if (count == 4) {
                    System.out.println("Thank you.");
                    break;
                }
        }

    }
}
