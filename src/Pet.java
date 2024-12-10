import java.time.LocalDate;

public class Pet extends AbstractAnimal{

    private Double degreeOfSoftPaws;

    public Pet(String breed, String name, Double cost, String character, LocalDate birthDate, Double degreeOfSoftPaws) {
        super(breed, name, cost, character, birthDate);
        this.degreeOfSoftPaws = degreeOfSoftPaws;
    }


    public Pet(Double degreeOfSoftPaws) {
        this.degreeOfSoftPaws = degreeOfSoftPaws;
    }

    public Double getDegreeOfSoftPaws() {
        return degreeOfSoftPaws;
    }
    public void setDegreeOfSoftPaws(Double degreeOfSoftPaws) {
        this.degreeOfSoftPaws = degreeOfSoftPaws;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Pet)) {
            return false;
        }
        Pet animal = (Pet) object;
        return breed.equals(animal.breed) &&
                name.equals(animal.name) &&
                cost == animal.cost &&
                character.equals(animal.character) &&
                birthDate.equals(animal.birthDate) &&
                degreeOfSoftPaws == animal.degreeOfSoftPaws;
    }

}
