import java.util.ArrayList;
import java.util.List;

class GameCharacter {
    // Атрибуты персонажа
    private int health;
    private String eyeColor;
    private String skinColor;
    private List<String> skills;

    // Конструктор
    public GameCharacter(int health, String eyeColor, String skinColor) {
        this.health = health;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.skills = new ArrayList<>();
    }

    // Геттер для здоровья
    public int getHealth() {
        return health;
    }

    // Сеттер для здоровья
    public void setHealth(int health) {
        this.health = Math.max(health, 0); // Здоровье не может быть отрицательным
    }

    // Геттер для цвета глаз
    public String getEyeColor() {
        return eyeColor;
    }

    // Сеттер для цвета глаз
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    // Геттер для цвета кожи
    public String getSkinColor() {
        return skinColor;
    }

    // Сеттер для цвета кожи
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    // Геттер для скилов
    public List<String> getSkills() {
        return skills;
    }

    // Метод для приобретения нового скила
    public void acquireSkill(String skill) {
        if (!skills.contains(skill)) {
            skills.add(skill);
            System.out.println("Новый навык приобретён: " + skill);
        } else {
            System.out.println("Персонаж уже имеет навык: " + skill);
        }
    }

    // Метод для нанесения урона
    public void takeDamage(int damage) {
        setHealth(health - damage);
        System.out.println("Персонаж получил урон: " + damage + ". Текущее здоровье: " + health);
    }

    // Метод для вывода всех навыков
    public void displaySkills() {
        if (skills.isEmpty()) {
            System.out.println("У персонажа нет навыков.");
        } else {
            System.out.println("Навыки персонажа: " + String.join(", ", skills));
        }
    }

    public static void main(String[] args) {
        GameCharacter character = new GameCharacter(100, "голубой", "светлый");
        character.acquireSkill("Мечник");
        character.acquireSkill("Стрелок");
        character.displaySkills();
        character.takeDamage(20);
        System.out.println("Текущее здоровье: " + character.getHealth());
    }
}