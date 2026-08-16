pipeline {

    agent any

    parameters {
        choice(
            name: 'EXECUTION_TYPE',
            choices: ['XML', 'CLASS'],
            description: 'Select execution type'
        )

        string(
            name: 'TEST_CLASS',
            defaultValue: 'com.tests.LoginTest',
            description: 'Test class'
        )

        string(
            name: 'TEST_XML',
            defaultValue: 'testng.xml',
            description: 'TestNG XML file'
        )
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }
    stage('Verify Environment') {
            steps {
                bat '''
                    echo JAVA_HOME=%JAVA_HOME%
                    java -version
                    mvn -version
                '''
            }
        }

        stage('Execute Tests') {
            steps {
                script {

                    if (params.EXECUTION_TYPE == 'XML') {

                        bat "mvn clean test -DsuiteXmlFile=${params.TEST_XML}"

                    } else {

                        bat "mvn clean test -Dtest=${params.TEST_CLASS}"
                    }
                }
            }
        }

        stage('Reports') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}
