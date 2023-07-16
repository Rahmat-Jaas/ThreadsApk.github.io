package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import go.Seq;

/* renamed from: X.7qc  reason: invalid class name and case insensitive filesystem */
public final class C130697qc implements C144558ih {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public View A0B;
    public ViewTreeObserver.OnPreDrawListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public final boolean Chx(AnonymousClass3HX r6, Object obj, int i) {
        if (i == 35) {
            float A002 = C18240wQ.A00(obj);
            this.A07 = A002;
            View view = this.A0B;
            if (view == null) {
                return true;
            }
            view.setScaleX(A002);
            return true;
        } else if (i == 36) {
            float A003 = C18240wQ.A00(obj);
            this.A08 = A003;
            View view2 = this.A0B;
            if (view2 == null) {
                return true;
            }
            view2.setScaleY(A003);
            return true;
        } else if (i == 38) {
            try {
                String str = (String) obj;
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (str != null) {
                    f = AnonymousClass7Kk.A01(str);
                }
                this.A09 = f;
                this.A0H = C86144wL.A1Y(str);
            } catch (C29721zB e) {
                C30967GcS.A01(r6, "ViewTransformsExtensionBinderUtils", "Could not parse translation_x value. ", e, 0);
            }
            View view3 = this.A0B;
            if (view3 == null) {
                return true;
            }
            float width = (float) view3.getWidth();
            float f2 = this.A09;
            view3.setTranslationX(C86154wM.A00(this.A0H ? 1 : 0, f2, width, f2));
            return true;
        } else if (i == 138) {
            float A004 = C18240wQ.A00(obj);
            this.A04 = A004;
            View view4 = this.A0B;
            if (view4 == null) {
                return true;
            }
            view4.setRotation(A004);
            return true;
        } else if (i != 141) {
            switch (i) {
                case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                    try {
                        String str2 = (String) obj;
                        float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        if (str2 != null) {
                            f3 = AnonymousClass7Kk.A01(str2);
                        }
                        this.A0A = f3;
                        this.A0I = C86144wL.A1Y(str2);
                    } catch (C29721zB e2) {
                        C30967GcS.A01(r6, "ViewTransformsExtensionBinderUtils", "Could not parse translation_y value. ", e2, 0);
                    }
                    View view5 = this.A0B;
                    if (view5 == null) {
                        return true;
                    }
                    float height = (float) view5.getHeight();
                    float f4 = this.A0A;
                    view5.setTranslationY(C86154wM.A00(this.A0I ? 1 : 0, f4, height, f4));
                    return true;
                case Seq.NULL_REFNUM /*41*/:
                    try {
                        String str3 = (String) obj;
                        this.A02 = AnonymousClass7Kk.A01(str3);
                        this.A0F = C86144wL.A1Y(str3);
                        this.A0E = true;
                    } catch (C29721zB e3) {
                        C30967GcS.A01(r6, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_x value. ", e3, 0);
                    }
                    View view6 = this.A0B;
                    if (view6 == null) {
                        return true;
                    }
                    float width2 = (float) view6.getWidth();
                    float f5 = this.A02;
                    view6.setPivotX(C86154wM.A00(this.A0F ? 1 : 0, f5, width2, f5));
                    return true;
                case Seq.RefTracker.REF_OFFSET /*42*/:
                    try {
                        String str4 = (String) obj;
                        this.A03 = AnonymousClass7Kk.A01(str4);
                        this.A0G = C86144wL.A1Y(str4);
                        this.A0E = true;
                    } catch (C29721zB e4) {
                        C30967GcS.A01(r6, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_y value. ", e4, 0);
                    }
                    View view7 = this.A0B;
                    if (view7 == null) {
                        return true;
                    }
                    float height2 = (float) view7.getHeight();
                    float f6 = this.A03;
                    view7.setPivotY(C86154wM.A00(this.A0G ? 1 : 0, f6, height2, f6));
                    return true;
                case 43:
                    float A005 = C18240wQ.A00(obj);
                    this.A01 = A005;
                    View view8 = this.A0B;
                    if (view8 == null) {
                        return true;
                    }
                    Context context = view8.getContext();
                    if (A005 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        A005 = 2.14748365E9f;
                    }
                    float f7 = C18230wP.A0E(context).density;
                    view8.setCameraDistance(f7 * f7 * (-A005) * AnonymousClass6YK.A00);
                    return true;
                case 44:
                    float A006 = C18240wQ.A00(obj);
                    this.A05 = A006;
                    View view9 = this.A0B;
                    if (view9 == null) {
                        return true;
                    }
                    view9.setRotationX(A006);
                    return true;
                case 45:
                    float A007 = C18240wQ.A00(obj);
                    this.A06 = A007;
                    View view10 = this.A0B;
                    if (view10 == null) {
                        return true;
                    }
                    view10.setRotationY(A007);
                    return true;
                default:
                    return false;
            }
        } else {
            float A008 = C18240wQ.A00(obj);
            this.A00 = A008;
            View view11 = this.A0B;
            if (view11 == null) {
                return true;
            }
            view11.setAlpha(A008);
            return true;
        }
    }
}
