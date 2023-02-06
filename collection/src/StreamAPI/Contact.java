package StreamAPI;

import java.util.Objects;

public class Contact {
    private String name;
    private Integer number;

    public Contact(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public Integer getNumber() {
        return this.number;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Contact contact = (Contact)o;
            return this.name.equals(contact.name) && this.number.equals(contact.number);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.number});
    }

    public String toString() {
        return "Contato{nome='" + this.name + "', numero='" + this.number + "'}";
    }
}
