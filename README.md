# Android Quick Starter

- Android Studio : Chipmunk | 2021.2.1 Patch 2
    - plungin : 7.2.2
    - gradle : 7.3.3

- Clean Architecture
    - app (presentation)
    - data
    - domain

- MVVM

- Kotlin DSL (Failed to apply)
    ~~~kotlin
    /*
    Changes to Plugins and Build scripts
    Classes from buildSrc are no longer visible to settings scripts
    Previously, the buildSrc project was built before applying the project’s settings script and its classes were visible within the script. Now, buildSrc is built after the settings script and its classes are not visible to it. The buildSrc classes remain visible to project build scripts and script plugins.
    */
    
    org.gradle.internal.exceptions.LocationAwareException: Build file '/Users/nami/kibeom/project/android-quick-setup/app/build.gradle.kts' line: 48
    Script compilation error:
    Line 48:     implementation(Retrofit.base)
                              ^ Unresolved reference: Retrofit
    ~~~

