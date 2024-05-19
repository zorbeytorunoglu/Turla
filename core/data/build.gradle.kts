plugins {
    alias(libs.plugins.turla.android.library)
    alias(libs.plugins.turla.android.hilt)
}

android {

    namespace = "com.zorbeytorunoglu.turla.core.data"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

}

dependencies {

    api(project(":core:network"))
    api(project(":core:datastore"))

    testImplementation(libs.kotlinx.coroutines.test)
}