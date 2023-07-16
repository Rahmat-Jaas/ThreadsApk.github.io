package com.instagram.debug.devoptions;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C09120et;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C23411dm;
import X.C63273h9;
import X.C63613hu;
import X.C82034oy;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.debug.image.ImageDebugConfiguration;
import com.instagram.debug.image.sessionhelper.ImageDebugSessionHelper;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.HardwareVideoEncoderFactory;

public final class ImageDebugSettingsFragment extends C23411dm implements C82034oy {
    public static final Companion Companion = new Companion();
    public C10300i6 session;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r2 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass4MA createMultiChoiceMenuItem(java.lang.CharSequence r13, java.lang.String[] r14, java.lang.Object[] r15, int r16, java.lang.Object r17, X.AnonymousClass0YY r18) {
        /*
            r12 = this;
            r8 = r15
            r4 = r17
            int r2 = r15.length
            r3 = 0
            r1 = 0
        L_0x0006:
            r5 = r14
            r6 = r16
            r7 = r18
            if (r1 >= r2) goto L_0x0019
            r0 = r15[r1]
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 == 0) goto L_0x0049
            r2 = r14[r1]
            if (r2 != 0) goto L_0x0020
        L_0x0019:
            r4 = r15[r16]
            r2 = r14[r16]
            r7.invoke(r4)
        L_0x0020:
            com.instagram.debug.devoptions.ImageDebugSettingsFragment$Companion r1 = Companion
            r0 = r15[r16]
            if (r4 != r0) goto L_0x0027
            r3 = 1
        L_0x0027:
            r10 = r13
            java.lang.CharSequence r1 = r1.createMultiChoiceLabel(r13, r2, r3)
            r0 = 0
            X.4MA r9 = X.AnonymousClass4MA.A01(r0, r1)
            r4 = r12
            X.C24 r0 = r12.getScrollingViewProxy()
            X.EvB r11 = r0.APJ()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.menu.SimplePreferenceAdapter"
            X.C04220Ms.A0C(r11, r0)
            X.1fC r11 = (X.AnonymousClass1fC) r11
            com.instagram.debug.devoptions.ImageDebugSettingsFragment$createMultiChoiceMenuItem$onClickListener$1 r3 = new com.instagram.debug.devoptions.ImageDebugSettingsFragment$createMultiChoiceMenuItem$onClickListener$1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r9.A03 = r3
            return r9
        L_0x0049:
            int r1 = r1 + 1
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.ImageDebugSettingsFragment.createMultiChoiceMenuItem(java.lang.CharSequence, java.lang.String[], java.lang.Object[], int, java.lang.Object, X.0YY):X.4MA");
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825272);
    }

    public String getModuleName() {
        return "image_debug_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C09120et A0X = C18190wL.A0X();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A03(A0v, 2131825268);
        AnonymousClass4MC.A07(new ImageDebugSettingsFragment$onViewCreated$1(A0X, this), A0v, 2131825270, AnonymousClass0wJ.A1V(A0X.A0K));
        AnonymousClass4MC.A07(new ImageDebugSettingsFragment$onViewCreated$2(A0X, this), A0v, 2131825269, AnonymousClass0wJ.A1V(A0X.A0J));
        C63613hu.A03(A0v, 2131825278);
        boolean z = false;
        String[] strArr = {ReactProgressBarViewManager.DEFAULT_STYLE, "Tiny"};
        int ordinal = ImageDebugConfiguration.OverlayDisplayMode.NORMAL.ordinal();
        A0v.add(createMultiChoiceMenuItem("Display Mode", strArr, new Integer[]{Integer.valueOf(ordinal), Integer.valueOf(ImageDebugConfiguration.OverlayDisplayMode.TINY.ordinal())}, ordinal, Integer.valueOf(AnonymousClass0wJ.A04(C18220wO.A0f(A0X.A0T))), new ImageDebugSettingsFragment$onViewCreated$3(A0X, this)));
        int ordinal2 = ImageDebugConfiguration.LoadSourceDisplayMode.HIDE.ordinal();
        A0v.add(createMultiChoiceMenuItem("Load Source", new String[]{"Don't Show", "Name", "Color"}, new Integer[]{Integer.valueOf(ordinal2), Integer.valueOf(ImageDebugConfiguration.LoadSourceDisplayMode.NAME.ordinal()), Integer.valueOf(ImageDebugConfiguration.LoadSourceDisplayMode.COLOR.ordinal())}, ordinal2, Integer.valueOf(AnonymousClass0wJ.A04(C18220wO.A0f(A0X.A0X))), new ImageDebugSettingsFragment$onViewCreated$4(A0X, this)));
        AnonymousClass4MC.A07(new ImageDebugSettingsFragment$onViewCreated$5(A0X, this), A0v, 2131825281, AnonymousClass0wJ.A1V(A0X.A0V));
        AnonymousClass4MC.A07(new ImageDebugSettingsFragment$onViewCreated$6(A0X, this), A0v, 2131825282, AnonymousClass0wJ.A1V(A0X.A0W));
        AnonymousClass4MC.A06(new ImageDebugSettingsFragment$onViewCreated$7(A0X, this), "Pixels Off Screen (%)", A0v, AnonymousClass0wJ.A1V(A0X.A0Y));
        A0v.add(new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new ImageDebugSettingsFragment$onViewCreated$8(A0X, this), 2131825283, 2131825284, AnonymousClass0wJ.A1V(A0X.A0Z)));
        AnonymousClass4MC.A07(new ImageDebugSettingsFragment$onViewCreated$9(A0X, this), A0v, 2131825280, AnonymousClass0wJ.A1V(A0X.A0U));
        AnonymousClass4MC.A06(new ImageDebugSettingsFragment$onViewCreated$10(A0X, this), "Cache Key", A0v, AnonymousClass0wJ.A1V(A0X.A0R));
        AnonymousClass4MC.A06(new ImageDebugSettingsFragment$onViewCreated$11(A0X, this), getString(2131825279), A0v, AnonymousClass0wJ.A1V(A0X.A0S));
        AnonymousClass4MC.A06(new ImageDebugSettingsFragment$onViewCreated$12(A0X, this), getString(2131825273), A0v, AnonymousClass0wJ.A1V(A0X.A0M));
        C63273h9.A02(A0v);
        C63613hu.A03(A0v, 2131825277);
        A0v.add(createMultiChoiceMenuItem("Delay Per Data Chunk (ms)", new Integer[]{null, 100, 200, 300, 500, 1000}, 0, Integer.valueOf(AnonymousClass0wJ.A04(C18220wO.A0f(A0X.A0O))), new ImageDebugSettingsFragment$onViewCreated$14(A0X, this)));
        A0v.add(createMultiChoiceMenuItem("Fail Request After (bytes)", new String[]{"-1", "0", "1,000", "2,000", "5,000", "10,000", "20,000", "50,000"}, new Integer[]{-1, 0, 1000, Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS), 5000, 10000, Integer.valueOf(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS), 50000}, 0, Integer.valueOf(AnonymousClass0wJ.A04(C18220wO.A0f(A0X.A0P))), new ImageDebugSettingsFragment$onViewCreated$15(A0X, this)));
        A0v.add(createMultiChoiceMenuItem("Fail Request Probability (1/X times)", new Integer[]{1, 2, 3, 5, 8, 15}, 0, Integer.valueOf(AnonymousClass0wJ.A04(C18220wO.A0f(A0X.A0Q))), new ImageDebugSettingsFragment$onViewCreated$16(A0X, this)));
        C63273h9.A02(A0v);
        C63613hu.A03(A0v, 2131825274);
        if (AnonymousClass0wJ.A04(C18220wO.A0f(A0X.A0N)) != 0) {
            z = true;
        }
        A0v.add(new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new ImageDebugSettingsFragment$onViewCreated$17(A0X, this), 2131825275, 2131825276, z));
        setItems(A0v);
    }

    public void setSession(C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        this.session = r2;
    }

    public final class Companion {
        /* access modifiers changed from: private */
        public final CharSequence createMultiChoiceLabel(CharSequence charSequence, String str, boolean z) {
            String str2;
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(charSequence);
            A0r.append(":\n\t");
            A0r.append(str);
            if (z) {
                str2 = " (default)";
            } else {
                str2 = " (overridden)";
            }
            return C18180wK.A0i(str2, A0r);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public C10300i6 getSession() {
        C10300i6 r0 = this.session;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    private final String[] getBitmapConfigStrings() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add("");
        C18230wP.A1O(Bitmap.Config.ALPHA_8, A0v);
        C18230wP.A1O(Bitmap.Config.RGB_565, A0v);
        C18230wP.A1O(Bitmap.Config.ARGB_4444, A0v);
        C18230wP.A1O(Bitmap.Config.ARGB_8888, A0v);
        C18230wP.A1O(Bitmap.Config.RGBA_F16, A0v);
        C18230wP.A1O(Bitmap.Config.HARDWARE, A0v);
        if (Build.VERSION.SDK_INT >= 33) {
            C18230wP.A1O(Bitmap.Config.RGBA_1010102, A0v);
        }
        return (String[]) A0v.toArray(new String[0]);
    }

    /* access modifiers changed from: private */
    public final void updateModules() {
        UserSession userSession;
        C10300i6 session2 = getSession();
        if (session2 instanceof UserSession) {
            userSession = (UserSession) session2;
        } else {
            userSession = null;
        }
        ImageDebugSessionHelper.updateModules(userSession);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-899347809);
        super.onCreate(bundle);
        setSession(C18200wM.A0V(this));
        C14030oh.A09(-1700631840, A02);
    }

    private final AnonymousClass4MA createMultiChoiceMenuItem(CharSequence charSequence, Object[] objArr, int i, Object obj, AnonymousClass0YY r14) {
        Object[] objArr2 = objArr;
        ArrayList A0k = C18240wQ.A0k(r4);
        for (Object valueOf : objArr) {
            A0k.add(String.valueOf(valueOf));
        }
        return createMultiChoiceMenuItem(charSequence, (String[]) A0k.toArray(new String[0]), objArr2, i, obj, r14);
    }
}
