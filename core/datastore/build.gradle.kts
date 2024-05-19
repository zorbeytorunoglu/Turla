plugins {
    alias(libs.plugins.turla.android.library)
    alias(libs.plugins.turla.android.hilt)
}

android {
    namespace = "com.zorbeytorunoglu.turla.core.datastore"
}

dependencies {

    api(libs.androidx.dataStore.core)

    api(project(":core:model"))
    api(project(":core:common"))

}