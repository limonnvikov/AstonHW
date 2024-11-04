public class Prod {
    public static void main(String[] args) {
        ArrayListHw arrayListHw = new ArrayListHw();
        arrayListHw.addPets("cat");
        arrayListHw.addPets("dog");
        arrayListHw.addPets("rat");
        arrayListHw.addPets2("parrot");
        arrayListHw.addPets2("sheep");
        arrayListHw.addPets2("mouse");
        arrayListHw.quickSortPets();
        arrayListHw.showPets();
        arrayListHw.delIndex(0);
        arrayListHw.delName("parrot");
        arrayListHw.addAllPets();
        arrayListHw.clearPets();
        arrayListHw.clearPets2();
    }
}