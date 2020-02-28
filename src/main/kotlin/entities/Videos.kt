package com.vanessa.alpascasts.entities

import dev.alpas.ozone.OzoneEntity
import dev.alpas.ozone.OzoneTable
import dev.alpas.ozone.bigIncrements
import me.liuwj.ktorm.schema.text
import me.liuwj.ktorm.schema.varchar

interface Video : OzoneEntity<Video> {

    var id: Long
    var title: String
    var description: String
    var image_path: String?
    var link: String
}

object Videos : OzoneTable<Video>("videos") {
    val id by bigIncrements()
    val title by varchar("title").bindTo { it.title }
    val description by text("description").bindTo { it.description }
    val imagePath by varchar("image_path").bindTo { it.image_path }
    val link by varchar("link").bindTo { it.link }
}
