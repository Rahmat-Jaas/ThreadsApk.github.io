package X;

/* renamed from: X.5jL  reason: invalid class name */
public final class AnonymousClass5jL extends C113376rI {
    public AnonymousClass5jL() {
        super((C04560Oe) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = X.C18190wL.A0s("{ECPFragmentFactory} Fragment is not found for identifier => ");
        r1.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        throw X.C18190wL.A0a(X.C86104wH.A0x(r4, " with args => ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        r1.setArguments(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0117, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A01(android.os.Bundle r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            int r0 = r5.hashCode()
            java.lang.String r2 = "Required value was null."
            switch(r0) {
                case -2046736275: goto L_0x0021;
                case -1704634412: goto L_0x0030;
                case -1168057020: goto L_0x003f;
                case -1133036289: goto L_0x004e;
                case -291842573: goto L_0x005d;
                case 506456603: goto L_0x006c;
                case 675913388: goto L_0x007b;
                case 781550889: goto L_0x008a;
                case 794693246: goto L_0x00a9;
                case 1056651425: goto L_0x00b7;
                case 1140065739: goto L_0x00c5;
                case 1418003317: goto L_0x00d3;
                case 1504979396: goto L_0x00e1;
                case 1517249061: goto L_0x00f5;
                case 1606386969: goto L_0x0103;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "{ECPFragmentFactory} Fragment is not found for identifier => "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r5)
            java.lang.String r0 = " with args => "
            java.lang.String r0 = X.C86104wH.A0x(r4, r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0021:
            java.lang.String r0 = "see_item_details_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.5j1 r1 = new X.5j1
            r1.<init>()
            goto L_0x0112
        L_0x0030:
            java.lang.String r0 = "content_confirmation_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.5j6 r1 = new X.5j6
            r1.<init>()
            goto L_0x0112
        L_0x003f:
            java.lang.String r0 = "content_nux_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.5j8 r1 = new X.5j8
            r1.<init>()
            goto L_0x0112
        L_0x004e:
            java.lang.String r0 = "web_view_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.562 r1 = new X.562
            r1.<init>()
            goto L_0x0112
        L_0x005d:
            java.lang.String r0 = "loading_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.5j4 r1 = new X.5j4
            r1.<init>()
            goto L_0x0112
        L_0x006c:
            java.lang.String r0 = "ecp_container_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.5j9 r1 = new X.5j9
            r1.<init>()
            goto L_0x0112
        L_0x007b:
            java.lang.String r0 = "terms_condition_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.566 r1 = new X.566
            r1.<init>()
            goto L_0x0112
        L_0x008a:
            java.lang.String r0 = "content_selection_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            if (r4 == 0) goto L_0x0118
            X.5j5 r1 = new X.5j5
            r1.<init>()
            r1.setArguments(r4)
            java.lang.String r0 = "ECP_SELECTION_FRAGMENT_COMPONENT_ID"
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x0115
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        L_0x00a9:
            java.lang.String r0 = "content_bottom_sheet_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.5j7 r1 = new X.5j7
            r1.<init>()
            goto L_0x0112
        L_0x00b7:
            java.lang.String r0 = "paypal_consent_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.563 r1 = new X.563
            r1.<init>()
            goto L_0x0112
        L_0x00c5:
            java.lang.String r0 = "content_nux_learn_more_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.5j0 r1 = new X.5j0
            r1.<init>()
            goto L_0x0112
        L_0x00d3:
            java.lang.String r0 = "content_promo_form_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.5j2 r1 = new X.5j2
            r1.<init>()
            goto L_0x0112
        L_0x00e1:
            r0 = 800(0x320, float:1.121E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            if (r4 == 0) goto L_0x011d
            X.5jB r1 = new X.5jB
            r1.<init>()
            goto L_0x0112
        L_0x00f5:
            java.lang.String r0 = "content_form_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.5j3 r1 = new X.5j3
            r1.<init>()
            goto L_0x0112
        L_0x0103:
            java.lang.String r0 = "blank_bottom_sheet_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            if (r4 == 0) goto L_0x0122
            X.5qq r1 = new X.5qq
            r1.<init>()
        L_0x0112:
            r1.setArguments(r4)
        L_0x0115:
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        L_0x0118:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        L_0x011d:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        L_0x0122:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5jL.A01(android.os.Bundle, java.lang.String):androidx.fragment.app.Fragment");
    }
}
