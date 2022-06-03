pipeline{
    agent any
    stages{
        stage("Maven Test"){
            steps{
                sh 'mvn test'
            }
        }
        stage("Maven Build"){
            steps{
                sh 'mvn package'
            }
        }
        stage("Maven Deploy"){
            steps{
                echo "Deploy jar to server"
            }
        }
    }
}
