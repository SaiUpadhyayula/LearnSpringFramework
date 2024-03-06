package com.programming.techie;

public class EmailApplication {
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();

        emailClient.sendEmail("Hey, " +
                "This is my first email message.");
        emailClient.sendEmail("Hey, " +
                "This is my second email message.");
    }
}
