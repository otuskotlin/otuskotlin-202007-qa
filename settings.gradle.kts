rootProject.name = "otuskotlin-202007-qa-eg"


include("qa-be-common")


pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
    }
}
include("qa-be-app-ktor")
