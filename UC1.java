package Line_Comparision.src;
import java.util.Scanner;

public class UC1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        System.out.println("Enter the first (x1,y1) point");
        int x1 = getInputFromUser("first");
        int y1 = getInputFromUser("second");
        System.out.println("Enter the second (x2, y2) point");
        int x2 = getInputFromUser("first");
        int y2 = getInputFromUser("second");
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        Double length = Math.floor(Math.sqrt(x + y));
        System.out.println("length = "+ length);

    }
    public static int getInputFromUser(String number) {
        System.out.println("Enter the " + number + " line co-ordinated");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

}
