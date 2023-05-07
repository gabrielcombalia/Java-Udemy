public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Oi João!");
        System.out.println("Oi Mundo!");
        byte meuByte = 100;
        short meuShort = 1000;
        int meuInt = 10000;
        byte outroByte = (byte) (meuByte/2);
        System.out.println("Java converte os numeros em integer," +
                " por isso a necessidade do cast (byte) antes da expressão (meuByte/2) que é " + outroByte);
        int somaTodos = outroByte + meuShort + meuInt; // transforma em int direto.
        // não precisa de cast como no byte e no short
        long meuLong = 50000L + 10*somaTodos;
        System.out.println("Meu Long é " + meuLong);
        meuInt = 5/2;
        System.out.println("A divisão de 5 por 2 é " + meuInt);
        float meuFloat = 5f/2f;
        System.out.println("A divisão de 5 por 2 é " + meuFloat);
        double meuDouble = 5d/2d;
        System.out.println("A divisão de 5 por 2 é " + meuDouble);
        meuFloat = 5f/3f;
        System.out.println("No FLoat, a divisão de 5 por 3 é " + meuFloat);
        meuDouble = 5d/3d;
        System.out.println("No Double, a divisão de 5 por 3 é " + meuDouble);
        meuFloat = (float) (5.00 / 3); //o float tem problemas igual ao short e o byte, pois o java transsforma tudo para double,
        // logo não aceita uma declaração como meuFloat = 5.00 / 3;
        // é necessário encapsular a expressão e inserir o cast (float) no inicio
        System.out.println("no meu Flat usando cast, a divisão de 5 por 3 é " + meuFloat);
        double emPounds = 200d;
        double emKg = emPounds*0.45359237d;
        System.out.println("A conversão de " + emPounds + " Pounds é " + emKg + " Quilos");
        double escritaComUnderscore = 8_055_236.004_567_45d;
        System.out.println("Meu double com Undescore é " + escritaComUnderscore);
        char meuChar = 'D'; // o char é escrito com aspas unicas. Caso eu insira dois caracteres, haverá um erro.
        // mas o char aceita o formato unnnn onde o n é um algarismo de 0 a dez. esse é o formato unicode.
        char meuCharUnicode = '\u0044';
        System.out.println("meu char unicode é " + meuCharUnicode);
        char meuCharDecimal = 68;
        System.out.println("Meu char escrito em forma decimal (68) é " + meuCharDecimal);
        meuChar = '?';
        meuCharUnicode = '\u003f';
        meuCharDecimal = 63;
        System.out.println("imprimindo as 3 formas em char de escrever: normal - "
                + meuChar + ", Unicode - " + meuCharUnicode + ", Decimal - " + meuCharDecimal  );
        //       para mais simbolos unicode https://symbl.cc/pt/unicode/blocks/
        String minhaString = "quero ter R\u0024 1 milhão!!!!";
        System.out.println(minhaString + "Voce não?");
        // caso se use o + com variaveis de string e de numeros,
        // as variaveis de numeros serão concatenadas e o + será usado como concatenação, não como adição
        meuChar = 'A';
        char meuChar2 = 'B';
        System.out.println("A concatenação de 2 chars é");
        System.out.println(meuChar + meuChar2 ); // no caso, ao invés de concatenar A e B,
        // irá somar como se fosse3 um short que tem 2 bytes(16 bits), pois o char tem essa caracteristica
        // caso eu incuisse uma string na primeira parcela da soma da concetenação, o java consideraria o char como letra
        // mas não é o caso

        double primeiraVariavel = 20.01d;
        double segundaVariavel = 80.00d;
        double variavelSoma = (primeiraVariavel + segundaVariavel) * 100.00d;
        double modulo = variavelSoma % 40.00d;
        System.out.println("O modulo é " + modulo);
        boolean moduloZero = modulo == 0 ? true : false;

        System.out.println(moduloZero);
        if (!moduloZero)
            System.out.println("Existe um resto!!!");




    }
}
