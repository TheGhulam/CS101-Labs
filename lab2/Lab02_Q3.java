import java.util.Scanner;

public class Lab02_Q3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        // Input:   War and Peace    
        System.out.print("Enter the title: ");
        String title = in.nextLine();
        in.close();

        // Output
        System.out.println("--------------------------------------");
        System.out.println("Number of characters:" + title.length());
        System.out.println("All uppercase:" + title.toUpperCase());
        System.out.println("Remove leading and trailing blank characters:" + title.strip());
        System.out.println("Character at index position 5:" + title.charAt(5));
        System.out.println("Title from 3rd character to 8th character (not included): " + title.substring(2, 7));
        System.out.println("First occurence of character 'a':" + title.indexOf('a'));
        System.out.println("Last occurence of character 'a':" + title.lastIndexOf('a'));
    }
}
