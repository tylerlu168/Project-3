abstract public class Box extends Mail
{
    private double height;
    private int count;

    public Box()
    {
        super();
        height = 0;
        count = 0;
    }
    public Box(String deliveryAddress, String returnAddress, double width, double length, double height, int count)
    {
        super(deliveryAddress, returnAddress, width, length);
        this.height = height;
        this.count = count;
    }

    public double getHeight()
    {
        return height;
    }

    public int getCount()
    {
        return count;
    }

    @Override
    public String toString()
    {
        String output = "";
        output += super.toString() + "\n";

        output += getWidth() + " x " + getLength() + " x " + getHeight();
        return output;
    }
}
