import java.util.ArrayList;

public class ClubMembers
{
    private ArrayList<MemberInfo> memberList;

    public ClubMembers()
    {
        memberList = new ArrayList<MemberInfo>();
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
            memberList.add( new MemberInfo(name, gradYear, true));
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
        // create a separate list of members to be removed
        ArrayList<MemberInfo> remove = new ArrayList<MemberInfo>();
        for(MemberInfo mi: memberList)
        {
            if(mi.getGradYear() <= year)
            {
                remove.add(mi);
                if(mi.inGoodStanding())
                {
                    grads.add(mi);
                }
            }
        }

       // use separate list of people to remove to remove them from the club list
        for(MemberInfo mi: remove) memberList.remove(mi);

        return grads;
    }

    public String toString()
    {
        String val = "";
        for (MemberInfo member: memberList)
        {
            val += member + "\n";
        }
        return val;
    }

    public void setHasGoodStanding(String name, boolean hasGoodStanding)
    {
        MemberInfo found = null;
        for(int i = 0; i < memberList.size(); i++)
        {
            if(memberList.get(i).getName().equals(name))
            {
                MemberInfo mi = memberList.get(i);
                mi.setHasGoodStanding(false);
                memberList.set(i, mi);
            }

        }


    }
}
