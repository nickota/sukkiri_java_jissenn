public class Main {
    public static void main(String[] args) {
        String folder = "c:¥user¥";
        String file = "readme.txt";
    
        System.out.println(concatPath(folder, file));
    }

    public static String concatPath(String folder, String file){
        if(!folder.endsWith("¥")){
            folder += "¥";
        }
        return folder + file;
    }
}
