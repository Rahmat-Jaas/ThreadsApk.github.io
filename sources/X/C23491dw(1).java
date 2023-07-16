package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape38S0100000_I2_18;

/* renamed from: X.1dw  reason: invalid class name and case insensitive filesystem */
public final class C23491dw extends AnonymousClass9NU implements C82424pb, C84094sX {
    public static final String __redex_internal_original_name = "BrandedContentAddBrandPartnersSeeAllFragment";
    public C82184pD A00;
    public String A01 = "feed";
    public List A02 = AnonymousClass0ZV.A00;
    public List A03 = AnonymousClass0wJ.A0v();
    public final C04530Oa A04 = C62373Zc.A03(new KtLambdaShape38S0100000_I2_18(this, 6));

    public final void CAd(User user) {
        C04220Ms.A0B(user, 0);
        C82184pD r1 = this.A00;
        if (r1 == null) {
            C04220Ms.A0E("delegate");
            throw null;
        }
        this.A02 = r1.BxW(new AnonymousClass33V(this), user);
        A00();
    }

    public final /* synthetic */ void CAe(User user) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0053, code lost:
        r6.setText(X.C63543hm.A00(r4, r5, r3, __redex_internal_original_name, r1));
        X.C18180wK.A0z(r6);
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x007e, code lost:
        if (r0 == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r3 = 0
            X.C04220Ms.A0B(r8, r3)
            super.onViewCreated(r8, r9)
            r0 = 2131296432(0x7f0900b0, float:1.821078E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r2 = r0.inflate()
            r0 = 2131296435(0x7f0900b3, float:1.8210787E38)
            android.view.View r1 = r2.requireViewById(r0)
            r0 = 63
            X.AnonymousClass0wJ.A16(r1, r0, r7)
            r0 = 2131296438(0x7f0900b6, float:1.8210793E38)
            int r1 = X.C18230wP.A03(r2, r0)
            r0 = 2131306654(0x7f09289e, float:1.8231513E38)
            X.C18190wL.A18(r8, r0, r1)
            r0 = 2131299550(0x7f090cde, float:1.8217105E38)
            android.widget.TextView r6 = X.AnonymousClass0wJ.A0L(r8, r0)
            r6.setVisibility(r3)
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()
            android.content.Context r4 = X.C18190wL.A0A(r6)
            X.0Oa r0 = r7.A04
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.String r2 = "BrandedContentAddBrandPartnersSeeAllFragment"
            java.lang.String r1 = r7.A01
            int r0 = r1.hashCode()
            switch(r0) {
                case 3230752: goto L_0x0061;
                case 3496474: goto L_0x006b;
                case 109770997: goto L_0x0075;
                default: goto L_0x0050;
            }
        L_0x0050:
            r1 = 2131822566(0x7f1107e6, float:1.9277907E38)
        L_0x0053:
            android.text.SpannableStringBuilder r0 = X.C63543hm.A00(r4, r5, r3, r2, r1)
            r6.setText(r0)
            X.C18180wK.A0z(r6)
            r7.A00()
            return
        L_0x0061:
            java.lang.String r0 = "igtv"
            boolean r0 = r1.equals(r0)
            r1 = 2131822567(0x7f1107e7, float:1.927791E38)
            goto L_0x007e
        L_0x006b:
            java.lang.String r0 = "reel"
            boolean r0 = r1.equals(r0)
            r1 = 2131822569(0x7f1107e9, float:1.9277913E38)
            goto L_0x007e
        L_0x0075:
            java.lang.String r0 = "story"
            boolean r0 = r1.equals(r0)
            r1 = 2131822570(0x7f1107ea, float:1.9277915E38)
        L_0x007e:
            if (r0 != 0) goto L_0x0053
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23491dw.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        C170019uI r8;
        AnonymousClass198 r5;
        C304721l r1 = C304721l.LOADED;
        List<User> list = this.A03;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (User user : list) {
            if (C25771Drk.A04(AnonymousClass0wJ.A0X(this.A04))) {
                r5 = new AnonymousClass198((C57943Dd) null, (C57943Dd) null, (C170019uI) null, user, AnonymousClass006.A0Y, (Integer) null, 1788, false, true);
            } else {
                Integer num = AnonymousClass006.A0N;
                int i = 2131821015;
                if (this.A02.contains(user)) {
                    i = 2131832393;
                }
                AnonymousClass1kC A002 = AnonymousClass1kC.A00(new Object[0], i);
                if (this.A02.contains(user)) {
                    r8 = C170019uI.SECONDARY;
                } else {
                    r8 = C170019uI.PRIMARY;
                }
                r5 = new AnonymousClass198(A002, (C57943Dd) null, r8, user, num, (Integer) null, 2032, false, false);
            }
            A0w.add(r5);
        }
        updateUi(r1, A0w);
    }

    public final Collection getDefinitions() {
        return C18180wK.A0n(new AnonymousClass1l1(this, this, this, AnonymousClass0wJ.A0X(this.A04)));
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(AnonymousClass8PK.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final void BhN(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        AnonymousClass0wJ.A1N(user, userSession);
        AnonymousClass0wJ.A1Q(fragmentActivity, str);
        if (C25771Drk.A04(userSession)) {
            C82184pD r1 = this.A00;
            if (r1 == null) {
                C04220Ms.A0E("delegate");
            } else {
                this.A02 = r1.BxW(new AnonymousClass33V(this), user);
                A00();
                return;
            }
        } else {
            C34342Je.A00(fragmentActivity, userSession, user, str);
        }
        throw null;
    }

    public final boolean onBackPressed() {
        C18180wK.A0Q(requireActivity(), AnonymousClass0wJ.A0U(this.A04)).A0D((String) null, 0);
        return true;
    }
}
