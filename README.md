<h1 align="center">
  :trophy: Chess System Java
</h1>

<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/jonathnawill/chess-system-java">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/jonathnawill/chess-system-java">

  <a href="https://github.com/jonathnawill/chess-system-java">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/jonathnawill/chess-system-java">
  </a>

  <a href="https://github.com/jonathnawill/chess-system-java/issues">
    <img alt="Repository issues" src="https://img.shields.io/github/issues/jonathnawill/chess-system-java">
  </a>

  <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">
</p>

<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-Modelo conceitual">Modelo Conceitual</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#%EF%B8%8F-instalacao">Instalação</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#%EF%B8%8F-imagens">Imagens</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-licença">Licença</a>
</p>

## 🚀 Tecnologias 

Esse projeto foi desenvolvido com as seguintes tecnologias:

- Java

## 💻 Projeto
  Este projeto foi desenvolvido com base no curso  *__Java COMPLETO 2023 Programação Orientada a Objetos + Projetos__* da [Udemy](https://www.udemy.com/course/java-curso-completo/). Esta aplicação consiste em um jogo simples de Xadrez, que pode ser executado através do terminal. O jogo possui tratamento de erros, programação defensiva (contra bugs), jogadas especiais do xadrez (promoção, roque e en passant) e previsão de movimento das peças.
  
Peças: Pawn (Peão), Rook (Torre), Knight (Cavalo), Bishop (Bispo), Queen (Rainha) e King (Rei).
|-|

 A mecânica do jogo é baseada em **linhas** (_1, 2, 3, 4, 5, 6, 7, 8_) e **colunas** (_a, b, c, d, e, f, g, h_)
- Para **escolher** uma peça é necessário selecionar _primeiramente_ a **coluna** e logo em seguida (sem espaços) selecionar a **linha**, exemplo: **c2**
- Em **Captured pieces** o jogo armazena as peças capturadas.
- O **Turn** exibe o turno (rodada) em que o jogo está.
- **Waiting player** exibe qual é o jogador a jogar a próxima peça.
- **Source** é a origem, ou seja, a peça no qual o jogador irá jogar.
- **Target** é o destino, ou seja, o local no qual o jogador irá mover a peça.
- O jogo possui sistema de **Check** e **CheckMate**

 <a name="-Modelo conceitual"></a>
## Modelo conceitual
![Modelo Conceitual](https://github.com/acenelio/chess-system-design/blob/master/chess-system-design.png)
  
## ♟️ Instalacao

1. Faça o dowload e extração do projeto. 
2. Abra um terminal ([Git Bash](https://git-scm.com/book/pt-pt/v2/Appendix-A%3A-Git-em-Outros-Ambientes-Git-in-Bash) é o recomendado, pois é colorido)
3. Entre no diretório /bin do projeto (comando: cd bin)
4. Após entrar no diretório, digite Java application/Program para rodar a aplicação (O java precisa estar na versão 11 ou superior).
5. Bom Jogo!

## 🖼️ Imagens

| Tela Inicial  | Tratamento de Erro | Check | 
|---|---|---|
| ![Tela inicial](https://user-images.githubusercontent.com/104990020/216859792-90c69b48-fb5d-4704-8612-90a661b8c841.PNG) | ![tratamento de exceção](https://user-images.githubusercontent.com/104990020/216859817-f789286e-216b-4c97-a2c1-29ff5b606ce0.PNG) | ![Check](https://user-images.githubusercontent.com/104990020/216859825-61dcea23-ba99-43c7-a88c-52e3f29492ee.PNG) | 

| Jogando... | 
|---|
| ![Jogando](https://user-images.githubusercontent.com/104990020/216859857-2917319a-10b6-4f75-acab-6dca455a29b5.PNG) | 

## 📝 Licença


A licença pode ser encontrada <a href="https://github.com/jonathnawill/chess-system-java/blob/main/LICENCE">aqui</a>. 
