import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClubMembers club = new ClubMembers();

       
        club.addMembers(new String[]{"SMITH, JANE"}, 2019);
        club.addMembers(new String[]{"FOX, STEVE"}, 2018);
        club.addMembers(new String[]{"XIN, MICHAEL"}, 2017);
        club.addMembers(new String[]{"GARCIA, MARIA"}, 2020);

        
        club.setMember(0, new MemberInfo("SMITH, JANE", 2019, false));
        club.setMember(2, new MemberInfo("XIN, MICHAEL", 2017, false));

        System.out.println("Before removal:");
        club.printMembers();

        ArrayList<MemberInfo> result = club.removeMembers(2018);

        System.out.println("\nReturned by removeMembers:");
        for (MemberInfo m : result) {
            System.out.println(m);
        }

        System.out.println("\nAfter removal:");
        club.printMembers();
    }
}

