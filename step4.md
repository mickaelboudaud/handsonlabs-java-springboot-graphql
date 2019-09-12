# Exercices

Beaucoup de discussions tournent autour du sytème de requêtage de GraphQL mais toute plate-forme de données complète 
nécessite également un moyen de modifier les données côté serveur. Nous allons donc voir dans cette partie le principe
de mutation de GraphQL.

## Étape 1 : Nouvelle propriété `area`

Une nouvelle propriété `area` pour catégoriser les superfies des pays est définie :

1. Dans le fichier `src/main/resources/schema.sql` : `area VARCHAR(32)`
2. Le fichier `data.sql` n'a pas été modifié, la propriété sera mutée via des requêtes GraphQl :);
3. Définition d'une énumération `models.Area` pour catégoriser les surperficies;
4. Ajout de la nouvelle propriété dans le modèle `models.Country` : `private Area area;`.

- Modifier le modèle `schema.graphqls` pour ajouter le nouveau type enum et la nouvelle propriété d'un pays

- Requêter un pays avec sa propriété `area` :)

## Étape 2 : Ajout d'une mutation

- Définiser une mutation `editCountryArea` dans votre `schema.graphqls`. Cette mutation aurait deux arguments
obligatoires : `countryId` et `area`.

- Comme pour la classe `Query`, créer dans controllers une classe `Mutation` implémentant l'interface `GraphQLMutationResolver`
afin d'indiquer à Spring comment résoudre votre nouvelle requête `editCountryArea` défini dans votre `schema.graphqls`.

- Ajouter un service `editCountryArea` permettant d'éditer votre `area` pour un identifiant de pays donné.

## Étape 4 : Muter

- Éxécuter dans votre outils préféré une mutation par exemple la France avec les variables suivantes :
```
{
  "id": "FR",
  "area": "F500000_T1000000"
}
```

Vous pouvez aussi vous inspirez des sources suivante :

 * https://fr.wikipedia.org/wiki/Liste_des_pays_et_territoires_par_superficie#/media/Fichier:Countries_by_area.svg
 * https://fr.wikipedia.org/wiki/Liste_des_pays_et_territoires_par_superficie
 
 Comme dans les requêtes, si le champ de mutation renvoie un type d'objet, vous pouvez demander des champs imbriqués.
 Cela peut être utile pour récupérer le nouvel état d'un objet après une mise à jour.
 

 ## Pour information
 
 Une `mutation` peut contenir plusieurs requêtes, tout comme une `query`. Attention, Il existe une distinction importante
 entre les groupes de `query` et les groupes de `mutation` : *Alors que les `query` sont exécutés en parallèle, les `mutation`
 s'exécutent en série les unes après les autres*. Cela signifie que si deux mutations sont envoyée dans une requête,
 GraphQL nous garantie que la première finira avant le début de la seconde et ainsi éviter une situation de concurrence critique.
