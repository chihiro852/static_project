import java.util.Date;

import Utility.DateFormat;

public class Sample {

	public static void main(String[] args) {

		Date date = new Date();

		String strDate = "";

		// yyyy/MM/dd
		strDate = DateFormat.dateFormatSlash(date);

		System.out.println(strDate);

		// 以下を追加
		// yyyy年MM月dd日
		strDate = DateFormat.dateFormatKanji(date);

		System.out.println(strDate);
	}

}