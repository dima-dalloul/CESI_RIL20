package com.cesi.phrasescultes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

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
    }
}