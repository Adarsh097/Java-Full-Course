# 1. length()

Returns the length of the string.

```java
String s = "Hello";

System.out.println(s.length());
```

Output:

```text
5
```

---

# 2. charAt()

Returns character at a specific index.

```java
String s = "Hello";

System.out.println(s.charAt(1));
```

Output:

```text
e
```

---

# 3. substring()

Extracts part of a string.

## substring(beginIndex)

```java
String s = "HelloWorld";

System.out.println(s.substring(5));
```

Output:

```text
World
```

---

## substring(begin, end)

```java
System.out.println(s.substring(0,5));
```

Output:

```text
Hello
```

---

# 4. equals()

Compares content.

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1.equals(s2));
```

Output:

```text
true
```

---

# 5. equalsIgnoreCase()

Ignores uppercase/lowercase.

```java
System.out.println(
    "JAVA".equalsIgnoreCase("java")
);
```

Output:

```text
true
```

---

# 6. compareTo()

Lexicographical comparison.

```java
System.out.println("abc".compareTo("abd"));
```

Output:

```text
-1
```

Rules:

```text
0  -> equal
<0 -> first smaller
>0 -> first greater
```

---

# 7. contains()

Checks if substring exists.

```java
String s = "Java Programming";

System.out.println(
    s.contains("Program")
);
```

Output:

```text
true
```

---

# 8. startsWith()

```java
String s = "Java Programming";

System.out.println(
    s.startsWith("Java")
);
```

Output:

```text
true
```

---

# 9. endsWith()

```java
System.out.println(
    s.endsWith("ming")
);
```

Output:

```text
true
```

---

# 10. indexOf()

Find first occurrence.

```java
String s = "banana";

System.out.println(
    s.indexOf('a')
);
```

Output:

```text
1
```

---

# 11. lastIndexOf()

Find last occurrence.

```java
System.out.println(
    "banana".lastIndexOf('a')
);
```

Output:

```text
5
```

---

# 12. toUpperCase()

```java
String s = "java";

System.out.println(
    s.toUpperCase()
);
```

Output:

```text
JAVA
```

---

# 13. toLowerCase()

```java
String s = "JAVA";

System.out.println(
    s.toLowerCase()
);
```

Output:

```text
java
```

---

# 14. trim()

Removes leading/trailing spaces.

```java
String s = "   Java   ";

System.out.println(
    s.trim()
);
```

Output:

```text
Java
```

---

# 15. replace()

Replace characters.

```java
String s = "banana";

System.out.println(
    s.replace('a','x')
);
```

Output:

```text
bxnxnx
```

---

# 16. replaceAll()

Uses Regular Expressions.

```java
String s = "abc123";

System.out.println(
    s.replaceAll("[0-9]","")
);
```

Output:

```text
abc
```

---

# 17. split()

Very important for interviews.

```java
String s = "Java,Python,C++";

String arr[] = s.split(",");
```

Output:

```text
Java
Python
C++
```

---

# 18. isEmpty()

Checks length == 0.

```java
String s = "";

System.out.println(
    s.isEmpty()
);
```

Output:

```text
true
```

---

# 19. isBlank() (Java 11+)

Checks only whitespace.

```java
String s = "   ";

System.out.println(
    s.isBlank()
);
```

Output:

```text
true
```

---

# 20. concat()

Joins strings.

```java
String s1 = "Java";
String s2 = " Programming";

System.out.println(
    s1.concat(s2)
);
```

Output:

```text
Java Programming
```

---

# 21. toCharArray()

Very important in DSA.

```java
String s = "Java";

char arr[] = s.toCharArray();
```

Output:

```text
['J','a','v','a']
```

Used in:

* Character frequency
* Reversing strings
* Palindrome problems

---

# 22. valueOf()

Convert primitive → String.

```java
int x = 10;

String s = String.valueOf(x);
```

Output:

```text
"10"
```

---

# 23. repeat() (Java 11+)

```java
System.out.println(
    "Hi".repeat(3)
);
```

Output:

```text
HiHiHi
```

---

# 24. join()

```java
String result =
    String.join("-",
        "Java",
        "Python",
        "C++");

System.out.println(result);
```

Output:

```text
Java-Python-C++
```

---

# String Interview Methods

These are asked most often:

| Method        | Importance |
| ------------- | ---------- |
| length()      | ⭐⭐⭐⭐⭐      |
| charAt()      | ⭐⭐⭐⭐⭐      |
| substring()   | ⭐⭐⭐⭐⭐      |
| equals()      | ⭐⭐⭐⭐⭐      |
| compareTo()   | ⭐⭐⭐⭐⭐      |
| contains()    | ⭐⭐⭐⭐       |
| indexOf()     | ⭐⭐⭐⭐⭐      |
| lastIndexOf() | ⭐⭐⭐⭐       |
| split()       | ⭐⭐⭐⭐⭐      |
| replace()     | ⭐⭐⭐⭐       |
| toCharArray() | ⭐⭐⭐⭐⭐      |
| trim()        | ⭐⭐⭐        |
| toUpperCase() | ⭐⭐⭐        |
| toLowerCase() | ⭐⭐⭐        |

---

# Frequently Used String Patterns

## Reverse String

```java
String s = "hello";

StringBuilder sb =
    new StringBuilder(s);

System.out.println(sb.reverse());
```

---

## Palindrome

```java
String s = "madam";

String rev =
    new StringBuilder(s)
        .reverse()
        .toString();

System.out.println(
    s.equals(rev)
);
```

---

## Count Characters

```java
String s = "hello";

for(char ch : s.toCharArray()){
    System.out.println(ch);
}
```

---

## Count Frequency

```java
HashMap<Character,Integer> map =
    new HashMap<>();

for(char ch : s.toCharArray()){
    map.put(
        ch,
        map.getOrDefault(ch,0)+1
    );
}
```

---

# Must Memorize for Interviews

These 10 methods cover about **80% of String questions**:

```java
length()
charAt()
substring()
equals()
compareTo()
contains()
indexOf()
split()
replace()
toCharArray()
```

After Strings, the next high-priority topic is **StringBuilder & StringBuffer**, because interviewers often ask:

* Why Strings are immutable?
* Difference between String, StringBuilder, and StringBuffer?
* How to optimize string concatenation in loops?
