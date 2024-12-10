import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CreateAnimalServiceImpl casImpl = new CreateAnimalServiceImpl();
        casImpl.createAnimal();
        casImpl.createAnimal(7);

        CreateAnimalService cas = new CreateAnimalService() {
            @Override
            public void createAnimal() {
                CreateAnimalService.super.createAnimal();
            }
        };
        cas.createAnimal();


        Animal[] myArray = new Animal[10];
        for (int i = 0; i < 10; i++) {
            myArray[i] = AbstractAnimal.getGenerateAnimal();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(myArray[i].getBirthDate());
        }

        SearchService service1 = new SearchServiceImpl();
        String[] myArray1 = service1.findLeapYearNames(myArray);



        for (int i = 0; i < myArray1.length; i++) {
            System.out.println(myArray1[i]);
        }
        SearchService service2 = new SearchServiceImpl();
        Animal[] myArray2 = service2.findOlderAnimals(myArray, 10);

        for (int i = 0; i < myArray2.length; i++) {
            System.out.println(myArray2[i].getBirthDate());
        }


    }
}
