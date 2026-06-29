Excellent! You're now learning **Deque (Double Ended Queue)**, one of the most versatile data structures in Java.

Many modern Java developers use **ArrayDeque** instead of both **Stack** and **LinkedList Queue** because it's faster and more efficient.

---

# 1. What is a Deque?

Deque stands for:

```text
Double Ended Queue
```

Pronounced:

```text
"Deck"
```

A Deque allows insertion and deletion from **both ends**.

---

## Normal Queue

Only:

```text
Insert -> Rear
Delete -> Front
```

```text
Front         Rear
  ↓             ↓
[1] [2] [3] [4]
```

---

## Deque

```text
Insert/Delete
     ↑
Front
  ↓
[1] [2] [3] [4]
  ↑
Rear
     ↓
Insert/Delete
```

Both ends are open.

---

# 2. Creating a Deque

```java
Deque<Integer> deque = new ArrayDeque<>();
```

Interface:

```java
Deque
```

Implementation:

```java
ArrayDeque
```

Recommended by Java over:

```java
Stack
LinkedList
```

for stack/queue operations.

---

# 3. Dry Run of Your Program

Initially:

```text
[]
```

---

## offer(1)

```java
deque.offer(1);
```

Equivalent to:

```java
deque.offerLast(1);
```

Deque:

```text
[1]
```

---

## offer(2)

```java
deque.offer(2);
```

```text
[1,2]
```

---

## offerFirst(10)

```java
deque.offerFirst(10);
```

Add at front.

```text
[10,1,2]
```

---

## offerLast(9)

```java
deque.offerLast(9);
```

```text
[10,1,2,9]
```

---

## pollFirst()

```java
deque.pollFirst();
```

Removes:

```text
10
```

Result:

```text
[1,2,9]
```

---

## poll()

```java
deque.poll();
```

Equivalent to:

```java
deque.pollFirst();
```

Removes:

```text
1
```

Result:

```text
[2,9]
```

---

## pollLast()

```java
deque.pollLast();
```

Removes:

```text
9
```

Result:

```text
[2]
```

---

## offer(11)

```java
deque.offer(11);
```

```text
[2,11]
```

---

## offer(21)

```java
deque.offer(21);
```

```text
[2,11,21]
```

---

## offerFirst(101)

```java
deque.offerFirst(101);
```

```text
[101,2,11,21]
```

---

## offerLast(91)

```java
deque.offerLast(91);
```

```text
[101,2,11,21,91]
```

---

# Final Deque

```text
[101,2,11,21,91]
```

---

# Output 1

```java
System.out.println(deque);
```

Output:

```text
[101, 2, 11, 21, 91]
```

---

# peek()

```java
System.out.println(deque.peek());
```

Equivalent to:

```java
deque.peekFirst();
```

Returns:

```text
101
```

Output:

```text
101
```

---

# peekFirst()

```java
System.out.println(deque.peekFirst());
```

Output:

```text
101
```

---

# peekLast()

```java
System.out.println(deque.peekLast());
```

Output:

```text
91
```

---

# Enhanced For Loop

```java
for(Integer element : deque)
```

Traversal:

```text
Front → Rear
```

Output:

```text
101 2 11 21 91
```

---

# Complete Output

```text
[101, 2, 11, 21, 91]
101
101
91
101 2 11 21 91
```

---

# Important Deque Methods

## Insert

### Front

```java
deque.offerFirst(10);
```

### Rear

```java
deque.offerLast(20);
```

or

```java
deque.offer(20);
```

---

# Delete

### Front

```java
deque.pollFirst();
```

or

```java
deque.poll();
```

---

### Rear

```java
deque.pollLast();
```

---

# View Elements

### Front

```java
deque.peek();
deque.peekFirst();
```

---

### Rear

```java
deque.peekLast();
```

---

# Deque as Queue

