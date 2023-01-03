package encapul;

public class EncapDemo {
	   private String name;

	   private String idNum;

	   private int age;

	   public int getAge() {

	      return age;
}

	/*public EncapDemo(String name, String idNum, int age) {
		super();
		this.name = name;
		this.idNum = idNum;
		this.age = age;*/
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the idNum
	 */
	public String getIdNum() {
		return idNum;
	}

	/**
	 * @param idNum the idNum to set
	 */
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}