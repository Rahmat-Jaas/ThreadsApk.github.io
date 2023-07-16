package com.facebook.redex;

import X.AnonymousClass0hA;
import X.AnonymousClass1fL;
import X.C23371df;
import X.C33686HsX;
import X.C83874s8;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;

public class IDxTListenerShape545S0100000_1_I2 implements C33686HsX {
    public Object A00;
    public final int A01;

    public IDxTListenerShape545S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        SearchEditText searchEditText2;
        switch (this.A01) {
            case 0:
                C23371df r2 = (C23371df) this.A00;
                AnonymousClass1fL r1 = r2.A01;
                r1.A02.clear();
                AnonymousClass1fL.A00(r1);
                r2.A04 = str;
                r2.A0L(str);
                searchEditText2 = r2.A03;
                break;
            case 4:
                TypeaheadHeader typeaheadHeader = (TypeaheadHeader) this.A00;
                C83874s8 r12 = typeaheadHeader.A01;
                if (r12 != null) {
                    r12.searchTextChanged(AnonymousClass0hA.A02(str));
                }
                searchEditText2 = typeaheadHeader.A00;
                break;
            default:
                return;
        }
        searchEditText2.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r6 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (r2.length() == 0) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSearchTextChanged(com.instagram.ui.widget.searchedittext.SearchEditText r12, java.lang.CharSequence r13, int r14, int r15, int r16) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x001d;
                case 2: goto L_0x0029;
                case 3: goto L_0x00ba;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            com.instagram.ui.widget.typeahead.TypeaheadHeader r0 = (com.instagram.ui.widget.typeahead.TypeaheadHeader) r0
            X.4s8 r1 = r0.A01
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r12)
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = X.AnonymousClass0hA.A02(r0)
            r1.searchTextChanged(r0)
        L_0x001c:
            return
        L_0x001d:
            r0 = 1
            X.C04220Ms.A0B(r13, r0)
            java.lang.Object r0 = r11.A00
            X.1Zd r0 = (X.C22711Zd) r0
            X.0Oa r0 = r0.A02
            goto L_0x00c4
        L_0x0029:
            r0 = 1
            X.C04220Ms.A0B(r13, r0)
            java.lang.Object r0 = r11.A00
            X.1Ze r0 = (X.C22721Ze) r0
            X.0Oa r0 = r0.A01
            java.lang.Object r7 = r0.getValue()
            X.0zV r7 = (X.C19220zV) r7
            java.lang.String r2 = X.AnonymousClass0hA.A02(r13)
            if (r2 == 0) goto L_0x0046
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0047
        L_0x0046:
            r0 = 1
        L_0x0047:
            java.lang.String r1 = "languages"
            if (r0 == 0) goto L_0x0054
            java.util.List r6 = r7.A00
            if (r6 != 0) goto L_0x00af
        L_0x004f:
            X.C04220Ms.A0E(r1)
            r0 = 0
            throw r0
        L_0x0054:
            java.util.Locale r8 = r7.A02
            java.lang.String r5 = X.C18190wL.A0r(r8, r2)
            java.util.List r0 = r7.A00
            if (r0 == 0) goto L_0x004f
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r10 = r0.iterator()
        L_0x0066:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r4 = r10.next()
            r0 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r0
            java.lang.Object r2 = r0.A00
            X.19W r2 = (X.AnonymousClass19W) r2
            android.app.Application r1 = r7.A00
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
            X.C04220Ms.A0C(r1, r0)
            java.lang.String r0 = r2.A02
            java.lang.String r9 = X.C18190wL.A0r(r8, r0)
            int r0 = r2.A01
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r1, r0)
            java.lang.String r3 = X.C18190wL.A0r(r8, r0)
            int r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r1, r0)
            java.lang.String r2 = X.C18190wL.A0r(r8, r0)
            r1 = 0
            boolean r0 = X.AnonymousClass8bP.A0j(r9, r5, r1)
            if (r0 != 0) goto L_0x00ab
            boolean r0 = X.AnonymousClass8bP.A0j(r3, r5, r1)
            if (r0 != 0) goto L_0x00ab
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r5, r1)
            if (r0 == 0) goto L_0x0066
        L_0x00ab:
            r6.add(r4)
            goto L_0x0066
        L_0x00af:
            X.4wE r1 = r7.A05
            X.19T r0 = new X.19T
            r0.<init>(r6)
            r1.CrC(r0)
            return
        L_0x00ba:
            r0 = 1
            X.C04220Ms.A0B(r13, r0)
            java.lang.Object r0 = r11.A00
            X.1XW r0 = (X.AnonymousClass1XW) r0
            X.0Oa r0 = r0.A00
        L_0x00c4:
            java.lang.Object r0 = r0.getValue()
            X.0zY r0 = (X.C19250zY) r0
            java.lang.String r1 = X.AnonymousClass0hA.A02(r13)
            X.4wE r0 = r0.A05
            r0.CrC(r1)
            return
        L_0x00d4:
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r12)
            java.lang.String r3 = r0.trim()
            java.lang.Object r2 = r11.A00
            X.1df r2 = (X.C23371df) r2
            X.1fL r1 = r2.A01
            java.util.List r0 = r1.A02
            r0.clear()
            X.AnonymousClass1fL.A00(r1)
            r2.A04 = r3
            r2.A0L(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxTListenerShape545S0100000_1_I2.onSearchTextChanged(com.instagram.ui.widget.searchedittext.SearchEditText, java.lang.CharSequence, int, int, int):void");
    }
}
