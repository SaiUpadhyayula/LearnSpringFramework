package com.programming.techie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class EmailClient {
    private SpellChecker spellChecker;

    EmailClient() {
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }
}
