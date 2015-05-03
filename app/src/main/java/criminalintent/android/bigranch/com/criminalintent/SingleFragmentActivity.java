package criminalintent.android.bigranch.com.criminalintent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public abstract class SingleFragmentActivity extends FragmentActivity {
    protected abstract android.support.v4.app.Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager(); // creates a fragment from the support library so older devices can run.
        android.support.v4.app.Fragment fragment = fm.findFragmentById(R.id.fragmentContainer); //places the fragment in the fragment variable.

        if (fragment == null) { // checks to see if the fragment exists. It could exist if the app was destroyed or if the screen was rotated.
            fragment = createFragment(); // If neither of the two happened above, it creates a new CrimeFragment.
            fm.beginTransaction() // this adds that new CrimeFragment to the fragment stack.
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
}