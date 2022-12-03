public class StringBild {
    public static void main(String[] args) {
        String s = "prived";
        StringBuilder bl = new StringBuilder();
        //s+= bl;
        //s.charAt(0);
        for (int i=0; i < s.length(); i++) {
            bl.append(s.charAt(s.length()-1-i));          
        }
        System.out.println(bl);
    }
    
}
