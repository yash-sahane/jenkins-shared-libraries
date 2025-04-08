@Library("shared-library") _

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script{
                    hello.hello()
                }
            }
        }
        stage('clone'){
            steps{
                script {
                    clone('https://github.com/yash-sahane/portfolio.github.io.git', 'main')
                }
            }
        }
    }
}
