##### Repository

Unrepository est un composant de votre app li qui gère les opérations de CRUD sur les entités dans un BDD En gros c'est la couche qui nous permet de parler à la BDD sans se soucier des sétails.

##### Annotation  @Rrepository
Elle sert à marquer une classe comme étant un repository, c'est à dire un endroit où vous allez interagir avec la BDD.

##### Est-ce obligatoire
Non !quand on implemente déjà une interface comme JpaRepository, Spring detece automatiquement notre repository.

#### @PathVariable vs @RequestBody vs @RequestParam.

 @PathVariable
 on l'utilise pour extraire une  partie variable dans notre chemin d'url.

  vs @RequestBody :
  on l'utilise quand on reçoit des données via post.

 vs @RequestParam.
 on l'utilise  quand on a des paramètres dans l'url sous la methode