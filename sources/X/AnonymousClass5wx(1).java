package X;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxAListenerShape183S0200000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4;

/* renamed from: X.5wx  reason: invalid class name */
public final class AnonymousClass5wx extends C34640IcN {
    public static final Interpolator A09 = new PathInterpolator(0.17f, 0.17f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
    public static final String __redex_internal_original_name = "InstagramConsentFlowScreenFragment";
    public ViewGroup A00;
    public ViewGroup A01;
    public String A02;
    public Dialog A03;
    public C108786iw A04;
    public String A05;
    public String A06;
    public final C30938GbW A07 = C30938GbW.A00();
    public final C04530Oa A08 = new AnonymousClass4UO(this, C78694iq.A00);

    public final String getModuleName() {
        return "InstagramConsentFlowScreen";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A08);
    }

    public static final void A00(Window window, int i, boolean z) {
        if (window.getStatusBarColor() != i) {
            window.addFlags(Process.WAIT_RESULT_TIMEOUT);
            window.setStatusBarColor(i);
        }
        new C007103c(window.getDecorView(), window).A00.A05(!z);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(114450725);
        super.onCreate(bundle);
        String string = requireArguments().getString("prompt_id");
        if (string != null) {
            this.A05 = string;
            HashMap hashMap = C1192073y.A01;
            C108786iw r0 = (C108786iw) hashMap.get(string);
            if (r0 == null) {
                C121107Ed r2 = C121107Ed.A00;
                String A012 = r2.A01();
                if (A012 == null) {
                    A012 = "null";
                }
                String str = this.A05;
                if (str != null) {
                    C86114wI.A19(this, r2, str, A012);
                    if (C63173fJ.A05(AnonymousClass0TJ.A05, 18313190794340423L)) {
                        requireContext();
                        String str2 = this.A05;
                        if (str2 != null) {
                            C98836Hc.A00(str2, __redex_internal_original_name, hashMap);
                        }
                    }
                }
                C04220Ms.A0E("promptId");
                throw null;
            }
            this.A04 = r0;
            C14030oh.A09(178778179, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1217080254, A022);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        Drawable colorDrawable;
        View onCreateView;
        int i2;
        int A022 = C14030oh.A02(-1562849136);
        LayoutInflater layoutInflater2 = layoutInflater;
        C04220Ms.A0B(layoutInflater2, 0);
        Bundle bundle2 = bundle;
        ViewGroup viewGroup2 = viewGroup;
        if (this.A04 == null) {
            onCreateView = super.onCreateView(layoutInflater2, viewGroup2, bundle2);
            i2 = 625188659;
        } else {
            Context requireContext = requireContext();
            C108786iw r2 = this.A04;
            if (r2 == null) {
                C04220Ms.A0E("promptDisplayParameter");
            } else {
                C121997Jj r13 = r2.A01;
                if (r13 != null) {
                    C127397h3 r14 = r2.A02;
                    if (r14 != null) {
                        String A0o = C18230wP.A0o(r14);
                        if (A0o != null) {
                            this.A06 = A0o;
                            String A0C = C127397h3.A0C(r14);
                            if (A0C == null) {
                                A0C = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                            }
                            this.A02 = A0C;
                            C10300i6 A0U = AnonymousClass0wJ.A0U(this.A08);
                            C30938GbW gbW = this.A07;
                            C121247Ez A002 = new C58513Fy(requireContext, r13, C130667qT.A02(this, A0U, gbW)).A00();
                            LLF llf = new LLF(requireContext);
                            A002.A06(llf);
                            this.A00 = llf;
                            C35004Ikn A003 = C35004Ikn.A00(this);
                            ViewGroup viewGroup3 = this.A00;
                            String str = "contentView";
                            if (viewGroup3 != null) {
                                gbW.A04(viewGroup3, A003);
                                String str2 = this.A02;
                                if (str2 != null) {
                                    if (str2.equals("cds")) {
                                        colorDrawable = AnonymousClass2CT.A00(requireContext, "0dp", C34822La.A00(requireContext));
                                    } else {
                                        C127397h3 A0K = r14.A0K(140);
                                        int color = requireContext.getColor(R.color.direct_widget_primary_background);
                                        boolean A004 = C34822La.A00(requireContext);
                                        if (A0K != null) {
                                            int i3 = 36;
                                            if (A004) {
                                                i3 = 35;
                                            }
                                            String A0m = C86114wI.A0m(A0K.A04, i3);
                                            if (A0m != null) {
                                                color = AnonymousClass7Kk.A04(A0m);
                                            }
                                        }
                                        colorDrawable = new ColorDrawable(color);
                                    }
                                    ConstraintLayout constraintLayout = new ConstraintLayout(requireContext);
                                    ViewGroup viewGroup4 = this.A00;
                                    if (viewGroup4 != null) {
                                        constraintLayout.addView(viewGroup4, new ViewGroup.LayoutParams(-1, -1));
                                        constraintLayout.setBackground(colorDrawable);
                                        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                        this.A01 = constraintLayout;
                                        C18310wf r1 = new C18310wf(requireContext, r13, C18230wP.A0V(r14), new KtLambdaShape24S0100000_I2_4(A002, 31));
                                        r1.setCancelable(false);
                                        r1.setContentView(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
                                        this.A03 = r1;
                                        Window window = r1.getWindow();
                                        if (window != null) {
                                            View decorView = window.getDecorView();
                                            decorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                            decorView.setPadding(0, 0, 0, 0);
                                            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                                            layoutParams.copyFrom(window.getAttributes());
                                            layoutParams.width = -1;
                                            layoutParams.height = -1;
                                            window.setAttributes(layoutParams);
                                            window.setDimAmount(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                            boolean A005 = C34822La.A00(requireContext);
                                            int color2 = requireContext.getColor(R.color.direct_widget_primary_background);
                                            new C007103c(window.getDecorView(), window).A00.A04(!A005);
                                            if (window.getNavigationBarColor() != color2) {
                                                window.addFlags(Process.WAIT_RESULT_TIMEOUT);
                                                window.setNavigationBarColor(color2);
                                            }
                                            String str3 = this.A02;
                                            if (str3 != null) {
                                                if (str3.equals("cds")) {
                                                    ViewGroup viewGroup5 = this.A00;
                                                    if (viewGroup5 != null) {
                                                        C98846Hd.A00(viewGroup5, window);
                                                        A00(window, 0, A005);
                                                    }
                                                } else {
                                                    A00(window, color2, A005);
                                                }
                                            }
                                        }
                                        onCreateView = super.onCreateView(layoutInflater2, viewGroup2, bundle2);
                                        i2 = -1074684064;
                                    }
                                }
                                str = "containerTheme";
                            }
                            C04220Ms.A0E(str);
                        } else {
                            illegalStateException = C18180wK.A0a("Required value was null.");
                            i = -1003718606;
                        }
                    } else {
                        illegalStateException = C18180wK.A0a("Required value was null.");
                        i = -1110033837;
                    }
                } else {
                    illegalStateException = C18180wK.A0a("Required value was null.");
                    i = -1601662244;
                }
                C14030oh.A09(i, A022);
                throw illegalStateException;
            }
            throw null;
        }
        C14030oh.A09(i2, A022);
        return onCreateView;
    }

    public final void onStart() {
        float[] fArr;
        String str;
        String str2;
        int A022 = C14030oh.A02(937460073);
        super.onStart();
        if (this.A04 != null) {
            Context requireContext = requireContext();
            Dialog dialog = this.A03;
            if (dialog == null) {
                str2 = "fullScreenDialog";
            } else {
                ViewGroup viewGroup = this.A01;
                if (viewGroup == null) {
                    str2 = "screenView";
                } else {
                    String str3 = this.A06;
                    if (str3 == null) {
                        str2 = "screenType";
                    } else {
                        Interpolator interpolator = A09;
                        C13950oZ.A00(dialog);
                        if (str3.equals("screen")) {
                            fArr = new float[]{(float) C18230wP.A0E(requireContext).widthPixels, 0.0f};
                            str = "translationX";
                        } else if (str3.equals("modal")) {
                            fArr = new float[]{(float) C18230wP.A0E(requireContext).heightPixels, 0.0f};
                            str = "translationY";
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, str, fArr);
                        ofFloat.setDuration(280);
                        ofFloat.setInterpolator(interpolator);
                        ofFloat.start();
                    }
                }
            }
            C04220Ms.A0E(str2);
            throw null;
        }
        C14030oh.A09(-1855840596, A022);
    }

    public final void onStop() {
        float[] fArr;
        String str;
        String str2;
        int A022 = C14030oh.A02(-2027926198);
        if (this.A04 != null) {
            Context requireContext = requireContext();
            FragmentActivity activity = getActivity();
            Dialog dialog = this.A03;
            if (dialog == null) {
                str2 = "fullScreenDialog";
            } else {
                ViewGroup viewGroup = this.A01;
                if (viewGroup == null) {
                    str2 = "screenView";
                } else {
                    String str3 = this.A06;
                    if (str3 == null) {
                        str2 = "screenType";
                    } else {
                        Interpolator interpolator = A09;
                        IDxAListenerShape183S0200000_2_I2 iDxAListenerShape183S0200000_2_I2 = new IDxAListenerShape183S0200000_2_I2(0, activity, dialog);
                        if (str3.equals("screen")) {
                            fArr = new float[]{0.0f, (float) C18230wP.A0E(requireContext).widthPixels};
                            str = "translationX";
                        } else if (str3.equals("modal")) {
                            fArr = new float[]{0.0f, (float) C18230wP.A0E(requireContext).heightPixels};
                            str = "translationY";
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, str, fArr);
                        ofFloat.setDuration(200);
                        ofFloat.setInterpolator(interpolator);
                        ofFloat.addListener(iDxAListenerShape183S0200000_2_I2);
                        ofFloat.start();
                    }
                }
            }
            C04220Ms.A0E(str2);
            throw null;
        }
        super.onStop();
        C14030oh.A09(-1866191922, A022);
    }
}
