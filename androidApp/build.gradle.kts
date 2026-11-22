plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
}

kotlin {
    jvmToolchain(21)
}

android {
    namespace = "com.corbettcode.yaca"
    compileSdk = 37

    defaultConfig {
        minSdk = 24
        targetSdk = 37

        applicationId = "com.corbett.yaca.androidApp"
        versionCode = 1
        versionName = "1.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {
    implementation(project(":composeApp"))
    implementation(libs.androidx.activityCompose)
    debugImplementation(libs.jetbrains.compose.ui.tooling)
}
