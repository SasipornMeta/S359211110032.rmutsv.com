package midterm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PartThreeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int id = 0;


        System.out.print("รหัสพนักงาน : ");
        id = Integer.parseInt(reader.readLine());

        getID();

    }

    public static void getID(){
        System.out.print("รหัสพนักงาน : " );

    }
}