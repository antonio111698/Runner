plugins {
    alias(libs.plugins.runner.android.library)
    alias(libs.plugins.runner.jvm.ktor)
}

android {
    namespace = "com.tonio.auth.data"
}

dependencies {
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(libs.bundles.koin)
}