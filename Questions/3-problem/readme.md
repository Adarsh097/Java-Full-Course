# Student Program Problem Statement

## Class: Student

Create a class **Student** with the following private attributes:

* rollNo : int
* name : String
* branch : String
* score : double
* dayScholar : boolean

### Requirements

* All attributes should be private.
* Provide:

  * Parameterized Constructor
  * Getter Methods
  * Setter Methods

---

## Class: Solution

Create a class **Solution** containing the `main()` method.

Implement the following two static methods:

### 1. findCountOfDayscholarStudents()

#### Method Signature

```java
public static int findCountOfDayscholarStudents(Student[] students)
```

#### Functionality

* Accepts an array of Student objects.
* Counts the students who:

  * are Day Scholars (`dayScholar = true`)
  * have a score greater than 80.
* Returns the count.

#### Return Value

* Return the count if matching students are found.
* Return `0` if no such student exists.

---

### 2. findStudentwithSecondHighestScore()

#### Method Signature

```java
public static Student findStudentwithSecondHighestScore(Student[] students)
```

#### Functionality

* Accepts an array of Student objects.
* Considers only students who are **not Day Scholars** (`dayScholar = false`).
* Finds the student having the **second highest score** among them.
* Returns the corresponding Student object.

#### Return Value

* Return the Student object if found.
* Return `null` if no non-day-scholar student exists.

---

## Important Notes

* All searches should be case-insensitive.
* The combination of `dayScholar` and `score` for each student is always unique.
* Before calling the static methods, use a `Scanner` object to read values for **4 Student objects** in the following order:

```text
rollNo
name
branch
score
dayScholar
```

---

## Output Rules

### For findCountOfDayscholarStudents()

If returned value is greater than 0:

```text
Print the count
```

Otherwise print:

```text
There are no such dayscholar students
```

---

### For findStudentwithSecondHighestScore()

If returned object is not null:

```text
rollNo#name#score
```

Otherwise print:

```text
There are no student from non day scholar
```

---

## Sample Input

```text
1001
Ashwa
IT
85
true
1002
Preeti
IT
70
false
1003
Uma
ECE
85
false
1004
Akash
EEE
90
true
```

---

## Sample Output

```text
2
1002#Preeti#70.0
```

---

## Explanation

### Day Scholar Students with Score > 80

| Roll No | Name  | Score | Day Scholar |
| ------- | ----- | ----- | ----------- |
| 1001    | Ashwa | 85    | true        |
| 1004    | Akash | 90    | true        |

Count:

```text
2
```

---

### Non-Day Scholar Students

| Roll No | Name   | Score |
| ------- | ------ | ----- |
| 1002    | Preeti | 70    |
| 1003    | Uma    | 85    |

Scores in descending order:

```text
85
70
```

Second highest score student:

```text
1002#Preeti#70.0
```
