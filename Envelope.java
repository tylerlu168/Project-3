abstract public class Envelope extends Mail
{
    private double thickness;

    public Envelope()
    {
        super();
        thickness = 0;
    }

    public Envelope(String deliveryAddress, String returnAddress, double width, double length, double thickness)
    {
        super(deliveryAddress, returnAddress, width, length);
        this.thickness = thickness;
    }

    public double getThickness()
    {
        return thickness;
    }

    @Override
    public String toString()
    {
        String output = "";
        output += super.toString() + "\n";

        output += getWidth() + " x " + getLength() + " x " + getThickness();
        return output;
    }
}
