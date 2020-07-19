package com.frozenbrain.fiimateriale.data

import com.frozenbrain.fiimateriale.data.Data

class CourseItem(val name: String = "",
                 val short: String = "",
                 val credits: Int = -1,
                 val megaLink: String = "",
                 val sitePage: String = "",
                 val sitePassword: String = ""
): Data {
    override fun getType(): Int {
        return Data.TYPE_CLASS
    }
}