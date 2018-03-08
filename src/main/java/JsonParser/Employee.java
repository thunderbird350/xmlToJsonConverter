/**
 * 
 */
package JsonParser;


public class Employee {
	
	private String empname;
	private String empid;
	private String empcompany;
	private String empdep;
	/**
	 * @return the empname
	 */
	public String getEmpname() {
		return empname;
	}
	/**
	 * @param empname the empname to set
	 */
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	/**
	 * @return the empid
	 */
	public String getEmpid() {
		return empid;
	}
	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	/**
	 * @return the empcompany
	 */
	public String getEmpcompany() {
		return empcompany;
	}
	/**
	 * @param empcompany the empcompany to set
	 */
	public void setEmpcompany(String empcompany) {
		this.empcompany = empcompany;
	}
	/**
	 * @return the empdep
	 */
	public String getEmpdep() {
		return empdep;
	}
	/**
	 * @param empdep the empdep to set
	 */
	public void setEmpdep(String empdep) {
		this.empdep = empdep;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid
				+ ", empcompany=" + empcompany + ", empdep=" + empdep + "]";
	}
	
	
	

}
