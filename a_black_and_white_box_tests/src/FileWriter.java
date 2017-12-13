import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileWriter {

    public static PrintWriter pw = null;

    public static void main(String[] args) {
//        populateInRange100(true);
//        populateGreaterThan100(true);
//        populateLessThanSigned2(true);
//        populateInRange100(false);
//        populateGreaterThan100(false);
//        populateLessThanSigned2(false);
        populateValuesWithAverageInMid();
    }

    private static void populateInRange100(boolean printAverage) {
        try {
            if (printAverage) {
                pw = new PrintWriter("inputValuesInRange100.txt", "UTF-8");
            } else {
                pw = new PrintWriter("inputValuesInRange100-WithoutAverage.txt", "UTF-8");
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <= 100; i++) {
            pw.println(i);
        }
        if (printAverage) {
            pw.println(-1);
        }
        pw.flush();
    }

    private static void populateGreaterThan100(boolean printAverage) {
        try {
            if (printAverage) {
                pw = new PrintWriter("inputValuesGreaterThan100.txt", "UTF-8");
            } else {
                pw = new PrintWriter("inputValuesGreaterThan100-WithoutAverage.txt", "UTF-8");
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for (int i = 100; i <= 120; i++) {
            pw.println(i);
        }
        if (printAverage) {
            pw.println(-1);
        }
        pw.flush();
    }

    private static void populateLessThanSigned2(boolean printAverage) {
        try {
            if (printAverage) {
                pw = new PrintWriter("inputValuesLessThanSigned2.txt", "UTF-8");
            } else {
                pw = new PrintWriter("inputValuesLessThanSigned2-WithoutAverage.txt", "UTF-8");
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for (int i = -2; i >= -12; i--) {
            pw.println(i);
        }
        if (printAverage) {
            pw.println(-1);
        }
        pw.flush();
    }

    private static void populateValuesWithAverageInMid() {
        try {
            pw = new PrintWriter("inputValuesWithAverageInMid.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <=5 ; i++) {
            if (i == 3){
                pw.println(-1);
            }
            pw.println(i);
        }
        pw.flush();
    }


}
