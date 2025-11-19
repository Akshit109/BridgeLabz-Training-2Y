package lambda;

public import java.util.function.Consumer;

class Light {
    String id;
    Light(String id) { this.id = id; }

    void turnOn(String pattern) {
        System.out.println(id + " -> Light ON with pattern: " + pattern);
    }
}

public class SmartHomeLighting {
    public static void main(String[] args) {

        Light l1 = new Light("LivingRoom");
        Light l2 = new Light("Kitchen");

        // Lambdas for different triggers
        Consumer<Light> motionTrigger = light -> light.turnOn("Bright White");
        Consumer<Light> nightTrigger = light -> light.turnOn("Warm Yellow");
        Consumer<Light> voiceCommand = light -> light.turnOn("Party Mode");

        // Execute triggers
        motionTrigger.accept(l1);
        nightTrigger.accept(l2);
        voiceCommand.accept(l1);
    }
}
 q1 {
    
}
