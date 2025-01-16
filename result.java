public class result {

    public static void main(String args[]){

        double mat = 8;
        double geo = 6;
        double art = 9;
        double port = 7;
        double resultCalc = mat + geo + art + port;
        double resultFinish = resultCalc / 4;
        System.out.println(resulFinish);

        if(resultFinish >= 7 ){
            System.out.println("Parabéns, você está aprovado");
        }else(resultFinish <= 6){
            System.out.println("Reprovado, tente novamente!!!");
        }
    }
}