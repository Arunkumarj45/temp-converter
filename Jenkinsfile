pipeline {
    agent any
    tools {
        maven 'Maven 3.x' 
    }
    stages {
        stage('Build') {
            steps {
                // Use 'bat' for Windows!
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}