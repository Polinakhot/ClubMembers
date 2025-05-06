public class MemberInfo {
    private String name;
    private int gradYear;
    private boolean goodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.goodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return goodStanding;
    }

    public String toString() {
        return name + " " + gradYear + " " + goodStanding;
    }
}
