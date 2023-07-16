package com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C83554rb;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class DictionaryRepository {
    public final List A00 = AnonymousClass0wJ.A0v();
    public final C83554rb A01;
    public final Set A02 = new LinkedHashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r1 != null) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02(java.util.List r8) {
        /*
            r7 = this;
            r5 = 0
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r6 = r8.iterator()
        L_0x0009:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.String r3 = X.C18180wK.A0k(r6)
            java.util.List r0 = r7.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r0
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x0041
            if (r3 != 0) goto L_0x0019
        L_0x002c:
            if (r1 != 0) goto L_0x0009
        L_0x002e:
            java.util.UUID r0 = X.C03480Iw.A00()
            java.lang.String r2 = X.C18190wL.A0n(r0)
            r1 = 30
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            r0.<init>(r2, r3, r1)
            r4.add(r0)
            goto L_0x0009
        L_0x0041:
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0019
            goto L_0x002c
        L_0x0048:
            java.util.List r0 = r7.A00
            r0.addAll(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository.A02(java.util.List):java.util.List");
    }

    public final void A03(String str) {
        C04220Ms.A0B(str, 0);
        List list = this.A00;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C04220Ms.A0I(((KtCSuperShape0S2000000_I2) it.next()).A00, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        list.remove(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r9) {
        /*
            r8 = this;
            r3 = 40
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape6S0201000_I2_4.A00(r3, r9)
            if (r0 == 0) goto L_0x0087
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape6S0201000_I2_4 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape6S0201000_I2_4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0087
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r7 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r5) goto L_0x008f
            X.AnonymousClass0OU.A00(r1)
        L_0x0025:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x002f
            r7 = 1
        L_0x002a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L_0x002f:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x002a
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0038:
            X.AnonymousClass0OU.A00(r1)
            X.4rb r3 = r8.A01
            if (r3 == 0) goto L_0x002a
            java.util.List r0 = r8.A00
            java.util.HashSet r2 = X.C18200wM.A0u()
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r0
            java.lang.String r0 = r0.A01
            r2.add(r0)
            goto L_0x0049
        L_0x005b:
            java.util.Set r0 = r8.A02
            java.util.Set r1 = X.AnonymousClass4WL.A00(r0, r2)
            java.util.Set r2 = X.AnonymousClass4WL.A00(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0076
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0076
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        L_0x0076:
            java.util.List r1 = X.AnonymousClass00J.A0N(r1)
            java.util.List r0 = X.AnonymousClass00J.A0N(r2)
            r4.A00 = r5
            java.lang.Object r1 = r3.D9R(r1, r0, r4)
            if (r1 != r6) goto L_0x0025
            return r6
        L_0x0087:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape6S0201000_I2_4 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape6S0201000_I2_4
            r4.<init>(r8, r9, r3, r0)
            goto L_0x0016
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository.A00(X.8n9):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C146958n9 r10) {
        /*
            r9 = this;
            r4 = 16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r4, r10)
            if (r0 == 0) goto L_0x008d
            r3 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008d
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r3.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r8 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0079
            if (r0 != r1) goto L_0x00a2
            java.lang.Object r3 = r3.A01
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository r3 = (com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository) r3
            X.AnonymousClass0OU.A00(r4)
        L_0x0029:
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0093
            java.util.Set r1 = r3.A02
            X.1jA r4 = (X.AnonymousClass1jA) r4
            java.lang.Object r2 = r4.A00
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            java.util.List r7 = r3.A00
            r7.clear()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            X.C04220Ms.A08(r1)
            X.C04220Ms.A0B(r2, r8)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            X.AnonymousClass00J.A0h(r2, r0)
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x005a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a7
            java.lang.String r4 = X.C18180wK.A0k(r5)
            int r3 = r8 + 1
            java.lang.String r2 = java.lang.String.valueOf(r8)
            X.C04220Ms.A04(r4)
            r1 = 30
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            r0.<init>(r2, r4, r1)
            r6.add(r0)
            r8 = r3
            goto L_0x005a
        L_0x0079:
            X.AnonymousClass0OU.A00(r4)
            X.4rb r0 = r9.A01
            if (r0 == 0) goto L_0x00ab
            r3.A01 = r9
            r3.A00 = r1
            java.lang.Object r4 = r0.B0D(r3, r1)
            if (r4 != r2) goto L_0x008b
            return r2
        L_0x008b:
            r3 = r9
            goto L_0x0029
        L_0x008d:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r3.<init>(r9, r10, r4)
            goto L_0x0016
        L_0x0093:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x009d
            java.util.List r0 = r3.A00
            r0.clear()
            goto L_0x00ab
        L_0x009d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00a7:
            r7.addAll(r6)
            r8 = 1
        L_0x00ab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository.A01(X.8n9):java.lang.Object");
    }

    public DictionaryRepository(C83554rb r2) {
        this.A01 = r2;
    }
}
