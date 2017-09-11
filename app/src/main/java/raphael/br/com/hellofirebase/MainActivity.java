package raphael.br.com.hellofirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference mFirebaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarConexaoComFirebase();
    }
    private void iniciarConexaoComFirebase(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        mFirebaseRef = database.getReference("chatroom");
    }
}
