package X;

import com.facebook.forker.Process;
import java.util.Map;

/* renamed from: X.54K  reason: invalid class name */
public abstract class AnonymousClass54K extends C123657Xy implements C147588pa {
    public boolean A00;
    public boolean A01;

    public final int ANp(C104166bL r7) {
        boolean A1W;
        int A0F;
        C04220Ms.A0B(r7, 0);
        if (this instanceof AnonymousClass54T) {
            A1W = AnonymousClass0wJ.A1W(((AnonymousClass54T) this).A03);
        } else {
            A1W = AnonymousClass0wJ.A1W(((AnonymousClass54S) this).A01);
        }
        if (!A1W || (A0F = A0F(r7)) == Integer.MIN_VALUE) {
            return Process.WAIT_RESULT_TIMEOUT;
        }
        int i = this.A01;
        long j = this.A02;
        return C86104wH.A08(AnonymousClass7Hh.A00((i - C86104wH.A07(j)) >> 1, (this.A00 - C86104wH.A08(j)) >> 1)) + A0F;
    }

    public final /* synthetic */ C146098ld BaT(Map map, AnonymousClass0YY r3, int i, int i2) {
        C04220Ms.A0B(r3, 4);
        return new C123627Xv(this, map, r3, i, i2);
    }

    public final /* synthetic */ int CfL(float f) {
        return AnonymousClass7FU.A01(this, f);
    }

    public final /* synthetic */ float CxE(int i) {
        return C147168nV.A00(this, (float) i);
    }

    public final /* synthetic */ long CxF(long j) {
        return AnonymousClass7FU.A02(this, j);
    }

    public final /* synthetic */ float CxK(long j) {
        return AnonymousClass7FU.A00(this, j);
    }

    public final /* synthetic */ long D7K(long j) {
        return AnonymousClass7FU.A03(this, j);
    }

    public static final void A00(AnonymousClass54T r2) {
        AnonymousClass7Y3 r1;
        AnonymousClass78z AQ8;
        AnonymousClass54T r0 = r2.A06;
        if (r0 != null) {
            r1 = r0.A0H;
        } else {
            r1 = null;
        }
        AnonymousClass7Y3 r02 = r2.A0H;
        boolean A0I = C04220Ms.A0I(r1, r02);
        AnonymousClass54J r03 = r02.A0Y.A08;
        if (!A0I) {
            AQ8 = r03.AQ8();
        } else {
            C147568pY B00 = r03.B00();
            if (B00 == null || (AQ8 = B00.AQ8()) == null) {
                return;
            }
        }
        AQ8.A01();
    }

    public final int A0F(C104166bL r4) {
        Number A0j;
        if ((this instanceof AnonymousClass54R) || (this instanceof AnonymousClass54U)) {
            AnonymousClass54S r0 = (AnonymousClass54S) this;
            int A002 = C98296Ey.A00(r4, r0);
            r0.A04.put(r4, Integer.valueOf(A002));
            return A002;
        }
        if (this instanceof C877754l) {
            AnonymousClass54T r1 = (AnonymousClass54T) this;
            AnonymousClass54S r02 = r1.A05;
            if (r02 == null) {
                return C98296Ey.A00(r4, r1);
            }
            A0j = C86124wJ.A0j(r4, r02.A04);
            if (A0j == null) {
                return Process.WAIT_RESULT_TIMEOUT;
            }
        } else {
            AnonymousClass54T r12 = (AnonymousClass54T) this;
            AnonymousClass54S r03 = r12.A05;
            if (r03 != null) {
                return r03.A0F(r4);
            }
            A0j = C86124wJ.A0j(r4, r12.A0H.A0Y.A08.ABU());
            if (A0j == null) {
                return Process.WAIT_RESULT_TIMEOUT;
            }
        }
        return A0j.intValue();
    }

    public final C146098ld A0G() {
        C146098ld r0;
        if (this instanceof AnonymousClass54T) {
            r0 = ((AnonymousClass54T) this).A03;
            if (r0 == null) {
                throw C18180wK.A0a("Asking for measurement result of unmeasured layout modifier");
            }
        } else {
            r0 = ((AnonymousClass54S) this).A01;
            if (r0 == null) {
                throw C18180wK.A0a("LookaheadDelegate has not been measured yet when measureResult is requested.");
            }
        }
        return r0;
    }

    public final /* synthetic */ int CfK(long j) {
        return C147168nV.A01(this, j);
    }

    public final /* synthetic */ float CxD(float f) {
        return C147168nV.A00(this, f);
    }

    public final /* synthetic */ float CxL(float f) {
        return f * Acr();
    }
}
