package com.vanessa.alpascasts.controllers

import com.vanessa.alpascasts.entities.PlaylistVideos
import com.vanessa.alpascasts.entities.Playlists
import dev.alpas.http.HttpCall
import dev.alpas.routing.Controller
import me.liuwj.ktorm.entity.findAll

class WelcomeController : Controller() {
    fun index(call: HttpCall) {
        val playlists = Playlists.findAll().sortedBy { it.priority}
        // todo: make this efficient
        val playlistVideos = PlaylistVideos.findAll()

        val firstPlaylistVideosFromPlaylists = playlists.map { playlist ->
            val allVideos = playlistVideos.filter { it.playlist.id == playlist.id }
            allVideos.sortedBy { it.order }.first()
        }
        call.render("welcome", mapOf("playlists_videos" to firstPlaylistVideosFromPlaylists))
    }
}
