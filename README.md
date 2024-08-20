Overview: <br />
TestingDemo is an Android application built with Jetpack Compose, demonstrating a simple UI for a login screen. The project focuses on applying a testable architecture and includes basic unit tests using MockK and UI tests using Jetpack Compose's testing framework. This repository serves as an example of how to build and test Android applications using Compose and MockK.

Features: <br />
Jetpack Compose UI: Basic UI using Jetpack Compose, following modern Android design pattern.<br />
Login Screen: A simple login screen with email and password fields, including validation.<br />
Unit Testing with MockK: Basic unit tests for ViewModel using MockK.<br />
Compose UI Testing: Automated UI tests for the login screen using Jetpack Compose's testing framework.<br />

Tech Stack: <br />
Kotlin: Programming language used.<br />
Jetpack Compose: Modern UI toolkit for building native Android UIs.<br />
MVVM Architecture: Clean and testable architecture using Model-View-ViewModel.<br />
MockK: Mocking framework for Kotlin, used for unit testing.<br />
Jetpack Compose Testing: Framework for writing UI tests in Compose.<br />
Hilt: Dependency injection framework.<br />

Prerequisites: <br />
Android Studio<br />
JDK 11 or later

Setup: <br />
Clone the repository:<br />
bash<br />
Copy code<br />
git clone https://github.com/nematbano/TestingDemo.git<br />
cd TestingDemo<br />

Open the project in Android Studio: <br />
Navigate to the project directory and open it in Android Studio.

Build and Run: <br />
Build the project and run it on an emulator or physical device.

Project Structure:<br />
app/src/main: Contains the application’s source code.<br />
ui/: Jetpack Compose UI components.<br />
viewmodel/: ViewModels for managing UI-related data.<br />
repository/: Data layer and business logic.<br />
app/src/test: Contains unit tests using MockK.<br />
app/src/androidTest: Contains UI tests using Jetpack Compose testing framework.<br />

Testing: <br />
The project includes basic unit and UI tests for Login screen and a simple business logic.
