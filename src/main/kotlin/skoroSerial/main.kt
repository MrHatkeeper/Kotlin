package skoroSerial

import kotlinx.serialization.json.*

fun main() {
    val user = Usr("Pepa", true)
    val huh = listOf("a",5,null,true, arrayOf(5,5,5), user)
    huh.forEach{ println(skoroSerializace(it)) }


}

fun skoroSerializace(o: Any?): Any {
    return if (o is Boolean) JsonPrimitive(o)
    else if (o is Number) JsonPrimitive(o)
    else if (o is String) JsonPrimitive(o)
    else if(o == null) JsonNull
    else if(o is Array<*>) JsonArray(o.asList() as List<JsonElement>)
    else if(o::class.isData) o::class.members.map { it.name }
    else JsonPrimitive("fetuješ ?????")
}

data class Usr(val name: String, val gender: Boolean)
