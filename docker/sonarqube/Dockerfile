ARG SONARQUBE_VERSION
FROM sonarqube:${SONARQUBE_VERSION}

ARG PLUGIN_VERSION
USER root
RUN apt-get update \
    && apt-get install -y curl \
    && curl -L -o /opt/sonarqube/extensions/plugins/sonarqube-community-branch-plugin-${PLUGIN_VERSION}.jar \
       https://github.com/mc1arke/sonarqube-community-branch-plugin/releases/download/${PLUGIN_VERSION}/sonarqube-community-branch-plugin-${PLUGIN_VERSION}.jar \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

USER sonarqube

ENV SONAR_WEB_JAVAADDITIONALOPTS="-javaagent:./extensions/plugins/sonarqube-community-branch-plugin-${PLUGIN_VERSION}.jar=web"
ENV SONAR_CE_JAVAADDITIONALOPTS="-javaagent:./extensions/plugins/sonarqube-community-branch-plugin-${PLUGIN_VERSION}.jar=ce"
