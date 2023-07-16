package com.instagram.nux.aymh.viewmodel;

import X.AnonymousClass0YP;
import X.C07530bf;
import X.C146958n9;
import X.C18220wO;
import X.C209216q;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2", f = "AymhViewModel.kt", i = {}, l = {268, 280, 280}, m = "invokeSuspend", n = {}, s = {})
public final class AymhViewModel$login$2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C209216q A03;
    public final /* synthetic */ AymhViewModel A04;
    public final /* synthetic */ C07530bf A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AymhViewModel$login$2(C209216q r2, AymhViewModel aymhViewModel, C07530bf r4, Integer num, C146958n9 r6, int i, boolean z) {
        super(2, r6);
        this.A04 = aymhViewModel;
        this.A03 = r2;
        this.A05 = r4;
        this.A07 = z;
        this.A06 = num;
        this.A02 = i;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        AymhViewModel aymhViewModel = this.A04;
        return new AymhViewModel$login$2(this.A03, aymhViewModel, this.A05, this.A06, r10, this.A02, this.A07);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r6 = r15
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r3 = r14.A00
            r2 = 3
            r1 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0014
            if (r3 == r5) goto L_0x0040
            if (r3 == r1) goto L_0x0065
            X.AnonymousClass0OU.A00(r15)
        L_0x0011:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0014:
            X.AnonymousClass0OU.A00(r15)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r3 = r14.A04
            X.3Tz r4 = r3.A03
            X.16q r3 = r14.A03
            X.4qD r8 = r4.A00(r3)
            java.lang.Object r10 = r3.A02
            X.0bf r9 = r14.A05
            r13 = 0
            r14.A00 = r5
            android.content.Context r3 = X.C10600ic.A00
            java.lang.String r11 = X.C09140ev.A00(r3)
            X.C04220Ms.A06(r11)
            X.0ev r4 = X.C09140ev.A02
            android.content.Context r3 = X.C10600ic.A00
            java.lang.String r12 = r4.A05(r3)
            java.lang.Object r6 = r8.BeO(r9, r10, r11, r12, r13, r14)
            if (r6 != r0) goto L_0x0043
            return r0
        L_0x0040:
            X.AnonymousClass0OU.A00(r15)
        L_0x0043:
            X.3b6 r6 = (X.C62903b6) r6
            com.instagram.nux.aymh.viewmodel.AymhViewModel r4 = r14.A04
            X.16q r7 = r14.A03
            X.0bf r8 = r14.A05
            r12 = 0
            boolean r13 = r14.A07
            java.lang.Integer r9 = r14.A06
            int r10 = r14.A02
            r11 = 3584(0xe00, float:5.022E-42)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C36502Ro.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            X.4wD r4 = r4.A0B
            r14.A01 = r4
            r14.A00 = r1
            java.lang.Object r6 = r3.A01(r14)
            if (r6 != r0) goto L_0x006c
            return r0
        L_0x0065:
            java.lang.Object r4 = r14.A01
            X.8m8 r4 = (X.C146368m8) r4
            X.AnonymousClass0OU.A00(r15)
        L_0x006c:
            X.3aS r6 = (X.C62643aS) r6
            java.lang.Object r3 = r6.A03()
            r1 = 0
            r14.A01 = r1
            r14.A00 = r2
            java.lang.Object r1 = r4.Cgt(r3, r14)
            if (r1 != r0) goto L_0x0011
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AymhViewModel$login$2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
