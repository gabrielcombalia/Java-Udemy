# Java-Udemy

curso java udemy

sudo apt  install openjdk-17-jdk

digitando sudo apt install openjdk + a tecla TAB, aparecerá as versões canonicas possíveis do repositório apt


java -version

java => vai aparecer um monte de opção já que não fo idado nenhum argumento

jshell => entra num tipo de irb para o ruby, tambem roda na linha de comando do windows

dentro da Jshell o prof digita os comandos

/help intro

/help

que retorna o help do jshell

/list -all => uma lista de código incorporado ou bibliotecas de código que o jshell está incluindo no ambiente naquele momento

/exit para sair

o que é declaração? é um comando completo a ser executado. Pode conter uma ou várias expressões.

System.out.print("Hello World");

dentro da Jshell vai imprimir na tela Hello World. está feito o promeiro Hello World!


tipos primitivos de dados => boolean, byte, char, double, float, int, long, short

int meuPrimeiroNumero = 5; => imprime a variavel numero na Jshell, depois da variavel criada, pode-se mudar o valor dela sem declarar no inicio o tipo de variavel. claro, sendo o mesmo tipo de variavel. Isso só acontece no Jshell pois uma variavel em java não pode ser redeclarada.


como foi dito antes, isso é uma declaração

System.out.print(meuPrimeiroNumero); => imprime 5

se executarmos /list, poderemos ver que a variável meuPrimeiroNumero está salva

se executarmos /var, veremos apenas as variaveis criadas


dentro do Jshell vamos criar outras variaveis:

int meuSegundoNumero = 35

int meuTerceiroNumero = 4+10*5
int meuQuartoNumero = meuPrimeiroNumero + meuSegundoNumero + meuTerceiroNumero

meuPrimeiroNumero = MeuQuartoNumero*2 (No Jshell é possível isso)

int numeroMinimo = Integer.MIN_VALUE;

O Jshell irá cuspir -2147483648 que é o numero mínimo

Fazendo o mesmo com o numero maior de int:

int numeroMaximo = Integer.MAX_VALUE;

irá cuspir o mesmo número mínimo mas com sinal invertido

O professor concatena uma resposta:



System.out.print("Valor minimo do integer é: " + numeroMinimo);

System.out.print("Valor minimo do integer é: " + Integer.MIN_VALUE);

System.out.print("Banda do integer ( " + Integer.MIN_VALUE + “ até ” + Integer.MIN_VALUE + “)”);

System.out.print("Banda do Byte ( " + Byte.MIN_VALUE + “ até ” + Byte.MIN_VALUE + “)”);

System.out.print("Banda do Short ( " + Short.MIN_VALUE + “ até ” + Short.MIN_VALUE + “)”);

System.out.print("Banda do Long ( " + Long.MIN_VALUE + “ até ” + Long.MIN_VALUE + “)”);

byte => 1 byte => 8 bits => 2 elevado a 8 = 256
short => 2 bytes => 16 bits => 2 elevado a 16 = 65.536
int => 4 bytes => 32 bits => 2 elevado a 32 = 4.294.967.296
long => 8 bytes => 64 bits => 2 eleavdo a 64 = 18.446.744.073.709.551.616

para declarar uma variavel long, não basta fazer isso:

long variavel = 100;

pois o java vai transformar em int. Precisa então fazer isso:

long variavel = 100L; => incluir um L tanto maiusculo ou minusculo no final

quando a variavel for realmente maior do que 2 elevado a 64, vai dar erro na hora caso não tenha o L no final

posso declarar variaveis desses jeitos em java:

byte var1 = 4; int var2 = 5;
byte var1 = 3, var2 = 4;


byteMinimo = Byte.MIN_VALUE

byte meuByte = byteMinimo/2 => dá erro de conversão, pois o java tende a converter todos os numeros para integer então é necessário indicar da seguinte maneira:

byte meuByte = (byte) (byteMinimo/2)

o short se comporta da mesa maneira em relação ao int. o Java tende a converter os valores automaticamente para o int.

com o proprio int não é necessario o cast pq de fato o padrão do java é o int


o double é a principal classe de numeros decimais em detrimento do float, logo o cast terá que ser usado para o float caso convenha e não será necessario ṕara o double

caso escrevamos:

float meuFloat = 5.25; => vai dar um erro por causa disso, pois o java trata o 5.25 como double, para corrigir então, fazemos a mesma lógica do byte e do short em relação ao int:

float meuFloat = (float) 5.25;

ou

float meuFloat = 5.25f;

mas o professor avisa que o float está caindo em desuso

notação cientifica
5e1 é o mesmo que 5 x 10¹
5e2 é o mesmo que 5 x 10²


