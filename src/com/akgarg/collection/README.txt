→ Collection Framework is the group of interfaces and classes used to implement various Data Structures and algorithms set.
→ It provides ready-made classes for commonly used Data structures such as Array, Stack, LinkedList, Queue, Map etc.

→ Collection Framework Hierarchy:
  (All caps: Interface, UpperCamelCase: Class)

   ┌----------------------------------------------------------------------------------------------┐
   |                                                                                              |
   |        ITERABLE                                                                              |
   |           ↑                                                                                  |
   |       COLLECTION                                                                             |
   |           ↑                    ┌---------------- ArrayList                                   |
   |           |                    |                                                             |
   |           |-----------LIST ←-------------------- LinkedList                                  |
   |           |                    |                                                             |
   |           |                    └---------------- Vector ←--------- Stack                     |
   |           |                                                                                  |
   |           |                    ┌---------------- PriorityQueue                               |
   |           |                    |                                                             |
   |           |-----------QUEUE ←--|                         ┌--------- LinkedList               |
   |           |                    |                         |                                   |
   |           |                    └---------------- DEQUE ←-|                                   |
   |           |                                              |                                   |
   |           |                                              └--------- ArrayDeque               |
   |           |                                                                                  |
   |           |                                            ┌---------- HashSet                   |
   |           |                   ┌------------------------|                                     |
   |           |                   |                        └---------- LinkedHashSet             |
   |           └---------- SET ←---|                                                              |
   |                               |                                                              |
   |                               └----------------- SORTEDSET ←------ TreeSet                   |
   |                                                                                              |
   └----------------------------------------------------------------------------------------------┘

   ┌----------------------------------------------------------------------------------------------┐
   |                                                                                              |
   |         MAP                 ┌------------------ HashMap                                      |
   |          ↑                  |                                                                |
   |          └------------------|                                                                |
   |          |                  |                                                                |
   |          |                  └------------------ HashTable                                    |
   |          |                                                                                   |
   |          |                                                                                   |
   |          └------------- SORTEDMAP ←-------------- NAVIGABLEMAP ←---- TreeMap                 |
   |                                                                                              |
   └----------------------------------------------------------------------------------------------┘

→ Some methods of Iterable interface are:
    - iterator()
    - forEach(Consumer<T>)

→ Some methods of Collection interface
    - size()
    - isEmpty()
    - contains(obj)
    - toArray()
    - add(element)
    - remove(obj)
    - containsAll(collection)
    - addAll(collection)
    - removeAll(collection)
    - clear()
    - equals(obj)
    - stream()

→ Some methods of List interface
    - size()
    - addAll(index, collection)
    - sort(comparator)
    - get(index)
    - set(index, element)
    - add(index, element)
    - remove(index)
    - indexOf(object)
    - subList(fromIndex, toIndex)
    - of() -> static

→ Some methods of Queue interface
    - offer(element) -> same as add(element)
    - poll() -> same as remove(0)
    - element() -> same as get(0) with NoSuchElementException
    - peek() -> same as get(0) without exception

→ Some methods of Set interface
    - same as Collection interface, no new method declared

→ Some methods of Map interface
    - containsKey(key)
    - containsValue(value)
    - get(key)
    - put(key, value)
    - remove(key)
    - putAll(map)
    - keySet()
    - values()
    - entrySet()
    - getOrDefault(key, defaultValue)
    - forEach(biConsumer)
    - remove(key, value)
    - replace(key, oldValue, newValue)
    - replace(key, value)