package it.arcade.hospital.offer;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Offer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@NotNull
	String name;
	@NotNull
	BigDecimal price;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_department")
	Department department;
	
}
