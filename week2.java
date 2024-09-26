class week2 {
 double abs(double n) {
    if(n<0) {
        return -n;
    }
    else {
        return n;
    }
}


int max(int a, int b) {
    if(a > b){
        return a;
    }
    else{
        return b;
    }
}


int min(int a, int b) {
    if(a < b){
        return a;
    }
    else{
        return b;
    }
}



int irsGroup(int n){
    if (n < 10000){
        return 1;
    }
    else {
        if ( n < 25500){
            return 2;
        }
        else {
            if(n <= 48500){
                return 3;
            }
            else {
                return 4;
            }
        }
    }
}


double irsTax(int n){
   double taxa = 0.0;
    if (n == 1){
        taxa = 0.12;
    }
    else if (n == 2) {
        taxa =0.18;
    }
    else if (n==3){
        taxa= 0.23;
    } 
    else if (n== 4) {
        taxa = 0.29;
    }
    return taxa;
}


static void varAssign() {
int n = 1;
n = 2;
n = n + 1;
n = n +1;
n = n +1;


}

static void varAssignDiv() {
int v = 2024;
v = v/10;
v = v/10;
v = v/10;


}

int firstDigit(int n) {
    while   (n>=10){
        n = n/10;
    }
    return n;
}


static void naturalsIterator() {
int i = 1;
while(i < 5) {
   i = i + 1;
}

}

int sumNaturals(int max){
int count = 1;
int total = 0;
    while(count <= max){
        total = total + count;
        count = count + 1;
    }
    return total;
}


static void reverseIteration() {
int x = 5;
while(x>0){
    x= x -1;
}

}

int powerOfTwo(int e){
    int count = 0;
    int total = 1;
    while(count != e){
        total = total* 2;
        count = count + 1;
    }
    return total;
}


boolean isMultiple(int a, int b){
    if( b == 0 ){
        return false;
    }
            while (a >= b) {  
            a = a - b; 
        }
        
        return a == 0;
}


int intDivision(int a, int b){
    int total = -1;
    while( a >= 0 ){
        a = a - b;
        total = total + 1;
    }
    return total;
}


static void iterationStepTwo() {
int p = 2;
while(p<10){
    p = p +2;
}

}

int sumEvenBetween(int min, int max){
    int total = 0;
    while (min <= max) {
        if( min % 2 == 0 ){
            total = total + min;
        }
        min = min +1;
        
    }
    return total;
}


char nextLetter(char n){
    if(n == 'z'){
        return 'a';
    }
    return (char)(n + 1);
}


int gcd(int a, int b){
    while(b != 0){
        int n = a % b;
        a = b;
        b = n;
        
    }
    return a;
}


int invertInt(int n){
            int invertido = 0;
            
        while (n != 0) {
            int ultimoDigito = n % 10;
            invertido = invertido * 10 + ultimoDigito;
            n /= 10;
        }
        
        return invertido;
}


int fib(int n){
    int count = 0;
    int res = 1;
    int prev = 0;
    int teste = 0;
    if (n == 0 ){
        return 0;
    }
    while (count != n){
        res = res + teste;
        teste = prev;
        prev = res;
        count = count + 1;
    }
    return res;
}
 
}

class IrsUtil {
    static int irsGroup(int n){
    if (n < 10000){
        return 1;
    }
    else {
        if ( n < 25500){
            return 2;
        }
        else {
            if(n <= 48500){
                return 3;
            }
            else {
                return 4;
            }
        }
    }
}
static double irsTax(int n){
   double taxa = 0.0;
    if (n == 1){
        taxa = 0.12;
    }
    else if (n == 2) {
        taxa =0.18;
    }
    else if (n==3){
        taxa= 0.23;
    } 
    else if (n== 4) {
        taxa = 0.29;
    }
    return taxa;
}

}
