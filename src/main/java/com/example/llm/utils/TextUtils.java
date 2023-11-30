package com.example.llm.utils;
/*
  @author   george
  @project   llm
  @class  TextUtils
  @version  1.0.0 
  @since 30.11.23 - 14.01
*/

import com.pdfcrowd.Pdfcrowd;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TextUtils {
    private static final String userName = "demo";
    private static final String apiKey = "ce544b6ea52a5621fb9d55f8b542d14d";


    public static void convertPdfToTxtFile(String pdfFile, String txtFile) throws IOException, Pdfcrowd.Error {
        try {
            // create the API client instance
            Pdfcrowd.PdfToTextClient client =
                    new Pdfcrowd.PdfToTextClient(userName, apiKey);

            // run the conversion and write the result to a file
            client.convertFileToFile(pdfFile, txtFile);
        }
        catch(Pdfcrowd.Error why) {
            System.err.println("Pdfcrowd Error: " + why);
            throw why;
        }
        catch(IOException why) {
            System.err.println("IO Error: " + why);
            throw why;
        }
    }
    public static String convertPdfToTxtInMemory(String pdfFile) throws IOException, Pdfcrowd.Error {
        byte[] txt;
        try {
            // create the API client instance
            Pdfcrowd.PdfToTextClient client =
                    new Pdfcrowd.PdfToTextClient("demo", "ce544b6ea52a5621fb9d55f8b542d14d");

            // run the conversion and store the result into the "txt" variable
            txt = client.convertFile(pdfFile);

            // at this point the "txt" variable contains TXT raw data and
            // can be sent in an HTTP response, saved to a file, etc.
        } catch (Pdfcrowd.Error why) {
            System.err.println("Pdfcrowd Error: " + why);
            throw why;
        }
        return new String(txt);
    }
    public static List<String> tokenize(String text) {
        List<String> tokens = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(text, " \t\n\r\"+-/,;%*.!?()[]");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            Character firstChar = token.charAt(0);
            if (Character.isLowerCase(firstChar) && !StringUtils.isNumeric(token)) {
                tokens.add(token);
            }
        }
        return tokens;
    }

    public static List<String> getTrashWords(String file1, String file2) throws IOException {
        List<String> trash = new ArrayList<>();
        List<String> bk = tokenize(convertPdfToTxtInMemory(file1)).stream().distinct().toList();
        System.out.println("bk is ready " + bk.size());
        List<String> pl = tokenize(convertPdfToTxtInMemory(file2)).stream().distinct().toList();
        System.out.println("pl is ready " + pl.size());

        for (int i = 0; i < bk.size() ; i++) {
            String word = bk.get(i);
            if (pl.contains(word)) {
                trash.add(word);
            }
        }
        System.out.println(trash.size());
        return trash.stream().sorted().toList();
    }

}
