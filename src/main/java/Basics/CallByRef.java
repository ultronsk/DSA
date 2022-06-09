package Basics;

public class CallByRef {
String name = "Sumit";
    public static void main(String[] args) {
        CallByRef obj1 = new CallByRef();
        System.out.println("Before Passing by Reference "+obj1.name);
        changeName(obj1);
        System.out.println("After Passing by Reference "+obj1.name);
    }

    private static void changeName(CallByRef obj2){
        obj2.name = "Sharma";
    }
}
