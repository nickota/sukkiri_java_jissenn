import java.time.*
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2012,1,1);
        LocalDate ld2 = LocalDate.of(2012,1,4);
        
        //三日間を表すPeriodを２通りの方法で実装
        Period p1 = Period.ofDays(ld1, ld2);
        Period p2 = Period.between(ld1, ld2);
        
        //ld2の三日後
        LocalDate ld3 = ld2.plus(p2)
    }
}
