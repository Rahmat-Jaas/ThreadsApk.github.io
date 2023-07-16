package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.6Hk  reason: invalid class name and case insensitive filesystem */
public final class C98916Hk {
    public static void A00(Context context, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -2137403731:
                    if (str.equals("Header")) {
                        c = 0;
                        break;
                    }
                    break;
                case -565577257:
                    if (str.equals("Image Button")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2368538:
                    if (str.equals("Link")) {
                        c = 2;
                        break;
                    }
                    break;
                case 70760763:
                    if (str.equals("Image")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109450440:
                    if (str.equals("Tab Bar")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1404906583:
                    if (str.equals("Selected Button")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2001146706:
                    if (str.equals("Button")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            String str2 = "android.widget.Button";
            switch (c) {
                case 0:
                    accessibilityNodeInfoCompat.A02.setHeading(true);
                    if (view != null) {
                        C006702y.A0G(view, true);
                        return;
                    }
                    return;
                case 1:
                case 6:
                    break;
                case 2:
                    accessibilityNodeInfoCompat.A0A(str2);
                    accessibilityNodeInfoCompat.A0C(context.getString(2131820826));
                    return;
                case 3:
                    accessibilityNodeInfoCompat.A0A("android.widget.ImageView");
                    accessibilityNodeInfoCompat.A09(C008103m.A0e);
                    return;
                case 4:
                    str2 = "android.widget.TabWidget";
                    break;
                case 5:
                    accessibilityNodeInfoCompat.A0A(str2);
                    accessibilityNodeInfoCompat.A02.setSelected(true);
                    return;
                default:
                    return;
            }
            accessibilityNodeInfoCompat.A0A(str2);
        }
    }
}
