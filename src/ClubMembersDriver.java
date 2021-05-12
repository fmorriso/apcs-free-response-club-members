import java.util.ArrayList;

public class ClubMembersDriver
{

    public static void main(String[] args)
    {
        System.out.println("Part A:");
        ClubMembers club = partA();
        System.out.println(club);

        System.out.println("Part B:");
        partB(club);

    }

    private static void partB(ClubMembers club)
    {

        ArrayList<MemberInfo> grads = club.removeMembers(2018);
        System.out.println("Graduates:");
        System.out.println(grads);
        System.out.println("After remove:");
        System.out.println(club);

    }

    private static ClubMembers partA()
    {
        ClubMembers club = new ClubMembers();

        String[] memberNames = {"SMITH JANE"};
        club.addMembers(memberNames, 2019);

        memberNames = new String[] {"FOX, STEVE"};
        club.addMembers(memberNames, 2018);

        memberNames = new String[] {"XIN, MICHAEL"};
        club.addMembers(memberNames, 2017);

        memberNames = new String[] {"GARCIA, MARIA"};
        club.addMembers(memberNames, 2020);

        return club;
    }
}
