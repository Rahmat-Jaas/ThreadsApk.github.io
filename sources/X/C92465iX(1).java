package X;

import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5iX  reason: invalid class name and case insensitive filesystem */
public class C92465iX extends C128377jT {
    public final AnonymousClass5iR A00;

    public static final void A00(ViewStub viewStub, float f, int i) {
        String A002 = C28174Ezk.A00(4);
        if (i == 1) {
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            C04220Ms.A0C(layoutParams, A002);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = f;
            layoutParams2.width = 0;
        } else if (i == 2) {
            ViewGroup.LayoutParams layoutParams3 = viewStub.getLayoutParams();
            C04220Ms.A0C(layoutParams3, A002);
            ((LinearLayout.LayoutParams) layoutParams3).height = -1;
        }
    }

    public static void A01(AnonymousClass5iR r1, ImmutableList.Builder builder) {
        builder.add((Object) new C92465iX(r1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r1.A05(((X.C92465iX) r6).A00.A05) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r1.A05(((X.C92465iX) r6).A00.A04) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C128377jT r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C92465iX
            r4 = 0
            if (r0 == 0) goto L_0x0067
            boolean r2 = super.A03(r6)
            X.5iR r3 = r5.A00
            X.7jU r1 = r3.A04
            if (r1 == 0) goto L_0x0020
            if (r2 == 0) goto L_0x001f
            r0 = r6
            X.5iX r0 = (X.C92465iX) r0
            X.5iR r0 = r0.A00
            X.7jU r0 = r0.A04
            boolean r0 = r1.A05(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            X.7jU r1 = r3.A05
            if (r1 == 0) goto L_0x0035
            if (r2 == 0) goto L_0x0034
            r0 = r6
            X.5iX r0 = (X.C92465iX) r0
            X.5iR r0 = r0.A00
            X.7jU r0 = r0.A05
            boolean r0 = r1.A05(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            X.7jU r1 = r3.A06
            if (r1 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0067
            r0 = r6
            X.5iX r0 = (X.C92465iX) r0
            X.5iR r0 = r0.A00
            X.7jU r0 = r0.A06
            boolean r2 = r1.A05(r0)
        L_0x0046:
            if (r2 == 0) goto L_0x0067
            android.view.View$OnClickListener r0 = r3.A03
            boolean r1 = X.AnonymousClass0wJ.A1W(r0)
            X.5iX r6 = (X.C92465iX) r6
            X.5iR r2 = r6.A00
            android.view.View$OnClickListener r0 = r2.A03
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            if (r1 != r0) goto L_0x0067
            int r1 = r3.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x0067
            int r1 = r3.A02
            int r0 = r2.A02
            if (r1 != r0) goto L_0x0067
            r4 = 1
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92465iX.A03(X.7jT):boolean");
    }

    public C92465iX(AnonymousClass5iR r1) {
        super(r1);
        this.A00 = r1;
    }
}
