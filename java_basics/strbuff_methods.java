public class strbuff_methods{
public static void main(String []args){
StringBuffer sb = new StringBuffer("Hello");
sb.insert(3,"world");
System.out.println("The modified string is "+(sb.toString()));
System.out.println("Sub String is"+(sb.substring(3,5)));
}
}
