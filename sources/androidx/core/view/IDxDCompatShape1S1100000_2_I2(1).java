package androidx.core.view;

import X.AnonymousClass0wJ;
import X.AnonymousClass7FY;
import X.C003201n;
import X.C008103m;
import X.C86154wM;
import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public class IDxDCompatShape1S1100000_2_I2 extends C003201n {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxDCompatShape1S1100000_2_I2(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String str;
        if (this.A02 != 0) {
            AnonymousClass0wJ.A1N(view, accessibilityNodeInfoCompat);
            super.A0L(view, accessibilityNodeInfoCompat);
            Context context = (Context) this.A00;
            accessibilityNodeInfoCompat.A0B(AnonymousClass0wJ.A0l(context, this.A01, 2131834415));
            accessibilityNodeInfoCompat.A0C(context.getString(2131822800));
            str = context.getString(2131834414);
        } else {
            boolean A1Y = AnonymousClass0wJ.A1Y(view, accessibilityNodeInfoCompat);
            super.A0L(view, accessibilityNodeInfoCompat);
            AnonymousClass7FY.A03(accessibilityNodeInfoCompat, (Integer) this.A00);
            str = this.A01;
            if (str == null || str.length() == 0) {
                accessibilityNodeInfoCompat.A0G(A1Y);
                accessibilityNodeInfoCompat.A02.setLongClickable(A1Y);
                accessibilityNodeInfoCompat.A09(C008103m.A08);
                accessibilityNodeInfoCompat.A09(C008103m.A0L);
                return;
            }
        }
        C86154wM.A1K(accessibilityNodeInfoCompat, str);
    }
}
