public class LiveBox extends Box
{
    private String animal;
    private int age;

    public LiveBox()
    {
        super();
        animal = "";
        age = 0;
    }

    public LiveBox(String deliveryAddress, String returnAddress, double width, double length, double height, int count, String animal, int age)
    {
        super(deliveryAddress, returnAddress, width, length, height, count);
        this.animal = animal;
        this.age = age;
    }

    public String getAnimal()
    {
        return animal;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        String output = "";
        output += super.toString() + "\n";

        output += "Animal: " + getAnimal().toUpperCase() + "\n" +
                    "Count: " + getCount() + "\n" +
                    "Age (Days): " + getAge();

        return output;
    }
}
