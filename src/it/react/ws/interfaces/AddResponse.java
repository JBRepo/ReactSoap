package it.react.ws.interfaces;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "AddResponse")
@XmlType(name = "AddResponseType")
public class AddResponse {
	
	
	private Integer addResult;

	/**
	 * @return the addResult
	 */
	
	
	public Integer getAddResult() {
		return addResult;
	}

	/**
	 * @param addResult the addResult to set
	 */
	@XmlElement(name = "AddResult")
	public void setAddResult(Integer addResult) {
		this.addResult = addResult;
	}	
	

}
