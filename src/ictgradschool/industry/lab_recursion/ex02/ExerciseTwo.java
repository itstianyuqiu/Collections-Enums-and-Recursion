package ictgradschool.industry.lab_recursion.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Main program for Lab 10 Ex 2, which should print out a table showing the frequency of all alphanumeric characters
 * in a text block.
 */
public class ExerciseTwo {

    /**
     * Loops through the given String and builds a Map, relating each alphanumeric character in the String (key)
     * with how many times that character occurs in the string (value). Ignore case.
     *
     * @param text the text to analyze
     * @return a mapping between characters and their frequencies in the text
     */
    private Map<Character, Integer> getCharacterFrequencies(String text) {

        // Ignore case. We need only deal with uppercase letters now, after this line.
        text = text.toUpperCase();

        // TODO Initialize the frequencies map to an appropriate concrete instance
        Map<Character, Integer> frequencies = new HashMap<>();

        // Loop through all characters in the given string
//        int count = 1;
        for (char c : text.toCharArray()) {

            // If c is alphanumeric...
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {

                // TODO If the map already contains c as a key, increment its value by 1.
                // TODO Otherwise, add it as a new key with the initial value of 1.
//                frequencies.put(c,count);
////                frequencies.get()
                int value = 1;
                Set<Character> s = frequencies.keySet();
                Iterator<Character> it = s.iterator();
                while (it.hasNext()) {
                    if (it.next()== c) {
                        value = frequencies.get(c);
                        frequencies.put(c, value+1);
                        System.out.println(value);
                    } else {
                        frequencies.put(c, value);
                        System.out.println(value);
                    }
                }
            }

        }
//            if (c =='0'){
//                count++;
//                frequencies.put('0',count);
//            }else if (c =='1'){
//                count++;
//                frequencies.put('1',count);
//            }else if (c =='2'){
//                count++;
//                frequencies.put('2',count);
//            }else if (c =='3'){
//                count++;
//                frequencies.put('3',count);
//            }else if (c =='4'){
//                count++;
//                frequencies.put('4',count);
//            }else if (c =='5'){
//                count++;
//                frequencies.put('5',count);
//            }else if (c =='6'){
//                count++;
//                frequencies.put('6',count);
//            }else if (c =='7'){
//                count++;
//                frequencies.put('7',count);
//            }else if (c =='8'){
//                count++;
//                frequencies.put('8',count);
//            }else if (c =='9'){
//                count++;
//                frequencies.put('9',count);
//            }else if (c =='A'){
//                count++;
//                frequencies.put('A',count);
//            }else if (c =='B'){
//                count++;
//                frequencies.put('B',count);
//            }else if (c =='C'){
//                count++;
//                frequencies.put('C',count);
//            }else if (c =='D'){
//                count++;
//                frequencies.put('D',count);
//            }else if (c =='E'){
//                count++;
//                frequencies.put('E',count);
//            }else if (c =='F'){
//                count++;
//                frequencies.put('F',count);
//            }else if (c =='G'){
//                count++;
//                frequencies.put('G',count);
//            }else if (c =='H'){
//                count++;
//                frequencies.put('H',count);
//            }else if (c =='I'){
//                count++;
//                frequencies.put('I',count);
//            }else if (c =='J'){
//                count++;
//                frequencies.put('J',count);
//            }else if (c =='K'){
//                count++;
//                frequencies.put('K',count);
//            }else if (c =='L'){
//                count++;
//                frequencies.put('L',count);
//            }else if (c =='M'){
//                count++;
//                frequencies.put('M',count);
//            }else if (c =='N'){
//                count++;
//                frequencies.put('N',count);
//            }else if (c =='O'){
//                count++;
//                frequencies.put('O',count);
//            }else if (c =='P'){
//                count++;
//                frequencies.put('P',count);
//            }else if (c =='Q'){
//                count++;
//                frequencies.put('Q',count);
//            }else if (c =='R'){
//                count++;
//                frequencies.put('R',count);
//            }else if (c =='S'){
//                count++;
//                frequencies.put('S',count);
//            }else if (c =='T'){
//                count++;
//                frequencies.put('T',count);
//            }else if (c =='U'){
//                count++;
//                frequencies.put('U',count);
//            }else if (c =='V'){
//                count++;
//                frequencies.put('V',count);
//            }else if (c =='W'){
//                count++;
//                frequencies.put('W',count);
//            }else if (c =='X'){
//                count++;
//                frequencies.put('X',count);
//            }else if (c =='Y'){
//                count++;
//                frequencies.put('Y',count);
//            }else if (c =='Z'){
//                count++;
//                frequencies.put('Z',count);
//            }else{
//                count++;
//                frequencies.put('o',count);
//            }
//        }

        // TODO BONUS: Add any missing keys to the map
        // (i.e. loop through all characters from A-Z and 0-9. If that character doesn't appear in the text,
        // add it as a key here with frequency 0).

        return frequencies;

    }

    /**
     * Prints the given map in a user-friendly table format.
     *
     * @param frequencies the map to print
     */
    private void printFrequencies(Map<Character, Integer> frequencies) {

        System.out.println("Char:\tFrequencies:");
        System.out.println("--------------------");

        // TODO Loop through the entire map and print out all the characters (keys)
        // TODO and their frequencies (values) in a table.
        for (Character key : frequencies.keySet()) {
            int count = frequencies.get(key);
            System.out.println("'" + key + "'\t\t" + count);
        }

    }

    /**
     * Main program flow. Do not edit.
     */
    private void start() {
        Map<Character, Integer> frequencies = getCharacterFrequencies(Constants.TEXT);
        printFrequencies(frequencies);
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        new ExerciseTwo().start();
    }
}
