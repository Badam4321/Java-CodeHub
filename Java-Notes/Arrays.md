**Java Arrays Class**

The `Arrays` class in the `java.util` package is an essential utility class for array manipulation in Java. It provides static methods to perform various operations such as sorting, searching, comparing, and converting arrays. Unlike collections, this class works directly with native Java arrays. Since all methods are static, they can be invoked directly using the class name.

---

### Example: Demonstrating `equals()` and `toString()` Methods

```java
// Java program to demonstrate Arrays class
import java.util.Arrays;

class GfG {
    public static void main(String[] args) {
        // Declare and initialize arrays
        int[] a = { 10, 20, 30 };
        int[] b = { 10, 20, 30 };

        // Compare arrays
        System.out.println(Arrays.equals(a, b));  // Output: true

        // Convert array to string
        System.out.println(Arrays.toString(a));   // Output: [10, 20, 30]
    }
}
```

**Output:**

```
true
[10, 20, 30]
```

---

### Important Methods of Arrays Class

#### 1. `asList()`

Converts an array to a fixed-size list backed by the original array.

```java
String[] fruits = {"Apple", "Banana", "Mango"};
List<String> list = Arrays.asList(fruits);
```

#### 2. `binarySearch(array, key)`

Performs binary search on a sorted array to find the specified element.

```java
int[] arr = {10, 20, 30, 40, 50};
int index = Arrays.binarySearch(arr, 30);  // Output: 2
```

#### 3. `equals(array1, array2)`

Checks if two arrays are equal in length and content.

```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
System.out.println(Arrays.equals(a, b));  // Output: true
```

#### 4. `mismatch(array1, array2)`

Returns the index of the first differing element or -1 if identical.

```java
int[] a = {10, 20, 30, 40};
int[] b = {10, 20, 30};
int mismatchIndex = Arrays.mismatch(a, b);
System.out.println("Mismatch at index: " + mismatchIndex);  // Output: 3
```

#### 5. `compare(array1, array2)`

Lexicographically compares two arrays.

```java
int[] a = {10, 20, 40};
int[] b = {10, 20, 30};
System.out.println(Arrays.compare(a, b));  // Output: positive integer
```

#### 6. `fill(array, value)`

Fills all elements of the array with a specified value.

```java
int[] a = new int[5];
Arrays.fill(a, 7);  // All elements will be 7
```

#### 7. `sort(array)`

Sorts the array in ascending order.

```java
int[] arr = {5, 2, 8, 1};
Arrays.sort(arr);  // arr becomes [1, 2, 5, 8]
```

#### 8. `stream(array)`

Converts an array into a sequential stream for functional-style operations.

```java
int[] arr = {1, 2, 3};
Arrays.stream(arr).forEach(System.out::println);
```

#### 9. `toString(array)`

Returns a string representation of the array.

```java
int[] arr = {1, 2, 3};
System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3]
```

---


#### 1. Introduction

The `java.util.Arrays` class in Java provides a collection of static methods for manipulating arrays. These methods support operations such as searching, comparing, converting, and transforming arrays of both primitive and non-primitive types. This document covers the following key methods: `binarySearch`, `equals`, `mismatch`, `compare`, `toString`, `asList`, and `fill`. Each section includes method signatures, parameters, return values, important notes, and example code with outputs.

---

### ... (Sections 2 through 7 as extracted above) ...

---

### 8 Arrays.fill()

#### 8.1 Description

The `fill()` method is used to initialize or reset arrays with a specific value. It is available in both `Arrays` (for arrays) and `Collections` (for lists implementing `List` interface like `ArrayList`, `Vector`, etc.).

#### 8.2 Method Signatures

##### Arrays Class:

```java
static void fill(int[] a, int val)
static void fill(int[] a, int fromIndex, int toIndex, int val)
static void fill(Object[] a, Object val)
static void fill(Object[] a, int fromIndex, int toIndex, Object val)
```

##### Collections Class:

```java
static <T> void fill(List<? super T> list, T obj)
```

---

#### 8.3 Examples

**Example 1: Fill entire array**

```java
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        Arrays.fill(arr, -1);
        System.out.println(Arrays.toString(arr));
    }
}
```

**Output:**
`[-1, -1, -1, -1]`

---

**Example 2: Fill part of the array**

```java
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        Arrays.fill(arr, 1, 3, -1);
        System.out.println(Arrays.toString(arr));
    }
}
```

**Output:**
`[10, -1, -1, 40]`

---

**Example 3: Fill 2D array**

```java
import java.util.Arrays;

class GfG {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        for (int[] row : arr) {
            Arrays.fill(row, 1);
            System.out.print(Arrays.toString(row));
        }
    }
}
```

**Output:**
`[1, 1, 1, 1][1, 1, 1, 1][1, 1, 1, 1]`

---

**Example 4: Fill a List using Collections.fill()**

```java
import java.util.*;

class GfG {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        Collections.fill(list, -1);
        System.out.println(list);
    }
}
```

**Output:**
`[-1, -1, -1, -1]`

---

## **binary search in java**
Arrays.binarySearch() is the simplest and most efficient method to find an element in a sorted array in Java. This is different from Collections.binarySearch() as Arrays.binarySearch() works for arrays, which can be of primitive data types, while Collections.binarySearch() works for objects in collections like ArrayList and LinkedList.

1 . `binarySearch()` used in **Arrays**

**different method signature**
* Arrays.binarySearch(int[] a, int key)
* Arrays.binarySearch(int[] a, int fromIndex, int toIndex, int key)

