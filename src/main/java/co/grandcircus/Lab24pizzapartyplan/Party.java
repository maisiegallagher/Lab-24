package co.grandcircus.Lab24pizzapartyplan;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "party")
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private LocalDate date;
	@OneToMany(mappedBy = "party")
	private Set<Rsvp> rsvps;

	public Party() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Party(long id, String name, LocalDate date, Set<Rsvp> rsvps) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.rsvps = rsvps;
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

	public Set<Rsvp> getRsvps() {
		return rsvps;
	}

	public void setRsvps(Set<Rsvp> rsvps) {
		this.rsvps = rsvps;
	}

	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name + ", date=" + date + ", rsvps=" + rsvps + "]";
	}

}