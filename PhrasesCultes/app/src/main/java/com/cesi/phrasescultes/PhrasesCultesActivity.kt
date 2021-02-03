package com.cesi.phrasescultes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.cesi.phrasescultes.exercices.BrouillonCours3

class PhrasesCultesActivity : AppCompatActivity() {
    var TAG : String = "PhrasesCultesActivity"
    var listePhrasesCultes : ArrayList<String> = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Récupérer les phrases cultes depuis Strings.xml puis les afficher
        val phrasesCultesDepuisStringsXML = resources.getStringArray(R.array.phrasescultes)
        listePhrasesCultes.addAll(phrasesCultesDepuisStringsXML)

        for (phrase in listePhrasesCultes){
            // Les afficher dans le Logcat
            Log.i(TAG, phrase)

            // Les afficher dans la console Run
            println(phrase)

            // Les afficher sous forme de Toast
            Toast.makeText(this, phrase, Toast.LENGTH_SHORT).show()
        }

        // FONCTIONNALITÉ : Afficher une phrase culte aléatoire à la place de Hello World
        var helloWorldTextView : TextView = findViewById(R.id.helloworld_textview)
        val min = 0
        val max = listePhrasesCultes.size
        val indicePhraseAleatoire = (min until max).random()
        helloWorldTextView.setText(listePhrasesCultes.get(indicePhraseAleatoire))
        Log.i(TAG, "phrase aléatoire est : " + listePhrasesCultes.get(indicePhraseAleatoire))

        // Changement de la couleur et de la taille du HelloWorld TextView
        helloWorldTextView.setTextColor(ContextCompat.getColor(this, android.R.color.holo_orange_light))
        helloWorldTextView.setTextSize(resources.getDimension(R.dimen.titre_accueil))

        // Changement de la couleur du bouton
        var bouton = findViewById<Button>(R.id.button)
        bouton.setBackgroundColor(ContextCompat.getColor(this, R.color.nouvelle_couleur))
        bouton.setOnClickListener {
            val intent : Intent = Intent(this, BrouillonCours3::class.java)
            startActivity(intent)
        }
    }
}