```java
class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(arr, 3);
        int index2 = Arrays.binarySearch(arr, 0, 3, 3);
        System.out.println(index);
    }
}
```

---
**Time Complexity**: O(log n)<br>
**space complexity**: O(1)
---


2 . `binarySearch()` used in **Collections**

**different method signature**
* Collections.binarySearch(List<? extends Comparable<? super E>> list, E key)
* Collections.binarySearch(List<? extends Comparable<? super E>> list, E key, Comparator<? super E> c)

```java
class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int index = Collections.binarySearch(list, 3);
        int index2 = Collections.binarySearch(list, 3, Comparator.naturalOrder());
        System.out.println(index);
    }
}
```
---
**Time Complexity**: O(log n)<br>
**space complexity**: O(1)
---

## **Arrays.equals() in java**

The Arrays.equals() method is used to check whether two arrays are equal or not. Two arrays are considered equal if both arrays contain the same number of elements and all corresponding pairs of elements in the two arrays are equal. In other words, two arrays are equal if they contain the same elements in the same order. Additionally, two array references are considered equal if both are null.

** Arrays.equals() Method:**

```text
public static boolean equals(byte[] a, byte[] a2)
public static boolean equals(short[] a, short[] a2)
public static boolean equals(long[] a, long[] a2)
public static boolean equals(float[] a, float[] a2)
public static boolean equals(double[] a, double[] a2)
public static boolean equals(char[] a, char[] a2)
public static boolean equals(boolean[] a, boolean[] a2)
public static boolean equals(Object[] a, Object[] a2)
public static boolean equals(int[] a, int[] a2)
public static boolean equals(Object[] a, Object[] a2)

public static boolean equals(byte[] a, int a2, int a3, byte[] a4, int a5, int a6)
public static boolean equals(short[] a, int a2, int a3, short[] a4, int a5, int a6)
public static boolean equals(long[] a, int a2, int a3, long[] a4, int a5, int a6)
public static boolean equals(float[] a, int a2, int a3, float[] a4, int a5, int a6)
public static boolean equals(double[] a, int a2, int a3, double[] a4, int a5, int a6)
public static boolean equals(char[] a, int a2, int a3, char[] a4, int a5, int a6)
public static boolean equals(boolean[] a, int a2, int a3, boolean[] a4, int a5, int a6)
public static boolean equals(Object[] a, int a2, int a3, Object[] a4, int a5, int a6)
public static boolean equals(int[] a, int a2, int a3, int[] a4, int a5, int a6)

public static boolean equals(List<?> a, List<?> a2)
public static boolean equals(Collection<?> a, Collection<?> a2)
public static boolean equals(Set<?> a, Set<?> a2)
public static boolean equals(Map<?, ?> a, Map<?, ?> a2)
```

**Example usage for primitive arrays:**
```java
class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        int[] arr4 = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};
        int[] arr5 = {5 , 10 , 30 , 40 , 50 , 55 , 60 , 70 , 80 , 90 , 100};
        boolean result = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);
        boolean result3 = Arrays.equals(arr4,2 , 5 , arr5 , 2 , 4);
        System.out.println(result);
        System.out.println(result2);
    }
}
```

Example usage for Non-primitive arrays:

```java
class Main {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"a", "b", "c"};
        String[] arr3 = {"a", "b", "c", "d"};
        boolean result = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);
        System.out.println(result);
        System.out.println(result2);
    }
}

```

## Arrays.mismatch() in java

The Arrays.mismatch() method is used to find the index of the first element that is different between two arrays. If all elements are the same, the method returns -1.

**versions of the mismatch() method:**

```text
int mismatch(a[], b[]): Matches two arrays of primitive types.
int mismatch(a[], aStart, aEnd, b[], bStart, bEnd): Matches subarrays within two arrays of primitive types. The start index is inclusive, and the end index is exclusive.
int mismatch(a[], b[], Comparator): Matches two arrays of non-primitive types or uses a user-defined Comparator for generic types.
int mismatch(a[], aStart, aEnd, b[], bStart, bEnd, Comparator): Matches subarrays within two arrays of non-primitive types or uses a user-defined Comparator. The start index is inclusive, and the end index is exclusive.
```

```java

class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        int[] arr3 = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};
        int[] arr4 = {5 , 10 , 30 , 40 , 50 , 55 , 60 , 70 , 80 , 90 , 100};
        int result = Arrays.mismatch(arr1, arr2);
        int result2 = Arrays.mismatch(arr3 , 2 , 5 , arr4 , 2 , 4);
        System.out.println(result);
        System.out.println(result2);
    }   
}
````

## Arrays.compare() in java

The Arrays.compare() method is used to compare two arrays lexicographically. It returns a positive integer, negative integer, or zero based on the comparison result.

versions of the compare() method:
```text

int compare(a[], b[]): Compares two arrays of primitive types.
int compare(a[], aStart, aEnd, b[], bStart, bEnd): Compares subarrays within two arrays of primitive types. The start index is inclusive, and the end index is exclusive.
int compare(a[], b[], Comparator): Compares two arrays of non-primitive types or uses a user-defined Comparator for generic types.  
```

```java

class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        int[] arr3 = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};
        int[] arr4 = {5 , 10 , 30 , 40 , 50 , 55 , 60 , 70 , 80 , 90 , 100};
        int result = Arrays.compare(arr1, arr2);
        int result2 = Arrays.compare(arr3 , 2 , 5 , arr4 , 2 , 4);
        System.out.println(result);
        System.out.println(result2);
    }
}
```











