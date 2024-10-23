package list;

public class Mid extends List {

    // 8
    static List negateAll(List a) {
    	if (!a.empty()){
            return List.cons(-a.head(), negateAll(a.tail()));
        } 
        return List.nil();
    }

    // 9
    static int find(int x, List a) {
    	if(a.head()==x){
            return 0;
        }else if (a.empty()){
            return -1;
        }else{
            int result = find(x, a.tail());
            if (result == -1){
                return -1;
            }else {
                return result+1;
            }
        }
    }
//
//    // 10
    static boolean allPositive(List a) {
    	if(a.head() < 0){
            return false;
        }else if (a.empty()){
            return true; 
        }else{
            return allPositive(a.tail());
        }
    }
//
//    // 11
    static List positives(List a) {
    	 if(a.empty()){
    		 return List.nil();
    	 }else if(a.head() > 0){
    	     return List.cons(a.head(),positives(a.tail()));
    	 }else{
    	     return positives(a.tail());
    	 }
    }
//
//    // 12
    static boolean sorted(List a) {
    	if(a.empty()) {
            return true; 
        }
    	
    	if(!a.tail().empty() && a.head() > a.tail().head()){
            return false; 
        }
        return sorted(a.tail()); 
    }
//    
//    // 13
    static List merge(List a, List b) {
    	if(!a.empty() && !b.empty()){
            if(a.head() <= b.head()){
                return List.cons(a.head(),merge(a.tail(),b));
            }else{
                return List.cons(b.head(), merge(a,b.tail()));
            }
        }
        if(a.empty()){
            return b;
        }
        ///return
        return a;
    }
//
//    // 14
    static List removeDuplicate(List a) {
    	 if(a.empty()){
    	    return a;
    	 }
    	 List restWithoutDuplicates = removeDuplicate(a.tail());
    	 if (!restWithoutDuplicates.empty() &&a.head()==restWithoutDuplicates.head()){
    	     return restWithoutDuplicates;
    	 }else{
    	     return List.cons(a.head(),restWithoutDuplicates);
    	 }
    }
    
//    // 15
    static List skip(int x, List a) {
    	if(a.empty()){
            return List.nil();
        }
    	if(a.head() == x){
            return skip(x, a.tail());
        }else{
            return List.cons(a.head(),skip(x, a.tail()));
        
        }
    }
}   
