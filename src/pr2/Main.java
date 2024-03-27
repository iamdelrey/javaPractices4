package pr2;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Human> people = Arrays.asList(
                new Human(19, "Антон", "Сетунь", LocalDate.of(2004, 3, 19), 73),
                new Human(24, "Максим", "Батущев", LocalDate.of(2000, 1, 20), 84),
                new Human(79, "Васислий", "Перекрестков", LocalDate.of(1944, 9, 17), 63)
        );

        List<Human> filteredList = people.stream()
                .filter(human -> human.getWeight() > human.getAge())
                .collect(Collectors.toList());

        System.out.println("Фильтрация по признаку «вес больше, чем возраст»:");
        filteredList.forEach(System.out::println);

        List<Human> sortedList = people.stream()
                .sorted((human1, human2) -> human2.getLastName().compareTo(human1.getLastName()))
                .collect(Collectors.toList());

        System.out.println("\nСортировка по фамилии в обратном порядке:");
        sortedList.forEach(System.out::println);

        int totalWeight = people.stream()
                .mapToInt(Human::getWeight)
                .sum();

        System.out.println("\nСумма всех весов: " + totalWeight);
    }
}