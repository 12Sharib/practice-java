package Strings;

public class DetectCapital {

  private static boolean impl(String word) {
    if(word.equals(word.toUpperCase())){
      return true;
    }else if(word.equals(word.toLowerCase())){
      return true;
    }else{
      if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
        for(int i=1;i<word.length();i++){
          if(!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')){
            return false;
          }
        }
      }else{
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {
    impl("USA");
  }

}
