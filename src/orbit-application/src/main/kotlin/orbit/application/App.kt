/*
 Copyright (C) 2015 - 2019 Electronic Arts Inc.  All rights reserved.
 This file is part of the Orbit Project <https://www.orbit.cloud>.
 See license in LICENSE.
 */

package orbit.application

import orbit.server.OrbitConfig
import orbit.server.OrbitServer

fun main() {
    val server = OrbitServer(OrbitConfig())
    server.start()
}