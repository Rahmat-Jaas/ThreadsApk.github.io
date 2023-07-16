package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* renamed from: X.7FX  reason: invalid class name */
public final class AnonymousClass7FX {
    public static boolean A00(View view) {
        ViewParent parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            AccessibilityNodeInfoCompat A0L = C86144wL.A0L();
            View view2 = (View) parentForAccessibility;
            AccessibilityNodeInfo accessibilityNodeInfo = A0L.A02;
            view2.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (A01(view2, A0L) && accessibilityNodeInfo.getChildCount() > 0) {
                return false;
            }
            if (A02(view2, A0L) || A00(view2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A02(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        View view2;
        Integer A00;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
        if (!accessibilityNodeInfo.isVisibleToUser()) {
            return false;
        }
        if (!accessibilityNodeInfo.isClickable() && !accessibilityNodeInfo.isLongClickable() && !accessibilityNodeInfo.isFocusable()) {
            List A05 = accessibilityNodeInfoCompat.A05();
            A05.getClass();
            if (!C86144wL.A1W(16, A05) && !C86144wL.A1W(32, A05) && !C86144wL.A1W(1, A05)) {
                View view3 = (View) view.getParentForAccessibility();
                if (view3 == null) {
                    return false;
                }
                if (!accessibilityNodeInfo.isScrollable()) {
                    List A052 = accessibilityNodeInfoCompat.A05();
                    A052.getClass();
                    if (!C86144wL.A1W(4096, A052) && !C86144wL.A1W(8192, A052) && !(((view2 = (View) view3.getParentForAccessibility()) != null && AnonymousClass7FY.A00(view2) == AnonymousClass006.A1L) || (A00 = AnonymousClass7FY.A00(view3)) == AnonymousClass006.A1C || A00 == AnonymousClass006.A0j || A00 == AnonymousClass006.A0O || A00 == AnonymousClass006.A0P)) {
                        return false;
                    }
                }
                return A03(view, accessibilityNodeInfoCompat);
            }
        }
        return true;
    }

    public static boolean A03(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility != 4 && (importantForAccessibility != 2 || accessibilityNodeInfoCompat.A02.getChildCount() > 0)) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
            if (accessibilityNodeInfo.isCheckable()) {
                return true;
            }
            if (accessibilityNodeInfo.getCollectionInfo() == null && (!TextUtils.isEmpty(accessibilityNodeInfoCompat.A03()) || !TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription()))) {
                return true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    AccessibilityNodeInfoCompat A0L = C86144wL.A0L();
                    AccessibilityNodeInfo accessibilityNodeInfo2 = A0L.A02;
                    childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo2);
                    if (accessibilityNodeInfo2.isVisibleToUser() && !A02(childAt, A0L) && A03(childAt, A0L)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean A01(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Window window = null;
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                window = ((Activity) context).getWindow();
            }
        }
        if (window == null) {
            return false;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.x;
        int i2 = attributes.y;
        Rect A0F = C86164wN.A0F(i, i2, i + attributes.width, attributes.height + i2);
        Rect A0D = C86134wK.A0D();
        accessibilityNodeInfoCompat.A02.getBoundsInScreen(A0D);
        return A0F.equals(A0D);
    }
}
