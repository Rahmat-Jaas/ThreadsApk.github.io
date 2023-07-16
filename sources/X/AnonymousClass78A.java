package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.HashMap;

/* renamed from: X.78A  reason: invalid class name */
public final class AnonymousClass78A {
    public AnonymousClass7J7 A00;
    public AnonymousClass7J7 A01;
    public final C112806qE A02;
    public final C107006fz A03;
    public final AnonymousClass3HX A04;

    public final AnonymousClass7Di A01(View view, C127397h3 r37) {
        int i;
        int i2;
        int A042;
        C127397h3 r21 = r37;
        C127397h3 A0K = r21.A0K(43);
        if (A0K != null) {
            float A002 = AnonymousClass6Q2.A00(A0K, 49);
            float A003 = AnonymousClass6Q2.A00(A0K, 43);
            View view2 = view;
            Resources resources = view2.getResources();
            AnonymousClass3HX r1 = this.A04;
            AnonymousClass3HX r34 = r1;
            Context context = r1.A00;
            Context context2 = context;
            C04220Ms.A06(context2);
            float min = Math.min(((float) resources.getDisplayMetrics().widthPixels) * 0.8f, AnonymousClass6QB.A00(context, 300.0f));
            if (A002 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                i = (int) min;
                i2 = Process.WAIT_RESULT_TIMEOUT;
            } else {
                i = (int) A002;
                i2 = 1073741824;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, i2);
            if (A003 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                A042 = AnonymousClass7I7.A00;
            } else {
                A042 = C86134wK.A04((int) A003);
            }
            C112806qE r12 = this.A02;
            C112806qE r32 = r12;
            r12.A00 = null;
            AnonymousClass7J7 A032 = AnonymousClass7J7.A03(AnonymousClass7J7.A00(context2, this.A01, r34, (M4z[]) null, -1), A0K, (Object) null, makeMeasureSpec, A042);
            this.A01 = A032;
            AnonymousClass7Di r13 = A032.A02;
            C04220Ms.A06(r13);
            Rect rect = r13.A04.A04;
            int width = rect.width();
            int height = rect.height();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            C115376ux r11 = new C115376ux(displayMetrics.widthPixels, displayMetrics.heightPixels, iArr[0], iArr[1], view2.getWidth(), view2.getHeight(), width, height, AnonymousClass6Q3.A00(C18190wL.A0A(view2)));
            C107006fz r112 = this.A03;
            HashMap hashMap = r112.A01;
            HashMap hashMap2 = hashMap;
            C115246uk r9 = (C115246uk) hashMap.get(r11);
            if (r9 == null) {
                C109326jp A0L = r21.A0L(40);
                if (A0L != null) {
                    AnonymousClass3HX r113 = r112.A00;
                    Context context3 = r113.A00;
                    C04220Ms.A06(context3);
                    AnonymousClass3VO A004 = AnonymousClass3VO.A00();
                    C86144wL.A1L(A004, (float) r11.A05, C18230wP.A0E(context3).density, 0);
                    C86144wL.A1L(A004, (float) r11.A04, C18230wP.A0E(context3).density, 1);
                    C86144wL.A1L(A004, (float) r11.A02, C18230wP.A0E(context3).density, 2);
                    A004.A02(Float.valueOf(((float) r11.A03) / C18230wP.A0E(context3).density), 3);
                    A004.A02(Float.valueOf(((float) r11.A01) / C18230wP.A0E(context3).density), 4);
                    A004.A02(Float.valueOf(((float) r11.A00) / C18230wP.A0E(context3).density), 5);
                    A004.A02(Float.valueOf(((float) r11.A07) / C18230wP.A0E(context3).density), 6);
                    A004.A02(Float.valueOf(((float) r11.A06) / C18230wP.A0E(context3).density), 7);
                    Object A033 = C122047Jt.A03(r113, r21, C86154wM.A0R(A004, Boolean.valueOf(r11.A08), 8), A0L);
                    C04220Ms.A06(A033);
                    C127397h3 r14 = (C127397h3) A033;
                    C04220Ms.A0B(r14, 0);
                    float A0G = r14.A0G(43, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G2 = r14.A0G(44, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G3 = r14.A0G(42, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G4 = r14.A0G(41, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G5 = r14.A0G(38, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G6 = r14.A0G(40, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G7 = r14.A0G(48, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G8 = r14.A0G(46, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G9 = r14.A0G(55, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G10 = r14.A0G(56, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G11 = r14.A0G(54, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    float A0G12 = r14.A0G(53, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    String A0m = C86114wI.A0m(r14.A04, 45);
                    for (C971768f r16 : C971768f.values()) {
                        if (C04220Ms.A0I(r16.A00, A0m)) {
                            String A0o = C18230wP.A0o(r14);
                            AnonymousClass68p[] values = AnonymousClass68p.values();
                            int length = values.length;
                            int i3 = 0;
                            while (i3 < length) {
                                AnonymousClass68p r8 = values[i3];
                                if (C04220Ms.A0I(r8.A00, A0o)) {
                                    r9 = new C115246uk(A00(context3, A0G, A0G2, A0G3, A0G4), A00(context3, A0G9, A0G10, A0G11, A0G12), A00(context3, A0G5, A0G6, A0G7, A0G8), r8, r16);
                                    hashMap2.put(r11, r9);
                                } else {
                                    i3++;
                                }
                            }
                            throw C18190wL.A0a("Required value was null.");
                        }
                    }
                    throw C18190wL.A0a("Required value was null.");
                }
                throw C18190wL.A0a("Server should have ensured that the Tooltip Container always has on-compute-position.");
            }
            if (C04220Ms.A0I(r32.A00, r9)) {
                AnonymousClass7J7 r15 = this.A00;
                if (r15 != null) {
                    return r15.A02;
                }
                return null;
            }
            r32.A00 = r9;
            C112976qV A005 = AnonymousClass7J7.A00(context2, this.A00, r34, (M4z[]) null, -1);
            RectF rectF = r9.A02;
            AnonymousClass7J7 A034 = AnonymousClass7J7.A03(A005, A0K, (Object) null, View.MeasureSpec.makeMeasureSpec((int) rectF.width(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) rectF.height(), 1073741824));
            this.A00 = A034;
            return A034.A02;
        }
        throw C18190wL.A0a("Server should have ensured that the Tooltip Container always has a Tooltip.");
    }

    public AnonymousClass78A(C112806qE r2, AnonymousClass3HX r3) {
        this.A04 = r3;
        this.A02 = r2;
        this.A03 = new C107006fz(r3);
    }

    public static RectF A00(Context context, float f, float f2, float f3, float f4) {
        return new RectF(AnonymousClass6QB.A00(context, f), AnonymousClass6QB.A00(context, f2), AnonymousClass6QB.A00(context, f + f3), AnonymousClass6QB.A00(context, f2 + f4));
    }
}
