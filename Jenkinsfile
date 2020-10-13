pipeline {

    agent any

    stages {
        stage('Checkout') {
            steps { //Checking out the repo
                git 'https://github.com/kaitus/TestIntegrationJenkinsSpring.git'
            }
        }
	stage('build') {
            steps { //build application
                //bat 'gradlew build'
				sh 'chmod +x gradlew'
                sh './gradlew build'
            }
        }
	stage('deploy') {
            steps { //run application
                sh './gradlew compileJava'
            }
        }
    }
}
