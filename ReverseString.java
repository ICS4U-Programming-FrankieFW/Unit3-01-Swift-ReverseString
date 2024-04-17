
/**
This program uses recursion to call itself ot reverse a string
* @author Frankie Fox
* @version 1.0
* @since   2024-14-04
*/
import java.io.File;
import java.lang.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.*;

public class ReverseString {

    public static void main(String[] args) {
        //This turns inputFileName into input.txt as a string 
        String inputFileName = "input.txt";
        //This turns outputFileName to output.txt as a string 
        String outputFileName = "output.txt";
    //This used to reverse the lines that are in the input and into the output reversed 
        reverseLines(inputFileName, outputFileName);
    }

    //This creates the function of reversing the string that's in the input file to the output file 
    public static void reverseLines(String inputFileName, String outputFileName) {
        //This is the try statement for the function 
        try {
            //This creates a new file reader 
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
           //This creates the file writer 
            FileWriter fileWriter = new FileWriter(outputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String reversedLine = reverseString(line);
                bufferedWriter.write(reversedLine);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Lines reversed and saved to output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
