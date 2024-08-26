# AndroidCambio App 💸💰

Este é um aplicativo Android de conversão de moedas desenvolvido em Kotlin, que utiliza os dados da API exchangerate.host para realizar conversões de moedas em tempo real.

## Funcionalidades

- **Layout Intuitivo**: Implementação do layout utilizando componentes do Material Design 3 para garantir uma interface visual atraente e fácil de usar.
- **Validação de Estado dos Componentes**: Validação do estado dos componentes da interface para garantir a precisão dos dados inseridos pelos usuários.
- **Consumo de API Rest**: Uso do Retrofit para consumir a API exchangerate.host e obter as taxas de conversão de moedas em tempo real.
- **Chamadas Assíncronas**: Uso de Corotinas para realizar chamadas assíncronas e melhorar a performance do aplicativo.

### Outras Funcionalidades Desenvolvidas

- **Estrutura Inicial da Tela**: Criação da tela inicial com o nome da aplicação.
- **Componente de Seleção de Moedas**: Desenvolvimento de um componente que permite a seleção de diferentes moedas para conversão.
- **Estado Carregando Moedas**: Implementação de um componente de estado que exibe um indicador de carregamento enquanto as moedas são carregadas.
- **Estado Selecione uma Moeda**: Desenvolvimento de um componente de estado que solicita ao usuário que selecione uma moeda.
- **Estado Aguardando Resposta**: Implementação de um componente de estado que aguarda a resposta da API.
- **Exibição das Taxas de Conversão**: Desenvolvimento de um componente para exibir as taxas de conversão das moedas selecionadas.
- **Classes para Respostas da API**: Criação de classes que representam as respostas dos endpoints `GET /symbols` e `GET /latest`.
- **Requisição ao Endpoint GET /symbols**: Implementação da requisição para obter símbolos de moedas via Retrofit.
- **Requisição ao Endpoint GET /latest**: Implementação da requisição para obter as taxas de câmbio mais recentes via Retrofit.

## Ferramentas e Tecnologias

<details>
  <summary><strong>Linguagens de Programação</strong></summary><br />
  <strong>Kotlin</strong><br />
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=kotlin" alt="Linguagens de Programação">
  </a>
</details>

<details>
  <summary><strong>Ambiente de Desenvolvimento</strong></summary><br />
  <strong>Android Studio</strong><br />
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=androidstudio&theme=dark" alt="Ambiente de Desenvolvimento">
  </a>
</details>

<details>
  <summary><strong>Princípios aplicados para a criação da interface do usuário</strong></summary><br />
  <strong>Material Design 3</strong><br />
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=materialui&theme=dark" alt="Princípios aplicados para a criação da interface do usuário">
  </a>
</details>

<details>
  <summary><strong>Biblioteca para consumo de API Rest</strong></summary><br />
  <strong>Retrofit</strong><br />
</details>

<details>
  <summary><strong>Ferramentas para Operações Assíncronas</strong></summary><br />
  <strong>Coroutines</strong><br />
</details>

## Como Executar o App

Para rodar este app localmente, siga os passos abaixo:

1. Clone o repositório:
    ```sh
    git clone git@github.com:murielpaoli/AndroidCambio-App.git
    ```

2. Entre na pasta do repositório que você acabou de clonar:
    ```sh
    cd AndroidCambio-App
    ```

3. Crie uma branch a partir da branch main:
    ```sh
    git checkout -b user-AndroidCambio-App
    ```

Agora, você já pode abrir o repositório clonado com o Android Studio ou outra IDE e executar o aplicativo.
