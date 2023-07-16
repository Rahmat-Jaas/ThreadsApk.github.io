package X;

import android.widget.TextView;

/* renamed from: X.4MV  reason: invalid class name */
public final class AnonymousClass4MV implements C83874s8 {
    public final /* synthetic */ AnonymousClass1x2 A00;

    public final void registerTextViewLogging(TextView textView) {
        C04220Ms.A0B(textView, 0);
        textView.addTextChangedListener(C64543mW.A00(AnonymousClass0wJ.A0U(this.A00.A0L)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c5, code lost:
        if (r6 != 0) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b A[EDGE_INSN: B:61:0x008b->B:30:0x008b ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x002a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void searchTextChanged(java.lang.String r11) {
        /*
            r10 = this;
            r5 = 0
            X.C04220Ms.A0B(r11, r5)
            X.1x2 r4 = r10.A00
            r4.A09 = r11
            int r0 = r11.length()
            if (r0 != 0) goto L_0x0012
            X.AnonymousClass1x2.A0D(r4)
            return
        L_0x0012:
            java.util.HashSet r3 = X.C18200wM.A0u()
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            X.3Br r1 = r4.A08
            if (r1 == 0) goto L_0x0024
            r0 = 1
            r1.A03 = r0
            r2.add(r5, r1)
        L_0x0024:
            java.util.List r0 = r4.A0H
            java.util.Iterator r9 = r0.iterator()
        L_0x002a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r1 = r9.next()
            boolean r5 = r1 instanceof X.AnonymousClass4MA
            if (r5 == 0) goto L_0x00a0
            r0 = r1
            X.4MA r0 = (X.AnonymousClass4MA) r0
            int r6 = r0.A02
            if (r6 != 0) goto L_0x00c7
            java.lang.CharSequence r0 = r0.A05
        L_0x0041:
            if (r0 == 0) goto L_0x00d1
            java.lang.String r7 = java.lang.String.valueOf(r0)
        L_0x0047:
            java.lang.String r0 = java.util.regex.Pattern.quote(r11)
            r8 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r8)
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r0 = r0.find()
            if (r0 != 0) goto L_0x008b
            boolean r0 = r1 instanceof X.C62133Xg
            if (r0 == 0) goto L_0x0098
            r0 = r1
            X.3Xg r0 = (X.C62133Xg) r0
            java.util.List r0 = r0.A06
        L_0x0063:
            if (r0 == 0) goto L_0x002a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x002a
            java.util.Iterator r6 = r0.iterator()
        L_0x006f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.String r5 = X.C18180wK.A0k(r6)
            java.lang.String r0 = java.util.regex.Pattern.quote(r11)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r8)
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x006f
        L_0x008b:
            boolean r0 = r3.contains(r7)
            if (r0 != 0) goto L_0x002a
            r2.add(r1)
            r3.add(r7)
            goto L_0x002a
        L_0x0098:
            if (r5 == 0) goto L_0x002a
            r0 = r1
            X.4MA r0 = (X.AnonymousClass4MA) r0
            java.util.List r0 = r0.A06
            goto L_0x0063
        L_0x00a0:
            boolean r0 = r1 instanceof X.C62133Xg
            if (r0 == 0) goto L_0x00ae
            r0 = r1
            X.3Xg r0 = (X.C62133Xg) r0
            int r6 = r0.A01
            if (r6 != 0) goto L_0x00c7
            java.lang.CharSequence r0 = r0.A05
            goto L_0x0041
        L_0x00ae:
            boolean r0 = r1 instanceof X.C62153Xk
            if (r0 == 0) goto L_0x00bc
            r0 = r1
            X.3Xk r0 = (X.C62153Xk) r0
            int r6 = r0.A01
            if (r6 != 0) goto L_0x00c7
            java.lang.CharSequence r0 = r0.A05
            goto L_0x0041
        L_0x00bc:
            boolean r0 = r1 instanceof X.AnonymousClass4MC
            if (r0 == 0) goto L_0x00d1
            r0 = r1
            X.4MC r0 = (X.AnonymousClass4MC) r0
            int r6 = r0.A04
            if (r6 == 0) goto L_0x00d1
        L_0x00c7:
            android.content.res.Resources r0 = X.AnonymousClass0wJ.A0B(r4)
            java.lang.String r7 = X.C18190wL.A0g(r0, r6)
            goto L_0x0047
        L_0x00d1:
            java.lang.String r7 = ""
            goto L_0x0047
        L_0x00d5:
            r4.setItems(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MV.searchTextChanged(java.lang.String):void");
    }

    public AnonymousClass4MV(AnonymousClass1x2 r1) {
        this.A00 = r1;
    }
}
