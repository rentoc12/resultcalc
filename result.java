public class result {

    public static void main(String args[]){

        double mat = 6;
        double geo = 2;
        double art = 2;
        double port = 2;
        double resultCalc = mat + geo + art + port;
        double resultFinish = resultCalc / 4;
        System.out.println(resultFinish);

        if(resultFinish >= 7 ){
            System.out.println("Parabéns, você está aprovado");
        }else if(resultFinish == 6){
            System.out.println("Você ficará de recuperação");
        }
        else{
            System.out.println("Reprovado, tente novamente!!!");
        }
    }
}