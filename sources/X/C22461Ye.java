package X;

import android.os.Bundle;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1Ye  reason: invalid class name and case insensitive filesystem */
public abstract class C22461Ye extends C34640IcN {
    public static final String __redex_internal_original_name = "AgeCollectionBaseFragment";
    public RegFlowExtras A00;
    public C07530bf A01;
    public C313625r A02;

    public abstract String getModuleName();

    public final void A02(C63873iU r4, int i, int i2, int i3) {
        H1T A0N = AnonymousClass0wJ.A0N(this.A01);
        A0N.A0J("consent/check_age_eligibility/");
        A0N.A0O("year", Integer.toString(i));
        A0N.A0O("month", Integer.toString(i2));
        A0N.A0O("day", Integer.toString(i3));
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, AnonymousClass1T6.class, AnonymousClass3NU.class);
        A0T.A00 = r4;
        schedule(A0T);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r0.isEmpty() == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0106, code lost:
        if (r0.isEmpty() == false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass265 r6) {
        /*
            r5 = this;
            X.25r r1 = r5.A02
            X.25r r0 = X.C313625r.SAC
            if (r1 != r0) goto L_0x005e
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x004c
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L_0x004c
            com.instagram.registration.model.RegFlowExtras r0 = r5.A00
            boolean r2 = r0.A0s
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            X.0bf r0 = r5.A01
            X.Drz r3 = X.C18180wK.A0Q(r1, r0)
            if (r2 == 0) goto L_0x004d
            X.C63463hW.A01()
            com.instagram.registration.model.RegFlowExtras r1 = r5.A00
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r1)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r2, r0)
            X.1cj r0 = new X.1cj
            r0.<init>()
        L_0x0044:
            r0.setArguments(r2)
            r3.A03 = r0
            r3.A05()
        L_0x004c:
            return
        L_0x004d:
            com.instagram.registration.model.RegFlowExtras r1 = r5.A00
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r1)
            X.1dA r0 = new X.1dA
            r0.<init>()
            goto L_0x0044
        L_0x005e:
            com.instagram.registration.model.RegFlowExtras r1 = r5.A00
            java.util.List r0 = r1.A0e
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007a
        L_0x006a:
            java.util.List r0 = r1.A0f
            if (r0 != 0) goto L_0x0074
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r1.A0f = r0
        L_0x0074:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00bd
        L_0x007a:
            com.instagram.registration.model.RegFlowExtras r0 = r5.A00
            java.util.List r1 = r0.A0f
            if (r1 != 0) goto L_0x0086
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            r0.A0f = r1
        L_0x0086:
            X.0bf r2 = r5.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00bd
            java.util.ArrayList r3 = X.C18200wM.A0t(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r1.next()
            X.38z r0 = (X.C569038z) r0
            java.lang.String r0 = r0.A00
            r3.add(r0)
            goto L_0x0096
        L_0x00a8:
            java.lang.String r1 = "username_suggestion_prototypes_received"
            r0 = 0
            X.3Vg r2 = X.C63313hF.A03(r2, r0, r6, r1)
            java.lang.String r0 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r0, r3)
            java.lang.String r0 = "prototypes"
            r2.A03(r0, r1)
            r2.A01()
        L_0x00bd:
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0bf r0 = r5.A01
            X.Drz r3 = X.C18180wK.A0Q(r1, r0)
            com.instagram.registration.model.RegFlowExtras r4 = r5.A00
            java.lang.String r1 = r4.A0X
            java.lang.String r0 = "kr"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ed
            X.C63463hW.A03()
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r4)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r2, r0)
            X.1b1 r0 = new X.1b1
            r0.<init>()
        L_0x00e9:
            X.C18180wK.A0x(r2, r0, r3)
            return
        L_0x00ed:
            java.util.List r0 = r4.A0e
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0108
        L_0x00f7:
            java.util.List r0 = r4.A0f
            if (r0 != 0) goto L_0x0101
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r4.A0f = r0
        L_0x0101:
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0109
        L_0x0108:
            r1 = 1
        L_0x0109:
            X.C63463hW.A03()
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r4)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            if (r1 == 0) goto L_0x0122
            X.C18190wL.A13(r2, r0)
            X.1ch r0 = new X.1ch
            r0.<init>()
            goto L_0x00e9
        L_0x0122:
            X.C18190wL.A13(r2, r0)
            X.1cl r0 = new X.1cl
            r0.<init>()
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22461Ye.A03(X.265):void");
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void A04(String str, int i, int i2, int i3) {
        AnonymousClass3YV.A00().A02();
        int intValue = AnonymousClass3YV.A00().A01().intValue();
        if (intValue == 1) {
            C25828Dsm A0W = C18190wL.A0W(getRootActivity());
            A0W.A0L(2131821234);
            C18180wK.A1O(A0W, this, 122, 2131831976);
            A0W.A0q(false);
            AnonymousClass0wJ.A1K(A0W);
        } else if (intValue == 2) {
            RegFlowExtras regFlowExtras = this.A00;
            Bundle A06 = C18180wK.A06();
            if (regFlowExtras != null) {
                A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            }
            if (this.A02 == C313625r.SAC && str != null) {
                AnonymousClass0RA.A0C.A09(new AnonymousClass4KG(), (C04850Pk) null, new AnonymousClass4KP(i, i2, i3), str);
            }
            C25786Drz A002 = C63463hW.A00(getActivity(), this.A01);
            C18190wL.A13(A06, "IgSessionManager.LOGGED_OUT_TOKEN");
            C18180wK.A0x(A06, new AnonymousClass1bG(), A002);
        }
    }

    public void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-750012635);
        super.onCreate(bundle);
        AnonymousClass7Ko.A07(this.mArguments, "Arguments must contain Session token and Registration extras");
        this.A01 = AnonymousClass0RA.A0C.A04(this.mArguments);
        RegFlowExtras regFlowExtras = (RegFlowExtras) this.mArguments.getParcelable("RegFlowExtras.EXTRA_KEY");
        this.A00 = regFlowExtras;
        AnonymousClass7Ko.A07(regFlowExtras, "Registration extras cannot be null");
        C313625r A012 = this.A00.A01();
        this.A02 = A012;
        A012.getClass();
        C14030oh.A09(448833657, A022);
    }
}
