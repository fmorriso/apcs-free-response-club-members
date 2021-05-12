import java.util.ArrayList;

public class ClubMembers
{
    private ArrayList<MemberInfo> memberInfoArrayList;

    public ClubMembers()
    {
        memberInfoArrayList = new ArrayList<MemberInfo>();
    }

    /**
     * Adds new club members to memberList
     * @param names - array of member names
     * @param gradYear - year of graduation of all members in the names array
     */
    public void addMembers(String[] names, int gradYear)
    {
        for (String name: names)
        {
            memberInfoArrayList.add( new MemberInfo(name, gradYear, true));
        }
    }

    /**
     * Returns a list of all students who have graduated and are in good standing.
     * A member has graduated if the member's graduation year is less than or equal to the method's year parameter.
     * If no members meet these criteria, an empty list is returned.
     *
     * Removes from memberList all members who have graduated, regardless of whether or not they are in good standing
     *
     * @param year - graduation year
     * @return - a list of graduates
     */
    public ArrayList<MemberInfo> removeMembers(int year)
    {
        // create a list of graduates
        ArrayList<MemberInfo> grads = new ArrayList<MemberInfo>();
        for(MemberInfo mi: memberInfoArrayList)
        {
            if(mi.getGraduationYear() == year && mi.getHasGoodStanding())
                grads.add(mi);
        }

        // remove all members who have a graduation year less than or equal to specified year

        // start by making a separate list of the people that need to be removed
        ArrayList<MemberInfo> remove = new ArrayList<MemberInfo>();
        for(MemberInfo mi: memberInfoArrayList)
        {
            if(mi.getGraduationYear() <= year) remove.add(mi);
        }

        // use that list of people to remove to remove them from the club list
        for(MemberInfo mi: remove) memberInfoArrayList.remove(mi);            

        return grads;
    }

    public String toString()
    {
        String val = "";
        for (MemberInfo member: memberInfoArrayList)
        {
            val += member + "\n";
        }
        return val;
    }
}
