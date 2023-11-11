
package work02;
import work01.Utilitor;

public class Person {
    private static int nextId =1;
    private final int id;
    private String firstname;
    private String lastname;
    
    public Person(String firstname, String lastname) {
        Utilitor.testString(firstname);
        Utilitor.testString(lastname);
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", firstname='").append(firstname).append('\'');
        sb.append(", lastname='").append(firstname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        Utilitor.testString(firstname);
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        Utilitor.testString(lastname);
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj; 
    }
    
}
