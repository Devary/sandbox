pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('SCM') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn -B -ntp clean compile'
            }
        }

        stage('Test with JaCoCo') {
            steps {
                sh 'mvn -B -ntp test jacoco:report'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                sh 'mvn -B -ntp sonar:sonar'
            }
        }

        stage('Package') {
            when {
                anyOf {
                    branch 'main'
                    branch 'develop'
                }
            }
            steps {
                sh 'mvn -B -ntp package'
            }
        }
    }
}
