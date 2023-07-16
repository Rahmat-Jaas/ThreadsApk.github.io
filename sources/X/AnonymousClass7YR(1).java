package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.7YR  reason: invalid class name */
public final class AnonymousClass7YR implements C143028fz {
    public final float[] A00 = AnonymousClass7Hf.A04();
    public final int[] A01 = new int[2];

    public final void ABb(View view, float[] fArr) {
        C04220Ms.A0B(fArr, 1);
        AnonymousClass7Hf.A02(fArr);
        A00(view, fArr);
    }

    private final void A00(View view, float[] fArr) {
        float[] fArr2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            A00((View) parent, fArr);
            fArr2 = this.A00;
            AnonymousClass7Hf.A02(fArr2);
            AnonymousClass7Hf.A03(fArr2, -((float) view.getScrollX()), -((float) view.getScrollY()));
            AnonymousClass7CB.A01(fArr, fArr2);
            AnonymousClass7Hf.A02(fArr2);
            AnonymousClass7Hf.A03(fArr2, (float) view.getLeft(), (float) view.getTop());
            AnonymousClass7CB.A01(fArr, fArr2);
        } else {
            int[] iArr = this.A01;
            view.getLocationInWindow(iArr);
            fArr2 = this.A00;
            AnonymousClass7Hf.A02(fArr2);
            AnonymousClass7Hf.A03(fArr2, -((float) view.getScrollX()), -((float) view.getScrollY()));
            AnonymousClass7CB.A01(fArr, fArr2);
            AnonymousClass7Hf.A02(fArr2);
            AnonymousClass7Hf.A03(fArr2, (float) iArr[0], (float) iArr[1]);
            AnonymousClass7CB.A01(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            C98066Ea.A00(matrix, fArr2);
            AnonymousClass7CB.A01(fArr, fArr2);
        }
    }
}
