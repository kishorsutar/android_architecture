package com.kishor.solid.kotlin

import sun.net.www.http.HttpClient
import java.net.URI

/*class Network {
    private val url = URI("http://get the robot service")

    fun broadCast(message: String) {
        val httpClient = HttpClient.newHttpClient()
        val body = HttpRequest.BodyPublishers.ofString(message)
        val request = HttpRequest.newBuilder(uri).POST(body).build()
        httpClient.send(request, HttpResponse.BodyHandlers.discarding())
    }
}*/

/**
 * this class needs changes if we add new type of network so this can be done using
 * interface/abstraction
 */

interface Network {
    fun broadCast(message: String)
}

class HttpNetwork : Network {
    private val url = URI("http://get the robot service")

    override fun broadCast(message: String) {
        val httpClient = HttpClient.New(url.toURL())
//        val body = HttpRequest.BodyPublishers.ofString(message)
//        val request = HttpRequest.newBuilder(uri).POST(body).build()
//        httpClient.send(request, HttpResponse.BodyHandlers.discarding())
    }
}

class WebsocketNetwork : Network {

    override fun broadCast(message: String) {
        // broadCast using web socket connection
    }
}


