package com.cesi.phrasescultes

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class AjoutContactCours3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.ajout_contact_cours3)

        // FONCTIONNALITÉ : CHANGEMENT DYNAMIQUE DE LA COULEUR DE L'ARRIERE PLAN DU LAYOUT
        val layout : LinearLayout = findViewById(R.id.linearlayout_cours3)
        layout.setBackgroundColor(ContextCompat.getColor(this, R.color.nouvelle_couleur))
    }
}