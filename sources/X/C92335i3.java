package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.5i3  reason: invalid class name and case insensitive filesystem */
public final class C92335i3 extends AnonymousClass5jN {
    public final Context A00;
    public final UserSession A01;

    public final Fragment A00(Bundle bundle, String str) {
        C04220Ms.A0B(str, 0);
        if (str.equals("home_fragment") || str.equals("settings_fragment")) {
            return A01(bundle, str);
        }
        return super.A00(bundle, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A01(android.os.Bundle r15, java.lang.String r16) {
        /*
            r14 = this;
            r5 = 0
            r2 = r16
            X.C04220Ms.A0B(r2, r5)
            java.lang.String r0 = "home_fragment"
            boolean r0 = r2.equals(r0)
            java.lang.String r4 = "referrer"
            java.lang.String r1 = "logging_data"
            r6 = 0
            if (r0 == 0) goto L_0x0086
            if (r15 == 0) goto L_0x007a
            android.os.Parcelable r0 = r15.getParcelable(r1)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
            if (r0 == 0) goto L_0x007a
            java.lang.String r12 = r0.A00
        L_0x001f:
            java.lang.String r13 = r15.getString(r4)
        L_0x0023:
            com.instagram.service.session.UserSession r0 = r14.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r9 = X.C18190wL.A0N(r0)
            java.lang.String r10 = "com.bloks.www.fbpay.bsc.ig.shell"
            r9.A0P = r10
            android.content.Context r8 = r14.A00
            r0 = 2131832224(0x7f112da0, float:1.9297496E38)
            X.C18210wN.A0s(r8, r9, r0)
            r7 = 667752497(0x27cd1831, float:5.692516E-15)
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            r2 = 2
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>(r2)
            java.lang.String r0 = "logging_session_id"
            r11.put(r0, r12)
            r1.set(r5)
            java.lang.String r0 = "referer"
            r11.put(r0, r13)
            r0 = 1
            r1.set(r0)
            int r0 = r1.nextClearBit(r5)
            if (r0 < r2) goto L_0x007f
            java.util.HashMap r0 = X.C37067Jjv.A02(r11)
            X.3iE r0 = X.C63743iE.A06(r10, r0, r4)
            X.C63743iE.A0A(r0, r7)
            r0.A03 = r6
            r0.A02 = r6
            r0.A04 = r6
            r0.A0G(r3)
            androidx.fragment.app.Fragment r0 = r0.A0B(r8, r9)
            return r0
        L_0x007a:
            r12 = r6
            if (r15 != 0) goto L_0x001f
            r13 = r6
            goto L_0x0023
        L_0x007f:
            java.lang.String r0 = "Missing Required Props"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0086:
            java.lang.String r0 = "settings_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00f6
            if (r15 == 0) goto L_0x00f0
            android.os.Parcelable r0 = r15.getParcelable(r1)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
            if (r0 == 0) goto L_0x00f0
            java.lang.String r6 = r0.A00
        L_0x009a:
            java.lang.String r3 = r15.getString(r4)
            java.lang.String r0 = "financial_entity_id"
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "payout_subtype"
            java.lang.String r1 = r15.getString(r0)
        L_0x00aa:
            com.instagram.service.session.UserSession r0 = r14.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r8 = X.C18190wL.A0N(r0)
            r0 = 911(0x38f, float:1.277E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r8.A0P = r0
            android.content.Context r7 = r14.A00
            r0 = 2131835559(0x7f113aa7, float:1.930426E38)
            X.C18210wN.A0s(r7, r8, r0)
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()
            r0 = 2
            java.util.BitSet r9 = new java.util.BitSet
            r9.<init>(r0)
            java.lang.String r0 = "upl_session_id"
            r12.put(r0, r6)
            r0 = 1
            r9.set(r0)
            r12.put(r4, r3)
            r9.set(r5)
            java.lang.String r0 = "financial_entity_id"
            r12.put(r0, r2)
            java.lang.String r0 = "payout_subtype"
            r12.put(r0, r1)
            androidx.fragment.app.Fragment r0 = X.AnonymousClass2LH.A00(r7, r8, r9, r10, r11, r12)
            return r0
        L_0x00f0:
            if (r15 != 0) goto L_0x009a
            r3 = r6
            r2 = r6
            r1 = r6
            goto L_0x00aa
        L_0x00f6:
            androidx.fragment.app.Fragment r0 = super.A01(r15, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92335i3.A01(android.os.Bundle, java.lang.String):androidx.fragment.app.Fragment");
    }

    public C92335i3(Context context, UserSession userSession, C04560Oe r3) {
        super(context, r3);
        this.A01 = userSession;
        this.A00 = context;
    }
}
