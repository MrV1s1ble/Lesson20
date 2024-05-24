import java.util.Scanner;

public interface InsertSmt {

    default String insertSmt() {
        return new Scanner(System.in).nextLine();
    }
}
