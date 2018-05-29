pipeline {
    agent any

    environment {
        NameSpace='Mike'
        WebServer='172.31.12.139'
        port='8010'
    }

    stages {

        stage('Checkout') {
            steps {
                step([$class: 'WsCleanup'])
            git url: 'https://github.com/pathfinder2016/spring-boot-basic.git', branch: 'master'
            }

        }

        stage('Sonar') {
            steps {
                sh 'echo "sonar"'
            }
        }

        stage('test') {
            steps {
                sh 'echo "test"'
            }
        }

         stage('build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh './deploy.sh'
                }
            }
        }
    }
}