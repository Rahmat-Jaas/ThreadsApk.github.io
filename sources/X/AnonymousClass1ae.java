package X;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxTListenerShape94S0300000_1_I2;
import com.facebook.redex.IDxUCallbackShape879S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123;

/* renamed from: X.1ae  reason: invalid class name */
public final class AnonymousClass1ae extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "QuietModeFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgSwitch A0C;
    public String A0D = "settings";
    public IgTextView A0E;
    public final IDxUCallbackShape879S0100000_1_I2 A0F = new IDxUCallbackShape879S0100000_1_I2(this, 0);
    public final IDxUCallbackShape879S0100000_1_I2 A0G = new IDxUCallbackShape879S0100000_1_I2(this, 1);
    public final C11630kW A0H = new C15720rm("quiet_mode");
    public final C04530Oa A0I = C80644m9.A00(this);
    public final C82394pY A0J = C18220wO.A0P(this, 87);
    public final C82394pY A0K = C18220wO.A0P(this, 88);
    public final C82394pY A0L = C18220wO.A0P(this, 89);
    public final C82394pY A0M = C18220wO.A0P(this, 90);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, getString(2131833972));
    }

    public final String getModuleName() {
        return "quiet_mode";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A0E = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.quiet_mode_switch_subtitle);
        View A0J2 = AnonymousClass0wJ.A0J(view2, R.id.quiet_mode_switch_row);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view2, R.id.quiet_mode_switch_footer);
        textView.setVisibility(8);
        C04530Oa r4 = this.A0I;
        UserSession A0X = AnonymousClass0wJ.A0X(r4);
        AnonymousClass0TJ r9 = AnonymousClass0TJ.A05;
        boolean z = false;
        if (C63803iN.A0E(r9, A0X, 36320360874579896L)) {
            textView.setVisibility(0);
            C18200wM.A17(AnonymousClass0wJ.A0B(this), textView, 2131833952);
            if (!C63823iP.A0C(AnonymousClass0wJ.A0X(r4)) || !C63803iN.A0E(r9, AnonymousClass0wJ.A0X(r4), 36320360875104189L)) {
                IgTextView igTextView = this.A0E;
                if (igTextView != null) {
                    igTextView.setVisibility(8);
                }
                C04220Ms.A0E("quietModeSwitchSubtitleView");
                throw null;
            }
            A05(this);
        } else if (C63803iN.A0E(r9, AnonymousClass0wJ.A0X(r4), 36320360874514359L)) {
            IgTextView igTextView2 = this.A0E;
            if (igTextView2 != null) {
                C18200wM.A17(AnonymousClass0wJ.A0B(this), igTextView2, 2131833951);
            }
            C04220Ms.A0E("quietModeSwitchSubtitleView");
            throw null;
        }
        User A012 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(r4));
        IgSwitch igSwitch = (IgSwitch) AnonymousClass0wJ.A0J(view2, R.id.quiet_mode_switch_toggle);
        if (A012.A2w() || C63823iP.A0C(AnonymousClass0wJ.A0X(r4))) {
            z = true;
        }
        igSwitch.setChecked(z);
        igSwitch.setEnabled(true);
        igSwitch.A07 = new IDxTListenerShape94S0300000_1_I2(5, igSwitch, this, A012);
        AnonymousClass0wJ.A1N(A0J2, igSwitch);
        AnonymousClass0wJ.A16(A0J2, 465, igSwitch);
        this.A0C = igSwitch;
        this.A03 = AnonymousClass0wJ.A0K(view2, R.id.quiet_mode_turn_on_automatically);
        this.A08 = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.quiet_mode_time_period);
        this.A00 = AnonymousClass0wJ.A0K(view2, R.id.quiet_mode_divider);
        this.A01 = AnonymousClass0wJ.A0K(view2, R.id.quiet_mode_start_interval_row);
        this.A02 = AnonymousClass0wJ.A0K(view2, R.id.quiet_mode_end_interval_row);
        View view3 = this.A01;
        if (view3 != null) {
            this.A06 = (IgTextView) AnonymousClass0wJ.A0J(view3, R.id.title);
            View view4 = this.A01;
            if (view4 != null) {
                this.A05 = (IgTextView) AnonymousClass0wJ.A0J(view4, R.id.daily_time_spent_quota);
                View view5 = this.A01;
                if (view5 != null) {
                    this.A04 = (IgTextView) AnonymousClass0wJ.A0J(view5, R.id.subtitle);
                    View view6 = this.A02;
                    if (view6 != null) {
                        this.A0B = (IgTextView) AnonymousClass0wJ.A0J(view6, R.id.title);
                        View view7 = this.A02;
                        if (view7 != null) {
                            this.A0A = (IgTextView) AnonymousClass0wJ.A0J(view7, R.id.daily_time_spent_quota);
                            View view8 = this.A02;
                            if (view8 != null) {
                                this.A09 = (IgTextView) AnonymousClass0wJ.A0J(view8, R.id.subtitle);
                                this.A07 = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.quiet_mode_settings_footer);
                                View view9 = this.A01;
                                if (view9 != null) {
                                    AnonymousClass0wJ.A0K(view9, R.id.chevron_right).setVisibility(8);
                                    View view10 = this.A02;
                                    if (view10 != null) {
                                        AnonymousClass0wJ.A0K(view10, R.id.chevron_right).setVisibility(8);
                                        A02(A012);
                                        if (!A012.A2w() || C63823iP.A0C(AnonymousClass0wJ.A0X(r4))) {
                                            A06(this, 0.5f);
                                        }
                                        AnonymousClass3Ui A013 = A01(this);
                                        AnonymousClass3DJ A022 = C696349j.A02(this);
                                        String str = this.A0D;
                                        C04220Ms.A0B(str, 1);
                                        AnonymousClass3Ui.A00(A013, A022, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_settings_impression", str, (Map) null, 4088);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    C04220Ms.A0E("quietModeToRowView");
                    throw null;
                }
            }
        }
        C04220Ms.A0E("quietModeFromRowView");
        throw null;
    }

    public static final UserSession A00(AnonymousClass1ae r0) {
        return AnonymousClass0wJ.A0X(r0.A0I);
    }

    private final void A02(User user) {
        String str;
        C04530Oa r9 = this.A0I;
        UserSession A0X = AnonymousClass0wJ.A0X(r9);
        AnonymousClass0TJ r8 = AnonymousClass0TJ.A05;
        long A032 = C63803iN.A03(r8, A0X, 36601835851353871L) / 3600;
        View view = this.A03;
        if (view == null) {
            str = "quietModeTurnOnAutomaticallyRow";
        } else {
            view.setVisibility(0);
            IgTextView igTextView = this.A07;
            str = "quietModeFooter";
            if (igTextView != null) {
                igTextView.setText(AnonymousClass0wJ.A0o(this, String.valueOf(A032), 2131833971));
                IgTextView igTextView2 = this.A07;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                    View view2 = this.A00;
                    if (view2 == null) {
                        str = "quietModeDivider";
                    } else {
                        view2.setVisibility(0);
                        long A0A2 = AnonymousClass0wJ.A0A() / 1000;
                        long A042 = C63823iP.A04(AnonymousClass0wJ.A0X(r9), user) + A0A2;
                        long A033 = A0A2 + C63823iP.A03(AnonymousClass0wJ.A0X(r9), user);
                        if (C63803iN.A0E(r8, AnonymousClass0wJ.A0X(r9), 36320360874579896L)) {
                            View view3 = this.A01;
                            if (view3 == null) {
                                str = "quietModeFromRowView";
                            } else {
                                view3.setVisibility(0);
                                IgTextView igTextView3 = this.A06;
                                if (igTextView3 == null) {
                                    str = "fromRowViewTile";
                                } else {
                                    C18200wM.A17(AnonymousClass0wJ.A0B(this), igTextView3, 2131833975);
                                    IgTextView igTextView4 = this.A05;
                                    if (igTextView4 != null) {
                                        igTextView4.setVisibility(0);
                                        IgTextView igTextView5 = this.A05;
                                        if (igTextView5 != null) {
                                            igTextView5.setText(C63823iP.A08(this, A042));
                                            IgTextView igTextView6 = this.A04;
                                            if (igTextView6 == null) {
                                                str = "fromRowSubtitle";
                                            } else {
                                                igTextView6.setVisibility(8);
                                                View view4 = this.A02;
                                                if (view4 == null) {
                                                    str = "quietModeToRowView";
                                                } else {
                                                    view4.setVisibility(0);
                                                    IgTextView igTextView7 = this.A0B;
                                                    if (igTextView7 == null) {
                                                        str = "toRowViewTile";
                                                    } else {
                                                        C18200wM.A17(AnonymousClass0wJ.A0B(this), igTextView7, 2131833976);
                                                        IgTextView igTextView8 = this.A0A;
                                                        str = "toRowValue";
                                                        if (igTextView8 != null) {
                                                            igTextView8.setVisibility(0);
                                                            IgTextView igTextView9 = this.A0A;
                                                            if (igTextView9 != null) {
                                                                igTextView9.setText(C63823iP.A08(this, A033));
                                                                IgTextView igTextView10 = this.A09;
                                                                if (igTextView10 == null) {
                                                                    str = "toRowSubtitle";
                                                                } else {
                                                                    igTextView10.setVisibility(8);
                                                                    IgTextView igTextView11 = this.A05;
                                                                    if (igTextView11 != null) {
                                                                        AnonymousClass0wJ.A18(igTextView11, 236, this, user);
                                                                        IgTextView igTextView12 = this.A0A;
                                                                        if (igTextView12 != null) {
                                                                            AnonymousClass0wJ.A18(igTextView12, 237, this, user);
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
                                    C04220Ms.A0E("fromRowValue");
                                    throw null;
                                }
                            }
                        } else {
                            IgTextView igTextView13 = this.A08;
                            str = "quietModeTimePeriodView";
                            if (igTextView13 != null) {
                                igTextView13.setVisibility(0);
                                IgTextView igTextView14 = this.A08;
                                if (igTextView14 != null) {
                                    igTextView14.setText(AnonymousClass0wJ.A0B(this).getString(2131833974, new Object[]{C63823iP.A08(this, A042), C63823iP.A08(this, A033)}));
                                }
                            }
                        }
                        A06(this, 1.0f);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.Ew2, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011a, code lost:
        if (r34 != false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.user.model.User r27, X.AnonymousClass1ae r28, long r29, long r31, boolean r33, boolean r34) {
        /*
            r2 = r29
            r0 = r31
            X.0MQ r10 = new X.0MQ
            r10.<init>()
            r10.A00 = r2
            X.0MQ r12 = new X.0MQ
            r12.<init>()
            r12.A00 = r0
            long r4 = r10.A00
            int r8 = (r4 > r31 ? 1 : (r4 == r31 ? 0 : -1))
            long r6 = r31 - r4
            if (r8 <= 0) goto L_0x001e
            r4 = 86400(0x15180, double:4.26873E-319)
            long r6 = r6 + r4
        L_0x001e:
            r13 = r28
            X.0Oa r4 = r13.A0I
            r26 = r4
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r26)
            X.0TJ r11 = X.AnonymousClass0TJ.A05
            r8 = 36601835851353871(0x82092d000c0f0f, double:3.210486603934762E-306)
            long r14 = X.C63803iN.A03(r11, r4, r8)
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x0073
            X.3Ui r16 = A01(r13)
            X.3DJ r17 = X.C696349j.A02(r13)
            long r4 = r10.A00
            r24 = r4
            long r14 = r12.A00
            java.lang.String r4 = r13.A0D
            java.lang.String r19 = "Interval is too long"
            r22 = r14
            r18 = r4
            r20 = r24
            r16.A01(r17, r18, r19, r20, r22)
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r26)
            long r8 = X.C63803iN.A03(r11, r4, r8)
            long r4 = r6 - r8
            if (r34 == 0) goto L_0x0178
            long r8 = r31 - r4
            r16 = 86400(0x15180, double:4.26873E-319)
            r14 = 0
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x006b
            long r8 = r8 + r16
        L_0x006b:
            int r4 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r4 < 0) goto L_0x0071
            long r8 = r8 - r16
        L_0x0071:
            r12.A00 = r8
        L_0x0073:
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r26)
            r8 = 36601835851484944(0x82092d000e0f10, double:3.210486604017653E-306)
            long r14 = X.C63803iN.A03(r11, r4, r8)
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x011a
            X.3Ui r16 = A01(r13)
            X.3DJ r17 = X.C696349j.A02(r13)
            long r4 = r10.A00
            r24 = r4
            long r14 = r12.A00
            java.lang.String r4 = r13.A0D
            java.lang.String r19 = "Interval is too short"
            r22 = r14
            r18 = r4
            r20 = r24
            r16.A01(r17, r18, r19, r20, r22)
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r26)
            long r4 = X.C63803iN.A03(r11, r4, r8)
            long r6 = r6 - r4
            if (r34 == 0) goto L_0x011d
            long r0 = r31 - r6
            r5 = 86400(0x15180, double:4.26873E-319)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b6
            long r0 = r0 + r5
        L_0x00b6:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x00bb
            long r0 = r0 - r5
        L_0x00bb:
            r12.A00 = r0
        L_0x00bd:
            X.3Ui r14 = A01(r13)
            X.3DJ r15 = X.C696349j.A02(r13)
            java.lang.String r3 = r13.A0D
            long r0 = r10.A00
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r26)
            r2 = r27
            long r4 = X.C63823iP.A04(r4, r2)
            boolean r2 = X.C18200wM.A1Z(r3)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "previous_start_time"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r26 = X.AnonymousClass4WK.A0O(r0)
            java.lang.String r24 = "ig_quiet_mode_start_time_customized"
            r0 = 0
            r27 = 3872(0xf20, float:5.426E-42)
            r17 = r16
            r20 = r0
            r21 = r0
            r22 = r0
            r23 = r0
            r25 = r3
            r18 = r0
            X.AnonymousClass3Ui.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0103:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = X.C18200wM.A0M(r13)
            r9 = 19
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2
            r4 = r2
            r5 = r12
            r6 = r10
            r7 = r13
            r8 = r0
            r10 = r33
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1 = 3
            X.C25237DiI.A00(r0, r0, r2, r3, r1)
            return
        L_0x011a:
            if (r34 == 0) goto L_0x0131
            goto L_0x00bd
        L_0x011d:
            long r0 = -r6
            long r2 = r29 - r0
            r6 = 86400(0x15180, double:4.26873E-319)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x012a
            long r2 = r2 + r6
        L_0x012a:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x012f
            long r2 = r2 - r6
        L_0x012f:
            r10.A00 = r2
        L_0x0131:
            X.3Ui r14 = A01(r13)
            X.3DJ r15 = X.C696349j.A02(r13)
            java.lang.String r3 = r13.A0D
            long r0 = r12.A00
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r26)
            r2 = r27
            long r4 = X.C63823iP.A03(r4, r2)
            boolean r2 = X.C18200wM.A1Z(r3)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)
            java.lang.Long r20 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "previous_end_time"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r26 = X.AnonymousClass4WK.A0O(r0)
            java.lang.String r24 = "ig_quiet_mode_end_time_customized"
            r0 = 0
            r27 = 3856(0xf10, float:5.403E-42)
            r17 = r16
            r18 = r0
            r19 = r0
            r21 = r0
            r22 = r0
            r23 = r0
            r25 = r3
            X.AnonymousClass3Ui.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0103
        L_0x0178:
            long r8 = -r4
            long r4 = r29 - r8
            r16 = 86400(0x15180, double:4.26873E-319)
            r14 = 0
            int r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x0186
            long r4 = r4 + r16
        L_0x0186:
            int r8 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r8 < 0) goto L_0x018c
            long r4 = r4 - r16
        L_0x018c:
            r10.A00 = r4
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ae.A03(com.instagram.user.model.User, X.1ae, long, long, boolean, boolean):void");
    }

    public static final void A04(C83194qw r6, AnonymousClass1ae r7, long j) {
        long j2 = j / 3600;
        C13950oZ.A00(new TimePickerDialog(r7.requireContext(), R.style.SpinnerTimePickerDialog, new C63963im(r6), (int) j2, (int) ((j - (3600 * j2)) / 60), DateFormat.is24HourFormat(r7.requireContext())));
    }

    public static final void A05(AnonymousClass1ae r9) {
        long j;
        C04620Ok r1 = C06810aP.A01;
        C04530Oa r8 = r9.A0I;
        User A012 = r1.A01(AnonymousClass0wJ.A0X(r8));
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long A022 = C63823iP.A02(AnonymousClass0wJ.A0X(r8), currentTimeMillis);
        if (C63823iP.A0G(AnonymousClass0wJ.A0X(r8), A012, currentTimeMillis)) {
            j = 1000 * A022;
        } else {
            j = 1000 * (SandboxRepository.CACHE_TTL + A022);
        }
        Date date = new Date(j);
        IgTextView igTextView = r9.A0E;
        if (igTextView != null) {
            igTextView.setText(C18190wL.A0h(AnonymousClass0wJ.A0B(r9), C63823iP.A09(r9.requireContext(), A022).format(date), 2131833965));
            IgTextView igTextView2 = r9.A0E;
            if (igTextView2 != null) {
                igTextView2.setVisibility(0);
                return;
            }
        }
        C04220Ms.A0E("quietModeSwitchSubtitleView");
        throw null;
    }

    public static final void A06(AnonymousClass1ae r2, float f) {
        IgTextView igTextView = r2.A07;
        String str = "quietModeFooter";
        if (igTextView != null) {
            igTextView.setAlpha(f);
            View view = r2.A03;
            if (view == null) {
                str = "quietModeTurnOnAutomaticallyRow";
            } else {
                view.setAlpha(f);
                View view2 = r2.A00;
                if (view2 == null) {
                    str = "quietModeDivider";
                } else {
                    view2.setAlpha(f);
                    IgTextView igTextView2 = r2.A07;
                    if (igTextView2 != null) {
                        igTextView2.setAlpha(f);
                        View view3 = r2.A01;
                        if (view3 == null) {
                            str = "quietModeFromRowView";
                        } else {
                            view3.setAlpha(f);
                            IgTextView igTextView3 = r2.A05;
                            if (igTextView3 == null) {
                                str = "fromRowValue";
                            } else {
                                igTextView3.setAlpha(f);
                                IgTextView igTextView4 = r2.A04;
                                if (igTextView4 == null) {
                                    str = "fromRowSubtitle";
                                } else {
                                    igTextView4.setAlpha(f);
                                    View view4 = r2.A02;
                                    if (view4 == null) {
                                        str = "quietModeToRowView";
                                    } else {
                                        view4.setAlpha(f);
                                        IgTextView igTextView5 = r2.A0A;
                                        if (igTextView5 == null) {
                                            str = "toRowValue";
                                        } else {
                                            igTextView5.setAlpha(f);
                                            IgTextView igTextView6 = r2.A09;
                                            if (igTextView6 == null) {
                                                str = "toRowSubtitle";
                                            } else {
                                                igTextView6.setAlpha(f);
                                                IgTextView igTextView7 = r2.A08;
                                                if (igTextView7 == null) {
                                                    str = "quietModeTimePeriodView";
                                                } else {
                                                    igTextView7.setAlpha(f);
                                                    return;
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
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A07(AnonymousClass1ae r5, boolean z) {
        C04530Oa r52 = r5.A0I;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0X(r52), 36320360875038652L)) {
            UserSession A0X = AnonymousClass0wJ.A0X(r52);
            C04220Ms.A0B(A0X, 1);
            User A0Y = AnonymousClass0wJ.A0Y(A0X);
            if (z) {
                UserSession A0X2 = AnonymousClass0wJ.A0X(r52);
                C04220Ms.A0B(A0X2, 0);
                UserSession A0X3 = AnonymousClass0wJ.A0X(r52);
                AnonymousClass44Z.A00(A0X3, A0X, A0Y, (AnonymousClass44Z) A0X2.A01(AnonymousClass44Z.class, new KtLambdaShape143S0100000_I2_123(A0X2, 24)));
            }
        }
    }

    public static final void A08(AnonymousClass1ae r5, boolean z) {
        String str;
        IgSwitch igSwitch = r5.A0C;
        if (igSwitch == null) {
            str = "quietModeToggle";
        } else {
            igSwitch.setChecked(z);
            C04620Ok r1 = C06810aP.A01;
            C04530Oa r4 = r5.A0I;
            User A012 = r1.A01(AnonymousClass0wJ.A0X(r4));
            if (z) {
                r5.A02(A012);
                AnonymousClass0wJ.A12(C62803am.A00(C63043bN.A01, AnonymousClass0wJ.A0X(r4)), "QUIET_MODE_NEXT_TOAST_TIME", 0);
            } else {
                A06(r5, 0.5f);
                IgTextView igTextView = r5.A0E;
                if (igTextView == null) {
                    str = "quietModeSwitchSubtitleView";
                } else {
                    igTextView.setVisibility(8);
                }
            }
            C63823iP.A0A(AnonymousClass0wJ.A0X(r4));
            return;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0X(this.A0I);
    }

    public static AnonymousClass3Ui A01(AnonymousClass1ae r2) {
        return C60583Pr.A00(r2.A0H, A00(r2));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-956470812);
        super.onCreate(bundle);
        C38039KHq A002 = AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(this.A0I));
        A002.A01(this.A0J, AnonymousClass467.class);
        A002.A01(this.A0L, AnonymousClass469.class);
        A002.A01(this.A0M, AnonymousClass46A.class);
        A002.A01(this.A0K, AnonymousClass468.class);
        C14030oh.A09(-2099878332, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(246152335);
        C04220Ms.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("entrypoint")) == null) {
            str = "settings";
        }
        this.A0D = str;
        View inflate = layoutInflater.inflate(R.layout.quiet_mode_settings, viewGroup, false);
        C14030oh.A09(482217899, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(979319486);
        super.onDestroy();
        C38039KHq A002 = AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(this.A0I));
        A002.A02(this.A0J, AnonymousClass467.class);
        A002.A02(this.A0L, AnonymousClass469.class);
        A002.A02(this.A0M, AnonymousClass46A.class);
        A002.A02(this.A0K, AnonymousClass468.class);
        C14030oh.A09(2054710130, A022);
    }
}
