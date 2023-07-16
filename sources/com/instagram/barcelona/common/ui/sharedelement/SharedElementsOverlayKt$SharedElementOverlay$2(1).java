package com.instagram.barcelona.common.ui.sharedelement;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass7JH;
import X.AnonymousClass7KC;
import X.AnonymousClass7U0;
import X.C04220Ms;
import X.C115596vX;
import X.C142638fL;
import X.C146958n9;
import X.C18220wO;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import X.C83224qz;
import X.C86104wH;
import X.C86124wJ;
import X.C86154wM;
import X.C89915Hn;
import X.D0E;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101001_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0201001_I2;

@DebugMetadata(c = "com.instagram.barcelona.common.ui.sharedelement.SharedElementsOverlayKt$SharedElementOverlay$2", f = "SharedElementsOverlay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SharedElementsOverlayKt$SharedElementOverlay$2 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass7JH A04;
    public final /* synthetic */ AnonymousClass7JH A05;
    public final /* synthetic */ AnonymousClass7JH A06;
    public final /* synthetic */ AnonymousClass7JH A07;
    public final /* synthetic */ C89915Hn A08;
    public final /* synthetic */ C89915Hn A09;
    public final /* synthetic */ C115596vX A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ C83224qz A0C;

    @DebugMetadata(c = "com.instagram.barcelona.common.ui.sharedelement.SharedElementsOverlayKt$SharedElementOverlay$2$1", f = "SharedElementsOverlay.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.barcelona.common.ui.sharedelement.SharedElementsOverlayKt$SharedElementOverlay$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int A00;

        public final C146958n9 create(Object obj, C146958n9 r11) {
            C115596vX r4 = r7;
            C89915Hn r2 = r5;
            String str = str;
            return new AnonymousClass1(r4, r2, r6, r4, str, r11, j);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            long j;
            AnonymousClass7KC r0;
            D0E d0e = D0E.COROUTINE_SUSPENDED;
            if (this.A00 != 0) {
                AnonymousClass0OU.A00(obj);
            } else {
                AnonymousClass0OU.A00(obj);
                C115596vX r1 = r7;
                String str = r5.A07;
                String str2 = str;
                C04220Ms.A0B(str2, 1);
                Iterator A0q = C86154wM.A0q(r1.A02.getValue());
                while (true) {
                    obj2 = null;
                    if (!A0q.hasNext()) {
                        break;
                    }
                    obj2 = A0q.next();
                    C89915Hn r12 = (C89915Hn) obj2;
                    if (C04220Ms.A0I(r12.A07, str) && C04220Ms.A0I(r12.A06, str2)) {
                        break;
                    }
                }
                C89915Hn r4 = (C89915Hn) obj2;
                if (r4 == null || (r0 = r4.A05) == null) {
                    AnonymousClass7JH r42 = r4;
                    j = ((AnonymousClass7KC) ((AnonymousClass7U0) r42.A08).A00.invoke(r42.A04.A02)).A00;
                } else {
                    long j2 = r0.A00;
                    j = C86104wH.A0C(AnonymousClass7KC.A01(j2), AnonymousClass7KC.A02(j2));
                }
                AnonymousClass7JH r6 = r4;
                AnonymousClass7KC A0O = C86124wJ.A0O(j);
                C142638fL r7 = r6.A03;
                AnonymousClass7KC A0O2 = C86124wJ.A0O(j);
                this.A00 = 1;
                if (AnonymousClass7JH.A02(r6, r7, A0O, A0O2, this, (AnonymousClass0YY) null, 8) == d0e) {
                    return d0e;
                }
            }
            return Unit.A00;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedElementsOverlayKt$SharedElementOverlay$2(AnonymousClass7JH r2, AnonymousClass7JH r3, AnonymousClass7JH r4, AnonymousClass7JH r5, C89915Hn r6, C89915Hn r7, C115596vX r8, String str, C146958n9 r10, C83224qz r11, float f, float f2, float f3, long j) {
        super(2, r10);
        this.A0C = r11;
        this.A0A = r8;
        this.A08 = r6;
        this.A0B = str;
        this.A06 = r2;
        this.A03 = j;
        this.A09 = r7;
        this.A07 = r3;
        this.A02 = f;
        this.A05 = r4;
        this.A01 = f2;
        this.A04 = r5;
        this.A00 = f3;
    }

    public final C146958n9 create(Object obj, C146958n9 r18) {
        C83224qz r10 = this.A0C;
        C115596vX r7 = this.A0A;
        C89915Hn r5 = this.A08;
        String str = this.A0B;
        AnonymousClass7JH r1 = this.A06;
        long j = this.A03;
        C89915Hn r6 = this.A09;
        AnonymousClass7JH r2 = this.A07;
        float f = this.A02;
        return new SharedElementsOverlayKt$SharedElementOverlay$2(r1, r2, this.A05, this.A04, r5, r6, r7, str, r18, r10, f, this.A01, this.A00, j);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SharedElementsOverlayKt$SharedElementOverlay$2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        C83224qz r2 = this.A0C;
        final C115596vX r7 = this.A0A;
        final C89915Hn r5 = this.A08;
        final String str = this.A0B;
        final AnonymousClass7JH r4 = this.A06;
        final long j = this.A03;
        final C89915Hn r6 = this.A09;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new AnonymousClass1((C146958n9) null), r2, 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0201001_I2(this.A07, r6, (C146958n9) null, this.A02, 1), r2, 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0101001_I2(this.A05, (C146958n9) null, this.A01, 4), r2, 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0101001_I2(this.A04, (C146958n9) null, this.A00, 5), r2, 3);
        return Unit.A00;
    }
}
