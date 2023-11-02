package in.ineuron.model;

public class customer1 {
private int cust_id;
private String cname;
private String citem;
private double camt;
public void setCust_id(int id) {
	this.cust_id=id;
}
public int getCust_id() {
	return this.cust_id;
}
public void setCname(String cname) {
	this.cname=cname;
}
public String getCname() {
	return cname;
}
public void setCitem(String citem) {
	this.citem=citem;
}
public String getCitem() {
	return this.citem;
}
public void setCamt(double camt) {
	this.camt=camt;
}
public double getCamt() {
	return camt;
}
}
