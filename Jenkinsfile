pipeline {
    agent any

    tools {
        maven 'Maven 3.x' // Ensure this matches your Jenkins Global Tool Configuration name
    }

    stages {
        stage('Checkout') {
            steps {
                // This fetches the code from your repository
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                // Executes the Maven lifecycle: compile and run JUnit tests
                sh 'mvn clean test'
            }
        }

        stage('Result') {
            steps {
                echo 'Build and Testing Completed Successfully!'
            }
        }
    }
}