pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Real Estate Manager MVVM"
include(":app")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
 