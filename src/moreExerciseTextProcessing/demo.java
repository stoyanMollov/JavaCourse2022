package moreExerciseTextProcessing;

public class demo {
    public static void main(String[] args) {
        String str = "12345hfjsk";

        StringBuilder sb = new StringBuilder();

        char[] arrray = str.toCharArray();

        for (int i = 0; i < arrray.length; i++){
            sb.append(arrray[i]);
        }

        System.out.println(sb);
    }
}
