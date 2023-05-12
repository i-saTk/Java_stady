import java.util.ArrayList;

public class NameList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("竹内");
		names.add("長瀬");
		names.add("箕輪");
		names.add("内田");

		String search = args[0];
		boolean result = false;

		for (int i = 0; i < names.size(); i++) {
			if (search.equals(names.get(i))) {
				result = true;
			}
		}
		if (result) {
			System.out.println(search + "さんは含まれています");
		} else {
			System.out.println(search + "さんは含まれていません");
		}

	}

}
