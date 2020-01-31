package com.vanessa.alpascasts.database.migrations

import com.vanessa.alpascasts.entities.Videos
import dev.alpas.ozone.migration.Migration

class CreateVideosTable : Migration() {
    override fun up() {
        createTable(Videos)
    }

    override fun down() {
        dropTable(Videos)
    }
}
