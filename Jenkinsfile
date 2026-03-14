pipeline {
    agent any

    environment {
        IMAGE_NAME = "kashyap12345/calculator-app"
    }

    stages {

        stage('Build Application') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Unit Testing') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker build -t ${IMAGE_NAME} ."
            }
        }

        stage('Push Docker Image') {
            steps {
                sh "docker push ${IMAGE_NAME}"
            }
        }

        stage('Deploy Using Ansible') {
            steps {
                sh 'ansible-playbook ansible/deploy.yml'
            }
        }
    }

    post {

        success {
            mail to: 'kashyapdhameliya77@gmail.com',
            subject: 'Calculator Build SUCCESS',
            body: 'The CI/CD pipeline completed successfully.'
        }

        failure {
            mail to: 'kashyapdhameliya77@gmail.com',
            subject: 'Calculator Build FAILED',
            body: 'The Jenkins pipeline failed, Try To Resolve Issue'
        }
    }
}
