import java.time.*;

public class Main {
    public static void main(String[] args) {
        Instant i1 = new Instant.now();
        
        //Instantとlong値との相互変換
        Instant i2 = new Instant.ofEpochMilli(31920291332L);
        long l = i2.toEpochMilli();
        
        //ZonedDateTimeの生成
        ZonedDateTime z1 = new ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime.of(2014, 1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
        
        //InstantとZonedDateTimeの相互変換
        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
        
        //ZonedDateTimeの利用
        System.out.println("東京:" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
        System.out.println("ロンドン:" + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());
        
        if(z2.isEqual(z3)){
            System.out.println("同じ瞬間");
        }
    }
}
