import java.util.Scanner;

public class VetRecords
{
    Scanner input = new Scanner(System.in);
    //variables
    public String FName;
    public String LName;
    public String petName;
    public String species;
    public String gender;
    public int age;
    public double weight;


    //constructors
    public VetRecords()
    {
        FName = null;
        LName = null;
        petName = null;
        gender = null;
        age = 0;
        weight = 0.0;
        species = null;
    }//end of empty constructor

    public VetRecords(String firstName, String lastName, String petName, String gender, int age, double weight, String species)
    {
        this.FName = FNameVal(firstName);
        this.LName = LNameVal(lastName);
        this.petName = PNameVal(petName);
        this.gender = GenderVal(gender);
        this.age = AgeVal(age);
        this.weight = weight;
        this.species = species;
    }//end of all elements constructor

    //getters & setters
    public String getFName()
    {
        return FName;
    }

    public String getLName()
    {
        return LName;
    }

    public String getPetName()
    {
        return petName;
    }

    public String getGender()
    {
        return gender;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getSpecies()
    {
        return species;
    }

    public void setFName(String FName)
    {
        this.FName = FNameVal(FName);
    }

    public void setLName(String LName)
    {
        this.LName = LNameVal(LName);
    }

    public void setPetName(String petName)
    {
        this.petName = PNameVal(petName);
    }

    public void setGender(String gender)
    {
        this.gender = GenderVal(gender);
    }

    public void setAge(int age)
    {
        this.age = AgeVal(age);
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setSpecies(String species)
    {
        this.species = species;
    }

    //validation methods

    private String FNameVal(String firstName)
    {
        while(!firstName.matches("[A-Z][a-z]*"))
        {
            System.out.println("Not a valid entry. Try Again.");
            firstName = input.nextLine();
        }
        return firstName;
    }//end of FNameVal method

    private String LNameVal(String lastName)
    {
        while(!lastName.matches("[A-Z]([-]|[A-z])*"))
        {
            System.out.println("Not a valid entry. Try Again.");
            lastName = input.nextLine();
        }
        return lastName;
    }//end of LNameVal method

    private String PNameVal(String petName)
    {
        while(!petName.matches("[A-Z][A-z]*"))
        {
            System.out.println("Not a valid entry. Try Again.");
            petName = input.nextLine();
        }
        return petName;
    }//end of PNameVal method

    private String GenderVal(String gender)
    {
        while(!gender.matches("(Male|male|Female|female)"))
        {
            System.out.println("Not a valid entry. Try Again.");
            gender = input.nextLine();
        }
        return gender;
    }//end of GenderVal method

    private int AgeVal(int age)
    {
        String Ages = "" + age;
        while(!Ages.matches("[0-2][0-9]|[0-9]"))
        {
            System.out.println("Not a valid entry. Try Again.");
            Ages = input.nextLine();
        }
    age = Integer.valueOf(Ages);
        return age;
    }//end of AgeVal method

    //toString
    public String toString()
    {
        return "Owner: " + FName + ", " + LName + "; Pet: " + petName + ", " + gender + ", " + age + " years old, " +
                weight + "kg, " + species;
    }//end of toString
}//end of VetRecords class