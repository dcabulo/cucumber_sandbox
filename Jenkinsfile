pipeline {
    agent {
        docker {
            image "maven:3.6-jdk-8-slim"
        }
    }
    stages {
        stage('build') {
                steps {
                    echo 'Build stage initiate'
                    sh 'mvn -B -DskipTests clean package'
                }
            }
        stage('test') {
                steps {
                    echo 'Test stage'
                    sh 'mvn test'
                }
                post {
                    always {
                        testNG(reportFilenamePattern: '**/Runners.TestRunner_results.xml')
                    }
                }
            }
    }
}