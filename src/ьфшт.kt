import com.google.gson.Gson


fun main() {
    val gson = Gson()
    val id = Id(34724678,"saydullo","jorahonoov-7","saydullo24@gmail.com")
    val gsonString = gson.toJson(id)
    println(gsonString)

    val adress =Adress("qirquli","ulug'vor","fergana","376828434")
    val gsonString2 = gson.toJson(adress)
    println(gsonString2)

    val geo = Geo("4823582763","437693762")
    val gsonString3 = gson.toJson(geo)
    println(gsonString3)


    val user1 = User1("93-709-61-71","sjfasshgcvkzjn")
    val gsonString4 = gson.toJson(user1)
    println(gsonString4)

    val campaniy = Campaniy("shcool","sdjhfgzj","dhfahgsvgaszgc")
    val gsonString5 = gson.toJson(campaniy)
    println(gsonString5)
}
