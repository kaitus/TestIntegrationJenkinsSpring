pipeline {

    agent any

    stages {
        stage('Checkout') {
            steps { //Checking out the repo
                git 'https://github.com/kaitus/TestIntegrationJenkinsSpring.git'
            }
        }
	stage('deploy') {
            steps { //run application
				sh 'chmod +x gradlew'
                sh './gradlew compileJava'
            }
        }
    }
}
