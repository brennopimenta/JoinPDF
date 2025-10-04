# JoinPDF
# 🧩 JoinPDF

Um projeto **Spring Boot 3 (Java 17)** para unir vários arquivos PDF em um único arquivo PDF, utilizando a biblioteca **Apache PDFBox**.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Apache PDFBox**
- **Maven**
- **IntelliJ IDEA**
- **Postman / cURL**

---

## 📦 Clonar o Projeto

Clone o repositório diretamente do GitHub:
```bash
git clone https://github.com/brennopimenta/JoinPDF.git
cd JoinPDF
```

🧰 Executar a API
Abra o Terminal/Prompt de Comando na pasta do projeto onde encontra-se o arquivo .JAR e execute o comando abaixo:
Obs: O arquivo encontra-se dentro da pasta "target" do projeto.

java -jar JoinPDF-0.0.1-SNAPSHOT.jar

Após executar  aplicação,, utilize importe o código curl disponivel na pasta resource/postman/curl 
usando o Postman e execute inserindo os arquivos .pdf que vc pretente juntar.
![Exemplo da Request](https://github.com/brennopimenta/JoinPDF/blob/main/src/main/resources/static/Captura%20de%20tela%202025-10-04%20153845.png)


Após a request,, salve a resposta no seu computador:
![Exemplo do Response](https://github.com/brennopimenta/JoinPDF/blob/main/src/main/resources/static/Captura%de%tela%2025-10-04%154151_Response.png)
....

Para quem quiser explorar o projeto...
=====================================================
🧰 Importar e Executar o Projeto no IntelliJ IDEA

1 - Abra o IntelliJ IDEA.

2 - Clique em File → Open....

3 - Selecione a pasta do projeto JoinPDF que você acabou de clonar.

4 - Aguarde o IntelliJ baixar as dependências do Maven.

5 - Certifique-se de que o projeto está configurado para usar Java 17:

-> Vá em File → Project Structure → Project SDK → Java 17.

6 - Localize a classe principal:

src/main/java/com/example/joinpdf/JoinPdfApplication.java

7 - Clique com o botão direito sobre ela e selecione Run 'JoinPdfApplication'.

O servidor iniciará em:
http://localhost:8080

=======================================================
🧩 Endpoint Disponível
POST /pdf/merge

Unifica vários arquivos PDF em um único arquivo PDF.

Requisição (multipart/form-data):
    Parâmetro: files — pode conter 2 ou mais arquivos .pdf.

Resposta:
    Retorna o arquivo PDF unificado.

💻 Testando com Postman / cURL

O projeto já inclui um exemplo de requisição cURL dentro de:
    src/main/resources/postman/merge-pdf.curl


✅ Executar via terminal
No terminal (Linux, macOS ou Git Bash no Windows), execute:

curl --location 'http://localhost:8080/pdf/merge' \
--header 'Accept: application/pdf' \
--form 'files=@"/caminho/para/arquivo1.pdf"' \
--form 'files=@"/caminho/para/arquivo2.pdf"' \
--output "saida.pdf"


Isso enviará os PDFs para o endpoint e salvará o resultado no arquivo saida.pdf.


📂 Estrutura do Projeto
JoinPDF/
├── src/
│   ├── main/
│   │   ├── java/com/example/joinpdf/
│   │   │   ├── JoinPdfApplication.java
│   │   │   └── controller/
│   │   │       └── PdfMergeController.java
│   │   ├── resources/
│   │       ├── application.yml
│   │       └── postman/
│   │           └── merge-pdf.curl
├── pom.xml
└── README.md



🧑‍💻 Autor
Brenno Pimenta da Costa

github.com/brennopimenta






