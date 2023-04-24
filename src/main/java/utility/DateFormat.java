package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static String dateFormatSlash(Date date) {

		String str = "";

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

		str = dateFormat.format(date);

		return str;

	}

	// 以下を追加
	public static String dateFormatKanji(Date date) {

		String str = "";

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");

		str = dateFormat.format(date);

		return str;
	}

}
