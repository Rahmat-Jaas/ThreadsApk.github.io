package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1wb  reason: invalid class name */
public final class AnonymousClass1wb extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "ContactOptionsFragment";
    public final C04530Oa A00 = C80644m9.A00(this);
    public final C82394pY A01 = C18220wO.A0P(this, 21);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131827932);
    }

    public final String getModuleName() {
        return "contacts";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public static final List A0B(AnonymousClass1wb r9) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Context context = r9.getContext();
        if (context != null) {
            C04530Oa r4 = r9.A00;
            A0v.add(AnonymousClass4MC.A05(r9, 4, 2131824263, C34832Lb.A00(context, AnonymousClass0wJ.A0X(r4))));
            String A0g = C18180wK.A0g(r9, 2131829574);
            SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0o(r9, A0g, 2131824266));
            C10300i6 A0U = AnonymousClass0wJ.A0U(r4);
            String A012 = AnonymousClass3W8.A01(context, "https://help.instagram.com/227486307449481");
            C04220Ms.A06(A012);
            AnonymousClass3Zw.A01(A0E, new C29401xz(context, A0U, (AnonymousClass36D) null, A012, C18210wN.A01(context)), A0g);
            C23411dm.A01(A0E, A0v);
        }
        return A0v;
    }

    public final void onPause() {
        int A02 = C14030oh.A02(770423163);
        super.onPause();
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(this.A00)).A02(this.A01, C687545i.class);
        C14030oh.A09(-774425165, A02);
    }

    public final void onResume() {
        int A02 = C14030oh.A02(504721859);
        super.onResume();
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(this.A00)).A01(this.A01, C687545i.class);
        setItems(A0B(this));
        C14030oh.A09(2081868493, A02);
    }
}
