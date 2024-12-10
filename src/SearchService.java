public interface SearchService {
    String[] findLeapYearNames(Animal[] animals);
    Animal[] findOlderAnimals(Animal[] animals, int N);
    void findDuplicate(Animal[] animals);
}
