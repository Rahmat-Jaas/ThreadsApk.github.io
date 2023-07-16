package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1wk  reason: invalid class name and case insensitive filesystem */
public final class C29111wk extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "SecurityOptionsFragment";
    public C85604vT A00;
    public UserSession A01;
    public String A02;
    public AnonymousClass3HD A03;

    public final String getModuleName() {
        return "security_options";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public static void A0B(C29111wk r6) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        r6.A03.A01(r6.A00, r6.A02, A0v, true, true);
        r6.setItems(A0v);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C23411dm.A05(this, r2, 2131835361);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 7 && intent != null && intent.getExtras() != null && intent.getExtras().getBoolean("password_updated_key", false)) {
            A0B(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1762878008);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A01 = A0W;
        this.A03 = new AnonymousClass3HD(A0W, this);
        C14030oh.A09(-608960045, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C63873iU.A0C(this, C18180wK.A0R(C67473zc.A00(C67463zb.A00(), C205115a.class, "FxSettingsSecurityTransition"), this.A01), 148);
        A0B(this);
        AnonymousClass01V r3 = AnonymousClass01V.A0p;
        r3.markerAnnotate(857808781, "node_identifier", "security_and_login");
        r3.markerEnd(857808781, 2);
        C15720rm r4 = new C15720rm("contact_point_update");
        C19335Aud.A00().Bfk(requireContext(), r4, this.A01, C170759vW.SECURITY_SETTINGS);
    }
}
