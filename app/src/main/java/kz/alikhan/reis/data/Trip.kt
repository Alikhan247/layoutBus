package kz.alikhan.reis.data

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*


open class Trip (
    @PrimaryKey var id: Long = 0,

    var from: String = "",
    var to: String = "",
    var addres: String = "",
    var date: Date = Date(),
    var totalSeats: Int = 51
): RealmObject()