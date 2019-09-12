# Exercices

Beaucoup de discussions tournent autour du sytème de requêtage de GraphQL mais toute plate-forme de données complète 
nécessite également un moyen de modifier les données côté serveur. Nous allons donc voir dans cette partie le principe
de mutation de GraphQL.


Comme dans les requêtes, si le champ de mutation renvoie un type d'objet, vous pouvez demander des champs imbriqués.
Cela peut être utile pour récupérer le nouvel état d'un objet après une mise à jour

## Étape 0 : Nouvelle propriété `area`

Une nouvelle propriété `area` pour catégoriser les superfies des pays est définie :

1. Dans le fichier `src/main/resources/schema.sql` : `area VARCHAR(32)`
2. Le fichier `data.sql` n'a pas été modifié, la propriété sera mutée via des requêtes GraphQl :);
3. Définition d'une énumération `models.CountryArea` pour catégoriser les surperficies;
4. Ajout de la nouvelle propriété dans le modèle `models.Country` : `private CountryArea area;`.

