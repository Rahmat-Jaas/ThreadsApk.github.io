package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCBackShape392S0100000_1_I2;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1as  reason: invalid class name and case insensitive filesystem */
public final class C22871as extends C34640IcN implements C11630kW, C82034oy {
    public static final String __redex_internal_original_name = "EvergreenSafetyCheckV2Fragment";
    public FragmentActivity A00;
    public AnonymousClass3FY A01;
    public Integer A02 = AnonymousClass006.A00;
    public boolean A03;
    public boolean A04 = true;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C04530Oa A09 = C80644m9.A00(this);

    public final String getModuleName() {
        return "evergreen_safety_check_v2_fragment";
    }

    public static final void A01(C22871as r3) {
        if (r3.A07 && !r3.A03) {
            return;
        }
        if (!r3.A08 || r3.A06) {
            AnonymousClass0wJ.A0F().post(new AnonymousClass4QR(r3));
            C63733iD A012 = C63733iD.A01();
            A012.A0C();
            C63733iD.A08(r3, A012, 2131826913);
            A012.A0I = true;
            A012.A0D = C18180wK.A0g(r3, 2131826912);
            A012.A01 = AnonymousClass3WL.A00();
            A012.A07 = new IDxCBackShape392S0100000_1_I2(r3, 13);
            C63733iD.A0A(A012);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.setTitle("");
            r3.Crl(C18190wL.A0L(C18180wK.A0N(), this, 361));
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A09);
    }

