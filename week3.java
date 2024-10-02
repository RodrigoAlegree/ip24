class week3 {
 boolean isPerfectSquare(int n) {
   double num = Math.sqrt(n);
    if(Math.floor(num) == num ){
        return true;
    }
    return false;
} 
}

class EvenOdd {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isOdd(int n){
        return !isEven(n);
    }
}

class RandomInts {
    static int random() {
        return (int) (Math.random() * 1000000);
    }

    static int randomUntil(int max) {
        return (int) (Math.random() * max); 
    }

    static int randomWithin(int min, int max) {
        return (int) (Math.random() * (max-min) + min);
    }
}

class EvenOddRandom {
    static int random() {
        return (int) (Math.random() * 1000000);
    }

    static int randomUntil(int max) {
        return (int) (Math.random() * max); 
    }

    static int randomWithin(int min, int max) {
        return (int) (Math.random() * (max-min) + min);
    }
    
     static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isOdd(int n){
        return !isEven(n);
    }
    
    static int  randomEven(int max){
        int num = (int) (Math.random() * max);
        if (isEven(num) == true){
            return num;
        }
        else{
            return num +1;
        }
        
    }
    static int  randomOdd(int max){
        int num = (int) (Math.random() * max);
        if (isOdd(num) == true){
            return num;
        }
        else{
            return num +1;
        }
        
    }
}

class Divisors {
    static int countDivisors(int n){
        int count = 0;
        int div = 1;
        int res = 0;
        while (count <= n){
            if( n % div == 0 ) {
                res = res + 1;
            }
            div = div + 1;
            count = count + 1;
        }
        return res;
    }
    
    static int sumProperDivisors(int n){
        int sum = 0;
        int div = 1;
        while(div < n){
            if (n % div == 0){
                sum = sum + div;
            }
            div = div + 1;
        }
        return sum;
    }
    
    static boolean isPrime(int n){
        if(countDivisors(n) == 2){
            return true;
        }
        return false;
    }
}

class primeNumbers {
    
    static int countDivisors(int n){
        int count = 0;
        int div = 1;
        int res = 0;
        while (count <= n){
            if( n % div == 0 ) {
                res = res + 1;
            }
            div = div + 1;
            count = count + 1;
        }
        return res;
    }
    
    
    static boolean isPrime(int n){
        if(countDivisors(n) == 2){
            return true;
        }
        return false;
    }
    
    static int countPrimes(int max){
        int count = 0;
        int total = 1;
        while( total <= max){
            if(isPrime(total) == true){
                count = count + 1;
            }
            total = total + 1;
        }
        
        return count;
    }
    
    static boolean existsPrimeBetween(int a, int b){
        int count = 0;
        int total = a +1;
        while( total < b){
            if(isPrime(total) == true){
                count = count + 1;
            }
            total = total + 1;
        }
        if(count >= 1){
            return true;
        }
        return false;
    }
}

class perfectNumbers{
    static int countDivisors(int n){
        int count = 0;
        int div = 1;
        int res = 0;
        while (count <= n){
            if( n % div == 0 ) {
                res = res + 1;
            }
            div = div + 1;
            count = count + 1;
        }
        return res;
    }
    
    static int sumProperDivisors(int n){
        int sum = 0;
        int div = 1;
        while(div < n){
            if (n % div == 0){
                sum = sum + div;
            }
            div = div + 1;
        }
        return sum;
    }
    
    static boolean isPrime(int n){
        if(countDivisors(n) == 2){
            return true;
        }
        return false;
    }
    
    static boolean isPerfect(int n){
        if( sumProperDivisors(n) == n){
            return true;
        }
        return false;
    }
    
    static int countPerfectNumbers(int n){
        int count = 1;
        int res = 0;
        while(count <= n){
            if(isPerfect(count) == true){
                res = res +1;
            }
            count = count + 1;
        }
        return res;
        
    }
}

class LargerPrimeDiff {
    static int countDivisors(int n){
        int count = 0;
        int div = 1;
        int res = 0;
        while (count <= n){
            if( n % div == 0 ) {
                res = res + 1;
            }
            div = div + 1;
            count = count + 1;
        }
        return res;
    }
    
    
    static boolean isPrime(int n){
        if(countDivisors(n) == 2){
            return true;
        }
        return false;
    }
    
    static int largestPrimeDiff(int n){
        int count = 0;
        int num = n-1;
        int res = 0;
        if(isPrime(num) == true){
                num = n -1 ;
            }
        else{
            while(isPrime(num) == false){
                num = num - 1;
            }
        }
        int min = num - 1;
        while(isPrime(min) == false){
            min = min - 1;
        }
        res = num - min;
        return res;
    }
}