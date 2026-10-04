public class ESportsClubTest {
    public static void main(String[] args) {
        ESportsClub e = new ESportsClub("Esport", 100);
        e.advertise();
        System.out.println(e.determineBudget()); 
        System.out.println(e.getName());

        Club c = new ESportsClub("Esport", 100);
        c.advertise();
        System.out.println(c.determineBudget());
        System.out.println(c.getName());
    }
}