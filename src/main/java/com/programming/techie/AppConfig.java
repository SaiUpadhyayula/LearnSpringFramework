package com.programming.techie;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "basicSpellChecker")
    public BasicSpellChecker createBasicSpellChecker(){
        return new BasicSpellChecker();
    }

    @Bean(name = "advancedSpellChecker")
    public AdvancedSpellChecker createAdvancedSpellChecker(){
        return new AdvancedSpellChecker();
    }

    @Bean(name = "emailClient")
    public EmailClient createEmailClient(){
        return new EmailClient(createAdvancedSpellChecker());
    }
}
