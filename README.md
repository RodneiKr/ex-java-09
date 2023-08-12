# Java 9: as novidades mais importantes para DEV de projeto/sistema
## _Módulo (module)_
##### O que é módulo?
##### É um nível acima de pacotes (package), foi criado para ter um maior encapsulamento entre outros motivos.
##### Esse é o arquivo que contém as informações: _module-info.java_
## _JShell_
##### Pra executar um trecho pequeno de código java
##### $ JShell
## _Compilador: javac --source --target (agora temos o --release)_
##### Foi adicionado a opção --release (ao invés de usar: --source --target)
##### Vai ajudar no pom.xml (maven)
## _Interfaces para Reactive Streams_
##### Flow.Processor<T, R>
##### Flow.Publisher<T>
##### Flow.Subscriber<T>
##### Flow.Subscription
##### A implementação dessas interfaces serão realizadas por terceiros (igual ao JDBC, JPA, ...)
##### https://www.reactive-streams.org
## _Outros_
##### Plugin para navegador, descontinuado.
##### API de Applet obsoleta.
##### Método finalize() da classe Object obsoleto.
##### Nome de variável com apenas "_" não é mais permitido.
##### JavaDoc suporta HTML 5.
##### As Strings ocupam menos espaços.
##### Suporte a UNICODE 8.0 em Strings e afins (com emotions).
##### Os arquivos .properties estão em UTF-8
### [Fonte de consulta](https://www.youtube.com/watch?v=SnoMvpJS9TI&list=PLuYctAHjg89Y4RZ3UIgAOWow4yc_rgpKy&pp=iAQB)
