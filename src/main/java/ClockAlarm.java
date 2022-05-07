import java.util.Scanner;

public class ClockAlarm {

    public static void main(String[] args) {
        ClockAlarm ca = new ClockAlarm();
        ca.handWatch();
    }

    static int m = 0, h = 0, D = 1, M = 1, Y =2000;

     void DisplayTIME() {
        System.out.println(h + ":" + m);
    }
    public void handWatch() {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();

        String generalState = "NORMAL";
        String displayState = "TIME";
        String updateState = "MIN";
        String alarmState = "ALARM";

        for(int i = 0; i < in.length(); i++) {
            switch (generalState) {
                case "NORMAL":
                    if(in.charAt(i) == 'c') generalState = "UPDATE";
                    else if(in.charAt(i) == 'b') {
                        generalState = "ALARM";
                    }
                    else if(in.charAt(i) == 'a' && displayState.equals("TIME")) {
                        displayState = "DATE";
                    }
                    else if(in.charAt(i) == 'a' && displayState.equals("DATE")) displayState = "TIME";
                    break;

                case "ALARM":
                    if(in.charAt(i) == 'a') alarmState = "CHIME";
                    else if(in.charAt(i) == 'd') {
                        generalState = "NORMAL";
                        alarmState = "ALARM";
                    }
                    break;



                case "UPDATE":
                    if(in.charAt(i) == 'd') generalState = "NORMAL";
                    else if(in.charAt(i) == 'b') {
                        if(updateState.equals("MIN")) {
                            if(m < 60) {
                                m++;
                            }
                            else {
                                m = 0;
                            }
                        }
                        else if(updateState.equals("HOUR")) {
                            if(h < 24) {
                                h++;
                            }
                            else {
                                h = 0;
                            }
                        }
                        else if(updateState.equals("DAY")) {
                            if(D < 31) {
                                D++;
                            }
                            else {
                                D = 1;
                            }
                        }
                        else if(updateState.equals("MONTH")) {
                            if(M < 12) {
                                M++;
                            }
                            else {
                                M = 1;
                            }
                        }
                        else if(updateState.equals("YEAR")) {
                            if(Y < 2100) {
                                Y++;
                            }
                            else {
                                Y = 1;
                            }
                        }
                    }
                    else if(in.charAt(i) == 'a') {
                        if(updateState.equals("MIN")) {
                            updateState = "HOUR";
                        }
                        else if(updateState.equals("MONTH")) updateState = "YEAR";
                        else if(updateState.equals("DAY")) {
                            updateState = "MONTH";
                        }
                        else if(updateState.equals("YEAR")) {
                            generalState = "NORMAL";
                            displayState = "TIME";
                        }
                        else if(updateState.equals("HOUR")) {
                            updateState = "DAY";
                        }
                    }
                    break;
            }
        }
    }
         void DisplayDate() {
        System.out.println(Y + "-" + M + "-" + D);
    }
}
