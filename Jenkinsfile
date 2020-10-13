
pipeline {

    agent any

    stages {
        stage('Initialize') {
            steps {
                sh 'chmod +x gradlew'
                sh '''echo PATH = ${PATH}'''
                sh './gradlew clean'
            }
        }
	stage('compile') {
            steps {
                sh './gradlew assemble'
            }
        }
	stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
	stage('build') {
            steps {
                sh './gradlew build'
            }
        }
	stage('deploy') {
            steps {
                archiveArtifacts 'build/libs/*.jar,target/*.hpi'
                //sh './gradlew bootRun'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/**/*.xml'
        }
    }
}