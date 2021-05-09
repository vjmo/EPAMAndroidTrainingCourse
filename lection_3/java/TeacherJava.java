public class TeacherJava {
    private String name;
    private String surname;
    private int age;
    private int numClass;
    private double workExperience;

    public TeacherJava (String _name, String _surname, int _age, int _numClass, double _workExperience){
        name = _name;
        surname = _surname;
        age = _age;
        numClass = _numClass;
        workExperience = _workExperience;
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
}
