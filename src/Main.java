public class Main{
    public static void main(String[] args){
        Hero hero1 = new Hero("斎藤");
        Hero hero2 = new Hero("鈴木");
        
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        heroes.add(hero1);
        heroes.add(hero2);
        
        for(Hero hero:heroes){
            System.out.println(hero.getName());
        }
    }
}