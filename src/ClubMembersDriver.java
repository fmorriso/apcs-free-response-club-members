import java.util.ArrayList;

public class ClubMembersDriver
{

    public static void main(String[] args)
    {
        ClubMembers club = partA();
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
