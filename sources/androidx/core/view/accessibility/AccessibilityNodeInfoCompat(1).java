package androidx.core.view.accessibility;

import X.AnonymousClass00U;
import X.C007203d;
import X.C008103m;
import X.C008203o;
import X.C008303p;
import X.C009003z;
import X.C120447Av;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AccessibilityNodeInfoCompat {
    public int A00 = -1;
    public int A01 = -1;
    public final AccessibilityNodeInfo A02;

    public static String A00(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET /*16384*/:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case Constants.LOAD_RESULT_PGO_ATTEMPTED /*65536*/:
                return "ACTION_CUT";
            case Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP /*131072*/:
                return "ACTION_SET_SELECTION";
            case Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED /*262144*/:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void A07(View view) {
        this.A00 = -1;
        this.A02.setParent(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0029
            r2 = 0
            if (r5 == 0) goto L_0x0014
            boolean r0 = r5 instanceof androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            if (r0 == 0) goto L_0x0014
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r5
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.A02
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.A02
            if (r1 != 0) goto L_0x0015
            if (r0 == 0) goto L_0x001c
        L_0x0014:
            return r2
        L_0x0015:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001c
            return r2
        L_0x001c:
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x0014
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 == r0) goto L_0x0029
            return r2
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.AccessibilityNodeInfoCompat.equals(java.lang.Object):boolean");
    }

    private List A01(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final CharSequence A03() {
        if (!(!A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.A02.getText();
        }
        List A012 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List A013 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List A014 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List A015 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < A012.size(); i++) {
            spannableString.setSpan(new C007203d(this, ((Number) A015.get(i)).intValue(), accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Number) A012.get(i)).intValue(), ((Number) A013.get(i)).intValue(), ((Number) A014.get(i)).intValue());
        }
        return spannableString;
    }

    public final List A05() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.A02.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C008103m((C009003z) null, (CharSequence) null, (Class) null, actionList.get(i), 0));
        }
        return arrayList;
    }

    public final void A06(int i) {
        this.A02.addAction(i);
    }

    public final void A08(C008103m r3) {
        this.A02.addAction((AccessibilityNodeInfo.AccessibilityAction) r3.A03);
    }

    public final void A09(C008103m r3) {
        this.A02.removeAction((AccessibilityNodeInfo.AccessibilityAction) r3.A03);
    }

    public final void A0A(CharSequence charSequence) {
        this.A02.setClassName(charSequence);
    }

    public final void A0B(CharSequence charSequence) {
        this.A02.setContentDescription(charSequence);
    }

    public final void A0C(CharSequence charSequence) {
        this.A02.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final void A0E(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C008203o) obj).A00;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public final void A0F(Object obj) {
        this.A02.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C008303p) obj).A00);
    }

    public final void A0G(boolean z) {
        this.A02.setClickable(z);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        accessibilityNodeInfo.getBoundsInParent(rect);
        StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        accessibilityNodeInfo.getBoundsInScreen(rect);
        StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(A03());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(A04());
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append(AnonymousClass00U.A0o("; scrollable: ", accessibilityNodeInfo.isScrollable()));
        sb.append("; [");
        List A05 = A05();
        for (int i = 0; i < A05.size(); i++) {
            C008103m r2 = (C008103m) A05.get(i);
            String A002 = A00(((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getId());
            if (A002.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getLabel() != null) {
                A002 = ((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getLabel().toString();
            }
            sb.append(A002);
            if (i != A05.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public AccessibilityNodeInfoCompat(Object obj) {
        this.A02 = (AccessibilityNodeInfo) obj;
    }

    public final CharSequence A02() {
        boolean A002 = C120447Av.A00();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (A002) {
            return accessibilityNodeInfo.getStateDescription();
        }
        return accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public final String A04() {
        boolean A012 = C120447Av.A01();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (A012) {
            return accessibilityNodeInfo.getUniqueId();
        }
        return accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public final void A0D(CharSequence charSequence) {
        boolean A002 = C120447Av.A00();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (A002) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A02 = accessibilityNodeInfo;
    }
}
