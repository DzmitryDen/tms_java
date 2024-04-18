package animals;

public class Cat implements Voice {

    @Override
    public void doVoice() {
        String voice = "MYAU";
        System.out.println("Cat say " + "\"" + voice + "\"");
    }
}