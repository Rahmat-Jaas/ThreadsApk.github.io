package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine;
import kotlin.Unit;

/* renamed from: X.54D  reason: invalid class name */
public final class AnonymousClass54D extends C104156bK implements C147168nV, C147818py, C147428pK {
    public long A00 = 0;
    public C109656kM A01 = AnonymousClass7CA.A00;
    public C109656kM A02;
    public C83224qz A03 = C73874Uq.A00;
    public final AnonymousClass84X A04 = AnonymousClass84X.A01(new SuspendingPointerInputFilter$PointerEventHandlerCoroutine[16]);
    public final C146118lf A05;
    public final AnonymousClass84X A06 = AnonymousClass84X.A01(new SuspendingPointerInputFilter$PointerEventHandlerCoroutine[16]);
    public final /* synthetic */ C147168nV A07;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final float Acr() {
        return this.A07.Acr();
    }

    public final float AjK() {
        return this.A07.AjK();
    }

    public final int CfK(long j) {
        return this.A07.CfK(j);
    }

    public final int CfL(float f) {
        return this.A07.CfL(f);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final float CxD(float f) {
        return this.A07.CxD(f);
    }

    public final float CxE(int i) {
        return this.A07.CxE(i);
    }

    public final long CxF(long j) {
        return this.A07.CxF(j);
    }

    public final float CxK(long j) {
        return this.A07.CxK(j);
    }

    public final float CxL(float f) {
        return this.A07.CxL(f);
    }

    public final long D7K(long j) {
        return this.A07.D7K(j);
    }

    public static final void A00(C109656kM r7, AnonymousClass67C r8, AnonymousClass54D r9) {
        AnonymousClass84X r6;
        AnonymousClass8s9 r1;
        AnonymousClass8s9 r12;
        AnonymousClass84X r13 = r9.A04;
        synchronized (r13) {
            r6 = r9.A06;
            r6.A09(r13, r6.A00);
        }
        try {
            int ordinal = r8.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                int i = r6.A00;
                if (i > 0) {
                    int i2 = 0;
                    Object[] objArr = r6.A01;
                    do {
                        SuspendingPointerInputFilter$PointerEventHandlerCoroutine suspendingPointerInputFilter$PointerEventHandlerCoroutine = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine) objArr[i2];
                        if (r8 == suspendingPointerInputFilter$PointerEventHandlerCoroutine.A00 && (r1 = suspendingPointerInputFilter$PointerEventHandlerCoroutine.A01) != null) {
                            suspendingPointerInputFilter$PointerEventHandlerCoroutine.A01 = null;
                            r1.resumeWith(r7);
                        }
                        i2++;
                    } while (i2 < i);
                }
            } else if (ordinal == 1) {
                int i3 = r6.A00;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    Object[] objArr2 = r6.A01;
                    do {
                        SuspendingPointerInputFilter$PointerEventHandlerCoroutine suspendingPointerInputFilter$PointerEventHandlerCoroutine2 = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine) objArr2[i4];
                        if (r8 == suspendingPointerInputFilter$PointerEventHandlerCoroutine2.A00 && (r12 = suspendingPointerInputFilter$PointerEventHandlerCoroutine2.A01) != null) {
                            suspendingPointerInputFilter$PointerEventHandlerCoroutine2.A01 = null;
                            r12.resumeWith(r7);
                        }
                        i4--;
                    } while (i4 >= 0);
                }
            }
        } finally {
            r6.A05();
        }
    }

    public final C104156bK B21() {
        return this;
    }

    public AnonymousClass54D(C146118lf r3, C147168nV r4) {
        AnonymousClass0wJ.A1O(r3, r4);
        this.A05 = r3;
        this.A07 = r4;
    }

    public final Object AA6(C146958n9 r7, AnonymousClass0YP r8) {
        C27420EnC A17 = C86104wH.A17(r7);
        SuspendingPointerInputFilter$PointerEventHandlerCoroutine suspendingPointerInputFilter$PointerEventHandlerCoroutine = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine(this, A17);
        AnonymousClass84X r3 = this.A04;
        synchronized (r3) {
            r3.A0C(suspendingPointerInputFilter$PointerEventHandlerCoroutine);
            C04220Ms.A0B(r8, 0);
            new C27146Eei(D0E.COROUTINE_SUSPENDED, C25598DoY.A02(C25598DoY.A01(suspendingPointerInputFilter$PointerEventHandlerCoroutine, suspendingPointerInputFilter$PointerEventHandlerCoroutine, r8))).resumeWith(Unit.A00);
        }
        A17.BQt(C86154wM.A10(suspendingPointerInputFilter$PointerEventHandlerCoroutine, 30));
        return A17.A0B();
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
