public class EnhancedPlayer {
    private String FullName;
    private int healthPersentage;
    private String weapon;

    public EnhancedPlayer(String FullName, int healthPersentage, String weapon) {
        this.FullName = FullName;
        if (healthPersentage <= 0) {
            this.healthPersentage = 1;
        } else if (healthPersentage > 100) {
            this.healthPersentage = 100;
        } else {
            this.healthPersentage = healthPersentage;
        }
        this.weapon = weapon;
    }

    public EnhancedPlayer(String FullName) {
        this(FullName, 100, "Sword");
    }

    public void loseHealth(int damage) {
        healthPersentage = healthPersentage - damage;
        if (healthPersentage <= 0) {
            System.out.println("Player knocked out of game");

        }
    }

    public int healthRemaining() {
        return healthPersentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPersentage = healthPersentage + extraHealth;
        if (healthPersentage > 100) {
            System.out.println("Player restored to 100%");
        }
    }
}
