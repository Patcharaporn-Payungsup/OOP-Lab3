public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public int determineAllBudget() {
        int total = 0;
        for (Club c : clubList) {
            if (c != null) {
                total += c.determineBudget();
            }
        }
        return total;
    }

    public int getAllMembers() {
        int total = 0;
        for (Club c : clubList) {
            if (c != null) {
                total += c.numMember; 
            }
        }
        return total;
    }

    public Club getHighestMemberClub() {
        if (clubList == null || clubList.length == 0) return null;
        Club highest = clubList[0];
        for (Club c : clubList) {
            if (c != null && c.numMember > highest.numMember) {
                highest = c;
            }
        }
        return highest;
    }
}