package pl.sda.zamowienia;

public class Customer {
    private String name;
    private String lastname;
    private String email;
    private int age;

    public Customer(String name, String lastname, String email, int age) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    public Customer() {
    }

    public boolean checkEmail(String email) {
        return email.contains("@");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameProductException {
        if (!name.equals(name.toUpperCase())) {
            throw new NameProductException("Użyj wielkich liter");
        } else {
            this.name = name.toUpperCase();
            this.name = name;
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) throws NameProductException {
        if (!lastname.equals(lastname.toUpperCase())) {
            throw new NameProductException("Użyj wielkich liter");
        } else {
            this.lastname = lastname;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        if (!this.checkEmail(email)) {
            throw new EmailException("Niepoprawny email");
        } else {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeCustomerException {
        if (age < 18) {
            throw new AgeCustomerException("Jesteś niepełnoletni");
        } else {
            this.age = age;
        }
    }
}
