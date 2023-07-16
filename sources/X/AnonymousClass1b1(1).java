package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.barcelona.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1b1  reason: invalid class name */
public final class AnonymousClass1b1 extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "AgreeToTermsOfUseFragment";
    public AnonymousClass1fI A00;
    public RegFlowExtras A01;
    public C07530bf A02;
    public ProgressButton A03;

    public final String getModuleName() {
        return "agree_to_terms";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        C07530bf r3 = this.A02;
        C313625r A012 = this.A01.A01();
        AnonymousClass0wJ.A1N(r3, "agree_to_terms");
        C62223Xv.A00(r3, A012, (Boolean) null, (Integer) null, "agree_to_terms");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1998780351);
        super.onCreate(bundle);
        this.A02 = C18210wN.A0N(this);
        this.A01 = C18210wN.A0M(this);
        C14030oh.A09(-1847442678, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(795546946);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.agree_to_terms_of_use_fragment, C18190wL.A0E(A0H), true);
        this.A03 = C18210wN.A0O(A0H);
        this.A00 = new AnonymousClass1fI(getContext(), this, this);
        ((AbsListView) A0H.requireViewById(16908298)).setAdapter(this.A00);
        this.A00.A09();
        this.A03.setEnabled(false);
        AnonymousClass0wJ.A16(this.A03, 592, this);
        C14030oh.A09(1181816833, A022);
        return A0H;
    }
}
