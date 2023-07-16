package androidx.core.view;

import X.AnonymousClass006;
import X.AnonymousClass52I;
import X.C003201n;
import X.C008103m;
import X.C18340wi;
import X.C86154wM;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public class IDxDCompatShape35S0100000_2_I2 extends C003201n {
    public Object A00;
    public final int A01;

    public IDxDCompatShape35S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z;
        boolean z2;
        switch (this.A01) {
            case 0:
                super.A0L(view, accessibilityNodeInfoCompat);
                z = ((C18340wi) this.A00).A0B;
                break;
            case 1:
                super.A0L(view, accessibilityNodeInfoCompat);
                C86154wM.A1K(accessibilityNodeInfoCompat, (CharSequence) this.A00);
                return;
            case 2:
                super.A0L(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.A02.setFocusable(false);
                accessibilityNodeInfoCompat.A0G(false);
                accessibilityNodeInfoCompat.A09(C008103m.A0I);
                accessibilityNodeInfoCompat.A09(C008103m.A08);
                return;
            default:
                super.A0L(view, accessibilityNodeInfoCompat);
                z = ((AnonymousClass52I) this.A00).A04;
                break;
        }
        if (z) {
            accessibilityNodeInfoCompat.A06(1048576);
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfoCompat.A02.setDismissable(z2);
    }

    public final boolean A0M(View view, int i, Bundle bundle) {
        switch (this.A01) {
            case 0:
                if (i == 1048576) {
                    C18340wi r1 = (C18340wi) this.A00;
                    if (r1.A0B) {
                        r1.A05(AnonymousClass006.A0N);
                        return true;
                    }
                }
                break;
            case 3:
                if (i == 1048576) {
                    AnonymousClass52I r12 = (AnonymousClass52I) this.A00;
                    if (r12.A04) {
                        r12.cancel();
                        return true;
                    }
                }
                break;
        }
        return super.A0M(view, i, bundle);
    }
}
