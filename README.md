# 📚 DRC Delhi – Android App

<p align="center">
  <img src="https://drcdelhi.in/wp-content/uploads/2026/01/cropped-DRC-Logo-1.png" alt="DRC Delhi Logo" width="160"/>
</p>

<p align="center">
  <b>Digital Resources & Training Centre – New Delhi</b>
</p>

<p align="center">
  <i>Learn • Upskill • Grow</i>
</p>

<p align="center">
  <a href="https://drcdelhi.in/">Official Website</a> •
  <a href="https://drc-delhi.alamrehaan0078.workers.dev/">Delete Account</a>
</p>

---

## 📖 About the Project

**DRC Delhi** is an Android application developed for the **Digital Resources & Training Centre (DRC), New Delhi**.

The application provides a convenient mobile interface for accessing the DRC Delhi learning and professional development platform.

DRC Delhi focuses on **Library and Information Science (LIS)** education, professional training, research support, workshops, webinars, certification programmes and skill development.

The Android application brings the DRC Delhi web platform to Android smartphones through a lightweight native application with an integrated WebView experience.

🌐 **Official Website:**  
https://drcdelhi.in/

🔐 **Account Deletion:**  
https://drc-delhi.alamrehaan0078.workers.dev/

---

# ✨ Features

## 📚 Online Courses

Explore online learning programmes covering different areas of Library and Information Science, including:

- Library Automation
- Library Cataloguing
- Digital Libraries
- Data Management
- Metadata
- Koha
- e-Granthalaya
- DSpace
- Research and Academic Skills

---

## 🎓 Certificate Programmes

Access professional certification programmes designed to help learners develop practical knowledge and strengthen their professional skills.

---

## 🧑‍🏫 Workshops & Webinars

Discover and participate in:

- Online workshops
- Webinars
- Seminars
- Professional training programmes
- Skill-development programmes
- Hands-on technical sessions

---

## 📝 Test Series & Quizzes

Access quizzes and test series designed to support learning, examination preparation and knowledge assessment.

---

## 📖 Study Resources

Access educational materials, notes, guides and other resources to support academic and professional development.

---

## 🎯 UGC-NET & Interview Preparation

Explore preparation programmes and resources related to:

- UGC-NET
- LIS competitive examinations
- Librarian examinations
- College librarian interviews
- School librarian interviews
- Professional career preparation

---

## 💻 Library Technology Training

The platform provides learning opportunities related to modern library technologies, including:

- Koha
- e-Granthalaya
- DSpace
- RFID
- Digital Libraries
- Library Automation
- Metadata
- Cataloguing
- Digital Archiving

---

## 🔬 Research & Academic Development

DRC Delhi also provides learning opportunities related to:

- Research Methodology
- Academic Writing
- Research Paper Writing
- Bibliometrics
- SPSS
- AMOS
- Mendeley
- Zotero
- Academic Visibility
- AI-powered research tools
- Scholarly Communication

---

## 🔔 Notifications & Updates

Stay informed about:

- New courses
- Upcoming workshops
- Webinars
- Events
- Test series
- Learning programmes
- Important announcements

---

## 📱 Mobile Experience

The application provides a mobile-friendly Android interface for accessing the DRC Delhi web platform.

The app includes:

- Native Android launch experience
- Android Splash Screen
- WebView-based website integration
- Website navigation
- Android back-button navigation
- Portrait and landscape support
- HTTPS communication
- Responsive mobile website experience

---

# 🏗️ Application Architecture

The DRC Delhi Android application uses a lightweight native Android architecture with the DRC Delhi website integrated through Android WebView.

```text
                    DRC DELHI
                 Android Application
                         │
                         ▼
              ┌─────────────────────┐
              │   Native Android    │
              │       Layer         │
              ├─────────────────────┤
              │ MainActivity        │
              │ Splash Screen       │
              │ Android Manifest    │
              │ View Binding        │
              │ Navigation Handling │
              └──────────┬──────────┘
                         │
                         ▼
                  ┌──────────────┐
                  │    WebView   │
                  └──────┬───────┘
                         │
                         ▼
               https://drcdelhi.in/
                         │
          ┌──────────────┼──────────────┐
          │              │              │
          ▼              ▼              ▼
       Courses       Workshops       Events
          │              │              │
          ├──────────────┼──────────────┤
          │              │              │
          ▼              ▼              ▼
      Resources      Test Series   Notifications
          │
          ▼
    DRC Delhi Services
```

---

# 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| **Kotlin** | Primary programming language |
| **Android SDK** | Android application development |
| **Android Studio** | Development environment |
| **WebView** | DRC Delhi website integration |
| **AndroidX** | Modern Android development libraries |
| **Jetpack** | Android components |
| **Material Design** | UI and application styling |
| **View Binding** | Type-safe view access |
| **Android SplashScreen API** | Application launch experience |
| **HTTPS** | Secure communication |

---

# 📦 Android Configuration

The current application configuration is:

