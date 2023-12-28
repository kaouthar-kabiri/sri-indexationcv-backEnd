# Description
Application web pour l'indexation des cvs développée avec Spring boot et ElasticSearch, dans le cadre d'un projet académique à l'école nationale des sciences appliquées de Marrakech, du module : "SYSTEMES DE RECHERCHE D'INFORMATIONS ET BIG DATA"
# Équipe
* Ikram Jouichi
* Kaouthar Kabiri
* Oumeyma Es-sraidi
# Démo
Une simulation de notre systéme de recherche sur une base de 20 documents :

[https://user-images.githubusercontent.com/39196828/139540517-13cf6df1-dbda-45ee-b657-121e3d07fe32.mov](https://drive.google.com/file/d/1H3rTkRVPsb3gHNmFtcE-30gG4Ev6w3em/view)https://drive.google.com/file/d/1H3rTkRVPsb3gHNmFtcE-30gG4Ev6w3em/view
 # Installation
1. Cloner le projet
2. [Installer ElasticSearch en local et démarrer le conteneur ](https://www.elastic.co/guide/en/elasticsearch/reference/current/docker.html)
3. Créer `application.properties` dans `src/main/resources` et ajouter les configurations pour ElasticSearch
    ```
    elasticsearch.url =localhost:9200 # Par défaut ElasticSearch utilise le port 9200
    elasticsearch.username=your-username # Le nom d'utilisateur : par défaut 'elastic' s'il n'est pas modifié par l'utilisateur
    elasticsearch.password=your-password # Le mot de passe généré par elasticsearch lors du premier démarrage
    ```
4. Utiliser Postman pour installer le plugin "ingest attachment plugin", et envoyer une requete 'PUT' vers elasticSearch
   ```
       PUT http://localhost:9200/_ingest/pipeline/attachment
       {
         "description" : "Extract attachment information",
         "processors" : [
             {
                 "attachment" : {
                     "field" : "data"
                 }
             }
         ]
     }
   ```
5. Dés que la pipeline "attachement" est enregistrée , démarrer le back-end de l'application.
