class week7 {
 int count(char c, String text) {
 int res = 0; 
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                res++; 
            }
        }
        return res; 
}

boolean allUpperCase(String text){
    if(text.length() == 0){
        return true;
    }
    for(int i = 0; i< text.length(); i++){
        if(!(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')){
            return false;
        }
    }
    return true;
}

boolean isWord(String text){
    if(text.isEmpty() == true){
        return false;
    }
    
    for(int i = 0; i < text.length(); i++){
        if(!((text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') ^ ( text.charAt(i) >= 'a' && text.charAt(i) <= 'z')))
        return false;
    }
    return true;
}

boolean isPalindrome(String text){
    for(int i = 0; i < text.length()/2 ; i++){
        if(!(text.charAt(i) == text.charAt(text.length() - 1 -i))){
            return false;
        }
    }
    return true;
}

int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");
        return words.length;
    }

String wrap(String text, char c){
    char inicio, fim;    
        
        if (c == '(') {
            inicio = '(';
            fim = ')';
        } else if (c == '[') {
            inicio = '[';
            fim = ']';
        } else if (c == '{') {
            inicio = '{';
            fim = '}';
        } else {
            inicio = c;
            fim = c;
        }
        
    return inicio + text + fim;
}

int count(String s, String[] array) {
    int res = 0;
    for(int i = 0; i < array.length; i++){
        if(array[i].equals(s)){
            res++;
        }
    }
    return res;
}

String largest(String[] array){
    int length = array[0].length();
    String res = array[0];
    for(int i = 1; i < array.length; i++){
        if(array[i].length() > length){
            length = array[i].length();
            res = array[i];
        }
    }
    
    return res;
}

String join(String[] array, String s){
    String res = array[0];
    if (array.length == 0) {
            return "";
    }
    for(int i = 1; i<array.length; i++){
        res = res + s + array[i];
    }
        
    
    return res;
} 
}

