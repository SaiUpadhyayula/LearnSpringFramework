package com.programming.techie;

class EmailClient {
    private BasicSpellChecker basicSpellChecker;

    EmailClient(){
        this.basicSpellChecker = new BasicSpellChecker();
    }

    void sendEmail(String emailMessage) {
        basicSpellChecker.checkSpelling(emailMessage);
        // Logic to send email 
    }
}
