package X;

import android.content.Context;

/* renamed from: X.5jN  reason: invalid class name */
public class AnonymousClass5jN extends C113376rI {
    public final Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        throw X.C18190wL.A0a(X.AnonymousClass00U.A0L("BSCFragmentFactory does not support ", r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
        r2.putSerializable("viewmodel_class", java.lang.Integer.valueOf(r0));
        r0 = new X.C92345i9();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015c, code lost:
        r2.putSerializable("viewmodel_class", java.lang.Integer.valueOf(r3));
        r0 = new X.AnonymousClass56B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0168, code lost:
        r0.setArguments(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.fragment.app.Fragment A01(android.os.Bundle r12, java.lang.String r13) {
        /*
            r11 = this;
            r3 = 0
            X.C04220Ms.A0B(r13, r3)
            int r0 = r13.hashCode()
            java.lang.String r1 = "viewmodel_class"
            switch(r0) {
                case -1868875270: goto L_0x0018;
                case -1532810832: goto L_0x0029;
                case -1260171540: goto L_0x003b;
                case -1222594761: goto L_0x00a5;
                case -992545463: goto L_0x00b5;
                case -966253274: goto L_0x00c6;
                case -895051645: goto L_0x00d6;
                case 48250454: goto L_0x00e5;
                case 1148185282: goto L_0x00f4;
                case 1392861541: goto L_0x0103;
                case 1423175472: goto L_0x0113;
                case 1536698909: goto L_0x012e;
                case 1572489632: goto L_0x013e;
                case 1927794982: goto L_0x014e;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "BSCFragmentFactory does not support "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r13)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0018:
            java.lang.String r0 = "transactions_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 8
            goto L_0x015c
        L_0x0029:
            java.lang.String r0 = "home_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.56A r0 = new X.56A
            r0.<init>()
            r0.setArguments(r12)
            goto L_0x016b
        L_0x003b:
            java.lang.String r0 = "settings_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            boolean r0 = X.AnonymousClass7Kz.A0V()
            if (r0 == 0) goto L_0x015c
            android.content.Context r5 = r11.A00
            r4 = 1
            X.8mp r0 = X.AnonymousClass7Kz.A04()
            X.C04220Ms.A0B(r0, r3)
            com.instagram.service.session.UserSession r0 = X.C18230wP.A0Z()
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = X.C18190wL.A0N(r0)
            java.lang.String r0 = "logging_data"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = r0.A00
        L_0x006c:
            java.lang.String r0 = "page_id"
            java.lang.String r2 = r2.getString(r0)
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()
            r0 = 2
            java.util.BitSet r7 = new java.util.BitSet
            r7.<init>(r0)
            java.lang.String r0 = "upl_session_id"
            r10.put(r0, r1)
            r7.set(r4)
            java.lang.String r1 = "bpa_home"
            java.lang.String r0 = "referrer"
            r10.put(r0, r1)
            r7.set(r3)
            java.lang.String r0 = "payee_id"
            r10.put(r0, r2)
            androidx.fragment.app.Fragment r0 = X.AnonymousClass2LH.A00(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x00a0:
            java.lang.String r1 = X.C122037Js.A00()
            goto L_0x006c
        L_0x00a5:
            java.lang.String r0 = "filter_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r0 = 9
            goto L_0x0121
        L_0x00b5:
            java.lang.String r0 = "app_dialog_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 13
            goto L_0x015c
        L_0x00c6:
            java.lang.String r0 = "earnings_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 2
            goto L_0x015c
        L_0x00d6:
            java.lang.String r0 = "earnings_details_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 7
            goto L_0x015c
        L_0x00e5:
            java.lang.String r0 = "overview_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 5
            goto L_0x015c
        L_0x00f4:
            java.lang.String r0 = "payouts_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 1
            goto L_0x015c
        L_0x0103:
            java.lang.String r0 = "info_tip_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 12
            goto L_0x015c
        L_0x0113:
            java.lang.String r0 = "fe_selector_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r0 = 6
        L_0x0121:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.putSerializable(r1, r0)
            X.5i9 r0 = new X.5i9
            r0.<init>()
            goto L_0x0168
        L_0x012e:
            java.lang.String r0 = "payout_details_v2_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 11
            goto L_0x015c
        L_0x013e:
            java.lang.String r0 = "earnings_details_v2_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 10
            goto L_0x015c
        L_0x014e:
            java.lang.String r0 = "payout_details_fragment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            r3 = 4
        L_0x015c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.putSerializable(r1, r0)
            X.56B r0 = new X.56B
            r0.<init>()
        L_0x0168:
            r0.setArguments(r2)
        L_0x016b:
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5jN.A01(android.os.Bundle, java.lang.String):androidx.fragment.app.Fragment");
    }

    public AnonymousClass5jN(Context context, C04560Oe r2) {
        super(r2);
        this.A00 = context;
    }
}
