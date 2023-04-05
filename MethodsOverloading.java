
// In methodoverloading, basically concept of methods same but different type of parameter(i.e. values) and different types of data(i.e. int, long , double and so on) and it is called methods overloading.

// Or , in methods overloading it is defining one or more method within the same class that have the same name but different types of parameter declarations this process called as overload and it is known as method overloading.


class calc {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add(int n1, int n2, int n3) {
        int result1 = n1 + n2 +n3;
        return result1;
    }

}

public class MethodsOverloading {
    public static void main(String[] args) {

        calc obj = new calc();

        int result = obj.add(2, 3);
        System.out.println(result);

        int result1 = obj.add(3, 5, 2);
        System.out.println(result1);
    }
}
