class week6 {
  
}

record Range(int min, int max) {

}

class RangeUtil {
    static int length(Range r) {
        if(r.min() > r.max()){
            return 0;
        }
        return r.max() - r.min() + 1;
    }
    
    static int sum(Range r){
        int res = 0;
        for(int i = r.min() ;i<= r.max(); i++){
            res = res + i;
        }
        return res;
    }
    
    static Range indexes(int[] array){
        if(array.length == 0){
          return new Range(0, -1);  
        }
        int max = array.length - 1;
        int min = 0;
        return new Range(min, max);
    }
    
    static Range expand(Range r, int n){
        if(n < 0){
            return new Range(r.min() + n, r.max());
        }
        else{
            return new Range(r.min(), r.max() + n);
        }
    }
    
    
}

record Range(int min, int max) {
    boolean isEmpty() {
        if(min > max){
            return true;
        }
        return false;
    }
    int length() {
        if(min > max){
            return 0;
        }
        return max - min + 1;
    }
    
    boolean includes(int n) {
        if(n >= min && n <= max){
            return true;
        }
        return false;
    }
    
    boolean excludes(int n) {
        if(n >= min && n <= max){
            return false;
        }
        return true;
    }
    
    boolean isValidFor(int[] array){
        if(max <= array[array.length - 1] && min >= array[0]){
            return true;
        }
        return false;
    }
    
    boolean contains(Range r){
        if(r.min >= min && r.max <= max){
            return true;
        }
        return false;
    }
    
    Range expand(int n){
        if(n < 0){
            return new Range(min + n, max);
        }
        else{
            return new Range(min, max + n);
        }
    }
}

class arrayFunctions{
    static int sum(int[] array, Range r){
        int res = 0;
        if(new Range(r.min(), r.max()).isValidFor(array)){
        for(int i = r.min() ;i<= r.max(); i++){
            res = res + array[i];
        }
        return res;
            
        }
        return res;
    }
    
    static int[] subArray(int[] array, Range r){
        int[] res = new int[new Range(r.min(), r.max()).length()];
        for(int i = 0; i < res.length; i++){
            res[i] = array[r.min() + i];
        }
        return res;
    }
    
    static Range valueRange(int[] array){
        int min = array[0];
        int max= array[array.length - 1];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        
        return new Range(min, max);
    }
    
}

record Dimension(int x, int y){
    int area(){
        return x * y;
    }
    
    int perimeter(){
        return x * 2 + y * 2;
    }
    
    boolean isSquare(){
        if(x == y){
            return true;
        }
        return false;
    }
    
    boolean isVertical(){
        if(x < y){
            return true;
        }
        return false;
    }
    
    boolean isHorizontal(){
        if(x > y){
            return true;
        }
        return false;
    }
    
    boolean largerThan(Dimension d){
        if(d.x() * d.y()  >= x * y){
            return false;
        }
        return true;
    }
    
    Dimension scale(int n){
        return new Dimension(x * n, y * n);
    }
}

record Position(int line, int column) {
   Position top(){
       return new Position(line - 1, column);
   }
   
    Position right(){
       return new Position(line, column + 1);
    }
    
    Position bottom(){
       return new Position(line + 1, column);
   }
   
     Position left(){
       return new Position(line, column - 1);
    }
    
    Position[] adjacent(){
        Position[] array = new Position[4];
        array[0] = new Position(line, column).top();
        array[1] = new Position(line, column).right();
        array[2] = new Position(line, column).bottom();
        array[3] = new Position(line, column).left();
        
        return array;
    }
    
    Position[] adjacentNonNegative(){
        Position[] res = new Position(line, column).adjacent();
        int total = 0;

        for(int i = 0; i < 4; i++){
            if(res[i].line >= 0 && res[i].column >= 0){
                total = total + 1 ;
            }
        }
        
        Position[] array = new Position[total];
        int a = 0;
        
        for(int i = 0; i < 4; i++){
            if(res[i].line >= 0 && res[i].column >= 0){
                array[a] = res[i] ;
                a = a + 1;
                
            }
        }
        
        
        return array;
    }

}

class positionUtil{
    static Position[] diagonal(int n){
        Position[] array = new Position[n];
        for(int i = 0; i < n; i++){
            array[i] = new Position(i,i);
        }
        
        return array;
    }
    
    static Position[] positions(Dimension d) {
        int n = d.x() * d.y(); 
        Position[] array = new Position[n];  
        int index = 0;

        for (int l = 0; l < d.y(); l++) { 
            for (int c = 0; c < d.x(); c++) { 
                array[index] = new Position(l, c); 
                index++;
            }
        }
    
        return array;
    }
    
    static boolean contains(Position[] array, Position a){
        for(int i = 0; i < array.length; i++){
            if(array[i].line() == a.line() && array[i].column() == a.column()){
                return true;
            }
        }
        return false;
    }
    
}

record Point(double x, double y){
    boolean isOrigin(){
        if(x == 0.0 && y == 0.0){
            return true;
        }
        return false;
    }
    
    Point scale(double n){
        return new Point(x * n, y * n);
    }
    
    Point sum(Point p){
        return new Point(x + p.x(), y + p.y());
    }
    
    Point sum(double a, double b){
        return new Point(x + a, y + b);
    }
    
    double distance(Point p){
        return Math.sqrt(Math.pow((p.x() - x), 2) + Math.pow((p.y() - y), 2));
    }
    
}