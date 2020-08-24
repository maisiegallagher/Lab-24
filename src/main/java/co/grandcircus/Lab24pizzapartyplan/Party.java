package co.grandcircus.Lab24pizzapartyplan;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza_party")
public class Party {

	private long id;
	private String name;
	private LocalDate date;

	public Party() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Party(long id, String name, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

}
