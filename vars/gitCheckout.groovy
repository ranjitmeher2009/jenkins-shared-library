def call(Map stageParams){
    checkout([
        $class: 'GitSCM', 
        branches: [[name: stageParams.branch]], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [], submoduleCfg: [], 
        userRemoteConfigs: [[credentialsId: stageParams.gitCredential, url: stageParams.url]]
    ])
}
    