pipeline {
  agent {label 'main'}
  stages {
    stage ('creating launch config') {
      steps {
        sh "aws autoscaling create-auto-scaling-group  --auto-scaling-group-name my-asg --min-size 1 --max-size 5 --desired-capacity 1 --   --vpc-zone-identifier "subnet-6194ea3b""
