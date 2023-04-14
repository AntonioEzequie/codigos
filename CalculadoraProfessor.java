public class CalculadoraProfessor {
    public  static void main (String[] args) {
        // constante do Pi - http://pt.wikipedia.org/wiki/Pi
        float pi = 3.14f;
        //informarçao pelo professor
        float raio = 5.3f;
        //area e igual aO raio a quadrado multiplicaçao POR PI
        float area = raio * raio * pi;
        int areSenCasaDecimais = (int) area;
        
        System.out.println("resultado: " + area);
        System.out.println("resultado sem casa decimais" + areSenCasaDecimais);
       
    }
}