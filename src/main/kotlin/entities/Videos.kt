package com.vanessa.alpascasts.entities

import dev.alpas.ozone.MigratingTable
import dev.alpas.ozone.bigIncrements
import me.liuwj.ktorm.entity.Entity
import me.liuwj.ktorm.schema.text
import me.liuwj.ktorm.schema.varchar

interface Video : Entity<Video> {

    var id: Long
    var title: String
    var description: String
    var image_path: String?
    var link: String
}

object Videos : MigratingTable<Video>("videos") {
    val id by bigIncrements("id").bindTo { it.id }
    val title by varchar("title").bindTo { it.title }
    val description by text("description").bindTo { it.description }
    val imagePath by varchar("image_path").bindTo { it.image_path }
    val link by varchar("link").bindTo { it.link }
}
