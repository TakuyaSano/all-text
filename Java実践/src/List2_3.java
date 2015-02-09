import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class List2_3 {
	public static void main(String[] args) throws IOException {

		// 1. 現在の日時をDate型で取得します。
		Date now = new Date();

		// 2. 取得した日時情報をCalendarにセットします。
		Calendar c = Calendar.getInstance();
		c.setTime(now);

		// 3. Calendarから「日」の数値を取得します。
		int d = c.get(Calendar.DAY_OF_MONTH);

		// 4. 取得した値に100を足した値をCalendarの「日」にセットします。
		c.set(Calendar.DAY_OF_MONTH, d + 100);

		// 5. Calendarの日付情報をDate型に変換します。
		Date d2 = c.getTime();

		// 6. SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示します。
		SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(sdf.format(d2));
	}
}