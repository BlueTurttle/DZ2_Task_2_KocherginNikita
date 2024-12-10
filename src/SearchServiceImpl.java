import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchServiceImpl implements SearchService{
    @Override
    public String[] findLeapYearNames(Animal[] animals) {
        List<String> leapYearAnimalNames = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getBirthDate().isLeapYear()) {
                leapYearAnimalNames.add(animal.getName());
            }
        }

        return leapYearAnimalNames.toArray(new String[0]);
    }
    @Override
    public Animal[] findOlderAnimals(Animal[] animals, int N) {
        List<Animal> olderAnimalsList = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getAge() > N) {
                olderAnimalsList.add(animal);
            }
        }
        return olderAnimalsList.toArray(new Animal[0]);
    }
    @Override
    public void findDuplicate(Animal[] animals) {
        Map<Animal, Integer> animalCountMap = new HashMap<>();
        for (Animal animal : animals) {
            animalCountMap.put(animal, animalCountMap.getOrDefault(animal, 0) + 1);
        }
        System.out.println("Дубликаты животных:");
        for (Map.Entry<Animal, Integer> entry : animalCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - количество: " + entry.getValue());
            }
        }
    }
}
