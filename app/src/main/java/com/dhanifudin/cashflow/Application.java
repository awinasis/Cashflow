package com.dhanifudin.cashflow;

import com.dhanifudin.cashflow.models.Account;
import com.dhanifudin.cashflow.models.Session;

public class Application extends android.app.Application {

    private static Session session;
    private static Account account;

    @Override
    public void onCreate() {
        super.onCreate();
        account = new Account("Abdullah Winasis");

        session = new Session(this);
    }

    public static Session getSession() {
        return session;
    }

    public static Account getAccount() {
        return account;
    }
}
