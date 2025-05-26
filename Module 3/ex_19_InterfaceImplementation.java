interface ex19_Playable {
    void play();
}

class ex19_Guitar implements ex19_Playable {
    public void play() { System.out.println("Playing guitar"); }
}

class ex19_Piano implements ex19_Playable {
    public void play() { System.out.println("Playing piano"); }
}

public class ex_19_InterfaceImplementation {
    public static void main(String[] args) {
        ex19_Playable g = new ex19_Guitar();
        ex19_Playable p = new ex19_Piano();
        g.play();
        p.play();
    }
}
