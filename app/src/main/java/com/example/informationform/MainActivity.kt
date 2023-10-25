package com.example.informationform

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.informationform.R

class MainActivity : AppCompatActivity() {

    private lateinit var firstNameText: EditText
    private lateinit var lastNameText: EditText
    private lateinit var emailText: EditText
    private lateinit var checkBox: CheckBox
    private lateinit var addressText: EditText
    private lateinit var birthDateText: EditText
    private lateinit var rgGender: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNameText = findViewById(R.id.firstnameText)
        lastNameText = findViewById(R.id.lastnameText)
        emailText = findViewById(R.id.emailText)
        checkBox = findViewById(R.id.checkBox)
        addressText = findViewById(R.id.addressText)
        birthDateText = findViewById(R.id.birthDateText)
        rgGender = findViewById(R.id.rgGender)

        val registerButton: Button = findViewById(R.id.btnRegister)
        registerButton.setOnClickListener(View.OnClickListener {
            val firstName = firstNameText.text.toString()
            val lastName = lastNameText.text.toString()
            val email = emailText.text.toString()
            val isCheckBoxChecked = checkBox.isChecked
            val address = addressText.text.toString()
            val birthDate = birthDateText.text.toString()
            val selectedGenderId = rgGender.checkedRadioButtonId

            if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || address.isEmpty() || birthDate.isEmpty() || selectedGenderId == -1 || !isCheckBoxChecked) {
                Toast.makeText(this, "Vui lòng nhập đủ thông tin và đồng ý với điều khoản sử dụng.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Thông tin đã được lưu", Toast.LENGTH_SHORT).show()
            }
        })
    }
}