package com.instagram.wellbeing.timespent.fragment;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass24C;
import X.AnonymousClass24O;
import X.AnonymousClass4QS;
import X.C04220Ms;
import X.C09650fs;
import X.C10300i6;
import X.C10450iM;
import X.C121907Is;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18230wP;
import X.C25202Dhh;
import X.C30845GYu;
import X.C31171Ghr;
import X.C34640IcN;
import X.C34822La;
import X.C54602zi;
import X.C60653Py;
import X.C63043bN;
import X.C63193gy;
import X.C63433hT;
import X.C63583hq;
import X.C63803iN;
import X.C81414nk;
import X.C82424pb;
import X.C84444t9;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

public final class TimeSpentReminderFullyBlockingFragment extends C34640IcN implements C82424pb, C81414nk {
    public View A00;
    public ContextThemeWrapper A01;
    public UserSession A02;
    public AnonymousClass24O A03;
    public int A04 = 0;
    public final Handler A05 = AnonymousClass0wJ.A0F();
    public final Runnable A06 = new AnonymousClass4QS(this);

    private int A00() {
        Context context = this.A01;
        if (context == null) {
            context = requireContext();
        }
        return context.getColor(R.color.design_dark_default_color_on_background);
    }

    public final String getModuleName() {
        if (this.A03.ordinal() != 1) {
            return "guardian_daily_limit_reached";
        }
        return "take_a_break";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final AnonymousClass24C getStatusBarType() {
        return AnonymousClass24C.FORCED_DARK_MODE;
    }

    public final boolean onBackPressed() {
        AnonymousClass24O r4 = this.A03;
        int ordinal = r4.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0 || ordinal == 4) {
                requireActivity().moveTaskToBack(true);
                UserSession userSession = this.A02;
                String str = this.A03.A00;
                C04220Ms.A0B(userSession, 0);
                C63583hq.A03(userSession, AnonymousClass006.A0A, (Integer) null, (Long) null, (Long) null, (Long) null, str);
            } else if (ordinal != 2 && ordinal != 3) {
                return false;
            } else {
                C10450iM.A03("TimeSpentReminderFullyBlockingFragment_shouldFinishActivityUponResume", AnonymousClass00U.A0L("Unrecognized reminder type ", r4.A00));
                return false;
            }
        }
        return true;
    }

    private void A01(View view) {
        int i;
        String string;
        Integer Afm;
        String string2;
        int i2;
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.guardian_limit_reached_title);
        TextView A0L2 = AnonymousClass0wJ.A0L(view, R.id.guardian_limit_reached_subtitle);
        Context context = getContext();
        AnonymousClass24O r2 = this.A03;
        int ordinal = r2.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                if (context == null || !C09650fs.A02(context)) {
                    if (C63803iN.A05(AnonymousClass0TJ.A05, this.A02, 36322370918554945L).booleanValue()) {
                        string = AnonymousClass0wJ.A0B(this).getString(2131824732);
                    } else {
                        long A042 = C63043bN.A01.A04(this.A02);
                        string = AnonymousClass0wJ.A0B(this).getString(2131824731);
                        A0L2.setText(C18190wL.A0h(AnonymousClass0wJ.A0B(this), C60653Py.A01(AnonymousClass0wJ.A0B(this), A042), 2131824733));
                        A0L.setText(string);
                        A0L.setTextColor(A00());
                    }
                } else {
                    string = C18190wL.A0h(AnonymousClass0wJ.A0B(this), AnonymousClass0wJ.A0B(this).getString(R.string.f0nameremoved), 2131824730);
                }
                A0L2.setText(2131824734);
                A0L.setText(string);
                A0L.setTextColor(A00());
            } else if (ordinal == 4) {
                C84444t9 A022 = C63193gy.A02(this.A02);
                if (A022 != null && (Afm = A022.Afm()) != null) {
                    Integer A032 = C63193gy.A03(A022, this.A02);
                    if (A032 != null) {
                        Afm = A032;
                    }
                    if (context == null || !C09650fs.A02(context)) {
                        boolean booleanValue = C63803iN.A05(AnonymousClass0TJ.A05, this.A02, 36322370918554945L).booleanValue();
                        Resources A0B = AnonymousClass0wJ.A0B(this);
                        if (booleanValue) {
                            string2 = A0B.getString(2131835258);
                        } else {
                            string2 = A0B.getString(2131835257);
                            i2 = 2131835255;
                            A0L.setText(string2);
                            A0L.setTextColor(A00());
                            A0L2.setText(C18190wL.A0h(AnonymousClass0wJ.A0B(this), C31171Ghr.A07(requireContext(), ((AnonymousClass0wJ.A0A() / 1000) + ((long) Afm.intValue())) * 1000), i2));
                        }
                    } else {
                        string2 = C18190wL.A0h(AnonymousClass0wJ.A0B(this), AnonymousClass0wJ.A0B(this).getString(R.string.f0nameremoved), 2131824730);
                    }
                    i2 = 2131835256;
                    A0L.setText(string2);
                    A0L.setTextColor(A00());
                    A0L2.setText(C18190wL.A0h(AnonymousClass0wJ.A0B(this), C31171Ghr.A07(requireContext(), ((AnonymousClass0wJ.A0A() / 1000) + ((long) Afm.intValue())) * 1000), i2));
                } else {
                    return;
                }
            } else if (ordinal == 2 || ordinal == 3) {
                C10450iM.A03("TimeSpentReminderFullyBlockingFragment_setupView", AnonymousClass00U.A0L("Unrecognized reminder type ", r2.A00));
                return;
            } else {
                return;
            }
            i = A00();
        } else {
            int A052 = (int) C63043bN.A01.A05(this.A02);
            if (A052 <= 0) {
                A052 = this.A04;
            }
            A0L.setText(2131836604);
            A0L.setTextColor(A00());
            A0L2.setText(C18190wL.A0h(AnonymousClass0wJ.A0B(this), C60653Py.A00(AnonymousClass0wJ.A0B(this), A052 / 60, C63803iN.A0E(AnonymousClass0TJ.A05, this.A02, 36316134626102240L), false), 2131836601));
            Context context2 = this.A01;
            if (context2 == null) {
                context2 = requireContext();
            }
            i = context2.getColor(R.color.bright_foreground_disabled_material_dark);
        }
        A0L2.setTextColor(i);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(528221384);
        super.onCreate(bundle);
        if (!C34822La.A00(requireContext())) {
            this.A01 = C121907Is.A03(requireContext(), R.attr.immersiveTheme);
        }
        Bundle requireArguments = requireArguments();
        this.A02 = C18180wK.A0V(requireArguments);
        AnonymousClass24O valueOf = AnonymousClass24O.valueOf(C18190wL.A0j(requireArguments, "reminder_type"));
        this.A03 = valueOf;
        if (valueOf.ordinal() == 1) {
            this.A04 = (int) C63043bN.A01.A05(this.A02);
        }
        C63433hT.A00.add(this);
        C14030oh.A09(-2001930559, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int A022 = C14030oh.A02(1772700778);
        Context context = this.A01;
        if (context == null) {
            context = requireContext();
        }
        View inflate = layoutInflater.cloneInContext(context).inflate(R.layout.guardian_daily_limit_reached, viewGroup, false);
        this.A00 = inflate;
        AnonymousClass24O r2 = this.A03;
        int ordinal = r2.ordinal();
        if (ordinal == 1) {
            Context context2 = this.A01;
            if (context2 == null) {
                context2 = requireContext();
            }
            C18200wM.A0J(inflate, R.id.headline_image).setImageDrawable(C30845GYu.A00(context2.getResources(), R.drawable.ig_illustrations_qp_clock_refresh));
        } else if (!(ordinal == 0 || ordinal == 4 || ordinal == 2 || ordinal == 3)) {
            throw C18180wK.A0a(AnonymousClass0wJ.A0t("Unexpected value: ", r2));
        }
        ImageView A0J = C18200wM.A0J(this.A00, R.id.menu_icon);
        int ordinal2 = this.A03.ordinal();
        if (ordinal2 == 1) {
            Context context3 = this.A01;
            if (context3 == null) {
                context3 = requireContext();
            }
            C18180wK.A0r(context3, A0J, R.drawable.instagram_more_horizontal_outline_44);
            Context context4 = this.A01;
            if (context4 == null) {
                context4 = requireContext();
            }
            C18230wP.A0z(context4, A0J, R.color.black);
            A0J.setVisibility(0);
            Object obj = this.A01;
            if (obj == null) {
                obj = requireContext();
            }
            UserSession userSession = this.A02;
            C18200wM.A1E(A0J, C18210wN.A0L(userSession), obj, userSession, 83);
        } else if (ordinal2 == 0 || ordinal2 == 4 || ordinal2 == 2 || ordinal2 == 3) {
            A0J.setVisibility(8);
        }
        A01(this.A00);
        TextView A0L = AnonymousClass0wJ.A0L(this.A00, R.id.guardian_limit_reached_learn_more);
        AnonymousClass24O r22 = this.A03;
        int ordinal3 = r22.ordinal();
        if (ordinal3 == 1) {
            A0L.setText(2131836602);
            A0L.setTextColor(A00());
            i = 372;
            AnonymousClass0wJ.A17(A0L, i, this);
        } else if (ordinal3 == 0 || ordinal3 == 4) {
            A0L.setText(2131824735);
            A0L.setTextColor(A00());
            i = 371;
            AnonymousClass0wJ.A17(A0L, i, this);
        } else if (ordinal3 == 2 || ordinal3 == 3) {
            C10450iM.A03("TimeSpentReminderFullyBlockingFragment_setupView", AnonymousClass00U.A0L("Unrecognized reminder type ", r22.A00));
        }
        TextView A0L2 = AnonymousClass0wJ.A0L(this.A00, R.id.guardian_limit_reached_settings);
        AnonymousClass24O r23 = this.A03;
        int ordinal4 = r23.ordinal();
        if (ordinal4 == 1) {
            A0L2.setText(2131836603);
            A0L2.setTextColor(A00());
            i2 = 370;
            AnonymousClass0wJ.A17(A0L2, i2, this);
        } else if (ordinal4 == 0 || ordinal4 == 4) {
            A0L2.setText(2131835530);
            A0L2.setTextColor(A00());
            i2 = 369;
            AnonymousClass0wJ.A17(A0L2, i2, this);
        } else if (ordinal4 == 2 || ordinal4 == 3) {
            C10450iM.A03("TimeSpentReminderFullyBlockingFragment_setupView", AnonymousClass00U.A0L("Unrecognized reminder type ", r23.A00));
        }
        TextView A0L3 = AnonymousClass0wJ.A0L(this.A00, R.id.guardian_limit_reached_request_more_time);
        if (this.A03 == AnonymousClass24O.DAILY_LIMIT) {
            if (C63803iN.A05(AnonymousClass0TJ.A05, this.A02, 36322370918554945L).booleanValue() && C09650fs.A04(requireContext())) {
                A0L3.setText(2131828140);
                A0L3.setTextColor(A00());
                AnonymousClass0wJ.A17(A0L3, 368, this);
                View view = this.A00;
                C14030oh.A09(959660893, A022);
                return view;
            }
        }
        A0L3.setVisibility(8);
        View view2 = this.A00;
        C14030oh.A09(959660893, A022);
        return view2;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1375942213);
        super.onDestroy();
        C14030oh.A09(-1745216303, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0100, code lost:
        if ((!X.C63193gy.A05(r10.A02, r2)) != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r17 = this;
            r0 = -770965030(0xffffffffd20c01da, float:-1.50331621E11)
            int r4 = X.C14030oh.A02(r0)
            r10 = r17
            super.onResume()
            android.view.View r0 = r10.A00
            if (r0 == 0) goto L_0x004d
            X.24O r2 = r10.A03
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0104
            r0 = 0
            if (r1 == r0) goto L_0x00f8
            r0 = 4
            if (r1 == r0) goto L_0x00f8
            r0 = 2
            if (r1 == r0) goto L_0x00e9
            r0 = 3
            if (r1 == r0) goto L_0x00e9
        L_0x0025:
            androidx.fragment.app.FragmentActivity r0 = r10.getActivity()
            r0.getClass()
            r0.finish()
            r1 = 0
        L_0x0030:
            X.24O r0 = r10.A03
            int r0 = r0.ordinal()
            r13 = 1
            if (r0 != r13) goto L_0x0048
            if (r1 == 0) goto L_0x00dd
            androidx.fragment.app.FragmentActivity r9 = r10.requireActivity()
            com.instagram.service.session.UserSession r11 = r10.A02
            r12 = 2131099959(0x7f060137, float:1.7812286E38)
            r14 = 0
            X.C25202Dhh.A00(r9, r10, r11, r12, r13, r14)
        L_0x0048:
            android.view.View r0 = r10.A00
            r10.A01(r0)
        L_0x004d:
            X.24O r1 = r10.A03
            X.24O r0 = X.AnonymousClass24O.DAILY_LIMIT
            if (r1 != r0) goto L_0x00d3
            com.instagram.service.session.UserSession r6 = r10.A02
            com.instagram.api.schemas.ScreenTimeScreenType r0 = com.instagram.api.schemas.ScreenTimeScreenType.GUARDIAN_DAILY_LIMIT_BLOCKING_SCREEN
            long r13 = X.C18190wL.A07()
            r7 = 0
            X.C04220Ms.A0B(r6, r7)
            X.3am r5 = X.C63043bN.A01
            java.lang.String r12 = r0.toString()
            X.3Bt r11 = r5.A07(r6, r12)
            if (r11 != 0) goto L_0x0071
            X.3Bt r11 = new X.3Bt
            r15 = r13
            r11.<init>(r12, r13, r15)
        L_0x0071:
            long r2 = r11.A00
            long r0 = r11.A01
            long r2 = r2 - r0
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b0
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r8 = 11
            r0.set(r8, r7)
            X.C18190wL.A1W(r0)
            java.util.Date r1 = r0.getTime()
            java.util.Date r0 = r11.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00da
            long r0 = r11.A02
            long r0 = r0 + r2
            r11.A02 = r0
        L_0x0099:
            r11.A01 = r13
            r11.A00 = r13
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.set(r8, r7)
            X.C18190wL.A1W(r0)
            java.util.Date r0 = r0.getTime()
            X.C04220Ms.A06(r0)
            r11.A03 = r0
        L_0x00b0:
            r0 = 1
            X.C04220Ms.A0B(r12, r0)
            java.lang.String r2 = X.C18220wO.A0p(r11)
            android.content.SharedPreferences r0 = r5.A06(r6)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "SCREEN_TIME_BY_SCREEN_"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r12)
            X.C18180wK.A0v(r1, r0, r2)
            android.os.Handler r3 = r10.A05
            java.lang.Runnable r2 = r10.A06
            r0 = 10000(0x2710, float:1.4013E-41)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
        L_0x00d3:
            r0 = -2002018119(0xffffffff88aba0b9, float:-1.0329474E-33)
            X.C14030oh.A09(r0, r4)
            return
        L_0x00da:
            r11.A02 = r2
            goto L_0x0099
        L_0x00dd:
            androidx.fragment.app.FragmentActivity r2 = r10.requireActivity()
            com.instagram.service.session.UserSession r1 = r10.A02
            r0 = 0
            X.C25202Dhh.A01(r2, r10, r1, r13, r0)
            goto L_0x0048
        L_0x00e9:
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r2.A00
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "TimeSpentReminderFullyBlockingFragment_shouldFinishActivityUponResume"
            X.C10450iM.A03(r0, r1)
            goto L_0x0025
        L_0x00f8:
            com.instagram.service.session.UserSession r0 = r10.A02
            boolean r0 = X.C63193gy.A05(r0, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0104
            goto L_0x0025
        L_0x0104:
            r1 = 1
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment.onResume():void");
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1922776769);
        if (this.A03 == AnonymousClass24O.DAILY_LIMIT) {
            C54602zi.A00(ScreenTimeScreenType.GUARDIAN_DAILY_LIMIT_BLOCKING_SCREEN, this.A02, C18190wL.A07());
        }
        this.A05.removeCallbacks(this.A06);
        if (this.A03.ordinal() == 1) {
            C25202Dhh.A01(requireActivity(), this, this.A02, true, false);
        }
        super.onStop();
        C14030oh.A09(701851311, A022);
    }
}
