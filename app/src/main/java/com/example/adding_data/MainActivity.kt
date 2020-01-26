package com.example.adding_data
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val db = FirebaseFirestore.getInstance()
        val deviceName = findViewById(R.id.editText) as EditText
        val docRef= db.collection("progress").document("fany")
        docRef.get()
            .addOnSuccessListener { document ->
                if(document != null){
                    Log.d("Donia", "DocumentSnapshot added with ID: ${document.data}")
                    deviceName.text= document.getString("deviceName")
                   // mEditText.text = myString.toEditable()

                }}
            }





    }

    }
class MyList {
    var Name: String = ""
    var Type: String = ""
    var Model: String = ""
    var Availability: Int= 0
    constructor() {}
    constructor(DName: String , DType: String, DModel: String, DAv: Int) {
        this.Name = DName
        this.Type = DType
        this.Model= DModel
        this.Availability= DAv
    }



}

