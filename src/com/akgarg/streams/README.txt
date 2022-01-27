→ Streams are the java way to implement declarative programming paradigm.
→ Declarative programming focuses on what to do rather than how to do.
→ Stream is sequence of objects of a collection of data.
→ Streams heavily use functional interfaces for their functionality.

→ methods to create stream
    - from collections
    - from arrays
    - from objects
    - using stream interface methods like generate() or iterate()

→ Mapping values using stream:
    - map(Function<T, U>) method can be used to map value to specific value.
    - Returns the stream of U type from the V type data

→ We can filter the stream data using filter(Predicate<T>) method.

→ We can use limit(n) method to limit the length of stream. There are some more methods like skip(n), takeWhile(Predicate<T>), dropWhile(Predicate<T>).

→ We can get distinct data from stream using distinct() method.

→ We can convert a stream to specified type of object using Stream reducers. Some stream reducer methods provided are count(), toList(), collect(Collector.COLLECTION_TYPE), get(), reduce(BinaryOperator<T, U>) etc.

→ We can let our stream sort data according to provided logic using sorted() method. There is one overloaded version of sorted method which accepts a comparator argument.
