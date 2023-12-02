class Player 
{
    private String name;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
}

class CricketPlayer extends Player 
{
    private String country;

    public CricketPlayer(String name, String country) 
    {
        super(name);
        this.country = country;
    }

    public String getCountry() 
    {
        return country;
    }
}

class FootballPlayer extends Player 
{
    private String club;

    public FootballPlayer(String name, String club) 
    {
        super(name);
        this.club = club;
    }

    public String getClub() 
    {
        return club;
    }
}

class HockeyPlayer extends Player 
{
    private String team;

    public HockeyPlayer(String name, String team) 
    {
        super(name);
        this.team = team;
    }

    public String getTeam() 
    {
        return team;
    }
}

class SportsPlayer {
    public static void main(String[] args) 
    {
        CricketPlayer cricketPlayer = new CricketPlayer("Sachin Tendulkar", "India");
        FootballPlayer footballPlayer = new FootballPlayer("Lionel Messi", "Paris Saint-Germain");
        HockeyPlayer hockeyPlayer = new HockeyPlayer("Wayne Gretzky", "Edmonton Oilers");

        System.out.println("Cricket Player:");
        System.out.println("Name: " + cricketPlayer.getName());
        System.out.println("Country: " + cricketPlayer.getCountry());
        System.out.println();

        System.out.println("Football Player:");
        System.out.println("Name: " + footballPlayer.getName());
        System.out.println("Club: " + footballPlayer.getClub());
        System.out.println();

        System.out.println("Hockey Player:");
        System.out.println("Name: " + hockeyPlayer.getName());
        System.out.println("Team: " + hockeyPlayer.getTeam());
    }
}
