# 75 HARD

Este projeto foi feito tendo como base o defaio 75 HARD feito por Andy Frisella.

## Como você interage nele?

Existem checkbox com as tasks na parte de baixo do site.

Lá você 

## Como executar?

### Pré-requisitos

- java 1.8
- kotlin
- docker

### Executando

1. Atualize o apt-get, executando `sudo apt-get update`
2. Instale o java 1.8, executando `sudo apt-get install openjdk-8-jdk`
3. Deixe certo que o java utilizado é o 1.8, executando `sudo update-alternatives --set java /usr/lib/jvm/jdk1.8.0_version/bin/java`
4. Rode o projeto, executando `sudo ./gradlew bootRun`
5. O projeto estará rodando na porta 8080. No gitpod, aparecerá uma janela onde você pode ver um preview na mesma aba. Clique lá e vejo a página web!