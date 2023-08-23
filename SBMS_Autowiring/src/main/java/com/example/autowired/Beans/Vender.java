package com.example.autowired.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Component
@Data
@Setter

public class Vender {
	
	//@Value("V1-XY")
	private String vname;

	public String setVname(String string) {
		// TODO Auto-generated method stub
		return string.toString();
	}

//	public String setVname(String vname) {
//		return vname;
//		// TODO Auto-generated method stub
//		
//	}

}
