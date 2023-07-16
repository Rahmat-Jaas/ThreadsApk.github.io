package X;

import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;

/* renamed from: X.4yS  reason: invalid class name */
public final class AnonymousClass4yS extends RippleDrawable {
    public AnonymousClass7KE A00;
    public Integer A01;
    public boolean A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4yS(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
            r2 = 0
            if (r5 == 0) goto L_0x0015
            r1 = -1
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
        L_0x000f:
            r4.<init>(r3, r2, r0)
            r4.A03 = r5
            return
        L_0x0015:
            r0 = r2
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4yS.<init>(boolean):void");
    }

    public final Rect getDirtyBounds() {
        if (!this.A03) {
            this.A02 = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        C04220Ms.A06(dirtyBounds);
        this.A02 = false;
        return dirtyBounds;
    }

    public final boolean isProjected() {
        return this.A02;
    }
}
