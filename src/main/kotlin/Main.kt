fun main(args: Array<String>) {

    /*
    Exercício 1

1 - Crie um novo projeto chamado NomeandoVariaveis
2 - Crie variáveis que armazenem o nome do usuário, idade, preferência de emprego, nacionalidade e tipo sanguíneo
3 - Pense como você pode nomear essas variáveis para ficarem fáceis de serem identificadas
4 - Use a idade do usuário para calcular o ano de seu nascimento, usando o ano atual como base (2021)
5 - No fim, printe todos os valores no console, juntamente com o ano em que o usuário nasceu

     */

    var nome = ""
    var idade = 0
    var preEmprego = ""
    var nacional = ""
    var tipoSague = ""
    var ano = 2021

     idade <= ano

    println("Digite seu nome:")
    nome = readLine()!!
    println("Digite sua idade:")
    idade = readLine()!!.toInt()
    println("Qual sua preferência de emprego:")
    preEmprego = readLine()!!
    println("Qual sua nacionalidade:")
    nacional = readLine()!!
    println("Qual seu tipo sanguneio:")
    tipoSague = readLine()!!

    println("Olá, meu nome é $nome, eu tenho $idade de idade" +
            ", quero trabalha como, $preEmprego sou $nacional e meu tipo sanguineo é $tipoSague " +
            ".\nSe estamos em, $ano eu nasci," +
            " em ${idade - ano}  ")








}






