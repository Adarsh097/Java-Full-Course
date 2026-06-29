## Course Program Problem Statement

Create a class **Course** with the following private attributes:

* `courseId` → int
* `courseName` → String
* `courseAdmin` → String
* `quiz` → int
* `handson` → int

### Requirements

1. All attributes must be **private**.
2. Create:

   * Parameterized constructor
   * Getters and Setters for all attributes

---

## Class: `CourseProgram`

Implement the following two static methods:

### 1. `findAvgOfQuizByAdmin()`

#### Signature

```java
public static int findAvgOfQuizByAdmin(Course[] courses, String admin)
```

#### Functionality

* Accepts an array of `Course` objects and an admin name.
* Finds all courses managed by the given admin.
* Calculates the average number of quiz questions.
* Returns the average as an integer.
* Returns `0` if no matching course is found.

---

### 2. `sortCourseByHandsOn()`

#### Signature

```java
public static Course[] sortCourseByHandsOn(Course[] courses, int handson)
```

#### Functionality

* Accepts an array of `Course` objects and a handson value.
* Selects all courses whose `handson` value is **less than** the given value.
* Sorts the selected courses in **ascending order of handson**.
* Returns the sorted array.
* Returns `null` if no such course exists.

---

## Input Format

For 4 courses:

```text
courseId
courseName
courseAdmin
quiz
handson
```

After all courses:

```text
adminName
handsonValue
```

---

## Output Rules

### For `findAvgOfQuizByAdmin()`

* If returned value is not `0`, print the average.
* Otherwise print:

```text
No Course found
```

---

### For `sortCourseByHandsOn()`

* If returned array is not `null`, print the course names.
* Otherwise print:

```text
No Course found with mentioned attribute.
```

---

## Sample Input 1

```text
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Nisha
17
```

## Sample Output 1

```text
35
kubernetes
Apache Spark
cassandra
```

### Explanation

Courses administered by **Nisha**:

| Course       | Quiz |
| ------------ | ---- |
| kubernetes   | 40   |
| Apache Spark | 30   |

Average:

```text
(40 + 30) / 2 = 35
```

Courses with handson < 17:

| Course       | Handson |
| ------------ | ------- |
| kubernetes   | 10      |
| Apache Spark | 12      |
| cassandra    | 15      |

Sorted order:

```text
kubernetes
Apache Spark
cassandra
```

---

## Sample Input 2

```text
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Shubhamk
5
```

## Sample Output 2

```text
No Course found
No Course found with mentioned attribute.
```

### Explanation

* No course is administered by **Shubhamk** → average = 0.
* No course has `handson < 5` → return `null`.

---

## Time Complexity of Your Solution

### `findAvgOfQuizByAdmin()`

```text
O(n)
```

### `sortCourseByHandsOn()`

* Filtering courses → `O(n)`
* Sorting selected courses → `O(k²)` (Bubble/Selection style sorting)

Overall:

```text
O(n + k²)
```

where `k` is the number of courses having `handson < given value`.

Your provided code correctly satisfies all the requirements of the problem and produces the expected outputs for both sample test cases.
