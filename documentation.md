## Docs Java

- O código compilado pela JVM gera um byte code específico para rodar para cada sistema operacional específico;

- Java é fortemente tipado;

- No Java, a passagem de parâmetro funciona como uma simples atribuição como no uso do "=". Então, esse parâmetro vai copiar o valor da variável do tipo Conta que for passado como argumento. E qual é o valor de uma variável dessas? Seu valor é um endereço, uma referência, nunca um objeto. Por isso não há cópia de objetos aqui;

- A classe Banco usa a classe Conta que usa a classe Cliente, que usa a classe Endereco . Dizemos que esses objetos colaboram, trocando mensagens entre si. Por isso acabamos tendo muitas classes em nosso sistema, e elas costumam ter um tamanho relativamente curto.

- Quando damos new em um objeto, ele o inicializa com seus valores default, 0 para números, false para boolean e null para referências. null é uma palavra chave em java, que indica uma referência para nenhum objeto.

- Se, em algum caso, você tentar acessar um atributo ou método de alguém que está se referenciando para null , você receberá um erro durante a execução ( NullPointerException , que veremos mais à frente). Da para perceber, então, que o new não traz um efeito cascata, a menos que você dê um valor default (ou use construtores, que também veremos mais a frente).

- O nome de um método não pode começar com um número.

- É necessário usar a palavra chave this quando for acessar um atributo.

- nomeDeAtributo, nomeDeMetodo, nomeDeVariavel, NomeDeClasse.

- Compilar todas as classes de uma vez => javac *.java

### MODIFICADORES DE ACESSO E ATRIBUTOS DE CLASSE

- Na orientação a objetos, é prática quase que obrigatória proteger seus atributos com private.
- É muito comum, e faz todo sentido, que seus atributos sejam private e quase todos seus métodos sejam  public. Desta forma, toda conversa de um objeto com outro é feita por troca de mensagens, isto é, acessando seus métodos.

### ENCAPSULAMENTO

- Encapsulamento => esconder os membros de uma classe (rotinas e métodos).

- Encapsular é fundamental para que o sistema seja sucetível a mudanças. Para mudar uma regra de negócio é muito mais simples modificar o método do que mudar os atributos para criar bugs.

- O conjunto de métodos públicos de uma classe é também chamado de interface da classe, pois esta é a única maneira a qual você se comunica com objetos dessa classe.

- Sempre que vamos acessar um objeto, utlizamos sua interface. Exemplo: Quando você dirige um carro, o que te importa são os pedais e o volante (interface) e não o motor que você está usando (implementação).

### GETTERS E SETTERS

- O modificador private faz com que ninguém consiga modificar, nem mesmo ler, o atributo em questão. Com isso, temos um problema: como fazer para mostrar o saldo de uma Conta , já que nem mesmo podemos acessá-lo para leitura?

- Para permitir o acesso aos atributos (já que eles são private ) de uma maneira controlada, a prática mais comum é criar dois métodos, um que retorna o valor e outro que muda o valor.

- É uma má prática criar uma classe e, logo em seguida, criar getters e setters para todos seus atributos. Você só deve criar um getter ou setter se tiver a real necessidade. Repare que nesse exemplo setSaldo não deveria ter sido criado, já que queremos que todos usem deposita() e saca().

- Outro detalhe importante, um método getX não necessariamente retorna o valor de um atributo que chama X do objeto em questão.

- Encapsulamento esconde a maneira como os objetos guardam seus dados. É uma prática muito importante.

### CONSTRUTORES

- Quando usamos a palavra chave new, estamos construindo um objeto;
- O New executa o construtor da classe;
- O interessante é que um construtor pode receber um argumento, podendo assim inicializar algum tipo de informação.
- O construtor se resume a dar possibilidades ou obrigar o usuário de uma classe a passar argumentos para o objeto durante o processo de criação do mesmo.
- Um construtor pode chamar outro, mas ambos só podem ser construidos ao instânciar um objeto com new.

### ATRIBUTOS DE CLASSE

- Quando declaramos um atributo como static , ele passa a não ser mais um atributo de cada objeto, e sim um atributo da classe, a informação fica guardada pela classe, não é mais individual para cada objeto.
- Para acessarmos um atributo estático, não usamos a palavra chave this, mas sim o nome da classe
- Métodos e atributos estáticos só podem acessar outros métodos e atributos estáticos da mesma classe, o que faz todo sentido já que dentro de um método estático não temos acesso à referência this , pois um método estático é chamado através da classe, e não de um objeto.
- O static realmente traz um "cheiro" procedural, porém em muitas vezes é necessário.

### IMPORT DE CLASS

- Importar todas as classes de um pacote não implica em perda de performance em tempo de execução, mas pode trazer problemas com classes de mesmo nome! Além disso, importar de um em um é considerado boa prática

### ACESSO AOS ATRIBUTOS, CONSTRUTORES E MÉTODOS

`Os modificadores de acesso existentes em Java são quatro:`

- **public** => _Todos podem acessar aquilo que for definido como public. Classes, atributos, construtores e métodos podem ser public._
- **protected** => _Aquilo que é protected pode ser acessado por todas as classes do mesmo pacote e por todas as classes que o estendam, mesmo que essas não estejam no mesmo pacote. Somente atributos, construtores e métodos podem ser protected._
- **padrão** => _(sem nenhum modificador) - Se nenhum modificador for utilizado, todas as classes do mesmo pacote têm acesso ao atributo, construtor, método ou classe._
- **private** => _A única classe capaz de acessar os atributos, construtores e métodos privados é a própria classe. Classes, como conhecemos, não podem ser private , mas atributos, construtores e métodos sim._

- Para melhor organizar seu código, o Java não permite mais de uma classe pública por arquivo e o arquivo deve ser NomeDaClasse.java.
- Classes aninhadas podem ser protected ou private , mas esse é um tópico avançado que não será estudado nesse momento.
