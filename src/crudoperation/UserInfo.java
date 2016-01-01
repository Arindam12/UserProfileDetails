package crudoperation;

public class UserInfo {
private String name;
private String Address;
private String doj;
private String dob;
private String technology;
private String age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getDoj() {
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
@Override
public String toString() {
	return "UserInfo [getName()=" + getName() + ", getAddress()=" + getAddress() + ", getDoj()=" + getDoj()
			+ ", getDob()=" + getDob() + ", getTechnology()=" + getTechnology() + ", getAge()=" + getAge() + "]";
}
}
