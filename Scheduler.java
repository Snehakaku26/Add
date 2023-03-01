import java.util.ArrayList;
import java.util.List;
public class Scheduler {
    public static List<Match> createScheduler(List<Team> teams){
        List<Match> matches=new ArrayList<>();
        for(int i=0;i<teams.size();i++){
            for(int j=i+1;j<teams.size();j++){
                Match match = new Match(teams.get(i),teams.get(j));
            }
        }
        return matches;   
    }
}