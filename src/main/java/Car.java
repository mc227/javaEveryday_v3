import java.util.ArrayList;

public class Car
{
    int width, height;

    public class Door
    {
        int width, height;

        public void setHeight(int height)
        {
            this.height = height;
        }

        public int getHeight()
        {
            if (height != 0)
                return this.height;
            else
                return (int)(Car.this.height * 0.8);
        }
    }
}