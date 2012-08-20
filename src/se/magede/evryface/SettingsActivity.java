package se.magede.evryface;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;

public class SettingsActivity extends PreferenceActivity {

	public final static String KEY_PREF_HOST = "pref_host";
	public final static String KEY_PREF_URL = "pref_url";
	public final static String KEY_PREF_USR = "pref_userName";
	public final static String KEY_PREF_PWD = "pref_password";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        addPreferencesFromResource(R.xml.preferences);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_settings, menu);
        return true;
    }
}
