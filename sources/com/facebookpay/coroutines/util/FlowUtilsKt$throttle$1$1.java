package com.facebookpay.coroutines.util;

import X.AnonymousClass0MJ;
import X.AnonymousClass0MQ;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C146958n9;
import X.C148838sG;
import X.C18220wO;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import X.C86054wC;
import X.D0E;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1", f = "FlowUtils.kt", i = {0}, l = {23}, m = "invokeSuspend", n = {"currentTime"}, s = {"J$0"})
public final class FlowUtilsKt$throttle$1$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass0MQ A04;
    public final /* synthetic */ AnonymousClass0MJ A05;
    public final /* synthetic */ C86054wC A06;

    @DebugMetadata(c = "com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1$1", f = "FlowUtils.kt", i = {}, l = {29, 30}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int A00;

        public final C146958n9 create(Object obj, C146958n9 r10) {
            long j = currentTimeMillis;
            AnonymousClass0MQ r3 = r9;
            int i = i;
            return new AnonymousClass1(obj2, r10, r3, r10, i, j);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
                int r0 = r7.A00
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L_0x0010
                if (r0 == r4) goto L_0x0027
                X.AnonymousClass0OU.A00(r8)
            L_0x000d:
                kotlin.Unit r6 = kotlin.Unit.A00
                return r6
            L_0x0010:
                X.AnonymousClass0OU.A00(r8)
                long r2 = r12
                X.0MQ r0 = r9
                long r0 = r0.A00
                long r2 = r2 - r0
                int r0 = r11
                long r0 = (long) r0
                long r2 = r2 + r0
                r7.A00 = r4
                java.lang.Object r0 = X.AnonymousClass729.A01(r7, r2)
                if (r0 != r6) goto L_0x002a
                return r6
            L_0x0027:
                X.AnonymousClass0OU.A00(r8)
            L_0x002a:
                X.4wC r1 = r10
                java.lang.Object r0 = r7
                r7.A00 = r5
                java.lang.Object r0 = r1.Cgt(r0, r7)
                if (r0 != r6) goto L_0x000d
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowUtilsKt$throttle$1$1(C146958n9 r2, AnonymousClass0MQ r3, AnonymousClass0MJ r4, C86054wC r5, int i) {
        super(2, r2);
        this.A04 = r3;
        this.A03 = i;
        this.A06 = r5;
        this.A05 = r4;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        AnonymousClass0MQ r2 = this.A04;
        int i = this.A03;
        C146958n9 r1 = r8;
        FlowUtilsKt$throttle$1$1 flowUtilsKt$throttle$1$1 = new FlowUtilsKt$throttle$1$1(r1, r2, this.A05, this.A06, i);
        flowUtilsKt$throttle$1$1.A02 = obj;
        return flowUtilsKt$throttle$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        final long currentTimeMillis;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            currentTimeMillis = this.A01;
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            final Object obj2 = this.A02;
            currentTimeMillis = System.currentTimeMillis();
            final AnonymousClass0MQ r9 = this.A04;
            final int i = this.A03;
            if (currentTimeMillis - r9.A00 > ((long) i)) {
                C86054wC r0 = this.A06;
                this.A01 = currentTimeMillis;
                this.A00 = 1;
                if (r0.Cgt(obj2, this) == d0e) {
                    return d0e;
                }
            } else {
                AnonymousClass0MJ r1 = this.A05;
                C148838sG r02 = (C148838sG) r1.A00;
                if (r02 != null) {
                    r02.AC7((CancellationException) null);
                }
                final C86054wC r10 = this.A06;
                r1.A00 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new AnonymousClass1((C146958n9) null), r10, 3);
                return Unit.A00;
            }
        }
        C148838sG r03 = (C148838sG) this.A05.A00;
        if (r03 != null) {
            r03.AC7((CancellationException) null);
        }
        this.A04.A00 = currentTimeMillis;
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowUtilsKt$throttle$1$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
