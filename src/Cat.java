import java.time.LocalDate;

public class Cat extends Pet{

    private String catSound;

    public Cat(Double degreeOfSoftPaws, String catSound) {
        super(degreeOfSoftPaws);
        this.catSound = catSound;
    }

    public Cat(String breed, String name, Double cost, String character, LocalDate birthDate, Double degreeOfSoftPaws, String catSound) {
        super(breed, name, cost, character, birthDate, degreeOfSoftPaws);
        this.catSound = catSound;
    }

    public String getCatSound() {
        return catSound;
    }

    public void setCatSound(String catSound) {
        this.catSound = catSound;
    }

    public String info() {
        return "Wolf: " + "Breed: " + this.breed + "; Name: " + this.name + "; Cost: " + this.cost + "; Character: " + this.character + "; Danger: " + super.getDegreeOfSoftPaws() + "; Sound: " + this.catSound;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Cat)) {
            return false;
        }
        Cat animal = (Cat) object;
        return breed.equals(animal.breed) &&
                name.equals(animal.name) &&
                cost.equals(animal.cost) &&
                character.equals(animal.character) &&
                birthDate.equals(animal.birthDate) &&
                getDegreeOfSoftPaws().equals(animal.getDegreeOfSoftPaws()) &&
                catSound.equals(animal.catSound);
    }
}