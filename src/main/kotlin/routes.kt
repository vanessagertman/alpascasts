package com.vanessa.alpascasts

import com.vanessa.alpascasts.controllers.VideoController
import com.vanessa.alpascasts.controllers.WelcomeController
import dev.alpas.routing.RouteGroup
import dev.alpas.routing.Router

fun Router.addRoutes() = apply {
    group {
        webRoutesGroup()
    }.middlewareGroup("web")

    apiRoutes()
}

private fun RouteGroup.webRoutesGroup() {
    get("/", WelcomeController::class).name("welcome")
    group("playlists") {
        get("<playlist_id>/videos/<video_id>", VideoController::class).name("videos")
    }.name("playlists")
    // register more web routes here
}

private fun Router.apiRoutes() {
    // register API routes here
}
