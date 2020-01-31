package com.vanessa.alpascasts.entities

import dev.alpas.ozone.MigratingTable
import dev.alpas.ozone.bigIncrements
import me.liuwj.ktorm.entity.Entity
import me.liuwj.ktorm.schema.varchar

interface Playlist : Entity<Playlist> {

    var id: Long
    var title: String
    var description: String
    var image_path: String
}

object Playlists : MigratingTable<Playlist>("playlists") {
    val id by bigIncrements("id").bindTo { it.id }
    val title by varchar("title").bindTo { it.title }
    val description by varchar("description").bindTo { it.description }
    val imagePath by varchar("image_path").bindTo { it.image_path }
}
