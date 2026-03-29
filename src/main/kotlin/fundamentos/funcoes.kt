package fundamentos

/* Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos.
 Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres
 Escreva uma função capaz de calcular o cubo de um número
 Escreva uma função capaz de receber milhas e converter em km
 Escreva uma fução capaz de converter celsious em fahrenheint
*/
fun converterAno (ano: Int){
    val meses = ano * 12
    println("$meses meses")
    val dias = ano * 365
    println("$dias dias")
    val horas = dias * 24
    println("$horas horas")
    val minutos = horas * 60
    println("$minutos minutos")
    val segundos = minutos * 60
    println("$segundos segundos")
}

fun contarCaracteres (palavra: String): Int{
    val caracteres = palavra.length
    return caracteres
}

fun cubo (num: Int){
    val cubo = num * num * num
    println("O cubo de $num é $cubo")
}

fun milhasToKm(milhas: Double): Double{
    val km = milhas * 1.609
    return km
}

fun celsiousToFahrenheit(celsious: Double): Double{
    return (celsious * 9/5) + 32
}

fun main() {

    println("Digite a quantidade de anos: ")
    val entradaAnos = readln()
    val ano = entradaAnos.toIntOrNull()
    if(ano != null) {
        converterAno(ano)
    } else{
        println("Entrada inválida")
    }

    println("Digite uma palavra: ")
    val entradaPalavra = readln()
    if(entradaPalavra != null) {
        val resultPalavras = contarCaracteres(entradaPalavra)
        println("A palavra $entradaPalavra tem $resultPalavras caracteres")

    } else{
        println("Entrada inválida")
    }

    println("Digite um número: ")
    val entradaNum = readln()
    val num = entradaNum.toIntOrNull()
    if(num != null){
        cubo(num)
    } else{
        println("Entrada inválida")
    }

    println("Digite o número de milhas: ")
    val entradaMilhas = readln()
    val milhas = entradaMilhas.toDoubleOrNull()
    if(milhas != null){
        println("$milhas milhas são ${milhasToKm(milhas)} km")
    } else {
        println("Entrada inválida")
    }

    println("Digite o grau em Celsious: ")
    val entradaCelsious = readln()
    val celsious = entradaCelsious.toDoubleOrNull()
    if(celsious != null){
        println("$celsious celsious é igual a ${celsiousToFahrenheit(celsious)} fahrenheit")
    } else{
        println("Entrada inválida")
    }

}