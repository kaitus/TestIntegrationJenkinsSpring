
pipeline {

    agent any

    stages {
        stage('Checkout') {
            steps { //Checking out the repo
                git 'https://github.com/kaitus/TestIntegrationJenkinsSpring.git'
            }
        }
	stage('compile') {
            steps { //Compile application
                //bat 'gradlew assemble'
				sh 'chmod +x gradlew'
                sh './gradlew assemble'
            }
        }
	stage('Test') {
            steps {
                //bat 'gradlew test'
                sh './gradlew test'
            }
        }
	stage('build') {
            steps { //build application
                //bat 'gradlew build'
                sh './gradlew build'
            }
        }
	stage('deploy') {
            steps { //run application
                //sh './gradlew assemble docker dockerRun'
                sh './gradlew compileJava'
                sh './gradlew SpringDemoJenkinsApplication.main'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/**/*.xml'
        }
    }
}