package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import java.util.HashMap;
import kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4;

/* renamed from: X.5wh  reason: invalid class name and case insensitive filesystem */
public final class C94755wh extends C34568Iak {
    public static final String __redex_internal_original_name = "InstagramConsentFlowDialogFragment";
    public C108786iw A00;
    public C130667qT A01;
    public C121247Ez A02;
    public final C30938GbW A03 = C30938GbW.A00();
    public final C04530Oa A04 = new AnonymousClass4UO(this, C78694iq.A00);

    public final String getModuleName() {
        return "InstagramConsentFlowDialog";
    }

    public final C10300i6 A0O() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final Dialog A0C(Bundle bundle) {
        String str;
        float f;
        String str2;
        Drawable drawable;
        String str3;
        C109326jp r13;
        Context requireContext = requireContext();
        if (this.A00 != null) {
            A0B(false);
            C121247Ez r1 = this.A02;
            if (r1 != null) {
                C108786iw r0 = this.A00;
                if (r0 != null) {
                    C127397h3 r5 = r0.A02;
                    DisplayMetrics A0E = C18230wP.A0E(requireContext());
                    C04220Ms.A06(A0E);
                    int i = A0E.widthPixels;
                    if (r5 == null || (str = C127397h3.A0B(r5)) == null) {
                        str = "10%";
                    }
                    try {
                        if (C86144wL.A1Y(str)) {
                            f = (AnonymousClass7Kk.A00(str) / 100.0f) * ((float) A0E.widthPixels);
                        } else {
                            f = AnonymousClass7Kk.A01(str);
                        }
                    } catch (C29721zB e) {
                        AnonymousClass0LU.A0I("ConsentFlowDialogUtil", AnonymousClass00U.A0L("Cannot parse borderWidth: ", str), e);
                        f = ((float) A0E.widthPixels) * 0.1f;
                    }
                    int i2 = i - (((int) f) << 1);
                    KtLambdaShape24S0100000_I2_4 ktLambdaShape24S0100000_I2_4 = new KtLambdaShape24S0100000_I2_4(r1, 30);
                    C108786iw r02 = this.A00;
                    if (r02 != null) {
                        C121997Jj r12 = r02.A01;
                        LLF llf = new LLF(requireContext);
                        r1.A06(llf);
                        this.A03.A04(llf, C35004Ikn.A00(this));
                        int color = requireContext.getColor(R.color.direct_widget_primary_background);
                        boolean A002 = C34822La.A00(requireContext);
                        C127397h3 r9 = null;
                        if (r5 != null) {
                            str2 = C86114wI.A0m(r5.A04, 43);
                        } else {
                            str2 = null;
                        }
                        if (C04220Ms.A0I(str2, "cds")) {
                            StringBuilder A0r = C18200wM.A0r();
                            float f2 = 8.0f;
                            if (r5 != null) {
                                f2 = r5.A0G(35, 8.0f);
                            }
                            A0r.append(f2);
                            drawable = AnonymousClass2CT.A00(requireContext, C18180wK.A0i("dp", A0r), A002);
                        } else {
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            if (r5 != null) {
                                r9 = r5.A0K(140);
                            }
                            if (r9 != null) {
                                int i3 = 36;
                                if (A002) {
                                    i3 = 35;
                                }
                                String A0m = C86114wI.A0m(r9.A04, i3);
                                if (A0m != null) {
                                    color = AnonymousClass7Kk.A04(A0m);
                                }
                            }
                            gradientDrawable.setColor(color);
                            float f3 = 8.0f;
                            if (r5 != null) {
                                f3 = r5.A0G(35, 8.0f);
                            }
                            gradientDrawable.setCornerRadius(AnonymousClass6QB.A00(requireContext, f3));
                            drawable = gradientDrawable;
                        }
                        ConstraintLayout constraintLayout = new ConstraintLayout(requireContext);
                        constraintLayout.setBackground(drawable);
                        String str4 = null;
                        if (r5 != null) {
                            str3 = C127397h3.A0C(r5);
                        } else {
                            str3 = null;
                        }
                        constraintLayout.setMaxHeight(C98856He.A00(str3, Integer.MAX_VALUE));
                        if (r5 != null) {
                            str4 = C127397h3.A0D(r5);
                        }
                        constraintLayout.setMinHeight(C98856He.A00(str4, 0));
                        C39909L6z l6z = new C39909L6z(-1, 0);
                        l6z.A0a = constraintLayout.A01;
                        l6z.A0c = constraintLayout.A03;
                        constraintLayout.addView(llf, l6z);
                        C104716cG r11 = new C104716cG(this);
                        if (r5 != null) {
                            r13 = C127397h3.A08(r5);
                        } else {
                            r13 = null;
                        }
                        C86194we r92 = new C86194we(requireContext, r11, r12, r13, ktLambdaShape24S0100000_I2_4);
                        r92.setCanceledOnTouchOutside(false);
                        r92.setContentView(constraintLayout);
                        Window window = r92.getWindow();
                        if (window == null) {
                            return r92;
                        }
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                        layoutParams.copyFrom(window.getAttributes());
                        layoutParams.width = i2;
                        layoutParams.height = -2;
                        window.setAttributes(layoutParams);
                        window.setBackgroundDrawableResource(17170445);
                        return r92;
                    }
                }
                C04220Ms.A0E("promptDisplayParameter");
                throw null;
            }
            AnonymousClass0LU.A0B(__redex_internal_original_name, "Got a null BloksParseResult");
        }
        return new Dialog(requireContext);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1185091852);
        super.onCreate(bundle);
        this.A01 = C130667qT.A02(this, AnonymousClass0wJ.A0U(this.A04), this.A03);
        String string = requireArguments().getString("prompt_id");
        if (string != null) {
            HashMap hashMap = C1192073y.A01;
            C108786iw r0 = (C108786iw) hashMap.get(string);
            if (r0 == null) {
                C121107Ed r1 = C121107Ed.A00;
                String A012 = r1.A01();
                if (A012 == null) {
                    A012 = "null";
                }
                C86114wI.A19(this, r1, string, A012);
                if (C63173fJ.A05(AnonymousClass0TJ.A05, 18313190794340423L)) {
                    requireContext();
                    C98836Hc.A00(string, __redex_internal_original_name, hashMap);
                }
            } else {
                this.A00 = r0;
                C121997Jj r3 = r0.A01;
                if (r3 != null) {
                    Context requireContext = requireContext();
                    C130667qT r12 = this.A01;
                    if (r12 == null) {
                        C04220Ms.A0E("bloksHost");
                        throw null;
                    }
                    this.A02 = new C58513Fy(requireContext, r3, r12).A00();
                }
            }
            C14030oh.A09(-656931485, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(483051589, A022);
        throw A0b;
    }
}
