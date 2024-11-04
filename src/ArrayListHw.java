import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListHw {
    List<String> pets = new ArrayList<>();
    List<String> pets2 = new ArrayList<>();

    public void addPets(String pet) {
        pets.add(pet);
        System.out.println("Животные списка 1: " + pets);
    }

    public void addPets2(String pet2) {
        pets2.add(pet2);
        System.out.println("Животные списка 2: " + pets2);
    }

    public void addAllPets() {
        pets.addAll(pets2);
        System.out.println("Списки совмещены: " + pets);
    }

    public void clearPets() {
        pets.clear();
        System.out.println("Животные из первого списка удалены: " + pets + pets2);
    }

    public void clearPets2() {
        pets2.clear();
        System.out.println("Животные из второго списка удалены: " + pets + pets2);
    }

    public void showPets() {
        if (!pets.isEmpty() || !pets2.isEmpty()) {
            System.out.println("Список питомцев не пуст: " + pets + " и " + pets2);
        } else {
            System.out.println("Оба списка пусты");
        }
    }

    public String toString() {
        return "Pets1: " + pets + " and pets2: " + pets2;
    }

    public void delIndex(int index) {
        if (index >= 0 && index < pets.size()) {
            pets.remove(index);
            System.out.println("Убраны животные под индексом " + index + " в списке 1: " + pets + pets2);
        } else {
            System.out.println("Недопустимый индекс.");
        }
    }

    public void delName(String name) {
        pets2.remove(name);
        System.out.println("Убрано животное " + name + " в списке 2: " + pets + pets2);
    }

    public void quickSortPets() {
        quickSort(pets, 0, pets.size() - 1);
        System.out.println("Список 1 отсортирован: " + pets);
    }

    private void quickSort(List<String> list, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(list, left, right);
            quickSort(list, left, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, right);
        }
    }

    private int partition(List<String> list, int left, int right) {
        String pivot = list.get(right);
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (list.get(j).compareTo(pivot) < 0) {
                i++;
                Collections.swap(list, i, j);
            }
        }

        Collections.swap(list, i + 1, right);
        return i + 1;
    }
}
