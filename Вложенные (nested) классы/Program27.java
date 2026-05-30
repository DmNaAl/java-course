interface Button
{
    void click();

    //Вложенный класс является public static всегда
    class Sound {
        public void play()
		{
            System.out.println("*Звук*");
        }
    }
}



public class Program27
{
    public static void main(String[] args)
	{
        Button.Sound buttonSound = new Button.Sound();

        buttonSound.play();
    }
}