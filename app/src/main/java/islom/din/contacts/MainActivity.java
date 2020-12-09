package islom.din.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements ContactAdapter.OnItemClickListener {

    FloatingActionButton fab;
    RecyclerView recyclerView;
    ContactAdapter adapter;
    TextView textView;
    TextView aboutContact;
    // Массив с данными о контактах
    Contact[] contacts = new Contact[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        aboutContact = findViewById(R.id.textAboutContact);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddContactActivity.class);
                startActivity(intent);
            }
        });

        // Заполняем массив
        setContactsArray();

        // Инициализируем recyclerView список
        initRecyclerView();
    }

    private void setContactsArray() {
        contacts[0] = new Contact(1, "Islom", "Nuridinov", 900000000, "iNuriddinov@ilmhona.tj");
        contacts[1] = new Contact(2, "Alex", "Cold", 900000001, "aGold@ilmhona.tj");
        contacts[2] = new Contact(3, "Diana", "Sparrow",900000002, "dSparrow@ilmhona.tj");
        contacts[3] = new Contact(4, "Dean", "Winchester", 900000003, "dWinchester@ilmhona.tj");
        contacts[4] = new Contact(5, "Sam", "Winchester", 900000004, "sWinchester@ilmhona.tj");
        contacts[5] = new Contact(6, "Erric", "Banas", 900000005, "eBanas@ilmhona.tj");
        contacts[6] = new Contact(7, "Dominic", "Torretto", 900000006, "dTorrentoWood@ilmhona.tj");
        contacts[7] = new Contact(8, "Aiden", "Pierce", 900000007, "aPierce@ilmhona.tj");
        contacts[8] = new Contact(9, "Elliot", "Alderson", 900000008, "eAndersin@ilmhona.tj");
        contacts[9] = new Contact(10, "Michel", "Rodriges", 900000009,"mRodriges@ilmhona.tj");
        contacts[10] = new Contact(11, "Rachel", "Wood",900000010,"rWood@ilmhona.tj");
        contacts[11] = new Contact(12, "Eleonora", "Dean", 900000011,"eDean@ilmhona.tj");
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        adapter = new ContactAdapter(contacts, this);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }


    @Override
    public void onItemClick(int position) {
        Contact clickAboutContact = contacts[position];

        Intent intentAboutContact = new Intent(MainActivity.this, AboutContactActivity.class);

        intentAboutContact.putExtra("nameAndLastName", clickAboutContact.getName() + " - " + clickAboutContact.getLastName());
        intentAboutContact.putExtra("telNumber", "+992" + clickAboutContact.getTelNumber());
        intentAboutContact.putExtra("email", clickAboutContact.getMail() + "");
        startActivity(intentAboutContact);

    }
}