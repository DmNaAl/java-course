import java.util.Arrays;

public class Program10
{
	public static void main (String args[])
    {
        int a1[] = {1,2,3,4,5};
		int a2[] = {6,7,8,9,10};
		a1 = a2;//Теперь a1 и a2 ссылаются на один и тот же объект. {1,2,3,4,5} будет удалён сборщиком мусора.
		
		
		
		int[] numbers = {5, 3, 8, 1, 2};
		String arrayAsString = Arrays.toString(numbers);
		System.out.println("numbers: " + arrayAsString);
        Arrays.sort(numbers);

        arrayAsString = Arrays.toString(numbers);
		System.out.println("numbers: " + arrayAsString);
		
		int index = Arrays.binarySearch(numbers, 5);
        System.out.println("2. Индекс элемента '5': " + index);
		
		String[] arrayA = {"acb", "aa", "ddd"};
        String[] arrayB = {"acb", "aa", "ddd"};
        String[] arrayC = {"acb", "ab", "ddd"};
		
		System.out.println(Arrays.equals(arrayA, arrayB));//true Массивы одинаковы
		
		System.out.println(Arrays.compare(arrayA, arrayB));//0 Массивы одинаковы
        System.out.println(Arrays.compare(arrayA, arrayC));//-1 Массив A 'меньше' C
    }
}