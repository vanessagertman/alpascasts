package com.vanessa.alpascasts.controllers

import com.vanessa.alpascasts.entities.PlaylistVideos
import com.vanessa.alpascasts.entities.Videos
import dev.alpas.http.HttpCall
import dev.alpas.routing.Controller
import me.liuwj.ktorm.dsl.eq
import me.liuwj.ktorm.entity.findAll
import me.liuwj.ktorm.entity.findById
import me.liuwj.ktorm.entity.findList

class VideoController : Controller() {
    fun index(call: HttpCall) {
        val playlistId = call.routeParam("playlist_id").toString().toLong()
        val videoId = call.routeParam("video_id").toString().toLong()

        val video = Videos.findById(videoId) ?: call.abort(404)
        //todo get the rest of the playlist videos so we can show those too
        call.render("playlist_video", mapOf("video" to video))
    }
}
