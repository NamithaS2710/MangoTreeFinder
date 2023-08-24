import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        System.out.print("Enter the tree number: ");
        int treeNumber = scanner.nextInt();

        // Check if the given tree is a mango tree
        if (isMangoTree(rows, cols, treeNumber)) {
            System.out.println("Yes, the given tree is a mango tree.");
        } else {
            System.out.println("No, the given tree is not a mango tree.");
        }
    }

    static boolean isMangoTree(int rows, int cols, int treeNumber) {
        if (treeNumber == 1) {
            return true;
        } else if (treeNumber <= cols || treeNumber % cols == 1 || treeNumber % cols == 0) {
            return true;
        }
        return false;
    }
}