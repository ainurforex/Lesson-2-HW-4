public class Main {
    public static void main(String[] args) {
        int targetWeightReductionKg=7;
        int weightReductionRation1Gr=250;
        int weightReductionRation2Gr=500;
        int targetWeightReductionGr;
        int dayReductionRation1;
        int dayReductionRation2;
        int avarageReduction;
        targetWeightReductionGr=targetWeightReductionKg*1000;
        dayReductionRation1=targetWeightReductionGr/weightReductionRation1Gr;
        System.out.println("Для достижения снижения веса на 7 кг, у спортсмена,");
        System.out.println("при снижении на 250 гр в день, уйдет "+dayReductionRation1+" дней,");
        dayReductionRation2=targetWeightReductionGr/weightReductionRation2Gr;
        System.out.println("при снижении на 500 гр в день, уйдет "+dayReductionRation2+" дней.");
        avarageReduction=(dayReductionRation1+dayReductionRation2)/2;
        System.out.println("Средний показатель достижения снижения веса "+avarageReduction+" день.");
    }
}