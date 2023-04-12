package _28_exerciseTextProcessing;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine(); // C:\Internal\training-internal\Template.pptx

        /*String[] pathParts = path.split("\\\\");
        String fulPathName = pathParts[pathParts.length-1];
        String filName = fulPathName.split("\\.")[0];
        String extension = fulPathName.split("\\.")[1];*/



        /*System.out.println("File name: " + filName);
        System.out.println("File extension: " + extension);*/

        int lastIndex = path.lastIndexOf("\\");
        String fullName = path.substring(lastIndex + 1);
        int indexPoint = fullName.indexOf(".");
        String fileName = fullName.substring(0,indexPoint);
        String fileExtension = fullName.substring(indexPoint + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
