package static_project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import utility.DateFormat;

public class Shelter {

	public static void hensu() {
		// intの場合
		int num; // 宣言
		num = 0; // 初期化

		// 宣言と初期化を同時に行うこともできる
		int num2 = 0;

		// Stringの場合
		String str;
		str = "";

		// 宣言と初期化を同時に行うこともできる
		String str2 = "";

		// 配列の場合
		int[] array;
		array = new int[5];
		// 同時
		int[] array2 = new int[5];

		// こちらでも可
		int array3[];
		array = new int[5];
		// 同時
		int array4[] = new int[5];

	}

	public static void samplrWhile() {
		// while文
		int num = 1; // 初期値設定

		while (num <= 256) { // numが256以下の場合、ブロック内の処理が繰り返される
			num = num * 2; // 2の累乗

			System.out.println(num); // 変数numを表示
		}
	}

	public static void sampleDoWhile() {
		// do while文
		int num = 1; // 初期値設定

		do {
			System.out.println(num); // 変数numを表示

			num = num * 2; // 2の累乗
		} while (num <= 256); // numが256以下の場合、ブロック内の処理が繰り返される
	}

	public static void sampleFor() {
		// for文
		for (int i = 1; i <= 10; i++) {
			// iが10以下の場合、ブロック内の処理が繰り返される
			System.out.println(i);
		}
	}

	public static void sampleForEach() {
		// 拡張for文
		String name[] = { "Nootbaar", "Kondoh", "Ohtani", "Murakami", "Yoshida", "Okamoto", "Yamada", "Genda",
				"Nakamura" };

		for (String str : name) {
			System.out.println(str);
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

	public static void sampleIf() {
		// if文1
		int score = 80; // テストの点数

		if (score >= 60) { // テストの点数が60以上の場合、ブロック内の処理に進む
			System.out.println("合格"); // 合格を表示
		}
	}

	public static void sampleIf2() {
		// if文2
		int score = 50; // テストの点数

		if (score >= 60) { // テストの点数が60以上の場合、このブロック内の処理に進む
			System.out.println("合格"); // 合格を表示
		} else { // score >= 60以外の場合、このブロック内の処理に進む
			System.out.println("不合格"); // 不合格を表示
		}
	}

	public static void sampleSwitch() {
		// switch文
		int rank = 4;

		switch (rank) {
		case 1:
			System.out.println("ブロンズ会員");
			break;

		case 2:
			System.out.println("シルバー会員");
			break;

		case 3:
			System.out.println("ゴールド会員");
			break;

		case 4:
			System.out.println("プラチナ会員");
			break;

		case 5:
			System.out.println("ダイヤモンド会員");
			break;

		default:
			System.out.println("非会員");
			break;
		}
	}

	public static void sampleSwitch2() {
		// switch文2
		int rank = 15;

		switch (rank) {
		case 1:
		case 2:
			System.out.println("ブロンズ会員");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("シルバー会員");
			break;

		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("ゴールド会員");
			break;

		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
			System.out.println("プラチナ会員");
			break;

		case 15:
			System.out.println("ダイヤモンド会員");
			break;

		default:
			System.out.println("非会員");
			break;
		}
	}

	public static void sampleArray() {

		//		int[] array = new int[5];
		//
		//		array[0] = 60;
		//		array[1] = 90;
		//		array[2] = 85;
		//		array[3] = 70;
		//		array[4] = 55;

		//		System.out.println("国語：" + array[0]);
		//		System.out.println("数学：" + array[1]);
		//		System.out.println("理科：" + array[2]);
		//		System.out.println("社会：" + array[3]);
		//		System.out.println("英語：" + array[4]);

		int[] array = { 60, 90, 85, 70, 55 };

		String[] subject = { "国語", "数学", "理科", "社会", "英語" };

		for (int i = 0; i < 5; i++) {
			System.out.println(subject[i] + "：" + array[i]);
		}

	}

	public static void sampleMultiArray() {

		String[] name = new String[] { "A", "B", "C", "D" };

		double[][] array = { { 340, 27, 109, 1.01 },
				{ 324, 30, 123, 1.002 },
				{ 330, 34, 119, 0.993 },
				{ 311, 26, 104, 0.942 } };

		for (int i = 0; i < array.length; i++) {
			System.out.println(
					name[i] + "選手 打率" + (int) array[i][0] + " HR" + (int) array[i][1] + "本 打点" + (int) array[i][2]
							+ "点 OPS" + array[i][3]);
		}

	}

	public static void sampleMethod() {
		// 現在日時を取得
		Date date = new Date();

		// yyyy/MM/ddに変換した現在日付を格納するstrDateを用意
		String strDate = "";

		// メソッドdateFormatSlashを使う
		// 引数にdateを渡す
		strDate = dateFormatSlash(date);

		// コンソールに出力
		System.out.println(strDate);

	}

	public static void sampleMethod2() {
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

	// 変数dateを変換するメソッド
	// Date dateは引数
	public static String dateFormatSlash(Date date) {
		// 変数strの用意
		String str = "";

		// フォーマットの指定
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

		// dateをフォーマットに変換して、strに代入
		str = dateFormat.format(date);

		// strを返す
		return str;
	}

	public void quiz() {
		char result;
		Scanner scanner = new Scanner(System.in);

		System.out.println("SEアシストの社長の正しい名前はどれでしょう？");
		System.out.println("下のア～オの中から選びなさい");
		System.out.println("ア：村上信五");
		System.out.println("イ：村上春樹");
		System.out.println("ウ：村上晋悟");
		System.out.println("エ：村上宗隆");
		System.out.println("オ：村上新悟");

		System.out.print("あなたの回答: ");
		result = scanner.next().charAt(0);
		switch (result) {
		case 'ア':
		case 'イ':
		case 'エ':
		case 'オ':
			System.out.println("不正解!");
			break;
		case 'ウ':
			System.out.println("正解!");
			break;
		default:
			System.out.println("ア～オの中から選択してください");
		}
	}
}
