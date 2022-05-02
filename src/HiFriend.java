public class HiFriend {
    public static void main(String[] args){
    String s1 = new String("Hi");
    String s2 = new String ("Larry");
    String s3 = new String ("Sprinkle");
    String s4 = new String ("!");
    String s = String.format("%s %s %s%s", s1, s2, s3, s4);
    System.out.println(s.toString());
    }
}
