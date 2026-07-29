package com.example.northstar.data

object Units {
    fun distance(km: Double, miles: Boolean): String = if (miles) {
        "%.1f mi".format(km * 0.621371)
    } else {
        "%.1f km".format(km)
    }

    fun speed(kmh: Double, miles: Boolean): String = if (miles) {
        "%.1f mph".format(kmh * 0.621371)
    } else {
        "%.0f km/h".format(kmh)
    }

    fun elevation(m: Double, miles: Boolean): String = if (miles) {
        "%.0f ft".format(m * 3.28084)
    } else {
        "%.0f m".format(m)
    }
}
