package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape5S0110000_I2;

/* renamed from: X.7VX  reason: invalid class name */
public final class AnonymousClass7VX implements C146598mV {
    public final LazyGridState A00;

    public final float AL4(int i, int i2) {
        long j;
        int i3 = i;
        LazyGridState lazyGridState = this.A00;
        List BLp = ((C145088jo) lazyGridState.A0E.getValue()).BLp();
        int A04 = AnonymousClass0wJ.A04(lazyGridState.A0I.getValue());
        boolean A1X = C86104wH.A1X(lazyGridState.A0D);
        KtLambdaShape5S0110000_I2 ktLambdaShape5S0110000_I2 = new KtLambdaShape5S0110000_I2(7, BLp, A1X);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < BLp.size()) {
            int A042 = AnonymousClass0wJ.A04(ktLambdaShape5S0110000_I2.invoke(Integer.valueOf(i4)));
            if (A042 == -1) {
                i4++;
            } else {
                int i7 = 0;
                while (i4 < BLp.size() && AnonymousClass0wJ.A04(ktLambdaShape5S0110000_I2.invoke(Integer.valueOf(i4))) == A042) {
                    long j2 = ((AnonymousClass7VN) ((C28) BLp.get(i4))).A07;
                    if (A1X) {
                        j = j2 & 4294967295L;
                    } else {
                        j = j2 >> 32;
                    }
                    i7 = Math.max(i7, (int) j);
                    i4++;
                }
                i5 += i7;
                i6++;
            }
        }
        int i8 = i5 / i6;
        int i9 = 1;
        boolean A1W = C18230wP.A1W(i3, lazyGridState.A00());
        int A002 = i - lazyGridState.A00();
        int i10 = A04 - 1;
        if (A1W) {
            i9 = -1;
        }
        int i11 = (A002 + (i10 * i9)) / A04;
        int min = Math.min(Math.abs(i2), i8);
        if (i2 < 0) {
            min = -min;
        }
        return (((float) (i8 * i11)) + ((float) min)) - ((float) AnonymousClass0wJ.A04(lazyGridState.A07.A03.getValue()));
    }

    public final C147168nV Acs() {
        return (C147168nV) this.A00.A0C.getValue();
    }

    public final int Ain() {
        return this.A00.A00();
    }

    public final int Aio() {
        return AnonymousClass0wJ.A04(this.A00.A07.A03.getValue());
    }

    public final int ArK() {
        C28 c28 = (C28) AnonymousClass00J.A0F(((C145088jo) this.A00.A0E.getValue()).BLp());
        if (c28 != null) {
            return ((AnonymousClass7VN) c28).A01;
        }
        return 0;
    }

    public final int Ay0() {
        return AnonymousClass0wJ.A04(this.A00.A0I.getValue()) * 100;
    }

    public final Integer BFe(int i) {
        Object obj;
        int A07;
        LazyGridState lazyGridState = this.A00;
        List BLp = ((C145088jo) lazyGridState.A0E.getValue()).BLp();
        int size = BLp.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = BLp.get(i2);
            if (((AnonymousClass7VN) ((C28) obj)).A01 == i) {
                break;
            }
            i2++;
        }
        C28 c28 = (C28) obj;
        if (c28 == null) {
            return null;
        }
        boolean A1X = C86104wH.A1X(lazyGridState.A0D);
        long j = ((AnonymousClass7VN) c28).A06;
        if (A1X) {
            A07 = C86104wH.A08(j);
        } else {
            A07 = C86104wH.A07(j);
        }
        return Integer.valueOf(A07);
    }

    public final void CuQ(C142718fT r2, int i, int i2) {
        this.A00.A01(i, i2);
    }

    public final int getItemCount() {
        return ((C145088jo) this.A00.A0E.getValue()).BHd();
    }

    public AnonymousClass7VX(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }
}
