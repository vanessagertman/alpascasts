package com.vanessa.alpascasts.controllers

import com.vanessa.alpascasts.entities.Playlists
import dev.alpas.http.HttpCall
import dev.alpas.routing.Controller
import me.liuwj.ktorm.entity.findAll

class WelcomeController : Controller() {
    fun index(call: HttpCall) {
        val playlists = Playlists.findAll()
        call.render("welcome", mapOf("playlists" to playlists))
    }
}
