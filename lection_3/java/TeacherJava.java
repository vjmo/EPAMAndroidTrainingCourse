import java.util.Objects;

public class TeacherJava {
    private String name;
    private String surname;
    private int age;
    private int numClass;
    private double workExperience;

    public TeacherJava (String name, String surname, int age, int numClass, double workExperience){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numClass = numClass;
        this.workExperience = workExperience;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String _surname){
        this.surname = _surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setAge(int _age){
        this.age = _age;
    }

    public int getAge() {
        return age;
    }

    public void setNumClass(int _numClass){
        this.numClass = _numClass;
    }

    public int getNumClass() {
        return numClass;
    }

    public void setWorkExperience(double _workExperience) {
        this.workExperience = _workExperience;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherJava tj = (TeacherJava) o;
        return tj.name == this.name &&
                tj.surname == this.surname &&
                tj.age == this.age &&
                tj.numClass == this.numClass &&
                Double.compare(tj.workExperience, this.workExperience) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, numClass, workExperience);
    }

    @Override
    public String toString(){
        return "Name = "+ this.name +", Surname = "+this.surname + ", Age = " +
                this.age + ", Class = " + this.numClass  + ", WorkExperience = " + this.workExperience;
    }

}
