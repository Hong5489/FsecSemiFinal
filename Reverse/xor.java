import java.io.PrintStream;

public class xor {
  public xor() {}
  
  public static void main(String[] paramArrayOfString) {
    String str1 = "wwvrw wpvwwpvyw'vswrvxwswtvs";
    String str2 = "Nice Try!";
    String str3 = "A";
    
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < str1.length(); i++)
      localStringBuilder.append((char)(str1.charAt(i) ^ str3.charAt(i % str3.length())));
    String str4 = localStringBuilder.toString();
    System.out.print(str4);
  }
}