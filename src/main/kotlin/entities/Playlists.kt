package com.vanessa.alpascasts.entities

import dev.alpas.ozone.OzoneEntity
import dev.alpas.ozone.OzoneTable
import dev.alpas.ozone.bigIncrements
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.varchar

interface Playlist : OzoneEntity<Playlist> {

    var id: Long
    var title: String
    var description: String
    var imagePath: String
    var priority: Int
}

object Playlists : OzoneTable<Playlist>("playlists") {
    val id by bigIncrements()
    val title by varchar("title").bindTo { it.title }
    val description by varchar("description").bindTo { it.description }
    val imagePath by varchar("image_path").bindTo { it.imagePath }
    val priority by int("priority").bindTo { it.priority }
}
