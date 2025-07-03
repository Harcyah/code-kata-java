package com.harcyah.kata.exercism.bank_account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    void setup() {
        bankAccount = new BankAccount();
    }

    @Test
    void newlyOpenedAccountHasEmptyBalance() throws BankAccountActionInvalidException {
        bankAccount.open();

        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    void canDepositMoney() throws BankAccountActionInvalidException {
        bankAccount.open();

        bankAccount.deposit(10);

        assertEquals(10, bankAccount.getBalance());
    }

    @Test
    void canDepositMoneySequentially() throws BankAccountActionInvalidException {
        bankAccount.open();

        bankAccount.deposit(5);
        bankAccount.deposit(23);

        assertEquals(28, bankAccount.getBalance());
    }

    @Test
    void canWithdrawMoney() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(10);

        bankAccount.withdraw(5);

        assertEquals(5, bankAccount.getBalance());
    }

    @Test
    void canWithdrawMoneySequentially() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(23);

        bankAccount.withdraw(10);
        bankAccount.withdraw(13);

        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    void cannotWithdrawMoneyFromEmptyAccount() {
        bankAccount.open();

        assertThatThrownBy(() -> bankAccount.withdraw(5))
            .isInstanceOf(BankAccountActionInvalidException.class)
            .hasMessage("Cannot withdraw money from an empty account");
    }

    @Test
    void cannotWithdrawMoreMoneyThanYouHave() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(6);

        assertThatThrownBy(() -> bankAccount.withdraw(7))
            .isInstanceOf(BankAccountActionInvalidException.class)
            .hasMessage("Cannot withdraw more money than is currently in the account");
    }

    @Test
    void cannotDepositNegativeAmount() {
        bankAccount.open();

        assertThatThrownBy(() -> bankAccount.deposit(-1))
            .isInstanceOf(BankAccountActionInvalidException.class)
            .hasMessage("Cannot deposit or withdraw negative amount");
    }

    @Test
    void cannotWithdrawNegativeAmount() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(105);

        assertThatThrownBy(() -> bankAccount.withdraw(-5))
            .isInstanceOf(BankAccountActionInvalidException.class)
            .hasMessage("Cannot deposit or withdraw negative amount");
    }

    @Test
    void cannotGetBalanceOfClosedAccount() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(10);
        bankAccount.close();

        assertThatThrownBy(() -> bankAccount.getBalance())
            .isInstanceOf(BankAccountActionInvalidException.class)
            .hasMessage("Account closed");
    }

    @Test
    void cannotDepositMoneyIntoClosedAccount() {
        bankAccount.open();
        bankAccount.close();

        assertThatThrownBy(() -> bankAccount.deposit(5))
            .isInstanceOf(BankAccountActionInvalidException.class)
            .hasMessage("Account closed");
    }

    @Test
    void cannotWithdrawMoneyFromClosedAccount() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(20);
        bankAccount.close();

        assertThatThrownBy(() -> bankAccount.withdraw(5))
            .isInstanceOf(BankAccountActionInvalidException.class)
            .hasMessage("Account closed");
    }

    @Test
    void bankAccountIsClosedBeforeItIsOpened() {
        assertThatThrownBy(() -> bankAccount.getBalance())
            .isInstanceOf(BankAccountActionInvalidException.class)
            .hasMessage("Account closed");
    }

    @Test
    void canAdjustBalanceConcurrently() throws BankAccountActionInvalidException, InterruptedException {
        bankAccount.open();
        bankAccount.deposit(1000);

        for (int i = 0; i < 10; i++) {
            adjustBalanceConcurrently();
        }
    }

    private void adjustBalanceConcurrently() throws BankAccountActionInvalidException, InterruptedException {
        SecureRandom random = new SecureRandom();

        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(() -> {
                try {
                    bankAccount.deposit(5);
                    Thread.sleep(random.nextInt(10));
                    bankAccount.withdraw(5);
                } catch (BankAccountActionInvalidException e) {
                    fail("Exception should not be thrown: " + e.getMessage());
                } catch (InterruptedException ignored) {
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        assertEquals(1000, bankAccount.getBalance());
    }

}
