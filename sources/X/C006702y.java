package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.IDxVPropertyShape9S0000000_I2;
import com.instagram.barcelona.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.02y  reason: invalid class name and case insensitive filesystem */
public final class C006702y {
    public static Field A00;
    public static boolean A01;
    public static WeakHashMap A02;
    public static final C004602c A03 = AnonymousClass031.A00;
    public static final int[] A04;
    public static final C005202i A05 = new C005202i();
    public static final AtomicInteger A06 = new AtomicInteger(1);

    static {
        int[] iArr = new int[32];
        System.arraycopy(new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26}, 0, iArr, 0, 27);
        System.arraycopy(new int[]{R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31}, 0, iArr, 27, 5);
        A04 = iArr;
    }

    public static void A0D(View view, C008103m r8, C009003z r9, CharSequence charSequence) {
        C009003z r2 = r9;
        CharSequence charSequence2 = charSequence;
        if (r9 == null && charSequence == null) {
            A0A(view, ((AccessibilityNodeInfo.AccessibilityAction) r8.A03).getId());
            return;
        }
        C008103m r1 = new C008103m(r2, charSequence2, r8.A02, (Object) null, r8.A00);
        A08(view);
        A0B(view, ((AccessibilityNodeInfo.AccessibilityAction) r1.A03).getId());
        A06(view).add(r1);
        A09(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r4.getWindowVisibility() != 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0E(android.view.View r4, java.lang.CharSequence r5) {
        /*
            r1 = 1
            androidx.core.view.IDxVPropertyShape9S0000000_I2 r0 = new androidx.core.view.IDxVPropertyShape9S0000000_I2
            r0.<init>(r1)
            r0.A03(r4, r5)
            X.02i r3 = A05
            if (r5 == 0) goto L_0x0035
            java.util.WeakHashMap r2 = r3.A00
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L_0x001c
            int r1 = r4.getWindowVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r4, r0)
            r4.addOnAttachStateChangeListener(r3)
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L_0x0034
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r3)
        L_0x0034:
            return
        L_0x0035:
            java.util.WeakHashMap r0 = r3.A00
            r0.remove(r4)
            r4.removeOnAttachStateChangeListener(r3)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006702y.A0E(android.view.View, java.lang.CharSequence):void");
    }

    public static void A0G(View view, boolean z) {
        new IDxVPropertyShape9S0000000_I2(3).A03(view, Boolean.valueOf(z));
    }

    public static void A0H(View view, boolean z) {
        new IDxVPropertyShape9S0000000_I2(0).A03(view, Boolean.valueOf(z));
    }

    public static boolean A0I(View view) {
        Boolean bool = (Boolean) new IDxVPropertyShape9S0000000_I2(3).A02(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean A0J(View view) {
        Boolean bool = (Boolean) new IDxVPropertyShape9S0000000_I2(0).A02(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate A00(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C006302u.A00(view);
        }
        if (A01) {
            return null;
        }
        if (A00 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                A01 = true;
                return null;
            }
        }
        Object obj = A00.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static C004101w A02(View view, C004101w r3) {
        C004602c r2;
        if (Log.isLoggable("ViewCompat", 3)) {
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C006502w.A00(view, r3);
        }
        C004502b r0 = (C004502b) view.getTag(R.id.tag_on_receive_content_listener);
        if (r0 != null && (r3 = r0.CEJ(view, r3)) == null) {
            return null;
        }
        if (view instanceof C004602c) {
            r2 = (C004602c) view;
        } else {
            r2 = A03;
        }
        return r2.CEK(r3);
    }

    public static AnonymousClass03B A03(View view) {
        WeakHashMap weakHashMap = A02;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A02 = weakHashMap;
        }
        AnonymousClass03B r1 = (AnonymousClass03B) weakHashMap.get(view);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass03B r12 = new AnonymousClass03B(view);
        A02.put(view, r12);
        return r12;
    }

    public static void A07(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C006302u.A01(context, typedArray, attributeSet, view, iArr, i, i2);
        }
    }

    public static void A0C(View view, C003201n r2) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (r2 == null) {
            if (A00(view) instanceof C003001l) {
                r2 = new C003201n();
            } else {
                accessibilityDelegate = null;
                view.setAccessibilityDelegate(accessibilityDelegate);
            }
        }
        accessibilityDelegate = r2.A00;
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void A0F(View view, List list) {
        if (Build.VERSION.SDK_INT >= 29) {
            C006302u.A02(view, list);
        }
    }

    public static String[] A0K(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C006502w.A01(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static C003201n A01(View view) {
        View.AccessibilityDelegate A002 = A00(view);
        if (A002 == null) {
            return null;
        }
        if (A002 instanceof C003001l) {
            return ((C003001l) A002).A00;
        }
        return new C003201n(A002);
    }

    public static AnonymousClass03Y A04(View view, AnonymousClass03Y r3) {
        WindowInsets A042 = r3.A04();
        if (A042 != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(A042);
            if (!dispatchApplyWindowInsets.equals(A042)) {
                return AnonymousClass03Y.A01(view, dispatchApplyWindowInsets);
            }
        }
        return r3;
    }

    public static AnonymousClass03Y A05(View view, AnonymousClass03Y r3) {
        WindowInsets A042 = r3.A04();
        if (A042 != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(A042);
            if (!onApplyWindowInsets.equals(A042)) {
                return AnonymousClass03Y.A01(view, onApplyWindowInsets);
            }
        }
        return r3;
    }

    public static List A06(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void A08(View view) {
        C003201n A012 = A01(view);
        if (A012 == null) {
            A012 = new C003201n();
        }
        A0C(view, A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r5.getWindowVisibility() != 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(android.view.View r5, int r6) {
        /*
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L_0x005e
            r4 = 1
            androidx.core.view.IDxVPropertyShape9S0000000_I2 r0 = new androidx.core.view.IDxVPropertyShape9S0000000_I2
            r0.<init>(r4)
            java.lang.Object r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x002b
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L_0x002b
            int r0 = r5.getWindowVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            int r1 = r5.getAccessibilityLiveRegion()
            r0 = 32
            if (r1 != 0) goto L_0x0087
            if (r2 != 0) goto L_0x0087
            if (r6 != r0) goto L_0x005f
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            r5.onInitializeAccessibilityEvent(r2)
            r2.setEventType(r0)
            r2.setContentChangeTypes(r0)
            r2.setSource(r5)
            r5.onPopulateAccessibilityEvent(r2)
            java.util.List r1 = r2.getText()
            androidx.core.view.IDxVPropertyShape9S0000000_I2 r0 = new androidx.core.view.IDxVPropertyShape9S0000000_I2
            r0.<init>(r4)
            java.lang.Object r0 = r0.A02(r5)
            r1.add(r0)
            r3.sendAccessibilityEvent(r2)
        L_0x005e:
            return
        L_0x005f:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L_0x005e
            android.view.ViewParent r0 = r5.getParent()
            r0.notifySubtreeAccessibilityStateChanged(r5, r5, r6)     // Catch:{ AbstractMethodError -> 0x006d }
            goto L_0x0086
        L_0x006d:
            r2 = move-exception
            android.view.ViewParent r0 = r5.getParent()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = " does not fully implement ViewParent"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r1, r2)
            return
        L_0x0086:
            return
        L_0x0087:
            android.view.accessibility.AccessibilityEvent r3 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r2 != 0) goto L_0x008f
            r0 = 2048(0x800, float:2.87E-42)
        L_0x008f:
            r3.setEventType(r0)
            r3.setContentChangeTypes(r6)
            if (r2 == 0) goto L_0x00c6
            java.util.List r1 = r3.getText()
            androidx.core.view.IDxVPropertyShape9S0000000_I2 r0 = new androidx.core.view.IDxVPropertyShape9S0000000_I2
            r0.<init>(r4)
            java.lang.Object r0 = r0.A02(r5)
            r1.add(r0)
            int r0 = r5.getImportantForAccessibility()
            if (r0 != 0) goto L_0x00b0
            r5.setImportantForAccessibility(r4)
        L_0x00b0:
            android.view.ViewParent r2 = r5.getParent()
        L_0x00b4:
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x00c6
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getImportantForAccessibility()
            r0 = 4
            if (r1 != r0) goto L_0x00ca
            r0 = 2
            r5.setImportantForAccessibility(r0)
        L_0x00c6:
            r5.sendAccessibilityEventUnchecked(r3)
            return
        L_0x00ca:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006702y.A09(android.view.View, int):void");
    }

    public static void A0A(View view, int i) {
        A0B(view, i);
        A09(view, 0);
    }

    public static void A0B(View view, int i) {
        List A062 = A06(view);
        for (int i2 = 0; i2 < A062.size(); i2++) {
            if (((AccessibilityNodeInfo.AccessibilityAction) ((C008103m) A062.get(i2)).A03).getId() == i) {
                A062.remove(i2);
                return;
            }
        }
    }
}
