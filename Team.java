public class Team {
    private String name;
    Team(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
    public boolean equals(Object obj){
        return this.name.equals(((Team)obj).name);
    }
    
}