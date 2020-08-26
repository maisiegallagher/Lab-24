package co.grandcircus.Lab24pizzapartyplan;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PartyDao extends JpaRepository<Party, Long> {

}
