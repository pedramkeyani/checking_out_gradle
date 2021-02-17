package model

import kotlinx.serialization.Serializable

@Serializable
data class Handle (val label: String, val contact: String)