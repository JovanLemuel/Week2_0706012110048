package Model

import android.os.Parcel
import android.os.Parcelable

open class Model (
    var name: String?,
    var type: String?,
    var age: String?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    var imageUri:String=""

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(type)
        parcel.writeString(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Model> {
        override fun createFromParcel(parcel: Parcel): Model {
            return Model(parcel)
        }

        override fun newArray(size: Int): Array<Model?> {
            return arrayOfNulls(size)
        }
    }

    open fun animalSound(): String{
        return ""
    }

    open fun animalFood (type: String ): String {
        return "Makan $type";
    }
    open fun animalFood(text1: String, text2: String ): String {
        return "$text1 $text2";
    }
}