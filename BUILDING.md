# PTC Weekly Alarm - Build Instructions

## Prerequisites

Before building the APK, ensure you have:

1. **Java Development Kit (JDK) 11 or higher**
   - Download from: https://adoptopenjdk.net/

2. **Android SDK**
   - Download Android Studio from: https://developer.android.com/studio
   - Or install command-line tools

3. **Set Environment Variables**
   ```bash
   export ANDROID_HOME=/path/to/android/sdk
   export JAVA_HOME=/path/to/jdk
   ```

## Building the APK

### Option 1: Using the Build Script (Linux/Mac)
```bash
chmod +x build.sh
./build.sh
```

### Option 2: Using Gradle Directly
```bash
./gradlew assembleRelease
```

### Option 3: Using Android Studio
1. Open the project in Android Studio
2. Go to Build → Build Bundle(s) / APK(s) → Build APK(s)
3. APK will be generated in `app/build/outputs/apk/release/`

## Output

The APK will be located at:
```
app/build/outputs/apk/release/app-release-unsigned.apk
```

## Installing on Device

### Using ADB:
```bash
adb install app/build/outputs/apk/release/app-release-unsigned.apk
```

### Manual Installation:
1. Copy the APK to your Android device
2. Open file manager and tap the APK file
3. Tap "Install"
4. Grant permissions as prompted

## Features

✅ Driver ID login with persistent storage
✅ Excel (.xlsx) schedule file upload and parsing
✅ Automatic alarm scheduling (30 mins before shift)
✅ Weekly alarm management
✅ Rest day (RD) detection
✅ Beautiful green/black/white themed UI
✅ Bus animation on login screen with clock
✅ Notification system with alarm sounds
✅ Local database with Room

## Troubleshooting

### Build fails with "SDK not found"
- Install Android SDK via Android Studio
- Set ANDROID_HOME environment variable

### Gradle wrapper issues
```bash
gradle wrapper --gradle-version 7.4.2
```

### Permission errors
```bash
chmod +x gradlew
```

## Support

For issues with the build process, check:
- Android SDK installation
- Java version compatibility
- Gradle cache: `./gradlew clean`

---

**App Name:** PTC Weekly Alarm  
**Package:** com.ptc.driveralarm  
**Min SDK:** 28 (Android 9.0)  
**Target SDK:** 33 (Android 13)  
**Version:** 1.0
