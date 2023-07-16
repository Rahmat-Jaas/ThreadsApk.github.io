package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import com.mapbox.android.accounts.v1.MapboxAccounts;

/* renamed from: X.1xq  reason: invalid class name and case insensitive filesystem */
public final class C29361xq extends AnonymousClass4MC {
    public AnonymousClass3F6 A00;
    public AnonymousClass3F6 A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final CompoundButton.OnCheckedChangeListener A05;
    public final AnonymousClass365 A06;
    public final AnonymousClass3VR A07;
    public final String A08;
    public final Fragment A09;
    public final UserSession A0A;

    public static void A00(CompoundButton compoundButton, C29361xq r11) {
        String str;
        C29361xq r7 = r11;
        Fragment fragment = r11.A09;
        C61873Wd.A02(fragment.mFragmentManager);
        boolean z = r11.A02;
        AnonymousClass3F6 r6 = r11.A01;
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        String A0V = AnonymousClass00U.A0V(str, "-", r6.toString());
        AnonymousClass3VR r1 = r11.A07;
        String str2 = r11.A08;
        r1.A01(str2, A0V, "time_range");
        Context context = r11.A04;
        AnonymousClass06E A002 = AnonymousClass06E.A00(fragment);
        C32165H8c A012 = AnonymousClass3OP.A01(r11.A0A, str2, A0V);
        A012.A00 = new C28601ug(compoundButton, fragment.mFragmentManager, r6, r7, r11.A03, r11.A02);
        C31155GhB.A01(context, A002, A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29361xq(android.content.Context r4, androidx.fragment.app.Fragment r5, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r6, com.instagram.service.session.UserSession r7, X.AnonymousClass365 r8, X.AnonymousClass3VR r9, X.AnonymousClass3F6 r10, X.AnonymousClass4MA r11, X.AnonymousClass4MA r12) {
        /*
            r3 = this;
            java.lang.String r2 = r6.A04
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = "1"
            boolean r0 = r1.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r0 = 0
            r3.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r0, (java.lang.CharSequence) r2, (boolean) r1)
            r1 = 49
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((java.lang.Object) r3, (int) r1)
            r3.A05 = r0
            r3.A08 = r0
            java.lang.String r0 = r6.A01
            r3.A08 = r0
            r3.A06 = r8
            boolean r0 = r3.A0C
            r3.A03 = r0
            r3.A00 = r10
            r3.A01 = r10
            r3.A04 = r4
            r3.A0A = r7
            r3.A09 = r5
            r3.A07 = r9
            r0 = 220(0xdc, float:3.08E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r3, r0)
            r11.A03 = r0
            r0 = 221(0xdd, float:3.1E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r3, r0)
            r12.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29361xq.<init>(android.content.Context, androidx.fragment.app.Fragment, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2, com.instagram.service.session.UserSession, X.365, X.3VR, X.3F6, X.4MA, X.4MA):void");
    }

    public static void A01(C82984qb r5, C29361xq r6, String str, String str2) {
        String str3;
        String[] split = str2.split(":");
        int length = split.length;
        String str4 = MapboxAccounts.SKU_ID_MAPS_MAUS;
        if (length == 2) {
            str4 = split[0];
            str3 = split[1];
        } else {
            str3 = str4;
        }
        int parseInt = Integer.parseInt(str4);
        int parseInt2 = Integer.parseInt(str3);
        Context context = r6.A04;
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, new C63973in(r5, r6), parseInt, parseInt2, DateFormat.is24HourFormat(context));
        timePickerDialog.setTitle(str);
        C13950oZ.A00(timePickerDialog);
    }
}
