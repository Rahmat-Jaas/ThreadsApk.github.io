package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.03m  reason: invalid class name and case insensitive filesystem */
public final class C008103m {
    public static final C008103m A04 = new C008103m(64, (CharSequence) null);
    public static final C008103m A05 = new C008103m(128, (CharSequence) null);
    public static final C008103m A06 = new C008103m(2, (CharSequence) null);
    public static final C008103m A07 = new C008103m(8, (CharSequence) null);
    public static final C008103m A08 = new C008103m(16, (CharSequence) null);
    public static final C008103m A09 = new C008103m(524288, (CharSequence) null);
    public static final C008103m A0A = new C008103m((C009003z) null, (CharSequence) null, (Class) null, AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348);
    public static final C008103m A0B = new C008103m((int) Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, (CharSequence) null);
    public static final C008103m A0C = new C008103m((int) Constants.LOAD_RESULT_PGO_ATTEMPTED, (CharSequence) null);
    public static final C008103m A0D = new C008103m(1048576, (CharSequence) null);
    public static final C008103m A0E;
    public static final C008103m A0F;
    public static final C008103m A0G;
    public static final C008103m A0H = new C008103m((int) Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, (CharSequence) null);
    public static final C008103m A0I = new C008103m(1, (CharSequence) null);
    public static final C008103m A0J = new C008103m((C009003z) null, (CharSequence) null, (Class) null, AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357);
    public static final C008103m A0K;
    public static final C008103m A0L = new C008103m(32, (CharSequence) null);
    public static final C008103m A0M = new C008103m((C009003z) null, (CharSequence) null, AnonymousClass02H.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354);
    public static final C008103m A0N;
    public static final C008103m A0O;
    public static final C008103m A0P;
    public static final C008103m A0Q;
    public static final C008103m A0R;
    public static final C008103m A0S;
    public static final C008103m A0T = new C008103m(32768, (CharSequence) null);
    public static final C008103m A0U;
    public static final C008103m A0V;
    public static final C008103m A0W;
    public static final C008103m A0X = new C008103m(8192, (CharSequence) null);
    public static final C008103m A0Y = new C008103m((C009003z) null, (CharSequence) null, (Class) null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346);
    public static final C008103m A0Z = new C008103m(4096, (CharSequence) null);
    public static final C008103m A0a = new C008103m((C009003z) null, (CharSequence) null, (Class) null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345);
    public static final C008103m A0b = new C008103m((C009003z) null, (CharSequence) null, (Class) null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347);
    public static final C008103m A0c = new C008103m((C009003z) null, (CharSequence) null, AnonymousClass022.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343);
    public static final C008103m A0d = new C008103m((C009003z) null, (CharSequence) null, (Class) null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344);
    public static final C008103m A0e = new C008103m(4, (CharSequence) null);
    public static final C008103m A0f = new C008103m((C009003z) null, (CharSequence) null, C003101m.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349);
    public static final C008103m A0g = new C008103m(C002501e.class, (int) Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
    public static final C008103m A0h = new C008103m(AnonymousClass01X.class, 2097152);
    public static final C008103m A0i = new C008103m((C009003z) null, (CharSequence) null, (Class) null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342);
    public static final C008103m A0j;
    public static final C008103m A0k = new C008103m((C009003z) null, (CharSequence) null, (Class) null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356);
    public final int A00;
    public final C009003z A01;
    public final Class A02;
    public final Object A03;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7 = null;
        Class<AnonymousClass02K> cls = AnonymousClass02K.class;
        A0N = new C008103m((Class) cls, 256);
        A0V = new C008103m((Class) cls, 512);
        Class<AnonymousClass02I> cls2 = AnonymousClass02I.class;
        A0O = new C008103m((Class) cls2, 1024);
        A0W = new C008103m((Class) cls2, 2048);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8 = null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9 = null;
        A0S = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction, 16908358);
        if (i >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        A0P = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction2, 16908359);
        if (i >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        A0Q = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction3, 16908360);
        if (i >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        }
        A0R = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction9, 16908361);
        if (i >= 30) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction4 = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = null;
        A0U = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction4, 16908362);
        if (i >= 30) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        A0K = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction10, 16908372);
        if (i >= 32) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction5 = null;
        }
        A0G = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction5, 16908373);
        if (i >= 32) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction6 = null;
        }
        A0F = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction6, 16908374);
        if (i >= 32) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        A0E = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction8, 16908375);
        if (Build.VERSION.SDK_INT >= 33) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        }
        A0j = new C008103m((C009003z) null, (CharSequence) null, (Class) null, accessibilityAction7, 16908376);
    }

    public C008103m(int i, CharSequence charSequence) {
        this((C009003z) null, charSequence, (Class) null, (Object) null, i);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C008103m) && this.A03.equals(((C008103m) obj).A03);
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        String A002 = AccessibilityNodeInfoCompat.A00(this.A00);
        if (A002.equals("ACTION_UNKNOWN")) {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) this.A03;
            if (accessibilityAction.getLabel() != null) {
                A002 = accessibilityAction.getLabel().toString();
            }
        }
        return AnonymousClass00U.A0L("AccessibilityActionCompat: ", A002);
    }

    public C008103m(Class cls, int i) {
        this((C009003z) null, (CharSequence) null, cls, (Object) null, i);
    }

    public C008103m(C009003z r1, CharSequence charSequence, Class cls, Object obj, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A03 = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.A02 = cls;
    }
}
