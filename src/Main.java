public class Main {
    public static void main(String[] args) {
       //character array to string
        char[] ch ={'J','a','v','a',' ','S','t','r','i','n','g'};
        String s =new String(ch);
        System.out.println(s);

        String str ="Java String";
        System.out.println(str);

        String a = "Hello";
        System.out.println("Hello".equals(a));//SHA256 algorithm
        System.out.println("hello".equals(a));
        System.out.println("hello".equalsIgnoreCase(a));

        String text = "NIBM Galle Branch";
        //Get the length of the string
        System.out.println(text.length());
        //Substring
        System.out.println(text.substring(5));
        System.out.println(text.substring(5,10));
        //Get character index
        //This returns first occurrence of the given character
        System.out.println(text.indexOf('B'));
        //This returns last occurrence of the given character
        System.out.println(text.lastIndexOf('B'));
        //Get character at given index
        System.out.println(text.charAt(5));
        //Convert to uppercase
        System.out.println(text.toUpperCase());
        //Convert to lowercase
        System.out.println(text.toLowerCase());
        //Text start with
        System.out.println(text.startsWith("NIBM"));
        //Text contains
        System.out.println(text.contains("Galle"));


    }
}