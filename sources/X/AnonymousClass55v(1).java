package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.instagram.barcelona.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.55v  reason: invalid class name */
public class AnonymousClass55v extends C879455k {
    public static int A05 = 1056964608;
    public static final HashMap A06;
    public View A00;
    public Handler A01 = new AnonymousClass4z8(this);
    public final View A02;
    public final C104736cI A03;
    public final HashMap A04 = AnonymousClass0wJ.A0y();

    public static boolean A05(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility != 4 && (importantForAccessibility != 2 || accessibilityNodeInfoCompat.A02.getChildCount() > 0)) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
            if ((accessibilityNodeInfo.getCollectionInfo() == null && (!TextUtils.isEmpty(accessibilityNodeInfoCompat.A03()) || !TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription()) || !TextUtils.isEmpty(accessibilityNodeInfo.getHintText()))) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.A02()) || accessibilityNodeInfo.isCheckable()) {
                return true;
            }
            AccessibilityNodeInfo.RangeInfo rangeInfo = accessibilityNodeInfo.getRangeInfo();
            if (rangeInfo != null) {
                float max = rangeInfo.getMax();
                float min = rangeInfo.getMin();
                float current = rangeInfo.getCurrent();
                if (max - min > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && current >= min && current <= max) {
                    return true;
                }
            }
            if (accessibilityNodeInfo.isCheckable()) {
                return true;
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
                        if (accessibilityNodeInfo2.isVisibleToUser() && !A06(A0L) && A05(childAt, A0L)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean A06(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
        if (!accessibilityNodeInfo.isVisibleToUser()) {
            return false;
        }
        if (!accessibilityNodeInfo.isScreenReaderFocusable() && !accessibilityNodeInfo.isClickable() && !accessibilityNodeInfo.isLongClickable() && !accessibilityNodeInfo.isFocusable()) {
            List A052 = accessibilityNodeInfoCompat.A05();
            return C86144wL.A1W(16, A052) || C86144wL.A1W(32, A052) || C86144wL.A1W(1, A052);
        }
    }

    public static CharSequence A01(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3;
        if (accessibilityNodeInfoCompat == null) {
            accessibilityNodeInfoCompat2 = null;
            accessibilityNodeInfoCompat3 = C86144wL.A0L();
            try {
                view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat3.A02);
            } catch (NullPointerException unused) {
            }
        } else {
            accessibilityNodeInfoCompat3 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.A02));
        }
        accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat3;
        if (accessibilityNodeInfoCompat2 != null) {
            CharSequence contentDescription = accessibilityNodeInfoCompat2.A02.getContentDescription();
            CharSequence A032 = accessibilityNodeInfoCompat2.A03();
            boolean A1W = C18180wK.A1W(TextUtils.isEmpty(A032) ? 1 : 0);
            boolean z = view instanceof EditText;
            StringBuilder A0r = C18200wM.A0r();
            if (!TextUtils.isEmpty(contentDescription) && (!z || !A1W)) {
                A0r.append(contentDescription);
                return A0r;
            } else if (A1W) {
                A0r.append(A032);
                return A0r;
            } else if (view instanceof ViewGroup) {
                StringBuilder A0r2 = C18200wM.A0r();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    AccessibilityNodeInfoCompat A0L = C86144wL.A0L();
                    childAt.onInitializeAccessibilityNodeInfo(A0L.A02);
                    if (A05(childAt, A0L) && !A06(A0L)) {
                        CharSequence A012 = A01(childAt, (AccessibilityNodeInfoCompat) null);
                        if (!TextUtils.isEmpty(A012)) {
                            StringBuilder A0r3 = C18200wM.A0r();
                            A0r3.append(A012);
                            A0r2.append(C18180wK.A0i(", ", A0r3));
                        }
                    }
                }
                int length = A0r2.length();
                if (length > 0) {
                    A0r2.delete(length - 2, length);
                }
                return A0r2.toString();
            }
        }
        return null;
    }

    public boolean A0M(View view, int i, Bundle bundle) {
        if (i == 524288) {
            view.setTag(R.id.accessibility_state_expanded, C18180wK.A0X());
        }
        if (i == 262144) {
            view.setTag(R.id.accessibility_state_expanded, true);
        }
        HashMap hashMap = this.A04;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("actionName", C18240wQ.A0f(valueOf, hashMap));
            IPF ipf = (IPF) view.getContext();
            if (ipf.A0C()) {
                int id = view.getId();
                int A002 = UIManagerHelper.A00(ipf);
                int i2 = 2;
                if (id % 2 != 0) {
                    i2 = 1;
                }
                L4T A032 = UIManagerHelper.A03(ipf, i2, true);
                if (A032 != null) {
                    ((UIManagerModule) A032).mEventDispatcher.AIG(new C90765f1(writableNativeMap, this, A002, id));
                }
            } else {
                ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new C33107Hgp(I17.A00(368)));
            }
            Object tag = view.getTag(R.id.accessibility_role);
            ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
            if (tag != AnonymousClass69X.A01 || (i != ((AccessibilityNodeInfo.AccessibilityAction) C008103m.A0Z.A03).getId() && i != ((AccessibilityNodeInfo.AccessibilityAction) C008103m.A0X.A03).getId())) {
                return true;
            }
            if (readableMap != null && !readableMap.hasKey("text")) {
                Handler handler = this.A01;
                if (handler.hasMessages(1, view)) {
                    handler.removeMessages(1, view);
                }
                handler.sendMessageDelayed(handler.obtainMessage(1, view), 200);
            }
        }
        return super.A0M(view, i, bundle);
    }

    public final C008703u A0P(View view) {
        if (this.A03 != null) {
            return super.A0P(view);
        }
        return null;
    }

    public final Object A0d(Class cls, int i, int i2) {
        View view = this.A02;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) textView.getText()).getSpans(i, i2, cls);
        if (spans.length > 0) {
            return spans[0];
        }
        return null;
    }

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A06 = A0y;
        A0y.put("activate", C86134wK.A0c(C008103m.A08));
        A0y.put("longpress", C86134wK.A0c(C008103m.A0L));
        A0y.put("increment", C86134wK.A0c(C008103m.A0Z));
        A0y.put("decrement", C86134wK.A0c(C008103m.A0X));
        A0y.put("expand", C86134wK.A0c(C008103m.A0H));
        A0y.put("collapse", C86134wK.A0c(C008103m.A09));
    }

    public AnonymousClass55v(View view, int i, boolean z) {
        super(view);
        this.A02 = view;
        view.setFocusable(z);
        view.setImportantForAccessibility(i);
        this.A03 = (C104736cI) view.getTag(R.id.accessibility_links);
    }

    public static void A03(Context context, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AnonymousClass69X r4) {
        int i;
        accessibilityNodeInfoCompat.A0A(AnonymousClass69X.A03(r4));
        if (r4.equals(AnonymousClass69X.A0A)) {
            i = 2131829647;
        } else if (r4.equals(AnonymousClass69X.A08)) {
            i = 2131828949;
        } else {
            if (r4.equals(AnonymousClass69X.A09)) {
                accessibilityNodeInfoCompat.A0C(context.getString(2131828963));
            } else if (!r4.equals(AnonymousClass69X.A03)) {
                if (r4.equals(AnonymousClass69X.A0R)) {
                    accessibilityNodeInfoCompat.A0G(true);
                    accessibilityNodeInfoCompat.A02.setCheckable(true);
                    return;
                } else if (r4.equals(AnonymousClass69X.A0M)) {
                    i = 2131836419;
                } else if (r4.equals(AnonymousClass69X.A07)) {
                    accessibilityNodeInfoCompat.A02.setHeading(true);
                    return;
                } else if (r4.equals(AnonymousClass69X.A02)) {
                    i = 2131821264;
                } else if (r4.equals(AnonymousClass69X.A05)) {
                    i = 2131824137;
                } else if (r4.equals(AnonymousClass69X.A0C)) {
                    i = 2131830399;
                } else if (r4.equals(AnonymousClass69X.A0D)) {
                    i = 2131830414;
                } else if (r4.equals(AnonymousClass69X.A0E)) {
                    i = 2131830415;
                } else if (r4.equals(AnonymousClass69X.A0G)) {
                    i = 2131833049;
                } else if (r4.equals(AnonymousClass69X.A0I)) {
                    i = 2131833991;
                } else if (r4.equals(AnonymousClass69X.A0J)) {
                    i = 2131835292;
                } else if (r4.equals(AnonymousClass69X.A0L)) {
                    i = 2131836084;
                } else if (r4.equals(AnonymousClass69X.A0O)) {
                    i = 2131834976;
                } else if (r4.equals(AnonymousClass69X.A0P)) {
                    i = 2131836539;
                } else if (r4.equals(AnonymousClass69X.A0Q)) {
                    i = 2131836832;
                } else if (r4.equals(AnonymousClass69X.A0S)) {
                    i = 2131836883;
                } else {
                    return;
                }
            }
            accessibilityNodeInfoCompat.A0G(true);
            return;
        }
        accessibilityNodeInfoCompat.A0C(context.getString(i));
    }

    public static void A04(View view, int i, boolean z) {
        if (C006702y.A00(view) != null) {
            return;
        }
        if (view.getTag(R.id.accessibility_role) != null || view.getTag(R.id.accessibility_state) != null || view.getTag(R.id.accessibility_actions) != null || view.getTag(R.id.react_test_id) != null || view.getTag(R.id.accessibility_collection_item) != null || view.getTag(R.id.accessibility_links) != null || view.getTag(R.id.role) != null) {
            C006702y.A0C(view, new AnonymousClass55v(view, i, z));
        }
    }

    public final void A0I(View view, AccessibilityEvent accessibilityEvent) {
        ReadableType readableType;
        super.A0I(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            C33887HwO dynamic = readableMap.getDynamic("min");
            C33887HwO dynamic2 = readableMap.getDynamic("now");
            C33887HwO dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null && dynamic.BIb() == (readableType = ReadableType.Number) && dynamic2 != null && dynamic2.BIb() == readableType && dynamic3 != null && dynamic3.BIb() == readableType) {
                int A9a = dynamic.A9a();
                int A9a2 = dynamic2.A9a();
                int A9a3 = dynamic3.A9a();
                if (A9a3 > A9a && A9a2 >= A9a && A9a3 >= A9a2) {
                    accessibilityEvent.setItemCount(A9a3 - A9a);
                    accessibilityEvent.setCurrentItemIndex(A9a2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021a, code lost:
        if (r1 == false) goto L_0x021c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(android.view.View r14, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r15) {
        /*
            r13 = this;
            super.A0L(r14, r15)
            r1 = 2131296346(0x7f09005a, float:1.8210606E38)
            java.lang.Object r0 = r14.getTag(r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r14.getTag(r1)
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r1 == 0) goto L_0x001a
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x001a:
            r15.A06(r0)
        L_0x001d:
            X.69X r5 = X.AnonymousClass69X.A00(r14)
            r0 = 2131296339(0x7f090053, float:1.8210592E38)
            java.lang.Object r1 = r14.getTag(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r5 == 0) goto L_0x0033
            android.content.Context r0 = r14.getContext()
            A03(r0, r15, r5)
        L_0x0033:
            if (r1 == 0) goto L_0x003a
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A02
            r0.setTooltipText(r1)
        L_0x003a:
            r0 = 2131302335(0x7f0917bf, float:1.8222753E38)
            java.lang.Object r12 = r14.getTag(r0)
            if (r12 == 0) goto L_0x0057
            android.view.View r1 = r14.getRootView()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            android.view.View r1 = X.AnonymousClass3XF.A00(r1, r0)
            r13.A00 = r1
            if (r1 == 0) goto L_0x0057
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A02
            r0.setLabeledBy(r1)
        L_0x0057:
            r0 = 2131296345(0x7f090059, float:1.8210604E38)
            java.lang.Object r4 = r14.getTag(r0)
            com.facebook.react.bridge.ReadableMap r4 = (com.facebook.react.bridge.ReadableMap) r4
            if (r4 == 0) goto L_0x00eb
            android.content.Context r6 = r14.getContext()
            com.facebook.react.bridge.ReadableMapKeySetIterator r7 = r4.keySetIterator()
        L_0x006a:
            boolean r0 = r7.BOO()
            if (r0 == 0) goto L_0x00eb
            java.lang.String r2 = r7.Bhr()
            X.HwO r3 = r4.getDynamic(r2)
            java.lang.String r0 = "selected"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0092
            com.facebook.react.bridge.ReadableType r1 = r3.BIb()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Boolean
            if (r1 != r0) goto L_0x0092
            boolean r1 = r3.A9L()
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A02
            r0.setSelected(r1)
            goto L_0x006a
        L_0x0092:
            java.lang.String r0 = "disabled"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ae
            com.facebook.react.bridge.ReadableType r1 = r3.BIb()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Boolean
            if (r1 != r0) goto L_0x00ae
            boolean r0 = r3.A9L()
            r1 = r0 ^ 1
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A02
            r0.setEnabled(r1)
            goto L_0x006a
        L_0x00ae:
            java.lang.String r0 = "checked"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006a
            com.facebook.react.bridge.ReadableType r1 = r3.BIb()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Boolean
            if (r1 != r0) goto L_0x006a
            boolean r3 = r3.A9L()
            r0 = 1
            android.view.accessibility.AccessibilityNodeInfo r2 = r15.A02
            r2.setCheckable(r0)
            r2.setChecked(r3)
            java.lang.CharSequence r1 = r2.getClassName()
            X.69X r0 = X.AnonymousClass69X.A0N
            java.lang.String r0 = X.AnonymousClass69X.A03(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006a
            r0 = 2131836110(0x7f113cce, float:1.9305378E38)
            if (r3 == 0) goto L_0x00e3
            r0 = 2131836111(0x7f113ccf, float:1.930538E38)
        L_0x00e3:
            java.lang.String r0 = r6.getString(r0)
            r2.setText(r0)
            goto L_0x006a
        L_0x00eb:
            r0 = 2131296304(0x7f090030, float:1.821052E38)
            java.lang.Object r3 = r14.getTag(r0)
            com.facebook.react.bridge.ReadableArray r3 = (com.facebook.react.bridge.ReadableArray) r3
            r0 = 2131296306(0x7f090032, float:1.8210525E38)
            java.lang.Object r8 = r14.getTag(r0)
            com.facebook.react.bridge.ReadableMap r8 = (com.facebook.react.bridge.ReadableMap) r8
            if (r8 == 0) goto L_0x0129
            java.lang.String r0 = "rowIndex"
            int r7 = r8.getInt(r0)
            java.lang.String r0 = "columnIndex"
            int r6 = r8.getInt(r0)
            java.lang.String r0 = "rowSpan"
            int r2 = r8.getInt(r0)
            java.lang.String r0 = "columnSpan"
            int r1 = r8.getInt(r0)
            java.lang.String r0 = "heading"
            boolean r0 = r8.getBoolean(r0)
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r7, r2, r6, r1, r0)
            X.03p r0 = new X.03p
            r0.<init>(r1)
            r15.A0F(r0)
        L_0x0129:
            r11 = 1
            if (r3 == 0) goto L_0x018d
            r8 = 0
        L_0x012d:
            int r0 = r3.size()
            if (r8 >= r0) goto L_0x018d
            com.facebook.react.bridge.ReadableMap r10 = r3.getMap(r8)
            java.lang.String r9 = "name"
            boolean r0 = r10.hasKey(r9)
            if (r0 == 0) goto L_0x0186
            int r7 = A05
            java.lang.String r1 = "label"
            boolean r0 = r10.hasKey(r1)
            if (r0 == 0) goto L_0x0184
            java.lang.String r6 = r10.getString(r1)
        L_0x014d:
            java.util.HashMap r1 = A06
            java.lang.String r0 = r10.getString(r9)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = r10.getString(r9)
            java.lang.Object r0 = r1.get(r0)
            int r7 = X.AnonymousClass0wJ.A04(r0)
        L_0x0165:
            java.util.HashMap r2 = r13.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = r10.getString(r9)
            r2.put(r1, r0)
            X.03m r0 = new X.03m
            r0.<init>((int) r7, (java.lang.CharSequence) r6)
            r15.A08(r0)
            int r8 = r8 + 1
            goto L_0x012d
        L_0x017d:
            int r0 = A05
            int r0 = r0 + 1
            A05 = r0
            goto L_0x0165
        L_0x0184:
            r6 = 0
            goto L_0x014d
        L_0x0186:
            java.lang.String r0 = "Unknown accessibility action."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x018d:
            r0 = 2131296347(0x7f09005b, float:1.8210608E38)
            java.lang.Object r8 = r14.getTag(r0)
            com.facebook.react.bridge.ReadableMap r8 = (com.facebook.react.bridge.ReadableMap) r8
            if (r8 == 0) goto L_0x01f5
            java.lang.String r2 = "min"
            boolean r0 = r8.hasKey(r2)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r6 = "now"
            boolean r0 = r8.hasKey(r6)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r1 = "max"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L_0x01f5
            X.HwO r2 = r8.getDynamic(r2)
            X.HwO r7 = r8.getDynamic(r6)
            X.HwO r6 = r8.getDynamic(r1)
            if (r2 == 0) goto L_0x01f5
            com.facebook.react.bridge.ReadableType r0 = r2.BIb()
            com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number
            if (r0 != r1) goto L_0x01f5
            if (r7 == 0) goto L_0x01f5
            com.facebook.react.bridge.ReadableType r0 = r7.BIb()
            if (r0 != r1) goto L_0x01f5
            if (r6 == 0) goto L_0x01f5
            com.facebook.react.bridge.ReadableType r0 = r6.BIb()
            if (r0 != r1) goto L_0x01f5
            int r2 = r2.A9a()
            int r1 = r7.A9a()
            int r0 = r6.A9a()
            if (r0 <= r2) goto L_0x01f5
            if (r1 < r2) goto L_0x01f5
            if (r0 < r1) goto L_0x01f5
            float r6 = (float) r2
            float r2 = (float) r0
            float r1 = (float) r1
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r1 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r0, r6, r2, r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A02
            r0.setRangeInfo(r1)
        L_0x01f5:
            r0 = 2131305298(0x7f092352, float:1.8228763E38)
            java.lang.Object r1 = r14.getTag(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0205
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A02
            r0.setViewIdResourceName(r1)
        L_0x0205:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.A02
            java.lang.CharSequence r0 = r0.getContentDescription()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.CharSequence r0 = r15.A03()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x021c
            r0 = 1
            if (r1 != 0) goto L_0x021d
        L_0x021c:
            r0 = 0
        L_0x021d:
            if (r3 != 0) goto L_0x0226
            if (r4 != 0) goto L_0x0226
            if (r12 != 0) goto L_0x0226
            if (r5 != 0) goto L_0x0226
            r11 = 0
        L_0x0226:
            if (r0 == 0) goto L_0x0231
            if (r11 == 0) goto L_0x0231
            java.lang.CharSequence r0 = A01(r14, r15)
            r15.A0B(r0)
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55v.A0L(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }
}
