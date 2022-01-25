public class LabTwoQnThree {
    public static void main(String [] args){
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        // Compute the current seconds
        long currentSeconds = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minutes
        long currentMinutes = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hours
        long currentHours = totalHours % 24;

        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
    }
}
