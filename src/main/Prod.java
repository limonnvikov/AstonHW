public class Main {
    public static void main(String[] args) {
        ArrayListHw arrayListHw = new ArrayListHw();
        arrayListHw.addPets("cat");
        arrayListHw.addPets("dog");
        arrayListHw.addPets("rat");
        arrayListHw.addPets2("parrot");
        arrayListHw.addPets2("sheep");
        arrayListHw.addPets2("mouse");
        arrayListHw.addAllPets();
        System.out.println(arrayListHw);
    }
}
