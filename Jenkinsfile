pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }
    stages {
        stage('Preparation') {
            steps {
                
                git 'https://github.com/maneanuja1525/TestNG_Phase2Project.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
   
}