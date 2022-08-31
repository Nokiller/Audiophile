fun main(){
    val amount = 10001 //сумма покупки в рублях
    val discountStart = 1001
    val isAudiophile = true

    val priceDiscount: Double = if (amount <= discountStart) 0.0
                                else if (amount in discountStart..10000) 100.0
                                else amount * 0.05

    val priceWithUsualDiscount = amount - priceDiscount
    val totalPrice = if (isAudiophile) priceWithUsualDiscount * 0.99 else priceWithUsualDiscount

    println(totalPrice)
}