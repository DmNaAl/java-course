public class A {
    public void printNum(Integer i)
    {
        System.out.printf("Integer = %d%n", i);
    }
    public void printNum(int i)
    {
        System.out.printf("int = %d%n", i);
    }
    public void printNum(Float f)
    {
        System.out.printf("Float = %.4f%n", f);
    }
    public void printNum(Number n)
    {
        System.out.println("Number=" + n);
    }
}
//Перегрузка методов работает статически.
//Перегружаемый метод определяется во время компиляции.
//Для a.printNum(n): public void printNum(Number n)
//Для остальных вызовов printNum тип по актуальному типу аргумента.