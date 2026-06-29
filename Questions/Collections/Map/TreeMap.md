Excellent! 🎉

You've now reached **TreeMap**, which completes the three most important Map implementations:

```text
HashMap
LinkedHashMap
TreeMap
```

This is a very important interview topic because it introduces:

* Sorted Maps
* Red-Black Trees
* Comparable
* Comparator
* NavigableMap

---

# 1. What is TreeMap?

A `TreeMap` is a Map implementation that:

✅ Stores key-value pairs

✅ Keys are automatically sorted

❌ Duplicate keys not allowed

✅ Values can be duplicated

---

## Example

```java
Map<Integer,String> map = new TreeMap<>();

map.put(7,"Rajesh");
map.put(2,"Shikhar");
map.put(17,"Dinesh");
map.put(1,"Shashwat");
```

Output:

```text
1 -> Shashwat
2 -> Shikhar
7 -> Rajesh
17 -> Dinesh
```

Notice:

Keys are automatically sorted.

---

# 2. Internal Working

HashMap:

```text
Hash Table
```

LinkedHashMap:

```text
Hash Table
+
Doubly Linked List
```

TreeMap:

```text
Red Black Tree
(Self Balancing BST)
```

Example:

```text
       7
      / \
     2   17
    /
   1
```

The tree stays balanced automatically.

---

# 3. Your Comparator

You created:

```java
Map<Integer,String> map =
        new TreeMap<>((a,b)->(b-a));
```

This changes the default ordering.

Normally TreeMap:

```text
Ascending Order
```

Your comparator:

```java
(b-a)
```

creates:

```text
Descending Order
```

---

# 4. Dry Run

## Insert

```java
map.put(2,"shikhar");
map.put(1,"shashwat");
map.put(7,"rajesh");
map.put(17,"dinesh");
```

Because of:

```java
(b-a)
```

TreeMap stores:

```text
17 -> dinesh
7  -> rajesh
2  -> shikhar
1  -> shashwat
```

---

# 5. containsKey()

```java
map.containsKey(19)
```

Key:

```text
19
```

does not exist.

Output:

```text
false
```

---

# 6. containsValue()

```java
map.containsValue("shashwat")
```

Value exists.

Output:

```text
true
```

---

# 7. get()

```java
map.get(17)
```

Returns:

```text
dinesh
```

---

# Update Value

```java
String fullName =
        map.get(17) + " pandit";
```

Result:

```text
dinesh pandit
```

Store:

```java
map.put(17, fullName);
```

Map becomes:

```text
17 -> dinesh pandit
```

---

# 8. getOrDefault()

```java
map.getOrDefault(90,"Rahul")
```

90 not found.

Returns:

```text
Rahul
```

Then:

```java
+ " tiwari"
```

Result:

```text
Rahul tiwari
```

Store:

```java
map.put(90, defaultName);
```

---

# Tree Reorders Automatically

After insertion:

```text
90 -> Rahul tiwari
17 -> dinesh pandit
7  -> rajesh
2  -> shikhar
1  -> shashwat
```

Because of descending order.

---

# Iteration

```java
for(Map.Entry<Integer,String> entry
        : map.entrySet())
```

Output:

```text
90 -> Rahul tiwari
17 -> dinesh pandit
7 -> rajesh
2 -> shikhar
1 -> shashwat
```

---

# Complete Output

```text
false
true
90 -> Rahul tiwari
17 -> dinesh pandit
7 -> rajesh
2 -> shikhar
1 -> shashwat
```

---

# TreeMap Ordering

## Default

```java
TreeMap<Integer,String> map =
        new TreeMap<>();
```

Output:

```text
1
2
7
17
```

Ascending.

---

## Custom Comparator

```java
TreeMap<Integer,String> map =
        new TreeMap<>((a,b)->b-a);
```

Output:

```text
17
7
2
1
```

Descending.

---

# Important Difference from HashMap

HashMap:

```text
Random Order
```

LinkedHashMap:

```text
Insertion Order
```

TreeMap:

```text
Sorted Order
```

---

# NavigableMap Methods

To access these methods:

```java
TreeMap<Integer,String> map =
        new TreeMap<>();
```

instead of:

```java
Map<Integer,String> map =
        new TreeMap<>();
```

because these methods belong to `NavigableMap`.

