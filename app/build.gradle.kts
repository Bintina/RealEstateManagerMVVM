/*buildScript {
    repositories{
        google()
        mavenCentral()
    }

}*/

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
/*    //ksp plugin
    id("com.google.devtools.ksp")*/
    //room plugin
    id("androidx.room")
}

android {
    namespace = "com.bintina.realestatemanagermvvm"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.bintina.realestatemanagermvvm"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        compose = true
    }
    room {
        schemaDirectory("$projectDir/schemas")
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Compose dependencies
    val composeBom = platform("androidx.compose:compose-bom:2024.06.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)
    implementation("androidx.compose.runtime:runtime")
    implementation("androidx.compose.ui:ui-graphics")

    //Material Design 3
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui")

    //Android Studio Preview support
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")

    //UI Tests
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    //Optional icons
    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.compose.material3:material3-window-size-class")

    //Activity integration
    implementation("androidx.activity:activity-compose")
    //ViewModel integration
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose")
    //LiveData integration
    implementation("androidx.compose.runtime:runtime-livedata")
    //RxJava implementation
    implementation("androidx.compose.runtime:runtime-rxjava2")

    //Room dependencies
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    /*ksp("androidx.room:room-compiler:2.6.1")*/
    implementation("androidx.room:room-ktx:2.6.1")
    androidTestImplementation("androidx.room:room-testing:2.6.1")
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0")

    //ViewModel and LiveData Dependencies
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.4")
    implementation("androidx.lifecycle.lifecycle-common-java:2.8.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.8.4")
    implementation("androidx.lifecycle:lifecycle-runtime-linuxx64:2.8.4")

}