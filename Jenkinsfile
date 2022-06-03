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
                bat 'mvn clean package -Dmaven.test.skip=true'
            }
        }
         stage("Deploy"){
            steps{
                echo 'Deploy'
                bat cf push
            }
        }
    }
    post{
        success{
             echo "BUILD SUCCESS"
            bat """
                 curl -u 2021sp93073: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 -X POST "https://api.github.com/repos/2021sp93073/Scholar-Management-Application/statuses/%GIT_COMMIT%" -H "Accept: application/vnd.github.v3+json" -d "{\"state\":\"success\",\"context\":\"Continuous-Integration\",\"description\":\"Jenkins\",\"target_url\":\"https://c2ea-165-1-238-172.ngrok.io/job/%JOB_NAME%/%BUILD_NUMBER%/console\"}"
            """
        }
        failure{
             echo "BUILD FAILURE"
            bat """
                 curl -u 2021sp93073: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 -X POST "https://api.github.com/repos/2021sp93073/Scholar-Management-Application/statuses/%GIT_COMMIT%" -H "Accept: application/vnd.github.v3+json" -d "{\"state\":\"failure\",\"context\":\"Continuous-Integration\",\"description\":\"Jenkins\",\"target_url\":\"https://c2ea-165-1-238-172.ngrok.io/job/%JOB_NAME%/%BUILD_NUMBER%/console\"}"
            """
        }  
    }
}
