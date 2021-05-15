import java.util.ArrayList;
public class Shelf {
    //Book [] books used to manage books
    ArrayList<Book> books = new ArrayList<>();

    public void create(String isbn, String name, int amount) {
        boolean flag = true;
        for (int j=amount;j>0;j--){
        books.add(new Book(isbn, name, flag));
    }
    }

    public void read() {
        for (int i=0;i<books.size();i++){
            System.out.println(books.get(i).toString());
        }
    }

    public void update(String isbn,String new_name,boolean new_flag) { //to  change both flag and name
        for (int i = 0; i<books.size(); i++) {
            if (isbn.equals(books.get(i).getISBN())){
                books.get(i).setName(new_name);
                books.get(i).setFlag(new_flag);
                break;
            }else if(books.get(i)==null) {
                System.err.println("Book Not Found!");
            }
        }
    }

    public void update(String isbn,String new_name){ // to change name only
        for(int i=0;i<books.size();i++){
            if(isbn.equals(books.get(i).getISBN())){
                books.get(i).setName(new_name);

            }
            else if(books.get(i)==null){
                System.err.println("Book Not Found!");
            }
        }
    }

    public void update(String isbn,boolean new_flag){ //to change availability flag only
        for(int i=0;i<books.size();i++){
            if(isbn.equals(books.get(i).getISBN())){
                books.get(i).setFlag(new_flag);
                break;
            }else if(books.get(i)==null){
                System.err.println("Book Not Found!");
            }
        }
    }

    public void delete(String isbn){
        for(int i=0;i<books.size();i++){
            if(isbn.equals(books.get(i).getISBN())){
                books.remove(i);
            }else if(books.get(i)==null){
                System.err.println("Book Not Found!");
            }
        }
    }
}
