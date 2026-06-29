Excellent! Now you're learning **PriorityQueue**, one of the most important data structures for coding interviews, DSA, and real-world systems.

This topic is heavily used in:

* Dijkstra's Algorithm
* Prim's Algorithm
* Scheduling Systems
* Top K Problems
* Heap Sort
* Task Scheduling
* Load Balancers
* Cloud Infrastructure

---

# 1. What is a Priority Queue?

A normal Queue follows:

```text
FIFO
(First In First Out)
```

Example:

```text
7 → 8 → 11 → 1
```

Removal order:

```text
7
8
11
1
```

---

A Priority Queue removes elements according to **priority**, not insertion order.

Example:

```java
queue.offer(2);
queue.offer(11);
queue.offer(1);
```

Priority Queue internally:

```text
1
2
11
```

Even though 1 was inserted last, it has the highest priority (smallest value).

---

# 2. Internal Working

PriorityQueue is implemented using a:

## Binary Heap

Specifically:

```text
Min Heap (Default)
```

Properties:

```text
Parent <= Children
```

Example:

```text
       1
      / \
     11  2
```

The smallest element is always at the root.

---

# 3. Creating a Priority Queue

```java
Queue<Integer> queue = new PriorityQueue<>();
```

Default:

```text
Min Heap
Ascending Priority
```

---

# 4. offer()

```java
queue.offer(2);
queue.offer(11);
queue.offer(1);
```

Let's see what happens.

---

## Insert 2

```text
2
```

---

## Insert 11

```text
    2
   /
 11
```

---

## Insert 1

Inserted at last position:

```text
    2
   / \
 11   1
```

Heap property violated:

```text
1 < 2
```

Swap.

```text
    1
   / \
 11   2
```

---

# 5. poll()

```java
queue.poll();
```

Removes highest-priority element.

Current heap:

```text
    1
   / \
 11   2
```

Remove:

```text
1
```

Move last element to root:

```text
    2
   /
 11
```

Heap valid.

Queue now contains:

```text
2
11
```

---

# 6. peek()

```java
System.out.println(queue.peek());
```

Returns:

```text
2
```

Does not remove.

Output:

```text
2
```

---

# Important Observation

You inserted:

```java
2
11
1
```

After poll:

```java
1 removed
```

Remaining:

```java
2
11
```

peek():

```java
2
```

---

# First Output

```java
System.out.println(queue.peek());
```

Output:

```text
2
```

---

# 7. Max Heap

Default PriorityQueue is:

```text
Min Heap
```

Sometimes we want:

```text
Largest element first
```

Example:

```text
11
2
1
```

This is called:

## Max Heap

---

# Lambda Comparator

Modern approach:

```java
Queue<Integer> maxPq =
        new PriorityQueue<>((a,b)->(b-a));
```

---

# Anonymous Comparator

Your code:

```java
Queue<Integer> maxPq =
    new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
```

Same thing.

---

# How Comparator Works

Comparator returns:

```text
Negative  -> o1 comes first
Positive  -> o2 comes first
Zero      -> equal
```

---

## Example

Comparing:

```java
compare(2,11)
```

Returns:

```java
11-2 = 9
```

Positive.

Therefore:

```text
11 before 2
```

---

Resulting heap:

```text
11
2
1
```

---

# Insertion

```java
maxPq.offer(2);
maxPq.offer(11);
maxPq.offer(1);
```

Heap becomes:

```text
      11
     /  \
    2    1
```

---

# peek()

```java
System.out.println(maxPq.peek());
```

Returns:

```text
11
```

Output:

```text
11
```

---

# Final Output

```text
2
11
```

---

# Min Heap vs Max Heap

## Min Heap

```java
PriorityQueue<Integer> pq =
    new PriorityQueue<>();
```

Removal order:

```text
1
2
5
8
10
```

---

## Max Heap

```java
PriorityQueue<Integer> pq =
    new PriorityQueue<>((a,b)->b-a);
```

Removal order:

```text
10
8
5
2
1
```

---

# Heap Visualization

Insert:

```java
10
5
20
3
```

Min Heap:

```text
        3
      /   \
     5    20
    /
   10
```

peek():

```text
3
```

---

# Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| offer()   | O(log n)   |
| poll()    | O(log n)   |
| peek()    | O(1)       |
| size()    | O(1)       |
| isEmpty() | O(1)       |

---

# Array vs Heap

Normal Queue:

```text
7 8 11 1
```

poll():

```text
7
```

---

Priority Queue:

```text
2 11 1
```

poll():

```text
1
```

Because priority matters.

---

# Sorting Using Priority Queue

```java
PriorityQueue<Integer> pq =
        new PriorityQueue<>();

pq.offer(5);
pq.offer(1);
pq.offer(10);

while(!pq.isEmpty()){
    System.out.print(pq.poll()+" ");
}
```

Output:

```text
1 5 10
```

---

# Custom Objects

Suppose:

```java
class Student {
    int rollNo;
    String name;
}
```

Sort by roll number:

```java
PriorityQueue<Student> pq =
    new PriorityQueue<>(
        (a,b) -> a.rollNo-b.rollNo
    );
```

---

Sort by highest roll number:

```java
PriorityQueue<Student> pq =
    new PriorityQueue<>(
        (a,b) -> b.rollNo-a.rollNo
    );
```

---

# Important Interview Questions

### 1. Kth Largest Element

Array:

```text
3 2 1 5 6 4
```

Find:

```text
2nd largest
```

Use Min Heap.

---

### 2. Top K Frequent Elements

LeetCode 347

Uses Priority Queue.

---

### 3. Merge K Sorted Lists

LeetCode 23

Uses Priority Queue.

---

### 4. Dijkstra Algorithm

Uses Min Heap.

---

### 5. Task Scheduler

Uses Max Heap.

---

# Practice Questions

## Q1

Print elements in ascending order.

### Answer

```java
PriorityQueue<Integer> pq =
        new PriorityQueue<>();

pq.offer(5);
pq.offer(1);
pq.offer(10);

while(!pq.isEmpty()){
    System.out.print(pq.poll()+" ");
}
```

Output:

```text
1 5 10
```

---

## Q2

Print elements in descending order.

### Answer

```java
PriorityQueue<Integer> pq =
        new PriorityQueue<>((a,b)->b-a);

pq.offer(5);
pq.offer(1);
pq.offer(10);

while(!pq.isEmpty()){
    System.out.print(pq.poll()+" ");
}
```

Output:

```text
10 5 1
```

---

## Q3

Find smallest element.

### Answer

```java
PriorityQueue<Integer> pq =
        new PriorityQueue<>();

pq.offer(10);
pq.offer(2);
pq.offer(7);

System.out.println(pq.peek());
```

Output:

```text
2
```

---

## Q4

Find largest element using Max Heap.

### Answer

```java
PriorityQueue<Integer> pq =
        new PriorityQueue<>((a,b)->b-a);

pq.offer(10);
pq.offer(2);
pq.offer(7);

System.out.println(pq.peek());
```

Output:

```text
10
```

---

## Q5

Store Students by increasing roll number.

### Answer

```java
PriorityQueue<Student> pq =
    new PriorityQueue<>(
        (a,b)->a.rollNo-b.rollNo
    );
```

---

# Collection Hierarchy So Far

```text
Collection
│
├── List
│   ├── ArrayList
│   ├── LinkedList
│   └── Vector
│        └── Stack
│
├── Queue
│   ├── LinkedList
│   ├── PriorityQueue
│   └── ArrayDeque
│
└── Set
    ├── HashSet
    ├── LinkedHashSet
    └── TreeSet
```

