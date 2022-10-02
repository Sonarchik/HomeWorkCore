package First;

public class Time {
    public static String timer(int time) {
        String result;
        int hour = time / 3600;
        int minute = (time % 3600) / 60;
        int second = time % 60;
        String hours = converter(hour);
        String minutes = converter(minute);
        String seconds = converter(second);
        result = hours + ":" + minutes + ":" + seconds;
        return result;
    }

    private static String converter(int item) {
        String items;
        items = item < 10 ? "0" + item : "" + item;
        return items;
    }
}
