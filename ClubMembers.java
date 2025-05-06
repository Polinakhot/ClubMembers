import java.util.ArrayList;
import java.util.Iterator;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList = new ArrayList<>();

 
    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }
   
public void setMember(int index, MemberInfo member) {
    memberList.set(index, member);
}


    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> goodStandingGrads = new ArrayList<>();
        Iterator<MemberInfo> itr = memberList.iterator();

        while (itr.hasNext()) {
            MemberInfo member = itr.next();
            if (member.getGradYear() <= year) {
                if (member.inGoodStanding()) {
                    goodStandingGrads.add(member);
                }
                itr.remove(); 
            }
        }

        return goodStandingGrads;
    }

   
    public void printMembers() {
        for (MemberInfo m : memberList) {
            System.out.println(m);
        }
    }
}
