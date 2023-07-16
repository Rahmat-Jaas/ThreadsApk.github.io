package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape38S0100000_I2_18;

/* renamed from: X.1dt  reason: invalid class name and case insensitive filesystem */
public final class C23461dt extends AnonymousClass9NU implements C82034oy, C84094sX {
    public static final String __redex_internal_original_name = "BrandedContentSeeAllListFragment";
    public String A00 = "unknown";
    public List A01 = AnonymousClass0ZV.A00;
    public final C04530Oa A02 = C62373Zc.A03(new KtLambdaShape38S0100000_I2_18(this, 27));

    public final /* synthetic */ void BhN(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C34342Je.A00(fragmentActivity, userSession, user, str);
        throw null;
    }

    public final void CAd(User user) {
        C25828Dsm A0V;
        int i;
        int i2;
        C04220Ms.A0B(user, 0);
        if (user.A0E() == BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED) {
            A0V = AnonymousClass0wJ.A0V(this);
            A0V.A0L(2131834622);
            A0V.A0K(2131834621);
            i = 2131834638;
            i2 = 8;
        } else if (user.A0D() == BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_PENDING) {
            A0V = AnonymousClass0wJ.A0V(this);
            A0V.A0L(2131822589);
            A0V.A0K(2131822588);
            i = 2131822587;
            i2 = 9;
        } else {
            return;
        }
        AnonymousClass25l.A00(new IDxCListenerShape77S0200000_1_I2(i2, (Object) user, (Object) this), A0V, i);
        A0V.A0S((DialogInterface.OnClickListener) null, AnonymousClass25l.DEFAULT, 2131822590);
        AnonymousClass0wJ.A1K(A0V);
    }

    public final /* synthetic */ void CAe(User user) {
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        int i;
        C04220Ms.A0B(r3, 0);
        String str = this.A00;
        if (C04220Ms.A0I(str, "approve_creators")) {
            i = 2131821452;
        } else {
            if (C04220Ms.A0I(str, "request_approvals")) {
                i = 2131822613;
            }
            r3.CtT(true);
        }
        r3.Cqb(i);
        r3.CtT(true);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0044 A[LOOP:0: B:5:0x003e->B:7:0x0044, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r13 = 0
            r1 = r16
            X.C04220Ms.A0B(r1, r13)
            r0 = r17
            super.onViewCreated(r1, r0)
            r0 = 2131306654(0x7f09289e, float:1.8231513E38)
            X.C18200wM.A1D(r1, r0)
            r0 = 2131299550(0x7f090cde, float:1.8217105E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r1, r0)
            r2.setVisibility(r13)
            java.lang.String r1 = r15.A00
            java.lang.String r0 = "approve_creators"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x005f
            r0 = 2131821451(0x7f11038b, float:1.9275646E38)
            X.C18180wK.A10(r2, r15, r0)
            r0 = 2131821439(0x7f11037f, float:1.9275621E38)
        L_0x002e:
            java.lang.String r4 = X.C18180wK.A0g(r15, r0)
        L_0x0032:
            X.21l r3 = X.C304721l.LOADED
            java.util.List r0 = r15.A01
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x003e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r9 = r1.next()
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            java.lang.Integer r10 = X.AnonymousClass006.A0N
            X.3Dd r6 = X.AnonymousClass2LU.A00(r4)
            r7 = 0
            r14 = 1
            r12 = 1784(0x6f8, float:2.5E-42)
            X.198 r5 = new X.198
            r8 = r7
            r11 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.add(r5)
            goto L_0x003e
        L_0x005f:
            java.lang.String r0 = "request_approvals"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0071
            r0 = 2131822612(0x7f110814, float:1.9278E38)
            X.C18180wK.A10(r2, r15, r0)
            r0 = 2131832393(0x7f112e49, float:1.9297839E38)
            goto L_0x002e
        L_0x0071:
            java.lang.String r4 = ""
            goto L_0x0032
        L_0x0074:
            r15.updateUi(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23461dt.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C23461dt r4, Integer num, String str) {
        C10300i6 A0U = AnonymousClass0wJ.A0U(r4.A02);
        C04220Ms.A0B(str, 3);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r4, A0U), "ig_branded_content_allowlisted_accounts_action_complete"), 821);
        A0I.A0S("creator_ig_id", AnonymousClass0wJ.A0d(str));
        C18210wN.A1A(A0I, "remove");
        A0I.A0S(TraceFieldType.ErrorCode, C18220wO.A0e(num));
        A0I.Bb4();
    }

    public final Collection getDefinitions() {
        return C18180wK.A0n(new AnonymousClass1l1(this, this, this, AnonymousClass0wJ.A0X(this.A02)));
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(AnonymousClass8PN.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }
}
