public class SortArray {
    public int[] arraySort(int []array){
        int Store=0;
        for(int index=0;index<array.length;index++){
            for(int secondIndex=0;secondIndex<array.length-1;secondIndex++){
              if(array[secondIndex]>array[secondIndex+1])  {
                  Store=array[secondIndex];
                  array[secondIndex]=array[secondIndex+1];
                  array[secondIndex+1]=Store;
              }
            }
        }
        return array;
    }

    public static void main(String[] args) {
       int[] UnSortedArray={12,1,23,56,98};
       SortArray SA=new SortArray();
       int[] SortedArray= SA.arraySort(UnSortedArray);
       for(int iterate:SortedArray){
           System.out.println(iterate);
       }
    }
}
