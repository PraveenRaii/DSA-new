import java.util.Scanner;

public class royal_clock_tower{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String time = sc.nextLine();
        String[] parts = time.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);

        String period;
        int hour12;
        if(hh==0){
            hour12= 12;
            period= "AM";

        }else if(hh==12){
            hour12 = 12;
            period = "PM";
        }else if(hh>12){
            hour12 = hh-12;
            period = "PM";
        }else{
            hour12 = hh;
            period = "AM";
        }
        System.out.printf("%02d:%02d %s%n", hour12, mm, period);

    }
}