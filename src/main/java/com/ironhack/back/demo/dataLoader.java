package com.ironhack.back.demo;

import com.github.javafaker.Faker;
import com.ironhack.back.model.User;
import com.ironhack.back.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Log
@Profile("demo")
public class dataLoader {

    private final UserRepository userRepository;
    private final Faker faker;

    @EventListener(ApplicationReadyEvent.class)
    public void loadDemoData (){
        log.info("Starting demo user loading...");
        User user1 = new User("bulbasaur", "john", "john@bulbasaur.com"  );
        userRepository.save(user1);
        User user2 = new User("Venusaur", "mike", "mike@Venusaur.com"  );
        userRepository.save(user2);
        User user3 = new User("Magneton", "keira", "keira@Magneton.com"  );
        userRepository.save(user3);
        User user4 = new User("Staryu", "magnolia", "magnolia@Staryu.com"  );
        userRepository.save(user4);
    }

}
