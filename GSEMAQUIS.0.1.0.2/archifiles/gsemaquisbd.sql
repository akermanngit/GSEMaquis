DELETE DATABASE GSEMAQUISoneDB;

CREATE DATABASE GSEMAQUISoneDB;

USE GSEMAQUISoneDB;

CREATE TABLE IF NOT EXISTS  Client  (
   idClient     		serial, 
   nomClient 	 	char(10) DEFAULT NULL,
   prenomClient  		char(10) DEFAULT NULL,
  numeroClient 		char(10) NOT NULL,
  lieuLivraison 		char(10), NOT NULL,
  CONSTRAINT		Client_pk PRIMARY KEY ( idClient ),
 );
 
			 			 
CREATE TABLE IF NOT EXISTS  Livreur (
 idLivreur 			serial,
 nomLivreur 		char(10) NOT NULL,
 numLivreur 		char(10) NOT NULL,
 positionLivreur 		char(10) NOT NULL, 
 CONSTRAINT		Livreur_pk PRIMARY KEY ( idLivreur ),
 );
 			    
CREATE TABLE IF NOT EXISTS  Commande (
	 idCommande 			seiral
	 idLivreur 				int(20) NOT NULL REFERENCES  Livreur ,
	 idClient 				int(20) NOT NULL REFERENCES  Client , 
	 dateCommande 			date NOT NULL,
	 numTelCommande	 	char(10) NOT NULL,
	 statusCommande 		char(10) NOT NULL,
PRIMARY KEY ( idCommande ,   idLivreur ,  idClient ) CONSTRAINT PK_Commande  );
			
CREATE TABLE IF NOT EXISTS  TypeRepas  (
				 idTypeRepas 	int(20) NOT NULL,
				 libellePlat 		char(30) NOT NULL,
				 prixPlat 		real(5,0) NOT NULL,
	PRIMARY KEY ( idTypeRepas )
);
				
CREATE TABLE IF NOT EXISTS  Contient  (
	 idTypeRepas 	int(20)  NOT NULL REFERENCES  TypeRepas ,
	 idCommande 	int(20)  NOT NULL REFERENCES   Commande ,
	 nomPlatCom 	char(10) NOT NULL,
	 quantite 		int(20)  NOT NULL,
PRIMARY KEY ( idTypeRepas ,  idCommande ) CONSTRAINT PK_Contient
);
				
								
			
CREATE TABLE IF NOT EXISTS  Livraison  (
		 idClient 		int(20)  NOT NULL REFERENCES  Client ,
		 idLivreur   		int(20)  NOT NULL REFERENCES  Livreur ,
		 NomPlat 		char(20) NOT NULL,
		 QuantiteLivre 	int(20)  NOT NULL,
		 datelivraison 	date(10) NOT NULL
PRIMARY KEY ( idClient ,  idLivreur )  CONSTRAINT PK_Livraison 
);
				
