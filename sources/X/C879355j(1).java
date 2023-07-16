package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.55j  reason: invalid class name and case insensitive filesystem */
public final class C879355j extends C003201n {
    public static final Map A05;
    public static final Map A06;
    public static final Map A07;
    public static final Map A08;
    public int A00 = 1056964608;
    public final C127397h3 A01;
    public final AnonymousClass3HX A02;
    public final C127397h3 A03;
    public final Map A04;

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Number A0j;
        Number A0j2;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        super.A0L(view, accessibilityNodeInfoCompat2);
        C127397h3 r2 = this.A01;
        boolean A002 = AnonymousClass2LL.A00(C127397h3.A0A(r2, 41), false);
        boolean A003 = AnonymousClass2LL.A00(C127397h3.A0A(r2, 49), false);
        boolean A004 = AnonymousClass2LL.A00(C127397h3.A0A(r2, 51), false);
        boolean A005 = AnonymousClass2LL.A00(C127397h3.A0A(r2, 36), false);
        SparseArray sparseArray = r2.A04;
        String A0m = C86114wI.A0m(sparseArray, 50);
        String A0m2 = C86114wI.A0m(sparseArray, 45);
        String A0m3 = C86114wI.A0m(sparseArray, 46);
        String A0m4 = C86114wI.A0m(sparseArray, 58);
        String A0m5 = C86114wI.A0m(sparseArray, 57);
        C127397h3 A0K = r2.A0K(52);
        C127397h3 A0K2 = r2.A0K(53);
        C127397h3 A0K3 = r2.A0K(54);
        if (A0K != null) {
            String A0m6 = C86114wI.A0m(A0K.A04, 40);
            float A0G = A0K.A0G(38, -1.0f);
            float A0G2 = A0K.A0G(36, -1.0f);
            float A0G3 = A0K.A0G(35, -1.0f);
            if (A0G >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A0G3 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A0G2 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (A0j2 = C86124wJ.A0j(A0m6, A07)) != null) {
                accessibilityNodeInfoCompat2.A02.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(A0j2.intValue(), A0G, A0G2, A0G3));
            }
        }
        if (A0K2 != null) {
            int A0H = A0K2.A0H(35, -1);
            int A0H2 = A0K2.A0H(38, -1);
            boolean A006 = AnonymousClass2LL.A00(C127397h3.A0A(A0K2, 36), false);
            String A0O = A0K2.A0O(40, NetInfoModule.CONNECTION_TYPE_NONE);
            if (A0H >= -1 && A0H2 >= -1 && (A0j = C86124wJ.A0j(A0O, A06)) != null) {
                accessibilityNodeInfoCompat2.A0E(new C008203o(AccessibilityNodeInfo.CollectionInfo.obtain(A0H2, A0H, A006, A0j.intValue())));
            }
        }
        if (A0K3 != null) {
            int A0H3 = A0K3.A0H(35, -1);
            int A0H4 = A0K3.A0H(38, -1);
            int A0H5 = A0K3.A0H(36, -1);
            int A0H6 = A0K3.A0H(40, -1);
            if (A0H3 >= 0 && A0H4 >= 0 && A0H5 >= 0 && A0H6 >= 0) {
                accessibilityNodeInfoCompat2.A0F(new C008303p(AccessibilityNodeInfo.CollectionItemInfo.obtain(A0H4, A0H6, A0H3, A0H5, A002, A003)));
            }
        }
        Iterator A14 = C86104wH.A14(this.A04);
        while (A14.hasNext()) {
            C109296jm r5 = (C109296jm) A14.next();
            int i = r5.A00;
            Map map = A05;
            if (map.containsKey("click") && i == AnonymousClass0wJ.A04(map.get("click"))) {
                accessibilityNodeInfoCompat2.A0G(true);
            } else if (map.containsKey("long_click") && i == AnonymousClass0wJ.A04(map.get("long_click"))) {
                accessibilityNodeInfoCompat2.A02.setLongClickable(true);
            }
            String str = r5.A02;
            if (str != null) {
                accessibilityNodeInfoCompat2.A08(new C008103m(i, (CharSequence) str));
            } else {
                accessibilityNodeInfoCompat2.A06(i);
            }
        }
        if (A004) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat2.A02;
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(A005);
        }
        if (A0m != null) {
            accessibilityNodeInfoCompat2.A02.setTooltipText(A0m);
        }
        if (A0m2 != null && !A0m2.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            Map map2 = A08;
            if (map2.containsKey(A0m2)) {
                accessibilityNodeInfoCompat2.A0A((CharSequence) map2.get(A0m2));
            }
        }
        if (A0m3 != null) {
            accessibilityNodeInfoCompat2.A0C(A0m3);
        }
        if (A0m4 != null) {
            accessibilityNodeInfoCompat2.A0D(A0m4);
        }
        if (A0m5 != null && !A0m5.isEmpty()) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat2.A02;
            accessibilityNodeInfo2.setContentInvalid(true);
            accessibilityNodeInfo2.setError(A0m5);
        }
    }

    public final boolean A0M(View view, int i, Bundle bundle) {
        C109326jp r3;
        String str;
        C109296jm r0 = (C109296jm) C18200wM.A0f(this.A04, i);
        if (r0 == null || (r3 = r0.A01) == null) {
            return super.A0M(view, i, bundle);
        }
        C127397h3 r2 = this.A03;
        Object A032 = C122047Jt.A03(this.A02, r2, C86154wM.A0S(AnonymousClass3VO.A00(), r2, 0), r3);
        if ((A032 instanceof Number) || (A032 instanceof Boolean)) {
            return AnonymousClass3WF.A02(A032);
        }
        StringBuilder A0r = C18200wM.A0r();
        if (A032 != null) {
            str = "Got a non-boolean result while evaluating action ";
        } else {
            str = "Got a null result while evaluating action ";
        }
        C30967GcS.A02("bk.components.AndroidNativeAccessibilityExtension", C86104wH.A10(str, A0r, i));
        return false;
    }

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("button", "android.widget.Button");
        A0y.put("checkbox", "android.widget.CompoundButton");
        A0y.put("checked_text_view", "android.widget.CheckedTextView");
        A0y.put("drop_down_list", "android.widget.Spinner");
        A0y.put("edit_text", "android.widget.EditText");
        A0y.put("grid", "android.widget.GridView");
        A0y.put("image", "android.widget.ImageView");
        A0y.put("list", "android.widget.AbsListView");
        A0y.put("pager", "androidx.viewpager.widget.ViewPager");
        A0y.put("radio_button", "android.widget.RadioButton");
        A0y.put("seek_control", "android.widget.SeekBar");
        A0y.put("switch", "android.widget.Switch");
        A0y.put("tab_bar", "android.widget.TabWidget");
        A0y.put("toggle_button", "android.widget.ToggleButton");
        A0y.put("view_group", "android.view.ViewGroup");
        A0y.put("web_view", "android.webkit.WebView");
        A0y.put("progress_bar", "android.widget.ProgressBar");
        A0y.put("action_bar_tab", "android.app.ActionBar$Tab");
        A0y.put("drawer_layout", "androidx.drawerlayout.widget.DrawerLayout");
        A0y.put("sliding_drawer", "android.widget.SlidingDrawer");
        A0y.put("icon_menu", "com.android.internal.view.menu.IconMenuView");
        A0y.put("toast", "android.widget.Toast$TN");
        A0y.put("alert_dialog", "android.app.AlertDialog");
        A0y.put("date_picker_dialog", "android.app.DatePickerDialog");
        A0y.put("time_picker_dialog", "android.app.TimePickerDialog");
        A0y.put("date_picker", "android.widget.DatePicker");
        A0y.put("time_picker", "android.widget.TimePicker");
        A0y.put("number_picker", "android.widget.NumberPicker");
        A0y.put("scroll_view", "android.widget.ScrollView");
        A0y.put("horizontal_scroll_view", "android.widget.HorizontalScrollView");
        A0y.put("keyboard_key", "android.inputmethodservice.Keyboard$Key");
        A0y.put(NetInfoModule.CONNECTION_TYPE_NONE, "");
        A08 = Collections.unmodifiableMap(A0y);
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        A0y2.put("click", A00(C008103m.A08));
        A0y2.put("long_click", A00(C008103m.A0L));
        A0y2.put("scroll_forward", A00(C008103m.A0Z));
        A0y2.put("scroll_backward", A00(C008103m.A0X));
        A0y2.put("expand", A00(C008103m.A0H));
        A0y2.put("collapse", A00(C008103m.A09));
        A0y2.put("dismiss", A00(C008103m.A0D));
        A0y2.put("scroll_up", A00(C008103m.A0d));
        A0y2.put("scroll_left", A00(C008103m.A0a));
        A0y2.put("scroll_down", A00(C008103m.A0Y));
        A0y2.put("scroll_right", A00(C008103m.A0b));
        A0y2.put("custom", C86144wL.A0b());
        A05 = Collections.unmodifiableMap(A0y2);
        HashMap A0y3 = AnonymousClass0wJ.A0y();
        Integer A0X = C86154wM.A0X();
        A0y3.put("percent", A0X);
        A0y3.put("float", 1);
        Integer A0d = C18220wO.A0d();
        A0y3.put("int", A0d);
        A07 = Collections.unmodifiableMap(A0y3);
        HashMap A0y4 = AnonymousClass0wJ.A0y();
        A0y4.put(NetInfoModule.CONNECTION_TYPE_NONE, A0d);
        A0y4.put("single", 1);
        A0y4.put("multiple", A0X);
        A06 = Collections.unmodifiableMap(A0y4);
    }

    public C879355j(AnonymousClass3HX r9, C127397h3 r10, C127397h3 r11) {
        this.A01 = r10;
        this.A03 = r11;
        this.A02 = r9;
        HashMap A0y = AnonymousClass0wJ.A0y();
        List A0Q = r10.A0Q(55);
        if (A0Q != null && !A0Q.isEmpty()) {
            Iterator it = A0Q.iterator();
            while (it.hasNext()) {
                C127397h3 A0V = C86144wL.A0V(it);
                String A0o = C18220wO.A0o(A0V);
                String A0o2 = C18230wP.A0o(A0V);
                C109326jp A0L = A0V.A0L(38);
                if (A0o != null) {
                    Map map = A05;
                    if (map.containsKey(A0o)) {
                        int A042 = AnonymousClass0wJ.A04(map.get(A0o));
                        if (map.containsKey("custom") && A042 == AnonymousClass0wJ.A04(map.get("custom"))) {
                            A042 = this.A00;
                            this.A00 = A042 + 1;
                        }
                        A0y.put(Integer.valueOf(A042), new C109296jm(A0L, A0o2, A042));
                    }
                }
            }
        }
        this.A04 = A0y;
    }

    public static Integer A00(C008103m r0) {
        AnonymousClass0SJ.A00(r0);
        return Integer.valueOf(((AccessibilityNodeInfo.AccessibilityAction) r0.A03).getId());
    }
}
