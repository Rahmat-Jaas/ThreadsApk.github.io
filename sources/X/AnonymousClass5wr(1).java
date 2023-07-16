package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.5wr  reason: invalid class name */
public final class AnonymousClass5wr extends C34640IcN {
    public static final String __redex_internal_original_name = "InstagramConsentFlowBottomSheetFragment";
    public AnonymousClass371 A00;
    public AnonymousClass5HI A01;
    public C108786iw A02;
    public AnonymousClass3HX A03;
    public String A04;
    public final C04530Oa A05 = new AnonymousClass4UO(this, C78694iq.A00);
    public final C30938GbW A06 = C30938GbW.A00();

    public final String getModuleName() {
        return "InstagramConsentFlowBottomSheet";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r13 != null) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = 1797546670(0x6b2462ae, float:1.9872984E26)
            int r2 = X.C14030oh.A02(r0)
            r3 = r17
            r0 = r18
            super.onCreate(r0)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "prompt_id"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x00cf
            r3.A04 = r1
            java.lang.String r7 = "promptId"
            r0 = 0
            java.util.HashMap r4 = X.C1192073y.A01
            java.lang.Object r1 = r4.get(r1)
            X.6iw r1 = (X.C108786iw) r1
            if (r1 != 0) goto L_0x0056
            X.7Ed r6 = X.C121107Ed.A00
            java.lang.String r5 = r6.A01()
            if (r5 != 0) goto L_0x0033
            java.lang.String r5 = "null"
        L_0x0033:
            java.lang.String r1 = r3.A04
            if (r1 != 0) goto L_0x003b
            X.C04220Ms.A0E(r7)
            throw r0
        L_0x003b:
            X.C86114wI.A19(r3, r6, r1, r5)
            X.0TJ r1 = X.AnonymousClass0TJ.A05
            r5 = 18313190794340423(0x410fc000002847, double:1.8981574893585342E-307)
            boolean r1 = X.C63173fJ.A05(r1, r5)
            if (r1 == 0) goto L_0x005e
            r3.requireContext()
            java.lang.String r5 = r3.A04
            if (r5 != 0) goto L_0x0059
            X.C04220Ms.A0E(r7)
            throw r0
        L_0x0056:
            r3.A02 = r1
            goto L_0x005e
        L_0x0059:
            java.lang.String r1 = "InstagramConsentFlowBottomSheetFragment"
            X.C98836Hc.A00(r5, r1, r4)
        L_0x005e:
            java.lang.String r1 = r3.A04
            if (r1 != 0) goto L_0x0066
            X.C04220Ms.A0E(r7)
            throw r0
        L_0x0066:
            java.lang.Object r1 = r4.get(r1)
            X.6iw r1 = (X.C108786iw) r1
            if (r1 == 0) goto L_0x00ba
            X.7h3 r5 = r1.A02
            if (r5 == 0) goto L_0x0078
            java.lang.String r13 = X.C18230wP.A0o(r5)
            if (r13 != 0) goto L_0x007a
        L_0x0078:
            java.lang.String r13 = "default"
        L_0x007a:
            if (r5 == 0) goto L_0x00b1
            java.lang.String r14 = X.C127397h3.A0B(r5)
            r6 = 43
            android.util.SparseArray r1 = r5.A04
            java.lang.String r15 = X.C86114wI.A0m(r1, r6)
            java.lang.String r16 = X.C127397h3.A0E(r5)
            X.6jp r10 = X.C18230wP.A0V(r5)
            r1 = 41
            X.6jp r11 = r5.A0L(r1)
            r1 = 40
            X.6jp r12 = r5.A0L(r1)
            r1 = 140(0x8c, float:1.96E-43)
            X.7h3 r9 = r5.A0K(r1)
        L_0x00a2:
            X.5HI r8 = new X.5HI
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r3.A01 = r8
            java.lang.String r1 = r3.A04
            if (r1 != 0) goto L_0x00bc
            X.C04220Ms.A0E(r7)
            throw r0
        L_0x00b1:
            r14 = r0
            r15 = r0
            r16 = r0
            r10 = r0
            r11 = r0
            r12 = r0
            r9 = r0
            goto L_0x00a2
        L_0x00ba:
            r5 = r0
            goto L_0x0078
        L_0x00bc:
            java.lang.Object r1 = r4.get(r1)
            X.6iw r1 = (X.C108786iw) r1
            if (r1 == 0) goto L_0x00c6
            X.3HX r0 = r1.A00
        L_0x00c6:
            r3.A03 = r0
            r0 = -95980808(0xfffffffffa4772f8, float:-2.5889973E35)
            X.C14030oh.A09(r0, r2)
            return
        L_0x00cf:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = -901552072(0xffffffffca436838, float:-3201550.0)
            X.C14030oh.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5wr.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0MJ A17;
        int i;
        View A002;
        View onCreateView;
        int i2;
        int A022 = C14030oh.A02(-1206233139);
        LayoutInflater layoutInflater2 = layoutInflater;
        C04220Ms.A0B(layoutInflater2, 0);
        ViewGroup viewGroup2 = viewGroup;
        Bundle bundle2 = bundle;
        if (this.A02 == null) {
            onCreateView = super.onCreateView(layoutInflater2, viewGroup2, bundle2);
            i2 = -703581006;
        } else {
            Context requireContext = requireContext();
            C10300i6 A0U = AnonymousClass0wJ.A0U(this.A05);
            C30938GbW gbW = this.A06;
            C130667qT A023 = C130667qT.A02(this, A0U, gbW);
            boolean A003 = C34822La.A00(requireContext);
            AnonymousClass5HI r0 = this.A01;
            String str = "options";
            if (r0 != null) {
                C127397h3 r7 = r0.A00;
                int color = requireContext.getColor(R.color.direct_widget_primary_background);
                if (r7 != null) {
                    int i3 = 36;
                    if (A003) {
                        i3 = 35;
                    }
                    String A0m = C86114wI.A0m(r7.A04, i3);
                    if (A0m != null) {
                        color = AnonymousClass7Kk.A04(A0m);
                    }
                }
                C108786iw r02 = this.A02;
                if (r02 == null) {
                    str = "promptDisplayParameter";
                } else {
                    C121997Jj r1 = r02.A01;
                    if (r1 != null) {
                        C18193AbM abM = new C18193AbM();
                        AnonymousClass5HI r11 = this.A01;
                        if (r11 != null) {
                            AnonymousClass3HX r72 = this.A03;
                            boolean A0I = C04220Ms.A0I(r11.A07, "cds");
                            String str2 = r11.A06;
                            String str3 = r11.A05;
                            String str4 = r11.A04;
                            C109326jp r29 = r11.A03;
                            C109326jp r28 = r11.A01;
                            C109326jp r15 = r11.A02;
                            if (A0I) {
                                Drawable A004 = AnonymousClass2CT.A00(requireContext(), "4dp", A003);
                                A17 = C86144wL.A17();
                                C121997Jj r22 = r1;
                                A002 = abM.A00(requireActivity(), A004, r22, A023, str2, str3, str4, C86164wN.A0r(A17, 2));
                                i = 7;
                            } else {
                                A17 = C86144wL.A17();
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(color);
                                float A005 = AnonymousClass6QB.A00(requireActivity(), 16.0f);
                                i = 8;
                                gradientDrawable.setCornerRadii(new float[]{A005, A005, A005, A005, 0.0f, 0.0f, 0.0f, 0.0f});
                                GradientDrawable gradientDrawable2 = gradientDrawable;
                                C121997Jj r222 = r1;
                                A002 = abM.A00(requireActivity(), gradientDrawable2, r222, A023, str2, str3, str4, C86164wN.A0r(A17, 3));
                            }
                            this.A00 = new AnonymousClass371(A002, this, r1, r29, r15, r28, str2, C86154wM.A11(A17, r72, i));
                            C35004Ikn A006 = C35004Ikn.A00(this);
                            AnonymousClass371 r03 = this.A00;
                            if (r03 == null) {
                                str = "bottomSheetDialogDelegate";
                            } else {
                                gbW.A04(r03.A00, A006);
                                onCreateView = super.onCreateView(layoutInflater2, viewGroup2, bundle2);
                                i2 = 1747260242;
                            }
                        }
                    } else {
                        IllegalStateException A0b = AnonymousClass0wJ.A0b();
                        C14030oh.A09(1807193283, A022);
                        throw A0b;
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        C14030oh.A09(i2, A022);
        return onCreateView;
    }

    public final void onPause() {
        AnonymousClass371 r0;
        int A022 = C14030oh.A02(783356);
        if (this.mRemoving && (r0 = this.A00) != null) {
            C18340wi r1 = r0.A01;
            if (r1.isShowing()) {
                r1.dismiss();
            }
        }
        super.onPause();
        C14030oh.A09(1316219461, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(1494554114);
        super.onStart();
        AnonymousClass371 r0 = this.A00;
        if (r0 != null) {
            C13950oZ.A00(r0.A01);
        }
        C14030oh.A09(2046992789, A022);
    }
}
