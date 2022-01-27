→ Exception Handling is the mechanism to handle errors in Java program.
→ Errors are of two types: Exceptions & Errors
→ Exceptions(IOException, NullPointerException) can be handled programmatically but errors(OutOfMemoryError, StackOverflowError) can't be handled.
→ Exceptions are of two types:
    - Checked Exception (Exceptions checked at compile time)
    - Unchecked Exception (Exceptions that are not checked at compile time)

→ Exception Hierarchy:
                Throwable
                (Checked)
                    ↓
       Exception         Error
       (Checked)      (Unchecked)
           ↓
   RuntimeException
      (Unchecked)

→ 'try', 'catch' and 'finally' blocks are used to handle exceptions.
    - try() block contains the code that can cause an exception to occur
    - catch(Exception e) block handles the code that will be executed if exception occur. There could be multiple catch blocks.
    - finally block is always executed whether an exception is occurred or not.
→ 'throw' keyword is used to manually throw an exception.
