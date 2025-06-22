public class Test {
    public static void main(String[] args) {

        System.out.println("\nTesting Command Pattern\n");
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        
        RemoteControl remote = new RemoteControl();
        
        System.out.println("\nTurning the light on and off using the remote control\n");

        System.out.println("Light On Command: ");
        remote.setCommand(lightOn);
        remote.execute(); 
        
        System.out.println("\nLight Off Command: ");
        remote.setCommand(lightOff);
        remote.execute();
        
        System.out.println();
    }
}
