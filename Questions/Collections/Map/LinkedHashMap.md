Excellent! Since you've already learned **HashMap**, understanding **LinkedHashMap** becomes very easy.

The key difference is:

| Map Type      | Ordering                    |
| ------------- | --------------------------- |
| HashMap       | ❌ No order guarantee        |
| LinkedHashMap | ✅ Maintains insertion order |
| TreeMap       | ✅ Sorted by keys            |

---

# 1. What is LinkedHashMap?

`LinkedHashMap` is a Map implementation that:

✅ Stores key-value pairs

✅ Maintains insertion order

✅ Allows one null key

✅ Allows multiple null values

❌ Duplicate keys not allowed

---

## Example

```java
Map<Integer,String> map = new LinkedHashMap<>();

map.put(2,"Shikhar");
map.put(1,"Shashwat");
map.put(7,"Rajesh");
```

Output:

```text
2 -> Shikhar
1 -> Shashwat
7 -> Rajesh
```

Notice:

The order is exactly the same as insertion order.

---

# 2. Internal Working

HashMap internally:

```text
Hash Table
```

LinkedHashMap internally:

```text
Hash Table
      +
Doubly Linked List
```

Visualization:

```text
Hash Table

2 -> Shikhar
1 -> Shashwat
7 -> Rajesh
17 -> Dinesh

Linked List:

2 <-> 1 <-> 7 <-> 17
```

The linked list remembers insertion order.

---

# 3. Dry Run of Your Program

## Step 1

```java
map.put(2,"shikhar");
map.put(1,"shashwat");
map.put(7,"rajesh");
map.put(17,"dinesh");
```

Map:

```text
2  -> shikhar
1  -> shashwat
7  -> rajesh
17 -> dinesh
```

Insertion order preserved.

---

# 4. containsKey()

```java
System.out.println(map.containsKey(19));
```

Key 19 doesn't exist.

Output:

```text
false
```

---

# 5. containsValue()

```java
System.out.println(
        map.containsValue("shashwat")
);
```

Value exists.

Output:

```text
true
```

---

# 6. get()

```java
map.get(17)
```

Returns:

```text
dinesh
```

---

## Update Existing Value

```java
String fullName =
        map.get(17) + " pandit";

map.put(17, fullName);
```

Map becomes:

```text
17 -> dinesh pandit
```

Important:

Updating a value does NOT change insertion order.

---

# 7. getOrDefault()

```java
String defaultName =
    map.getOrDefault(90,"Rahul");
```

Key 90 doesn't exist.

Returns:

```text
Rahul
```

Then:

```java
defaultName + " tiwari"
```

becomes:

```text
Rahul tiwari
```

Store:

```java
map.put(90, defaultName);
```

Map:

```text
2  -> shikhar
1  -> shashwat
7  -> rajesh
17 -> dinesh pandit
90 -> Rahul tiwari
```

Notice:

90 is added at the end.

---

# 8. entrySet()

```java
for(Map.Entry<Integer,String> entry
        : map.entrySet())
```

Prints entries in insertion order.

Output:

```text
2 -> shikhar
1 -> shashwat
7 -> rajesh
17 -> dinesh pandit
90 -> Rahul tiwari
```

---

# Complete Output

```text
false
true
2 -> shikhar
1 -> shashwat
7 -> rajesh
17 -> dinesh pandit
90 -> Rahul tiwari
```

---

# Why LinkedHashMap Exists?

Suppose you're storing:

```text
User Login History
```

Order matters.

Example:

```text
1st login -> Aman
2nd login -> Rahul
3rd login -> Raj
```

HashMap:

```text
Random order
```

LinkedHashMap:

```text
Original insertion order
```

Perfect choice.

---

# Common Methods

## put()

```java
map.put(1,"Java");
```

Insert or update.

---

## get()

```java
map.get(1);
```

Retrieve value.

---

## getOrDefault()

```java
map.getOrDefault(100,"Unknown");
```

---

## containsKey()

```java
map.containsKey(1);
```

---

## containsValue()

```java
map.containsValue("Java");
```

---

## remove()

```java
map.remove(1);
```

---

## size()

```java
map.size();
```

---

## clear()

```java
map.clear();
```

---

# HashMap vs LinkedHashMap

## HashMap

```java
Map<Integer,String> map =
        new HashMap<>();
```

Output order:

```text
Random
```

Example:

```text
17 -> dinesh
2 -> shikhar
1 -> shashwat
7 -> rajesh
```

---

## LinkedHashMap

```java
Map<Integer,String> map =
        new LinkedHashMap<>();
```

Output:

```text
2 -> shikhar
1 -> shashwat
7 -> rajesh
17 -> dinesh
```

Insertion order preserved.

---

# Time Complexity

| Operation     | Complexity |
| ------------- | ---------- |
| put()         | O(1)       |
| get()         | O(1)       |
| remove()      | O(1)       |
| containsKey() | O(1)       |

Same performance as HashMap.

---

# Access Order LinkedHashMap

Advanced Interview Topic ⭐

Normally:

```java
LinkedHashMap
```

maintains insertion order.

But it can also maintain:

```text
Access Order
```

Example:

```java
LinkedHashMap<Integer,String> map =
    new LinkedHashMap<>(16,0.75f,true);
```

Notice:

```java
true
```

means:

```text
Access Order
```

---

Example:

```java
map.put(1,"A");
map.put(2,"B");
map.put(3,"C");

map.get(1);
```

Order becomes:

```text
2 -> 3 -> 1
```

because key 1 was accessed recently.

---

# LRU Cache

Most famous use of LinkedHashMap.

### LRU

```text
Least Recently Used Cache
```

Used in:

* Browsers
* Databases
* Redis
* Operating Systems

Interviewers often ask:

> Why is LinkedHashMap used for LRU Cache?

Answer:

Because it can maintain access order automatically.

---

# Practice Questions

## Q1. Print Keys in Insertion Order

```java
LinkedHashMap<Integer,String> map =
        new LinkedHashMap<>();

map.put(2,"B");
map.put(1,"A");
map.put(3,"C");

for(Integer key : map.keySet()){
    System.out.println(key);
}
```

Output:

```text
2
1
3
```

---

## Q2. Count Frequency

```java
String str = "aabbca";

Map<Character,Integer> freq =
        new LinkedHashMap<>();

for(char ch : str.toCharArray()){
    freq.put(
            ch,
            freq.getOrDefault(ch,0)+1
    );
}

System.out.println(freq);
```

Output:

```text
{a=3, b=2, c=1}
```

Order preserved.

---

## Q3. Remove Entry

```java
map.remove(2);
```

---

## Q4. Check Key Exists

```java
System.out.println(
        map.containsKey(1)
);
```

---

## Q5. Iterate Using entrySet()

```java
for(Map.Entry<Integer,String> e :
        map.entrySet()){
    System.out.println(
            e.getKey() +
            " -> " +
            e.getValue()
    );
}
```

---

# HashMap vs LinkedHashMap vs TreeMap

| Feature          | HashMap    | LinkedHashMap                   | TreeMap        |
| ---------------- | ---------- | ------------------------------- | -------------- |
| Duplicate Keys   | ❌          | ❌                               | ❌              |
| Duplicate Values | ✅          | ✅                               | ✅              |
| Ordering         | ❌          | Insertion Order                 | Sorted Keys    |
| put()            | O(1)       | O(1)                            | O(log n)       |
| get()            | O(1)       | O(1)                            | O(log n)       |
| Internal DS      | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree |

Example Input:

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
