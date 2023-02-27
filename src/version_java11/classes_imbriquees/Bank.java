package src.version_java11.classes_imbriquees;

import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public class Account {
        private String accountNumber;

        public Account(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public void deposit(double amount) {
            // code pour déposer de l'argent sur le compte
        }

        public void withdraw(double amount) {
            // code pour retirer de l'argent du compte
        }

        public String getBankName() {
            return Bank.this.name; // Accès privilégié à name de Bank
        }
    }
}