pipeline {
    agent any

    tools {
        // Reference to the Maven tool configured in Jenkins
        jdk 'JDK'
        maven 'jenkins_maven'
    }

    stages {
        stage('Clone') {
            steps {
                // Cloning the specified Git repository from GitHub
                git branch: 'main', url: 'https://github.com/SaurabhMaurya9695/Jenkins-basic.git'
            }
        }
        stage('Build') {
            steps {
                // Running Maven clean and package commands
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Running Maven tests
                sh 'mvn test'
            }
        }
        stage('Docker Login') {
            steps {
                script {
                    withDockerRegistry(toolName: 'docker', url: 'https://index.docker.io/v1/') {
                        sh 'docker --version'
                        sh 'docker login -u saurabh9695 -p Saurabh@1234'
                    }
                }
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    sh 'docker build -t pipeline:latest .'
                    sh 'docker images .'
                }
            }
        }
        stage('Pushing to docker hub') {
            steps {
                script {
                    sh 'docker push saurabh9695/kubernateslearning .'
                    sh 'echo successfully pushed to docker hub'
                }
            }
             post {
                    // If Maven was able to run the tests, even if some tests failed,
                    // record the test results and archive the jar file.
                    success {
                        junit '**/target/surefire-reports/TEST-*.xml'
                        archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
                    }
             }
        }
    }
}
