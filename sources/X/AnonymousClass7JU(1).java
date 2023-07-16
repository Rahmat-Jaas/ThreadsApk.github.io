package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.IDxDCompatShape5S0000000_2_I2;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.7JU  reason: invalid class name */
public final class AnonymousClass7JU {
    public static void A01(View view) {
        C006702y.A0C(view, new IDxDCompatShape5S0000000_2_I2(0));
    }

    public static void A00(View view) {
        if (view != null && AnonymousClass3JA.A01(view.getContext())) {
            view.sendAccessibilityEvent(4194304);
            try {
                view.performAccessibilityAction(64, (Bundle) null);
            } catch (NullPointerException unused) {
            }
        }
    }

    public static void A03(View view, long j) {
        if (view != null) {
            view.postDelayed(new C135187z1(view), j);
        }
    }

    public static void A04(View view, long j) {
        if (view != null) {
            if (j < 500) {
                j = 500;
            }
            view.postDelayed(new C135177z0(view), j);
        }
    }

    public static void A02(View view, int i) {
        if (AnonymousClass3JA.A00(view.getContext())) {
            view.setImportantForAccessibility(i);
        }
    }

    public static void A05(View view, CharSequence charSequence) {
        AccessibilityManager accessibilityManager;
        ViewParent parent;
        Context context = view.getContext();
        if (context != null && (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) != null && accessibilityManager.isEnabled() && (parent = view.getParent()) != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            view.onInitializeAccessibilityEvent(obtain);
            if (charSequence != null) {
                obtain.getText().add(charSequence);
                obtain.setContentDescription((CharSequence) null);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    public static void A06(CharSequence charSequence, StringBuilder sb, boolean z) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (z && !TextUtils.isEmpty(sb)) {
                sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
                sb.append(' ');
            }
            sb.append(charSequence);
        }
    }
}
