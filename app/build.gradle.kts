import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.setValue


plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(Config.Android.compileSdkVersion)
    buildToolsVersion(Config.Android.buildToolsVersion)

    defaultConfig {
        applicationId = Config.Android.applicationId
        minSdkVersion(Config.Android.minSdkVersion)
        targetSdkVersion(Config.Android.targetSdkVersion)
        versionCode = Config.Android.versionCode
        versionName = Config.Android.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-rules.pro")
        }
    }
}

dependencies {
    compile(Config.Libs.kotlin_std)
    compile(Config.Libs.appcompat)
    compile(Config.Libs.recyclerview)
    compile(Config.Libs.cardview)
    compile(Config.Libs.palette)
    compile(Config.Libs.design)
    compile(Config.Libs.eventbus)
    compile(Config.Libs.picasso)
    compile(Config.Libs.okhttp)
    compile(Config.Libs.okhttp_interceptor)
    compile(Config.Libs.retrofit)
    compile(Config.Libs.retrofit_gson)
    compile(Config.Libs.jobqueue)
    compile(Config.Libs.anko_sdk15)
    compile(Config.Libs.anko_support)
    compile(Config.Libs.anko_appcompat)
    compile(Config.Libs.anko_design)
    compile(Config.Libs.anko_cardview)
    compile(Config.Libs.anko_recyclerview)
    kapt(Config.Libs.dagger_compiler)
    compile(Config.Libs.dagger)

    testCompile(Config.TestLibs.junit)
    testCompile(Config.TestLibs.mockito)

    androidTestCompile(Config.TestLibs.mockito)
    androidTestCompile(Config.TestLibs.dexmaker)
    androidTestCompile(Config.TestLibs.dexmaker_mockito)
    androidTestCompile(Config.TestLibs.annotations)
    androidTestCompile(Config.TestLibs.espresso)
}