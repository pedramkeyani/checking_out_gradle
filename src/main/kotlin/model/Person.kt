package keyani.toolkit.model

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.util.*

@Serializable
data class Person (var nam: String, var ID: String = UUID.randomUUID().toString())

fun main(args: Array<String>) {
    println("Hello World From Gradle Build")
    var pedram: Person = Person("Pedram Keyani")
    var raheleh: Person = Person("Raheleh Mansoor")

    val pedramString = Json.encodeToString(pedram)
    val rahelhString = Json.encodeToString(raheleh)
    println(pedramString)
    println(rahelhString)

    var newPed = Json.decodeFromString<Person>(pedramString)
    println("Goodbye")
    println("${newPed.nam}")

}