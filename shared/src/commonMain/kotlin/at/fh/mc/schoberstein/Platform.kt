package at.fh.mc.schoberstein

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform