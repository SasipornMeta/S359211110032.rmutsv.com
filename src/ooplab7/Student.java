package ooplab7;
//design class
//taking about Student?
//1. student id
//2. name
//3. major
//4. group

public class Student {

    private String id;
    private String name;
    private String major;
    private String group;

    // constructor , default
    public Student(){}
    public Student(String id,String n,String m,String g){
        this.id = id;
        this.name = n;
        this.major = m;
        this.group = g;
    } // constructor

    // getter and setter methods
    // id
    public void setId(String id){
        this.id = id;
    }//setID                                        เปลี่ยนแปลงค่าข้อมูล

    public String getId(){
        return this.id;
    }//getID                                        แสดงค่ากลับมา


    // name
    public void setName(String name){
        this.name = name;
    }//setname
    public String getName(){
        return this.name;
    }//getname


    // major
    public void setMajor(String major){
        this.major = major;
    }//setmajor
    public String getMajor(){
        return this.major;
    }//getmajor


    // group
    public void setGroup(String group){
        this.group = group;
    }//setgroup
    public String getGroup(){
        return this.group;
    }//getgroup



} // class
