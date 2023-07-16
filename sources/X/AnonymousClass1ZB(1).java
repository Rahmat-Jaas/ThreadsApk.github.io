package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1ZB  reason: invalid class name */
public final class AnonymousClass1ZB extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "BirthdayAdditionalInfoFragment";
    public C07530bf A00;
    public C313625r A01;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.Cqb(2131822292);
        C25764Drc A0K = C18190wL.A0K();
        A0K.A0C = C18190wL.A0H(this, 599);
        A0K.A04 = 2131824015;
        AnonymousClass4u2.A03(A0K, r3);
    }

    public final String getModuleName() {
        return C18210wN.A0e(this);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1805053814);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0RA.A0C.A04(C18250wR.A07(this));
        this.A01 = C313625r.valueOf(this.mArguments.getString("RegistrationFlowExtra"));
        C14030oh.A09(1212796558, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(2072221652);
        AnonymousClass3YT.A00.A01(this.A00, this.A01, "birthday_additional_info");
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.birthday_additional_info_fragment, C18190wL.A0E(A0H), true);
        AnonymousClass0wJ.A16(A0H.requireViewById(R.id.field_detail_link), 598, this);
        C14030oh.A09(-528352632, A02);
        return A0H;
    }
}
