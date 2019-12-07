1. Counting duplicate characters

The solution to counting the characters in a string (including special characters such as #, $, and %) implies taking each character and comparing them with the rest. During the comparison, the counting state is maintained via a numeric counter that's increased by one each time the current character is found.

There are two solutions to this problem.

The first solution iterates the string characters and uses Map to store the characters as keys and the number of occurrences as values. If the current character was never added to Map, then add it as (character, 1). If the current character exists in Map, then simply increase its occurrences by 1, for example, (character, occurrences+1). This is shown in the following code:

```java
public Map<Character, Integer> countDuplicateCharacters(String str) {

  Map<Character, Integer> result = new HashMap<>();

  // or use for(char ch: str.toCharArray()) { ... }
  for (int i = 0; i<str.length(); i++) {
    char ch = str.charAt(i); 

    result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
  }

  return result;
}
```
Another solution relies on Java 8's stream feature. This solution has three steps. The first two steps are meant to transform the given string into Stream<Character>, while the last step is responsible for grouping and counting the characters. Here are the steps:

Call the String.chars() method on the original string. This will return IntStream. This IntStream contains an integer representation of the characters from the given string.
Transform IntStream into a stream of characters via the mapToObj() method (convert the integer representation into the human-friendly character form).
Finally, group the characters (Collectors.groupingBy()) and count them (Collectors.counting()).
The following snippet of code glues these three steps into a single method:

```java
public Map<Character, Long> countDuplicateCharacters(String str) {

  Map<Character, Long> result = str.chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

  return result;
}
```


##What about Unicode characters?

<p>We are pretty familiar with ASCII characters. We have unprintable control codes between 0-31, printable characters between 32-127, and extended ASCII codes between 128-255. But what about Unicode characters? Consider this section for each problem that requires that we manipulate Unicode characters.</p> 

So, in a nutshell, early Unicode versions contained characters with values less than `65,535 (0xFFFF)`. Java represents these characters using the `16-bit char` data type. Calling `charAt(i)` works as expected as long as i doesn't exceed `65,535`. But over time, `Unicode` has added more characters and the maximum value has reached `1,114,111 (0x10FFFF)`. These characters don't fit into `16 bits`, and so `32-bit` values (known as `code points`) were considered for the `UTF-32` encoding scheme.

Unfortunately, Java doesn't support `UTF-32!` Nevertheless, Unicode has come up with a solution for still using 16 bits to represent these characters. This solution implies the following:

* `16-bit` high surrogates: `1,024 values (U+D800 to U+DBFF)`
* `16-bit` low surrogates: `1,024 values (U+DC00 to U+DFFF)`

Now, a high surrogate followed by a low surrogate defines what is known as a surrogate pair. Surrogate pairs are used to represent values between `65,536 (0x10000)` and `1,114,111 (0x10FFFF)`. So, certain characters, known as `Unicode supplementary characters`, are represented as Unicode surrogate pairs (`a one-character` (symbol) fits in the space of a pair of characters) that are merged into a single code point. Java takes advantage of this representation and exposes it via a suite of methods such as `codePointAt(), codePoints(), codePointCount(), and offsetByCodePoints()`. Calling `codePointAt() instead of charAt(), codePoints()` instead of `chars()`, and so on helps us to write solutions that cover `ASCII and Unicode` characters as well.

For example, the well-known two hearts symbol is a Unicode surrogate pair that can be represented as a `char[]` containing two values: `\uD83D` and `\uDC95`. The code point of this symbol is 128149. To obtain a String object from this code point, call String ``str = String.valueOf(Character.toChars(128149))``. Counting the code points in str can be done by calling str.codePointCount(0, str.length()), which returns 1 even if the str length is 2. `Calling str.codePointAt(0)` returns `128149` and calling `str.codePointAt(1)` returns 56469. Calling `Character.toChars(128149)` returns 2 since two characters are needed to represent this code point being a Unicode surrogate pair. For ASCII and Unicode 16- bit characters, it will return 1.

So, if we try to rewrite the first solution (that iterates the string characters and uses Map to store the characters as keys and the number of occurrences as values) to support ASCII and Unicode (including surrogate pairs), we obtain the following code:

```java
public static Map<String, Integer> 
    countDuplicateCharacters(String str) {
 
  Map<String, Integer> result = new HashMap<>();

  for (int i = 0; i < str.length(); i++) {
    int cp = str.codePointAt(i);
    String ch = String.valueOf(Character.toChars(cp));
    if(Character.charCount(cp) == 2) { // 2 means a surrogate pair
      i++;
    }

    result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
  }

  return result;
}
```
The highlighted code can be written as follows, as well:

```java
String ch = String.valueOf(Character.toChars(str.codePointAt(i)));
if (i < str.length() - 1 && str.codePointCount(i, i + 2) == 1) {
  i++;
}
```
Finally, trying to rewrite the Java 8 functional style solution to cover Unicode surrogate pairs can be done as follows:

```java
public static Map<String, Long> countDuplicateCharacters(String str) { 

  Map<String, Long> result = str.codePoints()
    .mapToObj(c -> String.valueOf(Character.toChars(c)))
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

  return result;
}
```
For third-party library support, please consider Guava: Multiset<String>.
Some of the following problems will provide solutions that cover ASCII, 16-bit Unicode, and Unicode surrogate pairs as well. They have been chosen arbitrarily, and so, by relying on these solutions, you can easily write solutions for problems that don't provide such a solution.