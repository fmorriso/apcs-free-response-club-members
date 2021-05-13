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
        String name = "SMITH, JANE";
        String[] memberNames = {name}; // false
        club.addMembers(memberNames, 2019);
        club.setHasGoodStanding(name, false);

        memberNames = new String[] {"FOX, STEVE"}; // true
        club.addMembers(memberNames, 2018);

        name = "XIN, MICHAEL";
        memberNames = new String[] {name}; // false
        club.addMembers(memberNames, 2017);
        club.setHasGoodStanding(name, false);

        memberNames = new String[] {"GARCIA, MARIA"}; // true
        club.addMembers(memberNames, 2020);

        return club;
    }
}