---

## firstKey()

Smallest key.

```java
map.firstKey();
```

Output:

```text
1
```

---

## lastKey()

Largest key.

```java
map.lastKey();
```

Output:

```text
17
```

---

## higherKey()

Strictly greater key.

```java
map.higherKey(7);
```

Output:

```text
17
```

---

## lowerKey()

Strictly smaller key.

```java
map.lowerKey(7);
```

Output:

```text
2
```

---

## ceilingKey()

Greater than or equal.

```java
map.ceilingKey(7);
```

Output:

```text
7
```

---

## floorKey()

Less than or equal.

```java
map.floorKey(7);
```

Output:

```text
7
```

---

# Example

```java
TreeMap<Integer,String> map =
        new TreeMap<>();

map.put(1,"A");
map.put(3,"B");
map.put(5,"C");
map.put(8,"D");

System.out.println(map.higherKey(5));
System.out.println(map.lowerKey(5));
System.out.println(map.ceilingKey(4));
System.out.println(map.floorKey(4));
```

Output:

```text
8
3
5
3
```

---

# Time Complexity

Because TreeMap uses a Red-Black Tree:

| Operation     | Complexity |
| ------------- | ---------- |
| put()         | O(log n)   |
| get()         | O(log n)   |
| remove()      | O(log n)   |
| containsKey() | O(log n)   |

---

# HashMap vs TreeMap

Suppose:

```java
1000000 entries
```

### HashMap

Search:

```text
O(1)
```

Very fast.

---

### TreeMap

Search:

```text
O(log n)
```

Slower.

---

Use TreeMap only when sorting is required.

---

# TreeMap with String Keys

```java
TreeMap<String,Integer> map =
        new TreeMap<>();

map.put("Java",1);
map.put("Python",2);
map.put("C++",3);

System.out.println(map);
```

Output:

```text
{C++=3, Java=1, Python=2}
```

Alphabetical sorting.

---

# TreeMap with Custom Objects

This is a common interview topic.

### Wrong

```java
TreeMap<Student,Integer> map =
        new TreeMap<>();
```

Throws:

```text
ClassCastException
```

because TreeMap doesn't know how to compare Students.

---

### Solution 1

Implement Comparable:

```java
class Student
implements Comparable<Student>{

    int rollNo;

    @Override
    public int compareTo(Student s){
        return this.rollNo - s.rollNo;
    }
}
```

---

### Solution 2 (Preferred)

```java
TreeMap<Student,Integer> map =
    new TreeMap<>(
        (a,b)->a.rollNo-b.rollNo
    );
```

---

# Practice Questions

## Q1

Print keys in sorted order.

```java
TreeMap<Integer,String> map =
        new TreeMap<>();

map.put(5,"A");
map.put(1,"B");
map.put(10,"C");

System.out.println(map);
```

Output:

```text
{1=B, 5=A, 10=C}
```

---

## Q2

Print largest key.

```java
System.out.println(map.lastKey());
```

---

## Q3

Print smallest key.

```java
System.out.println(map.firstKey());
```

---

## Q4

Print next greater key.

```java
System.out.println(map.higherKey(5));
```

---

## Q5

Print previous smaller key.

```java
System.out.println(map.lowerKey(5));
```

---

# Final Comparison

| Feature          | HashMap    | LinkedHashMap            | TreeMap        |
| ---------------- | ---------- | ------------------------ | -------------- |
| Duplicate Keys   | ❌          | ❌                        | ❌              |
| Duplicate Values | ✅          | ✅                        | ✅              |
| Ordering         | ❌          | Insertion Order          | Sorted Keys    |
| put()            | O(1)       | O(1)                     | O(log n)       |
| get()            | O(1)       | O(1)                     | O(log n)       |
| Internal DS      | Hash Table | Hash Table + Linked List | Red-Black Tree |

### Example Input

```text
2 -> Shikhar
1 -> Shashwat
7 -> Rajesh
17 -> Dinesh
```

### HashMap

```text
Random Order
```

### LinkedHashMap

```text
2 -> Shikhar
1 -> Shashwat
7 -> Rajesh
17 -> Dinesh
```

### TreeMap

```text
1 -> Shashwat
2 -> Shikhar
7 -> Rajesh
17 -> Dinesh
```

---

