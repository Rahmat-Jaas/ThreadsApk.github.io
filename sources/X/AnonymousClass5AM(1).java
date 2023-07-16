package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5AM  reason: invalid class name */
public final class AnonymousClass5AM extends C61803Vq {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final AnonymousClass684 A04;

    public AnonymousClass5AM(AnonymousClass684 r2, float f, float f2, float f3, int i) {
        C04220Ms.A0B(r2, 5);
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = i;
        this.A04 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5AM) {
                AnonymousClass5AM r5 = (AnonymousClass5AM) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A00, r5.A00) == 0 && this.A03 == r5.A03 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A04, (C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A01), this.A02), this.A00) + this.A03) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ItemDecoration(spacingBefore=");
        A0s.append(this.A01);
        A0s.append(", spacingBetween=");
        A0s.append(this.A02);
        A0s.append(", spacingAfter=");
        A0s.append(this.A00);
        A0s.append(C28174Ezk.A00(123));
        A0s.append(this.A03);
        A0s.append(", alignItems=");
        return C86104wH.A0y(this.A04, A0s);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        AnonymousClass5AD r9;
        int height;
        AnonymousClass7Di r0;
        int A002;
        boolean A1Z = AnonymousClass0wJ.A1Z(rect, view);
        C04220Ms.A0B(recyclerView, 2);
        C41030Luu luu = recyclerView.A0F;
        String str = null;
        if ((luu instanceof AnonymousClass5AD) && (r9 = (AnonymousClass5AD) luu) != null) {
            int A032 = RecyclerView.A03(view);
            int itemCount = r9.getItemCount();
            if (A032 != -1 && A032 < itemCount) {
                M6x m6x = recyclerView.A0H;
                C04220Ms.A0C(m6x, I17.A00(2));
                int i = 0;
                boolean A1T = AnonymousClass0wJ.A1T(m6x.A08.getLayoutDirection(), A1Z ? 1 : 0);
                C127397h3 r3 = ((C108076hm) r9.A03.get(A032)).A01;
                C04220Ms.A0C(r3, C18170wI.A00(20));
                C127397h3 A06 = C127397h3.A06(r3);
                if (A06 != null) {
                    str = C127397h3.A0E(A06);
                }
                AnonymousClass684 A003 = AnonymousClass70F.A00(this.A04, str);
                int i2 = this.A03;
                if (i2 == A1Z) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                AnonymousClass7J7 A012 = ((C108076hm) r9.A03.get(A032)).A00.A01();
                if (!(A012 == null || (r0 = A012.A02) == null)) {
                    if (i2 == A1Z) {
                        A002 = AnonymousClass7Di.A01(r0);
                    } else {
                        A002 = AnonymousClass7Di.A00(r0);
                    }
                    int i3 = height - A002;
                    int ordinal = A003.ordinal();
                    if (ordinal == A1Z) {
                        i = AnonymousClass8bA.A00(((double) i3) / 2.0d);
                    } else if (ordinal == 2) {
                        i = i3;
                    }
                    if (i2 != A1Z) {
                        rect.top = i;
                    } else if (A1T) {
                        rect.right = i;
                    } else {
                        rect.left = i;
                    }
                }
                if (A032 == 0) {
                    int i4 = (int) this.A01;
                    if (i2 == A1Z) {
                        rect.top = i4;
                    } else if (A1T) {
                        rect.right = i4;
                    } else {
                        rect.left = i4;
                    }
                }
                int i5 = itemCount - A1Z;
                if (A032 < i5) {
                    int i6 = (int) this.A02;
                    if (i2 == A1Z) {
                        rect.bottom = i6;
                    } else if (A1T) {
                        rect.left = i6;
                    } else {
                        rect.right = i6;
                    }
                }
                if (A032 == i5) {
                    int i7 = (int) this.A00;
                    if (i2 == A1Z) {
                        rect.bottom = i7;
                    } else if (A1T) {
                        rect.left = i7;
                    } else {
                        rect.right = i7;
                    }
                }
            }
        }
    }
}
