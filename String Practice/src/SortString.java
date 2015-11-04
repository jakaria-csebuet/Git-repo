/**
 * Created by MD on 10/10/2015.
 */
public class SortString {
    static String arr[] = {
            "Now", "is", "the", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"
    };

    public static void main(String[] args) {
        for(int i = 0 ; i < arr.length ; i++ ){
            for(int j = (arr.length -1) ; j > -1 ; j-- ){
                if(arr[j].compareToIgnoreCase(arr[i]) < 0){
                    String t = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = t ;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; ++i){
            System.out.println(arr[i]);
        }
    }
}
