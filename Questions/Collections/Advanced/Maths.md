If by **"all Math important methods"** you mean the Java `Math` class methods that are frequently used in coding interviews, DSA, and Java development, here's a complete cheat sheet.

# Java Math Class

Import not required:

```java
Math.methodName()
```

Example:

```java
System.out.println(Math.sqrt(25));
```

Output:

```text
5.0
```

---

# 1. Absolute Value

## abs()

Returns positive value.

```java
Math.abs(-10)
```

Output:

```text
10
```

Examples:

```java
Math.abs(-5);      // 5
Math.abs(-5.7);    // 5.7
```

---

# 2. Power

## pow()

```java
Math.pow(2, 3)
```

Output:

```text
8.0
```

Examples:

```java
Math.pow(5,2); // 25.0
Math.pow(3,4); // 81.0
```

---

# 3. Square Root

## sqrt()

```java
Math.sqrt(64)
```

Output:

```text
8.0
```

---

# 4. Cube Root

## cbrt()

```java
Math.cbrt(27)
```

Output:

```text
3.0
```

---

# 5. Maximum

## max()

```java
Math.max(10,20)
```

Output:

```text
20
```

Examples:

```java
Math.max(5,9);
Math.max(-1,-5);
```

---

# 6. Minimum

## min()

```java
Math.min(10,20)
```

Output:

```text
10
```

---

# 7. Round

## round()

Rounds to nearest integer.

```java
Math.round(5.4)
```

Output:

```text
5
```

```java
Math.round(5.5)
```

Output:

```text
6
```

---

# 8. Floor

## floor()

Always rounds down.

```java
Math.floor(5.9)
```

Output:

```text
5.0
```

```java
Math.floor(-5.1)
```

Output:

```text
-6.0
```

---

# 9. Ceiling

## ceil()

Always rounds up.

```java
Math.ceil(5.1)
```

Output:

```text
6.0
```

```java
Math.ceil(-5.9)
```

Output:

```text
-5.0
```

---

# 10. Random Number

## random()

Returns:

```text
0.0 <= value < 1.0
```

```java
Math.random()
```

Example:

```java
double num = Math.random();
```

---

Generate 1 to 10:

```java
int num = (int)(Math.random()*10)+1;
```

---

# 11. Exponential

## exp()

Returns:

```text
e^x
```

```java
Math.exp(1)
```

Output:

```text
2.7182818
```

---

# 12. Natural Log

## log()

```java
Math.log(Math.E)
```

Output:

```text
1.0
```

---

# 13. Base 10 Log

## log10()

```java
Math.log10(1000)
```

Output:

```text
3.0
```

---

# 14. Trigonometric Functions

## sin()

```java
Math.sin(Math.toRadians(90))
```

Output:

```text
1.0
```

---

## cos()

```java
Math.cos(Math.toRadians(0))
```

Output:

```text
1.0
```

---

## tan()

```java
Math.tan(Math.toRadians(45))
```

Output:

```text
1.0
```

---

# 15. Degree ↔ Radian Conversion

## toRadians()

```java
Math.toRadians(180)
```

Output:

```text
3.141592653589793
```

---

## toDegrees()

```java
Math.toDegrees(Math.PI)
```

Output:

```text
180.0
```

---

# 16. Constants

## PI

```java
Math.PI
```

Output:

```text
3.141592653589793
```

---

## E

```java
Math.E
```

Output:

```text
2.718281828459045
```

---

# 17. Sign Function

## signum()

```java
Math.signum(10)
```

Output:

```text
1.0
```

```java
Math.signum(-10)
```

Output:

```text
-1.0
```

```java
Math.signum(0)
```

Output:

```text
0.0
```

---

# 18. Hypotenuse

## hypot()

Instead of:

```java
Math.sqrt(x*x+y*y)
```

Use:

```java
Math.hypot(3,4)
```

Output:

```text
5.0
```

---

# 19. Exact Arithmetic Methods

## addExact()

```java
Math.addExact(10,20)
```

Output:

```text
30
```

---

## subtractExact()

```java
Math.subtractExact(20,10)
```

Output:

```text
10
```

---

## multiplyExact()

```java
Math.multiplyExact(5,6)
```

Output:

```text
30
```

---

# Most Asked in Coding Interviews

You should memorize these:

| Method           | Usage           |
| ---------------- | --------------- |
| Math.abs()       | Absolute value  |
| Math.max()       | Maximum         |
| Math.min()       | Minimum         |
| Math.pow()       | Power           |
| Math.sqrt()      | Square root     |
| Math.cbrt()      | Cube root       |
| Math.floor()     | Round down      |
| Math.ceil()      | Round up        |
| Math.round()     | Nearest integer |
| Math.random()    | Random number   |
| Math.log()       | Natural log     |
| Math.log10()     | Base-10 log     |
| Math.sin()       | Sine            |
| Math.cos()       | Cosine          |
| Math.tan()       | Tangent         |
| Math.toRadians() | Degree → Radian |
| Math.toDegrees() | Radian → Degree |

# Top 10 You Must Know for DSA

```java
Math.abs()
Math.max()
Math.min()
Math.pow()
Math.sqrt()
Math.ceil()
Math.floor()
Math.round()
Math.random()
Math.log()
```

These are the methods most commonly encountered in coding rounds, LeetCode problems, and Java interviews.
