// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
    /*//ksp plugin
    id("com.google.devtools.ksp") version "1.9.24-1.0.20" apply false*/
    //room plugin
    id("androidx.room") version "2.6.0" apply false
}
/*

buildScript{
    repositories{
        mavenCentral()
        google()
    }

    dependencies{
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
        classpath("com.google.gms:google-services:4.4.2")
    }
}*/
