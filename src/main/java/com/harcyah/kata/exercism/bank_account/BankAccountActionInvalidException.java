package com.harcyah.kata.exercism.bank_account;

public class BankAccountActionInvalidException extends Exception {

    private static final long serialVersionUID = -5865180767879722042L;

    BankAccountActionInvalidException(String message) {
        super(message);
    }

}
