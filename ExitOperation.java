package package_bookmanager.operation;

import package_bookmanager.book.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("goodbye!");
        System.exit(0);
    }
}
