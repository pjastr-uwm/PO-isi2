package pl.edu.uwm.zad15;

import java.util.Objects;

class Programmer extends Employee{
    private String programmingLanguage;

    public Programmer(String firstName, String lastName, double salary, String programmingLanguage) {
        super(firstName, lastName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString()+",  programmingLanguage="+ programmingLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Programmer that = (Programmer) o;

        return Objects.equals(programmingLanguage, that.programmingLanguage);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (programmingLanguage != null ? programmingLanguage.hashCode() : 0);
        return result;
    }
}
