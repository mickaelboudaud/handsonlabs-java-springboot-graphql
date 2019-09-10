# Exercices

## Étape 0 : Tester l'application`

Vous pouvez les 3 end point mis à votre disposition :

- `curl http://localhost:8080/api/v1/continents | jq`
- `curl http://localhost:8080/api/v1/languages | jq`
- `curl http://localhost:8080/api/v1/countries | jq`

## Étape 1 : Le schéma

/!\ Pour tout le Hands on Labs, il n'est pas nécessaire de mettre à jour les POJO et Controllers, sauf indication contraire.
Le projet existant n'est pas à modifier, une nouvelle couche/fonctionnalité est ajoutée : GraphQL.

- Ajouter les dépendances suivantes au fichier pom.xml : `graphql-java-tools 5.6.1`,`graphql-spring-boot-starter 5.10.0` et `kotlin-stdlib 1.3.41`.

- Créer un fichier `src/main/resources/countries.graphqls` qui contiendra le schéma graphQL du Pojo `Country`.

- Créer également le type Query avec champs `countries` permettant de récupérer la liste de tous les pays.

## Étape 2 : Le resolver

Présentation des résolvers.

- Créer dans controllers une classe `Query` implémentant l'interface `GraphQLQueryResolver` afin d'indiquer
à Spring comment résoudre la requête `countries`.

## Étape 3 : Utilsation

- Faire une reqête via `curl` permettant de sortir le nom de chaque pays avec leur nom natif.

- Ajouter la dépendance à `graphiql-spring-boot-starter 5.10.0` et connecter vous au nouvel endpoint `/graphiql` afin d'y effectuer d'autres requêtes.

