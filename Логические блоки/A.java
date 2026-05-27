public class A {
    {
        System.out.println("logic (1) id= " + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 1;

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    {
        System.out.println("logic (2) id= " + id);
    }
}
//Вывод:
//static logic
//logic (1) id= 0
//logic (2) id= 1
//ctor id= 100
//1. При загрузке класса в память выполняется статический блок.
//2. Поля заполняются значениями по умолчанию. (id = 0)
//3. Последовательно выполняются нестатические логические блоки вместе с инициализациями полей.
//4. Выполняется конструктор