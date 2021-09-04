FROM gitpod/workspace-base:latest

USER gitpod
RUN brew install kotlin
RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && sdk install java 12.0.1.j9-adpt"