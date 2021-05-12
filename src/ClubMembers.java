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
