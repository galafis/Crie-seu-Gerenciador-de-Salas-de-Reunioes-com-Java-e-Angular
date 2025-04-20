# Gerenciador de Salas de Reuniões

API REST em **Spring Boot** e SPA em **Angular** para cadastro e gerenciamento de salas de reunião, com persistência em banco H2 em memória.

Baseado nos repositórios de referência do DIO:
- https://github.com/Kamilahsantos/Client-Angular-Live-Coding-Dio  
- https://github.com/kamilahsantos/Crud-Spring-liveCoding-Dio  

---

## 📂 Estrutura do Projeto

```
gerenciador-salas/
├── backend/                      # API Spring Boot
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/gerenciadorsalas/
│   │   │   │   ├── controller/
│   │   │   │   │   └── MeetingRoomController.java
│   │   │   │   ├── model/
│   │   │   │   │   └── MeetingRoom.java
│   │   │   │   ├── repository/
│   │   │   │   │   └── MeetingRoomRepository.java
│   │   │   │   ├── service/
│   │   │   │   │   └── MeetingRoomService.java
│   │   │   │   └── MeetingRoomManagerApplication.java
│   │   └── resources/
│   │       └── application.properties
├── frontend/                     # SPA Angular
│   ├── package.json
│   ├── angular.json
│   ├── tsconfig.json
│   ├── src/
│   │   ├── index.html
│   │   ├── main.ts
│   │   ├── polyfills.ts
│   │   ├── styles.css
│   │   ├── environments/
│   │   │   ├── environment.ts
│   │   │   └── environment.prod.ts
│   │   └── app/
│   │       ├── app.module.ts
│   │       ├── app.component.ts
│   │       ├── room.service.ts
│   │       └── room-list/
│   │           ├── room-list.component.ts
│   │           ├── room-list.component.html
│   │           └── room-list.component.css
└── README.md                     # Você está lendo
```

---

## 🚀 Tecnologias

- **Backend**  
  - Java 11+  
  - Spring Boot 2.x  
  - Spring Data JPA  
  - H2 Database (in-memory)  
  - Lombok  

- **Frontend**  
  - Angular 10  
  - TypeScript  
  - RxJS  
  - Angular Forms & HttpClient  

---

## 🔧 Configuração & Execução

### 1. Backend

1. Navegue até a pasta do backend:
   ```bash
   cd backend
   ```
2. Compile e execute:
   ```bash
   mvn clean spring-boot:run
   ```
3. A API estará disponível em:
   ```
   http://localhost:8080/api/rooms
   ```

### 2. Frontend

1. Navegue até a pasta do frontend:
   ```bash
   cd frontend
   ```
2. Instale as dependências:
   ```bash
   npm install
   ```
3. Inicie em modo de desenvolvimento:
   ```bash
   ng serve
   ```
4. Acesse no navegador:
   ```
   http://localhost:4200
   ```

---

## 📦 Endpoints REST (Backend)

| Método | Rota               | Descrição                          |
| ------ | ------------------ | ---------------------------------- |
| GET    | `/api/rooms`       | Lista todas as salas               |
| GET    | `/api/rooms/{id}`  | Retorna sala por ID                |
| POST   | `/api/rooms`       | Cria nova sala (envie JSON no body)|
| DELETE | `/api/rooms/{id}`  | Remove sala por ID                 |

**Exemplo de payload para criação**:
```json
{
  "name": "Sala de Reuniões A",
  "location": "Andar 3",
  "capacity": 10
}
```

---

## 📝 Observações

- O **banco H2** é volátil: ao reiniciar o backend, todos os dados são perdidos.  
- Para usar outro banco (PostgreSQL, MySQL), ajuste o `application.properties`.  
- O frontend consome diretamente o endpoint `/api/rooms`; para outra porta ou domínio, altere `apiUrl` em `environment.ts`.  

---

Desenvolvido como projeto de estudo e portfólio. Qualquer dúvida ou sugestão, fique à vontade para abrir uma issue ou entrar em contato!
