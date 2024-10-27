package Java8codes.optionalclass;

import java.util.Optional;

// java developers familiar with NullPointException
//java 8 introduced a new optional utility class in java.util package
//this class helps in avoiding null checks and NullPointerException exceptions
//it is a final class we can extend it
//is Gives static non-static and concrete methods
/*
static:
1) empty()
Returns an empty Optional instance.
*/
/*
* In Java, `.isEmpty()` is commonly used on collections, strings, or arrays to check if they contain any elements or characters. Here are some specific cases:

1. **Strings**: To verify if a string has no characters.
   ```java
   String str = "";
   if (str.isEmpty()) {
       System.out.println("String is empty");
   }
   ```

2. **Collections**: To check if a collection (like `List`, `Set`, `Map`) has no elements.
   ```java
   List<String> list = new ArrayList<>();
   if (list.isEmpty()) {
       System.out.println("List is empty");
   }
   ```

3. **Optional**: To check if an `Optional` is empty or has a value.
   ```java
   Optional<String> optionalValue = Optional.empty();
   if (optionalValue.isEmpty()) {
       System.out.println("Optional is empty");
   }
   ```

### When to Use `.isEmpty()` vs. `size() == 0`

- **Prefer `.isEmpty()`** because it’s more readable and clearly conveys the intent of checking for emptiness.
- **Performance**: `.isEmpty()` may be optimized for certain collections, while `size()` could potentially iterate over the elements in some implementations.
* */


/*In Java, `.of()` is used in several classes to create instances, especially for immutable objects. Here’s a breakdown of some common situations where `.of()` is used:

1. **Creating Immutable Collections** (Java 9+):
   - The `List.of()`, `Set.of()`, and `Map.of()` methods are used to create immutable collections with a fixed set of elements.
   - These collections do not allow `null` values and throw `UnsupportedOperationException` if modified.

   ```java
   List<String> fruits = List.of("Apple", "Banana", "Cherry");
   Set<String> colors = Set.of("Red", "Green", "Blue");
   Map<String, Integer> scores = Map.of("Alice", 90, "Bob", 85);
   ```

2. **Optional.of()**:
   - `Optional.of()` is used to create an `Optional` instance containing a non-null value.
   - It throws a `NullPointerException` if the argument is `null`. If the value could be `null`, use `Optional.ofNullable()`.

   ```java
   Optional<String> name = Optional.of("John");  // Non-null value
   ```

3. **Stream.of()**:
   - `Stream.of()` creates a stream from a specified set of values. This is useful for quickly creating a stream for processing.

   ```java
   Stream<String> stream = Stream.of("A", "B", "C");
   ```

4. **LocalDate, LocalTime, LocalDateTime** (Java 8+):
   - `LocalDate.of()`, `LocalTime.of()`, and `LocalDateTime.of()` are used to create date and time instances for specific values.

   ```java
   LocalDate date = LocalDate.of(2024, 10, 27);
   LocalTime time = LocalTime.of(14, 30);
   LocalDateTime dateTime = LocalDateTime.of(2024, 10, 27, 14, 30);
   ```

### Why Use `.of()`?
- **Immutability**: Collections created with `.of()` are immutable, which prevents accidental modifications and improves thread safety.
- **Readability**: The `.of()` method makes code more concise and easier to read, clearly indicating instance creation with specific values.

Would you like more examples on any of these?
*/
public class OptionalDemo {
    public static void main(String[] args) {
        //creation of optional object
        //of,empty,ofNullable
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        String email = "";
        Optional<String> emailString = Optional.of(email);
        System.out.println(emailString);
        System.out.println();
        String string = "hvgcf";
        Optional<Object> object = Optional.ofNullable(string);
        System.out.println("ofNullable gives empty object if the object is null: "+object.get());
        /*
        * get method checks for null, it throws NoSuchElementException("no value found")
        * */
        System.out.println("it wont check the null");
        if (object.isPresent()){
            System.out.println(object.get());
        }else
            System.out.println("no value present");

        /*
        * to get the default value of the optional class object using orElse()
        * */
        String value = "shri@gmail.com";
        Optional<String> optionalObject = Optional.ofNullable(null );
        String thisIsDefaultValue = optionalObject.orElse("this is default value");// it returns the value if present otherwise it returns the default value
        System.out.println(thisIsDefaultValue);
        //this method works same as orElse, but takes the supplier as input param
        String s = optionalObject.orElseGet(() -> "shrishail");
        System.out.println(s);
        System.out.println();
        // orElseThrow: checks the null, returns the value if not null, or else throw the exception
        String exception = optionalObject.orElseThrow(()-> new IllegalArgumentException("email not exists"));
        System.out.println(exception);

        // if the value is not null then execute or else nothing, since it a void method
        optionalObject.ifPresent((x)-> System.out.println());

        //filter()
        String result = "abc";
        if (result!=null && result.contains("abc")){
            System.out.println(result);
        }

        Optional<String> optionalS = Optional.of(result);
        optionalS.filter(res -> res.contains("abc")).ifPresent(System.out::println);
    }

}
