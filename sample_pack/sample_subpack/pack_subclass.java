package sample_subpack;
public class pack_subclass implements pack_class{
public void one(){
System.out.println("one fun is called");
}
public void two(){
System.out.println("two fun is called");
}
public static void main(String []args){
pack_subclass p= new pack_subclass();
p.one();
p.two();
}
}
