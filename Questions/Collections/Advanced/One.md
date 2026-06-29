These are the **advanced Java Collection Framework topics** and are very important for interviews and real-world development.

---

# 1. Comparable

## What is Comparable?

Comparable is used when a class knows **how it should be sorted by default**.

It provides:

```java
public interface Comparable<T> {
    int compareTo(T o);
}
```

---

## Example

### Student Class

```java
class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    @Override
    public String toString() {
        return rollNo + " " + name;
    }
}
```

---

### Usage

```java
List<Student> students = new ArrayList<>();

students.add(new Student(3,"Raj"));
students.add(new Student(1,"Aman"));
students.add(new Student(2,"Rohit"));

Collections.sort(students);

System.out.println(students);
```

Output:

```text
1 Aman
2 Rohit
3 Raj
```

---

## Rules of compareTo()

```java
this.compareTo(other)
```

Return:

```text
< 0   -> this comes first
= 0   -> equal
> 0   -> other comes first
```

---

## Where Comparable is Used?

* Collections.sort()
* TreeSet
* TreeMap
* Arrays.sort()

---

# 2. Comparator

## Why Comparator?

Suppose Student already has default sorting by rollNo.

Now you want:

* Sort by name
* Sort by age
* Sort by marks

Comparable cannot handle multiple sorting strategies.

Use Comparator.

---

## Example

```java
Comparator<Student> byName =
    (a,b) -> a.name.compareTo(b.name);
```

---

### Sort by Name

```java
students.sort(byName);
```

Output:

```text
Aman
Raj
Rohit
```

---

### Sort by RollNo Descending

```java
students.sort(
    (a,b) -> b.rollNo - a.rollNo
);
```

Output:

```text
3 Raj
2 Rohit
1 Aman
```

---

## Comparator Utility Methods

### comparing()

```java
students.sort(
    Comparator.comparing(s -> s.name)
);
```

---

### comparingInt()

```java
students.sort(
    Comparator.comparingInt(s -> s.rollNo)
);
```

---

### reversed()

```java
students.sort(
    Comparator.comparingInt(Student::getRollNo)
              .reversed()
);
```

---

### Multiple Sorting

```java
students.sort(
    Comparator.comparing(Student::getName)
              .thenComparing(Student::getRollNo)
);
```

---

# Comparable vs Comparator

| Feature         | Comparable  | Comparator |
| --------------- | ----------- | ---------- |
| Package         | java.lang   | java.util  |
| Method          | compareTo() | compare()  |
| Modifies Class  | Yes         | No         |
| Default Sorting | Yes         | No         |
| Multiple Sorts  | No          | Yes        |
| Interview Usage | Moderate    | Very High  |

---

# 3. Collections Utility Class

Collections is a utility class containing helper methods.

```java
import java.util.Collections;
```

---

## sort()

```java
Collections.sort(list);
```

---

## reverse()

```java
Collections.reverse(list);
```

Example:

```java
[1,2,3]
```

becomes

```java
[3,2,1]
```

---

## shuffle()

```java
Collections.shuffle(list);
```

Random order.

---

## max()

```java
Collections.max(list);
```

Output:

```java
10
```

---

## min()

```java
Collections.min(list);
```

Output:

```java
1
```

---

## frequency()

```java
Collections.frequency(list,2);
```

Count occurrences.

---

## binarySearch()

```java
Collections.binarySearch(list,5);
```

List must be sorted.

Complexity:

```text
O(log n)
```

---

## swap()

```java
Collections.swap(list,0,2);
```

---

## fill()

```java
Collections.fill(list,100);
```

All elements become 100.

---

# 4. Java 8 Streams API

Streams revolutionized Java collections.

Instead of:

```java
for(Integer x : list){
    if(x % 2 == 0)
        System.out.println(x);
}
```

We write:

```java
list.stream()
    .filter(x -> x % 2 == 0)
    .forEach(System.out::println);
```

---

# What is a Stream?

A stream is a pipeline of operations.

```text
Collection
    ↓
 Stream
    ↓
Processing
    ↓
Result
```

---

# Creating Stream

```java
list.stream()
```

---

# filter()

Select elements.

```java
list.stream()
    .filter(x -> x % 2 == 0)
```

Output:

```text
2 4 6 8
```

---

# map()

Transform elements.

```java
list.stream()
    .map(x -> x*x)
```

Input:

```text
1 2 3
```

Output:

```text
1 4 9
```

---

# sorted()

```java
list.stream()
    .sorted()
```

Ascending.

---

Descending:

```java
list.stream()
    .sorted(Comparator.reverseOrder())
```

---

# distinct()

Remove duplicates.

```java
list.stream()
    .distinct()
```

Input:

```text
1 2 2 3
```

Output:

```text
1 2 3
```

---

# limit()

```java
list.stream()
    .limit(3)
```

First 3 elements.

---

# count()

```java
long count =
    list.stream().count();
```

---

# collect()

Convert stream back to collection.

```java
List<Integer> result =
    list.stream()
        .filter(x -> x%2==0)
        .collect(Collectors.toList());
```

---

# Example

```java
List<Integer> nums =
    Arrays.asList(1,2,3,4,5);

List<Integer> squares =
    nums.stream()
        .map(x -> x*x)
        .collect(Collectors.toList());

System.out.println(squares);
```

Output:

```text
[1,4,9,16,25]
```

---

# Stream Interview Questions

### Sum

```java
int sum =
    list.stream()
        .mapToInt(Integer::intValue)
        .sum();
```

---

### Maximum

```java
int max =
    list.stream()
        .max(Integer::compare)
        .get();
```

---

### Count Even Numbers

```java
long count =
    list.stream()
        .filter(x -> x%2==0)
        .count();
```

---

# 5. Concurrent Collections

Normal collections are NOT thread-safe.

Example:

```java
ArrayList
HashMap
HashSet
```

Multiple threads modifying them can cause issues.

---

# Thread-Safe Collections

## ConcurrentHashMap

Most important.

```java
ConcurrentHashMap<Integer,String> map =
    new ConcurrentHashMap<>();
```

---

### Why Not HashMap?

```java
HashMap
```

Multiple writes can corrupt data.

---

### ConcurrentHashMap

Allows:

```text
Multiple Readers
Multiple Writers
```

Safely.

---

# CopyOnWriteArrayList

```java
CopyOnWriteArrayList<Integer> list =
    new CopyOnWriteArrayList<>();
```

When modified:

```text
Creates New Copy
```

Useful when:

```text
Many Reads
Few Writes
```

---

# BlockingQueue

Used in Producer-Consumer problems.

```java
BlockingQueue<Integer> queue =
    new LinkedBlockingQueue<>();
```

---

### Producer

```java
queue.put(10);
```

---

### Consumer

```java
queue.take();
```

Automatically waits.

---

# Concurrent Collections Summary

| Collection           | Thread Safe |
| -------------------- | ----------- |
| ArrayList            | ❌           |
| HashMap              | ❌           |
| HashSet              | ❌           |
| ConcurrentHashMap    | ✅           |
| CopyOnWriteArrayList | ✅           |
| BlockingQueue        | ✅           |

---

