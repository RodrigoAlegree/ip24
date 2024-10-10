class week4 {
 static void arrayRead() {
int[] numbers = {4, 3, 2, 1}; 
int sum = numbers[0];
sum = sum + numbers[1];
sum = sum + numbers[2];
sum = sum + numbers[3];
}

int sum(int[] array) {
    int i = 0;
    int res = 0;
    while(i < array.length){
        res = res + array[i];
        i = i + 1;
    }
    return res;
}

static void arrayOfDigits() {
int[] digits = new int[10];
int i = 0;
while(i < digits.length){
    digits[i] = i;
    i = i + 1;
}
}

int[] naturals(int n) {
    assert n >= 0 : "argumento não pode ser negativo";
    int[] nats = new int[n];
    int i = 0;
    int r = 1;
    while(i < n){
        nats[i] = r;
        r = r + 1;
        i = i + 1;
    }
    return nats;
}

boolean isOrdered(int[] array) {
    int i = 0;
    while(i < array.length - 1) {
        if(array[i] > array[i+1]) {
            return false;
        }
        i = i + 1;
    }
    return true;
}

int[] inverted(int[] array){
    int[] res = new int[array.length];
    int i = array.length - 1;;
    int n = array[i];
    int p = 0;
    while(i > 0 ){
        res[p] = n;
        i = i - 1;
        p = p + 1;
        n = array[i];
    }
    res[p] = n;
    return res;
}

boolean contains(int[] array, int n){
    int i = 0;
    while(i < array.length){
        if(array[i] == n){
            return true;
        }
        i = i + 1;
    }
    return false;
    
}

int count(int[] array, int n){
    int res= 0;
    int i = 0;
    while(i < array.length){
        if(array[i] == n){
            res = res + 1;
        }
        i = i + 1;
        
    }
    
    return res;
}

boolean isPalindrome(char[] array){
   int i = 0;
    int p = array.length - 1;
    while (i < p) {
        if (array[i] != array[p]) {
            return false;
        }
        i = i +1;
        p = p -1;
    }

    return true;
    
}

boolean areEqual(int[] a, int[] b) {
    int i = 0;
    if(a.length != b.length){
        return false;
    }
    while (i < a.length) {
        if (a[i] != b[i]) {
            return false;
        }
        i = i +1;
    }

    return true;
}

int[] merge(int[] left, int[] right) {
    int[] res = new int[left.length + right.length];
    int i = 0;
    while(i < left.length){
        res[i] = left[i];
        i = i + 1;
    }
    int p = 0;
     while(i < res.length){
        res[i] = right[p];
        i = i + 1;
        p = p + 1;
    }
    
    return res;
    
}

boolean alternatedBooleans(boolean[] array){
    int i = 0;
    while(i < array.length - 1){
        if(array[i] == array[i + 1]){
            return false;
        }
        i = i +1;
    }
    return true;
}

boolean[] invertedBooleans(boolean[] array){
    int i = 0;
    boolean[] res = new boolean[array.length];
    while(i < array.length){
        if(array[i] == true){
            res[i] = false;
        } else{
            res[i] = true;
        }
        i = i + 1;
    }
    return res;
    
} 
}

class arrayUtil{
    static boolean isEmpty(int[] array){
        int n = array.length;
        if(n == 0){
            return true;
        }
        return false;
    }
    
    static int first(int[] array){
        return array[0];
    }
    
    static int last(int[] array){
        return array[array.length - 1];
    }
    
    static int nextIndex(int[] array, int n){
        int r = n + 1;
        if(r >= array.length ^ r < 0){
            return 0;
        }
        return r;
    }
    
    static int prevIndex(int[] array, int n){
        int r = n -1;
        if(r < 0 ){
            return array.length - 1;
        }
        return r;
    }
    
    static int element(int[] array, int n){
        if(n >= array.length ^ n < 0){
            return array[array.length + n ];
        }
        return array[n];
    }
}

class ArrayCopy {
    static int[] copyNewSize(int[] array, int n){
        int[] res = new int[n];
        int i= 0;
        while(i < res.length){
            if(i < array.length){
                res[i] = array[i];
            }
            i = i+1;
        }
        return res;
    }
    
    static int[] copy(int[] array){
        int n = array.length;
        return ArrayCopy.copyNewSize(array, n);
    }


}

class randomArray{
    static int[] randomArray(int n){
        int[] array = new int[n];
        int i= 0;
        while(i < n){
            array[i] = RandomInts.randomUntil(n);
            i=i+1;
        }
        return array;
    }
    
    static int randomIndex(int[] array){
        int index = 0;
        int n = array.length;
        index = RandomInts.randomUntil(n);
        return index;
    }
    
    static int randomElement(int[] array){
        int index = 0;
        int n = array.length;
        int res = 0;
        index = RandomInts.randomUntil(n);
        res = array[index];
        return res;
    }
    
}

class doubleStats{
    static double min(double[] array) {
    double min = array[0]; 
    int i = 1; 
    while (i < array.length) {
        if (array[i] < min) {
            min = array[i];
        }
        i = i +1;
    }
    return min;
}
    
    static double max(double[] array){
        int i = array.length - 2;
        double max = array[array.length - 1];
        while(i >= 0 ){
            if(array[i] > max){
                max = array[i];
            }
            i = i - 1;
        }
        return max;
    }
    
    static double sum(double[] array){
        int i = 0;
        double res = 0.0;
        while(i < array.length){
            res = res + array[i];
            i = i +1;
        }
        return res;
    }
    
    static double average(double[] array){
        int n = array.length;
        double sum = doubleStats.sum(array);
        double res = sum / n;
        return res;
    }
}

class subArray{
    static int[] subArray(int[] array, int a, int b) {
        int[] res = new int[b - a + 1];
        int i = a;
        while( i <= b){
            res[i - a] = array[i];
            i = i + 1;
        }
        return res;
    }
    
    static int[] leftSide(int[] array, boolean n){
        int i = array.length/2;
        if (n && array.length % 2 != 0) {
            return subArray(array, 0, i); 
        } else {
            return subArray(array, 0, i - 1);  
        }
        
    }
    
    static int[] rightSide(int[] array, boolean n){
        int i = array.length/2;
        if (n && array.length % 2 != 0) {
            return subArray(array, i, array.length - 1); 
        } else {
            return subArray(array, i + 1, array.length - 1);  
        }
        
    }
}
