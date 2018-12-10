import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.setValue
import org.gradle.kotlin.dsl.repositories


buildscript {

    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath(Config.BuildPlugins.androidGradle)
        classpath(Config.BuildPlugins.kotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        jcenter()
        google()
    }
}
