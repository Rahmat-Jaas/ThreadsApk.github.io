package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.5LZ  reason: invalid class name */
public final class AnonymousClass5LZ extends AnonymousClass0Sf implements C146458mH {
    public final float A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass79L A04;
    public final C142918fo A05;

    public final float BgF(C966466d r3) {
        int i;
        int A042 = C18230wP.A04(r3, 0);
        if (A042 == 0) {
            i = 32;
        } else if (A042 == 1) {
            i = 44;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return (float) i;
    }

    public final C145068jm CVr(C966466d r4) {
        float f;
        int i;
        int A042 = C18230wP.A04(r4, 0);
        if (A042 == 0) {
            f = (float) 16;
            i = 5;
        } else if (A042 == 1) {
            f = (float) 20;
            i = 13;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        float f2 = (float) i;
        return new AnonymousClass7V9(f, f2, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LZ) {
                AnonymousClass5LZ r8 = (AnonymousClass5LZ) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && C04220Ms.A0I(this.A05, r8.A05) && C04220Ms.A0I(this.A04, r8.A04) && Float.compare(this.A00, r8.A00) == 0 && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass5LZ(AnonymousClass79L r4, C142918fo r5, int i, long j, long j2) {
        long j3;
        r4 = (i & 8) != 0 ? null : r4;
        float f = (i & 16) != 0 ? 0.3f : BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if ((i & 32) != 0) {
            j3 = j2;
        } else {
            j3 = 0;
        }
        this.A01 = j;
        this.A02 = j2;
        this.A05 = r5;
        this.A04 = r4;
        this.A00 = f;
        this.A03 = j3;
    }

    public final long AA7(boolean z) {
        long j = this.A01;
        if (!z) {
            return j;
        }
        return C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), this.A00 * AnonymousClass7KE.A00(j));
    }

    public final long AEL(boolean z) {
        if (z) {
            return this.A02;
        }
        return this.A03;
    }

    public final AnonymousClass79L AU0() {
        return this.A04;
    }

    public final float AdL() {
        return this.A00;
    }

    public final C142918fo BAi() {
        return this.A05;
    }

    public final int hashCode() {
        return C86134wK.A06(C86104wH.A05((AnonymousClass0wJ.A05(this.A05, C86104wH.A06(C86154wM.A04(this.A01), this.A02)) + AnonymousClass0wJ.A03(this.A04)) * 31, this.A00), this.A03);
    }
}
