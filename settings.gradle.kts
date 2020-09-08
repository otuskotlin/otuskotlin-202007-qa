rootProject.name = "otuskotlin-202007-qa-eg"


include(":qa-common")
include(":qa-transport-common")


pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
    }
}


