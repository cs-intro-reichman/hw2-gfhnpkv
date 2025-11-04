public class TimeCalc {
    public static void main(String[] args) {
        // getting the inputs and converting them to hours and minitues
        int hours = Integer.parseInt("" + args[0].charAt(0) +
                                     args[0].charAt(1));
        int minitues = Integer.parseInt("" + args[0].charAt(3) +
                                     args[0].charAt(4));
        int timeToAdd = Integer.parseInt(args[1]);
    
        //calculating how many houes and minitues to add
        int totalHours = timeToAdd / 60;
        int minituesToAdd = timeToAdd - (totalHours * 60);
        while (minituesToAdd > 60) {
            minituesToAdd = minituesToAdd - 60;
            totalHours++;
        }
        int hoursToAdd = totalHours % 24;

        //adding the time
        minitues = minituesToAdd + minitues;
        if (minitues >= 60) {
            minitues = minitues - 60;
            hours++;
        }
        hours = (hours + hoursToAdd) % 24;

        //printing answer and checking overflow
        String answer = "";
        if (hours < 10) {
            answer = "0";
        }
        answer = answer + hours + ":";
         if (minitues < 10) {
            answer = answer + "0";
        }
        answer = answer + minitues;
        System.out.println(answer);

    }
}
