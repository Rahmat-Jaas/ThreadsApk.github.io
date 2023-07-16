package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* renamed from: X.4Ke  reason: invalid class name and case insensitive filesystem */
public final class C71774Ke implements C83774ry {
    public DirectMessageInteropReachabilityOptions A00;
    public DirectMessagesInteropOptionsViewModel A01;
    public C29171xR A02;
    public C61353Sw A03;
    public final Context A04;
    public final C63083bT A05;
    public final AnonymousClass49K A06;
    public final AnonymousClass266 A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final DirectMessageInteropReachabilityOptions[] A0D;
    public final C60213Od A0E;

    public C71774Ke(Context context, Bundle bundle, C63083bT r7, C60213Od r8, AnonymousClass49K r9, AnonymousClass266 r10, boolean z, boolean z2) {
        C18190wL.A1S(r9, 2, r10);
        this.A04 = context;
        this.A06 = r9;
        this.A0E = r8;
        this.A05 = r7;
        this.A07 = r10;
        this.A0B = z;
        this.A0C = z2;
        this.A08 = C18210wN.A0b(bundle, "DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_DESCRIPTION", "");
        DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr = (DirectMessageInteropReachabilityOptions[]) bundle.getParcelableArray("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTIONS");
        if (directMessageInteropReachabilityOptionsArr != null) {
            this.A0D = directMessageInteropReachabilityOptionsArr;
            String A0b = C18210wN.A0b(bundle, "DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTION_NAME", "");
            this.A09 = A0b;
            this.A0A = bundle.getBoolean("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ADD_HEADER_AND_FOOTER");
            Parcelable parcelable = bundle.getParcelable("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_VIEW_MODEL");
            if (parcelable != null) {
                this.A01 = (DirectMessagesInteropOptionsViewModel) parcelable;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r7.A00, "ig_interop_reachability_setting_client_interaction"), 1250);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    A0I.A0O(C63083bT.A00(A0b), "setting_name");
                    A0I.A0O(C316628m.SETTING_VIEWED, "interaction_type");
                    A0I.A0V("extra_data_map", AnonymousClass4WK.A0O(C18180wK.A0p("account_type", r10.A01)));
                    C18210wN.A1B(A0I, r7.A01);
                    A0I.Bb4();
                    return;
                }
                return;
            }
            throw C18180wK.A0a("DirectMessagesInteropOptionsViewModel view model can't be null");
        }
        throw C18180wK.A0a("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTIONS can't be null, please add DirectMessageInteropReachabilityOptions");
    }

    public final void D9n(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, String str) {
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel3 = directMessagesInteropOptionsViewModel;
        this.A01 = directMessagesInteropOptionsViewModel;
        String str2 = this.A09;
        this.A00 = directMessagesInteropOptionsViewModel.A00(str2);
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel4 = directMessagesInteropOptionsViewModel2;
        if (directMessagesInteropOptionsViewModel2 != null) {
            this.A05.A04(directMessagesInteropOptionsViewModel4, directMessagesInteropOptionsViewModel3, this.A07, str2, this.A0B, this.A0C, true);
        }
        C61353Sw r0 = this.A03;
        if (r0 != null) {
            r0.A01 = true;
        }
        C29171xR r02 = this.A02;
        if (r02 != null) {
            r02.A00();
        }
    }

    public static final void A00(C71774Ke r2) {
        String str;
        C61353Sw r0;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = r2.A00;
        if (!(directMessageInteropReachabilityOptions == null || (str = directMessageInteropReachabilityOptions.A03) == null || r2.A02 == null || (r0 = r2.A03) == null)) {
            r0.A00 = str;
        }
        C61353Sw r02 = r2.A03;
        if (r02 != null) {
            r02.A01 = true;
        }
        C29171xR r03 = r2.A02;
        if (r03 != null) {
            r03.A00();
        }
    }

    public final void D9A(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, AnonymousClass1TE r21, String str) {
        C57543Bm r1;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel3 = directMessagesInteropOptionsViewModel;
        if (directMessagesInteropOptionsViewModel != null) {
            C63083bT r10 = this.A05;
            String str2 = this.A09;
            AnonymousClass266 r13 = this.A07;
            boolean z = this.A0B;
            DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel4 = directMessagesInteropOptionsViewModel2;
            boolean z2 = this.A0C;
            r10.A04(directMessagesInteropOptionsViewModel3, directMessagesInteropOptionsViewModel4, r13, str2, z, z2, false);
            AnonymousClass1TE r3 = r21;
            if (!(r21 == null || (r1 = r3.A01) == null || r1.A03 == null || r1.A02 == null || r1.A01 == null || r1.A00 == null || r3.A00 == null)) {
                C04220Ms.A0B(str2, 0);
                C63083bT.A03(r10, directMessagesInteropOptionsViewModel3, directMessagesInteropOptionsViewModel4, r13, str2, z, z2, false);
                C57543Bm r4 = r3.A01;
                if (r4 != null) {
                    Context context = this.A04;
                    Object A002 = AnonymousClass2NH.A00(r4.A03, "warning_title");
                    C04220Ms.A06(A002);
                    String str3 = (String) A002;
                    Object A003 = AnonymousClass2NH.A00(r4.A02, "warning_message");
                    C04220Ms.A06(A003);
                    String str4 = (String) A003;
                    Object A004 = AnonymousClass2NH.A00(r4.A01, "warning_confirm_button");
                    C04220Ms.A06(A004);
                    String str5 = (String) A004;
                    Object A005 = AnonymousClass2NH.A00(r4.A00, "warning_cancel_button");
                    C04220Ms.A06(A005);
                    String str6 = (String) A005;
                    AnonymousClass1U6 r42 = r3.A00;
                    if (r42 != null) {
                        C71764Kd r32 = new C71764Kd(directMessagesInteropOptionsViewModel3, this);
                        AnonymousClass0wJ.A1O(str3, str4);
                        AnonymousClass0wJ.A1R(str5, str6);
                        C25828Dsm A0W = C18190wL.A0W(context);
                        A0W.A02 = str3;
                        A0W.A0p(str4);
                        A0W.A0c(new IDxCListenerShape77S0200000_1_I2(56, (Object) r32, (Object) r42), str5);
                        A0W.A0b(C18220wO.A0O(r32, 155), str6);
                        C18240wQ.A1C(A0W, r32, 12);
                        AnonymousClass0wJ.A1K(A0W);
                        return;
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            }
        }
        C60213Od.A00(this.A04);
        A00(this);
    }
}
