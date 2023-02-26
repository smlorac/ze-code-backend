# Desafio de Backend

## 1. O que queremos que você faça

Nós esperamos que você desenvolva um serviço que disponibilize uma API REST ou GraphQL que implemente essas funcionalidades e requisitos técnicos:

### 1.1. Criar um parceiro:
Salvar no banco de dados **todas** as seguintes informações representadas por este JSON junto com as regras subsequentes:
```json
{
  "id": 1, 
  "tradingName": "Adega da Cerveja - Pinheiros",
  "ownerName": "Zé da Silva",
  "document": "1432132123891/0001",
  "coverageArea": { 
    "type": "MultiPolygon", 
    "coordinates": [
      [[[30, 20], [45, 40], [10, 40], [30, 20]]], 
      [[[15, 5], [40, 10], [10, 20], [5, 10], [15, 5]]]
    ]
  },
  "address": { 
    "type": "Point",
    "coordinates": [-46.57421, -21.785741]
  }
}
```

1. O campo `address` (endereço em inglês) segue o formato `GeoJSON Point` (https://en.wikipedia.org/wiki/GeoJSON);
2. o campo `coverageArea` (área de cobertura em inglês) segue o formato `GeoJSON MultiPolygon` (https://en.wikipedia.org/wiki/GeoJSON);
3. O campo `document` deve ser único entre os parceiros;
4. O campo `id` deve ser único entre os parceiros, mas não necessariamente um número inteiro;

Você pode usar esse arquivo [JSON](files/pdvs.json) com centenas de informações de parceiros que geramos para você testar o seu serviço — **não** esperamos que estes parceiros estejam pré carregados em sua base de dados.
Abaixo, você pode ver como estes parceiros são representados em um mapa:
![parceiros em um mapa](files/images/pdvs.png)

### 1.2. Carregar parceiro pelo `id`:
Retornar um parceiro específico baseado no seu campo `id` com todos os campos apresentados acima.

### 1.3. Buscar parceiro:
Dada uma localização pelo usuário da API (coordenadas `long` e `lat`), procure o parceiro que esteja **mais próximo** e **que cuja área de cobertura inclua** a localização.

### 1.4. Requerimentos Técnicos:
* Você tem liberdade para escolher a linguagem de programação e o mecanismo de base de dados da sua preferência;
* O seu projeto deve ser **multi-plataforma**;
* Você deve escrever um arquivo de documentação (`README.md`) explicando como executar o seu serviço **localmente** e como colocá-lo em produção (*foque na simplicidade e não se esqueça que iremos testar seu serviço por nossa própria conta, sem qualquer assistência sua*).

## Método de Avaliação

Vamos avaliar seu teste baseado em uma série de [atributos de qualidade](https://en.wikipedia.org/wiki/List_of_system_quality_attributes).
Consideramos corretude um atributo essencial, desclassificando seu teste caso o mesmo não esteja 100% de acordo.
Os outros, como não podem ser avaliados de maneira objetiva, não podem desclassifica-lo sozinhos.
Esses são os atributos de qualidade que esperamos que você atenda:
- **Corretude:** O seu código deve seguir **todos** os requerimentos apresentados no item [1.](#1-o-que-queremos-que-você-faça);
- **Performance:** Quanto mais parceiros na base de dados e mais rápido você conseguir buscar, melhor;
- **Testabilidade:** Quão testado e quão fácil é adicionar novos testes ao seu código;
- **Manutenibilidade:** Quão fácil é adicionar novas funcionalidades no seu código;
- **Separação de conceitos:** (https://en.wikipedia.org/wiki/Separation_of_concerns)
