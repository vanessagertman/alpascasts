package com.vanessa.alpascasts.controllers

import dev.alpas.http.HttpCall
import dev.alpas.routing.Controller

class PlaylistController : Controller() {
    fun index(call: HttpCall) {
        call.render("playlist")
    }
}
