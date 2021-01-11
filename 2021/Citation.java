/*
Enter the author's name as 'Last name, First name':
Collins, Suzanne
Enter the title of the book:
The Hunger Games
Enter the publisher of the book:
Scholastic
Enter the year the book was published:
2008
Collins, Suzanne. The Hunger Games.
Scholastic, 2008.
 */

import java.util.Scanner;
import static java.lang.System.out;
public class Citation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        out.println("Enter the author's name as 'Last name, First name': ");
        String authorName = in.nextLine();
        out.println("Enter the title of the book: ");
        String bookTitle = in.nextLine();
        out.println("Enter the publisher of the book: ");
        String publisherName = in.nextLine();
        out.println("Enter the year the book was published: ");
        String yearPublished = in.nextLine();
        out.println(authorName + ". " + bookTitle + ".");
        out.println(publisherName + ", " + yearPublished + ".");
    }
}
