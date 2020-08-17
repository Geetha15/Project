package com.capg.fms.flight;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.query.criteria.internal.expression.SizeOfPluralAttributeExpression;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.fms.flight.model.Flight;
import com.capg.fms.flight.model.FlightList;
import com.capg.fms.flight.repo.IFlightRepo;
import com.capg.fms.flight.service.FlightServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
class FmsFlightMsApplicationTests {

	@Autowired
	FlightServiceImpl flightservice;
	@MockBean
	IFlightRepo flightRepo;
	
	@Test
	public void testGettAll() {
		when(flightRepo.findAll()).thenReturn(Stream.
				of(new Flight(172,"airport","Model",77),new Flight(176,"airli","mode",88)).
				collect(Collectors.toList()));
		assertEquals(flightservice.getAll().getFlightList(), flightservice.getAll().getFlightList());
	
	}

	
	@Test
	void testaddFlight() {
		Flight flight=new Flight();
		flight.setFlightNumber(173);
		flight.setFlightModel("airline");
		flight.setCarrierName("Model");
		flight.setSeatCapacity(34);
		Mockito.when(flightRepo.save(flight)).thenReturn(flight);
		assertThat(flightservice.addFlight(flight)).isEqualTo(flight);
	}

	

	
	
   
}
