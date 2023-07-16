package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.IOException;

/* renamed from: X.1rC  reason: invalid class name and case insensitive filesystem */
public final class C26781rC extends C24431ij {
    public final boolean A00;
    public final /* synthetic */ C22641Yw A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26781rC(X.C22641Yw r10, boolean r11) {
        /*
            r9 = this;
            r0 = r9
            r3 = r10
            r9.A01 = r10
            X.0bf r5 = r10.A09
            if (r5 != 0) goto L_0x000f
            java.lang.String r0 = "loggedOutSession"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x000f:
            androidx.fragment.app.FragmentActivity r1 = r10.requireActivity()
            X.265 r6 = X.AnonymousClass265.A1Q
            java.lang.Integer r7 = X.AnonymousClass006.A00
            r4 = 0
            android.net.Uri r2 = X.C67323zM.A01(r10)
            r8 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.A00 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26781rC.<init>(X.1Yw, boolean):void");
    }

    public final void A02(C26641qy r14) {
        int A002 = AnonymousClass0wJ.A00(-1777652521, r14);
        C22641Yw r8 = this.A01;
        if (r8.requireArguments().getBoolean("argument_is_from_one_click_flow")) {
            AnonymousClass0wJ.A13(C18220wO.A0B(C08360dF.A00()), "has_one_clicked_logged_in", true);
        }
        String id = r14.A00.getId();
        C07530bf r0 = r8.A09;
        String str = "loggedOutSession";
        if (r0 != null) {
            if (C63533hk.A02(r0).A0I(id)) {
                C07530bf r02 = r8.A09;
                if (r02 != null) {
                    C63533hk A02 = C63533hk.A02(r02);
                    C07530bf r03 = r8.A09;
                    if (r03 != null) {
                        A02.A0E(r03, id);
                    }
                }
            }
            if (r8.A0K) {
                C07530bf r04 = r8.A09;
                if (r04 != null) {
                    C63533hk A022 = C63533hk.A02(r04);
                    Integer num = AnonymousClass006.A15;
                    C07530bf r9 = r8.A09;
                    if (r9 != null) {
                        A022.A0B(r8, r9, num, id, true);
                    }
                }
            }
            AnonymousClass3YZ r05 = r8.A08;
            if (r05 == null) {
                str = "twoFacSecureNonceManager";
            } else {
                String str2 = r8.A0E;
                if (str2 == null) {
                    str = "pk";
                } else {
                    r05.A01.remove(str2);
                    if (this.A00) {
                        double A003 = AnonymousClass269.A00();
                        double A004 = C18200wM.A00();
                        C07530bf r5 = r8.A09;
                        if (r5 != null) {
                            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "two_fac_login_success_with_trusted_device"), 2774);
                            AnonymousClass0wJ.A1A(A0I, A004, A003);
                            C18180wK.A19(A0I);
                            C18180wK.A1A(A0I, A003);
                            AnonymousClass265 r2 = r8.A0C;
                            if (r2 == null) {
                                str = "twoFacStage";
                            } else {
                                AnonymousClass269.A08(A0I, r2.A01);
                                C18180wK.A1B(A0I, A004);
                                A0I.Bb4();
                            }
                        }
                    }
                    QuickPerformanceLogger quickPerformanceLogger = r8.A05;
                    if (quickPerformanceLogger == null) {
                        str = "qplLogger";
                    } else {
                        quickPerformanceLogger.markerEnd(203167632, 2);
                        super.A02(r14);
                        C14030oh.A0A(733348507, A002);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onFail(AnonymousClass3XX r11) {
        boolean z;
        String str;
        AnonymousClass1j3 r0;
        int A03 = C14030oh.A03(991468404);
        C04220Ms.A0B(r11, 0);
        super.onFail(r11);
        Object obj = r11.A00;
        if (!AnonymousClass0wJ.A1W(obj) || (r0 = (AnonymousClass1j3) obj) == null || !r0.isCheckpointRequired()) {
            z = false;
        } else {
            z = true;
            C18190wL.A19(this.A01);
        }
        if (this.A00 && !z) {
            C22641Yw r2 = this.A01;
            C310624b r1 = r2.A06;
            str = "twoFacClearMethod";
            if (r1 != null) {
                if (r1 == C310624b.SMS) {
                    C22641Yw.A03(r2, true);
                } else if (r1 == C310624b.WHATSAPP) {
                    C22641Yw.A01(r2);
                }
                View view = r2.A01;
                if (view == null) {
                    str = "rootView";
                } else {
                    view.setVisibility(0);
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        AnonymousClass1j3 r6 = (AnonymousClass1j3) obj;
        if (r6 != null) {
            C22641Yw r5 = this.A01;
            String errorMessage = r6.getErrorMessage();
            double A002 = AnonymousClass269.A00();
            double A003 = C18200wM.A00();
            C07530bf r7 = r5.A09;
            if (r7 != null) {
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "two_fac_login_failed"), 2773);
                AnonymousClass0wJ.A1A(A0I, A003, A002);
                C18180wK.A19(A0I);
                AnonymousClass265 r72 = r5.A0C;
                if (r72 != null) {
                    AnonymousClass269.A08(A0I, r72.A01);
                    AnonymousClass0wJ.A1D(A0I, A002, A003);
                    C63683i7.A08(A0I);
                    A0I.A0T(DialogModule.KEY_MESSAGE, errorMessage);
                    A0I.Bb4();
                    boolean hasErrorType = r6.hasErrorType("sms_code_validation_code_invalid");
                    str = "qplLogger";
                    QuickPerformanceLogger quickPerformanceLogger = r5.A05;
                    if (hasErrorType) {
                        if (quickPerformanceLogger != null) {
                            quickPerformanceLogger.markerPoint(203167632, "LOGIN_REQUEST_FAILED");
                        }
                        C04220Ms.A0E(str);
                        throw null;
                    }
                    if (quickPerformanceLogger != null) {
                        quickPerformanceLogger.markerEnd(203167632, 3);
                    }
                    C04220Ms.A0E(str);
                    throw null;
                    if (C04220Ms.A0I(r6.getErrorMessage(), r5.getString(2131837186))) {
                        C07530bf r3 = r5.A09;
                        if (r3 != null) {
                            AnonymousClass265 r02 = r5.A0C;
                            if (r02 != null) {
                                C63313hF.A04(r3, (C313625r) null, r02, "next_blocked");
                            }
                        }
                    } else if (r6.hasErrorType("invalid_trusted_device")) {
                        AnonymousClass3YZ A02 = C62653aT.A02();
                        String str2 = r5.A0E;
                        if (str2 == null) {
                            str = "pk";
                            C04220Ms.A0E(str);
                            throw null;
                        }
                        A02.A00.remove(str2);
                        try {
                            AnonymousClass3YZ.A01(A02);
                        } catch (IOException e) {
                            C10450iM.A07("Two fac secure nonce manager", e);
                        }
                    }
                }
                str = "twoFacStage";
                C04220Ms.A0E(str);
                throw null;
            }
            str = "loggedOutSession";
            C04220Ms.A0E(str);
            throw null;
        }
        C14030oh.A0A(-425511173, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(2120426756);
        super.onFinish();
        boolean z = this.A00;
        C22641Yw r3 = this.A01;
        if (z) {
            C61873Wd.A01(r3.getParentFragmentManager());
        } else {
            ProgressButton progressButton = r3.A0B;
            String str = "confirmButton";
            if (progressButton != null) {
                progressButton.setEnabled(true);
                ProgressButton progressButton2 = r3.A0B;
                if (progressButton2 != null) {
                    progressButton2.setShowProgressBar(false);
                    TextView textView = r3.A04;
                    str = "secondaryButton";
                    if (textView != null) {
                        textView.setEnabled(true);
                        TextView textView2 = r3.A04;
                        if (textView2 != null) {
                            textView2.setAlpha(1.0f);
                        }
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        C14030oh.A0A(1235212423, A03);
    }

    public final void onStart() {
        String str;
        int A03 = C14030oh.A03(-1406853597);
        super.onStart();
        boolean z = this.A00;
        C22641Yw r4 = this.A01;
        if (z) {
            View view = r4.A01;
            if (view == null) {
                str = "rootView";
            } else {
                view.setVisibility(8);
                C61873Wd.A02(r4.getParentFragmentManager());
                C14030oh.A0A(-1540164599, A03);
                return;
            }
        } else {
            ProgressButton progressButton = r4.A0B;
            if (progressButton != null) {
                progressButton.setEnabled(false);
                ProgressButton progressButton2 = r4.A0B;
                if (progressButton2 != null) {
                    progressButton2.setShowProgressBar(true);
                    TextView textView = r4.A04;
                    str = "secondaryButton";
                    if (textView != null) {
                        textView.setEnabled(false);
                        TextView textView2 = r4.A04;
                        if (textView2 != null) {
                            textView2.setAlpha(0.25f);
                            C14030oh.A0A(-1540164599, A03);
                            return;
                        }
                    }
                }
            }
            C04220Ms.A0E("confirmButton");
            throw null;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14030oh.A0A(-225297542, C63873iU.A04(this, obj, -365070744));
    }
}
