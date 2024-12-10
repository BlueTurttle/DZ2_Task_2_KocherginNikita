import java.time.LocalDate;

public class Wolf extends Predator {

    private String wolfSound;
    public Wolf(Double degreeOfDanger, String wolfSound) {
        super(degreeOfDanger);
        this.wolfSound = wolfSound;
    }

    public Wolf(String breed, String name, Double cost, String character, LocalDate birthDate, Double degreeOfDanger, String wolfSound) {
        super(breed, name, cost, character, birthDate, degreeOfDanger);
        this.wolfSound = wolfSound;
    }

    public String getWolfSound() {
        return wolfSound;
    }

    public void setWolfSound(String wolfSound) {
        this.wolfSound = wolfSound;
    }

    public String info() {
        return "Wolf: " + "Breed: " + this.breed + "; Name: " + this.name + "; Cost: " + this.cost + "; Character: " + this.character + "; Danger: " + super.getDegreeOfDanger() + "; Sound: " + this.wolfSound + "; BirthDate:" + this.birthDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Wolf)) {
            return false;
        }
        Wolf animal = (Wolf) object;
        return breed.equals(animal.breed) &&
                name.equals(animal.name) &&
                cost == animal.cost &&
                character.equals(animal.character) &&
                birthDate.equals(animal.birthDate) &&
                getDegreeOfDanger() == animal.getDegreeOfDanger() &&
                wolfSound.equals(animal.wolfSound);
    }
}
