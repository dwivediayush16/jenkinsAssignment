pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'  // Specify the name of your Maven installation in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-username/your-repo.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    def mvnHome = tool name: 'Maven 3.6.3', type: 'Maven'
                    sh "${mvnHome}/bin/mvn clean package"
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    def mvnHome = tool name: 'Maven 3.6.3', type: 'Maven'
                    sh "${mvnHome}/bin/mvn test"
                }
            }
        }
        stage('Analyze') {
            steps {
                script {
                    def mvnHome = tool name: 'Maven 3.6.3', type: 'Maven'
                    sh "${mvnHome}/bin/mvn org.owasp:dependency-check-maven:check"
                }
            }
        }
    }
    post {
        // always {
        //     junit '**/target/surefire-reports/*.xml'
        // }
        success {
            echo 'Build and tests were successful!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
