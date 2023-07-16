package com.instagram.compose.ui.bouncy;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass774;
import X.AnonymousClass7JH;
import X.AnonymousClass7U0;
import X.C1203479u;
import X.C122777Tu;
import X.C146958n9;
import X.C147368pE;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18240wQ;
import X.C39142Kno;
import X.C81784oM;
import X.C86104wH;
import X.C86124wJ;
import X.C86154wM;
import X.D0E;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.compose.ui.bouncy.BouncyClickableState$updateAnimation$1", f = "BouncyClickable.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
public final class BouncyClickableState$updateAnimation$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ AnonymousClass774 A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BouncyClickableState$updateAnimation$1(AnonymousClass774 r2, C146958n9 r3, float f, boolean z) {
        super(2, r3);
        this.A02 = r2;
        this.A01 = f;
        this.A03 = z;
    }

    public final C146958n9 create(Object obj, C146958n9 r6) {
        return new BouncyClickableState$updateAnimation$1(this.A02, r6, this.A01, this.A03);
    }

    public final Object invokeSuspend(Object obj) {
        C1203479u r8;
        C1203479u r7;
        C81784oM r0;
        float f;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            AnonymousClass774 r6 = this.A02;
            AnonymousClass7JH r11 = r6.A03;
            Object value = r6.A07.getValue();
            Object obj2 = r11.A03;
            if (value == null || (r8 = AnonymousClass7U0.A00(r11.A08, value)) == null) {
                r8 = r11.A05;
            }
            if (obj2 == null || (r7 = AnonymousClass7U0.A00(r11.A08, obj2)) == null) {
                r7 = r11.A06;
            }
            int A022 = r8.A02();
            int i = 0;
            while (i < A022) {
                if (r8.A01(i) <= r7.A01(i)) {
                    i++;
                } else {
                    StringBuilder A0s = C18190wL.A0s("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: ");
                    A0s.append(r8);
                    A0s.append(" is greater than upper bound ");
                    A0s.append(r7);
                    throw C18180wK.A0a(C86104wH.A10(" on index ", A0s, i));
                }
            }
            r11.A00 = r8;
            r11.A01 = r7;
            r11.A03 = obj2;
            r11.A02 = value;
            if (!C86104wH.A1X(r11.A09)) {
                C147368pE r2 = r11.A04.A05;
                Object A032 = AnonymousClass7JH.A03(r11, r2.getValue());
                if (!C86124wJ.A1Y(r2, A032)) {
                    r2.CrC(A032);
                }
            }
            Float A0W = C86154wM.A0W(this.A01);
            boolean z = this.A03;
            if (z) {
                r0 = r6.A08;
            } else {
                r0 = r6.A09;
            }
            C122777Tu r12 = new C122777Tu((Object) null, 0.5f, C18240wQ.A00(r0.getValue()));
            if (z || r6.A02) {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                f = C18240wQ.A00(r6.A05.getValue());
            }
            Float A0W2 = C86154wM.A0W(f);
            this.A00 = 1;
            if (AnonymousClass7JH.A02(r11, r12, A0W, A0W2, this, (AnonymousClass0YY) null, 8) == d0e) {
                return d0e;
            }
        }
        AnonymousClass774 r1 = this.A02;
        if (r1.A00) {
            r1.A00 = false;
            AnonymousClass774.A00(r1);
            C18240wQ.A1G(r1.A06.getValue());
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BouncyClickableState$updateAnimation$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
