package day1031ex3TM;

public class Team implements Comparable<Team>
{
    private Weekday weekday;
    private String sport;

    public Team(Weekday weekday, String sport)
    {
        this.sport = sport;
        this.weekday = weekday;
    }

    public Weekday getWeekday()
    {
        return weekday;
    }

    public String getSport()
    {
        return sport;
    }

    @Override
    public String toString()
    {
        return weekday + " - " + sport;
    }

    @Override
    public int compareTo(Team team)
    {
        if (this.weekday.equals(team.getWeekday()))
            return this.sport.compareTo(team.getSport());
        else
            return this.weekday.compareTo(team.getWeekday());

    }

    public enum Weekday
    {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sonday
    }
}
