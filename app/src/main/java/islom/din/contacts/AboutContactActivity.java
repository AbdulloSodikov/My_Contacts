package islom.din.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class AboutContactActivity extends  AddContactActivity{
     TextView nameAndLastName;
     TextView intTelNumber;
     TextView mailAddress;
     ImageView icBack;
     ImageView icEdit;
     ImageView icMore;
     ImageView icTel;
     ImageView icMessage;
     ImageView icEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutcontact);

        nameAndLastName = findViewById(R.id.textAboutContact);
        intTelNumber = findViewById(R.id.telNumber);
        mailAddress = findViewById(R.id.textEmail);
        icBack = findViewById(R.id.icBack);
        icEdit = findViewById(R.id.icEdit);
        icMore = findViewById(R.id.icMore);
        icTel = findViewById(R.id.iconTel);
        icMessage  = findViewById(R.id.iconMessage);
        icEmail =  findViewById(R.id.iconMail);


        icBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackMain = new Intent(AboutContactActivity.this,MainActivity.class);
                startActivity(intentBackMain);
            }
        });

        icEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AboutContactActivity.this,"В разработке", Toast.LENGTH_SHORT).show();
            }
        });
        icMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AboutContactActivity.this,"В разработке", Toast.LENGTH_SHORT).show();
            }
        });
        icTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AboutContactActivity.this,"В разработке", Toast.LENGTH_SHORT).show();
            }
        });
        icMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AboutContactActivity.this,"В разработке", Toast.LENGTH_SHORT).show();
            }
        });
        icEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AboutContactActivity.this,"В разработке", Toast.LENGTH_SHORT).show();
            }
        });



        nameAndLastName.setText(getIntent().getStringExtra("nameAndLastName"));
        intTelNumber.setText(getIntent().getStringExtra("telNumber"));
        mailAddress.setText(getIntent().getStringExtra("email"));

    }
}