    public static final Map A00(C22871as r3) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (r3.A07) {
            A0y.put("hide_more_comments", String.valueOf(r3.A05));
        }
        if (r3.A08) {
            A0y.put("hide_message_requests", String.valueOf(r3.A04));
        }
        return A0y;
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        String str;
        int A022 = C14030oh.A02(-1974805532);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        C04530Oa r2 = this.A09;
        this.A01 = new AnonymousClass3FY(this, AnonymousClass0wJ.A0X(r2));
        this.A00 = requireActivity();
        User A012 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(r2));
        Boolean A0i = A012.A0i();
        if (A0i != null) {
            this.A07 = !A0i.booleanValue();
        }
        boolean z = !A012.A3X();
        this.A08 = z;
        if (!z && !this.A07) {
            this.A08 = true;
            this.A07 = true;
            C10450iM.A03("evergreen_safety_check_v2_fragment", "Both settings are already on");
        }
        if (bundle2 != null) {
            String string = bundle2.getString("event");
            if (string == null) {
                string = "";
            }
            Integer[] A002 = AnonymousClass006.A00(2);
            int i = 0;
            int length = A002.length;
            while (true) {
                if (i >= length) {
                    num = AnonymousClass006.A00;
                    break;
                }
                num = A002[i];
                if (1 - num.intValue() != 0) {
                    str = "";
                } else {
                    str = "election";
                }
                if (C04220Ms.A0I(str, string)) {
                    break;
                }
                i++;
            }
            this.A02 = num;
        }
        C14030oh.A09(-619187007, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r7.A07 == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        if (r2 != 0) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r0 = -519053640(0xffffffffe10fdeb8, float:-1.6587081E20)
            int r5 = X.C14030oh.A02(r0)
            r1 = 0
            X.C04220Ms.A0B(r8, r1)
            r0 = 2131496988(0x7f0c101c, float:1.8617556E38)
            android.view.View r6 = r8.inflate(r0, r9, r1)
            r0 = 2131306510(0x7f09280e, float:1.8231221E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r6, r0)
            com.instagram.igds.components.headline.IgdsHeadline r2 = (com.instagram.igds.components.headline.IgdsHeadline) r2
            java.lang.Integer r0 = r7.A02
            int r0 = r0.intValue()
            r3 = 1
            if (r0 == r3) goto L_0x012a
            if (r0 != r1) goto L_0x0040
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x011f
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0114
            r0 = 2131826915(0x7f1118e3, float:1.9286728E38)
            r2.setHeadline((int) r0)
            r0 = 2131826914(0x7f1118e2, float:1.9286726E38)
        L_0x0037:
            r2.setBody((int) r0)
            r0 = 2131232087(0x7f080557, float:1.8080273E38)
        L_0x003d:
            r2.A08(r0, r1)
        L_0x0040:
            r0 = 2131297577(0x7f090529, float:1.8213103E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r6, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r4 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r4
            r4.setVisibility(r1)
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0057
            boolean r2 = r7.A07
            r0 = 2131835110(0x7f1138e6, float:1.930335E38)
            if (r2 != 0) goto L_0x005a
        L_0x0057:
            r0 = 2131835111(0x7f1138e7, float:1.9303351E38)
        L_0x005a:
            X.C18210wN.A15(r7, r4, r0)
            r0 = 362(0x16a, float:5.07E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r7, r0)
            r4.setPrimaryActionOnClickListener(r0)
            r0 = 2131831869(0x7f112c3d, float:1.9296776E38)
            java.lang.String r0 = r7.getString(r0)
            r4.setSecondaryActionText(r0)
            r0 = 363(0x16b, float:5.09E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r7, r0)
            r4.setSecondaryActionOnClickListener(r0)
            r4.setPrimaryButtonEnabled(r3)
            r4.setSecondaryButtonEnabled(r3)
            r0 = 2131301424(0x7f091430, float:1.8220905E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r6, r0)
            com.instagram.igds.components.textcell.IgdsListCell r4 = (com.instagram.igds.components.textcell.IgdsListCell) r4
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x010e
            r4.setVisibility(r1)
            X.24V r0 = X.AnonymousClass24V.TYPE_SWITCH
            r4.setTextCellType(r0)
            r0 = 2131232248(0x7f0805f8, float:1.80806E38)
            r4.A05(r0)
            java.lang.Integer r0 = r7.A02
            int r2 = r0.intValue()
            if (r2 == r3) goto L_0x0103
            r0 = 2131835116(0x7f1138ec, float:1.9303361E38)
            if (r2 == r1) goto L_0x0106
        L_0x00a7:
            r0 = 2131835109(0x7f1138e5, float:1.9303347E38)
            java.lang.String r0 = X.C18180wK.A0g(r7, r0)
            r4.A0G(r0)
            boolean r0 = r7.A04
            r4.setChecked(r0)
            r0 = 23
            X.C18230wP.A1N(r4, r7, r0)
        L_0x00bb:
            r0 = 2131301426(0x7f091432, float:1.822091E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r6, r0)
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x00fd
            r2.setVisibility(r1)
            X.24V r0 = X.AnonymousClass24V.TYPE_SWITCH
            r2.setTextCellType(r0)
            r0 = 2131232587(0x7f08074b, float:1.8081287E38)
            r2.A05(r0)
            r0 = 2131835113(0x7f1138e9, float:1.9303355E38)
            java.lang.String r0 = X.C18180wK.A0g(r7, r0)
            r2.A0H(r0)
            r0 = 2131835112(0x7f1138e8, float:1.9303353E38)
            java.lang.String r0 = X.C18180wK.A0g(r7, r0)
            r2.A0G(r0)
            boolean r0 = r7.A05
            r2.setChecked(r0)
            r0 = 24
            X.C18230wP.A1N(r2, r7, r0)
        L_0x00f4:
            X.3FY r0 = r7.A01
            if (r0 != 0) goto L_0x013b
            X.C18240wQ.A0p()
            r0 = 0
            throw r0
        L_0x00fd:
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x00f4
        L_0x0103:
            r0 = 2131835115(0x7f1138eb, float:1.930336E38)
        L_0x0106:
            java.lang.String r0 = X.C18180wK.A0g(r7, r0)
            r4.A0H(r0)
            goto L_0x00a7
        L_0x010e:
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x00bb
        L_0x0114:
            r0 = 2131835104(0x7f1138e0, float:1.9303337E38)
            r2.setHeadline((int) r0)
            r0 = 2131826908(0x7f1118dc, float:1.9286714E38)
            goto L_0x0037
        L_0x011f:
            r0 = 2131835108(0x7f1138e4, float:1.9303345E38)
            r2.setHeadline((int) r0)
            r0 = 2131826911(0x7f1118df, float:1.928672E38)
            goto L_0x0037
        L_0x012a:
            r0 = 2131826910(0x7f1118de, float:1.9286718E38)
            r2.setHeadline((int) r0)
            r0 = 2131826909(0x7f1118dd, float:1.9286716E38)
            r2.setBody((int) r0)
            r0 = 2131231989(0x7f0804f5, float:1.8080075E38)
            goto L_0x003d
        L_0x013b:
            java.util.Map r4 = A00(r7)
            java.lang.String r3 = "quick_promotion"
            X.0nS r1 = r0.A00
            java.lang.String r0 = "instagram_wellbeing_safety_check_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2335(0x91f, float:3.272E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            java.lang.String r1 = "evergreen_safety_check"
            java.lang.String r0 = "surface"
            r2.A0T(r0, r1)
            X.C18250wR.A11(r2, r3, r4)
            java.lang.String r0 = "impression"
            X.C18210wN.A1A(r2, r0)
            r2.Bb4()
            r0 = 1762791563(0x6912108b, float:1.1036331E25)
            X.C14030oh.A09(r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22871as.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
