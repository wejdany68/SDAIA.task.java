package day3.section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class RFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        HashMap<Character, Integer> counts = new HashMap<>();

        try {
            Scanner fsc = new Scanner(new File(fileName));
            while (fsc.hasNextLine()) {
                String line = fsc.nextLine().toLowerCase();
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        if (counts.containsKey(c)) {
                            counts.put(c, counts.get(c) + 1);
                        } else {
                            counts.put(c, 1);
                        }
                    }
                }
            }
            fsc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Displaying character counts
        for (var entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
