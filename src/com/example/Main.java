package com.example;

public class Main {

    public static void main(String[] args) {
        String whiteSpaceText = "John          , Smith         ,   23,Seattle,      98103";
        String colourText = "What colour? Any colour – as long as it is black.";

        System.out.println(fixColour(colourText));
        System.out.println(replaceWords(colourText));
        System.out.println(fixCsvLine(whiteSpaceText));
    }

    /*
     * Java's built-in regex function str.replaceAll("regex pattern",
     * "replacement text");
     */

    /*
     * Method header: public String fixColour (String text)
     * It changes the text by replacing each occurrence of colour with color. Then
     * it returns the reult.
     * parameter text: "What colour? Any colour – as long as it is black."
     * expected result : "What color? Any color – as long as it is black."
     */
    public static String fixColour(String text) {
        // write code here

    }

    /*
     * Method header: public String replaceWords (String text)
     * It changes the text by replacing each word with the constant strint “xxx”.
     * Then it returns the result.
     * parameter text: "What colour? Any colour – as long as it is black."
     * expected result : "xxx xxx? xxx xxx – xxx xxx xxx xxx xxx xxx."
     */
    public static String replaceWords(String text) {
        // write code here

    }

    /*
     * Method header: public String fixCsvLine (String line)
     * It changes the line by removing the white space before and after the commas.
     * Then it returns the result.
     * parameter line: "John          , Smith         ,   23,Seattle,      98103"
     * expected result : "John,Smith,23,Seattle,98103"
     */
    public static String fixCsvLine(String text) {
        // write code here

    }
}
