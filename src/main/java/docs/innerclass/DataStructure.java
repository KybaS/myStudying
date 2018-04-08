package docs.innerclass;

public class DataStructure {
    private static final int SIZE = 100;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure(){
        for (int i = 0; i < SIZE; i++){
            arrayOfInts[i] = i;
        }
    }

    public void printEven(){
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    public class EvenIterator implements DataStructureIterator {

        private int nextIndex = 0;
        public boolean hasNext(){
            return (nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String s[]){
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
