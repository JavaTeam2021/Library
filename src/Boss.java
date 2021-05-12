public class Boss extends Person {
    private String username;
    private String password;

    //crud employees

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boss(String name, String family, int age, int nId, String username, String password) {
        super(name, family, age, nId);
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString()+"Boss{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
