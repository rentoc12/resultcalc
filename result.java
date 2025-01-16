public class result {

    public static void main(String args[]){

        double mat = 5;
        double geo = 5;
        double art = 5;
        double port = 4;
        double resultCalc = mat + geo + art + port;
        double resultFinish = resultCalc / 4;
        System.out.println(resultFinish);

        if(resultFinish >= 7 ){
            System.out.println("Parabéns, você está aprovado");
        }else if(resultFinish >= 5){
            System.out.println("Você ficará de recuperação");
        }
        else{
            System.out.println("Reprovado, tente novamente!!!");
        }
    }
}