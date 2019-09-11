# Exercices

## Étape 1 : Modification du schéma

- Mettre à jour le schéma GraphQL de l'application pour ajouter les types objets `Continent` et `Language`.
 
- Mettre à jour le type objet `Country` pour faire référence à ces nouveaux types plutôt que restituer les ids.

- Résoudre avec Spring la récupération du continent et des langues associées. Pour cela, utilisez un autre type de 
resolver graphql que le `GraphQLQueryResolver`. Attention, pour rappel, les pojos ne doivent pas être modifiés.

## Étape 2 : Requêtes à l'aide de curl ou de graphiql

- Écrire une requête listant tous les pays. Pour chaque pays, le libellé du continent et le nom natif de la langue sont demandées.

## Étape 3 : Pour aller plus loin... 

- Écrire une requête listant tous les continents avec leurs pays associés.

- Écrire une requête listant tous les continents avec leurs pays associés et à quel continent le pays appartient :).

