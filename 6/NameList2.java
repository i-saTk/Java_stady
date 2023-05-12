import java.util.ArrayList;
import java.util.Iterator;

public class NameList2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("竹内");
		names.add("長瀬");
		names.add("箕輪");
		names.add("内田");

		String search = args[0];
		boolean result = false;

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			if (search.equals(it.next())) {
				result = true;
				break;
			}
		}
		if (result) {
			System.out.println(search + "さんは含まれています");
		} else {
			System.out.println(search + "さんは含まれていません");
		}

	}

}
