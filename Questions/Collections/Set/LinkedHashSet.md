Great! After **HashSet**, the next logical topic is **LinkedHashSet**.

The biggest difference is:

| Collection    | Duplicate Allowed | Order Maintained        |
| ------------- | ----------------- | ----------------------- |
| HashSet       | ❌                 | ❌ No                    |
| LinkedHashSet | ❌                 | ✅ Yes (Insertion Order) |

---

# 1. What is LinkedHashSet?

`LinkedHashSet` is a Set implementation that:

✅ Stores unique elements

✅ Maintains insertion order

❌ Does not allow duplicates

---

## Example

```java
Set<Integer> set = new LinkedHashSet<>();

set.add(10);
set.add(5);
set.add(20);

System.out.println(set);
```

Output:

```text
[10, 5, 20]
```

Notice:

The order is exactly the same as insertion order.

---

# 2. Internal Working

Hierarchy:

```text
Collection
    |
    Set
     |
 LinkedHashSet
```

Internally:

```text
Hash Table
     +
Doubly Linked List
```

Visualization:

```text
Hash Table
    |
    v

1 <-> 8 <-> 4 <-> 3
```

The linked list remembers insertion order.

That's why iteration happens in insertion order.

---

# 3. Dry Run of Your Program

---

### Step 1

```java
set.add(1);
```

```text
[1]
```

---

### Step 2

```java
set.add(8);
```

```text
[1,8]
```

---

### Step 3

```java
set.add(4);
```

```text
[1,8,4]
```

---

### Step 4

```java
set.add(3);
```

```text
[1,8,4,3]
```

---

### Step 5

```java
set.add(8);
```

Duplicate.

Ignored.

Still:

```text
[1,8,4,3]
```

---

### Step 6

```java
set.remove(8);
```

Before:

```text
[1,8,4,3]
```

After:

```text
[1,4,3]
```

---

# 4. Iteration

```java
for(Integer element : set)
```

Prints:

```text
1 4 3
```

Why?

Because insertion order is preserved.

---

# 5. contains()

```java
System.out.println(set.contains(10));
```

Current set:

```text
[1,4,3]
```

10 does not exist.

Output:

```text
false
```

---

# Final Output

```text
1 4 3 false
```

---

# HashSet vs LinkedHashSet

## HashSet

```java
Set<Integer> set = new HashSet<>();

set.add(1);
set.add(8);
set.add(4);
set.add(3);

System.out.println(set);
```

Possible output:

```text
[4,1,3,8]
```

or

```text
[8,3,1,4]
```

No guarantee.

---

## LinkedHashSet

```java
Set<Integer> set = new LinkedHashSet<>();

set.add(1);
set.add(8);
set.add(4);
set.add(3);
```

Output:

```text
[1,8,4,3]
```

Always.

---

# Common Methods

## add()

```java
set.add(100);
```

Returns:

```java
true
```

if inserted.

Returns:

```java
false
```

if duplicate.

---

## remove()

```java
set.remove(100);
```

Returns:

```java
true
```

if removed.

Returns:

```java
false
```

if absent.

---

## contains()

```java
set.contains(50);
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

## size()

```java
set.size();
```

Returns number of unique elements.

---

## isEmpty()

```java
set.isEmpty();
```

---

## clear()

```java
set.clear();
```

Removes all elements.

---

# Why Use LinkedHashSet?

Suppose a user enters:

```text
Java
Python
Java
C++
Python
```

You want:

1. No duplicates
2. Original order

Output:

```text
Java
Python
C++
```

Use:

```java
LinkedHashSet<String>
```

---

# Remove Duplicates While Preserving Order

Input:

```java
List<Integer> list =
    Arrays.asList(1,2,2,3,1,4);
```

Using:

```java
Set<Integer> set =
    new LinkedHashSet<>(list);
```

Output:

```text
[1,2,3,4]
```

Notice:

Order preserved.

---

# Time Complexity

| Operation  | Complexity |
| ---------- | ---------- |
| add()      | O(1)       |
| remove()   | O(1)       |
| contains() | O(1)       |
| size()     | O(1)       |

Same as HashSet.

---

# Memory Usage

Because LinkedHashSet maintains a linked list:

```text
HashSet
   +
Pointers
```

it uses slightly more memory than HashSet.

Trade-off:

```text
More Memory
       ↓
Ordered Iteration
```

---

# Interview Question

### Which should I use?

Use:

### HashSet

When:

```text
Only uniqueness matters.
Order doesn't matter.
```

Fastest option.

---

### LinkedHashSet

When:

```text
Need uniqueness.
Need insertion order.
```

Best choice.

---

### TreeSet

When:

```text
Need uniqueness.
Need sorted order.
```

Example:

```text
1 3 4 8
```

---

# Practice Questions

## Q1. Remove Duplicates

```java
List<Integer> list =
    Arrays.asList(1,2,2,3,1,4);

Set<Integer> set =
    new LinkedHashSet<>(list);

System.out.println(set);
```

Output:

```text
[1,2,3,4]
```

---

## Q2. Count Unique Elements

```java
Set<Integer> set =
    new LinkedHashSet<>();

set.add(1);
set.add(1);
set.add(2);

System.out.println(set.size());
```

Output:

```text
2
```

---

## Q3. Check Existence

```java
System.out.println(set.contains(2));
```

Output:

```text
true
```

---

## Q4. Remove Element

```java
set.remove(2);
System.out.println(set);
```

---

## Q5. Store Unique Names

```java
Set<String> names =
    new LinkedHashSet<>();

names.add("Aman");
names.add("Rahul");
names.add("Aman");

System.out.println(names);
```

Output:

```text
[Aman, Rahul]
```

---

# HashSet vs LinkedHashSet vs TreeSet

| Feature           | HashSet    | LinkedHashSet                   | TreeSet        |
| ----------------- | ---------- | ------------------------------- | -------------- |
| Duplicate Allowed | ❌          | ❌                               | ❌              |
| Insertion Order   | ❌          | ✅                               |                |
| Sorted Order      | ❌          | ❌                               | ✅              |
| add()             | O(1)       | O(1)                            | O(log n)       |
| contains()        | O(1)       | O(1)                            | O(log n)       |
| Internal DS       | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree |

Example input:

```text
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

