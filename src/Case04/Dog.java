package Case04;

public class Dog {
    int age;
    String name;                            //成员变量
    public Dog(int a,String b){
        age =a;name=b;                      //构造方法
    }
    public void aaa(){
        System.out.println(name+"真可爱");
    }
    public void bbb(){
        System.out.println(name+age+"岁了");  //成员方法
    }
    }
