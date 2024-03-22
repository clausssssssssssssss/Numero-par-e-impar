package claudia.ortega.numeropareimpar

class Calculo {
    fun Calcular(numero: Int): String{
        var resultado: String
        if(numero % 2 == 0){
            resultado = "par"
        }
        else{
            resultado = "Impar"
        }
        return resultado
    }
}