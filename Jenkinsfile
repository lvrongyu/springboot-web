pipeline {
  agent any
  stages {
    stage('step1') {
      steps {
        build(propagate: true, quietPeriod: -1, job: 'test')
      }
    }

  }
}