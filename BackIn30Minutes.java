import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int sumMin = (hours * 60) + minutes + 30;
        hours = sumMin / 60;
        minutes = sumMin % 60;

        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
