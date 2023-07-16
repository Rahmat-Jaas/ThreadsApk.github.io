package X;

import android.content.Context;
import android.os.Parcel;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxJHelperShape836S0100000_1_I2;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.3Y3  reason: invalid class name */
public final class AnonymousClass3Y3 {
    public static AnonymousClass3Y3 A01;
    public C37228Jmt A00;

    public static synchronized AnonymousClass3Y3 A00(Context context) {
        AnonymousClass3Y3 r1;
        synchronized (AnonymousClass3Y3.class) {
            r1 = A01;
            if (r1 == null) {
                r1 = new AnonymousClass3Y3(context.getApplicationContext());
                A01 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass3Y3(Context context) {
        this.A00 = new C37228Jmt(context, new IDxJHelperShape836S0100000_1_I2(this, 1));
        C38040KHr.A01.A03(C18220wO.A0P(this, 68), AnonymousClass0RH.class);
    }

    public static void A01(Context context) {
        A00(context).A00.A03("reg_flow_extras_serialize_key");
    }

    public final void A02(C10300i6 r10, RegFlowExtras regFlowExtras) {
        String str;
        regFlowExtras.A00 = System.currentTimeMillis();
        Parcel obtain = Parcel.obtain();
        regFlowExtras.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        RegFlowExtras regFlowExtras2 = (RegFlowExtras) RegFlowExtras.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        String str2 = null;
        regFlowExtras2.A0P = null;
        this.A00.A04("reg_flow_extras_serialize_key", regFlowExtras2);
        C313625r A012 = regFlowExtras2.A01();
        AnonymousClass265 r6 = null;
        try {
            String str3 = regFlowExtras2.A0N;
            if (str3 != null) {
                r6 = AnonymousClass265.valueOf(str3);
            }
        } catch (IllegalArgumentException unused) {
        }
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r10), "reg_flow_extras_cached"), 2613);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        AnonymousClass269.A06(A0I, A003);
        if (A012 != null) {
            str = A012.A00;
        } else {
            str = null;
        }
        C18210wN.A19(A0I, str);
        C63683i7.A08(A0I);
        C18210wN.A17(A0I);
        C63683i7.A09(A0I, r10);
        if (r6 != null) {
            str2 = r6.A01;
        }
        C18190wL.A1I(A0I, str2);
        A0I.Bb4();
    }
}
