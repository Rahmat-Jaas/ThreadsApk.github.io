package com.instagram.nux.aymh.responsehandlers;

import X.AnonymousClass00U;
import X.AnonymousClass3AQ;
import X.AnonymousClass3I7;
import X.C04220Ms;
import X.C146958n9;
import X.C18180wK;
import X.C18220wO;
import X.C62643aS;
import X.C70414Ej;
import X.C83684ro;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;

public final class HandlerExecutorAndBuilder {
    public AnonymousClass3I7 A00;
    public AnonymousClass3AQ A01;
    public AnonymousClass3AQ A02;
    public AnonymousClass3AQ A03;
    public final Map A04 = C18220wO.A0y();
    public final Map A05 = C18220wO.A0y();
    public final Map A06 = C18220wO.A0y();
    public final C62643aS A07 = new C62643aS(this);

    public final void A03(C83684ro r4) {
        A00(new AnonymousClass3AQ(new C70414Ej(new KtSLambdaShape12S0301000_I2_4(this, r4, (C146958n9) null, 34))), this);
    }

    public final void A04(AnonymousClass3I7 r3, String str) {
        C04220Ms.A0B(r3, 1);
        if (str != null) {
            Map map = this.A05;
            if (map.get(str) == null) {
                map.put(str, r3);
                return;
            }
            throw C18180wK.A0a(AnonymousClass00U.A0V("Action result named '", str, "' already defined"));
        }
    }

    public static final void A00(AnonymousClass3AQ r1, HandlerExecutorAndBuilder handlerExecutorAndBuilder) {
        if (handlerExecutorAndBuilder.A02 == null) {
            handlerExecutorAndBuilder.A02 = r1;
        } else {
            AnonymousClass3AQ r0 = handlerExecutorAndBuilder.A01;
            if (r0 != null) {
                r0.A00 = r1;
            }
        }
        handlerExecutorAndBuilder.A01 = r1;
        handlerExecutorAndBuilder.A03 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C146958n9 r9) {
        /*
            r8 = this;
            r3 = 11
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2.A00(r3, r9)
            if (r0 == 0) goto L_0x0088
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0088
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x007a
            if (r1 != r3) goto L_0x0091
            java.lang.Object r2 = r4.A02
            X.0MJ r2 = (X.AnonymousClass0MJ) r2
            java.lang.Object r6 = r4.A01
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r6 = (com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder) r6
            X.AnonymousClass0OU.A00(r0)
        L_0x002c:
            if (r0 == 0) goto L_0x003b
            java.util.Map r7 = r6.A06
            java.lang.Class r1 = r0.getClass()
            X.0Ai r1 = X.C18210wN.A0l(r1)
            r7.put(r1, r0)
        L_0x003b:
            java.lang.Object r1 = r2.A00
            X.3AQ r1 = (X.AnonymousClass3AQ) r1
            X.3I7 r1 = r1.A01
            if (r1 == 0) goto L_0x0057
            r1.A01 = r3
            r1.A00 = r0
            java.lang.String r7 = r1.A02
            java.util.Map r1 = r6.A05
            java.lang.Object r1 = r1.get(r7)
            X.3I7 r1 = (X.AnonymousClass3I7) r1
            if (r1 == 0) goto L_0x0057
            r1.A01 = r3
            r1.A00 = r0
        L_0x0057:
            java.lang.Object r0 = r2.A00
            X.3AQ r0 = (X.AnonymousClass3AQ) r0
            X.3AQ r0 = r0.A00
            r2.A00 = r0
        L_0x005f:
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r2.A00
            X.3AQ r0 = (X.AnonymousClass3AQ) r0
            X.4Ej r0 = r0.A02
            X.3aS r1 = r6.A07
            r4.A01 = r6
            r4.A02 = r2
            r4.A00 = r3
            X.0YP r0 = r0.A01
            java.lang.Object r0 = r0.invoke(r1, r4)
            if (r0 != r5) goto L_0x002c
            return r5
        L_0x007a:
            X.AnonymousClass0OU.A00(r0)
            X.0MJ r2 = new X.0MJ
            r2.<init>()
            X.3AQ r0 = r8.A02
            r2.A00 = r0
            r6 = r8
            goto L_0x005f
        L_0x0088:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2
            r4.<init>(r8, r9, r3)
            goto L_0x0016
        L_0x008e:
            X.3aS r0 = r6.A07
            return r0
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder.A01(X.8n9):java.lang.Object");
    }

    public final void A02(C83684ro r4) {
        C70414Ej r0 = new C70414Ej(r4.AOi());
        String B7x = r4.B7x();
        r0.A00 = B7x;
        AnonymousClass3AQ r1 = new AnonymousClass3AQ(r0);
        AnonymousClass3I7 r02 = r1.A01;
        if (r02 != null) {
            A04(r02, B7x);
        }
        A00(r1, this);
    }
}
