package X;

/* renamed from: X.74d  reason: invalid class name */
public final class AnonymousClass74d {
    public final AnonymousClass84X A00 = AnonymousClass84X.A01(new AnonymousClass7Y3[16]);

    public static final void A00(AnonymousClass7Y3 r5, AnonymousClass74d r6) {
        C113976sU r2 = r5.A0Y;
        if (r2.A01 == AnonymousClass006.A0Y && !r2.A02 && !r2.A06 && r5.A0N) {
            AnonymousClass7YG r3 = r5.A0a.A02;
            if ((r3.A00 & 256) != 0) {
                do {
                    if ((r3.A01 & 256) != 0 && (r3 instanceof C147668pi)) {
                        C147668pi r1 = (C147668pi) r3;
                        AnonymousClass54T A02 = C121847Ik.A02(r1, 256);
                        C04220Ms.A0B(A02, 0);
                        C147538pV r12 = ((AnonymousClass53X) r1).A00;
                        C04220Ms.A0C(r12, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
                        ((C147438pL) r12).C0k(A02);
                    }
                    if ((r3.A00 & 256) == 0) {
                        break;
                    }
                    r3 = r3.A02;
                } while (r3 == null);
            }
        }
        int i = 0;
        r5.A0O = false;
        AnonymousClass84X A08 = r5.A08();
        int i2 = A08.A00;
        if (i2 > 0) {
            Object[] objArr = A08.A01;
            do {
                A00((AnonymousClass7Y3) objArr[i], r6);
                i++;
            } while (i < i2);
        }
    }
}
