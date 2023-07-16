package com.instagram.creation.fragment;

import X.AnonymousClass0TJ;
import X.AnonymousClass0hW;
import X.AnonymousClass0wJ;
import X.AnonymousClass2AC;
import X.AnonymousClass2AI;
import X.AnonymousClass2C5;
import X.AnonymousClass31Q;
import X.AnonymousClass3CX;
import X.AnonymousClass3FS;
import X.AnonymousClass3TR;
import X.AnonymousClass3z6;
import X.AnonymousClass4LQ;
import X.AnonymousClass4NP;
import X.AnonymousClass4u2;
import X.BKU;
import X.C04220Ms;
import X.C09860go;
import X.C10300i6;
import X.C11630kW;
import X.C13330nS;
import X.C14030oh;
import X.C15730rn;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C19000yP;
import X.C21219Bqn;
import X.C24741jy;
import X.C24945Dcf;
import X.C26141q7;
import X.C28174Ezk;
import X.C28991Ffc;
import X.C32165H8c;
import X.C34640IcN;
import X.C34714Idl;
import X.C35762Os;
import X.C36952Th;
import X.C60423Oz;
import X.C62943bB;
import X.C63073bQ;
import X.C63353hL;
import X.C63673i6;
import X.C63733iD;
import X.C63803iN;
import X.C63873iU;
import X.C67253zE;
import X.C67373zR;
import X.C82034oy;
import X.C83004qd;
import X.C83104qn;
import X.C83804s1;
import X.C84414t6;
import X.DJO;
import X.KYA;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxAListenerShape459S0100000_1_I2;
import com.facebook.redex.IDxAListenerShape831S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape663S0100000_1_I2;
import com.facebook.redex.IDxLDelegateShape778S0100000_1_I2;
import com.facebook.redex.IDxListenerShape830S0100000_1_I2;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ShareLaterFragment extends C34640IcN implements C11630kW, C82034oy, C83104qn {
    public Handler A00 = C18250wR.A08();
    public AnonymousClass0hW A01;
    public AnonymousClass3FS A02;
    public ShareLaterMedia A03;
    public UserSession A04;
    public C83804s1 A05 = new IDxListenerShape830S0100000_1_I2(this, 1);
    public IgAutoCompleteTextView A06;
    public KYA A07;
    public String A08;
    public List A09;
    public AtomicBoolean A0A;
    public boolean A0B;
    public int A0C;
    public View A0D;
    public C26141q7 A0E;
    public AnonymousClass3TR A0F;
    public C24741jy A0G;
    public boolean A0H;
    public final TextWatcher A0I = new IDxObjectShape282S0100000_1_I2(this, 5);
    public final C63873iU A0J = C63873iU.A06(this, 48);
    public C19000yP mAppShareTable;
    public C19000yP mIgShareTable;

    public static void A01(ShareLaterFragment shareLaterFragment) {
        ShareLaterFragment shareLaterFragment2 = shareLaterFragment;
        C18230wP.A0R(shareLaterFragment).setIsLoading(true);
        shareLaterFragment.A03.A04 = AnonymousClass0wJ.A0n(shareLaterFragment.A06);
        String str = shareLaterFragment.A08;
        if (str == null || !shareLaterFragment.A0B) {
            str = C18180wK.A0e();
            shareLaterFragment.A08 = str;
        }
        C32165H8c A002 = C36952Th.A00(shareLaterFragment.A03, shareLaterFragment.A04, str, "feed_share_later");
        A002.A00 = shareLaterFragment.A0J;
        shareLaterFragment.schedule(A002);
        String str2 = shareLaterFragment.A08;
        UserSession userSession = shareLaterFragment.A04;
        String str3 = shareLaterFragment.A03.A05;
        int indexOf = str3.indexOf(95);
        if (indexOf != -1) {
            str3 = str3.substring(0, indexOf);
        }
        C62943bB.A01(shareLaterFragment2, userSession, str2, str3, "share_later", shareLaterFragment.A03.A02.A00);
        C15730rn A003 = C15730rn.A00(shareLaterFragment2, "share_later_fragment_share_tapped");
        A003.A09("facebook_enabled", Boolean.valueOf(shareLaterFragment2.A03.A07));
        C18180wK.A1K(A003, shareLaterFragment2.A04);
        C63673i6.A00(shareLaterFragment2, shareLaterFragment2.A04, shareLaterFragment2.A03.A05, "share_later_view");
        if (shareLaterFragment2.A03.A07) {
            C63353hL.A06(shareLaterFragment2.A04, "feed_share_later", (String) null, shareLaterFragment2.A08);
            C63353hL.A04(ShareType.FOLLOWERS_SHARE, shareLaterFragment2.A04, "feed_share_later", (String) null, shareLaterFragment2.A08);
        }
    }

    public final void Bkx(AnonymousClass2AI r15, boolean z) {
        AnonymousClass2AI r8 = r15;
        if (r15.A07(this.A03, this.A04)) {
            boolean A062 = r15.A06(this.A03);
            FragmentActivity requireActivity = requireActivity();
            UserSession userSession = this.A04;
            AnonymousClass2AC r5 = AnonymousClass2AC.A0C;
            AnonymousClass0wJ.A1O(userSession, r5);
            AnonymousClass31Q.A00.A00(new AnonymousClass3CX(requireActivity, (Context) null, r5, userSession, (C83004qd) null), new AnonymousClass4LQ(this, r15, A062));
            r8.A02(this, this.A0E, this.A03, this.A04, this.A0G);
            C19000yP r1 = this.mAppShareTable;
            if (r1 != null) {
                r1.A05(this.A03);
            }
            A00();
        }
    }

    public final String getModuleName() {
        return "share_later";
    }

    private void A00() {
        boolean z;
        if (this.A0D != null) {
            List list = this.A09;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AnonymousClass2AI) it.next()).A06(this.A03)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.A0D.setEnabled(z);
            }
            z = false;
            this.A0D.setEnabled(z);
        }
    }

    public static void A02(ShareLaterFragment shareLaterFragment) {
        AnonymousClass2AI.A04.A05(shareLaterFragment.A03, true);
        UserSession userSession = shareLaterFragment.A04;
        C04220Ms.A0B(userSession, 0);
        if (C63073bQ.A03(userSession)) {
            C63073bQ.A00(shareLaterFragment.A04).A0C("share_later_relink");
        }
        C19000yP r1 = shareLaterFragment.mAppShareTable;
        if (r1 != null) {
            r1.A05(shareLaterFragment.A03);
        }
        shareLaterFragment.A00();
        FragmentActivity requireActivity = shareLaterFragment.requireActivity();
        UserSession userSession2 = shareLaterFragment.A04;
        C60423Oz.A00(requireActivity, shareLaterFragment.getContext(), AnonymousClass2AC.A0C, userSession2, new IDxCListenerShape663S0100000_1_I2(shareLaterFragment, 2));
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        C18250wR.A0M(view2, R.id.metadata_imageview).setUrl(this.A03.A00, this);
        IgAutoCompleteTextView igAutoCompleteTextView = (IgAutoCompleteTextView) view2.requireViewById(R.id.caption_text_view);
        this.A06 = igAutoCompleteTextView;
        igAutoCompleteTextView.setText(this.A03.A04);
        int dimensionPixelSize = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.audience_controls_footer_button_radius);
        IgAutoCompleteTextView igAutoCompleteTextView2 = this.A06;
        igAutoCompleteTextView2.A00 = 2.5f;
        igAutoCompleteTextView2.A01 = dimensionPixelSize;
        Context requireContext = requireContext();
        this.A06.setAdapter(C34714Idl.A00(requireContext, (DJO) null, (C21219Bqn) null, this, C18240wQ.A0O(requireContext, this), (BKU) null, this.A04, (C84414t6) null, C28174Ezk.A00(753), (List) null, false, false));
        this.A06.A06 = true;
        if (this.A03.A02 == C28991Ffc.VIDEO) {
            C18190wL.A18(view2, R.id.caption_video_overlay, 0);
        }
        ViewGroup A0J2 = C18220wO.A0J(view2, R.id.share_later_content);
        UserSession userSession = this.A04;
        C04220Ms.A0B(userSession, 0);
        ImmutableList.Builder builder = ImmutableList.builder();
        if (!C67253zE.A02(userSession)) {
            builder.add((Object) AnonymousClass2AI.A04);
        }
        this.A09 = C18250wR.A0F(builder);
        Context requireContext2 = requireContext();
        List list = this.A09;
        C19000yP r11 = new C19000yP(requireContext2, view2, this, this.A03, this.A04, new IDxLDelegateShape778S0100000_1_I2(this, 1), "share_later", list, (List) null);
        this.mAppShareTable = r11;
        r11.A04 = this;
        int dimensionPixelSize2 = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.abc_floating_window_z);
        this.mAppShareTable.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, dimensionPixelSize2);
        this.mAppShareTable.A05(this.A03);
        A0J2.addView(this.mAppShareTable);
        getRootActivity();
        C24945Dcf dcf = C24945Dcf.A02;
        this.A07 = dcf.A00((ViewStub) view2.requireViewById(R.id.warning_nudge), this, this.A04, dcf.A01(), new AnonymousClass4NP(this));
        if (C24945Dcf.A02.A01().Csh(this.A04)) {
            this.A06.addTextChangedListener(this.A0I);
            String A0n = AnonymousClass0wJ.A0n(this.A06);
            if (!TextUtils.isEmpty(A0n)) {
                this.A07.A07(Collections.singletonList(A0n));
            }
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        this.A0D = AnonymousClass4u2.A00(C18190wL.A0H(this, HttpStatus.SC_MOVED_TEMPORARILY), r3, AnonymousClass0wJ.A0B(this).getString(2131835611));
        A00();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass3z6.A00(this.A03, this.A04, i, i2);
        C19000yP r1 = this.mAppShareTable;
        if (r1 != null) {
            r1.A05(this.A03);
        }
        A00();
    }

    public final void onCreate(Bundle bundle) {
        List list;
        int A022 = C14030oh.A02(-707099283);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = C18180wK.A0V(requireArguments);
        this.A03 = (ShareLaterMedia) C18240wQ.A0D(requireArguments, "ShareLaterMedia.SHARE_LATER_MEDIA");
        this.A0G = new C24741jy(this, this, this.A04, new IDxAListenerShape831S0100000_1_I2(this, 1));
        this.A0E = C35762Os.A00().A00(this, this.A04, new IDxAListenerShape459S0100000_1_I2(this, 3));
        ShareLaterMedia shareLaterMedia = this.A03;
        if (shareLaterMedia == null || (list = shareLaterMedia.A06) == null || ImmutableList.copyOf((Collection) list) == null || !C18210wN.A0J(this.A03.A06).contains("FB")) {
            C67373zR.A0J(this.A04, false);
        }
        C63733iD A023 = C63733iD.A02();
        A023.A0E = "no_app_account_when_share_to_ig_account";
        C63733iD.A08(this, A023, 2131831744);
        A023.A0C();
        this.A0F = A023.A0B();
        C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, this.A04), "share_later_fragment_created"), 2694).Bb4();
        C63673i6.A01(this, this.A04, this.A03.A05, "share_later_view");
        if (!C63803iN.A05(AnonymousClass0TJ.A06, this.A04, 2342158289141238267L).booleanValue()) {
            AnonymousClass3FS r1 = this.A02;
            if (r1 == null) {
                r1 = new AnonymousClass3FS(this.A04);
                this.A02 = r1;
            }
            r1.A00();
        }
        C14030oh.A09(-201413691, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1093815926);
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.share_later);
        C14030oh.A09(1127471542, A022);
        return A0H2;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(2057362160);
        super.onDestroy();
        this.A05 = null;
        C14030oh.A09(1698922519, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-791657412);
        super.onDestroyView();
        this.A06 = null;
        this.A0D = null;
        KYA kya = this.A07;
        if (kya != null) {
            kya.A05();
            this.A07 = null;
        }
        getRootActivity();
        C14030oh.A09(-1011879891, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-534038520);
        super.onPause();
        C09860go.A0I(this.A06);
        AnonymousClass2C5.A00(requireActivity(), this.A0C);
        Window A0F2 = C18180wK.A0F(this);
        A0F2.getClass();
        A0F2.setSoftInputMode(48);
        C14030oh.A09(-1299283131, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fd, code lost:
        if (r5.A00 == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r12 = this;
            r0 = 345812117(0x149cac95, float:1.5820046E-26)
            int r3 = X.C14030oh.A02(r0)
            super.onResume()
            X.0yP r1 = r12.mAppShareTable
            if (r1 == 0) goto L_0x004b
            com.instagram.model.sharelater.ShareLaterMedia r0 = r12.A03
            r1.A05(r0)
            X.0yP r1 = r12.mAppShareTable
            if (r1 == 0) goto L_0x004b
            r0 = 1
            r1.setEnabled(r0)
            X.0yP r4 = r12.mAppShareTable
            r2 = 1065353216(0x3f800000, float:1.0)
            java.util.List r0 = r4.A0T
            java.util.Iterator r1 = r0.iterator()
        L_0x0025:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r0.setAlpha(r2)
            goto L_0x0025
        L_0x0035:
            java.util.List r0 = r4.A0U
            java.util.Iterator r1 = r0.iterator()
        L_0x003b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r0.setAlpha(r2)
            goto L_0x003b
        L_0x004b:
            r12.A00()
            com.instagram.service.session.UserSession r0 = r12.A04
            boolean r1 = X.C696249i.A00(r0)
            com.instagram.service.session.UserSession r0 = r12.A04
            X.49i r0 = X.C63073bQ.A00(r0)
            if (r1 == 0) goto L_0x00e2
            r0.A06()
        L_0x005f:
            com.instagram.service.session.UserSession r0 = r12.A04
            X.49i r0 = X.C63073bQ.A00(r0)
            r0.A07()
        L_0x0068:
            androidx.fragment.app.FragmentActivity r0 = r12.requireActivity()
            int r0 = r0.getRequestedOrientation()
            r12.A0C = r0
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            r0 = -1
            X.AnonymousClass2C5.A00(r1, r0)
            android.view.Window r1 = X.C18180wK.A0F(r12)
            r1.getClass()
            r0 = 16
            r1.setSoftInputMode(r0)
            com.instagram.service.session.UserSession r0 = r12.A04
            X.16t r7 = X.C63073bQ.A01(r0)
            com.instagram.service.session.UserSession r0 = r12.A04
            X.49i r0 = X.C63073bQ.A00(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5200000_I2 r2 = r0.A03()
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x00db
            if (r7 == 0) goto L_0x00db
            boolean r0 = X.C63073bQ.A02(r7)
            if (r0 == 0) goto L_0x00db
            com.instagram.service.session.UserSession r1 = r12.A04
            X.3bQ r0 = X.C696249i.A07
            boolean r0 = r0.A04(r2, r7, r1)
            if (r0 == 0) goto L_0x00db
            X.0yP r6 = r12.mAppShareTable
            r11 = 0
            android.content.Context r5 = r12.requireContext()
            com.instagram.service.session.UserSession r4 = r12.A04
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36325317266121774(0x810daf0000242e, double:3.035615137183013E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r4, r0)
            boolean r1 = r0.booleanValue()
            com.instagram.service.session.UserSession r0 = r12.A04
            int r0 = X.C18200wM.A06(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = X.C63143c0.A05(r5, r0)
            r8 = 0
            java.lang.String r10 = "share_later"
            r6.A04(r7, r8, r9, r10, r11)
            r0 = 1
            r12.A0H = r0
        L_0x00db:
            r0 = 114832037(0x6d832a5, float:8.1324585E-35)
            X.C14030oh.A09(r0, r3)
            return
        L_0x00e2:
            X.16t r5 = r0.A04()
            com.instagram.service.session.UserSession r4 = r12.A04
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36320128945624801(0x8108f7000016e1, double:3.0323340224090375E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r4, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0068
            if (r5 == 0) goto L_0x0068
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0068
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.ShareLaterFragment.onResume():void");
    }
}
