package androidx.core.view;

import X.AnonymousClass0wJ;
import X.C003201n;
import X.C008103m;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public class IDxDCompatShape5S0000000_2_I2 extends C003201n {
    public final int A00;

    public IDxDCompatShape5S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.A00) {
            case 0:
                super.A0L(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.A02.setHeading(true);
                return;
            case 1:
                super.A0L(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.A02.setSelected(true);
                return;
            case 2:
                super.A0L(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.A02.setHeading(true);
                accessibilityNodeInfoCompat.A0G(false);
                accessibilityNodeInfoCompat.A09(C008103m.A08);
                return;
            case 5:
                AnonymousClass0wJ.A1N(view, accessibilityNodeInfoCompat);
                super.A0L(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.A0C("Button");
                return;
            default:
                super.A0L(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.A02.setEnabled(true);
                return;
        }
    }
}
