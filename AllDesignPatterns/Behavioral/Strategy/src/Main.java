public class Main {
    public static void main(String[] args) {
        //Bir işlemi gerçekleştirmek için kullandığınız algoritmayı, daha sonra değiştirmek
        //isterseniz, bu değişimi Open Closed prensibini ihlal etmeden nasıl yaparsınız?

        StudentCollection studentCollection = new StudentCollection();
        BubbleSort bubble = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        HeapSort heapSort = new HeapSort();

        studentCollection.SortStudents(heapSort);
        studentCollection.SortStudents(bubble);
        studentCollection.SortStudents(quickSort);


    }
}