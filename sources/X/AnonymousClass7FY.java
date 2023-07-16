package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.IDxDCompatShape35S0100000_2_I2;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.7FY  reason: invalid class name */
public final class AnonymousClass7FY {
    public static void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Integer num) {
        if (num != null) {
            accessibilityNodeInfoCompat.A0A(C116146wV.A01(num));
            if (num.equals(AnonymousClass006.A01) || num.equals(AnonymousClass006.A15)) {
                accessibilityNodeInfoCompat.A0G(true);
            } else if (num.equals(AnonymousClass006.A04) || num.equals(AnonymousClass006.A06)) {
                accessibilityNodeInfoCompat.A02.setCheckable(true);
            }
        }
    }

    public static Integer A00(View view) {
        Integer num;
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        view.onInitializeAccessibilityNodeInfo(obtain);
        CharSequence className = obtain.getClassName();
        if (className == null) {
            return AnonymousClass006.A00;
        }
        String charSequence = className.toString();
        Integer[] A00 = AnonymousClass006.A00(33);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = AnonymousClass006.A00;
                break;
            }
            num = A00[i];
            if (C116146wV.A01(num) != null && C116146wV.A01(num).equals(charSequence)) {
                break;
            }
            i++;
        }
        Integer num2 = AnonymousClass006.A15;
        if (num.equals(num2) || num.equals(AnonymousClass006.A0u)) {
            if (obtain.isClickable()) {
                return num2;
            }
            return AnonymousClass006.A0u;
        } else if (!num.equals(AnonymousClass006.A00) || (collectionInfo = obtain.getCollectionInfo()) == null) {
            return num;
        } else {
            if (collectionInfo.getRowCount() <= 1 || collectionInfo.getColumnCount() <= 1) {
                return AnonymousClass006.A1C;
            }
            return AnonymousClass006.A0j;
        }
    }

    public static void A01(View view, CharSequence charSequence) {
        if (C006702y.A00(view) == null && charSequence != null) {
            C006702y.A0C(view, new IDxDCompatShape35S0100000_2_I2(charSequence, 1));
        }
    }

    public static void A02(View view, Integer num) {
        boolean isLongClickable = view.isLongClickable();
        if (C006702y.A00(view) == null && num != null) {
            C006702y.A0C(view, new C878755b(num, isLongClickable));
        }
    }
}
