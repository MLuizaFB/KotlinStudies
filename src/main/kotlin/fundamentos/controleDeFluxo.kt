package fundamentos

/*
Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionáros receberão no final do ano. Os bônus são classificados por cargo:
a. Gerentes recebem R$2.000,00
b. Coordenadores recebem R$1.500,00
c. Engenheiros de Software recebem R$1.000,00
d. Estagiários recebem R$500,00

2. Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus:
a. Gerentes com menos de 2 anos e experiência recebem R$2.000,00, caso contrário recebem R$3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$1.500,00, caso contrário recebem R$1.800,00
*/
fun bonus (salario: Double, cargo: String, experiencia: Int): Double{
    var bonus: Double = 0.0
    if(cargo === "Estagiário"){
        bonus = salario + 500.00
    } else if(cargo === "Engenheiro"){
                bonus = salario + 1000.00
            } else if (cargo === "Coordenador"){
                        if(experiencia < 1){
                            bonus = salario + 1500.00
                        } else{
                            bonus = salario + 1800.00
                        }
                    } else if (cargo === "Gerente"){
                                if(experiencia < 2){
                                    bonus = salario + 2000.00
                                } else{
                                    bonus = salario + 3000.00
                                }
                            } else {
                                println("Cargo inválido")
                            }
    return bonus
}

/*
Escreva um programa para ser usado na portaria de um evento
a. Peça a idade. Menores de idade não são permitidos. Mensagem: "Negado. Menores de idade não são permitidos."
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum destes. Mensagem: "Negado. Convite inválido".
c. Peça o código do convite. Convites premium e luxo começam com "XL". Convites comuns começam com "XT". Caso o código não esteja nos padrões, negar a entrada. Mensagem: "Negado. Convite inválido".
d. Caso todos os critérios sejam satisfeitos, exibir "Welcome".
*/
fun evento(idade: Int, tipo: String, codigo: String){
    if(idade < 18){
        println("Negado. Menores de idade não são permitidos.")
        return
    }
    if(tipo == "Comum" || tipo == "Premium" || tipo == "Luxo"){
        if (((tipo == "Premium" || tipo =="Luxo") && codigo == "XL")  ){
            println("Welcome")
            return
        } else if(tipo == "Comum" && codigo == "XT"){
            println("Welcome")
            return
        } else{
            println("Convite inválido")
            return
        }
    } else{
        println("Convite inválido")
        return
    }
}

/*
 Imprima os números de 1 a 50 na mesma linha em ordem crescente e depois em outra linha em ordem descrescente.
 Imprima os números de 1 a 50 de forma crescente sem imprimir os múltiplos de 5.
 Faça a soma de todos os números no intervalo de 1 a 500.
*/
fun imprimirNumeros(){
    for (i in 1..50){
        print("$i ")
    }
    println()
    for (i in 50 downTo 1){
        print("$i ")
    }
    println()
    for(i in 1..50){
        if(i % 5 == 0){
            continue
        }
        print("$i ")
    }
    println()
    var soma: Int = 0
    for (i in 1 .. 500){
        soma += i
    }
    println("$soma")
}

/*
Considere uma caixa de água de 2 mil litros. Rômulo gostaria de encher a caixa com balões de água de 7 litros.
Quantos balões cabem na caixa sem que o volume seja excedido?
*/
fun baloes(){
    var soma: Int = 7
    while (soma + 7 <= 2000){
        soma += 7
    }
    println("Cabem ${soma/7} balões na caixa")
}

/*
Imprima os números de 1 a 50 em ordem crescente de acordo com a regra:
a. Quando um número for divisivel por 3, imprimir Buzz.
b. Quando um número for divisivel por 5, imprimir Fizz.
c. Quando um número for divisivel por 3 e 5, imprimir FizzBuzz
*/
fun fizzBuzz(){
    var i: Int = 0
    while(i <= 50){
        if(i % 3 == 0 && i % 5 == 0){
            println("FIzzBuzz")
        } else if(i % 3 == 0){
            println("Buzz")
        } else if(i % 5 == 0){
            println("Fizz")
        } else{
            println("$i")
        }
        i++
    }
}

/*
Escreva um programa capaz de receber um texto e imprimi-lo invertido.
*/
fun inverter(texto: String){
    var tamanho = texto.length
    for(i in (tamanho - 1) downTo 0){
        print(texto[i])
    }
}

fun main(){
    val resultBonus = bonus (salario = 8000.00, cargo = "Gerente", experiencia = 1)
    println(resultBonus)

    evento(idade = 20, tipo = "Comum", codigo = "XT")

    imprimirNumeros()

    baloes()
    fizzBuzz()
    inverter("Fizz")
}