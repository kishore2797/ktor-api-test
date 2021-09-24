package com.synctor

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.synctor.plugins.*
import com.synctor.routes.registerCustomerRoutes
import com.synctor.routes.registerOrderRoutes

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        registerCustomerRoutes()
        registerOrderRoutes()
    }.start(wait = true)
}

