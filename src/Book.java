public class Book {
    private String ISBN;
    private String Name;
    private boolean flag;
    public Book(String ISBN, String name, boolean flag) {
        this.ISBN = ISBN;
        Name = name;
        this.flag = flag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
