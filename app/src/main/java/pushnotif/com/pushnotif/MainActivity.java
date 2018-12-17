package pushnotif.com.pushnotif;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener(this, instanceIdResult -> {
            String newToken = instanceIdResult.getToken();
            Log.e("newToken", newToken);
            Toast.makeText(MainActivity.this,
                    newToken, Toast.LENGTH_LONG).show();
           // getActivity().getPreferences(Context.MODE_PRIVATE).edit().putString("fb", newToken).apply();
        });*/
String newToken=FirebaseInstanceId.getInstance().getToken();
        Toast.makeText(MainActivity.this,
                newToken, Toast.LENGTH_LONG).show();

        Log.d(TAG, "---------------------------------------------------------------------------------");
        Log.d(TAG, "newToken  "+newToken);
        Log.d(TAG, "---------------------------------------------------------------------------------");
        String token="fmB0b0dV-ZA:APA91bFN-ta6E363IhyZQIl0BhiEgOeyCUd2LqXMA7Gyb7ydhr1Kb-ezgXIt4Hw3c9DitXbJokCsy8C6AsEtYXHDD4ZGDQg7-n2eaA47bGSrnozm92B9kuSouZ2wFCDSbyxSkDjtIx8i";

    }


}

