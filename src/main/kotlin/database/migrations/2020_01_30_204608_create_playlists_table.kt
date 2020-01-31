package com.vanessa.alpascasts.database.migrations

import com.vanessa.alpascasts.entities.Playlists
import dev.alpas.ozone.migration.Migration

class CreatePlaylistsTable : Migration() {
    override fun up() {
        createTable(Playlists)
    }
    
    override fun down() {
        dropTable(Playlists)
    }
}