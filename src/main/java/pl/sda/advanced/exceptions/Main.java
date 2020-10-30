package pl.sda.advanced.exceptions;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        try {
            prepareAndPrintData();
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } catch (Throwable exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Koniec pracy");
        }
        try {
            prepareAndPrintData();
        } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Koniec pracy");
        }
    }

    private static void prepareAndPrintData() {
        Random random = new Random();
        int[] data = prepareData(random);
        printData(data);
    }

    private static int[] prepareData(Random random) {
        int[] data = new int[random.nextInt(10)];
        for (int i = 0; i < data.length; ++i) {
            data[i] = random.nextInt(100);
        }
        return data;
    }

    private static void printData(int[] data) {
        for (int i = 0; i <= data.length; ++i) {
            printData(data[i]);
        }
    }

    private static void printData(int data) {
        System.out.println(data);
    }

}
