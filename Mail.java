abstract public class Mail
{
    private String deliveryAddress;
    private String returnAddress;

    private double width;
    private double length;

    private int id;

    private static int nextId = 0;

    public Mail()
    {
        id = nextId;
        nextId++;
        width = 0;
        length = 0;
        deliveryAddress = "";
        returnAddress = "";
    }

    public Mail(String deliveryAddress, String returnAddress, double width, double length)
    {
        this.deliveryAddress=deliveryAddress;
        this.returnAddress = returnAddress;
        this.width = width;
        this.length = length;
        id = nextId;
        nextId++;
    }

    public String getDeliveryAddress()
    {
        return deliveryAddress;
    }

    public String getReturnAddress()
    {
        return returnAddress;
    }

    public double getWidth()
    {
        return width;
    }

    public double getLength()
    {
        return length;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        String output = "";

        output += getId() + "\n" +
                  getDeliveryAddress() + "\n" +
                    getReturnAddress();

        return output;
    }

}
