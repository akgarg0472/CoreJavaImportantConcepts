→ Lambdas in java is the way to implement functional programming.
→ Lambdas are used with functional interface. Functional interface is the interface having only one abstract method.
→ We can create a class to implement the abstract method of functional interface, but sometimes we didn't want to create a class, rather we prefer to create anonymous class to implement such interfaces. Here comes the use of lambdas.

→ Java has four types of functional interfaces:
    - Consumer -> void consume(obj) {}
    - Supplier -> obj supply() {}
    - Function -> obj map(obj) {}
    - Predicate -> boolean test(condition) {}

→ Consumer interface:
    - Used to consume value
    - It has two methods: One abstract method and one default method
    - void accept(T t) {}
    - default Consumer<T> andThen(Consumer<? super T> after) {}
    - We can chain the execution of consumers using the default method

→ Supplier interface:
    - Used to supply (generate) value
    - It has one method.
    - T get() {}

→ Function interface:
    - Takes one argument and produces a result of other (or same) type.
    - It has four methods: One abstract method, two default methods and one static method
    - R apply(T t) {}
    - default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {}
    - default <V> Function <V, R> compose(Function <? super V, ? extends T> before) {}
    - static <T> function<T, T> identity() {}
    - We also have some primitive values specific Function interfaces. Refer official docs for more!!

→ Filter interface:
    - Used to test expressions
    - It has one single abstract method.
    - boolean test(T t) {}
    - There are few more implementations like BiPredicate<T, U>, IntPredicate etc.