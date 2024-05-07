plugins {
    alias(libs.plugins.turla.android.library)
    alias(libs.plugins.turla.android.hilt)
}

android {
    namespace = "com.zorbeytorunoglu.turla.core.common"
}

dependencies {
    testImplementation(libs.kotlinx.coroutines.test)
}