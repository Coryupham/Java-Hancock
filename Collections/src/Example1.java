public class Example1 {

    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

        myList.add("Anna");
        myList.add("Bob");
        myList.add("Carlos");
        myList.add("Dan");
        myList.add("Eric");
        myList.add("Frank");
        myList.add("Greg");

        for(int x = 0; x < myList.size(); x++){
            System.out.println(myList.get(x));
        }
    }
}
