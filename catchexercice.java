public class catchexercice {
    public static void main(String[] args) {
        int limit=1000;
       // var watch = new  System.Diagnostics.Stopwatch();

for(int i=0;i<limit;i++)
        try {
            if(i%2==0){
                System.out.println("algo");
            }
            else {
                throw new Exception("AY noooooOOoOo");
            }
        }
        catch (Exception e){
            System.out.println();
        }


    }
}































/*public class xmass extends JFrame {
    public static void main(String[] args) {

        Scanner casa = new Scanner(System.in);
        System.out.println("ingrese a ver");
        String input = casa.next();
try{
int number = Integer.parseInt(input);
    System.out.println("Numero ingresado: "+number);
}catch (NumberFormatException e){
    System.out.println("error error");
}finally {
    System.out.println("operacion finalizada");
    casa.close();
}
    }
    public xmass() {


    }
}
 */
