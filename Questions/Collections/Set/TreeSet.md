Excellent! 🎉

You've now reached **TreeSet**, which is one of the most important collection classes because it introduces:

* Sorting
* Comparable
* Comparator
* Binary Search Tree concepts
* Red-Black Tree
* NavigableSet

These concepts are frequently asked in Java interviews.

---

# 1. What is TreeSet?

A `TreeSet` is a Set implementation that:

✅ Stores unique elements

✅ Maintains sorted order

❌ No duplicates

---

## Example

```java
Set<Integer> set = new TreeSet<>();

set.add(8);
set.add(1);
set.add(4);
set.add(3);
```

Output:

```text
1 3 4 8
```

Notice:

You inserted:

```text
8 1 4 3
```

But TreeSet automatically sorted them.

---

# 2. Internal Working

HashSet:

```text
Hash Table
```

LinkedHashSet:

```text
Hash Table + Linked List
```

TreeSet:

```text
Red Black Tree
(Self Balancing BST)
```

Internally:

```text
         4
       /   \
      1     8
       \
        3
```

The tree remains balanced automatically.

---

# 3. Dry Run of Your Code

## Creation

```java
Set<Integer> set = new TreeSet<>();
```

Default sorting:

```text
Ascending Order
```

---

## add(1)

```text
1
```

---

## add(8)

```text
1
 \
  8
```

---

## add(4)

Tree rebalances.

Result:

```text
    4
   / \
  1   8
```

---

## add(3)

```text
      4
     / \
    1   8
     \
      3
```

---

## add(8)

Duplicate.

Ignored.

---

# Iteration

```java
for(Integer element : set)
```

Output:

```text
1 3 4 8
```

Always sorted.

---

# contains()

```java
set.contains(10)
```

10 doesn't exist.

Output:

```text
false
```

---

# First Output

```text
1 3 4 8 false
```

---

# 4. Descending Order TreeSet

You created:

```java
Set<Integer> maxSet =
        new TreeSet<>((a,b)->(b-a));
```

This comparator changes sorting order.

---

# Comparator Logic

```java
(a,b) -> (b-a)
```

Example:

```java
compare(8,4)
```

Returns:

```java
4 - 8 = -4
```

Negative means:

```text
8 comes before 4
```

Thus:

```text
Descending Order
```

---

# Insertions

```java
1
8
4
3
```

TreeSet stores:

```text
8 4 3 1
```

---

# Iteration

```java
for(Integer element : maxSet)
```

Output:

```text
8 4 3 1
```

---

# contains()

```java
maxSet.contains(10)
```

Output:

```text
false
```

---

# Final Output

```text
1 3 4 8
false
8 4 3 1
false
```

---

# Why TreeSet Removes Duplicates?

When inserting:

```java
set.add(8);
```

again,

TreeSet uses:

```java
compareTo()
```

or

```java
Comparator.compare()
```

If result:

```java
0
```

Elements are considered equal.

Duplicate is ignored.

---

# TreeSet vs HashSet vs LinkedHashSet

Input:

```text
8 1 4 3
```

---

## HashSet

```java
HashSet<Integer>
```

Output:

```text
Random Order
```

Example:

```text
4 8 1 3
```

---

## LinkedHashSet

```java
LinkedHashSet<Integer>
```

Output:

```text
8 1 4 3
```

Insertion order.

---

## TreeSet

```java
TreeSet<Integer>
```

Output:

```text
1 3 4 8
```

Sorted order.

---

# Time Complexity

| Operation  | HashSet | LinkedHashSet | TreeSet  |
| ---------- | ------- | ------------- | -------- |
| add()      | O(1)    | O(1)          | O(log n) |
| remove()   | O(1)    | O(1)          | O(log n) |
| contains() | O(1)    | O(1)          | O(log n) |

---

# TreeSet Specific Methods

To access these methods, use:

```java
TreeSet<Integer> set = new TreeSet<>();
```

instead of:

```java
Set<Integer> set = new TreeSet<>();
```

because these methods belong to `NavigableSet`.

---

## first()

```java
set.first();
```

Smallest element.

Example:

```text
1
```

---

## last()

```java
set.last();
```

Largest element.

Example:

```text
8
```

---

## higher()

Strictly greater element.

```java
set.higher(4);
```

Output:

```text
8
```

---

## lower()

Strictly smaller element.

```java
set.lower(4);
```

Output:

```text
3
```

---

## ceiling()

Greater than or equal.

```java
set.ceiling(4);
```

Output:

```text
4
```

---

## floor()

Less than or equal.

```java
set.floor(4);
```

Output:

```text
4
```

---

# Example

```java
TreeSet<Integer> set = new TreeSet<>();

set.add(1);
set.add(3);
set.add(5);
set.add(8);

System.out.println(set.higher(5));
System.out.println(set.lower(5));
System.out.println(set.ceiling(4));
System.out.println(set.floor(4));
```

Output:

```text
8
3
5
3
```

---

# TreeSet with Strings

```java
Set<String> set = new TreeSet<>();

set.add("Java");
set.add("Python");
set.add("C++");

System.out.println(set);
```

Output:

```text
[C++, Java, Python]
```

Alphabetical order.

---

# TreeSet with Custom Objects

This is a very common interview topic.

Suppose:

```java
class Student {
    int rollNo;
    String name;
}
```

This will fail:

```java
TreeSet<Student> set = new TreeSet<>();
```

Exception:

```text
ClassCastException
```

Because TreeSet doesn't know how to compare Students.

---

## Solution 1: Comparable

```java
class Student implements Comparable<Student> {
    int rollNo;

    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }
}
```

---

## Solution 2: Comparator

```java
TreeSet<Student> set =
    new TreeSet<>(
        (a,b)->a.rollNo-b.rollNo
    );
```

Preferred in interviews.

---

# Common Interview Questions

## Find Smallest Element

```java
set.first();
```

---

## Find Largest Element

```java
set.last();
```

---

## Find Next Greater Element

```java
set.higher(x);
```

---

## Find Previous Smaller Element

```java
set.lower(x);
```

---

## Store Sorted Unique Values

```java
TreeSet<Integer>
```

---

# Practice Questions

## Q1

Print elements in ascending order.

```java
TreeSet<Integer> set = new TreeSet<>();

set.add(5);
set.add(1);
set.add(10);

System.out.println(set);
```

Output:

```text
[1, 5, 10]
```

---

## Q2

Print largest element.

```java
System.out.println(set.last());
```

---

## Q3

Print smallest element.

```java
System.out.println(set.first());
```

---

## Q4

Print next greater element after 5.

```java
System.out.println(set.higher(5));
```

---

## Q5

Print previous smaller element before 5.

```java
System.out.println(set.lower(5));
```

---

