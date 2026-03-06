pipeline {
    agent any

    environment {
        IMAGE_NAME = "kashyap12345/calculator-app"
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/KASHYAP12343/calculator-devops.git'
            }
        }

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
                sh 'docker build -t $calculator-app .'
            }
        }

        stage('Push Docker Image') {
            steps {
                sh 'docker push $calculator-app'
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
            mail to: 'kashyap.dhameliya@iiitb.ac.in',
            subject: 'Calculator Build SUCCESS',
            body: 'The CI/CD pipeline completed successfully.'
        }

        failure {
            mail to: 'kashyap.dhameliya@iiitb.ac.in',
            subject: 'Calculator Build FAILED',
            body: 'The Jenkins pipeline failed.'
        }

    }
}
