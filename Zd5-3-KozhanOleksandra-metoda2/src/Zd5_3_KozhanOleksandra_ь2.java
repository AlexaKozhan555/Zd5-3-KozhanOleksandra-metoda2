public class Zd5_3_KozhanOleksandra_ь2 {
    public static void main(String []args){

        int [] mas_KozhanOleksandra = new int[10];
        int min_KozhanOleksandra = 0;
        int max_KozhanOleksandra = 0;
        int licz_KozhanOleksandra = 0;

        for(int i = 0; i < 10; i++) {

            mas_KozhanOleksandra[i] = (int) (Math.floor(Math.random() * 100) +1);

            System.out.println(mas_KozhanOleksandra[i]);
        }
        min_KozhanOleksandra = mas_KozhanOleksandra[0];
        max_KozhanOleksandra = mas_KozhanOleksandra[9];

        while(licz_KozhanOleksandra < 10){
            if (mas_KozhanOleksandra[licz_KozhanOleksandra] < min_KozhanOleksandra){
                min_KozhanOleksandra = mas_KozhanOleksandra[licz_KozhanOleksandra];}
            if (mas_KozhanOleksandra[licz_KozhanOleksandra] > max_KozhanOleksandra){
                max_KozhanOleksandra = mas_KozhanOleksandra[licz_KozhanOleksandra];}
            licz_KozhanOleksandra++;
        }
        System.out.println("Min = " + min_KozhanOleksandra);
        System.out.println("Max = " + max_KozhanOleksandra);

    }
}

