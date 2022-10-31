public class StringProcessor {
    public static String getMultipliedString(String string,int n){
        if (string == null) throw new IllegalArgumentException("String can`t be null");
        if (n<0) throw new IllegalArgumentException("n < 0!");
        if (n==0) return "";
        String res = new String("");
        for (int i= 0; i<n;i++) res = res.concat(string);
        return res;
    }
    public static int getNumberOfInputs(String string1,String string2){
        if(string2==null) throw  new IllegalArgumentException("Target can`t be null");
        if(string2=="") throw  new IllegalArgumentException("Target can`t be empty");
        return (string1.length()-string1.replace(string2,"").length()/string2.length());
    }
}
