package HashCodeEqual;

public class HashCodeEqualExample {

    int id;
    String name;

    public HashCodeEqualExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        // checking if both the object references are
        // referring to the same objec
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        HashCodeEqualExample hashCodeEqualExample = (HashCodeEqualExample) o;
        return (hashCodeEqualExample.name == this.name && hashCodeEqualExample.id == this.id);
    }

    @Override
    public int hashCode() {

        // We are returning the id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        return this.id;
    }
}
