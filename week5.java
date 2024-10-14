class week5 {
 static void incrementation() {
int i = 1;
    while(i<4){
        i++;
    }
    
}

static void cumulativeAssign() {
int n = 1;
n += 2;
n += 3;
n += 4;
}

static void whileToFor() {
int s = 0;

for(int i = 1; i <= 5; i++){
    s += i;
}
}

void invertValues(boolean[] array){
    for(int i = 0 ; i < array.length; i++){
        array[i] = !array[i];
    }
}

void replace(char[] letters, char find, char replace) {
 for(int i = 0; i < letters.length; i++){
     if(letters[i] == find){
         letters[i] = replace;
     }
 }
}

void replaceFirst(char[] letters, char find, char replace) {
 for(int i = 0; i < letters.length; i++){
     if(letters[i] == find){
         letters[i] = replace;
         return;
     }
 }
}

void replaceLast(char[] letters, char find, char replace) {
 for(int i = letters.length - 1; i >= 0; i--){
     if(letters[i] == find){
         letters[i] = replace;
         return;
     }
 }
}

void constrain(double[] array, double min, double max){
    for(int i = 0; i < array.length; i++){
        if(array[i] < min)
        array[i] = min;
        if(array [i] > max)
        array[i] = max;
    }
} 
}

class SumArrayAbs {
     static void arrayToAbs(int[] array) {
         for(int i = 0; i < array.length; i++)
             if(array[i] < 0)
                 array[i] = -array[i];
     }
     
     static int sum(int[] array) {
         int s = 0;
         for(int i = 0; i < array.length; i++)
             s += array[i];
         return s;
     }
     
     static int sumAbs(int[] array) {
        int[] abs = new int[array.length];
        abs = ArrayCopy.copy(array);
        arrayToAbs(abs);
        return sum(abs);
     }
 }

 class ArrayOrder {
    static void swap(int[] array, int i, int j) {
        int swap = array[i];
        array [i] = array[j];
        array[j] = swap;
    }
    
    static void invert(int[] array){
        
        for(int i = 0; i < array.length/2; i++){
            swap(array, i, array.length -1 -i);
        }
    }
    
}

class shuffle{
    static void randomSwap(int[] array){
        int i = RandomInts.randomUntil(array.length - 1);
        int j = RandomInts.randomUntil(array.length - 1);
        if(i > j){
            int t = i;
            i = j;
            j = t;
        }
        ArrayOrder.swap(array, i, j);
    }
    
    static void shuffle(int[] array){
        for(int i = array.length - 1; i > 0; i--){
            int random = RandomInts.randomWithin(0, i);
           ArrayOrder.swap(array, random, i);
        }
    }
}

class arrayShift{
   static void shiftLeft(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int j = array[i];
            if(i - 1 < 0){
                array[i] = array[array.length - 1];
                array[array.length - 1] = j;
            }
            else{
                array[i] = array[i - 1];
                array[i - 1] = j;
            }
        
        }
    }
    
    
     static void shiftRight(int[] array) {
        if (array.length > 1) {
            int last = array[array.length - 1]; 
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = last; 
        }
    }
    
}

class bubbleSort{
    
    static void sort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayOrder.swap(array, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
    
}