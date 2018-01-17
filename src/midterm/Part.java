package midterm;

import java.util.Scanner;

public class Part {
    public static void main(String[] args) {

        getID();
        getName();
        getSalary();
        getOverTime();
        calculateTax();
        showDataInfo();
    }

    private static void getID(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("รหัสพนักงาน : ");
        int id = Integer.parseInt(scanner.nextLine());
    }

    private static void getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ชื่อ-สกุล : ");
        String name = scanner.nextLine();
    }

    private static void getSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("เงินเดือน : ");
        int salary = Integer.parseInt(scanner.nextLine());

    }

    private static void getOverTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ค่าล่วงเวลา : ");
        int overtime = Integer.parseInt(scanner.nextLine());

    }

    private static void calculateTax(){



    }

    private static void showDataInfo(){
        System.out.println("-----------------------------------------------");

    }

}