```kotlin
namespace = "com.drcdelhi.app"

applicationId = "com.drcdelhi.app"

minSdk = 26

targetSdk = 37

versionCode = 1

versionName = "1.0"
```

### Application ID

```text
com.drcdelhi.app
```

### Minimum Android Version

```text
Android 8.0 (API 26)
```

### Target SDK

```text
Android API 37
```

### Current Version

```text
Version Name: 1.0
Version Code: 1
```

---

# 📂 Project Structure

```text
drc_delhi/
│
├── app/
│   │
│   └── src/
│       │
│       └── main/
│           │
│           ├── java/
│           │   └── com/
│           │       └── drcdelhi/
│           │           └── app/
│           │               └── MainActivity.kt
│           │
│           ├── res/
│           │   ├── drawable/
│           │   ├── mipmap/
│           │   ├── layout/
│           │   ├── values/
│           │   └── xml/
│           │
│           └── AndroidManifest.xml
│
├── gradle/
│
├── assets/
│   └── screenshots/
│       ├── home.png
│       ├── courses.png
│       ├── featured-courses.png
│       ├── navigation.png
│       └── testimonials.png
│
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── README.md
```

---

# 🚀 Getting Started

## 1. Clone the Repository

```bash
git clone https://github.com/rehaanalam0078-alm/drc_delhi.git
```

---

## 2. Open the Project

Open the cloned project in **Android Studio**.

---

## 3. Sync Gradle

Allow Android Studio to download and configure the required dependencies.

---

## 4. Connect an Android Device

Enable:

```text
Developer Options
USB Debugging
```

on your Android device.

Alternatively, use an Android Emulator.

---

## 5. Run the Application

Click:

```text
Run ▶
```

from Android Studio.

The application will launch and load the DRC Delhi platform.

---

# 🔐 Security & Privacy

The application communicates with the DRC Delhi website using **HTTPS**.

The application itself is primarily a WebView-based client and does not require sensitive payment information to be stored locally.

Payment processing on the DRC Delhi platform is handled through the website's payment infrastructure.

For information about privacy and personal-data handling, please refer to the official DRC Delhi privacy policy.

🌐 **Privacy Policy:**  
https://drcdelhi.in/privacy-policy/

---

# 🗑️ Account Deletion

Users can request deletion of their DRC Delhi account through the dedicated account deletion page.

🔗 **Delete Your DRC Delhi Account:**  
https://drc-delhi.alamrehaan0078.workers.dev/

The deletion page provides instructions for submitting an account deletion request.

---

# 🧪 Testing

The application has been tested on:

- Android Emulator
- Physical Android devices
- Different screen sizes
- Portrait orientation
- Landscape orientation
- Android 16

The application supports both portrait and landscape orientations.

---

# 📱 App Screenshots

<img src="home.png" width="220"/>
<img src="courses.png" width="220"/>
<img src="featured-courses.png" width="220"/>
<img src="navigation.png" width="220"/>
<img src="testimonials.png" width="220"/>

---

# 🌐 DRC Delhi Platform

The application connects users to the official DRC Delhi learning platform:

**https://drcdelhi.in/**

The platform provides learning and professional development opportunities in the field of **Library and Information Science**.

DRC Delhi offers courses, workshops, webinars, professional programmes, research support and training in areas related to modern librarianship and digital library technologies.

---

# 🎓 About DRC Delhi

**Digital Resources & Training Centre (DRC), New Delhi** is a private academic initiative dedicated to advancing the field of **Library and Information Science (LIS)**.

Its activities include:

- Professional training
- Online courses
- Workshops
- Webinars
- Research support
- Library technology training
- Certification programmes
- Academic development
- Digital librarianship

The organisation's stated mission is to empower and upskill library professionals through quality training, research guidance and technical expertise in emerging library technologies.

---

# 👨‍💻 Developer

### Md Rehaan Alam

**Android Developer**

Technologies and areas of interest:

- Kotlin
- Android Development
- Jetpack
- Jetpack Compose
- Firebase
- Web Technologies
- Mobile Application Development

---

# 📞 Contact

### Digital Resources & Training Centre

📍 **Location:** New Delhi, India

📧 **Email:** info@drcdelhi.in

📧 **Email:** drtcdelhi@gmail.com

📱 **Phone / WhatsApp:** +91 63926 22482

🌐 **Website:** https://drcdelhi.in/

---

# 📄 License

This project has been developed for the DRC Delhi platform.

The source code, branding, logos, website content and application assets may contain proprietary material belonging to their respective owners.

Unauthorized redistribution, commercial reuse or modification of proprietary DRC Delhi materials is not permitted without appropriate authorization.

---

# ⭐ Project Status

```text
Status: Active Development / Testing
Version: 1.0
Version Code: 1
Platform: Android
Package: com.drcdelhi.app
Target SDK: 37
Minimum SDK: 26
```

The application is currently being prepared and tested for distribution through **Google Play**.

---

<p align="center">

<b>📚 DRC Delhi</b>

<br>

<i>Learn • Upskill • Grow</i>

<br><br>

Digital Resources & Training Centre – New Delhi

</p>
