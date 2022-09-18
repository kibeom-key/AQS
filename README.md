# Android Quick Starter

- Android Studio : Chipmunk | 2021.2.1 Patch 2
    - plungin : 7.2.2
    - gradle : 7.3.3
    - settings.gradle
        - When a new project is created in Android Studio Bumblebee, the top-level build.gradle file contains the plugins block
        - The repository settings that were previously in the top-level build.gradle file are now in the settings.gradle file


- Recommended app architecture
    - Clean Architecture
        - app (presentation)
        - data
        - domain

    - MVVM
    - DI

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

- How to set with purity 
    1. Code - Download ZIP 
    2. Open project in AndroidStudio
    3. Rename
        - settings.gradle : rootProject.name
        - package
            - compact middle packages : unchecked
        - build.gradle(app) : applicationId
        - string.xml : app_name
        - theme.xml : style name
    4. Clean projct

