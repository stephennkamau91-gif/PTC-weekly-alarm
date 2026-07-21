## Quick Installation Guide

### Method 1: Direct APK Installation (Easiest)

1. **Download APK from Release**
   - Go to GitHub Releases
   - Download `app-release.apk`

2. **Transfer to Phone**
   - Via USB cable, ADB, or cloud storage
   - Place in Downloads folder

3. **Install**
   - Open file manager
   - Navigate to Downloads
   - Tap the APK file
   - Tap "Install"
   - Grant permissions

### Method 2: Build Locally

1. **Install Android Studio**
   - Download from https://developer.android.com/studio

2. **Clone Repository**
   ```bash
   git clone https://github.com/stephennkamau91-gif/PTC-weekly-alarm.git
   cd PTC-weekly-alarm
   ```

3. **Build APK**
   ```bash
   ./gradlew assembleRelease
   ```

4. **Find APK**
   - Located at: `app/build/outputs/apk/release/app-release-unsigned.apk`

5. **Install via ADB**
   ```bash
   adb install app/build/outputs/apk/release/app-release-unsigned.apk
   ```

### Method 3: Using ADB (Command Line)

```bash
# Connect device via USB
adb devices

# Install APK
adb install path/to/app-release-unsigned.apk

# Verify installation
adb shell pm list packages | grep driveralarm
```

## Initial Setup

1. **Launch App**
   - Tap "PTC Weekly Alarm" icon

2. **Login**
   - Enter Driver ID: e.g., "DRV001"
   - Enter Your Name
   - Tap "Login"

3. **Upload Schedule**
   - Go to "Upload" tab
   - Select your Excel file (.xlsx)
   - Tap "Upload & Process"

4. **Manage Alarms**
   - Check "Alarms" tab
   - View all scheduled alarms
   - Alarms trigger 30 mins before shift

## Permissions

The app will request:
- ✅ Storage (read/write files)
- ✅ Notifications (show alarms)
- ✅ Alarms (schedule notifications)
- ✅ Vibration (vibrate on alarm)

**Allow all permissions** for full functionality.

## File Format

Your Excel schedule must have:
- **Column A**: Driver ID
- **Column B**: Driver Name  
- **Column C-I**: Days (MON-SUN)
  - Format: "06:00" or "Route 1 | 06:00"
  - Or: "RD" for rest day

## Troubleshooting

| Issue | Solution |
|-------|----------|
| APK won't install | Enable "Unknown Sources" in Settings → Security |
| Alarms not showing | Check notification settings |
| File upload fails | Ensure file is .xlsx format |
| App crashes on login | Clear app cache and retry |

## System Requirements

- **OS**: Android 9.0 or higher
- **RAM**: 2GB minimum
- **Storage**: 50MB free space
- **Permissions**: Storage, Notifications, Alarms

---

Need help? Check BUILDING.md or README.md for more details.
