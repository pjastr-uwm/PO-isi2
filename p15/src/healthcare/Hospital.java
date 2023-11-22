package healthcare;

import java.util.Objects;

class Hospital {

    private String name;
    private String location;
    private double capacity;

    public Hospital(String name, String location, double capacity){
        this.name = name;
        this.location = (location == null || location.isEmpty())
                ? "ul. Zdrowia 123, 00-999 Warszawa" : location;
        this.capacity = capacity > 0 ? capacity : 50.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location != null && !location.isEmpty())
            this.location = location;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if (capacity >0)
            this.capacity = capacity;
    }

    @Override
    public String toString(){
        if (name == null || name.isEmpty()){
            return getClass().getSimpleName()+": Location: "+location
                    +". Capacity: "+capacity+".";
        }
        return getClass().getSimpleName()+":Name: "+name+". Location: "+location
                +". Capacity: "+capacity+".";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Hospital hospital = (Hospital) obj;
        if (!Objects.equals(name, hospital.name)) return false;
        if (!Objects.equals(location, hospital.location)) return false;
        return Double.compare(capacity, hospital.capacity) == 0;
    }

    @Override
    public int hashCode(){
        int result = name == null ? 0 : name.hashCode();
        result = 31* result + location.hashCode();
        result = 31 * result + Double.valueOf(capacity).hashCode();
        return result;
    }

    public void  expand(double arg){
        capacity += arg;
        if (capacity >1000){
            capacity = 1000;
        }
    }
}
