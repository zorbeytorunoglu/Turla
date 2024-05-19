plugins {
    alias(libs.plugins.turla.android.library)
    alias(libs.plugins.turla.android.hilt)
    id("kotlinx-serialization")
}

android {
    buildFeatures {
        buildConfig = true
    }
    namespace = "com.zorbeytorunoglu.turla.core.network"
}

dependencies {
    api(libs.kotlinx.datetime)
    api(project(":core:common"))
    api(project(":core:model"))

    implementation(libs.coil.kt)
    implementation(libs.coil.kt.svg)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
}