package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.11Z  reason: invalid class name */
public final class AnonymousClass11Z extends C61803Vq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AnonymousClass11Z(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean A1Z = AnonymousClass0wJ.A1Z(rect, view);
        AnonymousClass0wJ.A1Q(recyclerView, ltt);
        C61803Vq.A00(view, rect);
        int A032 = RecyclerView.A03(view);
        C41030Luu luu = recyclerView.A0F;
        if (luu != null) {
            i = luu.getItemCount();
        } else {
            i = 0;
        }
        int i7 = this.A03;
        int i8 = i % i7;
        int i9 = i / i7;
        if (i8 != 0) {
            i9++;
        }
        int i10 = this.A01;
        if (i10 == 0) {
            i2 = A032 / i7;
            i3 = A032 % i7;
        } else {
            i2 = A032 % i7;
            i3 = A032 / i7;
        }
        int i11 = 0;
        boolean A1W = C18180wK.A1W(i2);
        boolean A1W2 = C18180wK.A1W(i3);
        int i12 = i7 - 1;
        int i13 = i12;
        if (i10 == 0) {
            i12 = i9 - 1;
        }
        boolean A1T = AnonymousClass0wJ.A1T(i2, i12);
        int i14 = i9 - (A1Z ? 1 : 0);
        if (i10 == 0) {
            i14 = i13;
        }
        boolean A1T2 = AnonymousClass0wJ.A1T(i3, i14);
        if (A1W) {
            i4 = 0;
        } else {
            i4 = this.A00 >> 1;
        }
        if (!A1T) {
            i5 = this.A00 >> 1;
        } else {
            i5 = 0;
        }
        if (A1W2) {
            i6 = this.A02 >> 1;
        } else {
            i6 = 0;
        }
        if (!A1T2) {
            i11 = this.A02 >> 1;
        }
        if (i10 != 0) {
            int i15 = this.A00;
            rect.left = (i15 * i2) / i7;
            rect.top = i6;
            rect.right = (i15 * (i7 - (i2 + 1))) / i7;
        } else {
            rect.left = i4;
            int i16 = this.A02;
            rect.top = (i16 * i3) / i7;
            rect.right = i5;
            i11 = (i16 * (i7 - (i3 + 1))) / i7;
        }
        rect.bottom = i11;
    }
}
