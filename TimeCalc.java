public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        //Input: "09:31 1475"
        //Output: "10:06"

        int Hour, Min, AddTime;
        int newHour, newMin;
        String newTime;

        Hour = Integer.parseInt(args[0].substring(0,2));
        Min = Integer.parseInt(args[0].substring(3,5));
        AddTime = Integer.parseInt(args[1]);

        int TotalMin = Hour*60 + Min + AddTime;
        newHour = (int)((TotalMin/60)%24);
        newMin = (TotalMin - (newHour*60))%60;

        newTime = (newHour>=10 ? "":"0") + newHour + ":" + (newMin>=10 ? "":"0") + newMin;

        //newTime = String.valueOf(newHour + ":" + newMin);


        //newTime = String.valueOf(Hour + ":" + Min + " " + AddTime);
        System.out.println(newTime);
    }
}
