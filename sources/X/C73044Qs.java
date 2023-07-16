package X;

/* renamed from: X.4Qs  reason: invalid class name and case insensitive filesystem */
public final class C73044Qs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C23221cn A01;

    public C73044Qs(C23221cn r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b9, code lost:
        if (r0 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            X.1cn r4 = r6.A01
            int r3 = r6.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r4.A08
            if (r0 == 0) goto L_0x0030
            if (r3 == 0) goto L_0x0113
            r0 = 1
            java.lang.String r2 = "bind_initial_content_start"
            if (r3 == r0) goto L_0x010b
            r0 = 2
            java.lang.String r1 = "bind_initial_content_end"
            if (r3 == r0) goto L_0x0103
            r0 = 4
            if (r3 == r0) goto L_0x0101
            r0 = 5
            if (r3 == r0) goto L_0x0076
            r0 = 6
            if (r3 == r0) goto L_0x0031
            r0 = 7
            if (r3 != r0) goto L_0x0030
            X.4tg r0 = r4.A04
            if (r0 == 0) goto L_0x0027
            r0.Bex(r1)
        L_0x0027:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r4.A08
            com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback r0 = r0.A06
            if (r0 == 0) goto L_0x0030
            r0.A01()
        L_0x0030:
            return
        L_0x0031:
            X.4tg r0 = r4.A04
            if (r0 == 0) goto L_0x0038
            r0.Bex(r2)
        L_0x0038:
            android.widget.FrameLayout r0 = r4.A01
            if (r0 == 0) goto L_0x0030
            r2 = 0
            r0.setVisibility(r2)
            X.LLF r1 = r4.A05
            if (r1 == 0) goto L_0x004b
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x004b
            r1.setVisibility(r2)
        L_0x004b:
            r1 = 8
            X.Ayd r0 = r4.A0B
            if (r0 != 0) goto L_0x0072
            java.lang.String r1 = "component_missing"
            X.4tg r0 = r4.A04
            if (r0 == 0) goto L_0x005a
            r0.Bex(r1)
        L_0x005a:
            android.widget.FrameLayout r1 = r4.A01
            if (r1 == 0) goto L_0x0068
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x0068
            r1.removeView(r0)
            r0 = 0
            r4.A00 = r0
        L_0x0068:
            r4.A0F = r2
            X.DrH r0 = r4.A0D
            if (r0 == 0) goto L_0x0030
            r0.A0D()
            return
        L_0x0072:
            X.C18180wK.A1L(r0, r1)
            goto L_0x005a
        L_0x0076:
            X.3bW r0 = r4.A02
            r0.getClass()
            java.lang.Throwable r1 = r0.A05()
            if (r1 != 0) goto L_0x0088
            java.lang.String r0 = "Bloks Request Error"
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
        L_0x0088:
            X.3XX r5 = new X.3XX
            r5.<init>((java.lang.Throwable) r1)
            X.3yQ r0 = r4.A03
            if (r0 == 0) goto L_0x009a
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "AsyncScreen"
            X.AnonymousClass2JX.A00(r5, r0, r1)
        L_0x009a:
            android.widget.FrameLayout r1 = r4.A01
            if (r1 == 0) goto L_0x00a8
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x00a8
            r1.removeView(r0)
            r0 = 0
            r4.A00 = r0
        L_0x00a8:
            r3 = 0
            r4.A0F = r3
            java.lang.Throwable r1 = r5.A01
            if (r1 == 0) goto L_0x00e7
            boolean r0 = r1 instanceof X.C29721zB
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = "[Parsing error] "
            java.lang.String r0 = X.C18230wP.A0t(r0, r1)
        L_0x00b9:
            if (r0 == 0) goto L_0x00e7
        L_0x00bb:
            X.Ayd r0 = r4.A0B
            android.view.View r0 = r0.A08()
            r0.setVisibility(r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r4.A08
            com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback r0 = r0.A06
            if (r0 == 0) goto L_0x0030
            r0.A02(r5)
            return
        L_0x00ce:
            boolean r0 = r1 instanceof X.AnonymousClass665
            if (r0 == 0) goto L_0x00bb
            X.665 r1 = (X.AnonymousClass665) r1
            int r2 = r1.A00
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L_0x00bb
            r0 = 400(0x190, float:5.6E-43)
            if (r0 <= r2) goto L_0x00bb
            java.lang.String r1 = "[Response status "
            java.lang.String r0 = " ] Please post in Bloks Users with repro steps"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r2)
            goto L_0x00b9
        L_0x00e7:
            java.lang.Object r0 = r5.A00
            X.8mT r0 = (X.C146578mT) r0
            if (r0 == 0) goto L_0x00bb
            int r2 = r0.getStatusCode()
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L_0x00bb
            r0 = 400(0x190, float:5.6E-43)
            if (r0 <= r2) goto L_0x00bb
            java.lang.String r1 = "[Response status "
            java.lang.String r0 = " ] Please post in Bloks Users with repro steps"
            X.AnonymousClass00U.A0S(r1, r0, r2)
            goto L_0x00bb
        L_0x0101:
            java.lang.String r1 = "receive_additional"
        L_0x0103:
            X.4tg r0 = r4.A04
            if (r0 == 0) goto L_0x0030
            r0.Bex(r1)
            return
        L_0x010b:
            X.4tg r0 = r4.A04
            if (r0 == 0) goto L_0x0030
            r0.Bex(r2)
            return
        L_0x0113:
            java.lang.String r1 = "request_start"
            X.4tg r0 = r4.A04
            if (r0 == 0) goto L_0x011c
            r0.Bex(r1)
        L_0x011c:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r4.A08
            com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback r1 = r0.A06
            if (r1 == 0) goto L_0x0134
            boolean r0 = r1 instanceof com.instagram.wellbeing.ixttriggers.controller.IxtTriggerController$createCallback$1
            if (r0 == 0) goto L_0x0134
            com.instagram.wellbeing.ixttriggers.controller.IxtTriggerController$createCallback$1 r1 = (com.instagram.wellbeing.ixttriggers.controller.IxtTriggerController$createCallback$1) r1
            X.3ad r1 = r1.A00
            X.Lcc r0 = X.C40322Lcc.FETCHING_START
            X.C62743ad.A00(r0, r1)
            X.3If r0 = r1.A08
            r0.A02()
        L_0x0134:
            android.widget.FrameLayout r0 = r4.A01
            if (r0 == 0) goto L_0x0030
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0030
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x0030
            r0 = 1
            r4.A0F = r0
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r4.A08
            if (r0 == 0) goto L_0x0167
            java.lang.Integer r0 = r0.A0M
            if (r0 == 0) goto L_0x0167
            android.view.LayoutInflater r2 = X.C18230wP.A0F(r4)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r4.A08
            java.lang.Integer r0 = r0.A0M
            int r1 = r0.intValue()
            android.widget.FrameLayout r0 = r4.A01
            android.view.View r1 = X.AnonymousClass0wJ.A0H(r2, r0, r1)
            r4.A00 = r1
            android.widget.FrameLayout r0 = r4.A01
            r0.addView(r1)
            return
        L_0x0167:
            android.content.Context r0 = r4.getContext()
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = new com.instagram.ui.widget.spinner.SpinnerImageView
            r1.<init>(r0)
            r0 = 2131233917(0x7f080c7d, float:1.8083985E38)
            r1.setImageResource(r0)
            r4.A00 = r1
            r3 = -2
            android.content.Context r1 = r4.requireContext()
            r0 = 200(0xc8, float:2.8E-43)
            int r0 = X.C18240wQ.A01(r1, r0)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r3, r0)
            r0 = 17
            r2.gravity = r0
            android.widget.FrameLayout r1 = r4.A01
            android.view.View r0 = r4.A00
            r1.addView(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73044Qs.run():void");
    }
}
