package bankVersion2;

import java.io.Serializable;

public class Payments implements Serializable {

	private static final long serialVersionUID=1L;    //serialization this class implements Serializable interface

	String senderuname;
	String recieveruname;
	String paydate;
	public Payments(String senderuname, String recieveruname, String paydate) {
		super();
		this.senderuname = senderuname;
		this.recieveruname = recieveruname;
		this.paydate = paydate;
	}
	public String getSenderuname() {
		return senderuname;
	}
	public void setSenderuname(String senderuname) {
		this.senderuname = senderuname;
	}
	public String getRecieveruname() {
		return recieveruname;
	}
	public void setRecieveruname(String recieveruname) {
		this.recieveruname = recieveruname;
	}
	public String getPaydate() {
		return paydate;
	}
	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	@Override
	public String toString() {
		return "Payments [senderuname=" + senderuname + ", recieveruname=" + recieveruname + ", paydate=" + paydate
				+ "]";
	}
	

}
