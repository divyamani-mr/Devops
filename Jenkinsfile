pipeline{
    agent any
    stages{
        stage("Test"){
            steps{
                echo 'Test'
                bat 'mvn test'
            }
        }
        stage("Build"){
            steps{
                echo 'Build'
                bat 'mvn clean package'
            }
        }
    }
    post{
        success{
             echo "BUILD SUCCESS"
            bat """
                curl -i -H "Authorization: token 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" -X POST -H "Accept: application/vnd.github.v3+json" -d '{\"state\":\"success\",\"context\":\"Continuous-Integration\",\"description\":\"Jenkins\",\"target_url\":\"http://20.255.56.92:8080/job/$JOB_NAME/$BUILD_NUMBER/console\"}' https://api.github.com/repos/2021sp93073/Scholar-Management-Application/statuses/$GIT_COMMIT
            """
        }
        failure{
             echo "BUILD FAILURE"
            bat """
                curl -i -H "Authorization: token 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" -X POST -H "Accept: application/vnd.github.v3+json" -d '{\"state\":\"success\",\"context\":\"Continuous-Integration\",\"description\":\"Jenkins\",\"target_url\":\"http://20.255.56.92:8080/job/$JOB_NAME/$BUILD_NUMBER/console\"}' https://api.github.com/repos/2021sp93073/Scholar-Management-Application/statuses/$GIT_COMMIT
            """
        }  
    }
}
