package br.com.lab.impacta.investment.handler.exception;

public class InvestmentAccountNotDebitException extends RuntimeException{

    private String description;

    public String getDescription() {
        return description;
    }

    public InvestmentAccountNotDebitException() {
    }

    public InvestmentAccountNotDebitException(String message, String description) {
        super(message);
        this.description = description;
    }
}
