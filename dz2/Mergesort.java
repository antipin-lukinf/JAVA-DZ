package DZ.dz2;

public class Mergesort {

    public static int [] sortArray(int[] arrayA){ // сортировка Массива который передается в функцию    
        // проверяем не нулевой ли он?
            if (arrayA == null) {
            return null;    }
        // проверяем не 1 ли элемент в массиве?
            if (arrayA.length < 2) {
            return arrayA; 
            }
            // возврат в рекурсию в строки ниже см комменты.
        
            // копируем левую часть от начала до середины
            int [] arrayB = new int[arrayA.length / 2];
            System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
            // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
            int [] arrayC = new int[arrayA.length - arrayA.length / 2];
            System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);
            // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
            // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
            // точнее правую часть от него и опять вернет его назад
            arrayB = sortArray(arrayB);
            // левая часть возврат из рекурсии строкой return arrayA;
            arrayC = sortArray(arrayC);
            // правая часть возврат из рекурсии строкой return arrayA;
            // далее опять рекурсия возврата слияния двух отсортированных массивов
            return mergeArrays(arrayB, arrayC);
        }
    
    static int[] mergeArrays(int[] a1, int[] a2) {
        int[] b = new int[a1.length + a2.length];
        int positionA1 = 0;    int positionA2 = 0;
        for(int i = 0; i < b.length; i++) {
            if(positionA1 == a1.length){
                b[i] = a2[positionA2];
                positionA2++;
                }
                else if(positionA2 == a2.length){
                b[i] = a1[positionA1];
                positionA1++;
                }
                else if(a1[positionA1] < a2[positionA2]){
                b[i] = a1[positionA1];
                positionA1++;
                }
                else{
                b[i] = a2[positionA2];
                positionA2++;        }
        }
        return b;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[]a=new int[]{9,1,5,3,6};
        int[]b=sortArray(a);
        for(Integer i:b){
            System.out.print(i);
        }
        
}}
   