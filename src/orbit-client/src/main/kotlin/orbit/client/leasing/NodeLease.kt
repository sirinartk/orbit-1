/*
 Copyright (C) 2015 - 2019 Electronic Arts Inc.  All rights reserved.
 This file is part of the Orbit Project <https://www.orbit.cloud>.
 See license in LICENSE.
 */

package orbit.client.leasing

import orbit.shared.proto.NodeManagementOuterClass
import orbit.shared.proto.util.toInstant
import java.time.Instant

data class NodeLease(
    val nodeId: String,
    val challenge: String,
    val expiresAt: Instant,
    val renewAt: Instant
)

fun NodeManagementOuterClass.NodeLease.toNodeLease() = NodeLease(
    nodeId = this.nodeIdentity,
    challenge = this.challengeToken,
    expiresAt = this.expiresAt.toInstant(),
    renewAt = this.renewAt.toInstant()
)