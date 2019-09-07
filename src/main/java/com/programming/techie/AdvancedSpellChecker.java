package com.programming.techie;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AdvancedSpellChecker implements SpellChecker {

    public void checkSpelling(String emailMessage){
        if (emailMessage != null) {
            // Determining the Language of the email Message
            // Check grammatical errors in the email Message
            // Check spellings in the email Message
            System.out.println("Checking Spelling using Advanced Spell Checker..");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred while checking Spelling");
        }
    }
}
