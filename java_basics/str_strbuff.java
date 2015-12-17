public class str_strbuff{
public static String concstr(){
String s="Hello";
for (int i=0;i<10000;i++){
s=s+"world";
}
return s;
}
public static void main(String []args){
long curr_time=System.currentTimeMillis();
concstr(); 
System.out.println("Time elapsed is " +(System.currentTimeMillis()-curr_time));
long curr_time1=System.currentTimeMillis();
constrbuff();
System.out.println("Time elapsed is: "+(System.currentTimeMillis()-curr_time1));
}

public static String constrbuff(){
StringBuffer sb = new StringBuffer("Hello");
for (int i=0;i<10000;i++){
sb.append("world");
}
return sb.toString();
}
}
