import java.util.Objects;

class Person
{
	private String name;
	private String surname;
	private int age;
	
	public Person(String name, String surname, int age)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	@Override
	//Метод equals должен следовать пяти соглашениям:
	//1. Рефлексивность
	//2. Симметричность
	//3. Транзитивность
	//4. Согласованность (один и тот же результат, пока поля не изменятся)
	//5. Проверка на null
    public boolean equals(Object obj) {
        //Cоглашение рефлексивности: объект равен самому себе
        if (this == obj)
		{
            return true;
        }

        //Cоглашение null: сравнение с null должно возвращать false./ Сразу также проводится сравнение классов.
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Person otherPerson = (Person)obj;

        //Сравнение полей
		//Результат зависит только от текущих значений собственных полей, следовательно, соглашение Согласованности выполняется
		//Метод очевидно симметричен и транзитивен
        return this.age == otherPerson.age && Objects.equals(this.name, otherPerson.name) && Objects.equals(this.surname, otherPerson.surname);
    }
}

public class Program25
{
	public static void main(String[] args)
	{
		Person obj1 = new Person("Андрей", "Подольский", 18);
		Person obj2 = new Person("Андрий", "Подольский", 18);
		Person obj3 = new Person("Андрей", "Подольский", 18);
		
		System.out.println("Объект равен самому себе: " + obj1.equals(obj1));
		System.out.println("Объект никогда не равен null: " + obj1.equals(null));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj1));
	}
}