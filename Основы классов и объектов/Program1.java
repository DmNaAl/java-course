class Shape
{
    protected int x;
    protected int y;

    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void move(int newx, int newy)
    {
        this.x = newx;
        this.y = newy;
    }
	
	public void Print()
	{
		System.out.printf("Фигура на позиции: %d %d\n", this.x, this.y);
	}
}

class ColoredShape extends Shape
{
    private String color;

    public ColoredShape(int x, int y, String color)
	{
        super(x, y);
        this.color = color;
    }

    @Override
    public void Print()
	{
        System.out.printf("Цветная фигура цвета \"%s\" на позиции: %d %d\n", this.color, this.x, this.y);
    }
}

public class Program1
{
    public static void moveAndPrint(Shape shape)
	{
        shape.move(10, 10);
        shape.Print();
    }

    public static void main (String[] args)
	{
        Shape ordinaryShape = new Shape(0, 0);
        Shape coloredShape = new ColoredShape(5, 5, "Красный");

        moveAndPrint(ordinaryShape);
        moveAndPrint(coloredShape);
    }
}
