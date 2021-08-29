package ch.zli.m223.helloworld;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String greeting(String name) {
        return "Hallo " + name;
    }

}
