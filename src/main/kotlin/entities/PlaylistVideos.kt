package com.vanessa.alpascasts.entities

import dev.alpas.ozone.MigratingTable
import dev.alpas.ozone.bigIncrements
import me.liuwj.ktorm.entity.Entity
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.long

interface PlaylistVideo : Entity<PlaylistVideo> {
    var id: Long
    var playlist: Playlist
    var video: Video
    var order: Int
}

object PlaylistVideos : MigratingTable<PlaylistVideo>("playlist_videos") {
    val id by bigIncrements("id").bindTo { it.id }
    val playlistId by long("playlist_id").references(Playlists) { it.playlist }
    val videoId by long("video_id").references(Videos) { it.video }
    val order by int("order").bindTo { it.order }
}
