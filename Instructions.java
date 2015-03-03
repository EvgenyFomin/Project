
public class Instructions {
    boolean bool = true;
    public String Instructions(String s) {
        if (s.equals("u "))   {
            s = "U E' ";
        } else if (s.equals("u' ")) {
            s = "U' E ";
        } else if (s.equals("f ")) {
            s = "F S ";
        } else if (s.equals("f' ")) {
            s = "F' S' ";
        } else if (s.equals("d ")) {
            s = "D E ";
        } else if (s.equals("d' ")) {
            s = "D' E' ";
        } else if (s.equals("r ")) {
            s = "R M' ";
        } else if (s.equals("r' ")) {
            s = "R' M ";
        } else if (s.equals("l ")) {
            s = "L M ";
        } else if (s.equals("l' ")) {
            s = "L' M' ";
        } else if (s.equals("b ")) {
            s = "B S' ";
        } else if (s.equals("b' ")) {
            s = "B' S ";
        } else bool = false;
        return (s);

    }
}
