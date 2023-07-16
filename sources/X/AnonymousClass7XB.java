package X;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7XB  reason: invalid class name */
public final class AnonymousClass7XB implements C147848q1, C147558pX {
    public C147748pq A00;
    public final AnonymousClass7XA A01;

    public AnonymousClass7XB() {
        this((AnonymousClass7XA) null, (DefaultConstructorMarker) null, 1);
    }

    public final void A00(C146678mg r10, C147748pq r11, AnonymousClass54T r12, long j) {
        C04220Ms.A0B(r10, 0);
        C147748pq r7 = this.A00;
        this.A00 = r11;
        AnonymousClass7XA r1 = this.A01;
        AnonymousClass69J r6 = r12.A0H.A0D;
        C121167El r5 = r1.A02;
        C147168nV r4 = r5.A02;
        AnonymousClass69J r3 = r5.A03;
        C146678mg r2 = r5.A01;
        long j2 = r5.A00;
        r5.A02 = r12;
        C04220Ms.A0B(r6, 0);
        r5.A03 = r6;
        r5.A01 = r10;
        r5.A00 = j;
        r10.Cfm();
        r11.AIj(this);
        C121167El.A01(r10, r5, r4, r3);
        r5.A01 = r2;
        r5.A00 = j2;
        this.A00 = r7;
    }

    public final void AIm(C104136bI r15, C98126Eh r16, float f, float f2, float f3, int i, long j, long j2, long j3, boolean z) {
        this.A01.AIm((C104136bI) null, r16, f, f2, f3, 3, j, j2, j3, false);
    }

    public final void AIp(C104136bI r11, C98126Eh r12, float f, float f2, int i, long j, long j2) {
        this.A01.AIp((C104136bI) null, r12, f, 1.0f, i, j, j2);
    }

    public final void AJ2(C111366nD r13, C104136bI r14, C29 c29, float f, float f2, int i, int i2, long j, long j2) {
        C04220Ms.A0B(r13, 0);
        this.A01.AJ2(r13, (C104136bI) null, (C29) null, f, f2, 0, 3, j, j2);
    }

    public final void AJ3(C104136bI r14, C29 c29, float f, float f2, int i, int i2, long j, long j2, long j3) {
        this.A01.AJ3((C104136bI) null, (C29) null, f, 1.0f, 0, 3, j, j2, j3);
    }

    public final void AJ6(C111366nD r8, C104136bI r9, C147018nF r10, C98126Eh r11, float f, int i) {
        AnonymousClass0wJ.A1N(r10, r8);
        this.A01.AJ6(r8, (C104136bI) null, r10, r11, f, i);
    }

    public final void AJ7(C104136bI r9, C147018nF r10, C98126Eh r11, float f, int i, long j) {
        int A09 = C86144wL.A09(r10);
        this.A01.AJ7((C104136bI) null, r10, r11, f, A09, j);
    }

    public final void AJ9(C111366nD r11, C104136bI r12, C98126Eh r13, float f, int i, long j, long j2) {
        int A09 = C86144wL.A09(r11);
        this.A01.AJ9(r11, (C104136bI) null, r13, f, A09, j, j2);
    }

    public final void AJA(C104136bI r12, C98126Eh r13, float f, int i, long j, long j2, long j3) {
        this.A01.AJA(r12, r13, f, i, j, j2, j3);
    }

    public final void AJC(C111366nD r13, C104136bI r14, C98126Eh r15, float f, int i, long j, long j2, long j3) {
        int A09 = C86144wL.A09(r13);
        this.A01.AJC(r13, (C104136bI) null, r15, f, A09, j, j2, j3);
    }

    public final void AJD(C104136bI r14, C98126Eh r15, float f, int i, long j, long j2, long j3, long j4) {
        this.A01.AJD((C104136bI) null, r15, 1.0f, 3, j, j2, j3, j4);
    }

    public final long AX0() {
        return this.A01.AX0();
    }

    public final float Acr() {
        return this.A01.Acr();
    }

    public final float AjK() {
        return this.A01.AjK();
    }

    public final long BCH() {
        return this.A01.BCH();
    }

    public /* synthetic */ AnonymousClass7XB(AnonymousClass7XA r2, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A01 = new AnonymousClass7XA();
    }

    public final void AIq() {
        C146678mg r3 = ((AnonymousClass7X9) this.A01.A03).A01.A02.A01;
        C147748pq r2 = this.A00;
        C04220Ms.A0A(r2);
        AnonymousClass7YG r4 = ((AnonymousClass7YG) r2).A03.A02;
        if (r4 != null && (r4.A00 & 4) != 0) {
            while (true) {
                if ((r4.A01 & 2) == 0) {
                    if ((r4.A01 & 4) == 0) {
                        r4 = r4.A02;
                        if (r4 == null) {
                            break;
                        }
                    } else {
                        C147748pq r42 = (C147748pq) r4;
                        if (r42 != null) {
                            AnonymousClass54T A02 = C121847Ik.A02(r42, 4);
                            ((AndroidComposeView) AnonymousClass6F0.A00(A02.A0H)).A0W.A00(r3, r42, A02, AnonymousClass7FV.A02(A02.A02));
                            return;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        AnonymousClass54T A022 = C121847Ik.A02(r2, 4);
        if (A022.A0L() == r2) {
            A022 = A022.A06;
            C04220Ms.A0A(A022);
        }
        A022.A0S(r3);
    }

    public final void AIu(C104136bI r16, C146868n0 r17, C98126Eh r18, float f, int i, int i2, long j, long j2, long j3, long j4) {
        C146868n0 r2 = r17;
        this.A01.AIu(r16, r2, r18, f, C86144wL.A09(r2), i2, j, j2, j3, j4);
    }

    public final void AIw(C104136bI r9, C146868n0 r10, C98126Eh r11, float f, int i, long j) {
        int A09 = C86144wL.A09(r10);
        this.A01.AIw(r9, r10, r11, 1.0f, A09, j);
    }

    public final C146708mj Ae6() {
        return this.A01.A03;
    }

    public final int CfK(long j) {
        return C147168nV.A01(this.A01, j);
    }

    public final int CfL(float f) {
        return AnonymousClass7FU.A01(this.A01, f);
    }

    public final float CxD(float f) {
        return C147168nV.A00(this.A01, f);
    }

    public final float CxE(int i) {
        return C147168nV.A00(this.A01, (float) i);
    }

    public final long CxF(long j) {
        return AnonymousClass7FU.A02(this.A01, j);
    }

    public final float CxK(long j) {
        return AnonymousClass7FU.A00(this.A01, j);
    }

    public final float CxL(float f) {
        return f * this.A01.Acr();
    }

    public final long D7K(long j) {
        return AnonymousClass7FU.A03(this.A01, j);
    }

    public final AnonymousClass69J getLayoutDirection() {
        return this.A01.A02.A03;
    }
}
