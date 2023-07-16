package X;

import android.util.Pair;
import android.view.View;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5ix  reason: invalid class name and case insensitive filesystem */
public final class C92625ix extends C128557jn {
    public final L3B A00;
    public final L3B A01;
    public final C113116ql A02;
    public final C112256pG A03;
    public final UserSession A04;
    public final ArrayList A05;
    public final C04530Oa A06 = C86104wH.A16(this, 24);
    public final C04530Oa A07;
    public final C04530Oa A08 = C86104wH.A16(this, 25);
    public final C04530Oa A09 = C86104wH.A16(this, 26);
    public final C04530Oa A0A = C86104wH.A16(this, 27);

    public static final List A00(C92625ix r2) {
        AnonymousClass4WE r0 = KK7.A00(r2.A04).A0E;
        ArrayList A0w = AnonymousClass0wJ.A0w(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            A0w.add(((Pair) it.next()).first);
        }
        return A0w;
    }

    public final String A03() {
        C04530Oa r4 = this.A0A;
        String string = ((AnonymousClass753) r4.getValue()).A00.getString(I17.A00(86));
        UserSession userSession = this.A04;
        BKU A0W = C86114wI.A0W(userSession, string);
        String string2 = ((AnonymousClass753) r4.getValue()).A00.getString(I17.A00(183));
        if (string2 != null || A0W == null) {
            return string2;
        }
        return C19609AzA.A03(A0W, userSession);
    }

    public final void A04() {
        View view;
        View findViewById;
        K6u k6u;
        C113116ql r4 = this.A02;
        AnonymousClass3TR r1 = r4.A00;
        if (!(r1 == null || (k6u = r4.A01) == null)) {
            k6u.A06(r1);
        }
        if (!(!C63803iN.A0E(AnonymousClass0TJ.A05, r4.A06, 36317470363881245L) || (view = ((BrowserLiteFragment) r4.A04).A0D) == null || (findViewById = view.findViewById(R.id.awareness_footer)) == null)) {
            findViewById.setVisibility(8);
        }
        C111486nl APl = this.A00.APl();
        if (APl != null) {
            APl.A00();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92625ix(X.C113336rB r3, X.L3B r4, X.C113116ql r5, com.instagram.service.session.UserSession r6, java.util.ArrayList r7, X.C04530Oa r8) {
        /*
            r2 = this;
            X.AnonymousClass0wJ.A1R(r6, r7)
            X.6pG r1 = new X.6pG
            r1.<init>(r4, r6)
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            X.C04220Ms.A06(r0)
            r2.<init>(r0, r3, r1, r8)
            r2.A01 = r4
            r2.A07 = r8
            r2.A02 = r5
            r2.A03 = r1
            r2.A00 = r4
            r2.A04 = r6
            r2.A05 = r7
            r0 = 27
            X.0Oa r0 = X.C86104wH.A16(r2, r0)
            r2.A0A = r0
            r0 = 26
            X.0Oa r0 = X.C86104wH.A16(r2, r0)
            r2.A09 = r0
            r0 = 25
            X.0Oa r0 = X.C86104wH.A16(r2, r0)
            r2.A08 = r0
            r0 = 24
            X.0Oa r0 = X.C86104wH.A16(r2, r0)
            r2.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92625ix.<init>(X.6rB, X.L3B, X.6ql, com.instagram.service.session.UserSession, java.util.ArrayList, X.0Oa):void");
    }
}
