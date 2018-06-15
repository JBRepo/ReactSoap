package it.react.ws.interfaces;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "AddRequest")
@XmlType(name= "AddRequestType")
public class AddRequest {	
	
	private Integer intA;
	
	
	private Integer intB;

	/**
	 * @return the intA
	 */

	public Integer getIntA() {
		return intA;
	}

	/**
	 * @param intA the intA to set
	 */
	public void setIntA(Integer intA) {
		this.intA = intA;
	}

	/**
	 * @return the intB
	 */

	public Integer getIntB() {
		return intB;
	}

	/**
	 * @param intB the intB to set
	 */
	public void setIntB(Integer intB) {
		this.intB = intB;
	}

		
	
	

}
