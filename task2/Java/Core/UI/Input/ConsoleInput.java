package MiddleS.task2.Java.Core.UI.Input;

import java.util.Scanner;

import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleInput;

public class ConsoleInput implements IConsoleInput {
    Scanner input;

    public ConsoleInput() {
        input = new Scanner(System.in);
    }

    @Override
    public int setId() {
        int result = 0;
        System.out.println("Set ID for toy: ");
        while (true) {
            try {
                result = Integer.parseInt(input.nextLine());
                if (result < 0) {
                    throw new Exception();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Invalid input data");
            }
        }
    }

    @Override
    public int setChance() {
        int result = 0;
        System.out.println("Set chance of drop for toy: ");
        while (true) {
            try {
                result = Integer.parseInt(input.nextLine());
                if (result < 0) {
                    throw new Exception();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Invalid input data");
            }
        }
    }

    @Override
    public int setQuantity() {
        int result = 0;
        System.out.println("Set quantity for toy: ");
        while (true) {
            try {
                result = Integer.parseInt(input.nextLine());
                if (result < 1) {
                    throw new Exception();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Invalid input data");
            }
        }
    }

    @Override
    public String setName() {
        System.out.println("Toy name: ");
        return input.nextLine();
    }

    @Override
    public String setCommand() {
        System.out.println("Command: ");
        return input.nextLine();
    }

    @Override
    public int setSearchID() {
        int result = 0;
        System.out.println("Toy ID: ");
        while (true) {
            try {
                result = Integer.parseInt(input.nextLine());
                return result;
            } catch (Exception e) {
                System.out.println("Invalid input data");
            }
        }
    }
}