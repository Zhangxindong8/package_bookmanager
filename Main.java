package package_bookmanager;

import package_bookmanager.book.BookList;
import package_bookmanager.user.Admin;
import package_bookmanager.user.NormalUser;
import package_bookmanager.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 程序的入口
        // 1. 准备好书籍信息数据
        BookList bookList = new BookList();
        // 2. 创建用户(这里的多态)
        User user = login();
        // 3. 进入主循环
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name = scanner.next();
        System.out.println("请输入您的角色:(1 普通用户 2 管理员)");
        int role = scanner.nextInt();
        if (role == 1) {
            return new NormalUser(name);
        }
        return new Admin(name);
    }
}
