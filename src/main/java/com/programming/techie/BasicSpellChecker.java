package com.programming.techie;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class BasicSpellChecker implements SpellChecker {

    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking spelling using BasicSpellChecker...");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred " +
                    "while checking Spelling");
        }
    }
}
