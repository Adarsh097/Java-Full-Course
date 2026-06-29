This code introduces **LinkedList**, another important implementation of the `List` interface in Java.

# 1. What is LinkedList?

A **LinkedList** stores elements as **nodes** instead of a continuous array.

```java
List<Integer> list = new LinkedList<>();
```

Each node contains:

```text
+-------+-------+
| Data  | Next  |
+-------+-------+
```

Example:

```java
list.add(2);
list.add(7);
```

Internally:

```text
Head
 |
 v
[2|*] ---> [7|null]
```

Unlike ArrayList, elements are not stored in contiguous memory.

---

# 2. Why LinkedList?

### ArrayList

```text
[10][20][30][40]
```

Insertion in the middle requires shifting.

```text
Insert 25 at index 2

[10][20][25][30][40]
          ↑ shift
```

Cost:

```text
O(n)
```

---

### LinkedList

```text
10 -> 20 -> 30 -> 40
```

Insert:

```text
10 -> 20 -> 25 -> 30 -> 40
```

Just change links.

Cost:

```text
O(1)
```

(after reaching the position)

---

# 3. Code Execution Step-by-Step

## Step 1

```java
List<Integer> list = new LinkedList<>();
```

Creates an empty LinkedList.

```text
[]
```

---

## Step 2

```java
list.add(2);
```

```text
[2]
```

---

## Step 3

```java
list.add(7);
```

```text
[2,7]
```

---

## Step 4

```java
list.remove(1);
```

Removes element at index 1.

Current:

```text
[2,7]
```

Result:

```text
[2]
```

---

## Step 5

```java
list.remove(Integer.valueOf(9));
```

Attempts to remove value 9.

Current:

```text
[2]
```

9 doesn't exist.

Result:

```text
[2]
```

No exception.

Returns:

```java
false
```

internally.

---

## Step 6

```java
list.addFirst(1);
```

Current:

```text
[2]
```

Result:

```text
[1,2]
```

---

## Step 7

```java
list.addLast(10);
```

Result:

```text
[1,2,10]
```

---

## Step 8

```java
list.set(0,99);
```

Replace index 0.

Current:

```text
[1,2,10]
```

Result:

```text
[99,2,10]
```

---

## Step 9

```java
System.out.println(list.get(1));
```

Element at index 1:

```text
2
```

Output:

```text
2
```

---

# Final State

```java
[99,2,10]
```

Output:

```java
2
```

---

# Important Methods Used

## add()

```java
list.add(5);
```

Adds at end.

---

## addFirst()

```java
list.addFirst(10);
```

Adds at beginning.

---

## addLast()

```java
list.addLast(20);
```

Adds at end.

---

## remove(index)

```java
list.remove(2);
```

Removes element at index.

---

## remove(Object)

```java
list.remove(Integer.valueOf(5));
```

Removes value.

---

## set()

```java
list.set(1,50);
```

Replaces value.

---

## get()

```java
list.get(0);
```

Fetches element.

---

# LinkedList Internal Structure

Suppose:

```java
list.add(10);
list.add(20);
list.add(30);
```

Internally:

```text
Head
 |
 v
[10] <-> [20] <-> [30]
                      ^
                      |
                    Tail
```

Java's LinkedList is actually a **Doubly Linked List**.

Each node stores:

```java
class Node {
    E item;
    Node next;
    Node prev;
}
```

Visualization:

```text
prev <- [10] -> next
prev <- [20] -> next
prev <- [30] -> next
```

---

# ArrayList vs LinkedList

| Feature            | ArrayList     | LinkedList         |
| ------------------ | ------------- | ------------------ |
| Internal Structure | Dynamic Array | Doubly Linked List |
| Random Access      | O(1)          | O(n)               |
| Insert Beginning   | O(n)          | O(1)               |
| Delete Beginning   | O(n)          | O(1)               |
| Memory Usage       | Less          | More               |
| Cache Friendly     | Yes           | No                 |
| Search             | O(n)          | O(n)               |

---

# Interview Question

### Which is faster?

```java
list.get(50000);
```

### ArrayList

```text
O(1)
```

Direct access.

---

### LinkedList

```text
O(n)
```

Must traverse nodes.

ArrayList wins.

---

# Interview Question

### Which is better for frequent insertion/deletion at beginning?

```java
addFirst()
removeFirst()
```

Answer:

```text
LinkedList
```

Because:

```text
O(1)
```

while ArrayList needs shifting.

---

# Practice Questions

### Q1

Create a LinkedList and add 5 numbers.

**Answer**

```java
LinkedList<Integer> list = new LinkedList<>();

for(int i=1;i<=5;i++){
    list.add(i);
}

System.out.println(list);
```

Output:

```text
[1, 2, 3, 4, 5]
```

---

### Q2

Print LinkedList in reverse order.

**Answer**

```java
LinkedList<Integer> list =
        new LinkedList<>(Arrays.asList(1,2,3,4));

ListIterator<Integer> itr =
        list.listIterator(list.size());

while(itr.hasPrevious()){
    System.out.print(itr.previous()+" ");
}
```

Output:

```text
4 3 2 1
```

---

### Q3

Find the middle element.

**Answer**

```java
LinkedList<Integer> list =
        new LinkedList<>(Arrays.asList(10,20,30,40,50));

System.out.println(
        list.get(list.size()/2)
);
```

Output:

```text
30
```

---

### Q4

Remove all even numbers.

**Answer**

```java
LinkedList<Integer> list =
        new LinkedList<>(Arrays.asList(1,2,3,4,5,6));

list.removeIf(x -> x % 2 == 0);

System.out.println(list);
```

Output:

```text
[1,3,5]
```

---

### Q5

Insert 100 at the beginning and 200 at the end.

**Answer**

```java
LinkedList<Integer> list =
        new LinkedList<>();

list.addFirst(100);
list.addLast(200);

System.out.println(list);
```

Output:

```text
[100,200]
```

# Advanced Interview Point

In your code:

```java
List<Integer> list = new LinkedList<>();
```

`List` reference can only access methods declared in the `List` interface.

Technically, `addFirst()` and `addLast()` belong to `LinkedList`/`Deque`, not `List`.

To safely use them in all Java versions:

```java
LinkedList<Integer> list = new LinkedList<>();

list.addFirst(1);
list.addLast(10);
```

This is a common interview discussion about **interface reference vs implementation reference**.
