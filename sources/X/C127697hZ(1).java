package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxOProviderShape24S0100000_2_I2;
import java.io.IOException;

/* renamed from: X.7hZ  reason: invalid class name and case insensitive filesystem */
public final class C127697hZ implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        int i;
        Paint paint;
        LLI lli = (LLI) obj;
        C90955fM r6 = (C90955fM) obj2;
        C127397h3 r2 = r6.A07;
        if (r2 != null) {
            try {
                C90885fF r3 = (C90885fF) lli;
                AnonymousClass3HX r8 = r6.A0A;
                r8.getClass();
                C108166hv r7 = r6.A08;
                r7.A00 = r3.getOutlineAmbientShadowColor();
                r7.A01 = r3.getOutlineSpotShadowColor();
                SparseArray sparseArray = r2.A04;
                String A0m = C86114wI.A0m(sparseArray, 48);
                if (A0m != null) {
                    float A01 = AnonymousClass7Kk.A01(A0m);
                    if (A01 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        r3.setElevation(A01);
                        r3.setOutlineProvider(new IDxOProviderShape24S0100000_2_I2(r2, 0));
                        if (r2.A0K(68) != null) {
                            int i2 = r7.A00;
                            C127397h3 A0K = r2.A0K(68);
                            if (A0K != null) {
                                i2 = C101086Pv.A00(r8, A0K, i2);
                            }
                            r3.setOutlineAmbientShadowColor(i2);
                        }
                        if (r2.A0K(69) != null) {
                            int i3 = r7.A01;
                            C127397h3 A0K2 = r2.A0K(69);
                            if (A0K2 != null) {
                                i3 = C101086Pv.A00(r8, A0K2, i3);
                            }
                            r3.setOutlineSpotShadowColor(i3);
                        }
                    }
                }
                float A00 = C127397h3.A00(r2, 46);
                boolean A002 = AnonymousClass2LL.A00(C127397h3.A0A(r2, 43), false);
                int i4 = (A00 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (A00 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1));
                if (A002) {
                    if (i4 != 0) {
                        r3.setOutlineProvider(new C872150s(r2, A00));
                        float A003 = C127397h3.A00(r2, 40);
                        int A004 = C120517Bf.A00(r2.A0R(56), 0);
                        if (A003 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || !C120517Bf.A02(A004)) {
                            C111276n4 r32 = r3.A00;
                            r32.A04 = true;
                            r32.A0B.setLayerType(2, (Paint) null);
                            C127397h3 A0K3 = r2.A0K(45);
                            String A0m2 = C86114wI.A0m(sparseArray, 44);
                            if (A0m2 != null) {
                                i = AnonymousClass7Kk.A04(A0m2);
                            } else {
                                i = 0;
                            }
                            if (A0K3 != null) {
                                try {
                                    String A0m3 = C86114wI.A0m(A0K3.A04, 35);
                                    if (A0m3 == null || AnonymousClass7Kk.A04(A0m3) == 0) {
                                        String A0o = C18230wP.A0o(A0K3);
                                        if (A0o != null) {
                                            if (AnonymousClass7Kk.A04(A0o) == 0) {
                                            }
                                        }
                                    }
                                } catch (C29721zB unused) {
                                    C30967GcS.A02("ThemedColorUtils", "Error parsing themed color");
                                }
                                i = C101086Pv.A00(r8, A0K3, 0);
                            }
                            int A005 = C120507Be.A00(r8, r2);
                            float[] A02 = C120507Be.A02(r2.A0R(62));
                            float A006 = C127397h3.A00(r2, 63);
                            r32.A03 = A004;
                            r32.A02 = A00;
                            Paint paint2 = r32.A06;
                            paint2.setColor(i);
                            if (i == 0) {
                                C86144wL.A18(paint2, PorterDuff.Mode.CLEAR);
                            }
                            if (A003 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                paint = r32.A05;
                                paint.setColor(A005);
                            } else {
                                paint = r32.A05;
                                paint.setColor(0);
                            }
                            C86134wK.A12(paint);
                            paint.setStrokeWidth(A003);
                            if (A003 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A02 != null) {
                                paint.setPathEffect(new DashPathEffect(A02, A006));
                            }
                            Path path = r32.A08;
                            path.setFillType(Path.FillType.EVEN_ODD);
                            float f = A003 / 2.0f;
                            r32.A00 = f;
                            r32.A01 = r32.A02 - f;
                            path.reset();
                        } else {
                            r3.setClipToOutline(true);
                        }
                    }
                } else if (i4 != 0) {
                    r3.setOutlineProvider(new IDxOProviderShape24S0100000_2_I2(r2, 1));
                }
                Drawable drawable = r6.A05;
                Drawable drawable2 = r6.A04;
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
                if (drawable2 instanceof Animatable) {
                    ((Animatable) drawable2).start();
                    return null;
                }
            } catch (IOException e) {
                C30967GcS.A01((AnonymousClass3HX) null, "HostWithDecoratorRenderUnit", "Parse exception while binding Box Decoration", e, 0);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        LLI lli = (LLI) obj;
        C90955fM r6 = (C90955fM) obj2;
        if (r6.A07 != null) {
            C90885fF r5 = (C90885fF) lli;
            C111276n4 r0 = r5.A00;
            r0.A04 = false;
            r0.A0B.setLayerType(0, (Paint) null);
            r5.setElevation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            r5.setClipToOutline(false);
            r5.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            C108166hv r1 = r6.A08;
            r5.setOutlineAmbientShadowColor(r1.A00);
            r5.setOutlineSpotShadowColor(r1.A01);
            Drawable drawable = r6.A05;
            Drawable drawable2 = r6.A04;
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
