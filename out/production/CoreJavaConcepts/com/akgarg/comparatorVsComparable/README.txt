→ Both interfaces are used to compare two custom defined objects
→ Comparable is defined in java.lang package while Comparator is defined in java.util package.
→ Comparable has compareTo(Object o) method which returns int value. On the other hand, Comparator has compare(Object o1, Object o2) methods to compare objects.
    - returns negative value, if first object is smaller than other one.
    - returns zero, if both objects are equal.
    - returns positive value, if first object is greater than other one.
→ Comparator is more flexible than that of Comparable.
→ Comparable is used for default sorting while Comparator can be used to define comparison when we don't have access to source code of objects.
→ Comparable allow only one comparison strategy while comparator can be used to compare on the basis of multiple strategies.