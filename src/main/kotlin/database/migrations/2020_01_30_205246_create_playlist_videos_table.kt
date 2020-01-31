package com.vanessa.alpascasts.database.migrations

import com.vanessa.alpascasts.entities.PlaylistVideos
import dev.alpas.ozone.migration.Migration

class CreatePlaylistVideosTable : Migration() {
    override fun up() {
        createTable(PlaylistVideos)
    }
    
    override fun down() {
        dropTable(PlaylistVideos)
    }
}