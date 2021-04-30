import kotlin.random.Random

fun main(){

    var num=0
    var sum=0
    val listaNum= mutableListOf<Int>()
    val listaFin=mutableListOf<Int>()

    for(i in 0..100){ //for para recorrer
        num= Random.nextInt(0,100) //coger un numero aleatorio entre 0 y 100
        listaNum.add(num)
        sum+=num
    }

    for(j in 0..100){ //for para coger los numeros mayores a la media
        if(listaNum[j] >sum/100) //vemos los numeros que hay en la primera lista, si son mayores que la media los metemos en la lista
            listaFin.add(listaNum[j]) //aqui añadimos a la lista final los numeros de la primera lista
    }
    println("Media: ${sum/100}")
    println("\nTodos los numeros mayores a la media:");
    listaFin.forEach {
        println(it)
    }
}