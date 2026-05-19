package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) {
        File file = new File("C:/tmp/test.txt");
        char ch = ' ';

        try (Scanner scanner = new Scanner(file)) { // Έχει σημασία η σειρά, από το ειδικότερο στο γενικότερο
            ch = (char) System.in.read();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("char read error");
        } catch (Exception e) {
            System.out.println("general  error");
        }
    }
}
