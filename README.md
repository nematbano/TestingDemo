Overview
TestingDemo is an Android application built with Jetpack Compose, demonstrating a simple UI for a login screen. The project focuses on applying a testable architecture and includes basic unit tests using MockK and UI tests using Jetpack Compose's testing framework. This repository serves as an example of how to build and test Android applications using Compose and MockK.

Features
Jetpack Compose UI: Fully developed UI using Jetpack Compose, following modern Android design patterns.
Login Screen: A simple login screen with email and password fields, including validation.
Unit Testing with MockK: Basic unit tests for ViewModel using MockK.
Compose UI Testing: Automated UI tests for the login screen using Jetpack Compose's testing framework.

Tech Stack
Kotlin: Programming language used.
Jetpack Compose: Modern UI toolkit for building native Android UIs.
MVVM Architecture: Clean and testable architecture using Model-View-ViewModel.
MockK: Mocking framework for Kotlin, used for unit testing.
Jetpack Compose Testing: Framework for writing UI tests in Compose.
Hilt: Dependency injection framework.

Prerequisites
Android Studio
JDK 11 or later

Setup
Clone the repository:
bash
Copy code
git clone https://github.com/nematbano/TestingDemo.git
cd TestingDemo

Open the project in Android Studio:
Navigate to the project directory and open it in Android Studio.

Build and Run:
Build the project and run it on an emulator or physical device.

Project Structure
app/src/main: Contains the application’s source code.
ui/: Jetpack Compose UI components.
viewmodel/: ViewModels for managing UI-related data.
repository/: Data layer and business logic.
app/src/test: Contains unit tests using MockK.
app/src/androidTest: Contains UI tests using Jetpack Compose testing framework.

Testing
The project includes basic unit and UI tests for Login screen and a simple business logic.
