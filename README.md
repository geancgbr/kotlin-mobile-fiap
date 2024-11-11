# Health System

## Descrição do Projeto
O **Health System** é um aplicativo de saúde desenvolvido para promover o cuidado integral e personalizado do usuário no contexto de Cidades Inteligentes (Smart Cities). Utilizando tecnologias móveis avançadas e inteligência artificial, o aplicativo coleta dados pessoais e fornece recomendações de bem-estar ajustadas a partir de algoritmos sofisticados, integrando também informações climáticas em tempo real para incentivar hábitos saudáveis.

## Objetivos
O aplicativo tem como objetivo ajudar os usuários a:
- Monitorar e gerenciar dados de saúde, como peso, altura e hábitos alimentares.
- Receber recomendações personalizadas de bem-estar, como ingestão de água e prática de exercícios.
- Ajustar metas de saúde diárias de acordo com as condições climáticas, utilizando dados da API OpenWeather.

## Funcionalidades
- **Coleta de dados de saúde**: Armazena e gerencia dados como peso, altura e nível de atividade física.
- **Recomendações personalizadas**: Utiliza IA para oferecer orientações personalizadas para a saúde do usuário.
- **Monitoramento de ingestão de água**: Permite registrar e acompanhar o consumo diário de água.
- **Integração com API climática**: Usa a API OpenWeather para fornecer recomendações de acordo com o clima.
- **Interface intuitiva e fácil de usar**: Permite uma navegação eficiente e agradável para o usuário.

## Tecnologia
- **Kotlin**: Linguagem de programação escolhida para o desenvolvimento do aplicativo.
- **API OpenWeather**: Fornece dados climáticos que ajudam a contextualizar as recomendações de saúde.

## Arquitetura
O aplicativo é estruturado com as seguintes camadas principais:
1. **Interface do Usuário (UI)**: Telas de login, cadastro e home para a experiência do usuário.
2. **Lógica de Negócio**: Algoritmos de recomendação personalizados.
3. **Serviços Externos**: Integração com a API OpenWeather através do Retrofit para fornecer dados climáticos em tempo real.

## Tela do Aplicativo
### Login
Permite ao usuário acessar sua conta com segurança.
### Cadastro
Facilita o registro de novos usuários com validações em tempo real para dados como peso e altura.
### Home
Monitora a ingestão diária de água, mostra a temperatura atual e oferece um indicador visual do progresso de hidratação.

