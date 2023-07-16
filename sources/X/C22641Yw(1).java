package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.redex.IDxAListenerShape388S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape447S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.ui.bottomsheet.intf.IDxCListenerShape179S0100000_1_I2;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.1Yw  reason: invalid class name and case insensitive filesystem */
public final class C22641Yw extends C34640IcN {
    public static final String __redex_internal_original_name = "TwoFacLoginVerifyFragment";
    public Handler A00;
    public View A01;
    public View A02;
    public CheckBox A03;
    public TextView A04;
    public QuickPerformanceLogger A05;
    public C310624b A06;
    public AnonymousClass38M A07;
    public AnonymousClass3YZ A08;
    public C07530bf A09;
    public ConfirmationCodeEditText A0A;
    public ProgressButton A0B;
    public AnonymousClass265 A0C;
    public Integer A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public final C63873iU A0R = C63873iU.A06(this, 94);
    public final C63873iU A0S = C63873iU.A06(this, 95);
    public final C72044Lv A0T = new IDxCListenerShape179S0100000_1_I2(this, 1);
    public final Runnable A0U = new AnonymousClass4PP(this);
    public final TextWatcher A0V = new IDxWAdapterShape193S0100000_1_I2(this, 7);
    public final View.OnClickListener A0W = C18190wL.A0H(this, 543);
    public final View.OnClickListener A0X = C18190wL.A0H(this, 544);
    public final View.OnLongClickListener A0Y = new IDxCListenerShape447S0100000_1_I2(this, 1);
    public final TextView.OnEditorActionListener A0Z = new IDxAListenerShape388S0100000_1_I2(this, 8);
    public final C63873iU A0a = C63873iU.A06(this, 93);
    public final IDxACallbackShape111S0100000_1_I2 A0b = C63873iU.A06(this, 92);
    public final C82394pY A0c = C18220wO.A0P(this, 41);

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C310624b r1 = this.A06;
        if (r1 == null) {
            C04220Ms.A0E("twoFacClearMethod");
            throw null;
        } else {
            bundle.putSerializable("saved_two_fac_clear_method", r1);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0Q) {
            AnonymousClass3YZ r0 = this.A08;
            if (r0 == null) {
                str3 = "twoFacSecureNonceManager";
            } else {
                String str4 = this.A0E;
                if (str4 == null) {
                    str3 = "pk";
                } else {
                    AnonymousClass3YZ.A00(r0);
                    C61173Se r02 = (C61173Se) r0.A00.get(str4);
                    if (r02 != null) {
                        str = r02.A01;
                    } else {
                        str = null;
                    }
                    FragmentActivity requireActivity = requireActivity();
                    C07530bf r2 = this.A09;
                    if (r2 == null) {
                        str3 = "loggedOutSession";
                    } else {
                        String str5 = this.A0H;
                        if (str5 == null) {
                            str3 = C63833iQ.A06();
                        } else {
                            String str6 = this.A0G;
                            if (str6 == null) {
                                str3 = "twoFacIdentifier";
                            } else {
                                C32165H8c A002 = C62403Zn.A00(requireActivity, r2, str5, str6, str, String.valueOf(5), (List) null, false);
                                A002.A00 = new C26781rC(this, true);
                                schedule(A002);
                                double A003 = AnonymousClass269.A00();
                                double A004 = C18200wM.A00();
                                C07530bf r03 = this.A09;
                                if (r03 == null) {
                                    str2 = "loggedOutSession";
                                } else {
                                    USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r03), "two_fac_login_attempt_with_trusted_device"), 2772);
                                    AnonymousClass0wJ.A1A(A0I2, A004, A003);
                                    C18180wK.A19(A0I2);
                                    C18180wK.A1A(A0I2, A003);
                                    AnonymousClass265 r04 = this.A0C;
                                    if (r04 == null) {
                                        str2 = "twoFacStage";
                                    } else {
                                        AnonymousClass269.A08(A0I2, r04.A01);
                                        C18180wK.A1B(A0I2, A004);
                                        A0I2.Bb4();
                                        return;
                                    }
                                }
                                C04220Ms.A0E(str2);
                                throw null;
                            }
                        }
                    }
                }
            }
            C04220Ms.A0E(str3);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r0.isChecked() != true) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C22641Yw r12) {
        /*
            X.0bf r1 = r12.A09
            java.lang.String r3 = "loggedOutSession"
            r10 = 0
            if (r1 == 0) goto L_0x0051
            X.265 r0 = r12.A0C
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "twoFacStage"
        L_0x000d:
            X.C04220Ms.A0E(r0)
            throw r10
        L_0x0011:
            java.lang.String r0 = r0.A01
            X.C62713aZ.A01(r1, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r12.A0B
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "confirmButton"
            goto L_0x000d
        L_0x001d:
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x002a
            com.facebook.quicklog.QuickPerformanceLogger r2 = r12.A05
            if (r2 != 0) goto L_0x0039
            java.lang.String r0 = "qplLogger"
            goto L_0x000d
        L_0x002a:
            android.content.Context r1 = r12.requireContext()
            r0 = 2131835358(0x7f1139de, float:1.9303852E38)
            java.lang.String r0 = r12.getString(r0)
            X.C62973bE.A04(r1, r0, r10)
            return
        L_0x0039:
            r1 = 203167632(0xc1c1790, float:1.2024893E-31)
            java.lang.String r0 = "CONFIRM_CLICK"
            r2.markerPoint(r1, r0)
            android.content.Context r4 = r12.requireContext()
            X.0bf r5 = r12.A09
            if (r5 == 0) goto L_0x0051
            java.lang.String r6 = r12.A0H
            if (r6 != 0) goto L_0x0055
            java.lang.String r3 = X.C63833iQ.A06()
        L_0x0051:
            X.C04220Ms.A0E(r3)
            throw r10
        L_0x0055:
            java.lang.String r7 = r12.A0G
            if (r7 != 0) goto L_0x005c
            java.lang.String r3 = "twoFacIdentifier"
            goto L_0x0051
        L_0x005c:
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r0 = r12.A0A
            if (r0 != 0) goto L_0x0063
            java.lang.String r3 = "confirmationCodeEditText"
            goto L_0x0051
        L_0x0063:
            java.lang.String r8 = X.C18180wK.A0f(r0)
            android.widget.CheckBox r0 = r12.A03
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.isChecked()
            r11 = 1
            if (r0 == r1) goto L_0x0075
        L_0x0074:
            r11 = 0
        L_0x0075:
            X.24b r0 = r12.A06
            if (r0 != 0) goto L_0x007c
            java.lang.String r3 = "twoFacClearMethod"
            goto L_0x0051
        L_0x007c:
            int r0 = r0.A00
            java.lang.String r9 = java.lang.String.valueOf(r0)
            X.H8c r1 = X.C62403Zn.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            X.1rC r0 = new X.1rC
            r0.<init>(r12, r2)
            r1.A00 = r0
            r12.schedule(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22641Yw.A00(X.1Yw):void");
    }

    public static final void A01(C22641Yw r8) {
        String str;
        C07530bf r1 = r8.A09;
        if (r1 == null) {
            str = "loggedOutSession";
        } else {
            String str2 = r8.A0H;
            if (str2 == null) {
                str = C63833iQ.A06();
            } else {
                String A002 = C09140ev.A00(r8.requireContext());
                C04220Ms.A06(A002);
                String str3 = r8.A0G;
                if (str3 == null) {
                    str = "twoFacIdentifier";
                } else {
                    String A062 = C63833iQ.A06();
                    H1T A0O2 = AnonymousClass0wJ.A0O(r1);
                    A0O2.A0J(C63833iQ.A07(737, 42, 26));
                    A0O2.A0B(AnonymousClass1RP.class, AnonymousClass3NG.class);
                    A0O2.A0O(C63833iQ.A00(), A002);
                    C32165H8c A0T2 = C18200wM.A0T(A0O2, C63833iQ.A09(A0O2, A062, str2), str3);
                    A0T2.A00 = r8.A0b;
                    r8.schedule(A0T2);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A02(C22641Yw r12) {
        String str;
        AnonymousClass265 r0;
        ConfirmationCodeEditText confirmationCodeEditText = r12.A0A;
        String str2 = "confirmationCodeEditText";
        if (confirmationCodeEditText != null) {
            C18250wR.A0t(confirmationCodeEditText);
            C310624b r1 = r12.A06;
            if (r1 == null) {
                str = "twoFacClearMethod";
            } else {
                str = "trustDeviceOptionsSection";
                if (r1 == C310624b.TRUSTED_NOTIFICATION) {
                    View view = r12.A02;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else if (r12.requireArguments().getBoolean("argument_show_trusted_device_option")) {
                    View view2 = r12.A02;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        CheckBox checkBox = r12.A03;
                        if (checkBox != null) {
                            checkBox.setChecked(r12.A0J);
                        }
                    }
                }
                C310624b r02 = r12.A06;
                if (r02 == null) {
                    str2 = "twoFacClearMethod";
                } else {
                    int ordinal = r02.ordinal();
                    str = "descriptionTextView";
                    if (ordinal == 0) {
                        TextView textView = r12.A0N;
                        if (textView != null) {
                            textView.setText(2131837098);
                            String str3 = r12.A0O;
                            if (str3 != null) {
                                String A0o = AnonymousClass0wJ.A0o(r12, str3, 2131837097);
                                C04220Ms.A06(A0o);
                                int A082 = C18220wO.A08(A0o);
                                SpannableStringBuilder A0E2 = C18200wM.A0E(A0o);
                                C04220Ms.A06(A0E2.append(10));
                                A0E2.append(AnonymousClass00U.A0A(r12.getString(2131837046), '.'));
                                A0E2.setSpan(C18730xl.A00(r12, C18220wO.A04(r12), 41), A082, C18220wO.A08(A0E2.toString()), 18);
                                TextView textView2 = r12.A0L;
                                if (textView2 != null) {
                                    C18180wK.A0z(textView2);
                                    TextView textView3 = r12.A0L;
                                    if (textView3 != null) {
                                        textView3.setText(A0E2);
                                        TextView textView4 = r12.A0M;
                                        if (textView4 != null) {
                                            textView4.setVisibility(8);
                                            if (!r12.A0I) {
                                                A03(r12, true);
                                            }
                                            ConfirmationCodeEditText confirmationCodeEditText2 = r12.A0A;
                                            if (confirmationCodeEditText2 != null) {
                                                confirmationCodeEditText2.setVisibility(0);
                                                ConfirmationCodeEditText confirmationCodeEditText3 = r12.A0A;
                                                if (confirmationCodeEditText3 != null) {
                                                    confirmationCodeEditText3.A04(6, true);
                                                    r0 = AnonymousClass265.A1T;
                                                    r12.A0C = r0;
                                                }
                                            }
                                        }
                                    }
                                }
                                C04220Ms.A0E("bodyTextView");
                                throw null;
                            }
                            C04220Ms.A0E("obfuscatedPhoneNumber");
                            throw null;
                        }
                        C04220Ms.A0E("titleTextView");
                        throw null;
                    } else if (ordinal == 2) {
                        TextView textView5 = r12.A0N;
                        if (textView5 != null) {
                            textView5.setText(2131837101);
                            TextView textView6 = r12.A0L;
                            if (textView6 != null) {
                                int i = 2131837099;
                                if (r12.A0P) {
                                    i = 2131837093;
                                }
                                textView6.setText(i);
                                TextView textView7 = r12.A0M;
                                if (textView7 != null) {
                                    textView7.setText(2131837100);
                                    TextView textView8 = r12.A0M;
                                    if (textView8 != null) {
                                        textView8.setVisibility(0);
                                        ConfirmationCodeEditText confirmationCodeEditText4 = r12.A0A;
                                        if (confirmationCodeEditText4 != null) {
                                            confirmationCodeEditText4.setVisibility(0);
                                            ConfirmationCodeEditText confirmationCodeEditText5 = r12.A0A;
                                            if (confirmationCodeEditText5 != null) {
                                                confirmationCodeEditText5.A04(6, true);
                                                r0 = AnonymousClass265.A1U;
                                                r12.A0C = r0;
                                            }
                                        }
                                    }
                                }
                            }
                            C04220Ms.A0E("bodyTextView");
                            throw null;
                        }
                        C04220Ms.A0E("titleTextView");
                        throw null;
                    } else if (ordinal == 1) {
                        TextView textView9 = r12.A0N;
                        if (textView9 != null) {
                            textView9.setText(2131837096);
                            TextView textView10 = r12.A0L;
                            if (textView10 != null) {
                                textView10.setText(2131837094);
                                TextView textView11 = r12.A0M;
                                if (textView11 != null) {
                                    textView11.setText(2131837095);
                                    TextView textView12 = r12.A0M;
                                    if (textView12 != null) {
                                        textView12.setVisibility(0);
                                        ConfirmationCodeEditText confirmationCodeEditText6 = r12.A0A;
                                        if (confirmationCodeEditText6 != null) {
                                            confirmationCodeEditText6.setVisibility(0);
                                            ConfirmationCodeEditText confirmationCodeEditText7 = r12.A0A;
                                            if (confirmationCodeEditText7 != null) {
                                                confirmationCodeEditText7.A04(8, false);
                                                r0 = AnonymousClass265.A1S;
                                                r12.A0C = r0;
                                            }
                                        }
                                    }
                                }
                            }
                            C04220Ms.A0E("bodyTextView");
                            throw null;
                        }
                        C04220Ms.A0E("titleTextView");
                        throw null;
                    } else if (ordinal == 3) {
                        TextView textView13 = r12.A0N;
                        if (textView13 != null) {
                            textView13.setText(2131830173);
                            TextView textView14 = r12.A0L;
                            if (textView14 != null) {
                                textView14.setText(2131830171);
                                TextView textView15 = r12.A0M;
                                if (textView15 != null) {
                                    textView15.setVisibility(0);
                                    TextView textView16 = r12.A0M;
                                    if (textView16 != null) {
                                        textView16.setText(2131830172);
                                        ConfirmationCodeEditText confirmationCodeEditText8 = r12.A0A;
                                        if (confirmationCodeEditText8 != null) {
                                            confirmationCodeEditText8.setVisibility(8);
                                            r0 = AnonymousClass265.A1V;
                                            r12.A0C = r0;
                                        }
                                    }
                                }
                            }
                            C04220Ms.A0E("bodyTextView");
                            throw null;
                        }
                        C04220Ms.A0E("titleTextView");
                        throw null;
                    } else if (ordinal != 5) {
                        C10450iM.A03(__redex_internal_original_name, "no clear method");
                    } else {
                        TextView textView17 = r12.A0N;
                        if (textView17 != null) {
                            textView17.setText(2131837181);
                            TextView textView18 = r12.A0L;
                            if (textView18 != null) {
                                String str4 = r12.A0O;
                                if (str4 != null) {
                                    textView18.setText(AnonymousClass0wJ.A0o(r12, str4, 2131837179));
                                    TextView textView19 = r12.A0M;
                                    if (textView19 != null) {
                                        textView19.setVisibility(0);
                                        TextView textView20 = r12.A0M;
                                        if (textView20 != null) {
                                            textView20.setText(2131837180);
                                            ConfirmationCodeEditText confirmationCodeEditText9 = r12.A0A;
                                            if (confirmationCodeEditText9 != null) {
                                                confirmationCodeEditText9.setVisibility(0);
                                                ConfirmationCodeEditText confirmationCodeEditText10 = r12.A0A;
                                                if (confirmationCodeEditText10 != null) {
                                                    confirmationCodeEditText10.A04(6, true);
                                                    r0 = AnonymousClass265.A1W;
                                                    r12.A0C = r0;
                                                }
                                            }
                                        }
                                    }
                                }
                                C04220Ms.A0E("obfuscatedPhoneNumber");
                                throw null;
                            }
                            C04220Ms.A0E("bodyTextView");
                            throw null;
                        }
                        C04220Ms.A0E("titleTextView");
                        throw null;
                    }
                    C07530bf r13 = r12.A09;
                    if (r13 == null) {
                        str2 = "loggedOutSession";
                    } else {
                        AnonymousClass265 r03 = r12.A0C;
                        if (r03 == null) {
                            str2 = "twoFacStage";
                        } else {
                            AnonymousClass3YT.A00(r13, (AnonymousClass3V1) null, (C313625r) null, (Integer) null, r03.A01, (String) null);
                            return;
                        }
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        C04220Ms.A0E(str2);
        throw null;
    }

    public static final void A03(C22641Yw r6, boolean z) {
        String str;
        C07530bf r0 = r6.A09;
        if (r0 != null) {
            C13330nS A022 = C13330nS.A02(r0);
            double A002 = AnonymousClass269.A00();
            double A003 = C18200wM.A00();
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(A022, "two_fac_resend_sms_tapped"), 2775);
            if (AnonymousClass0wJ.A1U(A0I2)) {
                AnonymousClass0wJ.A1A(A0I2, A003, A002);
                C18180wK.A19(A0I2);
                C18180wK.A1A(A0I2, A002);
                AnonymousClass265 r02 = r6.A0C;
                if (r02 == null) {
                    str = "twoFacStage";
                    C04220Ms.A0E(str);
                    throw null;
                }
                AnonymousClass269.A08(A0I2, r02.A01);
                C18180wK.A1B(A0I2, A003);
                C63683i7.A05(A0I2);
                A0I2.Bb4();
            }
            if (!z) {
                AnonymousClass38M r5 = r6.A07;
                str = "twoFacPhoneVerificationHelper";
                if (r5 != null) {
                    if (SystemClock.elapsedRealtime() - r5.A01 < ((long) (r5.A00 * 1000))) {
                        C36232Qn.A00(r6.requireContext(), r5.A00);
                        return;
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            }
            Context requireContext = r6.requireContext();
            C07530bf r03 = r6.A09;
            if (r03 != null) {
                String str2 = r6.A0H;
                if (str2 == null) {
                    str = C63833iQ.A06();
                } else {
                    String str3 = r6.A0G;
                    if (str3 == null) {
                        str = "twoFacIdentifier";
                    } else {
                        H1T A0O2 = AnonymousClass0wJ.A0O(r03);
                        A0O2.A0J("accounts/send_two_factor_login_sms/");
                        C18240wQ.A1A(A0O2, C26641qy.class, AnonymousClass3WN.class);
                        C18180wK.A0t(requireContext, A0O2, C63833iQ.A00(), C18220wO.A0g(requireContext, A0O2, C63833iQ.A09(A0O2, C63833iQ.A06(), str2), str3));
                        C32165H8c A0Q2 = C18190wL.A0Q(A0O2);
                        A0Q2.A00 = r6.A0a;
                        r6.schedule(A0Q2);
                        QuickPerformanceLogger quickPerformanceLogger = r6.A05;
                        if (quickPerformanceLogger == null) {
                            str = "qplLogger";
                        } else {
                            quickPerformanceLogger.markerPoint(203167632, "RESEND_CODE_CLICK");
                            return;
                        }
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            }
        }
        str = "loggedOutSession";
        C04220Ms.A0E(str);
        throw null;
    }

    public final void beforeOnPause() {
        Handler handler = this.A00;
        if (handler == null) {
            C04220Ms.A0E("notificationStatusHandler");
            throw null;
        } else {
            handler.removeCallbacks(this.A0U);
        }
    }

    public final C10300i6 getSession() {
        C07530bf r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("loggedOutSession");
        throw null;
    }

    public final void afterOnResume() {
        String str;
        super.afterOnResume();
        C310624b r1 = this.A06;
        if (r1 == null) {
            str = "twoFacClearMethod";
        } else if (r1 == C310624b.TRUSTED_NOTIFICATION) {
            Handler handler = this.A00;
            if (handler == null) {
                str = "notificationStatusHandler";
            } else {
                handler.postDelayed(this.A0U, 3000);
                return;
            }
        } else {
            return;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        C310624b r2;
        Serializable serializable;
        String str;
        int A022 = C14030oh.A02(-1862661960);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A09 = AnonymousClass0RA.A0C.A04(requireArguments);
        this.A07 = new AnonymousClass38M();
        int i = requireArguments.getInt("resend_sms_delay_sec");
        AnonymousClass38M r0 = this.A07;
        if (r0 == null) {
            str = "twoFacPhoneVerificationHelper";
        } else {
            r0.A00 = i;
            int i2 = requireArguments.getInt("argument_two_fac_clear_method");
            C310624b[] values = C310624b.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    r2 = C310624b.UNKNOWN;
                    break;
                }
                r2 = values[i3];
                if (r2.A00 == i2) {
                    break;
                }
                i3++;
            }
            this.A06 = r2;
            C38040KHr.A01.A03(this.A0c, AnonymousClass45G.class);
            C310624b r22 = this.A06;
            if (r22 == null) {
                str = "twoFacClearMethod";
            } else {
                this.A0I = C18180wK.A1Z(r22, C310624b.SMS);
                this.A0K = requireArguments.getBoolean("ARGUMENT_SHOULD_REMEMBER_PASSWORD");
                this.A0H = C18210wN.A0b(requireArguments, "argument_username", "");
                this.A0E = C18210wN.A0b(requireArguments, "argument_pk", "");
                this.A0G = C18210wN.A0b(requireArguments, "argument_two_fac_identifier", "");
                this.A0O = C18210wN.A0b(requireArguments, "argument_abfuscated_phone_number", "");
                this.A0J = requireArguments.getBoolean("argument_should_opt_in_trusted_device_option");
                this.A0F = C18210wN.A0b(requireArguments, "argument_sms_not_allowed_reason", "");
                this.A0P = requireArguments.getBoolean("eligible_for_multiple_totp");
                this.A0Q = requireArguments.getBoolean("argument_is_trusted_device");
                if (this.A09 == null) {
                    str = "loggedOutSession";
                } else {
                    AnonymousClass01V r1 = AnonymousClass01V.A0p;
                    C04220Ms.A06(r1);
                    this.A05 = r1;
                    r1.markerStart(203167632);
                    this.A00 = AnonymousClass0wJ.A0F();
                    this.A0C = AnonymousClass265.A1R;
                    AnonymousClass3YZ A023 = C62653aT.A02();
                    C04220Ms.A06(A023);
                    this.A08 = A023;
                    if (bundle != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("saved_two_fac_clear_method", C310624b.class);
                        } else {
                            serializable = bundle.getSerializable("saved_two_fac_clear_method");
                        }
                        C04220Ms.A0C(serializable, "null cannot be cast to non-null type com.instagram.login.twofac.constants.TwoFacConstants.TwoFacClearMethod");
                        this.A06 = (C310624b) serializable;
                    }
                    C14030oh.A09(1313565939, A022);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-479853866);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D2 = C18180wK.A0D(layoutInflater, viewGroup, R.layout.two_fac_confirm_phone_number_fragment, false);
        this.A01 = A0D2;
        TextView textView = (TextView) AnonymousClass0wJ.A0J(A0D2, R.id.two_fac_confirm_phone_number_title);
        this.A0N = textView;
        if (textView == null) {
            C04220Ms.A0E("titleTextView");
        } else {
            ViewGroup.MarginLayoutParams A0H2 = C18230wP.A0H(textView);
            A0H2.setMargins(A0H2.leftMargin, 0, A0H2.rightMargin, A0H2.bottomMargin);
            textView.setLayoutParams(A0H2);
            View view = this.A01;
            if (view != null) {
                ImageView A0K2 = C18220wO.A0K(view, R.id.two_fac_back_icon);
                if (A0K2 != null) {
                    A0K2.setVisibility(0);
                    A0K2.setOnClickListener(this.A0X);
                    C18240wQ.A0r(requireContext(), A0K2, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
                }
                View view2 = this.A01;
                if (view2 != null) {
                    this.A0L = (TextView) AnonymousClass0wJ.A0J(view2, R.id.two_fac_confirm_phone_number_body);
                    View view3 = this.A01;
                    if (view3 != null) {
                        this.A0M = (TextView) AnonymousClass0wJ.A0J(view3, R.id.two_fac_confirm_phone_number_description);
                        View view4 = this.A01;
                        if (view4 != null) {
                            ProgressButton progressButton = (ProgressButton) AnonymousClass0wJ.A0J(view4, R.id.next_button);
                            progressButton.setText(2131824237);
                            progressButton.setOnClickListener(this.A0W);
                            progressButton.setEnabled(false);
                            this.A0B = progressButton;
                            View view5 = this.A01;
                            if (view5 != null) {
                                ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) AnonymousClass0wJ.A0J(view5, R.id.edit_text);
                                confirmationCodeEditText.addTextChangedListener(this.A0V);
                                confirmationCodeEditText.setOnEditorActionListener(this.A0Z);
                                confirmationCodeEditText.setOnLongClickListener(this.A0Y);
                                confirmationCodeEditText.A02 = 0;
                                this.A0A = confirmationCodeEditText;
                                View view6 = this.A01;
                                if (view6 != null) {
                                    this.A02 = AnonymousClass0wJ.A0K(view6, R.id.two_fac_trusted_device_login_checkbox);
                                    View view7 = this.A01;
                                    if (view7 != null) {
                                        this.A03 = (CheckBox) view7.findViewById(R.id.two_fac_trusted_device_checkbox);
                                        View view8 = this.A01;
                                        if (view8 != null) {
                                            TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view8, R.id.two_fac_bottom_button_secondary);
                                            textView2.setText(2131837092);
                                            AnonymousClass0wJ.A16(textView2, 545, this);
                                            textView2.setVisibility(0);
                                            this.A04 = textView2;
                                            View view9 = this.A01;
                                            if (view9 != null) {
                                                C18210wN.A0z(view9.findViewById(R.id.footer));
                                                A02(this);
                                                View view10 = this.A01;
                                                if (view10 != null) {
                                                    C14030oh.A09(-942325051, A022);
                                                    return view10;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C04220Ms.A0E("rootView");
        }
        throw null;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1537464454);
        super.onDestroy();
        C38040KHr.A01.A04(this.A0c, AnonymousClass45G.class);
        C14030oh.A09(1003426354, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1743958678);
        super.onPause();
        Window A0F2 = C18190wL.A0F(this);
        if (A0F2 != null) {
            A0F2.setSoftInputMode(0);
            ConfirmationCodeEditText confirmationCodeEditText = this.A0A;
            if (confirmationCodeEditText == null) {
                C04220Ms.A0E("confirmationCodeEditText");
                throw null;
            }
            C09860go.A0I(confirmationCodeEditText);
        }
        C14030oh.A09(383855930, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(703619229);
        super.onResume();
        Window A0F2 = C18190wL.A0F(this);
        if (A0F2 != null) {
            A0F2.setSoftInputMode(16);
            ConfirmationCodeEditText confirmationCodeEditText = this.A0A;
            if (confirmationCodeEditText != null) {
                confirmationCodeEditText.requestFocus();
                ConfirmationCodeEditText confirmationCodeEditText2 = this.A0A;
                if (confirmationCodeEditText2 != null) {
                    C09860go.A0K(confirmationCodeEditText2);
                }
            }
            C04220Ms.A0E("confirmationCodeEditText");
            throw null;
        }
        C14030oh.A09(-1627768489, A022);
    }
}
