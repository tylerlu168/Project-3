import java.util.Scanner;
import java.util.ArrayList;

public class MailRoom
{
    public static boolean handleLetter(Letter letter, ArrayList<Mail> deliver)
    {
        if(!letter.getDeliveryAddress().equals("") && !letter.getReturnAddress().equals("") && letter.getLength() >= 5 && letter.getLength() <= 11.5 && letter.getWidth() >= 3.5 && letter.getWidth() <= 6.125 && letter.getThickness() >= 0.007 && letter.getThickness() <= 0.25 && letter.getLength()-letter.getWidth() >= 1.5)
        {
            deliver.add(letter);
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean handleFlat(Flat flat, ArrayList<Mail> deliver)
    {
        if(!flat.getDeliveryAddress().equals("") && !flat.getReturnAddress().equals("") && flat.getLength() >= 11.5 && flat.getLength() <= 15 && flat.getWidth() >= 6.125 && flat.getWidth() <= 12 && flat.getThickness() >= 0.25 && flat.getThickness() <= 0.75 && flat.getContents().equals("DOCUMENTS"))
        {
            deliver.add(flat);
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean handleRegularBox(RegularBox regularBox, ArrayList<Mail> deliver)
    {
        if(!regularBox.getDeliveryAddress().equals("") && !regularBox.getReturnAddress().equals("") && regularBox.getLength() >= 6 && regularBox.getLength() <= 27 && regularBox.getWidth() >= 0.25 && regularBox.getWidth() <= 17 && regularBox.getHeight() >= 3 && regularBox.getHeight()<= 17 && regularBox.getWeight() >= 0 && regularBox.getWeight() <= 70 && regularBox.getCount()>= 0 && regularBox.getCount()<=50)
        {
            deliver.add(regularBox);
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean handleLiveBox(LiveBox liveBox, ArrayList<Mail> deliver)
    {
        if(!liveBox.getDeliveryAddress().equals("") && !liveBox.getReturnAddress().equals("") && liveBox.getLength() >= 6 && liveBox.getLength() <= 27 && liveBox.getWidth() >= 0.25 && liveBox.getWidth() <= 17 && liveBox.getHeight() >= 3 && liveBox.getHeight()<= 17)
        {
            if(liveBox.getAnimal().equalsIgnoreCase("HONEYBEES"))
            {
                if(liveBox.getCount() >= 0 && liveBox.getCount() <= 20)
                {
                    deliver.add(liveBox);
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(liveBox.getAnimal().equalsIgnoreCase("CHICKEN"))
            {
                if(liveBox.getCount() >= 0 && liveBox.getCount() <= 10 && liveBox.getAge() <= 1 && liveBox.getAge() >= 0)
                {
                    deliver.add(liveBox);
                    return true;
                }
                else {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        int terminate = 0;
        ArrayList<Mail> deliver = new ArrayList<Mail>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to KSUPS");
        System.out.println();

        while(terminate == 0)
        {
            System.out.println("1- Send letter" + "\n" +
                                "2- Send flat" + "\n" +
                                "3- Send regular box" + "\n" +
                                "4- Send live box" + "\n" +
                                "5- Dispatch items" + "\n" +
                                "6- Quit");
            System.out.print("Enter option: ");
            int choice = input.nextInt();
            System.out.println();

            if (choice == 1)
            {
                input.nextLine();
                System.out.print("Enter the delivery address: ");
                String deliverAddress = input.nextLine();
                System.out.print("Enter the return address: ");
                String returnAddress = input.nextLine();
                System.out.print("Enter the width of your mail: ");
                double width = input.nextDouble();
                System.out.print("Enter the length of your mail: ");
                double length = input.nextDouble();
                System.out.print("Enter the thickness of your mail: ");
                double thickness = input.nextDouble();
                input.nextLine();
                System.out.print("Enter the contents of your letter: ");
                String content = input.nextLine();

                System.out.println();

                Letter addLetter = new Letter(deliverAddress, returnAddress, width, length, thickness, content);

                if(handleLetter(addLetter, deliver) == true)
                {
                    System.out.println("Letter Accepted for delivery.");
                    System.out.println();
                }
                else
                {
                    System.out.println("Letter cannot be mailed.");
                    System.out.println();
                }
            }
            else if (choice == 2)
            {
                input.nextLine();
                System.out.print("Enter the delivery address: ");
                String deliverAddress = input.nextLine();
                System.out.print("Enter the return address: ");
                String returnAddress = input.nextLine();
                System.out.print("Enter the width of your mail: ");
                double width = input.nextDouble();
                System.out.print("Enter the length of your mail: ");
                double length = input.nextDouble();
                System.out.print("Enter the thickness of your mail: ");
                double thickness = input.nextDouble();
                input.nextLine();
                System.out.print("Enter the contents of your letter: ");
                String content = input.nextLine();

                System.out.println();
                Flat addFlat = new Flat(deliverAddress, returnAddress, width, length, thickness, content);

                if(handleFlat(addFlat, deliver) == true)
                {
                    System.out.println("Flat Accepted for delivery.");
                    System.out.println();
                }
                else
                {
                    System.out.println("Flat cannot be mailed.");
                    System.out.println();
                }
            }
            else if (choice == 3)
            {
                input.nextLine();
                System.out.print("Enter the delivery address: ");
                String deliverAddress = input.nextLine();
                System.out.print("Enter the return address: ");
                String returnAddress = input.nextLine();
                System.out.print("Enter the width of your mail: ");
                double width = input.nextDouble();
                System.out.print("Enter the length of your mail: ");
                double length = input.nextDouble();
                System.out.print("Enter the height of your mail: ");
                double height = input.nextDouble();
                System.out.print("Enter how many items your box has: ");
                int items = input.nextInt();
                System.out.print("Enter the weight of your box: ");
                double weight = input.nextDouble();
                input.nextLine();
                System.out.print("Enter the contents of your box: ");
                String content = input.nextLine();


                System.out.println();
                RegularBox addRegularBox = new RegularBox(deliverAddress,returnAddress,width,length,height,items,content,weight);

                if(handleRegularBox(addRegularBox, deliver) == true)
                {
                    System.out.println("Regular box accepted for delivery.");
                    System.out.println();
                }
                else
                {
                    System.out.println("Regular box cannot be mailed.");
                    System.out.println();
                }
            }
            else if (choice == 4)
            {
                input.nextLine();
                System.out.print("Enter the delivery address: ");
                String deliverAddress = input.nextLine();
                System.out.print("Enter the return address: ");
                String returnAddress = input.nextLine();
                System.out.print("Enter the width of your mail: ");
                double width = input.nextDouble();
                System.out.print("Enter the length of your mail: ");
                double length = input.nextDouble();
                System.out.print("Enter the height of your mail: ");
                double height = input.nextDouble();
                System.out.print("Enter how many items your box has: ");
                int items = input.nextInt();
                input.nextLine();
                System.out.print("Enter what animal is being shipped: ");
                String animal = input.nextLine();
                System.out.print("Enter age of the oldest animal, in days: ");
                int age = input.nextInt();


                System.out.println();
                LiveBox addLiveBox = new LiveBox(deliverAddress, returnAddress, width, length, height, items, animal, age);

                if(handleLiveBox(addLiveBox, deliver) == true)
                {
                    System.out.println("Regular box accepted for delivery.");
                    System.out.println();
                }
                else
                {
                    System.out.println("Regular box cannot be mailed.");
                    System.out.println();
                }
            }
            else if (choice == 5)
            {
                if(deliver.get(0) == null)
                {
                    System.out.println("Delivery queue is empty.");
                    System.out.println();
                }
                else
                {
                    System.out.println("DISPATCHING THE FOLLOWING ITEMS FOR DELIVERY:");
                    for (int i = 0; i < deliver.size(); i++) {
                        System.out.println("==========");
                        System.out.println(deliver.get(i).toString());
                    }
                    System.out.println();
                    for (int j = 0; j < deliver.size(); j++) {
                        deliver.set(j, null);
                    }
                }

            }
            else if (choice == 6)
            {
                System.out.println("Quitting...");
                terminate = 1;
            }
        }
    }
}
