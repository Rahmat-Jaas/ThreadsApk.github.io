package X;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1xp  reason: invalid class name and case insensitive filesystem */
public final class C29351xp extends AnonymousClass4MC {
    public final Context A00;
    public final CompoundButton.OnCheckedChangeListener A01;
    public final Fragment A02;
    public final UserSession A03;
    public final AnonymousClass3VR A04;
    public final String A05;
    public final C09810gi A06;
    public final C28161tl A07;

    public C29351xp(Context context, Fragment fragment, C09810gi r6, C28161tl r7, UserSession userSession, AnonymousClass3VR r9, CharSequence charSequence, String str, boolean z) {
        super((CompoundButton.OnCheckedChangeListener) null, charSequence, z);
        IDxCListenerShape267S0100000_1_I2 iDxCListenerShape267S0100000_1_I2 = new IDxCListenerShape267S0100000_1_I2((Object) this, 46);
        this.A01 = iDxCListenerShape267S0100000_1_I2;
        this.A05 = str;
        this.A08 = iDxCListenerShape267S0100000_1_I2;
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = fragment;
        this.A04 = r9;
        this.A07 = r7;
        this.A06 = r6;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36320360873858993L) && C63823iP.A0E(userSession)) {
            this.A0C = true;
            this.A0E = true;
        }
    }

    public static void A00(CompoundButton compoundButton, C29351xp r11, String str) {
        double d;
        C28161tl r5;
        long currentTimeMillis;
        String str2 = str;
        boolean equals = str.equals("cancel");
        C29351xp r7 = r11;
        AnonymousClass3VR r1 = r11.A04;
        String str3 = r11.A05;
        r1.A01(str3, str, "toggle");
        if (equals) {
            r5 = r11.A07;
            currentTimeMillis = -1;
        } else {
            if ("15_minutes".equals(str)) {
                d = 0.25d;
            } else if ("1_hour".equals(str)) {
                d = 1.0d;
            } else if ("2_hour".equals(str)) {
                d = 2.0d;
            } else if ("4_hour".equals(str)) {
                d = 4.0d;
            } else if ("8_hour".equals(str)) {
                d = 8.0d;
            } else {
                d = 0.0d;
            }
            r5 = r11.A07;
            currentTimeMillis = System.currentTimeMillis() + ((long) (d * 60.0d * 60.0d * 1000.0d));
        }
        AnonymousClass0wJ.A12(C28161tl.A02(r5), C28174Ezk.A00(183), currentTimeMillis);
        Context context = r11.A00;
        Fragment fragment = r11.A02;
        AnonymousClass06E A002 = AnonymousClass06E.A00(fragment);
        C32165H8c A012 = AnonymousClass3OP.A01(r11.A03, str3, str);
        A012.A00 = new C28531uX(compoundButton, fragment.mFragmentManager, r7, str2, equals);
        C31155GhB.A01(context, A002, A012);
    }
}
