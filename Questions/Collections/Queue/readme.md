This code introduces the **Queue** data structure in Java.

A Queue is one of the most important data structures and is heavily used in:

* Task Scheduling
* CPU Scheduling
* BFS (Breadth First Search)
* Message Queues
* Printer Queues
* Microservices
* Kafka/RabbitMQ concepts

---

# 1. What is a Queue?

Queue follows:

## FIFO (First In First Out)

The element inserted first is removed first.

### Real-Life Example

Imagine people standing in a ticket queue:

```text
Front                 Rear

[7] [8] [11] [1]
```

Person 7 came first.

Therefore person 7 leaves first.

---

# 2. Queue Interface

```java
Queue<Integer> queue = new LinkedList<>();
```

Here:

```text
Queue
  ↑
LinkedList
```

* Queue is an interface.
* LinkedList implements Queue.

This is called:

### Interface Reference

```java
Queue<Integer> queue
```

### Implementation Object

```java
new LinkedList<>()
```

---

# 3. offer()

Adds an element at the rear of the queue.

```java
queue.offer(7);
```

Queue:

```text
Front Rear
  |
 [7]
```

---

```java
queue.offer(8);
```

```text
Front      Rear
  |          |
 [7] -> [8]
```

---

```java
queue.offer(11);
```

```text
[7] -> [8] -> [11]
```

---

```java
queue.offer(1);
```

```text
[7] -> [8] -> [11] -> [1]
```

---

# 4. poll()

Removes the front element.

```java
queue.poll();
```

Before:

```text
Front
 |
 7 -> 8 -> 11 -> 1
```

After:

```text
Front
 |
 8 -> 11 -> 1
```

Removed:

```text
7
```

---

## Difference Between poll() and remove()

### poll()

```java
queue.poll();
```

If queue is empty:

```java
null
```

is returned.

---

### remove()

```java
queue.remove();
```

If queue is empty:

```java
NoSuchElementException
```

is thrown.

---

# 5. peek()

Returns the front element without removing it.

```java
System.out.println(queue.peek());
```

Current queue:

```text
8 -> 11 -> 1
```

Output:

```text
8
```

Queue remains unchanged.

---

## Difference Between peek() and poll()

### peek()

```java
queue.peek();
```

Returns:

```text
8
```

Queue:

```text
8 -> 11 -> 1
```

unchanged.

---

### poll()

```java
queue.poll();
```

Returns:

```text
8
```

Queue becomes:

```text
11 -> 1
```

---

# 6. Enhanced For Loop

```java
for(Integer element : queue)
```

Traverses queue from:

```text
Front → Rear
```

Output:

```text
8 11 1
```

---

# Complete Dry Run

## Initial Queue

```text
[]
```

---

### offer(7)

```text
[7]
```

---

### offer(8)

```text
[7, 8]
```

---

### offer(11)

```text
[7, 8, 11]
```

---

### offer(1)

```text
[7, 8, 11, 1]
```

---

### poll()

Removes:

```text
7
```

Queue:

```text
[8, 11, 1]
```

---

### peek()

Returns:

```text
8
```

---

### for loop

Prints:

```text
8 11 1
```

---

# Final Output

```text
8
8 11 1
```

---

# Queue Methods

| Method     | Purpose            |
| ---------- | ------------------ |
| offer()    | Insert             |
| poll()     | Remove             |
| peek()     | View front         |
| isEmpty()  | Check empty        |
| size()     | Number of elements |
| contains() | Search element     |

---

## Example

```java
Queue<Integer> q = new LinkedList<>();

q.offer(10);
q.offer(20);

System.out.println(q.peek());
System.out.println(q.size());
System.out.println(q.contains(20));
```

Output:

```text
10
2
true
```

---

# Queue Internal Structure

Using LinkedList:

```java
Queue<Integer> q = new LinkedList<>();
```

Internally:

```text
Front
 |
[7] -> [8] -> [11] -> [1]
                        |
                      Rear
```

Insertion:

```text
Rear
```

Removal:

```text
Front
```

---

# Time Complexity

For LinkedList Queue:

| Operation | Complexity |
| --------- | ---------- |
| offer()   | O(1)       |
| poll()    | O(1)       |
| peek()    | O(1)       |
| size()    | O(1)       |
| search    | O(n)       |

---

# Queue vs Stack

| Queue                        | Stack                       |
| ---------------------------- | --------------------------- |
| FIFO                         | LIFO                        |
| First inserted removed first | Last inserted removed first |
| offer()                      | push()                      |
| poll()                       | pop()                       |
| peek()                       | peek()                      |

Example:

Queue:

```text
7 8 11 1
↑
Removed
```

Stack:

```text
7
8
11
1
↑
Removed
```

---

# Modern Queue Implementation

Although your code uses:

```java
Queue<Integer> queue = new LinkedList<>();
```

In interviews and production code, Java recommends:

```java
Queue<Integer> queue = new ArrayDeque<>();
```

Example:

```java
Queue<Integer> queue = new ArrayDeque<>();

queue.offer(10);
queue.offer(20);

System.out.println(queue.poll());
```

Why?

* Faster
* Less memory overhead
* No node creation
* Better cache performance

---

# Queue Applications

## 1. BFS Traversal

In Trees and Graphs

```text
Level Order Traversal
```

Uses Queue.

---

## 2. CPU Scheduling

Processes wait in queue.

```text
P1
P2
P3
```

---

## 3. Printer Queue

```text
Doc1
Doc2
Doc3
```

First document prints first.

---

## 4. Ticket Booking Systems

Users wait in queue.

---

## 5. Message Brokers

* Apache Kafka
* RabbitMQ
* AWS SQS

All rely on queue concepts.

---

# Practice Questions

### Q1. Print Queue Size

```java
Queue<Integer> q = new LinkedList<>();

q.offer(1);
q.offer(2);
q.offer(3);

System.out.println(q.size());
```

Output:

```text
3
```

---

### Q2. Remove All Elements

```java
while(!q.isEmpty()){
    System.out.println(q.poll());
}
```

Output:

```text
1
2
3
```

---

### Q3. Find Front Element

```java
System.out.println(q.peek());
```

---

### Q4. Check Queue Empty

```java
System.out.println(q.isEmpty());
```

Output:

```text
true
```

or

```text
false
```

---

### Q5. Reverse a Queue

```java
Queue<Integer> q = new LinkedList<>();
Stack<Integer> stack = new Stack<>();

while(!q.isEmpty()){
    stack.push(q.poll());
}

while(!stack.isEmpty()){
    q.offer(stack.pop());
}
```

Input:

```text
1 2 3 4
```

Output:

```text
4 3 2 1
```

---

# Interview Questions

1. Difference between `offer()` and `add()`?
2. Difference between `poll()` and `remove()`?
3. Difference between `peek()` and `element()`?
4. Why is Queue FIFO?
5. Why is `ArrayDeque` preferred over `LinkedList`?
6. Implement Queue using two Stacks.
7. Implement Stack using two Queues.
8. How is Queue used in BFS?

These Queue concepts form the foundation for **BFS, graph algorithms, operating systems scheduling, messaging systems, and distributed systems**, making them extremely important for Java developers and DevOps/Cloud engineers.
