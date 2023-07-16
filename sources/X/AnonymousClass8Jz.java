package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

/* renamed from: X.8Jz  reason: invalid class name */
public final class AnonymousClass8Jz extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C142718fT A04;
    public final /* synthetic */ C146598mV A05;
    public final /* synthetic */ C04180Mo A06;
    public final /* synthetic */ C04040Ma A07;
    public final /* synthetic */ AnonymousClass0MZ A08;
    public final /* synthetic */ AnonymousClass0MJ A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jz(C142718fT r2, C146598mV r3, C04180Mo r4, C04040Ma r5, AnonymousClass0MZ r6, AnonymousClass0MJ r7, float f, float f2, int i, int i2, boolean z) {
        super(1);
        this.A05 = r3;
        this.A02 = i;
        this.A01 = f;
        this.A07 = r5;
        this.A04 = r2;
        this.A06 = r4;
        this.A0A = z;
        this.A00 = f2;
        this.A08 = r6;
        this.A03 = i2;
        this.A09 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int Ay0;
        C113076qg r13 = (C113076qg) obj;
        C04220Ms.A0B(r13, 0);
        C146598mV r4 = this.A05;
        int i = this.A02;
        Integer BFe = r4.BFe(i);
        if (BFe == null) {
            float f = this.A01;
            int i2 = (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1));
            C147368pE r7 = r13.A06;
            float A002 = C18240wQ.A00(r7.getValue());
            if (i2 <= 0 ? A002 < f : A002 > f) {
                A002 = f;
            }
            C04040Ma r8 = this.A07;
            float f2 = A002 - r8.A00;
            C142718fT r5 = this.A04;
            float CgC = r5.CgC(f2);
            BFe = r4.BFe(i);
            if (BFe == null) {
                boolean z = this.A0A;
                int i3 = this.A03;
                int Ain = r4.Ain();
                if (!z ? !(Ain < i || (r4.Ain() == i && r4.Aio() < i3)) : !(Ain > i || (r4.Ain() == i && r4.Aio() > i3))) {
                    if (f2 == CgC) {
                        r8.A00 += f2;
                        float A003 = C18240wQ.A00(r7.getValue());
                        float f3 = this.A00;
                        if (!z ? A003 < (-f3) : A003 > f3) {
                            r13.A00();
                        }
                        int i4 = this.A08.A00;
                        if (z) {
                            if (i4 >= 2 && i - r4.ArK() > r4.Ay0()) {
                                Ay0 = i - r4.Ay0();
                            }
                        } else if (i4 >= 2 && r4.Ain() - i > r4.Ay0()) {
                            Ay0 = r4.Ay0() + i;
                        }
                        r4.CuQ(r5, Ay0, 0);
                    } else {
                        r13.A00();
                        this.A06.A00 = false;
                        return Unit.A00;
                    }
                }
            }
        }
        boolean z2 = this.A0A;
        int i5 = this.A03;
        int Ain2 = r4.Ain();
        if (!z2 ? Ain2 < i || (r4.Ain() == i && r4.Aio() < i5) : Ain2 > i || (r4.Ain() == i && r4.Aio() > i5)) {
            r4.CuQ(this.A04, i, i5);
            this.A06.A00 = false;
            r13.A00();
            return Unit.A00;
        }
        if (BFe != null) {
            throw new AnonymousClass8A1((AnonymousClass7WW) this.A09.A00, BFe.intValue());
        }
        return Unit.A00;
    }
}
