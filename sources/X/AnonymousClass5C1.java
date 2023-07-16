package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5C1  reason: invalid class name */
public final class AnonymousClass5C1 extends RecyclerView implements AnonymousClass0S2 {
    public static final int[] A05 = {0, 0};
    public C003201n A00;
    public ArrayList A01;
    public boolean A02 = true;
    public boolean A03;
    public final AnonymousClass02Z A04 = new AnonymousClass02Z();

    private void A00(int i, int i2, int[] iArr, int i3) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        RecyclerView.A0C((MotionEvent) null, this, i, i2);
        this.A03 = true;
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C113246qz) it.next()).onScrollStateChanged(this, 1);
            }
        }
        int scrollY2 = getScrollY() - scrollY;
        int scrollX2 = getScrollX() - scrollX;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[0] = iArr[0] + scrollX2;
            iArr[1] = iArr[1] + scrollY2;
        }
        A16(A05, iArr2, 0, scrollX2, 0, scrollY2, i3);
    }

    public final void C8m(View view, int i, int i2, int i3, int i4, int i5) {
        A00(i3, i4, (int[]) null, i5);
    }

    public final void CMY(View view, int i) {
        setIsScrollEnabled(true);
        AnonymousClass02Z r0 = this.A04;
        if (i == 1) {
            r0.A00 = 0;
        } else {
            r0.A01 = 0;
        }
        if (getScrollState() == 1) {
            this.A03 = false;
            ArrayList arrayList = this.A01;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C113246qz) it.next()).onScrollStateChanged(this, 0);
                }
            }
        }
    }

    public final void A11(C113246qz r2) {
        ArrayList arrayList = this.A01;
        if (arrayList == null) {
            arrayList = AnonymousClass0wJ.A0v();
            this.A01 = arrayList;
        }
        arrayList.add(r2);
        super.A11(r2);
    }

    public final void A12(C113246qz r2) {
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            arrayList.remove(r2);
        }
        super.A12(r2);
    }

    public final void C8l(View view, int[] iArr, int i, int i2, int i3) {
        A1B(iArr, A05, i, i2, i3);
    }

    public final void C8o(View view, View view2, int i, int i2) {
        AnonymousClass02Z r1 = this.A04;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
    }

    public final boolean CM1(View view, View view2, int i, int i2) {
        if (!(view2 instanceof AnonymousClass8e1)) {
            return false;
        }
        setIsScrollEnabled(false);
        return true;
    }

    public int getNestedScrollAxes() {
        AnonymousClass02Z r0 = this.A04;
        return r0.A01 | r0.A00;
    }

    public int getScrollState() {
        if (this.A03) {
            return 1;
        }
        return this.A07;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A02 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setIsScrollEnabled(boolean z) {
        boolean z2 = this.A02;
        if (z2 != z) {
            this.A02 = z;
            if (z2) {
                this.A00 = C006702y.A01(this);
            }
            if (this.A02) {
                C006702y.A0C(this, this.A00);
                this.A00 = null;
                return;
            }
            C006702y.A0C(this, new AnonymousClass5C2(this, this));
        }
    }

    public AnonymousClass5C1(Context context) {
        super(context);
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        dispatchNestedFling(f, f2, z);
        if (!A19((int) (-f), (int) (-f2))) {
            return false;
        }
        this.A03 = false;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (super.onTouchEvent(r4) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 2042593405(0x79bf807d, float:1.2429184E35)
            int r2 = X.C14030oh.A05(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0012
            boolean r0 = super.onTouchEvent(r4)
            r1 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            r0 = 235934794(0xe10144a, float:1.775914E-30)
            X.C14030oh.A0C(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5C1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void C8n(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A00(i3, i4, iArr, i5);
    }
}
