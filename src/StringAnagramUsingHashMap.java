import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class StringAnagramUsingHashMap {

	private static Map<String, List<String>> map = new HashMap<>();;

	public static Map<String, List<String>> AnagramHelper(String word) {

		String sortedWord = sortWord(word);

		List<String> list = map.get(sortedWord);
		if (list == null) {
			list = new ArrayList<>();
		}

		list.add(word);
		map.put(sortedWord, list);
		return map;
	}

	private static String sortWord(String word) {
		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		return Arrays.toString(charArray);
	}

	public static void main(String[] args) {
		String[] stringArray = { "sunny", "ynnus", "syunn", "nnsuy" };

		Map<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < stringArray.length; i++) {
			map = AnagramHelper(stringArray[i]);
		}

		System.out.println(map.get(sortWord("sunny")));
	}
}