public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        //Input: "09:31 1475"
        //Output: "10:06"

        int hour, min, addTime;
        int newHour, newMin;
        String newTime;

        hour = Integer.parseInt(args[0].substring(0,2));
        min = Integer.parseInt(args[0].substring(3,5));
        addTime = Integer.parseInt(args[1]);

        int totalMin = hour*60 + min + addTime;
        newHour = (int)((totalMin / 60) % 24);
        newMin = (totalMin - (newHour * 60)) % 60;

        newTime = (newHour >= 10 ? "":"0") + newHour + ":" + (newMin >= 10 ? "":"0") + newMin;

        System.out.println(newTime);
    }
}
