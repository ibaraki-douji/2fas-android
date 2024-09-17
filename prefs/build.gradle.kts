@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.twofasAndroidLibrary)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.kotlinParcelize)
}

android {
    namespace = "com.twofasapp.prefs"
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:storage"))

    implementation(libs.bundles.appCompat)
    implementation(libs.timber)
    implementation(libs.securityCrypto)
    implementation(files("../deps/securestoragelibrary-1.2.4.aar"))
    implementation(libs.kotlinCoroutines)
    implementation(libs.kotlinSerialization)
}