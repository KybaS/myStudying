package override;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String email;

    public Person(final String firstName, final String lastName, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj){
            return true;
        }

        if (getClass() != obj.getClass()){
            return false;
        }

        final Person other = (Person)obj;
        if (email == null){
            if (other.email != null){
                return false;
            }
        }else if (!email.equals((other.email))){
            return false;
        }

        if (firstName == null){
            if (other.firstName != null){
                return  false;
            }
        }else if (!firstName.equals(other.firstName)){
            return false;
        }

        if (lastName == null){
            if (other.lastName != null){
                return false;
            }
        }else if (!lastName.equals((other.lastName))){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode(){
        final int prime = 31;

        int result = 1;
        result = prime * result + ((email == null) ?0 : email.hashCode());
        result = prime * result + ((firstName == null) ?0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ?0 : lastName.hashCode());
        return result;
    }
}
