package sort;

public class BubbleSort {
    
    public static void main(String args[]) {
    
        int[] numbers = {3,1,6,2,5,4,7};
        
        int[] numbers2 = {3,1,6,2,5,4,7};
        
        printVetor(numbers);
       
        System.out.println("\nTrue Bubble Sort\n");
        realBoobleSort(numbers);
        
        System.out.println("\nIs not Bubble Sort\n");
        myBobbleSort(numbers2);
    }
   
    public static int[] myBobbleSort(int[] list) {
        
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int value = list[j];
                    list[j] = list[i];
                    list[i] = value;
                    printVetor(list);
                }
            }
        }
        return list;
    }
     
    public static int[] realBoobleSort(int[] v) {
        
        for(int i = 0; i < v.length - 1; i++) {
            boolean estaOrdenado = true;
      
            for(int j = 0; j < v.length - 1 - i; j++) {
                if(v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    estaOrdenado = false;
                    printVetor(v);
                }
            }
            if(estaOrdenado) break;
        }   
        return v;
    }
    
    public static void printVetor(int[] listInteger) {
        System.out.print("[");
        for (int i = 0; i < listInteger.length; i++) {
            if(i < listInteger.length -1) {
                System.out.print(listInteger[i] + ", ");
            }else{
                System.out.print(listInteger[i]);
            }
        }
        System.out.println("]");
    }
    
}
