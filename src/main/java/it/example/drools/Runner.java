package it.example.drools;

import org.kie.api.runtime.KieSession;


public class Runner {

    public static void main(String[] args) {

        DroolsService droolsService = new DroolsService();
        KieSession kieSession = droolsService.getKieSession();

        Person a = new Person("roberto","pallotta",17);
        System.out.println("Prima delle regole: " + a);
        kieSession.insert(a);
        kieSession.fireAllRules();

        System.out.println("Dopo delle regole: " + a);
    }

}
