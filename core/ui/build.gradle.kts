plugins {
    alias(libs.plugins.turla.android.library)
    alias(libs.plugins.turla.android.library.compose)
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    namespace = "com.zorbeytorunoglu.turla.core.ui"
}

dependencies {
    api(project(":core:designsystem"))
    api(project(":core:data"))

    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
}