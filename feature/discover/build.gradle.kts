plugins {
    alias(libs.plugins.turla.android.feature)
    alias(libs.plugins.turla.android.library.compose)
}

android {
    namespace = "com.zorbeytorunoglu.turla.feature.discover"
}

dependencies {

    implementation(project(":core:data"))

}