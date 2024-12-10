import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.Random;

public abstract class AbstractAnimal implements Animal{
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;
    protected LocalDate birthDate;

    public AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    protected AbstractAnimal() {
    }

    public String getBreed() {
        return breed;
    }
    public String getName() {
        return name;
    }
    public Double getCost() {
        return cost;
    }
    public String getCharacter() {
        return character;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static void generateAnimal() {
        Random rnd = new Random();
        int number = rnd.nextInt(2);
        if (number == 0) {
            System.out.println(new Wolf(Rand.RandomUUID(), Rand.RandomUUID(), Rand.RandomDouble(0, 1000), Rand.RandomUUID(), Rand.RandomDate(), Rand.RandomDouble(1, 10), Rand.RandomUUID()));
        }
        else {
            System.out.println(new Cat(Rand.RandomUUID(), Rand.RandomUUID(), Rand.RandomDouble(0, 1000), Rand.RandomUUID(), Rand.RandomDate(), Rand.RandomDouble(1, 10), Rand.RandomUUID()));
        }
    }
    public static Animal getGenerateAnimal() {
        Random rnd = new Random();
        int number = rnd.nextInt(2);
        if (number == 0) {
            return (new Wolf(Rand.RandomUUID(), Rand.RandomUUID(), Rand.RandomDouble(0, 1000), Rand.RandomUUID(), Rand.RandomDate(), Rand.RandomDouble(1, 10), Rand.RandomUUID()));
        }
        else {
            return (new Cat(Rand.RandomUUID(), Rand.RandomUUID(), Rand.RandomDouble(0, 1000), Rand.RandomUUID(), Rand.RandomDate(), Rand.RandomDouble(1, 10), Rand.RandomUUID()));
        }
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AbstractAnimal)) {
            return false;
        }
        AbstractAnimal animal = (AbstractAnimal) object;
        return breed.equals(animal.breed) &&
                name.equals(animal.name) &&
                cost == animal.cost &&
                character.equals(animal.character) &&
                birthDate.equals(animal.birthDate);
    }
}
