package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxCListenerShape512S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import java.util.ArrayList;

/* renamed from: X.1xR  reason: invalid class name and case insensitive filesystem */
public final class C29171xR extends C23411dm implements C82034oy, CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(C29171xR.class);
    public static final String __redex_internal_original_name = "DirectMessagesOptionChooserFragment";
    public C71774Ke A00;
    public String A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, this.A01);
    }

    public final String getModuleName() {
        return "direct_messages_options_chooser";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C71774Ke r2 = this.A00;
        if (r2 != null) {
            AnonymousClass49K r1 = r2.A06;
            synchronized (r1) {
                r1.A09.add(r2);
            }
            r2.A02 = this;
            return;
        }
        C04220Ms.A0E("controller");
        throw null;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void A00() {
        C41030Luu luu = (C41030Luu) getScrollingViewProxy().APJ();
        if (luu != null) {
            luu.notifyDataSetChanged();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(565947376);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_TITLE", "");
        C04530Oa r4 = this.A02;
        boolean A05 = C35692Ol.A00(AnonymousClass0wJ.A0X(r4)).A05(A03, "ig_direct_to_fb");
        Context requireContext = requireContext();
        AnonymousClass49K A002 = C49152qv.A00(AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(r4)), AnonymousClass0wJ.A0X(r4), new C49162qw());
        C60213Od r8 = new C60213Od();
        UserSession A0X = AnonymousClass0wJ.A0X(r4);
        String string = requireArguments.getString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ENTRY_POINT");
        C04220Ms.A0B(A0X, 0);
        C63083bT r7 = new C63083bT(this, A0X, string);
        AnonymousClass266 A0b = C18200wM.A0b(AnonymousClass0wJ.A0X(r4), C06810aP.A01);
        if (A0b == null) {
            A0b = AnonymousClass266.A07;
        }
        this.A00 = new C71774Ke(requireContext, requireArguments, r7, r8, A002, A0b, A05, C67363zQ.A0H(AnonymousClass0wJ.A0X(r4)));
        C14030oh.A09(1899853182, A022);
    }

    public final void onResume() {
        String str;
        int A022 = C14030oh.A02(-1368131159);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C71774Ke r7 = this.A00;
        if (r7 != null) {
            boolean z = r7.A0A;
            if (z) {
                C63613hu.A04(A0v, 2131830493);
            }
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr = r7.A0D;
            String str2 = "";
            if (directMessageInteropReachabilityOptionsArr != null) {
                for (DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions : directMessageInteropReachabilityOptionsArr) {
                    String str3 = directMessageInteropReachabilityOptions.A03;
                    Context context = r7.A04;
                    String string = context.getString(directMessageInteropReachabilityOptions.A01);
                    Integer num = directMessageInteropReachabilityOptions.A02;
                    if (num != null) {
                        str = context.getString(num.intValue());
                    } else {
                        str = str2;
                    }
                    A0v2.add(new C62563aI(str3, string, str));
                }
            }
            DirectMessageInteropReachabilityOptions A002 = r7.A01.A00(r7.A09);
            r7.A00 = A002;
            if (A002 != null) {
                str2 = A002.A03;
            }
            C61353Sw r0 = new C61353Sw(new IDxCListenerShape512S0100000_1_I2(r7, 7), str2, A0v2);
            r7.A03 = r0;
            A0v.add(r0);
            if (z) {
                A0v.add(new C63293hC((CharSequence) r7.A08));
            }
            setItems(A0v);
            C14030oh.A09(-1057545012, A022);
            return;
        }
        C04220Ms.A0E("controller");
        throw null;
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1827875785);
        super.onStop();
        C71774Ke r2 = this.A00;
        if (r2 != null) {
            AnonymousClass49K r1 = r2.A06;
            synchronized (r1) {
                r1.A09.remove(r2);
            }
            r2.A02 = null;
            C14030oh.A09(328008283, A022);
            return;
        }
        C04220Ms.A0E("controller");
        throw null;
    }
}
