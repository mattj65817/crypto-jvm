pluginManagement {
    apply(from = "./repository.gradle.kts")
    repositories {
        val ciniraArtifacts: Action<RepositoryHandler> by extra
        gradlePluginPortal()
        ciniraArtifacts(this)
    }
}

plugins {
    kotlin("jvm") version "1.9.10" apply false
}
