# Java Servlet CRUD
### Projeto desenvolvido em JAVA utilizando Servlets com padrão de projeto MVC
#### REQUISITOS:
   • [Tomcat v9.0](https://tomcat.apache.org/)
   
   • [JSTL](https://www.devmedia.com.br/introducao-jstl-java/23582)
  
   • [Gson](https://sites.google.com/site/aulasvictormenegusso/programacao-web-2-1-semestre-2017/trabalhando-com-json-com-a-biblioteca-gson)
   
   • [Eclipse EE](https://www.eclipse.org/downloads/packages/release/kepler/sr2/eclipse-ide-java-ee-developers)
   
#### Como rodar:
• Através da IDE Eclipse EE, importe o projeto como - Existing Projects into Workspace - <br> 
• Inicialize o Tomcat seguindo este [tutorial](https://www.devmedia.com.br/instalacao-e-configuracao-do-apache-tomcat-no-eclipse/27360#:~:text=Ap%C3%B3s%20acessar%20os%20servi%C3%A7os%20do,%E2%80%9CIniciar%E2%80%9D%20da%20figura%2011.&text=Ao%20conseguir%20inicializar%20o%20servi%C3%A7o,8080%20atrav%C3%A9s%20de%20qualquer%20navegador.) <br>
• Adicione o projeto na VIEW Servers <br>
• Inicie o servidor <br>
• Assim que o servidor estiver de pé, acesse [este link](http://localhost:8080/gerenciador/entrada?acao=LoginForm) ou [este](http://localhost:8080/gerenciador/)<br>
• Login: usuario <br>
• Senha: 12345

#### Desenvolvimento:
    O desenvolvimento desse projeto foi voltado para fins de estudos, sobre arquitetura de um projeto e noções básicas de Java WEB.
    A aplicação conta com diversos recursos como: um CRUD completo, autenticação e autorização com filtros, JSP.
    Um banco de dados foi simulado, para que fosse possivel apenas testar a funcionalidade da aplicação. Os comandos de CREATE, PUT,
    UPDATE e DELETE funcionam de maneira simples e intuitiva.
    
#### Para entender mais:
• [Servlets](https://pt.wikipedia.org/wiki/Servlet)<br>
• [JSP](https://pt.wikipedia.org/wiki/JavaServer_Pages)<br>
• [JSTL](https://pt.wikipedia.org/wiki/JavaServer_Pages_Standard_Tag_Library)<br>
• [EclipseEE vs Eclipse](https://stackoverflow.com/questions/4213712/what-is-the-difference-between-eclipse-for-java-ee-developers-and-eclipse-clas)<br>
• [Apache Tomcat](https://pt.wikipedia.org/wiki/Apache_Tomcat)<br>
• [Padrão MVC](https://pt.wikipedia.org/wiki/MVC)<br>
• [Protocolo HTTP](https://pt.wikipedia.org/wiki/Hypertext_Transfer_Protocol)<br>
• [Metodos HTTP](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods)<br>



## Imagem ilustrativa das rotas do projeto.
 • A requisição chega do navegador, passando pelos filtros.<br>
 • O Controller decide a partir dos parametros passados na requisição, qual ação será efetuada.<br>
 • A Ação modifica o Modelo, do banco por exemplo.<br>
 • A resposta volta para Ação que devolve para o Controller a responsabilidade de nos redirecionar para uma pagina HTML (nesse caso JSP)<br><br>
![img](https://github.com/vitucomment/Java-Servlets-CRUD/blob/master/img/rotaspng.png)
