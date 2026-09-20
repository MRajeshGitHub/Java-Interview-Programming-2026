package com.strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {

		// String s = new String("ajay");

		// boolean ss = s.intern() == "ajay";
		// System.out.println(s);
		// System.out.println(ss);

		System.out.println("--------------");

		System.out.println("".isBlank());
		System.out.println("".isEmpty());
		System.out.println(" ".isBlank());
		System.out.println(" ".isEmpty());

		System.out.println("------------------");

		System.out.println("😀".length());

		System.out.println("😀".codePointCount(0, 2));

		System.out.println("======================");

		String s = "hello world";

		System.out.println(s.charAt(4));
		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf('o', 5));
		System.out.println(s.lastIndexOf('o'));
		System.out.println(s.indexOf("xyz"));
		System.out.println(s.contains("world"));
		s.charAt(4); // 'o'
		// s.charAt(20); // StringIndexOutOfBoundsException
		s.indexOf('o'); // 4 (पहला 'o')
		s.indexOf('o', 5); // 7 (index 5 के बाद से खोजो)
		s.lastIndexOf('o'); // 7 (आख़िरी 'o')
		s.indexOf("xyz"); // -1 (नहीं मिला)
		s.contains("world"); // true

		System.out.println("======================");

		String ss = "interview";

		System.out.println(ss.substring(0, 5));
		System.out.println(ss.substring(5));
		System.out.println(ss.substring(3, 3));
		// System.out.println(ss.substring(5, 2));
		s.substring(0, 5); // "inter" (end वाला index शामिल नहीं होता)
		s.substring(5); // "view" (5 से अंत तक)
		s.substring(3, 3); // "" (खाली string, error नहीं)
		// s.substring(5, 2); // StringIndexOutOfBoundsException (begin > end)

		System.out.println("=========================");

		// String[] res1 = "a,b,,c,,".split(",");
		// System.out.println(Arrays.toString(res1));
		System.out.println("".split(",").length);

		"a,b,,c,,".split(","); // [a, b, , c] → length 4 (आख़िर के खाली हट गए)
		"a,b,,c,,".split(",", -1); // [a, b, , c, , ] → length 6 (सब रखे गए)
		"a,b,c,d".split(",", 2); // [a, b,c,d] → limit 2 यानी सिर्फ 2 हिस्से
		"".split(","); // [""] → length 1, 0 नहीं!

		System.out.println("------------------------------------");

		// इसलिए यह हर एक कैरेक्टर के बीच में ब्रेक कर देता है।
		String[] res1 = "a|b".split("|");
		System.out.println("a|b split(\"|\")   -> " + Arrays.toString(res1));
		System.out.println("Length: " + res1.length); // [a, |, b] -> Length 3

		String text = "Apple|Banana|Mango";

		// सही और आसान तरीका
		String[] result = text.split(Pattern.quote("|")); // Output: ["Apple", "Banana", "Mango"]
		System.out.println(Arrays.asList(result));

		System.out.println("-------------------");
		System.out.println("a.b.c".replace(".", "-"));
		System.out.println("a.b.c".replaceAll(".", "-"));
		System.out.println("a.b.c".replaceAll("\\.", "-"));
		System.out.println("a.b.c".replaceFirst("\\.", "-"));

		"a.b.c".replace(".", "-"); // "a-b-c" ✓ (literal text, regex नहीं)
		"a.b.c".replaceAll(".", "-"); // "-----" ✗ ("." का मतलब कोई भी character)
		"a.b.c".replaceAll("\\.", "-"); // "a-b-c" ✓
		"a.b.c".replaceFirst("\\.", "-");// "a-b.c" (सिर्फ पहला match)

		String str = "java";
		str = str.replace("j", "A");

		System.out.println(str);

		System.out.println("-------------------------------");

		// "TITLE".toLowerCase(); // Turkish locale में "tıtle" (dotless i)
		// "TITLE".toLowerCase(Locale.ROOT); // हर system पर "title" ✓
		// "TITLE".toLowerCase(Locale.forLanguageTag("tr"));// "tıtle"

		System.out.println("TITLE".toLowerCase());
		System.out.println("TITLE".toLowerCase(Locale.ROOT));
		System.out.println("TITLE".toLowerCase(Locale.forLanguageTag("tr")));

		System.out.println("------------------------------");

		/*
		 * String.join(", ", "Java", "Spring", "Docker"); // "Java, Spring, Docker"
		 * String.join("-", List.of("a", "b", "c")); // "a-b-c" (List पर भी चलता है)
		 * 
		 * String.valueOf(100); // "100" String.valueOf(true); // "true"
		 * String.valueOf((Object) null);// "null" (String, NullPointerException नहीं)
		 * 
		 * String.format("Name: %s, Age: %d, Salary: %.2f%n", "Raj", 28, 45000.5); // %s
		 * = String, %d = integer, %.2f = 2 decimal तक, %n = new line
		 * 
		 */

		System.out.println(String.join(", ", "Java", "Spring", "Docker"));

		System.out.println("-------------------------");
		/*
		 * char[] arr = "hello".toCharArray(); // [h, e, l, l, o] arr[0] = 'j'; //
		 * original String पर कोई असर नहीं (यह copy है)
		 * 
		 * "hello".chars() // IntStream, values int होती हैं, char नहीं .filter(c -> c
		 * == 'l') .count(); // 2
		 * 
		 * "hello".chars().mapToObj(c -> (char) c); // char में बदलने के लिए cast चाहिए
		 * 
		 * "A".getBytes(StandardCharsets.UTF_8).length; // 1 byte
		 * "अ".getBytes(StandardCharsets.UTF_8).length; // 3 bytes
		 * "😀".getBytes(StandardCharsets.UTF_8).length; // 4 bytes
		 */

		char[] arr = "hellow".toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		long count = "hellllow".chars().filter(c -> c == 'l').count();
		System.out.println(count);

		long count2 = "aabbccdd".chars().filter(c -> c == 'a').count();
		System.out.println(count2);

		System.out.println("aa".repeat(4));

		String json = """
				{
				  "name": "Raj",
				  "role": "Java Developer"
				}
				""";
		System.out.println(json);
		
		System.out.println("abcd123".matches("\\d"));
	}
}
