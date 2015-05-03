package criminalintent.android.bigranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by John on 5/2/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
