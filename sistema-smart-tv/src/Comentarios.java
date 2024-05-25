public class Comentarios {
    public static void main(String[] args) {
        // só uma linha

        /*
         * Varias linhas 
         * 
         */

         /**
          * documentação
          */
    }


            public int somaMultiplica (int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if (m == "M"){ // M= multiplicação
                  r= n * x;
                }else{
                // se não soma mesmo
                r = n + x;
            }
            
            return r;
        }
}

/* No terminal execute o comando abaixo

javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
*/
