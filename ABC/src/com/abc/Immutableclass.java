package com.abc;
// To create a immutable class we have to make class as final
public  final class Immutableclass {
private String studId;
private int rolNumber;
public Immutableclass(String studId,int rollNumber) {
	this.studId=studId;
	this.rolNumber=rollNumber;
}
/**
 * @return the studId
 */
public String getStudId() {
	return studId;
}
/**
 * @param studId the studId to set
 */
public void setStudId(String studId) {
	this.studId = studId;
}
/**
 * @return the rolNumber
 */
public int getRolNumber() {
	return rolNumber;
}
/**
 * @param rolNumber the rolNumber to set
 */
public void setRolNumber(int rolNumber) {
	this.rolNumber = rolNumber;
}

}