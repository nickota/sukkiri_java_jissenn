public class Main{
    public static void main(String[] args){
        Hero hero1 = new Hero("斎藤");
        Hero hero2 = new Hero("鈴木");
        
        Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
        heroes.put(hero1, 3);
        heroes.put(hero2, 7);
        
        for(Hero key : heroes.keySet()){
            int value = heroes.get(key);
            System.out.println(key.getName() + ":" + value);
            
        }
    }
}