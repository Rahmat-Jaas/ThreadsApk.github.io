package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.1ZI  reason: invalid class name */
public final class AnonymousClass1ZI extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "UhlAccountSelectionFragment";
    public List A00;
    public C07530bf A01;
    public String A02;
    public boolean A03;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.CtT(true);
    }

    public final String getModuleName() {
        return "UniversalHackLock";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(455602489);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A01 = AnonymousClass0RA.A0C.A04(bundle2);
            this.A00 = bundle2.getParcelableArrayList("UHL_ACCOUNT_SELECTION_ACCOUNTS");
            this.A02 = bundle2.getString("ARG_UHL_ACCOUNT_SELECTION_GET_HELP_LINK", "");
            this.A03 = bundle2.getBoolean("ARG_UHL_ACCOUNT_SELECTION_SHOW_AS_MODAL");
        }
        C14030oh.A09(-1120831615, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-118435830);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.uhl_multiple_account_selection);
        ((AbsListView) A0H.requireViewById(R.id.uhl_multiple_account_list)).setAdapter(new C18840xz(getContext(), this, this, this.A00));
        AnonymousClass0wJ.A16(A0H.requireViewById(R.id.uhl_multiple_account_get_help), 512, this);
        C14030oh.A09(-1899986450, A022);
        return A0H;
    }
}
