fun main() {
//        val fruits = listOf("banana","apple","mango","avocado")
//    println(fruits)
//    val zemunda = mutableListOf(12500000,"Alfavo",true,20.16,6,34.5f)
////    fruits.add("watermellon")
//    zemunda.add("constitutional Mornachy")
//    zemunda.remove(34)
//    println(zemunda)
    val numbers = listOf(32,77,21,86,95,43,32,22)
    val evenNums=numbers.filter{ num ->num%2==0}
    println(evenNums)



//    println(numbers.max())
//    println(numbers.min())
//    println(numbers.sum())
//    println(numbers.first())
//    println(numbers.get(5))
//    println(numbers.indexOf(86))
//    println(numbers.lastIndexOf(32))
//    println(numbers.lastIndex)
//    numbers.sort()
    println(numbers)
    numbers.sorted()
    println(numbers)
    createProductlist()

//    common(12,)
//    write a function  that sums up
//    var t= interger()
//    println(t)
}
//
    //         sum of    all the elements in a list of intergers
//    fun interger(): Int {
//        val ints = listOf(2, 5, 9, 10)
//        var count = 0
//        for (i in ints) {
//             count+=i
//
//        }
//        return count
//
//    }
data class Product(var name:String,var price:Double)
fun createProductlist(){
    val prod1=Product("iphone",1200.0)
    val prod2=Product("Switch",500.0)
    val prod3=Product("Adidas",3500.0)
    val  list= listOf<Product>(prod1,prod2,prod3)
    val filterlist=list.filter { list->list.price<1000 }
    println(list)
    println(filterlist)
    val sorted=list.sortedByDescending{ list ->list.price}
    println(sorted)
}
//fun common():Int {
//    val number = listOf<Int>(12, 17, 31, 54, 67, 89, 21, 34, 56)
//    val ad = 0
//    for (i in number) {
//        if (i % 2 == 0) {
//
//        }
//        return i
//    }
//
//}
val people= mutableListOf<>("Ada","Kamau")
peple.indices
