Excellent! You're now learning **HashSet**, one of the most important collections in Java.

HashSet is heavily used in:

* Removing duplicates
* Fast lookups
* Finding unique elements
* Graph algorithms
* Caching
* Database indexing concepts

---

# 1. What is a Set?

A **Set** is a collection that:

✅ Stores unique elements

❌ Does not allow duplicates

Example:

```java
Set<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10);
```

Result:

```text
[10,20]
```

The duplicate `10` is ignored.

---

# 2. What is HashSet?

```java
Set<Integer> set = new HashSet<>();
```

Hierarchy:

```text
Collection
    |
    Set
     |
  HashSet
```

HashSet internally uses a **Hash Table (HashMap)**.

This gives very fast operations.

---

# 3. Dry Run of Your Program

### Step 1

```java
set.add(1);
```

```text
{1}
```

---

### Step 2

```java
set.add(8);
```

```text
{1,8}
```

---

### Step 3

```java
set.add(4);
```

```text
{1,8,4}
```

---

### Step 4

```java
set.add(3);
```

```text
{1,8,4,3}
```

---

### Step 5

```java
set.add(8);
```

Already exists.

Ignored.

```text
{1,8,4,3}
```

---

# 4. remove()

```java
set.remove(8);
```

Before:

```text
{1,8,4,3}
```

After:

```text
{1,4,3}
```

---

# 5. Iteration

```java
for(Integer element : set)
```

Prints all elements.

---

## Important

HashSet does NOT maintain insertion order.

You might get:

```text
1 3 4
```

or

```text
4 1 3
```

or

```text
3 4 1
```

The order is not guaranteed.

Never depend on HashSet ordering.

---

# 6. remove() Again

```java
set.remove(8);
```

8 already removed.

Nothing happens.

Returns:

```java
false
```

internally.

---

# 7. contains()

```java
System.out.println(set.contains(10));
```

Checks whether 10 exists.

Current set:

```text
{1,4,3}
```

10 is absent.

Output:

```text
false
```

---

# Possible Output

Since HashSet is unordered:

```text
1 3 4 false
```

or

```text
4 1 3 false
```

or any other order.

Only:

```text
false
```

is guaranteed.

---

# Important HashSet Methods

## add()

```java
set.add(10);
```

Returns:

```java
true
```

if inserted.

```java
false
```

if duplicate.

Example:

```java
System.out.println(set.add(5)); // true
System.out.println(set.add(5)); // false
```

---

## remove()

```java
set.remove(10);
```

Returns:

```java
true
```

if removed.

```java
false
```

if absent.

---

## contains()

```java
set.contains(20);
```

Checks existence.

---

## size()

```java
set.size();
```

Returns number of elements.

---

## isEmpty()

```java
set.isEmpty();
```

Returns:

```java
true
```

or

```java
false
```

---

## clear()

```java
set.clear();
```

Removes all elements.

---

# Internal Working

HashSet internally uses:

```java
HashMap<E,Object>
```

Every element becomes a key.

Example:

```java
set.add(10);
set.add(20);
```

Internally:

```text
10 -> PRESENT
20 -> PRESENT
```

HashSet only cares about keys.

---

# Hashing Concept

Suppose:

```java
set.add(50);
```

Java computes:

```java
50.hashCode()
```

Then decides where to store it.

Example:

```text
Bucket 0
Bucket 1
Bucket 2
Bucket 3
```

Element goes into a bucket based on its hash.

This makes searching very fast.

---

# Why Duplicates Are Not Allowed

When you insert:

```java
set.add(8);
```

again:

Java checks:

```java
hashCode()
equals()
```

If already present:

```java
Ignore
```

No duplicate inserted.

---

# Time Complexity

| Operation  | Complexity   |
| ---------- | ------------ |
| add()      | O(1) Average |
| remove()   | O(1) Average |
| contains() | O(1) Average |
| size()     | O(1)         |

This is why HashSet is extremely popular.

---

# HashSet vs ArrayList

Suppose:

```java
ArrayList<Integer> list
```

Searching:

```java
list.contains(100)
```

Complexity:

```text
O(n)
```

---

HashSet:

```java
set.contains(100)
```

Complexity:

```text
O(1)
```

Huge difference for large datasets.

---

# HashSet with Custom Objects

Suppose:

```java
class Student {
    int rollNo;
    String name;
}
```

Without overriding:

```java
equals()
hashCode()
```

duplicates may appear.

Example:

```java
set.add(new Student(1,"Aman"));
set.add(new Student(1,"Aman"));
```

Both may get inserted.

To prevent this:

```java
@Override
public boolean equals(Object obj)
```

and

```java
@Override
public int hashCode()
```

must be overridden.

---

# Example

```java
Set<String> set = new HashSet<>();

set.add("Java");
set.add("Python");
set.add("Java");

System.out.println(set);
```

Output:

```text
[Java, Python]
```

Duplicate removed automatically.

---

# Common Interview Questions

## Remove Duplicates from Array

Input:

```text
1 2 2 3 4 4 5
```

Solution:

```java
HashSet<Integer> set = new HashSet<>();
```

Output:

```text
1 2 3 4 5
```

---

## Find Common Elements

```java
set1.retainAll(set2);
```

---

## Union of Sets

```java
set1.addAll(set2);
```

---

## Difference of Sets

```java
set1.removeAll(set2);
```

---

# Practice Questions

## Q1. Count Unique Elements

```java
int arr[] = {1,2,2,3,3,3};

Set<Integer> set = new HashSet<>();

for(int x : arr){
    set.add(x);
}

System.out.println(set.size());
```

Output:

```text
3
```

---

## Q2. Check Duplicate Exists

```java
int arr[] = {1,2,3,4,2};

Set<Integer> set = new HashSet<>();

boolean duplicate = false;

for(int x : arr){
    if(set.contains(x)){
        duplicate = true;
        break;
    }
    set.add(x);
}

System.out.println(duplicate);
```

Output:

```text
true
```

---

## Q3. Remove Duplicates

```java
List<Integer> list =
        Arrays.asList(1,2,2,3,3);

Set<Integer> set =
        new HashSet<>(list);

System.out.println(set);
```

Output:

```text
[1,2,3]
```

---

## Q4. Find Intersection

```java
Set<Integer> s1 =
        new HashSet<>(Arrays.asList(1,2,3));

Set<Integer> s2 =
        new HashSet<>(Arrays.asList(2,3,4));

s1.retainAll(s2);

System.out.println(s1);
```

Output:

```text
[2,3]
```

---

## Q5. Find Union

```java
Set<Integer> s1 =
        new HashSet<>(Arrays.asList(1,2));

Set<Integer> s2 =
        new HashSet<>(Arrays.asList(2,3));

s1.addAll(s2);

System.out.println(s1);
```

Output:

```text
[1,2,3]
```

---

# HashSet vs LinkedHashSet vs TreeSet

| Feature           | HashSet    | LinkedHashSet            | TreeSet        |
| ----------------- | ---------- | ------------------------ | -------------- |
| Duplicate Allowed | ❌          | ❌                        | ❌              |
| Order Maintained  | ❌          | Insertion Order          | Sorted Order   |
| add()             | O(1)       | O(1)                     | O(log n)       |
| contains()        | O(1)       | O(1)                     | O(log n)       |
| Internal DS       | Hash Table | Hash Table + Linked List | Red Black Tree |

### Example

Input:

```java
8 1 4 3
```

HashSet:

```text
Random Order
```

LinkedHashSet:

```text
8 1 4 3
```

TreeSet:

```text
1 3 4 8
```

---

