package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(
        serviceName = "CalculatriceService",
        portName = "CalculatricePort",
        targetNamespace = "http://service/",
        endpointInterface = "service.ICalculatrice")
public class Calculatrice implements ICalculatrice {

    @Override
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }

    @Override
    @WebMethod(operationName = "soustraction")
    public double soustraction(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a - b;
    }

    @Override
    @WebMethod(operationName = "multiplication")
    public double multiplication(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a * b;
    }

    @Override
    @WebMethod(operationName = "division")
    public double division(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible");
        }
        return a / b;
    }
}