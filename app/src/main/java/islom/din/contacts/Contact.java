package islom.din.contacts;

public class Contact {
    private int id;
    private String name;
    private String lastName;
    private int telNumber;
    private String mail;



    public Contact(int id, String name, String lastName, int telNumber, String mail) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.telNumber = telNumber;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
