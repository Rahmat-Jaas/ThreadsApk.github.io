package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;

/* renamed from: X.7VW  reason: invalid class name */
public final class AnonymousClass7VW implements C146598mV {
    public final LazyListState A00;

    public final float AL4(int i, int i2) {
        LazyListState lazyListState = this.A00;
        List A002 = C147158nU.A00(lazyListState);
        int size = A002.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((AnonymousClass7VH) ((AnonymousClass8cc) A002.get(i4))).A02;
        }
        int size2 = i3 / A002.size();
        int A003 = i - lazyListState.A00();
        int min = Math.min(Math.abs(i2), size2);
        if (i2 < 0) {
            min = -min;
        }
        return (((float) (size2 * A003)) + ((float) min)) - ((float) lazyListState.A01());
    }

    public final C147168nV Acs() {
        return (C147168nV) this.A00.A0E.getValue();
    }

    public final int Ain() {
        return this.A00.A00();
    }

    public final int Aio() {
        return this.A00.A01();
    }

    public final int ArK() {
        AnonymousClass8cc r0 = (AnonymousClass8cc) AnonymousClass00J.A0F(C147158nU.A00(this.A00));
        if (r0 != null) {
            return ((AnonymousClass7VH) r0).A00;
        }
        return 0;
    }

    public final int Ay0() {
        return 100;
    }

    public final Integer BFe(int i) {
        Object obj;
        List A002 = C147158nU.A00(this.A00);
        int size = A002.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = A002.get(i2);
            if (((AnonymousClass7VH) ((AnonymousClass8cc) obj)).A00 == i) {
                break;
            }
            i2++;
        }
        AnonymousClass8cc r1 = (AnonymousClass8cc) obj;
        if (r1 != null) {
            return Integer.valueOf(((AnonymousClass7VH) r1).A01);
        }
        return null;
    }

    public final void CuQ(C142718fT r2, int i, int i2) {
        this.A00.A04(i, i2);
    }

    public final int getItemCount() {
        return this.A00.A02().BHd();
    }

    public AnonymousClass7VW(LazyListState lazyListState) {
        this.A00 = lazyListState;
    }
}
