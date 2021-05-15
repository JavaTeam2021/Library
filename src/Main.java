import javax.swing.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
            System.out.print('\t');
        System.out.println("\033[0;1m~~~* Hi, Welcome! *~~~\033[0;0m");
        Boss boss = new Boss("John", "Doe", 50, 2235465, "Boss", "1234");
        Librarian librarian = new Librarian();
        Member member;
        Member_CRUD mc = new Member_CRUD();
        while (true) {
            System.out.print("1.Enter as Admin");
            for (int i = 0; i < 5; i++)
                System.out.print('\t');
            System.out.println("2.Enter as Librarian");
            System.out.print("3.Enter as Member");
            for (int i = 0; i < 5; i++)
                System.out.print('\t');
            System.out.println("4.Exit");
            System.out.print("please enter a number: ");
            int page = scanner.nextInt();
            if (page == 1) {
                while (true){
                    System.out.print("1.sign in");
                    for (int i=0;i<5;i++)
                        System.out.print('\t');
                    System.out.println("0.Back");
                    int bossch=scanner.nextInt();
                    if(bossch==1){

                        System.out.print("enter your username: ");
                        String user=scanner.next();
                        System.out.print("enter your password: ");
                        String pass=scanner.next();
                        if(user.equals(boss.getUsername()) && pass.equals(boss.getPassword())){

                            while (true) {
                                System.out.println("1.add");
                                System.out.println("2.update");
                                System.out.println("3.delete");
                                System.out.println("4.show");
                                System.out.println("0.exit");
                                System.out.print("what do you wish to do? ");
                                int choice = scanner.nextInt();
                                if (choice == 1) {
                                    System.out.print("name: ");
                                    String name = scanner.next();
                                    System.out.print("family: ");
                                    String family = scanner.next();
                                    System.out.print("age: ");
                                    int age = scanner.nextInt();
                                    System.out.print("nationalId: ");
                                    int nid = scanner.nextInt();
                                    System.out.print("employeeId: ");
                                    int eid = scanner.nextInt();
                                    boss.createLib(name, family, age, nid, eid);
                                } else if (choice == 2) {
                                    System.out.print("enter employeeId: ");
                                    int eid = scanner.nextInt();
                                    System.out.print("enter new name: ");
                                    String name = scanner.next();
                                    System.out.print("enter new age: ");
                                    int age = scanner.nextInt();
                                    boss.updateLib(eid, name, age);
                                } else if (choice == 3) {
                                    System.out.print("enter employeeId: ");
                                    int eid = scanner.nextInt();
                                    boss.deleteLib(eid);
                                } else if (choice == 4) {
                                    boss.showLib();
                                } else if (choice == 0)
                                    break;
                            }
                        }else {
                            System.err.println("Username or Password is incorrect! Try again");
                            continue;
                        }
                    }else if(bossch==0){
                        break;
                    }
                }

            } else if (page == 2) {


                //enter as a Librarian and do their job
                while (true) {
                    System.out.print("1.sign in");
                    for (int i = 0; i < 5; i++)
                        System.out.print('\t');
                    System.out.println("0.Back");
                    int libch = scanner.nextInt();
                    if (libch == 1) {
                        System.out.print("enter your username(employee ID) : ");
                        int eid = scanner.nextInt();
                        System.out.println("enter your password(national ID) : ");
                        int nid = scanner.nextInt();
                        if (boss.libSignInVerify(eid, nid)) {
                            while (true){
                                System.out.println("1.add");
                                System.out.println("2.update");
                                System.out.println("3.delete");
                                System.out.println("4.show");
                                System.out.println("5.Book Management");
                                System.out.println("0.exit");
                                System.out.print("what do you wish to do? ");
                                int choice = scanner.nextInt();
                                if (choice == 1) {
                                    System.out.print("name: ");
                                    String name = scanner.next();
                                    System.out.print("family: ");
                                    String family = scanner.next();
                                    System.out.print("age: ");
                                    int age = scanner.nextInt();
                                    System.out.print("nationalId: ");
                                    int nid1 = scanner.nextInt();
                                    System.out.print("memberId: ");
                                    int mid = scanner.nextInt();
                                    librarian.addMember(name, family, age, nid1, mid);
                                } else if (choice == 2) {
                                    System.out.print("enter the memberId of a member: ");
                                    int mid = scanner.nextInt();
                                    System.out.println("which elements do you intend to update?");
                                    System.out.println("1.name & family");
                                    System.out.println("2.name & age");
                                    System.out.println("3.age");
                                    int x = scanner.nextInt();
                                    switch (x) {
                                        case 1:
                                            System.out.print("new name: ");
                                            String name = scanner.next();
                                            System.out.print("new family: ");
                                            String family = scanner.next();
                                            librarian.updateMember(mid, name, family);
                                            break;
                                        case 2:
                                            System.out.print("new name: ");
                                            String name1 = scanner.next();
                                            System.out.print("new age: ");
                                            int age = scanner.nextInt();
                                            librarian.updateMember(mid, name1, age);
                                            break;
                                        case 3:
                                            System.out.print("new age: ");
                                            int age1 = scanner.nextInt();
                                            librarian.updateMember(mid, age1);
                                            break;
                                    }

                                } else if (choice == 3) {
                                    System.out.println("enter the member ID of the person you want to delete: ");
                                    int mid = scanner.nextInt();
                                    librarian.deleteMember(mid);
                                } else if (choice == 4) {
                                    librarian.showMember();
                                } else if (choice == 5) {

                                    //manage books
                                    while (true) {
                                        System.out.println("1.add");
                                        System.out.println("2.update");
                                        System.out.println("3.delete");
                                        System.out.println("4.show");
                                        System.out.println("0.exit");
                                        System.out.print("what do you wish to do? ");
                                        int books = scanner.nextInt();
                                        if (books == 1) {
                                            System.out.print("enter book ISBN ");
                                            String isbn = scanner.next();
                                            System.out.print("book name: ");
                                            String name = scanner.next();
                                            System.out.print("how many to add : ");
                                            int amount = scanner.nextInt();
                                            librarian.addBooks(isbn, name, amount);
                                        } else if (books == 2) {
                                            System.out.print("enter the ISBN of a book: ");
                                            String isbn = scanner.next();
                                            System.out.println("which information do you want to change?");
                                            System.out.println("1.name & flag");
                                            System.out.println("2.name ");
                                            System.out.println("3.flag");
                                            System.out.print("what do you wish to do? ");
                                            int x = scanner.nextInt();
                                            switch (x) {
                                                case 1:
                                                    System.out.print("new name: ");
                                                    String name = scanner.next();
                                                    boolean flag = false;
                                                    librarian.updateBooks(isbn, name, flag);
                                                    break;
                                                case 2:
                                                    System.out.print("new name: ");
                                                    String name1 = scanner.next();
                                                    librarian.updateBooks(isbn, name1);
                                                    break;
                                                case 3:
                                                    boolean flag1 = false;
                                                    librarian.updateBooks(isbn, flag1);
                                                    break;
                                            }

                                        } else if (books == 3) {
                                            System.out.print("enter the ISBN of the book you want to delete : ");
                                            String isbn = scanner.next();
                                            librarian.deleteBooks(isbn);
                                        } else if (books == 4) {
                                            librarian.showBooks();
                                        } else if (books == 0) {
                                            break;
                                        }

                                    }

                                } else if (choice == 0) {
                                    break;
                                }
                            }
                        }
                    } else if (libch == 0) {
                        break;
                    }
                }

            } else if (page == 3) {
                //member panel
                while (true) {
                    System.out.print("1.sign in");
                    for (int i = 0; i < 5; i++)
                        System.out.print('\t');
                    System.out.println("2.sign up");
                    System.out.println("0.Back");
                    System.out.println("enter command: ");
                    int enrollch = scanner.nextInt();
                    if (enrollch == 1) {
                        //sign in
                        System.out.print("member ID: ");
                        int memid = scanner.nextInt();
                        System.out.print("National ID: ");
                        int nid = scanner.nextInt();
                        if (librarian.memberVerifySignIn(memid, nid) || mc.memberVerifySignIn(memid,nid)) {
                            while (true) {
                                System.out.println("1.update Profile");
                                System.out.println("2.delete account");
                                System.out.println("3.show my information");
                                System.out.println("0.exit");
                                System.out.print("what do you wish to do? ");
                                int memberch = scanner.nextInt();
                                if (memberch == 1) {
                                    System.out.println("Enter your member iD: ");
                                    int mid = scanner.nextInt();
                                    System.out.print("Enter new name: ");
                                    String name = scanner.next();
                                    System.out.print("enter new Family: ");
                                    String family = scanner.next();
                                    System.out.print("enter new age: ");
                                    int age = scanner.nextInt();
                                    mc.updateProfile(mid, name, family, age);
                                } else if (memberch == 2) {
                                    System.out.print("enter username(Member ID): ");
                                    int mid = scanner.nextInt();
                                    System.out.print("enter password (national ID");
                                    int nid1 = scanner.nextInt();
                                    mc.deleteAccount(mid, nid1);
                                    break;
                                } else if (memberch == 3) {
                                    System.out.print("enter your member id for security: ");
                                    int mid = scanner.nextInt();
                                    mc.showMyInfo(mid);
                                } else if (memberch == 0) {
                                    break;
                                }
                            }
                        } else {
                            System.err.println("No User Found!");
                        }

                    } else if (enrollch == 2) {
                        //sign up
                        System.out.print("Enter your name: ");
                        String name = scanner.next();
                        System.out.print("enter your Family: ");
                        String family = scanner.next();
                        System.out.print("enter your age: ");
                        int age = scanner.nextInt();
                        System.out.println("enter your national ID(this will be your password!): ");
                        int nid = scanner.nextInt();
                        mc.memberSignUp(name, family, age, nid);
                        System.out.print("continue? (y/n): ");
                        char x = scanner.next().charAt(0);
                        if (x == 'y')
                            continue;
                        else
                            break;
                    }else if(enrollch==0){
                        break;
                    }
                }
            } else if (page == 4)
                break;
        }


        scanner.close();
        System.exit(0);
    }


}


