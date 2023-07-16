package com.instagram.mainfeed.network.prefetch;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.BKH;
import X.C04220Ms;
import X.C146958n9;
import X.C25643DpN;
import X.C25650DpW;
import X.C63803iN;
import android.content.Context;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class StoryBackgroundMediaPrefetchHelper {
    public final int A00;
    public final UserSession A01;
    public final Context A02;
    public final C25650DpW A03;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb A[PHI: r1 
      PHI: (r1v1 java.lang.Object) = (r1v5 java.lang.Object), (r1v0 java.lang.Object) binds: [B:17:0x0042, B:34:0x00b8] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.mainfeed.network.prefetch.StoryBackgroundMediaPrefetchHelper r11, java.util.List r12, java.util.List r13, X.C146958n9 r14) {
        /*
            r4 = 49
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r4, r14)
            if (r0 == 0) goto L_0x002d
            r3 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r2 = 3
            r6 = 2
            r5 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0033
            if (r0 == r5) goto L_0x00b8
            if (r0 == r6) goto L_0x0097
            if (r0 == r2) goto L_0x00b8
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x002d:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r3.<init>(r11, r14, r4)
            goto L_0x0016
        L_0x0033:
            X.AnonymousClass0OU.A00(r1)
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0045
            r3.A00 = r5
        L_0x003e:
            java.lang.Object r1 = r11.A01(r13, r3)
            if (r1 != r4) goto L_0x00bb
            return r4
        L_0x0045:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0w(r12)
            java.util.Iterator r1 = r12.iterator()
        L_0x004d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r1.next()
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r0.getId()
        L_0x005f:
            r5.add(r0)
            goto L_0x004d
        L_0x0063:
            r0 = r9
            goto L_0x005f
        L_0x0065:
            java.util.List r0 = X.AnonymousClass00J.A0K(r5)
            java.util.Set r10 = X.AnonymousClass00J.A0c(r0)
            r3.A01 = r11
            r3.A02 = r13
            r3.A00 = r6
            X.EnC r1 = X.C18220wO.A11(r3)
            java.util.LinkedHashSet r0 = X.C86134wK.A0u()
            X.64h r6 = new X.64h
            r6.<init>(r0, r10, r1)
            com.instagram.service.session.UserSession r7 = r11.A01
            r0 = 1052(0x41c, float:1.474E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            X.Dqq r5 = new X.Dqq
            r5.<init>(r6, r7, r8, r9, r10)
            r5.A03()
            java.lang.Object r1 = r1.A0B()
            if (r1 != r4) goto L_0x00a2
            return r4
        L_0x0097:
            java.lang.Object r13 = r3.A02
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r11 = r3.A01
            com.instagram.mainfeed.network.prefetch.StoryBackgroundMediaPrefetchHelper r11 = (com.instagram.mainfeed.network.prefetch.StoryBackgroundMediaPrefetchHelper) r11
            X.AnonymousClass0OU.A00(r1)
        L_0x00a2:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00bc
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            java.util.Collection r0 = (java.util.Collection) r0
            r13.addAll(r0)
            r3.A01 = r9
            r3.A02 = r9
            r3.A00 = r2
            goto L_0x003e
        L_0x00b8:
            X.AnonymousClass0OU.A00(r1)
        L_0x00bb:
            return r1
        L_0x00bc:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00c6
            X.LCR r4 = new X.LCR
            r4.<init>()
            return r4
        L_0x00c6:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.prefetch.StoryBackgroundMediaPrefetchHelper.A00(com.instagram.mainfeed.network.prefetch.StoryBackgroundMediaPrefetchHelper, java.util.List, java.util.List, X.8n9):java.lang.Object");
    }

    public StoryBackgroundMediaPrefetchHelper(Context context, UserSession userSession) {
        int i;
        this.A02 = context;
        this.A01 = userSession;
        this.A03 = new C25650DpW(context, userSession, AnonymousClass000.A00(1052));
        if (!C25643DpN.A00(userSession).A01("stories")) {
            i = C63803iN.A01(AnonymousClass0TJ.A05, userSession, 36600457166065133L);
        } else {
            i = 5;
        }
        this.A00 = i;
    }

    private final Object A01(List list, C146958n9 r7) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<BKH> A0P = ((Reel) it.next()).A0P(this.A01);
            C04220Ms.A06(A0P);
            ArrayList A0w = AnonymousClass0wJ.A0w(A0P);
            for (BKH bkh : A0P) {
                A0w.add(bkh.A0M);
            }
            A0v.addAll(AnonymousClass00J.A0K(A0w));
        }
        return this.A03.A02(AnonymousClass006.A00, A0v, r7, false);
    }
}
