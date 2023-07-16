package com.facebook.redex;

import X.AnonymousClass7A2;
import X.AnonymousClass8bL;
import X.C001900w;
import X.C04220Ms;
import X.C148838sG;
import X.C871950n;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.instagram.barcelona.R;
import java.util.concurrent.CancellationException;

public class IDxCListenerShape465S0100000_2_I2 implements View.OnAttachStateChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape465S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(IDxCListenerShape465S0100000_2_I2 iDxCListenerShape465S0100000_2_I2) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) iDxCListenerShape465S0100000_2_I2.A00;
        androidComposeViewAccessibilityDelegateCompat.A0H.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.A0N);
        AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.A0K;
        accessibilityManager.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0I);
        accessibilityManager.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0J);
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.A01 == 0) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) this.A00;
            AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.A0K;
            accessibilityManager.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0I);
            accessibilityManager.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0J);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        Boolean bool;
        switch (this.A01) {
            case 0:
                A00(this);
                return;
            case 1:
                C871950n r4 = (C871950n) this.A00;
                for (ViewParent viewParent : AnonymousClass8bL.A08(r4.getParent(), C001900w.A00)) {
                    if (viewParent instanceof View) {
                        View view2 = (View) viewParent;
                        C04220Ms.A0B(view2, 0);
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                            return;
                        }
                    }
                }
                r4.A03();
                return;
            case 2:
                C04220Ms.A0B(view, 0);
                view.removeOnAttachStateChangeListener(this);
                ((C148838sG) this.A00).AC7((CancellationException) null);
                return;
            default:
                if (!((AnonymousClass7A2) this.A00).A08) {
                    AnonymousClass7A2.A00(view);
                    return;
                }
                return;
        }
    }
}
