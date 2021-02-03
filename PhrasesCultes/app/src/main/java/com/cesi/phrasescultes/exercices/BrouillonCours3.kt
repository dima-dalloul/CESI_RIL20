package com.cesi.phrasescultes.exercices

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cesi.phrasescultes.R

class BrouillonCours3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.brouillon_layout_cours3)

        // FONCTIONNALITÉ : Proposer des complétions pour l'auto-complete TextView
        val planetes : Array<String> = arrayOf("Mercure", "Vénus", "Terre", "Mars", "Jupiter", "Saturne", "Neptune", "Uranus", "Pluton")

        val adaptateurPlanetes  : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, planetes)

        var planetesAutoCompleteTextView : AutoCompleteTextView = findViewById(R.id.autoCompleteTextView_cours3)

        planetesAutoCompleteTextView.setAdapter(adaptateurPlanetes)

        // FONCTIONNALITÉ : Revenir en arrière si clic sur bouton
        val boutonRetourArriere : Button = findViewById(R.id.brouillon_bouton_cours3)
        boutonRetourArriere.setOnClickListener {
            super.onBackPressed()
        }
    }
}