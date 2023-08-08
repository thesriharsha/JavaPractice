package basics;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="products")
@Entity(name="Products")
public class Products {

	@Id
	@Column(name="Prodid")
	private int id;
	
	@Column(name="ProdName")
	private String name;
	
	@Column(name="Price")
	private int price;
	
	@Column(name="Qoh")
	private int qoh;
	
	@Column(name="Remarks")
	private String remarks;
	
	
	@Column(name="CatCode")
	private String code;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", qoh=" + qoh + ", remarks=" + remarks
				+ ", code=" + code + "]";
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Products p = (Products)obj;
		return this.id==p.id;
	}

}
