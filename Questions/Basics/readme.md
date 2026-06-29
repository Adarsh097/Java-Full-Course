# Java String & Character Methods Cheat Sheet

## Character Class Methods

### Check Character Type

```java
Character.isLetter(ch)
```

Returns `true` if the character is an alphabet.

```java
Character.isDigit(ch)
```

Returns `true` if the character is a digit (`0-9`).

```java
Character.isLetterOrDigit(ch)
```

Returns `true` if the character is either a letter or a digit.

```java
Character.isWhitespace(ch)
```

Returns `true` if the character is a space, tab, or newline.

```java
Character.isUpperCase(ch)
```

Returns `true` if the character is uppercase.

```java
Character.isLowerCase(ch)
```

Returns `true` if the character is lowercase.

```java
Character.isAlphabetic(ch)
```

Returns `true` if the character is alphabetic.

---

### Character Conversion

```java
Character.toUpperCase(ch)
```

Converts a character to uppercase.

```java
Character.toLowerCase(ch)
```

Converts a character to lowercase.

```java
Character.getNumericValue(ch)
```

Converts a numeric character to its integer value.

Example:

```java
char ch = '7';
System.out.println(Character.getNumericValue(ch));
```

Output:

```text
7
```

---

### Character Comparison

```java
Character.compare(ch1, ch2)
```

Returns:

* `0` → Equal
* Negative Value → `ch1 < ch2`
* Positive Value → `ch1 > ch2`

---

## Common String Methods

```java
String s = "  Java Programming  ";
```

### length()

Returns the number of characters in a string.

```java
s.length();
```

Output:

```text
20
```

---

### trim()

Removes leading and trailing spaces.

```java
s.trim();
```

Output:

```text
Java Programming
```

---

### toUpperCase()

Converts all characters to uppercase.

```java
s.toUpperCase();
```

Output:

```text
JAVA PROGRAMMING
```

---

### toLowerCase()

Converts all characters to lowercase.

```java
s.toLowerCase();
```

Output:

```text
java programming
```

---

### contains()

Checks whether a string contains a substring.

```java
s.contains("Java");
```

Output:

```text
true
```

---

### indexOf()

Returns the index of the first occurrence.

```java
s.indexOf('P');
```

Output:

```text
7
```

---

### substring()

Extracts part of a string.

```java
s.substring(2, 6);
```

Output:

```text
Java
```

---

### replace()

Replaces characters or substrings.

```java
s.replace("Java", "Python");
```

Output:

```text
Python Programming
```

---

### charAt()

Returns the character at a specified index.

```java
s.charAt(0);
```

Output:

```text
J
```

---

### equals()

Case-sensitive string comparison.

```java
s.equals(str);
```

---

### equalsIgnoreCase()

Case-insensitive string comparison.

```java
s.equalsIgnoreCase(str);
```

---

### startsWith()

Checks whether a string starts with a given prefix.

```java
s.startsWith("Ja");
```

---

### endsWith()

Checks whether a string ends with a given suffix.

```java
s.endsWith("ing");
```

---

### isEmpty()

Checks if a string is empty.

```java
s.isEmpty();
```

---

### concat()

Concatenates strings.

```java
s.concat(" World");
```

Output:

```text
Java Programming World
```

---

### String.valueOf()

Converts other data types to String.

```java
String.valueOf(123);
```

Output:

```text
"123"
```

---

## split()

Splits a string into an array.

```java
String s = "10,20,30";
String[] arr = s.split(",");
```

Output:

```text
[10, 20, 30]
```

Loop through the array:

```java
for(String num : arr) {
    System.out.println(num);
}
```

Output:

```text
10
20
30
```

---

## Most Important Methods for Coding Interviews

### Character Class

```java
Character.isLetter(ch)
Character.isDigit(ch)
Character.isLetterOrDigit(ch)
Character.isWhitespace(ch)
Character.isUpperCase(ch)
Character.isLowerCase(ch)
Character.toUpperCase(ch)
Character.toLowerCase(ch)
Character.getNumericValue(ch)
Character.toString(ch)
```

### String Class

```java
length()
charAt()
substring()
contains()
indexOf()
split()
trim()
toUpperCase()
toLowerCase()
replace()
equals()
equalsIgnoreCase()
startsWith()
endsWith()
isEmpty()
concat()
String.valueOf()
```

These methods are sufficient for solving the majority of Java String and Character coding interview problems.

# Concepts

```
char[] arr = str.toCharArray()
```