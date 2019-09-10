# Exercices

## Etape 1 : Le schéma

Dans les actions suivantes, il n'est pas nécessaire de mettre à jour les POJO et Controllers.

- Ajouter les dépendances suivantes au fichier pom.xml : `graphql-java-tools 5.6.1`,`graphql-spring-boot-starter 5.10.0` et `kotlin-stdlib 1.3.41`.

- Créer un fichier `src/main/resources/countries.graphqls` qui contiendra le schéma graphQL du Pojo `Country`.

- Créer également le type Query avec champs `countries` permettant de récupérer les listes des pays.

## Etape 2 : Le resolver

Présentation des résolvers.

- Créer dans controllers une classe `Query` implémentant l'interface `GraphQLQueryResolver` afin d'indiquer
à Spring comment résoudre la requête `countries`.

## Etape 3 : Utilsation

- Faire une reqête via `curl` permettant de sortir le nom de chaque pays avec leur nom natif.

- Ajouter la dépendance à `graphiql-spring-boot-starter 5.10.0` et connecter vous au nouvel endpoint `/graphql` afun d'y effectuer d'autres requêtes.

