**Projeto de Login Spring Security**
Este projeto implementa um sistema de login simples utilizando Spring Security. Ele permite aos usuários registrar-se e autenticar-se para acessar recursos protegidos.
Tecnologias utilizadas:
•	Spring Boot
•	Spring Security
•	JPA
•	Lombok

**Estrutura do projeto:**
•	src/main/java/me.lucas.login:
o	LoginApplication: Classe principal da aplicação Spring Boot.
o	WebConfig: Classe de configuração para CORS.
o	services: Pacote contendo serviços da aplicação.
	AuthorizationService: Carrega o usuário baseado no e-mail fornecido.
o	model.domain: Pacote contendo modelos de domínio.
	users: Pacote contendo classes relacionadas aos usuários.
	Usuarios: Entidade que representa um usuário do sistema.
	UserRole: Enum representando os roles de usuário (ADMIN e USER).
	LoginResponseDTO: DTO contendo o token de autenticação após o login.
	UsuariosRequestDTO: DTO contendo os dados do usuário para registro.
	UsuariosResponseDTO: DTO contendo os dados do usuário para consulta.
	repository: Pacote contendo repositórios.
	UsuariosRepository: Repositório para a entidade Usuarios.
o	infra.security: Pacote contendo classes relacionadas à segurança.
	SecurityConfiguration: Classe de configuração do Spring Security.
	SecurityFilter: Filtro de segurança que valida o token JWT.
	TokenService: Classe responsável por gerar e validar tokens JWT.
o	controller: Pacote contendo controladores da aplicação.
	UsuariosController: Controlador para usuários, incluindo login, registro e consulta.


**Configuração:
**1.	Clone o projeto.
2.	Adicione as dependências necessárias ao seu pom.xml.
3.	Configure as propriedades da aplicação em application.properties, incluindo o segredo JWT.
4.	Crie um banco de dados e execute as migrações JPA.
   
Executando a aplicação:
1.	Execute mvn spring-boot:run.
2.	Acesse a aplicação em http://localhost:8080.
   
Documentação da API:
•	POST /auth/register: Registra um novo usuário.
•	POST /auth/login: Autentica um usuário e retorna um token JWT.
•	GET /auth/user: Recupera os dados de um usuário (requer autenticação).

Contribuindo:
Você é bem-vindo para contribuir com este projeto enviando pull requests.

Licença:
Este projeto está licenciado sob a licença MIT.

