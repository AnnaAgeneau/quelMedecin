package fr.eni.quelMedecin.bo;

/**
 * Création de la Class adresse, qui définit les adresses des médecins. <br>
 * auteur :Anna Ageneau <br>
 * date : 12/05/2021
 *
 */
public class Adresse {
    //dans ma classe, je trouve les mentions complémentaires comme : appartement, étage, escalier
    private String mentionComplementaire;
    private int numero;
    private String complementNumero;
    private String nomDeLaVoie;
    private int codePostal;
    private String nomVille;


    // création du constructeur
    // celui ci avec toutes les infos
    public Adresse(String mentionComplementaire,
                   int numero,
                   String complementNumero,
                   String nomDeLaVoie,
                   int codePostal,
                   String nomVille) {
        this.mentionComplementaire = mentionComplementaire;
        this.numero = numero;
        this.complementNumero = complementNumero;
        this.nomDeLaVoie = nomDeLaVoie;
        this.codePostal = codePostal;
        this.nomVille = nomVille;
    }
    // création du 2ème constructeur,
    // les mentions complémentaires sont initialisé à null;
    public Adresse(int numero,
                   String complementNumero,
                   String nomDeLaVoie,
                   int codePostal,
                   String nomVille) {

        this.numero = numero;
        this.complementNumero = complementNumero;
        this.nomDeLaVoie = nomDeLaVoie;
        this.codePostal = codePostal;
        this.nomVille = nomVille;
    }


    public void afficher() {

        // mise en forme du code postal
        // en int le 1er 0 est effacé, il faut donc transformer le int en String puis ajouter le 0 devant
        // si il n'y a que 4 chiffres
        String cp = String.valueOf(this.codePostal);
        if(cp.length() == 4){
            //cp = "0".concat(cp);
            cp = "0"+ cp;
        }

        // affichage 1ere ligne d'adresse
        // on vérifie s'il y a une mention complétmentaire
        // s'il y en a une, on l'affiche
        if (this.mentionComplementaire != null){
            System.out.println(mentionComplementaire);
        }
        // si il n'y a pas de bis, ter etc.. pour ne pas afficher "null" je créé la variable cN
        // et je la teste en mettant que si le complemntNum est null, je met juste le cN qui est " " vide
        // à la place
        // else j'affiche comme prévu le complement numéro
        String cN;
        if (complementNumero == null){
            cN = " ";
        } else {
            cN = complementNumero;
        }

        // affichage 2ème ligne d'adresse
        System.out.println(this.numero + cN + " " +
                this.nomDeLaVoie);
        System.out.println(cp + " " + this.nomVille.toUpperCase());

    }


}



