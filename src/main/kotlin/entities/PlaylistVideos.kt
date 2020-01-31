package com.vanessa.alpascasts.entities

import dev.alpas.ozone.MigratingTable
import dev.alpas.ozone.bigIncrements
import me.liuwj.ktorm.entity.Entity
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.long

interface PlaylistVideo : Entity<PlaylistVideo> {

    var id: Long
    var playlist_id: Playlist
    var video_id: Video
    var order: Int
}

object PlaylistVideos : MigratingTable<PlaylistVideo>("playlist_videos") {
    val id by bigIncrements("id").bindTo { it.id }
    val playlistId by long("playlist_id").references(Playlists) { it.playlist_id }
    val videoId by long("video_id").references(Videos) { it.video_id }
    val order by int("order").bindTo { it.order }
}
