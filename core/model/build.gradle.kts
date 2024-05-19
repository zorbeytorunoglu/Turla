plugins {
    alias(libs.plugins.turla.jvm.library)
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    api(libs.kotlinx.datetime)
    api(libs.kotlinx.serialization.json)
    api(libs.kotlinx.collections.immutable)
}