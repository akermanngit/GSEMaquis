create table Client(idClient		char(10) automatic primarykey,
			  nomClient  	char(10),
			  prenomClient  	char(10),
			 numeroClient	char(10),
			 lieuLivraison	char(10),
			 #idLivreur		char(10) foreignkey 
			 #numeroCommande	char(10) foreignkey );
			 
create table Livreur(idLivreur		char(10) automatic primarykey,
			   #numeroCommande	char(10) foreignkey
			    nomLivreur	char(10),
 			    numLivreur	char(10),
 			  positionLivreur	char(10) );
 			    
create table Commande(numeroCommande	char(10) primary key ,
				 idLivreur		char(10) foreignkey
				 #idClient		char(10) foreignkey 
				dateCommande		date,
				nomPlatCom		char(10),
				quantitePlatCommande	integer,
				numTelCommande		char(10),
				statusCommande		char(10)  );
			
create table Livraison (idClient,idLivreur  char(30) primarykey,
				NomPlat		char(20),
				QuantiteLivre	integer,
				datelivraison	date);
				
