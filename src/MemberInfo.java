public class MemberInfo
{
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding)
    {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    @Override
    public String toString()
    {
        return "MemberInfo{" +
                "name='" + name + '\'' +
                ", gradYear=" + gradYear +
                ", hasGoodStanding=" + hasGoodStanding +
                '}';
    }
}
