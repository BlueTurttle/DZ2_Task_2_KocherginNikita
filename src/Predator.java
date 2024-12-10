import java.time.LocalDate;

public class Predator extends AbstractAnimal {

    private Double degreeOfDanger;

    public Predator(String breed, String name, Double cost, String character, LocalDate birthDate, Double degreeOfDanger) {
        super(breed, name, cost, character, birthDate);
        this.degreeOfDanger = degreeOfDanger;
    }


    public Predator(Double degreeOfDanger) {
        this.degreeOfDanger = degreeOfDanger;
    }

    public Double getDegreeOfDanger() {
        return degreeOfDanger;
    }
    public void setDegreeOfDanger(Double degreeOfDanger) {
        this.degreeOfDanger = degreeOfDanger;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Predator)) {
            return false;
        }
        Predator animal = (Predator) object;
        return breed.equals(animal.breed) &&
                name.equals(animal.name) &&
                cost == animal.cost &&
                character.equals(animal.character) &&
                birthDate.equals(animal.birthDate) &&
                degreeOfDanger == animal.degreeOfDanger;
    }
}
