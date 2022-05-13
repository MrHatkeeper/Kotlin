package skoroSerial

import kotlinx.serialization.json.JsonPrimitive
fun main() {
    val huh = listOf<Any?>("a",5,null,true)
    huh.forEach{ println(skoroSerializace(it)) }


}

fun skoroSerializace(o: Any?): JsonPrimitive {
    return if (o is Boolean) JsonPrimitive(o)
    else if (o is Number) JsonPrimitive(o)
    else if (o is String) JsonPrimitive(o)
    else if(o == null) JsonPrimitive(o)
    else JsonPrimitive("fetuješ ?????")
}

