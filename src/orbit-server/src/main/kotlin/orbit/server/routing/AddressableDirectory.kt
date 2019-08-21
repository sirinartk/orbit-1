 /*
 Copyright (C) 2015 - 2019 Electronic Arts Inc.  All rights reserved.
 This file is part of the Orbit Project <https://www.orbit.cloud>.
 See license in LICENSE.
 */

package orbit.server.routing

import orbit.server.*
import orbit.server.net.NodeId

 interface AddressableDirectory {
    fun lookup(address: BaseAddress) : NodeId?
    fun setLocation(address: BaseAddress, node: NodeId)
}