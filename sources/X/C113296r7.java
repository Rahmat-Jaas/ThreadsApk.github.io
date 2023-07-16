package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6r7  reason: invalid class name and case insensitive filesystem */
public class C113296r7 {
    public Drawable A00(AnonymousClass3HX r15, C127397h3 r16, C127397h3 r17) {
        String str;
        String str2;
        GradientDrawable.Orientation orientation;
        int[] iArr;
        Drawable A00;
        Drawable A002;
        C127397h3 r2 = r16;
        int i = r2.A03;
        C127397h3 r3 = r17;
        if (i == 13318) {
            try {
                return C120507Be.A01(r15, r3, AnonymousClass7Kk.A04(C86114wI.A0m(r2.A04, 35)));
            } catch (C29721zB e) {
                e = e;
                str = "ColorDrawableUtils";
                str2 = "Error parsing color for ColorDrawable";
                C30967GcS.A01(r15, str, str2, e, 0);
                return new C86434xf();
            }
        } else if (i == 13322) {
            C127397h3 A05 = C127397h3.A05(r2);
            C127397h3 A0K = r2.A0K(36);
            if (A05 == null || A0K == null) {
                throw C18250wR.A0V("Gradient drawable received with null begin or end color");
            }
            C127397h3 A0K2 = r2.A0K(38);
            String A0C = C127397h3.A0C(r2);
            if (A0C == null) {
                try {
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                } catch (C29721zB e2) {
                    C30967GcS.A01(r15, "GradientDrawableUtils", "Error parsing orientation for GradientDrawable", e2, 0);
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                }
            } else {
                orientation = AnonymousClass7Kk.A0A(A0C);
            }
            int A003 = C101086Pv.A00(r15, A05, 0);
            int A004 = C101086Pv.A00(r15, A0K, 0);
            if (A0K2 != null) {
                iArr = new int[]{A003, C101086Pv.A00(r15, A0K2, 0), A004};
            } else {
                iArr = new int[]{A003, A004};
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            if (r17 == null) {
                return gradientDrawable;
            }
            try {
                float[] fArr = new float[8];
                C120517Bf.A01(fArr, C127397h3.A00(r3, 46), C120517Bf.A00(r3.A0R(56), 15));
                gradientDrawable.setCornerRadii(fArr);
                return gradientDrawable;
            } catch (C29721zB unused) {
                C30967GcS.A02("GradientDrawableUtils", "Error parsing Corner radius for Box decoration");
                return gradientDrawable;
            }
        } else if (i == 13330) {
            C127397h3 A052 = C127397h3.A05(r2);
            if (A052 == null) {
                C30967GcS.A02("RippleDrawableUtils", "Client received a RippleDrawable with null content");
            }
            if (A052 == null) {
                A00 = new ColorDrawable();
            } else {
                A00 = AnonymousClass794.A00().A07.A00(r15, A052, r3);
            }
            ShapeDrawable shapeDrawable = null;
            if (r17 != null) {
                float[] fArr2 = new float[8];
                try {
                    Arrays.fill(fArr2, C127397h3.A00(r3, 46));
                } catch (C29721zB unused2) {
                    C30967GcS.A02("RippleDrawableUtils", "Error parsing Corner radius for Box decoration");
                    Arrays.fill(fArr2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr2, (RectF) null, (float[]) null));
            }
            return new RippleDrawable(ColorStateList.valueOf(Color.parseColor(C127397h3.A0B(r2))), A00, shapeDrawable);
        } else if (i == 13332) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable[] drawableArr = new Drawable[6];
            List A0Q = r2.A0Q(35);
            for (int i2 = 0; i2 < A0Q.size(); i2++) {
                C127397h3 A0Q2 = C86154wM.A0Q(A0Q, i2);
                C127397h3 A0K3 = A0Q2.A0K(35);
                if (A0K3 == null) {
                    C30967GcS.A02("StateDrawableUtils", "Null Drawable model when creating children of a StateDrawable");
                    A002 = new ColorDrawable();
                } else {
                    A002 = AnonymousClass794.A00().A07.A00(r15, A0K3, r3);
                }
                String A0O = A0Q2.A0O(36, "");
                switch (A0O.hashCode()) {
                    case -691041417:
                        if (!A0O.equals("focused")) {
                            break;
                        } else {
                            drawableArr[1] = A002;
                            break;
                        }
                    case -318264286:
                        if (!A0O.equals("pressed")) {
                            break;
                        } else {
                            drawableArr[3] = A002;
                            break;
                        }
                    case 270940796:
                        if (!A0O.equals("disabled")) {
                            break;
                        } else {
                            drawableArr[4] = A002;
                            break;
                        }
                    case 1191572123:
                        if (!A0O.equals("selected")) {
                            break;
                        } else {
                            drawableArr[2] = A002;
                            break;
                        }
                    case 1544803905:
                        if (!A0O.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                            break;
                        } else {
                            drawableArr[0] = A002;
                            break;
                        }
                }
            }
            int i3 = 5;
            do {
                if (drawableArr[i3] != null) {
                    stateListDrawable.addState(AnonymousClass6YI.A00[i3], drawableArr[i3]);
                }
                i3--;
            } while (i3 >= 0);
            return stateListDrawable;
        } else if (i != 13340) {
            return new ColorDrawable();
        } else {
            try {
                return C120507Be.A01(r15, r3, C101086Pv.A00(r15, r2.A0K(35), 0));
            } catch (C29721zB e3) {
                e = e3;
                str = "ThemedColorDrawableUtils";
                str2 = "Parse error for ThemedColorDrawable";
                C30967GcS.A01(r15, str, str2, e, 0);
                return new C86434xf();
            }
        }
    }

    public boolean A01(C127397h3 r2) {
        return false;
    }
}
