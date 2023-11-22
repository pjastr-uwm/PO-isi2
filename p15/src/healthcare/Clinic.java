package healthcare;

import java.util.Objects;

public class Clinic extends Hospital{

    private String specialization;
    private double rating;

    public Clinic(String name, String location, double capacity,
                  String specialization, double rating){
        super(name, location, capacity);
        this.specialization = (specialization == null || specialization.isEmpty())
                               ? "ogólna" :specialization;
        this.rating = (rating >=0 && rating <= 5) ? rating : 3;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization != null && !specialization.isEmpty())
            this.specialization = specialization;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (0<= rating && rating<=5)
            this.rating = rating;
    }

    @Override
    public String toString(){
        return super.toString() +"\n"
                +"Specialization: "+specialization+". Rating: "+rating+".";
    }

    @Override
    public boolean equals(Object obj){
        if (!super.equals(obj)) return false;
        Clinic clinic = (Clinic) obj;
        if (!Objects.equals(specialization, clinic.specialization)) return false;
        return Double.compare(rating, clinic.rating) ==0;
    }

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result =31 * result + specialization.hashCode();
        result = 31 * result +Double.valueOf(rating).hashCode();
        return result;
    }

    @Override
    public void expand(double arg){
        setCapacity(getCapacity() + arg);
        if (getCapacity() > 500){
            setCapacity(500);
        }
        rating +=0.5;
        if (rating > 5)
            rating =5;
    }
}
