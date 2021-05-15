class Teacher(_name: String, _surname: String, _age: Int, _numClass: Int, _workExperience: Double) {

    var name: String = _name
        get() {
        return field.toUpperCase()
    }
    set(value) {
        if (value.length>1)
            field=value
    }

    var surname: String = _surname
        get() {
            return field.toUpperCase()
        }
        set(value) {
            if (value.length>1)
                field=value
        }

    var numClass: Int = _numClass
    set(value) {
        if((value>0) && (value<12))
            field = value
    }

    var workExperience: Double = _workExperience
        set(value) {
            if((value>0) && (value<115))
                field = value
        }

    var age: Int = _age
        set(value) {
            if((value>0) and (value<115))
                field = value
        }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if(other !is Teacher)
            return false
        else{
            if ((other.name == this.name) && (other.surname == this.surname) &&
                (other.age == this.age) && (other.numClass == this.numClass) &&
                (other.workExperience == this.workExperience))
                return true
        }
        return false
    }

    override fun hashCode(): Int {
        var prime: Int = 31
        var result: Int = 1
        result = prime * result +name.hashCode()
        result = prime * result + surname.hashCode()
        result = prime * result + age.hashCode()
        result = prime * result + numClass.hashCode()
        result = prime * result + workExperience.hashCode()
        return result
    }

    override fun toString(): String {
        val _name = "name = $name"
        val _surname = "surname = $surname"
        val _age = "age = $age"
        val _numClass = "numClass = $numClass"
        val _workExperience = "workExperience = $workExperience"
        return "$_name \n $_surname \n $_age \n $_numClass \n $_workExperience"
    }
//for me
    fun getInfo(): String{
        return "\n Name: $name\n " +
                "Surname: $surname\n " +
                "Age: $age\n " +
                "Class: $numClass\n" +
                "WorkExperience: $workExperience\n"
    }
}