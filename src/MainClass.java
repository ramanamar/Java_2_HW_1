public class MainClass {
    public static void main(String[] args) {
        TrimTrail tt = new TrimTrail();
        Team t1 = new Team("FirstTeam");
        Team t2 = new Team("SecondTeam");
        tt.doIt(t1);
        tt.doIt(t2);
        t1.showResults();
        t2.showResults();
/*        Human h1 = new Human("BobWithoutTransport");
        Human h2 = new Human("BobOnHorse");
        Human h3 = new Human("BobOnMoto");
        h2.getOn(new Horse("Almaz"));
        h3.getOn(new Moto());

        Sportsman[] participants = {h1, h2, h3, new Horse("Dikoobraz")};
        Obstacle[] race = {new Cross(10000.0f)};

        for (Sportsman s : participants) {
            for (Obstacle o : race) {
                o.doIt(s);
                if (!s.isOnDistance()) break;
            }
        }*/

/*        System.out.println("====================");
        for (Sportsman o : participants) {
            o.showResults();
        }*/
    }
}
