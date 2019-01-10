package com.javatechie.spring.procedure.api.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ticket")
@Getter
@Setter
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "firstProcedure", procedureName = "getTicketDetails"),
		@NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "getTicketsByCategory", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "tCategory", type = String.class) }) })
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int amount;
	private String catagory;
}
