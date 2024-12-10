public interface CreateAnimalService {
    default void createAnimal() {
        int i = 0;
        while (i < 10) {
            AbstractAnimal.generateAnimal();
            i++;
        }
    }
}
