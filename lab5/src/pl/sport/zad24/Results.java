package pl.sport.zad24;

class Results {
    private String firstName;
    private String lastName;
    private int[] results;

    public Results(String firstName, String lastName, int size){
        this.firstName = firstName;
        this.lastName = lastName;
        results = new int[size];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getResults() {
        return results.clone();
    }

    public void setResults(int[] results) {
        this.results = results.clone();
    }

    public void addResult(int index, int result){
        if (0<= index && index < this.results.length){
            this.results[index] = result;
        }
    }

    public double averageResult(){
        double sum = 0;
        for(int elem: results)
        {
            sum += elem;
        }
        sum /= results.length;
        return sum;
    }
}
