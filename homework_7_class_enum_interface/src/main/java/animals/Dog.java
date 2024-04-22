package animals;

public class Dog implements Voice {

    @Override
    public void doVoice() {
        String voice = "GAV";
        System.out.println("Dog say " + "\"" + voice + "\"");
    }
}