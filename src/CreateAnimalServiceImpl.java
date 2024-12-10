public class CreateAnimalServiceImpl implements CreateAnimalService{

    public void createAnimal(int N) {
        for (int i = 0; i < N; i++) {
            AbstractAnimal.generateAnimal();
        }
    }

    @Override
    public void createAnimal() {
        int i = 0;
        do {
            AbstractAnimal.generateAnimal();
            i++;
        }while (i < 10);
    }
}