```java
Deque<Integer> dq = new ArrayDeque<>();

dq.offer(1);
dq.offer(2);

dq.poll();
```

Behavior:

```text
FIFO
```

---

# Deque as Stack

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);

stack.pop();
```

Behavior:

```text
LIFO
```

Example:

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(1);
stack.push(2);
stack.push(3);

System.out.println(stack.pop());
```

Output:

```text
3
```

---

# Why ArrayDeque is Preferred

Older Stack:

```java
Stack<Integer> stack = new Stack<>();
```

Problems:

* Legacy class
* Thread-safe (extra overhead)
* Slower

---

Modern:

```java
Deque<Integer> stack = new ArrayDeque<>();
```

Benefits:

✔ Faster

✔ Less memory

✔ Better performance

✔ Recommended by Oracle

---

# Internal Working

ArrayDeque uses:

```text
Resizable Circular Array
```

Not Linked List.

Example:

```text
Index:
0 1 2 3 4 5

[ ][ ][1][2][3][ ]
      ↑     ↑
    Front Rear
```

When front/rear reaches the end:

```text
Circularly wraps around
```

Hence:

```text
O(1)
```

for insertion/deletion at both ends.

---

# Time Complexity

| Operation    | Complexity |
| ------------ | ---------- |
| offerFirst() | O(1)       |
| offerLast()  | O(1)       |
| pollFirst()  | O(1)       |
| pollLast()   | O(1)       |
| peekFirst()  | O(1)       |
| peekLast()   | O(1)       |

---

# Queue vs Deque vs Stack

| Feature      | Queue | Stack | Deque |
| ------------ | ----- | ----- | ----- |
| FIFO         | ✅     | ❌     | ✅     |
| LIFO         | ❌     | ✅     | ✅     |
| Insert Front | ❌     | ❌     | ✅     |
| Insert Rear  | ✅     | ❌     | ✅     |
| Remove Front | ✅     | ❌     | ✅     |
| Remove Rear  | ❌     | ✅     | ✅     |

Deque can behave as both Queue and Stack.

---

# Real-World Uses

### Browser History

Back and Forward buttons.

### Sliding Window Maximum

Common interview problem.

### Undo/Redo Systems

Editors and IDEs.

### Task Scheduling

OS scheduling.

### LRU Cache

Frequently asked in interviews.

### Monotonic Queue

Used in advanced DSA.

---

# Practice Questions

### Q1. Use Deque as Stack

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);

System.out.println(stack.pop());
```

Output:

```text
20
```

---

### Q2. Use Deque as Queue

```java
Deque<Integer> q = new ArrayDeque<>();

q.offer(10);
q.offer(20);

System.out.println(q.poll());
```

Output:

```text
10
```

---

### Q3. Print Front and Rear

```java
Deque<Integer> dq = new ArrayDeque<>();

dq.offer(1);
dq.offer(2);
dq.offer(3);

System.out.println(dq.peekFirst());
System.out.println(dq.peekLast());
```

Output:

```text
1
3
```

---

### Q4. Reverse Elements Using Deque

```java
Deque<Integer> dq = new ArrayDeque<>();

dq.offerLast(1);
dq.offerLast(2);
dq.offerLast(3);

while(!dq.isEmpty()){
    System.out.print(dq.pollLast()+" ");
}
```

Output:

```text
3 2 1
```

---

### Q5. Check Palindrome Using Deque

Input:

```text
MADAM
```

Logic:

* Compare first and last characters.
* Remove both.
* Continue until empty.

This is a classic Deque interview question.

---

## Collection Hierarchy Covered So Far

```text
Collection
│
├── List
│   ├── ArrayList
│   ├── LinkedList
│   └── Stack (via Vector)
│
├── Queue
│   ├── LinkedList
│   ├── PriorityQueue
│   └── Deque
│        └── ArrayDeque
│
└── Set
    ├── HashSet
    ├── LinkedHashSet
    └── TreeSet
```

