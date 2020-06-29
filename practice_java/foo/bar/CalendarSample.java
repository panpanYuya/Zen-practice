package foo.bar;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
public class CalendarSample {
 public static void main(String[] args) {
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
  SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
  System.out.println(sdf.format(createDate(2020, 6, 29)));
  System.out.println(sdf2.format(createDate(2020, 6, 29)));
 }

 public static Date createDate(int year, int month, int dayOfMonth){
  Calendar calendar = new GregorianCalendar();
  calendar.set(Calendar.MILLISECOND,0);
  calendar.set(Calendar.SECOND,0);
  calendar.set(Calendar.MINUTE, 0);
  calendar.set(Calendar.HOUR_OF_DAY,0);

  calendar.set(Calendar.YEAR, year);
  calendar.set(Calendar.MONTH, month);
  calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
  return calendar.getTime();
 }
}