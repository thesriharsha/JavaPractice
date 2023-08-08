package jpql;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name="sales")
@Entity(name="sale")
@NamedQuery(name ="ProductDetails", query ="select products.prodname from sale s group by s.products.prodid having sum(amount)>10000")
public class Sales {
	
	@Id
	private int invno;
	private Date transdate;
	private int qty;
	private double amount;
	
	@ManyToOne
	@JoinColumn(name="prodid")
	private Product products;
	
	public int getInvno() {
		return invno;
	}
	public void setInvno(int invno) {
		this.invno = invno;
	}
	public Date getTransdate() {
		return transdate;
	}
	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
