# Exercices

## Étape 1 : Ajout d'une requête paramétrée


- Ajouter une query GraphQL pour pouvoir récupérer un pays à l'aide de son identifiant : `country(...)`. 

- Requeter un pays par exemple la France.

## Étape 2 : Alias et fragment

- Requêter dans une même requête la France et Singapore pour pouvoir comparer les langues parlées dans ces pays. 
Utiliser le système d'Alias de GraphQL.

- Requêter dans une même requête la France et Singapore pour pouvoir comparer les langues natives parlées et les devises dans ces pays. 
Utiliser le système de fragment de GraphQL pour définir les propriétés de comparaison une seule fois.

## Étape 3 : Operation name et variable

Pour information, jusqu'à présent, une syntaxe abrégée dans laquelle le mot clé `request` et le nom de la requête ont
surement été omis. Ce nom n'est pas obligatoire mais son utilisation est encouragée car elle est très utile pour le 
débogage et la journalisation côté serveur.

Jusqu'ici, nous avons écrit tous nos arguments à l'intérieur de la chaîne de requête. Mais dans la plupart des 
applications, les arguments des champs seront dynamiques : par exemple, le choix d'un pays sera fait lors de la sélection
d'un résultat de recherche dans un tableau. la requête GraphQl est à construire dynamiquement. En règle générale,
Nous ne devrions jamais effectuer d’interpolation de chaîne pour construire des requêtes à partir de valeurs fournies 
par l’utilisateur. Une bonne pratique est d'indiquer les arguments de notre requête censés être dynamiques. GraphQl permet
cela avec son système de variable.

- Écrire une requête variabilisée et nommée pour rechercher un pays par rapport à son identifiant. Si aucune variable
n'est enseignée, la valeur par défaut sera la France.

## Étape 4 : Les directives

Les variables nous permettent d'éviter d'interpoler manuellement des chaînes de charactères pour construire des requêtes 
dynamiquement. Mais il serait aussi bien de pouvoir changer dynamiquement la structure et la forme de nos requêtes : 
par exemple, nous pouvons imaginer un composant d'interface utilisateur ayant une vue résumée et détaillée, 
où l'un comprend plus de champs que l'autre. C'est ce qu'on appelle en GraphQl des directives.

- Écrire une requête avec une directive pour afficher seulement le nom du pays dans le cadre d'une recherche par exemple, 
ou pour afficher toutes les propriétés d'un pays dans le cadre d'un fiche détaillée.



