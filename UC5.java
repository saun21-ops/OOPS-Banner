public class UC5 {

    public static void main(String[] args) {

        // Combined declaration + initialization using String.join()
        String[] lines = {
            String.join(" ", "   ***   ", "   ***   ", "  *****  ", "   ***** "),
            String.join(" ", " **   ** ", " **   ** ", "**     **", " **      "),
            String.join(" ", "**     **", "**     **", "**     **", "**       "),
            String.join(" ", "**     **", "**     **", "******** ", "  *****  "),
            String.join(" ", "**     **", "**     **", "**       ", "      ** "),
            String.join(" ", " **   ** ", " **   ** ", "**       ", " **   ** "),
            String.join(" ", "   ***   ", "   ***   ", "**       ", "  *****  ")
        };

        // Enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}