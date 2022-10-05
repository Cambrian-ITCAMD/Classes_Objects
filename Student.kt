class Student(){


    private var _name: String = "Student Template"
    private var _id: Int = 1
    private var _hasCamera: Boolean = false
    private var _jav1001Grade: Float = 0f

    constructor(name: String, id: Int = 1): this(){
      this._name = name
      this._id = id
    }
/*
    constructor(name: String, id: Int): this(){
      this._name = name
      this._id = id
    } */

    // get methods or accessors
    fun getName(): String{ return _name }
    fun getID(): String{
      var id_string = _id.toString()
      while(id_string.length < 6){
        id_string = "0" + id_string
      }
      return "A00" + id_string }
    fun hasCamera(): Boolean{ return _hasCamera }
    fun getGrade(): Float{ return _jav1001Grade }

    fun setName(name: String){ _name = name }
    fun setCamera(camera: Boolean){ this._hasCamera = camera }
    fun setGrade(grade: Float){
      if(grade >= 0 && grade <= 100){
        _jav1001Grade = grade
      }
      else{
        //println("Invalid grade")
        throw Exception("Invalid grade: " + grade.toString())
      }
    }
}




/*
    Java

    private String name
    private int id
    private bool hasCamera
    private float[] grades

    public Student(){
    // define default student values
    }
    public Student(Sting name){
    // set the name, rest is default
    }
*/
