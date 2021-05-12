public class MemberInfo
{
    private final String name;
    private final int gradYear;
    private final boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding)
    {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGraduationYear() {return gradYear;}

    public boolean getHasGoodStanding() { return hasGoodStanding;}

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
