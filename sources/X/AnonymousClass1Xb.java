package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Xb  reason: invalid class name */
public final class AnonymousClass1Xb extends C34568Iak implements C82424pb, C81884oY, C81854oV {
    public static final String __redex_internal_original_name = "IgCdsBottomSheetFragment";
    public int A00;
    public C62823ao A01;
    public C66883yU A02;
    public IgBloksScreenConfig A03;
    public C10300i6 A04;
    public Integer A05 = null;
    public String A06;
    public final C30938GbW A07 = C29781Fu1.A00();
    public final AnonymousClass33R A08 = new AnonymousClass33R(this);

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return C25591DoR.A01(this, i2, z, true);
    }

    public static C62823ao A00(AnonymousClass1Xb r0) {
        C62823ao r02 = r0.A01;
        if (r02 != null) {
            return r02;
        }
        throw C18180wK.A0a("Must initialize bottom sheet delegate");
    }

    public final Dialog A0C(Bundle bundle) {
        C66803yI r11;
        C012605w r0;
        float f;
        Integer num = this.A02.A0B;
        Integer num2 = AnonymousClass006.A0N;
        if (num != num2) {
            C62823ao A002 = A00(this);
            Context requireContext = requireContext();
            C66883yU r6 = this.A02;
            Integer num3 = r6.A0B;
            A002.A0B = num3;
            if (num3 != num2) {
                A002.A0B = num3;
                if (num3 != num2) {
                    C18340wi r2 = new C18340wi(requireContext);
                    Integer num4 = r6.A08;
                    Integer num5 = AnonymousClass006.A00;
                    if (!num4.equals(num5)) {
                        if (num4.equals(AnonymousClass006.A01)) {
                            r2.setCanceledOnTouchOutside(true);
                        } else if (num4.equals(AnonymousClass006.A0C)) {
                            r2.setCanceledOnTouchOutside(false);
                        }
                    }
                    int A003 = (int) AnonymousClass3W1.A00(requireContext, 4.0f);
                    r2.A04.setPadding(A003, A003, A003, A003);
                    if (!num3.equals(AnonymousClass006.A0Y)) {
                        int intValue = num3.intValue();
                        if (intValue == 0) {
                            f = 1.0f;
                        } else if (intValue == 1) {
                            f = 0.75f;
                        } else {
                            throw new UnsupportedOperationException("Encountered unsupported CDS bottom sheet style.");
                        }
                        r11 = new C66803yI(f);
                        r2.A04(r11);
                    } else {
                        r2.A04(AnonymousClass3yM.A00);
                        r11 = null;
                    }
                    r2.A07 = r11;
                    L75 l75 = r2.A09;
                    l75.A04(C18340wi.A02(r2.A08, r11), r2.isShowing());
                    if (r2.A0E) {
                        r2.A0E = false;
                    }
                    if (!r2.A0A) {
                        r2.A0A = true;
                        C18340wi.A01(r2, r2.A00);
                    }
                    l75.A0A = true;
                    Integer num6 = r6.A09;
                    if (num6 != num5 ? num6 == AnonymousClass006.A0C : num3 == num5 || num3 == num2) {
                        AnonymousClass3QM r5 = AnonymousClass3QM.A00;
                        l75.A07 = Collections.singletonList(C18340wi.A0I);
                        l75.A02 = r5;
                    }
                    int A004 = AnonymousClass3JD.A00(requireContext, C314025x.A05, r6.A02);
                    if (r2.A02 != A004) {
                        r2.A02 = A004;
                        C18340wi.A01(r2, r2.A00);
                    }
                    float alpha = ((float) Color.alpha(A004)) / 255.0f;
                    if (r2.A01 != alpha) {
                        r2.A01 = alpha;
                        C18340wi.A01(r2, r2.A00);
                    }
                    Window window = r2.getWindow();
                    if (window != null) {
                        window.setStatusBarColor(0);
                    }
                    A002.A05 = r2;
                    r2.A06 = new C66783yG(requireContext, A002);
                    Activity A005 = AnonymousClass3ZR.A00(requireContext);
                    if (A005 != null) {
                        List A032 = AnonymousClass3ZR.A03(A005);
                        C012605w r4 = null;
                        if (A032 != null && !A032.isEmpty()) {
                            Iterator it = A032.iterator();
                            while (it.hasNext() && (r0 = (Fragment) it.next()) != this) {
                                r4 = r0;
                            }
                        }
                        if (r4 instanceof AnonymousClass1Xb) {
                            A002.A07 = (AnonymousClass1Xb) r4;
                            if (r2.A01 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                r2.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                                C18340wi.A01(r2, r2.A00);
                            }
                            r2.A05 = new AnonymousClass32B(A002);
                        }
                        return r2;
                    }
                    throw C18180wK.A0a("Cannot show a fragment in a null activity");
                }
                throw new UnsupportedOperationException("onCreateDialog() is not supported for CDS full screen.");
            }
            throw new UnsupportedOperationException("onFragmentCreateDialog() is not supported for CDS full screen.");
        }
        throw new UnsupportedOperationException("onCreateDialog() is not supported for CDS full screen.");
    }

    public final C10300i6 A0O() {
        return this.A04;
    }

    public final void A0P(AnonymousClass3HX r5, C127397h3 r6, C109326jp r7, Integer num) {
        Integer num2 = this.A02.A0B;
        Integer num3 = AnonymousClass006.A0N;
        if (num2 == num3) {
            A02(this);
        }
        C62823ao A002 = A00(this);
        A002.A08 = r5;
        A002.A09 = r6;
        A002.A0A = r7;
        if (A002.A0B == num3) {
            A002.A0D = true;
            A002.A00 = 1;
            return;
        }
        C18340wi r1 = A002.A05;
        if (r1 != null) {
            A002.A0D = true;
            A002.A00 = 1;
            if (num == AnonymousClass006.A0C) {
                r1.A03();
            } else {
                r1.dismiss();
            }
        }
    }

    public final String AwK() {
        String str = this.A06;
        if (TextUtils.isEmpty(str)) {
            return "bloks_unknown_class";
        }
        return str;
    }

    public final String getModuleName() {
        String str = this.A03.A0P;
        String str2 = this.A06;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return "bloks_unknown";
    }

    public static AnonymousClass1Xb A01(C66883yU r3, C84814tu r4, IgBloksScreenConfig igBloksScreenConfig, C10300i6 r6, String str) {
        Bundle A062 = C18180wK.A06();
        C18180wK.A0w(A062, r6);
        A062.putBundle("open_sheet_config", r3.A05());
        if (!C63173fJ.A05(AnonymousClass0TJ.A06, 18310038288605700L)) {
            A062.putString("theme_gating_id", str);
        }
        IgBloksScreenConfig.A03(A062, igBloksScreenConfig);
        if (r4 != null) {
            String Ax4 = r4.Ax4();
            if (Ax4.equals("screen_query") || Ax4.equals("legacy_screen")) {
                A062.putString("__nav_data_type", Ax4);
                if ("legacy_screen".equals(Ax4)) {
                    C66843yQ.A03(A062, (C66843yQ) r4, false);
                } else if (!"screen_query".equals(Ax4)) {
                    throw C18190wL.A0a(String.format("No implementation bound to key: %s", new Object[]{Ax4}));
                } else if (r4 instanceof C66833yP) {
                    ((C66833yP) r4).A00(A062, false);
                } else {
                    throw C18180wK.A0a("Check failed.");
                }
            } else {
                throw C18180wK.A0a(AnonymousClass00U.A0L("No bundler found to write navigation data of type: ", Ax4));
            }
        }
        AnonymousClass1Xb r0 = new AnonymousClass1Xb();
        r0.setArguments(A062);
        return r0;
    }

    public static void A02(AnonymousClass1Xb r2) {
        C12560m7 parentFragmentManager = r2.getParentFragmentManager();
        if (parentFragmentManager.A0I() <= 0 || parentFragmentManager.A0F) {
            C18220wO.A18(r2);
        } else {
            parentFragmentManager.A0d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r8 == 7) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r8 == 7) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CFx(int r8) {
        /*
            r7 = this;
            X.3ao r5 = A00(r7)
            X.0yD r0 = r5.A02
            if (r0 == 0) goto L_0x0039
            java.util.Deque r0 = r5.A0E
            r0.peek()
            X.4r9 r0 = X.AnonymousClass3QU.A00
            java.lang.Integer r1 = r0.BGG()
            X.0yD r6 = r5.A02
            X.0xq r0 = r6.A02
            if (r0 == 0) goto L_0x0039
            r4 = 0
            int r0 = X.C18240wQ.A06(r1, r4)
            int r0 = 5 - r0
            if (r0 != 0) goto L_0x0039
            java.lang.Integer r3 = r6.A07
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            boolean r0 = r3.equals(r0)
            r2 = 7
            r1 = 1
            if (r0 == 0) goto L_0x004e
            if (r8 == r1) goto L_0x005c
            if (r8 == 0) goto L_0x005c
            if (r8 != r2) goto L_0x0062
        L_0x0034:
            X.0xq r0 = r6.A02
            r0.setIsSwirlAnimating(r4)
        L_0x0039:
            if (r8 != 0) goto L_0x0062
            X.3D5 r1 = r5.A04
            if (r1 == 0) goto L_0x004d
            X.0yD r0 = r5.A02
            if (r0 == 0) goto L_0x004d
            android.os.Handler r4 = r1.A03
            X.4QW r3 = new X.4QW
            r3.<init>(r0, r1)
        L_0x004a:
            r4.post(r3)
        L_0x004d:
            return
        L_0x004e:
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0039
            if (r8 == r1) goto L_0x0034
            if (r8 == 0) goto L_0x0034
            if (r8 != r2) goto L_0x0062
        L_0x005c:
            X.0xq r0 = r6.A02
            r0.setIsSwirlAnimating(r1)
            goto L_0x0039
        L_0x0062:
            r0 = 5
            if (r8 == r0) goto L_0x0074
            r0 = 6
            if (r8 != r0) goto L_0x004d
            X.3D5 r0 = r5.A04
            if (r0 == 0) goto L_0x004d
            android.os.Handler r4 = r0.A03
            X.4O9 r3 = new X.4O9
            r3.<init>(r0)
            goto L_0x004a
        L_0x0074:
            X.3Cw r0 = r5.A03
            if (r0 == 0) goto L_0x004d
            X.0yD r0 = r5.A02
            if (r0 == 0) goto L_0x004d
            X.3D5 r2 = r5.A04
            if (r2 == 0) goto L_0x008a
            android.os.Handler r1 = r2.A03
            X.4O9 r0 = new X.4O9
            r0.<init>(r2)
            r1.post(r0)
        L_0x008a:
            X.4O7 r0 = new X.4O7
            r0.<init>(r5)
            X.C63643hy.A04(r0)
            X.3Cw r2 = r5.A03
            X.0yD r1 = r5.A02
            r0 = 1
            android.os.Handler r4 = r2.A02
            X.4S7 r3 = new X.4S7
            r3.<init>(r1, r2, r0)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Xb.CFx(int):void");
    }

    public final boolean onBackPressed() {
        A00(this).A03(requireContext());
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r8.getBoolean("from_config_changes", false) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 823043483(0x310ea59b, float:2.0757855E-9)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r8)
            if (r8 == 0) goto L_0x000f
            r7.A06()
        L_0x000f:
            android.os.Bundle r5 = r7.requireArguments()
            X.0i6 r0 = X.C18190wL.A0S(r5)
            r7.A04 = r0
            java.lang.String r0 = "open_sheet_config"
            if (r8 != 0) goto L_0x0041
            android.os.Bundle r0 = r5.getBundle(r0)
        L_0x0021:
            r0.getClass()
            X.3yU r0 = X.C66883yU.A01(r0)
            r7.A02 = r0
            android.os.Bundle r1 = r7.mArguments
            X.0i6 r0 = r7.A04
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = com.instagram.bloks.hosting.IgBloksScreenConfig.A00(r1, r0)
            r0.getClass()
            r7.A03 = r0
            X.3ao r0 = new X.3ao
            r0.<init>()
            r7.A01 = r0
            r6 = 0
            r4 = 0
            goto L_0x0046
        L_0x0041:
            android.os.Bundle r0 = r8.getBundle(r0)
            goto L_0x0021
        L_0x0046:
            java.lang.String r0 = "__nav_data_type"
            java.lang.String r2 = r5.getString(r0)     // Catch:{ RuntimeException -> 0x0097 }
            if (r2 == 0) goto L_0x0097
            java.lang.String r1 = "screen_query"
            boolean r0 = r2.equals(r1)     // Catch:{ RuntimeException -> 0x0097 }
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "legacy_screen"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x0097 }
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "No bundler found to create navigation data of type: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)     // Catch:{ RuntimeException -> 0x0097 }
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ RuntimeException -> 0x0097 }
        L_0x0068:
            throw r0     // Catch:{ RuntimeException -> 0x0097 }
        L_0x0069:
            java.lang.String r0 = "legacy_screen"
            boolean r0 = r0.equals(r2)     // Catch:{ RuntimeException -> 0x0097 }
            if (r0 == 0) goto L_0x0076
            X.3yQ r0 = X.C66843yQ.A01(r5)     // Catch:{ RuntimeException -> 0x0097 }
            goto L_0x0090
        L_0x0076:
            boolean r0 = r1.equals(r2)     // Catch:{ RuntimeException -> 0x0097 }
            if (r0 == 0) goto L_0x0081
            X.3yP r0 = X.AnonymousClass2Bh.A00(r5)     // Catch:{ RuntimeException -> 0x0097 }
            goto L_0x0090
        L_0x0081:
            java.lang.Object[] r1 = new java.lang.Object[]{r2}     // Catch:{ RuntimeException -> 0x0097 }
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ RuntimeException -> 0x0097 }
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ RuntimeException -> 0x0097 }
            goto L_0x0068
        L_0x0090:
            if (r0 == 0) goto L_0x0097
            java.lang.String r6 = r0.AQz()
            goto L_0x00ca
        L_0x0097:
            r2 = 0
            if (r8 == 0) goto L_0x00a4
            r2 = 1
            java.lang.String r0 = "from_config_changes"
            boolean r0 = r8.getBoolean(r0, r4)
            r1 = 1
            if (r0 != 0) goto L_0x00a5
        L_0x00a4:
            r1 = 0
        L_0x00a5:
            java.lang.String r0 = "__nav_data_type"
            java.lang.String r0 = r5.getString(r0)
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            java.lang.String r4 = "IgCdsBottomSheetFragment"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Has savedInstanceState: %s | From config changes: %s | Has navigationType: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.C30967GcS.A02(r4, r0)
        L_0x00ca:
            r7.A06 = r6
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 18310038288605700(0x410ce200042204, double:1.896911453533059E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "theme_gating_id"
            if (r8 != 0) goto L_0x00f5
            r5.getString(r0)
        L_0x00e0:
            android.app.Activity r0 = r7.getRootActivity()
            int r0 = X.AnonymousClass7IE.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A05 = r0
            r0 = -382951282(0xffffffffe92ca08e, float:-1.304334E25)
            X.C14030oh.A09(r0, r3)
            return
        L_0x00f5:
            r8.getString(r0)
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Xb.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity A002;
        int A022 = C14030oh.A02(1991702461);
        C62823ao A003 = A00(this);
        Context requireContext = requireContext();
        C66883yU r4 = this.A02;
        boolean A012 = C25233DiE.A01(requireActivity());
        C63173fJ.A01(AnonymousClass0TJ.A06, 18310038288605700L);
        A003.A06 = this.A08;
        C66743y9 r10 = new C66743y9(A003);
        AnonymousClass3y5 r15 = new AnonymousClass3y5(A003);
        Integer BGG = AnonymousClass3QU.A00.BGG();
        AnonymousClass3HX r11 = r4.A02;
        A003.A04 = new AnonymousClass3D5(requireContext, r4.A01, r10, r11, BGG, r4.A0C);
        A003.A03 = new C57893Cw(requireContext, r15, r10, r11, BGG);
        A003.A0B = r4.A0B;
        if (!A012 && (A002 = AnonymousClass3ZR.A00(requireContext)) != null) {
            A003.A0C = Integer.valueOf(A002.getRequestedOrientation());
            AnonymousClass2C5.A00(A002, 1);
        }
        C18940yC r0 = new C18940yC(requireContext, A003.A0B);
        A003.A01 = r0;
        A003.A02 = new C18950yD(requireContext, r0, r4, r11, BGG);
        AnonymousClass39N r02 = (AnonymousClass39N) A003.A0E.peek();
        if (r02 != null) {
            C84864tz r6 = r02.A02;
            AnonymousClass51X.A02(r6.AZg(requireContext), A003.A01.A01, AnonymousClass006.A00, false);
            LLH Ame = r6.Ame();
            C18940yC r03 = A003.A01;
            if (r03 != null) {
                ViewGroup viewGroup2 = r03.A00;
                viewGroup2.removeAllViews();
                viewGroup2.addView(Ame);
            }
        }
        C18950yD r1 = A003.A02;
        C14030oh.A09(-922384813, A022);
        return r1;
    }

    public final void onDestroy() {
        Activity A002;
        int A022 = C14030oh.A02(-595001739);
        super.onDestroy();
        C62823ao r4 = this.A01;
        if (r4 != null) {
            Context requireContext = requireContext();
            Deque<AnonymousClass39N> deque = r4.A0E;
            for (AnonymousClass39N r0 : deque) {
                r0.A02.destroy();
            }
            deque.clear();
            if (!(r4.A0C == null || (A002 = AnonymousClass3ZR.A00(requireContext)) == null)) {
                AnonymousClass2C5.A00(A002, r4.A0C.intValue());
                r4.A0C = null;
            }
            r4.A07 = null;
        }
        C14030oh.A09(423787133, A022);
    }

    public final void onDestroyView() {
        C18950yD r1;
        int A022 = C14030oh.A02(1466469447);
        super.onDestroyView();
        C62823ao r5 = this.A01;
        if (r5 != null) {
            AnonymousClass1Xb r0 = r5.A07;
            if (!(r0 == null || (r1 = A00(r0).A02) == null || r1.A03 == null)) {
                r1.setForeground((Drawable) null);
            }
            for (AnonymousClass39N r02 : r5.A0E) {
                C84864tz r3 = r02.A02;
                r3.AHt();
                C18940yC r03 = r5.A01;
                if (r03 != null) {
                    r03.A00.removeView(r3.Ame());
                }
            }
            AnonymousClass3D5 r04 = r5.A04;
            if (r04 != null) {
                r04.A00 = null;
                r5.A04 = null;
            }
            C57893Cw r05 = r5.A03;
            if (r05 != null) {
                r05.A00 = null;
                r5.A03 = null;
            }
        }
        View view = this.mView;
        if (view != null) {
            Iterator it = AnonymousClass3S3.A01.A00.A00.iterator();
            C04220Ms.A06(it);
            while (it.hasNext()) {
                Object next = it.next();
                C04220Ms.A06(next);
                C33454Ho9 ho9 = (C33454Ho9) next;
                if (!(ho9 instanceof AnonymousClass4AN)) {
                    break;
                }
                Object obj = ((AnonymousClass4AN) ho9).A00.get();
                if (obj == null || obj == view) {
                    it.remove();
                }
            }
        }
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getWindow() == null)) {
            activity.getWindow().setSoftInputMode(this.A00);
        }
        if (this.A05 != null) {
            AnonymousClass7IE.A03(getRootActivity(), this.A05.intValue());
        }
        C14030oh.A09(-1051793393, A022);
    }

    public final void onDetach() {
        UserSession A032;
        int A022 = C14030oh.A02(2035664029);
        super.onDetach();
        if (!(this.A03.A04 == null || (A032 = C05030Qo.A03(this.A04)) == null)) {
            this.A03.A04.A00(A032);
        }
        C62823ao r7 = this.A01;
        if (r7 != null) {
            C66883yU r8 = this.A02;
            AnonymousClass601 r4 = r8.A03;
            C109326jp r3 = r8.A05;
            AnonymousClass3HX r2 = r8.A02;
            C127397h3 r1 = r8.A04;
            if (r3 != null) {
                if (r1 != null && r2 != null) {
                    C122047Jt.A03(r2, r1, C63893iY.A05(AnonymousClass3VO.A00(), r2, 0), r3);
                } else if (r4 != null) {
                    C63893iY.A0F(r4, AnonymousClass3VO.A00(), r3, r2, 0);
                }
            }
            CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback = r8.A00;
            if (cdsOpenScreenDismissCallback != null) {
                cdsOpenScreenDismissCallback.Bu6(r7.A00);
            }
            C109326jp r42 = r7.A0A;
            AnonymousClass3HX r32 = r7.A08;
            C127397h3 r22 = r7.A09;
            if (!(r42 == null || r32 == null || r22 == null)) {
                C122047Jt.A03(r32, r22, C63893iY.A05(AnonymousClass3VO.A00(), r32, 0), r42);
                r7.A09 = null;
                r7.A0A = null;
            }
        }
        C14030oh.A09(1851769086, A022);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        FragmentActivity activity = getActivity();
        C12560m7 parentFragmentManager = getParentFragmentManager();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && !parentFragmentManager.A0F) {
            super.onDismiss(dialogInterface);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isChangingConfigurations()) {
            bundle.putBoolean("from_config_changes", true);
        }
        bundle.putBundle("open_sheet_config", this.A02.A05());
        super.onSaveInstanceState(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        super.onViewCreated(view, bundle);
        this.A07.A04(view, C35004Ikn.A00(this));
        if (this.A02 != null) {
            AnonymousClass3S3 r1 = AnonymousClass3S3.A01;
            C04220Ms.A0B(view, 0);
            AnonymousClass4AO r3 = r1.A00;
            Iterator it = r3.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r3.A5P(new AnonymousClass4AN(view));
                    break;
                }
                C33454Ho9 ho9 = (C33454Ho9) it.next();
                if (!(ho9 instanceof AnonymousClass4AN) || ((obj = ((AnonymousClass4AN) ho9).A00.get()) != null && obj.equals(view))) {
                    break;
                }
            }
        }
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getWindow() == null)) {
            this.A00 = activity.getWindow().getAttributes().softInputMode;
        }
        if (this.A02.A0B == AnonymousClass006.A0N) {
            Activity rootActivity = getRootActivity();
            AnonymousClass7IE.A03(rootActivity, rootActivity.getColor(R.color.fds_transparent));
        }
    }
}
