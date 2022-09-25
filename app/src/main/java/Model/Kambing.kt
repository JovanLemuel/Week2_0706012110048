package Model

class Kambing(name:String,type:String,age:String) : Model(name,type,age) {

    override fun animalSound():String {
        return "Bleh"
    }


}