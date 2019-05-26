# Reverse 1

*Forget to copy the description*

[1158.jar](1158.jar)

Change to executable and run it!
```bash
# chmod +x 1158.jar 
# ./1158.jar 
Nice Try!
```
Nothing...

Reverse it using [this website](http://www.javadecompilers.com/)

Inside got `xor.java`:
```java
import java.io.PrintStream;

public class xor {
  public xor() {}
  
  public static void main(String[] paramArrayOfString) {
    String str1 = "wwvrw wpvwwpvyw'vswrvxwswtvs";
    String str2 = "Nice Try!";
    String str3 = "A";
    
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < str2.length(); i++)
      localStringBuilder.append((char)(str1.charAt(i) ^ str3.charAt(i % str3.length())));
    String str4 = localStringBuilder.toString();
    System.out.print(str2);
  }
}
```

See the last line of the code is printing `str2` which is `Nice Try!`

Try to print the `str4` because looks suspicious

Save it to `xor.java`:
```bash
javac xor.java
java xor
# Result: 66736a617
```
Its clearly ascii value in hex!

But only 3 characters which is weird

In the for loop, we try to change the `str2.length()` to `str1.length()`

Result is `66736a617661786f726379626572`

Change hex to string using python:
```python
>>> "66736a617661786f726379626572".decode('hex')
'fsjavaxorcyber'
```
We get the flag!!

## Flag
> fsjavaxorcyber