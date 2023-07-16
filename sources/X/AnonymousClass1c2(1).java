package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.redex.IDxCListenerShape14S1100000_1_I2;
import com.facebook.redex.IDxCListenerShape73S0300000_1_I2;
import com.facebook.redex.IDxTListenerShape66S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReportSevereSwitchView;
import com.instagram.common.task.IDxLTaskShape11S0400000_1_I2;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1c2  reason: invalid class name */
public final class AnonymousClass1c2 extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "BugReportComposerFragment";
    public long A00 = 0;
    public View A01;
    public View A02;
    public EditText A03;
    public GridLayout A04;
    public TextView A05;
    public UserFlowLogger A06;
    public BugReport A07;
    public BugReportComposerViewModel A08;
    public BugReportSevereSwitchView A09;
    public C58533Ga A0A;
    public UserSession A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public C61593Uj A0F;
    public C30814GWv A0G;
    public boolean A0H;

    public final String getModuleName() {
        return "bugreporter_composer";
    }

    public static BugReport A00(BugReport bugReport, AnonymousClass1c2 r3, ArrayList arrayList) {
        AnonymousClass3IL r1;
        IgSwitch igSwitch;
        if (arrayList == null) {
            arrayList = AnonymousClass0wJ.A0v();
        }
        BugReportSevereSwitchView bugReportSevereSwitchView = r3.A09;
        if (bugReportSevereSwitchView == null || (igSwitch = bugReportSevereSwitchView.A00) == null || !igSwitch.isChecked()) {
            r1 = new AnonymousClass3IL();
            r1.A01(bugReport);
            r1.A0A = arrayList;
        } else {
            r1 = new AnonymousClass3IL();
            r1.A01(bugReport);
            r1.A0A = arrayList;
            r1.A03 = "701258024912781";
        }
        return r1.A00();
    }

    public static void A02(AnonymousClass1c2 r6, int i) {
        Bitmap A0B2;
        int i2;
        String str = (String) r6.A07.A0B.get(i);
        if (str.endsWith(MimeTypeMap.getSingleton().getExtensionFromMimeType("video/mp4"))) {
            A0B2 = ThumbnailUtils.createVideoThumbnail(str, 1);
            i2 = 2;
        } else {
            Resources A0B3 = AnonymousClass0wJ.A0B(r6);
            boolean z = r6.A0E;
            int i3 = R.dimen.avatar_sticker_grid_height_offset;
            if (z) {
                i3 = R.dimen.account_group_management_clickable_width;
            }
            A0B2 = C31176Gi6.A0B(str, A0B3.getDimensionPixelSize(i3), Integer.MAX_VALUE);
            i2 = 3;
        }
        IDxCListenerShape14S1100000_1_I2 iDxCListenerShape14S1100000_1_I2 = new IDxCListenerShape14S1100000_1_I2(str, (Object) r6, i2);
        if (A0B2 == null) {
            C18250wR.A1G("Error: thumbnail is null from file: ", str, __redex_internal_original_name);
            return;
        }
        LayoutInflater A0F2 = C18230wP.A0F(r6);
        boolean z2 = r6.A0E;
        int i4 = R.layout.bugreporter_screen_capture;
        if (z2) {
            i4 = R.layout.bugreporter_screen_capture_gdpr;
        }
        View A0H2 = AnonymousClass0wJ.A0H(A0F2, r6.A04, i4);
        ImageView A0J = C18200wM.A0J(A0H2, R.id.bugreporter_screenshot);
        A0J.setImageBitmap(A0B2);
        A0J.setOnClickListener(iDxCListenerShape14S1100000_1_I2);
        View requireViewById = A0H2.requireViewById(R.id.bugreporter_screenshot_remove);
        requireViewById.setTag(Integer.valueOf(r6.A04.getChildCount()));
        AnonymousClass0wJ.A16(requireViewById, 93, r6);
        Integer num = AnonymousClass006.A01;
        AnonymousClass7FY.A02(A0J, num);
        AnonymousClass7FY.A02(requireViewById, num);
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        Resources A0B4 = AnonymousClass0wJ.A0B(r6);
        boolean z3 = r6.A0E;
        int i5 = R.dimen.avatar_sticker_grid_height_offset;
        if (z3) {
            i5 = R.dimen.account_group_management_clickable_width;
        }
        layoutParams.width = A0B4.getDimensionPixelSize(i5);
        A0H2.setLayoutParams(layoutParams);
        GridLayout gridLayout = r6.A04;
        gridLayout.addView(A0H2, gridLayout.getChildCount());
    }

    public final C10300i6 getSession() {
        return this.A0B;
    }

    public final boolean onBackPressed() {
        Fragment A002;
        if (!this.A0E) {
            C34392Jj.A00(this.A07);
            this.A0A.A00(AnonymousClass006.A0Y);
            C61593Uj r6 = this.A0F;
            long j = r6.A00;
            if (j == 0) {
                return false;
            }
            r6.A01.flowEndCancel(j, "CANCEL_BUG_REPORT_COMPOSER");
            r6.A00 = 0;
            return false;
        }
        boolean z = this.A0H;
        String A0j = C18190wL.A0j(requireArguments(), "IgSessionManager.SESSION_TOKEN_KEY");
        BugReport bugReport = this.A07;
        BugReportComposerViewModel bugReportComposerViewModel = this.A08;
        if (z) {
            AnonymousClass0wJ.A1M(bugReport, 1, bugReportComposerViewModel);
            A002 = new C22931bd();
            Bundle A062 = C18180wK.A06();
            A062.putString("IgSessionManager.SESSION_TOKEN_KEY", A0j);
            A062.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", bugReport);
            A062.putParcelable("BugReportComposerFragment.ARGUMENT_VIEWMODEL", bugReportComposerViewModel);
            A002.setArguments(A062);
        } else {
            A002 = C34402Jk.A00(bugReport, bugReportComposerViewModel, A0j);
        }
        AnonymousClass0wJ.A19(A002, requireActivity(), this.A0B);
        return true;
    }

    public static AnonymousClass1c2 A01(Parcelable parcelable, Parcelable parcelable2, Boolean bool, String str) {
        Bundle A062 = C18180wK.A06();
        C18190wL.A13(A062, str);
        A062.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", parcelable);
        A062.putParcelable("BugReportComposerFragment.ARGUMENT_VIEWMODEL", parcelable2);
        A062.putBoolean("BugReportComposerFragment.ARGUMENT_IS_FROM_QUICK_OPTIONS", bool.booleanValue());
        AnonymousClass1c2 r0 = new AnonymousClass1c2();
        r0.setArguments(A062);
        return r0;
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        r4.Cjt(this.A0B, R.layout.bugreporter_actionbar_header, 0, 0);
        C25764Drc A0K = C18240wQ.A0K();
        int i = 2131836310;
        if (this.A0E) {
            i = 2131835477;
        }
        A0K.A0F = getString(i);
        AnonymousClass4u2.A01(C18190wL.A0H(this, 89), A0K, r4);
        r4.CtU(C18190wL.A0H(this, 90), true);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            Uri data = intent.getData();
            Context requireContext = requireContext();
            C18330wh r5 = new C18330wh(requireContext);
            C18330wh.A02(requireContext, r5, 2131822721);
            C13950oZ.A00(r5);
            C31155GhB.A03(new IDxLTaskShape11S0400000_1_I2(0, requireContext, data, this, r5));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (X.C63803iN.A05(X.AnonymousClass0TJ.A05, r7.A0B, 36326107540104620L).booleanValue() != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = -1726677440(0xffffffff9914fe40, float:-7.702766E-24)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r8)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0W(r7)
            r7.A0B = r0
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "BugReportComposerFragment.ARGUMENT_VIEWMODEL"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.bugreporter.BugReportComposerViewModel r0 = (com.instagram.bugreporter.BugReportComposerViewModel) r0
            r7.A08 = r0
            boolean r0 = X.C34442Jo.A00()
            r4 = 0
            if (r0 == 0) goto L_0x0039
            com.instagram.service.session.UserSession r5 = r7.A0B
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326107540104620(0x810e67000025ac, double:3.0361149096319427E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r5, r0)
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            r7.A0E = r0
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "BugReportComposerFragment.ARGUMENT_IS_FROM_QUICK_OPTIONS"
            boolean r0 = r1.getBoolean(r0)
            r7.A0H = r0
            X.3Da r1 = X.C61593Uj.A04
            com.instagram.service.session.UserSession r0 = r7.A0B
            X.3Uj r0 = r1.A00(r0)
            r7.A0F = r0
            com.instagram.service.session.UserSession r0 = r7.A0B
            X.5dy r0 = X.AnonymousClass6JQ.A00(r0)
            r7.A06 = r0
            java.lang.String r0 = "BugReportComposerFragment.ARGUMENT_BUGREPORT"
            if (r8 != 0) goto L_0x0062
            android.os.Bundle r8 = r7.requireArguments()
        L_0x0062:
            android.os.Parcelable r0 = r8.getParcelable(r0)
            com.instagram.bugreporter.BugReport r0 = (com.instagram.bugreporter.BugReport) r0
            r7.A07 = r0
            java.lang.Class<X.AyF> r1 = X.C19554AyF.class
            monitor-enter(r1)
            X.AyF r0 = X.C19554AyF.A01     // Catch:{ all -> 0x011e }
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            monitor-exit(r1)
            if (r0 == 0) goto L_0x00af
            X.C19554AyF.A02()
            com.instagram.service.session.UserSession r0 = r7.A0B
            com.instagram.reels.store.ReelStore r1 = com.instagram.reels.store.ReelStore.A02(r0)
            monitor-enter(r1)
            X.DcO r0 = r1.A02     // Catch:{ all -> 0x011e }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x011e }
            int r0 = r0.size()     // Catch:{ all -> 0x011e }
            boolean r0 = X.C18230wP.A1V(r0)
            monitor-exit(r1)
            if (r0 == 0) goto L_0x00af
            java.lang.String r2 = "bugreporter_composer"
            com.instagram.service.session.UserSession r1 = r7.A0B
            java.lang.String r0 = "reel_tray_empty_on_bug_report_filed"
            X.AnonymousClass0wJ.A1M(r2, r4, r1)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.AnonymousClass3XN.A00(r1, r2, r0)
            java.lang.String r0 = r1.getUserId()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "user_id"
            r2.A0S(r0, r1)
            r2.Bb4()
            X.AnonymousClass3XN.A01(r2)
        L_0x00af:
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = X.AnonymousClass3XN.A01
            long r5 = r5 - r0
            r1 = 180000(0x2bf20, double:8.8932E-319)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x011b
            java.lang.String r5 = X.AnonymousClass3XN.A00
        L_0x00bf:
            X.3IL r2 = new X.3IL
            r2.<init>()
            com.instagram.bugreporter.BugReport r0 = r7.A07
            r2.A01(r0)
            com.instagram.bugreporter.BugReport r0 = r7.A07
            java.lang.String r0 = r0.A05
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x00d2
            r0 = r1
        L_0x00d2:
            X.C04220Ms.A0B(r0, r4)
            r2.A05 = r0
            com.instagram.bugreporter.BugReport r0 = r7.A07
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x00de
            r1 = r0
        L_0x00de:
            r2.A02 = r1
            X.C04220Ms.A0B(r5, r4)
            r2.A06 = r5
            com.instagram.bugreporter.BugReport r0 = r2.A00()
            r7.A07 = r0
            java.util.ArrayList r2 = r0.A0A
            com.instagram.bugreporter.BugReportComposerViewModel r0 = r7.A08
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0109
            X.GWv r0 = r7.A0G
            if (r0 == 0) goto L_0x00fd
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x0109
        L_0x00fd:
            X.FPY r1 = new X.FPY
            r1.<init>(r7, r2)
            java.lang.Void[] r0 = new java.lang.Void[r4]
            r1.A02(r0)
            r7.A0G = r1
        L_0x0109:
            com.instagram.service.session.UserSession r2 = r7.A0B
            java.lang.String r1 = "bugreporter_composer"
            X.3Ga r0 = new X.3Ga
            r0.<init>(r2, r1)
            r7.A0A = r0
            r0 = -2092774652(0xffffffff8342cb04, float:-5.7244527E-37)
            X.C14030oh.A09(r0, r3)
            return
        L_0x011b:
            java.lang.String r5 = ""
            goto L_0x00bf
        L_0x011e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1c2.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19577Ayd A0T;
        int A022 = C14030oh.A02(1688910477);
        boolean z = this.A0E;
        int i = R.layout.feedback_composer;
        if (z) {
            i = R.layout.feedback_public_composer;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        EditText editText = (EditText) inflate.requireViewById(R.id.description_field);
        this.A03 = editText;
        editText.setText(this.A07.A05);
        this.A03.setHint(this.A08.A01);
        C18230wP.A17(this.A03, this, 3);
        GridLayout gridLayout = (GridLayout) inflate.requireViewById(R.id.screenshot_section);
        this.A04 = gridLayout;
        if (!this.A0E) {
            gridLayout.setColumnCount(3);
        }
        for (int i2 = 0; i2 < this.A07.A0B.size(); i2++) {
            A02(this, i2);
        }
        C19577Ayd A0T2 = C18190wL.A0T(inflate, R.id.feedback_composer_buttons_default_stub);
        if (this.A0E) {
            A0T = null;
        } else {
            A0T = C18190wL.A0T(inflate, R.id.feedback_composer_buttons_with_record_video_stub);
        }
        A0T2.A09(0);
        if (A0T != null) {
            A0T.A09(8);
        }
        View requireViewById = inflate.requireViewById(R.id.camera_button);
        this.A01 = requireViewById;
        if (requireViewById instanceof IgdsMediaButton) {
            ((IgdsMediaButton) requireViewById).setStartAddOn(new AnonymousClass3SM((int) R.drawable.instagram_camera_pano_outline_24), requireContext().getString(2131822731));
            ((IgdsMediaButton) this.A01).setLabel(requireContext().getString(2131822731));
            if (C30975Gcb.A03()) {
                ((IgdsMediaButton) this.A01).setButtonStyle(AnonymousClass25V.DEFAULT_ON_BLACK);
            }
            this.A01.setBackground((Drawable) null);
        }
        AnonymousClass0wJ.A16(this.A01, 91, this);
        View requireViewById2 = inflate.requireViewById(R.id.gallery_button);
        this.A02 = requireViewById2;
        if (requireViewById2 instanceof IgdsMediaButton) {
            ((IgdsMediaButton) requireViewById2).setStartAddOn(new AnonymousClass3SM((int) R.drawable.instagram_photo_selector), requireContext().getString(2131834028));
            ((IgdsMediaButton) this.A02).setLabel(requireContext().getString(2131834028));
            if (C30975Gcb.A03()) {
                ((IgdsMediaButton) this.A02).setButtonStyle(AnonymousClass25V.DEFAULT_ON_BLACK);
            }
            this.A02.setBackground((Drawable) null);
        }
        AnonymousClass0wJ.A16(this.A02, 92, this);
        if (!this.A0E) {
            TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.disclaimer);
            this.A05 = A0L;
            BugReportComposerViewModel bugReportComposerViewModel = this.A08;
            if (bugReportComposerViewModel.A06) {
                String string = requireContext().getString(2131833994);
                SpannableStringBuilder A0E2 = C18200wM.A0E(AnonymousClass0wJ.A0l(requireContext(), string, 2131833993));
                C18720xk.A00(A0E2, this, string, C18210wN.A01(inflate.getContext()), 2);
                C18180wK.A0z(this.A05);
                this.A05.setText(A0E2);
            } else if (A0L != null) {
                A0L.setText(bugReportComposerViewModel.A02);
            }
        }
        GridLayout gridLayout2 = (GridLayout) inflate.findViewById(R.id.screenshot_section);
        this.A04 = gridLayout2;
        if (this.A08.A05) {
            gridLayout2.setVisibility(8);
            TextView textView = this.A05;
            if (textView != null) {
                textView.setPadding(0, 20, 0, 0);
            }
            String string2 = getString(2131822717);
            String string3 = getString(2131822716);
            String A0k = C18220wO.A0k(this, string2, string3, 2131822719);
            Uri A012 = C15430rJ.A01("https://help.instagram.com/581066165581870");
            C18670xb r9 = new C18670xb(A012);
            C18670xb r8 = new C18670xb(A012);
            SpannableStringBuilder A0E3 = C18200wM.A0E(A0k);
            AnonymousClass3Zw.A01(A0E3, r9, string2);
            AnonymousClass3Zw.A01(A0E3, r8, string3);
            int A002 = C121907Is.A00(getContext(), R.attr.textColorRegularLink);
            A0E3.setSpan(new ForegroundColorSpan(A002), A0E3.getSpanStart(r9), A0E3.getSpanEnd(r9), 0);
            A0E3.setSpan(new ForegroundColorSpan(A002), A0E3.getSpanStart(r8), A0E3.getSpanEnd(r8), 0);
            TextView A0L2 = AnonymousClass0wJ.A0L(inflate, R.id.legal_info_footer);
            A0L2.setText(A0E3);
            C18180wK.A0z(A0L2);
            A0L2.setVisibility(0);
        }
        this.A09 = (BugReportSevereSwitchView) inflate.requireViewById(R.id.bugreport_severe_switch_view);
        C14030oh.A09(1113393155, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(891033987);
        super.onDestroyView();
        C30814GWv gWv = this.A0G;
        if (gWv != null) {
            gWv.A01.cancel(true);
        }
        this.A03 = null;
        this.A04 = null;
        this.A02 = null;
        this.A01 = null;
        this.A09 = null;
        C14030oh.A09(-137866853, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(446996840);
        super.onPause();
        C09860go.A0I(this.A03);
        C14030oh.A09(1723454799, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1915624522);
        super.onResume();
        C18190wL.A0M(this).A0S(this);
        BugReportSevereSwitchView bugReportSevereSwitchView = this.A09;
        if (bugReportSevereSwitchView != null && bugReportSevereSwitchView.getVisibility() == 8) {
            this.A03.requestFocus();
            C09860go.A0K(this.A03);
        }
        C14030oh.A09(773710555, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", this.A07);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C19573AyZ.A03(this.A0B) && this.A09 != null) {
            if (C63803iN.A05(AnonymousClass0TJ.A05, this.A0B, 36323397415739179L).booleanValue()) {
                BugReportSevereSwitchView bugReportSevereSwitchView = this.A09;
                UserSession userSession = this.A0B;
                C04220Ms.A0B(userSession, 0);
                Context context = bugReportSevereSwitchView.getContext();
                View inflate = RelativeLayout.inflate(context, R.layout.bugreporter_severe_switch_layout, bugReportSevereSwitchView);
                bugReportSevereSwitchView.A00 = C18250wR.A0N(inflate, R.id.severe_sev_ig_switch);
                View A0K = AnonymousClass0wJ.A0K(inflate, R.id.severe_sev_info_icon);
                ((TextView) AnonymousClass0wJ.A0J(inflate, R.id.severe_sev_title_text_view)).setText(2131835602);
                ((TextView) AnonymousClass0wJ.A0J(inflate, R.id.severe_sev_subtitle_text_view)).setText(2131835601);
                IgSwitch igSwitch = bugReportSevereSwitchView.A00;
                if (igSwitch != null) {
                    igSwitch.setChecked(false);
                }
                C04220Ms.A06(context);
                long A062 = C18230wP.A06();
                long j = AnonymousClass0Jc.A00(context).A00;
                new AnonymousClass3EX(userSession).A00(C319229m.FALLBACK_ELIGIBILITY_CHECK);
                boolean A1Y = C18240wQ.A1Y(C61433Tk.A00(j, A062), AnonymousClass006.A00);
                IgSwitch igSwitch2 = bugReportSevereSwitchView.A00;
                if (igSwitch2 != null) {
                    igSwitch2.setEnabled(!A1Y);
                }
                AnonymousClass3EX r3 = new AnonymousClass3EX(userSession);
                IgSwitch igSwitch3 = bugReportSevereSwitchView.A00;
                if (igSwitch3 != null) {
                    igSwitch3.setOnCheckedChangeListener(new IDxCListenerShape73S0300000_1_I2(2, r3, userSession, bugReportSevereSwitchView));
                }
                A0K.setOnTouchListener(new IDxTListenerShape66S0300000_1_I2(0, userSession, r3, bugReportSevereSwitchView));
                this.A09.setVisibility(0);
            }
        }
    }
}
