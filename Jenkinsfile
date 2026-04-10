pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Docker Build') {
            steps {
                // This builds your Docker image from the Dockerfile
                sh 'docker build -t student-timetable:latest .'
            }
        }
        stage('K8s Deploy') {
            steps {
                // This deploys it to Kubernetes
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}