package it.react.ws.controller;

import java.util.HashMap;
import java.util.Map;

import it.react.ws.interfaces.AddRequest;
import it.react.ws.interfaces.AddResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class CalculatorService {
	
	@WebMethod
	@WebResult(name="AddResponse")
	public AddResponse AddNumber(@WebParam(name = "AddRequest") final AddRequest request){
		AddResponse response = new AddResponse();
		response.setAddResult(request.getIntA()+request.getIntB());		
		return response;
	}

}
