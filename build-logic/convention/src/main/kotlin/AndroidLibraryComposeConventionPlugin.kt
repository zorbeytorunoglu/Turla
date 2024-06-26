import com.android.build.gradle.LibraryExtension
import extensions.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryComposeConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.library")
            configureAndroidCompose(extensions.getByType<LibraryExtension>())
        }
    }

}