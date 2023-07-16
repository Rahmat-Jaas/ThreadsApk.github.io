package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;

public class KtLambdaShape48S0200000_I2 extends C02220Ah implements AnonymousClass0YP {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape48S0200000_I2(int i, Object obj, Object obj2) {
        super(2);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x066b, code lost:
        X.AnonymousClass7W3.A0w(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x07b6, code lost:
        X.AnonymousClass7W3.A0w(r0, r1);
        X.AnonymousClass7W3.A0e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0841, code lost:
        if (r4 != null) goto L_0x0843;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0bd3, code lost:
        X.C86124wJ.A19();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0bd7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        r1 = X.C63263h8.A00(r5.A01, r1, X.AnonymousClass4WJ.A0G(X.C18180wK.A0p("media_id", r11), X.C18180wK.A0p(com.instagram.base.activity.IgFragmentActivity.MODULE_KEY, r5.A00.getModuleName())));
        r1.A00 = new X.AnonymousClass5xf(r4, r5);
        X.C31155GhB.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0243, code lost:
        if (r11 != X.C971568d.DENIED_DONT_ASK_AGAIN) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03a9, code lost:
        r13 = X.C86114wI.A0W(r15, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03ad, code lost:
        if (r13 == null) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x03af, code lost:
        X.A63.A00(r12, r13, (com.instagram.search.common.analytics.SearchContext) null, r15, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
        r3 = new X.C10680ik(r15);
        r3.A00 = r12;
        r3.A01 = X.C10690il.A03;
        r4 = r3.A00();
        r3 = X.C19541Ay2.A01(r13, r12, r15, (X.C145018jf) null, (java.lang.Integer) null, X.C86144wL.A0b(), X.I17.A00(111));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x03e0, code lost:
        if (r3 == null) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03e2, code lost:
        r3.A2a = X.C18230wP.A0f(r13.A1g());
        X.C35713J1b.A00(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x03ef, code lost:
        ((X.C146638ma) r0.A00).BhA(r11, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r37, java.lang.Object r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r38
            r11 = r37
            int r2 = r0.A02
            switch(r2) {
                case 0: goto L_0x0a84;
                case 1: goto L_0x0a67;
                case 2: goto L_0x09ef;
                case 3: goto L_0x0bab;
                case 4: goto L_0x09cd;
                case 5: goto L_0x09b5;
                case 6: goto L_0x0b11;
                case 7: goto L_0x0985;
                case 8: goto L_0x0962;
                case 9: goto L_0x0897;
                case 10: goto L_0x0875;
                case 11: goto L_0x07ee;
                case 12: goto L_0x07be;
                case 13: goto L_0x0742;
                case 14: goto L_0x0722;
                case 15: goto L_0x06ff;
                case 16: goto L_0x0694;
                case 17: goto L_0x043f;
                case 18: goto L_0x0670;
                case 19: goto L_0x055f;
                case 20: goto L_0x052b;
                case 21: goto L_0x0464;
                case 22: goto L_0x040f;
                case 23: goto L_0x03f8;
                case 24: goto L_0x03f8;
                case 25: goto L_0x039a;
                case 26: goto L_0x0328;
                case 27: goto L_0x02f6;
                case 28: goto L_0x02c9;
                case 29: goto L_0x02b8;
                case 30: goto L_0x029d;
                case 31: goto L_0x026f;
                case 32: goto L_0x05f4;
                case 33: goto L_0x025e;
                case 34: goto L_0x000b;
                case 35: goto L_0x000b;
                case 36: goto L_0x021a;
                case 37: goto L_0x0200;
                case 38: goto L_0x01ca;
                case 39: goto L_0x0196;
                case 40: goto L_0x018b;
                case 41: goto L_0x016b;
                case 42: goto L_0x0af1;
                case 43: goto L_0x014d;
                case 44: goto L_0x0137;
                case 45: goto L_0x011f;
                case 46: goto L_0x00e2;
                case 47: goto L_0x006a;
                case 48: goto L_0x004d;
                case 49: goto L_0x0aa0;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = (java.lang.String) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r2 = r0.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r2 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r2
            java.lang.Object r0 = r0.A00
            java.lang.Object r4 = X.C86104wH.A0f(r0)
            android.content.Context r4 = (android.content.Context) r4
            r0 = 2
            X.C04220Ms.A0B(r4, r0)
            X.DaJ r5 = r2.A03
        L_0x0024:
            java.lang.String r0 = "media_id"
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r11)
            X.0kW r0 = r5.A00
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "module"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r2)
            java.util.Map r2 = X.AnonymousClass4WJ.A0G(r3, r0)
            com.instagram.service.session.UserSession r0 = r5.A01
            X.4A9 r1 = X.C63263h8.A00(r0, r1, r2)
            X.5xf r0 = new X.5xf
            r0.<init>(r4, r5)
            r1.A00 = r0
            X.C31155GhB.A03(r1)
        L_0x004a:
            kotlin.Unit r6 = kotlin.Unit.A00
        L_0x004c:
            return r6
        L_0x004d:
            android.content.Context r11 = (android.content.Context) r11
            X.BEp r1 = (X.C19889BEp) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r3 = r0.A00
            X.BKU r3 = (X.BKU) r3
            android.util.LruCache r2 = r1.A06
            java.lang.Object r6 = r2.get(r3)
            if (r6 != 0) goto L_0x004c
            com.instagram.service.session.UserSession r0 = r1.A0D
            java.lang.CharSequence r6 = X.C19583Ayj.A03(r11, r3, r0)
            r2.put(r3, r6)
            return r6
        L_0x006a:
            android.content.Context r11 = (android.content.Context) r11
            java.lang.String r1 = (java.lang.String) r1
            r9 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r11, r1)
            java.lang.Object r2 = r0.A01
            X.Ado r2 = (X.C18338Ado) r2
            X.6ea r2 = r2.A00
            java.lang.Object r10 = r0.A00
            X.18U r10 = (X.AnonymousClass18U) r10
            X.C04220Ms.A0B(r10, r5)
            X.BEu r8 = r2.A00
            java.lang.String r7 = r10.A01
            android.util.LruCache r4 = r8.A04
            java.lang.Object r6 = r4.get(r7)
            android.graphics.drawable.Drawable r0 = r8.A00
            if (r0 != 0) goto L_0x00a8
            r0 = 2131232929(0x7f0808a1, float:1.8081981E38)
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r0)
            android.graphics.drawable.Drawable r3 = r0.mutate()
            r8.A00 = r3
            r0 = 10
            int r2 = X.C18240wQ.A01(r11, r0)
            int r0 = X.C18240wQ.A01(r11, r0)
            r3.setBounds(r9, r9, r2, r0)
        L_0x00a8:
            if (r6 != 0) goto L_0x004c
            java.util.List r3 = r10.A03
            android.content.res.Resources r2 = r11.getResources()
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            int r23 = r2.getDimensionPixelSize(r0)
            java.lang.Integer r14 = X.AnonymousClass006.A00
            r13 = 0
            android.graphics.drawable.Drawable r12 = r8.A00
            r0 = 2131100056(0x7f060198, float:1.7812483E38)
            java.lang.Integer r20 = X.C86134wK.A0b(r11, r0)
            r0 = 2
            X.C04220Ms.A0B(r3, r0)
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r21 = r1
            r22 = r3
            r24 = r5
            r25 = r5
            r26 = r5
            android.graphics.drawable.Drawable r6 = X.C25131DgP.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.put(r7, r6)
            return r6
        L_0x00e2:
            android.content.Context r11 = (android.content.Context) r11
            int r2 = X.AnonymousClass0wJ.A04(r1)
            r1 = 0
            X.C04220Ms.A0B(r11, r1)
            int r3 = r2 + 1
            java.lang.Object r2 = r0.A00
            X.BKU r2 = (X.BKU) r2
            int r1 = r2.AWZ()
            if (r3 >= r1) goto L_0x004a
            X.BKU r1 = r2.A2E(r3)
            if (r1 == 0) goto L_0x0104
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r1.A2J(r11)
            if (r2 != 0) goto L_0x010a
        L_0x0104:
            java.lang.String r1 = ""
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.C18250wR.A0K(r1)
        L_0x010a:
            X.K2e r1 = X.C37744K2e.A01()
            java.lang.Object r0 = r0.A01
            X.0kW r0 = (X.C11630kW) r0
            java.lang.String r0 = r0.getModuleName()
            X.Jj7 r0 = r1.A0A(r2, r0)
            r0.A01()
            goto L_0x004a
        L_0x011f:
            X.C37 r11 = (X.C37) r11
            android.view.View r1 = (android.view.View) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r2 = r0.A00
            X.BKU r2 = (X.BKU) r2
            java.lang.Object r0 = r0.A01
            X.BMj r0 = (X.C20066BMj) r0
            int r0 = r0.getPosition()
            r11.CGS(r1, r2, r0)
            goto L_0x004a
        L_0x0137:
            X.9eC r11 = (X.C161669eC) r11
            X.BMH r1 = (X.BMH) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r3 = r0.A00
            X.BKU r3 = (X.BKU) r3
            java.lang.Object r2 = r0.A01
            X.BMj r2 = (X.C20066BMj) r2
            boolean r0 = r2.A24
            r11.A0A(r3, r1, r2, r0)
            goto L_0x004a
        L_0x014d:
            java.lang.String r11 = (java.lang.String) r11
            float r4 = X.C18240wQ.A00(r1)
            r1 = 0
            X.C04220Ms.A0B(r11, r1)
            java.lang.Object r3 = r0.A00
            X.4qz r3 = (X.C83224qz) r3
            java.lang.Object r0 = r0.A01
            com.instagram.direct.headmojis.service.HeadmojiRepository r0 = (com.instagram.direct.headmojis.service.HeadmojiRepository) r0
            r2 = 0
            com.instagram.direct.headmojis.service.HeadmojiRepository$renderStickers$2$1$1$1 r1 = new com.instagram.direct.headmojis.service.HeadmojiRepository$renderStickers$2$1$1$1
            r1.<init>(r0, r11, r2, r4)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x004a
        L_0x016b:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x017c
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x017c:
            java.lang.Object r2 = r0.A01
            X.IcN r2 = (X.C34640IcN) r2
            java.lang.Object r1 = r0.A00
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r0 = 8
            X.AnonymousClass6QS.A00(r11, r2, r1, r0)
            goto L_0x004a
        L_0x018b:
            java.lang.Long r11 = (java.lang.Long) r11
            java.lang.Object r0 = r0.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.AnonymousClass2L6.A00(r0, r11)
            goto L_0x004a
        L_0x0196:
            java.util.List r1 = (java.util.List) r1
            r5 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r11, r1)
            boolean r2 = X.C18190wL.A1a(r1)
            if (r2 == 0) goto L_0x01b3
            java.lang.Object r2 = r0.A01
            com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource r2 = (com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource) r2
            X.8v3 r3 = r2.A00
            X.4wE r2 = r3.A0C
            X.C86074wE.A01(r2, r5)
            X.4wE r2 = r3.A0B
            X.C86074wE.A01(r2, r4)
        L_0x01b3:
            java.lang.Object r0 = r0.A00
            X.74f r0 = (X.C1192474f) r0
            r4 = 0
            X.8s9 r2 = r0.A00
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            X.6qB r0 = new X.6qB
            r3 = r0
            r5 = r11
            r6 = r1
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8)
            r2.resumeWith(r0)
            goto L_0x004a
        L_0x01ca:
            boolean r5 = X.AnonymousClass0wJ.A1X(r1)
            java.lang.Object r4 = r0.A01
            X.DlN r4 = (X.C25423DlN) r4
            boolean r1 = r4.A05
            if (r1 != 0) goto L_0x004a
            java.lang.Object r3 = r0.A00
            X.23Z r3 = (X.AnonymousClass23Z) r3
            X.4wE r2 = r4.A0A
            java.lang.Object r1 = r2.getValue()
            com.instagram.clips.capture.sharesheet.advancedsettings.config.ClipsAdvancedSettingsFanClubConfig r1 = (com.instagram.clips.capture.sharesheet.advancedsettings.config.ClipsAdvancedSettingsFanClubConfig) r1
            if (r5 == 0) goto L_0x01fe
            X.0aP r0 = r4.A09
            com.instagram.user.model.User r0 = r0.A00
            com.instagram.clips.model.metadata.ClipsFanClubMetadata r5 = X.C25080DfQ.A00(r3, r0)
        L_0x01ec:
            boolean r6 = r1.A04
            boolean r7 = r1.A02
            boolean r8 = r1.A03
            com.instagram.clips.capture.sharesheet.advancedsettings.config.ExclusiveContentToggleEnvironment r4 = r1.A00
            com.instagram.clips.capture.sharesheet.advancedsettings.config.ClipsAdvancedSettingsFanClubConfig r3 = new com.instagram.clips.capture.sharesheet.advancedsettings.config.ClipsAdvancedSettingsFanClubConfig
            r3.<init>(r4, r5, r6, r7, r8)
            r2.CrC(r3)
            goto L_0x004a
        L_0x01fe:
            r5 = 0
            goto L_0x01ec
        L_0x0200:
            X.C86144wL.A1M(r1)
            java.lang.Object r4 = r0.A01
            X.Jjm r4 = (X.C37062Jjm) r4
            r1 = 319(0x13f, float:4.47E-43)
            java.lang.String r3 = X.I17.A00(r1)
            java.lang.String r2 = "two_fac_alert_dialog_dismiss_button"
            r1 = 0
            r4.A09(r3, r2, r1, r1)
            java.lang.Object r0 = r0.A00
            X.C18240wQ.A1G(r0)
            goto L_0x004a
        L_0x021a:
            boolean r2 = X.AnonymousClass0wJ.A1X(r1)
            r5 = 0
            X.C04220Ms.A0B(r11, r5)
            X.68d r1 = X.C971568d.GRANTED
            if (r11 != r1) goto L_0x023e
            java.lang.Object r5 = r0.A01
            X.3ak r5 = (X.C62793ak) r5
            X.4qz r4 = X.AnonymousClass3J5.A00(r5)
            r3 = 0
            java.lang.Object r2 = r0.A00
            r0 = 20
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r5, (X.C146958n9) r3, (int) r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r4, r0)
            goto L_0x004a
        L_0x023e:
            if (r2 != 0) goto L_0x0245
            X.68d r1 = X.C971568d.DENIED_DONT_ASK_AGAIN
            r4 = 1
            if (r11 == r1) goto L_0x0246
        L_0x0245:
            r4 = 0
        L_0x0246:
            java.lang.Object r0 = r0.A01
            X.56Q r0 = (X.AnonymousClass56Q) r0
            X.4wE r3 = r0.A01
        L_0x024c:
            java.lang.Object r2 = r3.getValue()
            r1 = 2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2
            r0.<init>(r5, r4, r1)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x024c
            goto L_0x004a
        L_0x025e:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = (java.lang.String) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r2 = r0.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r2 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r2
            com.instagram.service.session.UserSession r15 = r2.A0D
            X.C2o r12 = r2.A0C
            goto L_0x03a9
        L_0x026f:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r1 = r1 & 11
            r2 = 2
            if (r1 != r2) goto L_0x0280
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0280:
            java.lang.Object r1 = r0.A00
            java.lang.Object r1 = X.C86104wH.A0f(r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0500000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0500000_I2) r1
            java.lang.Object r13 = r1.A00
            X.67Z r13 = (X.AnonymousClass67Z) r13
            r12 = 0
            java.lang.Object r1 = r0.A01
            r0 = 7
            kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2 r14 = new kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2
            r14.<init>(r1, r0)
            r15 = 0
            r16 = r2
            X.C117836zK.A00(r11, r12, r13, r14, r15, r16)
            goto L_0x004a
        L_0x029d:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = (java.lang.String) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r2 = r0.A01
            X.57x r2 = (X.C884057x) r2
            java.lang.Object r0 = r0.A00
            java.lang.Object r4 = X.C86104wH.A0f(r0)
            android.content.Context r4 = (android.content.Context) r4
            r0 = 2
            X.C04220Ms.A0B(r4, r0)
            X.DaJ r5 = r2.A04
            goto L_0x0024
        L_0x02b8:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = (java.lang.String) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r2 = r0.A01
            X.57x r2 = (X.C884057x) r2
            com.instagram.service.session.UserSession r15 = r2.A0A
            X.C2o r12 = r2.A09
            goto L_0x03a9
        L_0x02c9:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x02da
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x02da:
            java.lang.Object r3 = r0.A00
            X.7Zx r3 = (X.C123917Zx) r3
            X.7AO r2 = r3.A03
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.barcelona.navigation.BarcelonaComposeNavigator.Destination"
            X.C04220Ms.A0C(r2, r1)
            X.58z r2 = (X.C885158z) r2
            X.0YC r2 = r2.A04
            java.lang.Object r1 = r0.A01
            r0 = 72
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r3, r11, r0)
            goto L_0x004a
        L_0x02f6:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0307
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0307:
            java.lang.Object r5 = r0.A01
            com.instagram.base.activity.IgFragmentActivity r5 = (com.instagram.base.activity.IgFragmentActivity) r5
            r1 = 838(0x346, float:1.174E-42)
            java.lang.String r4 = X.C18170wI.A00(r1)
            r3 = 674496637(0x2834007d, float:9.992113E-15)
            java.lang.Object r2 = r0.A00
            r1 = 26
            kotlin.jvm.internal.KtLambdaShape48S0200000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape48S0200000_I2
            r0.<init>(r1, r2, r5)
            X.8sI r1 = X.AnonymousClass7JR.A00(r11, r0, r3)
            r0 = 392(0x188, float:5.5E-43)
            X.AnonymousClass7BU.A00(r11, r5, r4, r1, r0)
            goto L_0x004a
        L_0x0328:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0339
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0339:
            java.lang.Object r5 = r0.A01
            androidx.core.app.ComponentActivity r5 = (androidx.core.app.ComponentActivity) r5
            X.06E r14 = X.AnonymousClass06E.A00(r5)
            java.lang.Object r15 = r0.A00
            X.0i6 r15 = (X.C10300i6) r15
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            X.7W3 r1 = X.C147188nY.A0Z(r11, r2)
            java.lang.Object r12 = r1.A13()
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            r4 = 0
            if (r12 != r0) goto L_0x0359
            androidx.compose.runtime.ParcelableSnapshotMutableState r12 = X.AnonymousClass7WR.A00(r1, r4)
        L_0x0359:
            r3 = 0
            X.AnonymousClass7W3.A0w(r1, r3)
            X.8pE r12 = (X.C147368pE) r12
            java.lang.Object r13 = X.C147188nY.A0r(r11, r1, r2)
            if (r13 != r0) goto L_0x0369
            androidx.compose.runtime.ParcelableSnapshotMutableState r13 = X.AnonymousClass7WR.A00(r1, r4)
        L_0x0369:
            X.AnonymousClass7W3.A0w(r1, r3)
            X.8pE r13 = (X.C147368pE) r13
            r0 = 9
            kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1 r2 = new kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1
            r2.<init>(r5, r0)
            r0 = 44
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r1 = new kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6
            r1.<init>(r5, r0)
            X.4iY r20 = X.C78514iY.A00
            X.5vk r0 = X.C94595vk.A00
            java.lang.String r0 = r0.A01
            r22 = 1576392(0x180dc8, float:2.208996E-39)
            r24 = 1408(0x580, float:1.973E-42)
            r16 = r0
            r17 = r4
            r18 = r4
            r19 = r1
            r21 = r2
            r23 = r3
            r25 = r3
            X.C117786zF.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x004a
        L_0x039a:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = (java.lang.String) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r2 = r0.A01
            X.56T r2 = (X.AnonymousClass56T) r2
            com.instagram.service.session.UserSession r15 = r2.A07
            X.C2o r12 = r2.A06
        L_0x03a9:
            X.BKU r13 = X.C86114wI.A0W(r15, r11)
            if (r13 == 0) goto L_0x03ef
            r14 = 0
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            X.A63.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.0ik r3 = new X.0ik
            r3.<init>(r15)
            r3.A00 = r12
            X.0il r2 = X.C10690il.A03
            r3.A01 = r2
            X.0nS r4 = r3.A00()
            r2 = 111(0x6f, float:1.56E-43)
            java.lang.String r22 = X.I17.A00(r2)
            java.lang.Integer r21 = X.C86144wL.A0b()
            r16 = r13
            r17 = r12
            r18 = r15
            X.BK1 r3 = X.C19541Ay2.A01(r16, r17, r18, r19, r20, r21, r22)
            if (r3 == 0) goto L_0x03ef
            int r2 = r13.A1g()
            java.lang.Long r2 = X.C18230wP.A0f(r2)
            r3.A2a = r2
            X.C35713J1b.A00(r4, r3)
        L_0x03ef:
            java.lang.Object r0 = r0.A00
            X.8ma r0 = (X.C146638ma) r0
            r0.BhA(r11, r1)
            goto L_0x004a
        L_0x03f8:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = (java.lang.String) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r2 = r0.A01
            X.56T r2 = (X.AnonymousClass56T) r2
            java.lang.Object r4 = r0.A00
            android.content.Context r4 = (android.content.Context) r4
            r0 = 2
            X.C04220Ms.A0B(r4, r0)
            X.DaJ r5 = r2.A02
            goto L_0x0024
        L_0x040f:
            X.7Es r11 = (X.C121197Es) r11
            r1 = 0
            X.C04220Ms.A0B(r11, r1)
            java.lang.Object r3 = r0.A01
            X.0YY r3 = (X.AnonymousClass0YY) r3
            long r1 = r11.A05
            float r2 = X.AnonymousClass7KC.A01(r1)
            java.lang.Object r0 = r0.A00
            X.8py r0 = (X.C147818py) r0
            X.6bK r0 = (X.C104156bK) r0
            X.8mM r0 = r0.A00
            if (r0 == 0) goto L_0x043c
            long r0 = r0.BCI()
        L_0x042d:
            int r0 = X.C86104wH.A07(r0)
            float r0 = (float) r0
            float r2 = r2 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r3.invoke(r0)
            goto L_0x004a
        L_0x043c:
            r0 = 0
            goto L_0x042d
        L_0x043f:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = (java.lang.String) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r4 = r0.A01
            X.5j6 r4 = (X.AnonymousClass5j6) r4
            com.fbpay.logging.LoggingContext r3 = r4.A06
            if (r3 == 0) goto L_0x0bd3
            java.lang.String r2 = "product_upsell"
            X.AnonymousClass5j6.A03(r4, r3, r2, r1)
            X.3VP r1 = X.AnonymousClass7Kz.A0N()
            java.lang.Object r0 = r0.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            r1.A00(r0, r11)
            goto L_0x004a
        L_0x0464:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0475
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0475:
            java.lang.Object r1 = r0.A00
            X.6dW r1 = (X.C105496dW) r1
            java.lang.Object r8 = r0.A01
            X.4oM r8 = (X.C81784oM) r8
            X.7Wm r6 = androidx.compose.ui.Modifier.A00(r11)
            X.8jl r2 = X.AnonymousClass7J3.A07
            X.8fk r0 = X.AnonymousClass7KV.A02
            r5 = 0
            X.8ly r10 = X.AnonymousClass72M.A00(r2, r11, r0)
            java.lang.Object r9 = X.C147188nY.A0p(r11)
            java.lang.Object r7 = X.C147188nY.A0n(r11)
            java.lang.Object r4 = X.C147188nY.A0m(r11)
            X.0ZU r3 = X.AnonymousClass74X.A00
            X.0YM r2 = X.C98236Es.A00(r6)
            r0 = r11
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            X.C147188nY.A0w(r11, r0, r3)
            X.AnonymousClass7W3.A0a(r11, r0, r10, r9)
            X.AnonymousClass7KP.A07(r11, r7, r4, r2)
            r2 = 1291473488(0x4cfa5250, float:1.31240576E8)
            r11.Cvb(r2)
            r12 = 0
            X.7KB r2 = X.C120537Bh.A00(r11)
            long r2 = r2.A08
            r4 = 1
            float r7 = (float) r4
            r14 = 384(0x180, float:5.38E-43)
            r13 = r7
            r15 = r4
            r16 = r2
            X.AnonymousClass70V.A01(r11, r12, r13, r14, r15, r16)
            r2 = -19862151(0xfffffffffed0ed79, float:-1.3885623E38)
            java.lang.Object r2 = X.C147188nY.A0u(r11, r8, r2)
            X.5IE r2 = (X.AnonymousClass5IE) r2
            java.util.List r2 = r2.A04
            if (r2 == 0) goto L_0x0bcc
            java.util.Iterator r3 = r2.iterator()
        L_0x04d1:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0517
            java.lang.Object r13 = r3.next()
            X.8mY r13 = (X.C146628mY) r13
            X.7p2 r14 = X.AnonymousClass7p2.A00
            java.lang.String r2 = r13.B2L()
            X.8p3 r10 = X.AnonymousClass6MD.A00(r11, r1, r2)
            X.8b2 r27 = X.AnonymousClass8b2.A00
            X.4mX r23 = X.C80824mX.A00
            X.8b3 r28 = X.AnonymousClass8b3.A00
            X.4ah r15 = X.C74594ah.A00
            X.4iN r16 = X.C78404iN.A00
            X.4iO r17 = X.C78414iO.A00
            X.4mY r24 = X.C80834mY.A00
            X.4mZ r25 = X.C80844mZ.A00
            r29 = 920349744(0x36db6c30, float:6.5393033E-6)
            r30 = 54
            r32 = 2093056(0x1ff000, float:2.932996E-39)
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r26 = r12
            r31 = r5
            r33 = r4
            r34 = r5
            r35 = r5
            X.AnonymousClass6N1.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x04d1
        L_0x0517:
            X.AnonymousClass7W3.A0w(r0, r5)
            X.AnonymousClass7W3.A0v(r0, r4)
            r0 = 12
            float r1 = (float) r0
            float r0 = (float) r5
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7K4.A05(r6, r0, r0, r0, r1)
            r0 = 6
            X.C115686vk.A01(r11, r1, r0)
            goto L_0x004a
        L_0x052b:
            X.7Es r11 = (X.C121197Es) r11
            float r3 = X.C18240wQ.A00(r1)
            r1 = 0
            X.C04220Ms.A0B(r11, r1)
            long r1 = X.C121667Hg.A00(r11)
            float r1 = X.AnonymousClass7KC.A01(r1)
            long r6 = X.C86104wH.A0C(r1, r3)
            java.lang.Object r5 = r0.A01
            X.6rr r5 = (X.C113636rr) r5
            long r3 = r11.A09
            long r1 = r11.A05
            r5.A01(r3, r1)
            java.lang.Object r3 = r0.A00
            X.6hL r3 = (X.C107806hL) r3
            X.4qz r1 = r3.A01
            r4 = 0
            r5 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2
            r2.<init>(r3, r4, r5, r6)
            r0 = 3
            X.C25237DiI.A00(r4, r4, r2, r1, r0)
            goto L_0x004a
        L_0x055f:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0570
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0570:
            java.lang.Object r9 = r0.A01
            X.4oM r9 = (X.C81784oM) r9
            java.lang.Object r10 = r0.A00
            X.8p3 r10 = (X.C147258p3) r10
            X.7Wm r8 = androidx.compose.ui.Modifier.A00(r11)
            X.8jl r2 = X.AnonymousClass7J3.A07
            X.8fk r0 = X.AnonymousClass7KV.A02
            r1 = 0
            X.8ly r7 = X.AnonymousClass72M.A00(r2, r11, r0)
            java.lang.Object r6 = X.C147188nY.A0p(r11)
            java.lang.Object r5 = X.C147188nY.A0n(r11)
            java.lang.Object r4 = X.C147188nY.A0m(r11)
            X.0ZU r3 = X.AnonymousClass74X.A00
            X.0YM r2 = X.C98236Es.A00(r8)
            r0 = r11
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            X.C147188nY.A0w(r11, r0, r3)
            X.AnonymousClass7W3.A0a(r11, r0, r7, r6)
            X.AnonymousClass7KP.A07(r11, r5, r4, r2)
            r2 = 1153783964(0x44c5589c, float:1578.769)
            java.lang.Object r2 = X.C147188nY.A0u(r11, r9, r2)
            X.5IX r2 = (X.AnonymousClass5IX) r2
            java.util.List r2 = r2.A0A
            java.util.Iterator r3 = r2.iterator()
        L_0x05b2:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x066b
            java.lang.Object r13 = r3.next()
            X.8mY r13 = (X.C146628mY) r13
            X.7p2 r14 = X.AnonymousClass7p2.A00
            r18 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.Modifier.A04(r8)
            r33 = 1
            X.8b0 r27 = X.AnonymousClass8b0.A00
            X.4mT r23 = X.AnonymousClass4mT.A00
            X.8b1 r28 = X.AnonymousClass8b1.A00
            X.4ad r15 = X.C74554ad.A00
            X.4iL r16 = X.C78384iL.A00
            X.4iM r17 = X.C78394iM.A00
            X.4mU r24 = X.C80794mU.A00
            X.4mV r25 = X.C80804mV.A00
            r29 = 920350128(0x36db6db0, float:6.539478E-6)
            r30 = 438(0x1b6, float:6.14E-43)
            r32 = 2088960(0x1fe000, float:2.927256E-39)
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r26 = r18
            r31 = r1
            r34 = r1
            r35 = r1
            X.AnonymousClass6N1.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x05b2
        L_0x05f4:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0605
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0605:
            X.7Wm r7 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7Kq.A04(r7)
            r2 = 1
            X.8PA r1 = X.AnonymousClass8PA.A00
            androidx.compose.ui.Modifier r6 = X.AnonymousClass6FI.A00(r3, r1, r2)
            r1 = 0
            X.799 r5 = X.AnonymousClass799.A00(r1)
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A00
            r2 = 48
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r0 = new kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3
            r0.<init>(r2, r3, r4)
            androidx.compose.ui.Modifier r0 = X.C117646z1.A01(r6, r5, r0)
            X.8ly r8 = X.AnonymousClass7KV.A07(r11, r1)
            java.lang.Object r6 = X.C147188nY.A0p(r11)
            java.lang.Object r5 = X.C147188nY.A0n(r11)
            java.lang.Object r4 = X.C147188nY.A0m(r11)
            X.0ZU r3 = X.AnonymousClass74X.A00
            X.0YM r2 = X.C98236Es.A00(r0)
            r0 = r11
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            X.C147188nY.A0w(r11, r0, r3)
            X.AnonymousClass7W3.A0a(r11, r0, r8, r6)
            X.AnonymousClass7KP.A07(r11, r5, r4, r2)
            X.7V3 r3 = X.AnonymousClass7V3.A00
            r2 = -418850951(0xffffffffe708d779, float:-6.462166E23)
            r11.Cvb(r2)
            r2 = 2131230980(0x7f080104, float:1.8078028E38)
            X.6uo r5 = X.AnonymousClass6QP.A00(r11, r2)
            r2 = 2131831737(0x7f112bb9, float:1.9296508E38)
            java.lang.String r4 = X.AnonymousClass7JS.A01(r11, r2)
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7KV.A01(r3, r7)
            r2 = 24
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7Kq.A0F(r3, r2)
            X.C86114wI.A17(r11, r2, r5, r4)
        L_0x066b:
            X.AnonymousClass7W3.A0w(r0, r1)
            goto L_0x07b6
        L_0x0670:
            float r5 = X.C18240wQ.A00(r11)
            float r4 = X.C18240wQ.A00(r1)
            java.lang.Object r1 = r0.A00
            X.6dV r1 = (X.C105486dV) r1
            X.7A5 r3 = r1.A00
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            X.8pE r1 = r3.A06
            r1.CrC(r2)
            X.8pE r1 = r3.A05
            X.C147368pE.A02(r1, r4)
            java.lang.Object r0 = r0.A01
            X.0Ma r0 = (X.C04040Ma) r0
            r0.A00 = r5
            goto L_0x004a
        L_0x0694:
            X.C86144wL.A1M(r1)
            java.lang.Object r4 = r0.A01
            X.58K r4 = (X.AnonymousClass58K) r4
            java.lang.String r3 = X.AnonymousClass58K.A00(r4)
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r8 = r4.A03
            if (r8 == 0) goto L_0x0bd3
            X.5Dj r6 = new X.5Dj
            r6.<init>()
            java.lang.String r1 = "code"
            r6.A0A(r1, r3)
            X.587 r1 = r4.A0C
            java.util.LinkedHashMap r7 = X.AnonymousClass7Kr.A07(r1)
            java.lang.String r9 = "apply_offer"
            X.09x r2 = r2.A00
            java.lang.String r1 = "user_edit_promocode_submit"
            X.0A2 r2 = X.C86104wH.A0K(r2, r1)
            r1 = 2874(0xb3a, float:4.027E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r2, r1)
            r10 = 8
            kotlin.jvm.internal.KtLambdaShape3S1300000_I2 r5 = new kotlin.jvm.internal.KtLambdaShape3S1300000_I2
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.String) r9, (int) r10)
            X.C128957ke.A04(r1, r8, r5)
            X.56r r3 = r4.A09
            X.7Kx r1 = X.C86104wH.A0R(r3)
            if (r1 == 0) goto L_0x06fa
            java.lang.Object r1 = r1.A01
            com.facebookpay.expresscheckout.models.OffersList r1 = (com.facebookpay.expresscheckout.models.OffersList) r1
            if (r1 == 0) goto L_0x06fa
            java.util.List<com.facebookpay.expresscheckout.models.ECPOffer> r1 = r1.A00
            java.util.ArrayList r2 = X.C18200wM.A0s(r1)
        L_0x06e5:
            X.C000300e.A0p(r2)
            com.facebookpay.expresscheckout.models.OffersList r1 = new com.facebookpay.expresscheckout.models.OffersList
            r1.<init>(r2)
            X.AnonymousClass7Kx.A0I(r3, r1)
            X.AnonymousClass58K.A04(r4)
            java.lang.Object r0 = r0.A00
            X.C18240wQ.A1G(r0)
            goto L_0x004a
        L_0x06fa:
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            goto L_0x06e5
        L_0x06ff:
            X.6ie r11 = (X.C108616ie) r11
            X.6ie r1 = (X.C108616ie) r1
            X.AnonymousClass0wJ.A1N(r11, r1)
            java.lang.Object r4 = r0.A00
            X.67E r3 = X.AnonymousClass67E.PREPEND
            java.lang.Object r2 = r0.A01
            X.79h r2 = (X.C1202279h) r2
            if (r4 != r3) goto L_0x071b
            r11.A00 = r2
            if (r2 == 0) goto L_0x004a
            X.4wF r0 = r11.A01
        L_0x0716:
            r0.D7t(r2)
            goto L_0x004a
        L_0x071b:
            r1.A00 = r2
            if (r2 == 0) goto L_0x004a
            X.4wF r0 = r1.A01
            goto L_0x0716
        L_0x0722:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0733
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0733:
            java.lang.Object r1 = r0.A01
            X.592 r1 = (X.AnonymousClass592) r1
            X.0YM r2 = r1.A01
            java.lang.Object r1 = r0.A00
            r0 = 8
            X.C86104wH.A1R(r1, r11, r2, r0)
            goto L_0x004a
        L_0x0742:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0753
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0753:
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
            X.8MR r2 = X.AnonymousClass8MR.A00
            r9 = 0
            r1 = 0
            androidx.compose.ui.Modifier r3 = X.AnonymousClass6FI.A00(r3, r2, r9)
            java.lang.Object r4 = r0.A01
            X.54n r4 = (X.C877854n) r4
            r2 = 4
            kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3 r2 = X.C86164wN.A0q(r4, r2)
            androidx.compose.ui.Modifier r3 = X.C98256Eu.A00(r3, r2)
            X.4oM r2 = r4.A0E
            boolean r2 = X.C86104wH.A1X(r2)
            float r2 = X.C86164wN.A01(r2)
            androidx.compose.ui.Modifier r10 = X.AnonymousClass6EV.A00(r3, r2)
            r3 = 606497925(0x24266c85, float:3.6087432E-17)
            java.lang.Object r2 = r0.A00
            r0 = 25
            kotlin.jvm.internal.KtLambdaShape167S0100000_I2 r0 = X.C86164wN.A0u(r2, r0)
            X.8sI r8 = X.AnonymousClass7JR.A00(r11, r0, r3)
            r0 = 1406149896(0x53d02508, float:1.78794896E12)
            r11.Cvb(r0)
            X.7Xq r7 = X.C123577Xq.A00
            java.lang.Object r6 = X.C147188nY.A0p(r11)
            java.lang.Object r5 = X.C147188nY.A0n(r11)
            java.lang.Object r4 = X.C147188nY.A0m(r11)
            X.0ZU r2 = X.AnonymousClass74X.A00
            X.0YM r3 = X.C98236Es.A00(r10)
            r0 = r11
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            X.C147188nY.A0w(r11, r0, r2)
            X.7KP r2 = X.AnonymousClass7KP.A02(r11, r7, r6, r5, r4)
            X.C147188nY.A0x(r11, r2, r3, r9)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.invoke(r11, r2)
        L_0x07b6:
            X.AnonymousClass7W3.A0w(r0, r1)
            X.AnonymousClass7W3.A0e(r0)
            goto L_0x004a
        L_0x07be:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x07cf
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x07cf:
            X.0YP r15 = X.C102906Wz.A00
            java.lang.Object r2 = r0.A00
            java.lang.Object r1 = r0.A01
            r0 = 25
            kotlin.jvm.internal.KtLambdaShape16S0200000_I2 r14 = X.C86164wN.A0v(r2, r1, r0)
            r9 = 0
            r19 = 0
            r17 = 6
            r18 = 508(0x1fc, float:7.12E-43)
            r10 = r9
            r12 = r9
            r13 = r9
            r16 = r9
            r21 = r19
            X.AnonymousClass7D3.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            goto L_0x004a
        L_0x07ee:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x07ff
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x07ff:
            java.lang.Object r5 = r0.A01
            androidx.compose.ui.platform.WrappedComposition r5 = (androidx.compose.ui.platform.WrappedComposition) r5
            androidx.compose.ui.platform.AndroidComposeView r6 = r5.A04
            r1 = 2131302105(0x7f0916d9, float:1.8222287E38)
            r7 = 2131302105(0x7f0916d9, float:1.8222287E38)
            java.lang.Object r4 = r6.getTag(r1)
            boolean r1 = r4 instanceof java.util.Set
            if (r1 == 0) goto L_0x0873
            boolean r1 = r4 instanceof X.C03740Kn
            if (r1 == 0) goto L_0x081b
            boolean r1 = r4 instanceof X.AnonymousClass027
            if (r1 == 0) goto L_0x0873
        L_0x081b:
            r1 = 1
        L_0x081c:
            r3 = 0
            if (r1 == 0) goto L_0x0823
            java.util.Set r4 = (java.util.Set) r4
            if (r4 != 0) goto L_0x0843
        L_0x0823:
            android.view.ViewParent r2 = r6.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L_0x0871
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0871
            java.lang.Object r4 = r2.getTag(r7)
        L_0x0833:
            boolean r1 = r4 instanceof java.util.Set
            if (r1 == 0) goto L_0x086f
            boolean r1 = r4 instanceof X.C03740Kn
            if (r1 == 0) goto L_0x083f
            boolean r1 = r4 instanceof X.AnonymousClass027
            if (r1 == 0) goto L_0x086f
        L_0x083f:
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x084e
        L_0x0843:
            r2 = r11
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            X.7yb r1 = r2.A0g
            r4.add(r1)
            r1 = 1
            r2.A0N = r1
        L_0x084e:
            r1 = 17
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r5, r3, r1)
            X.AnonymousClass7K5.A05(r11, r6, r1)
            r2 = 1
            X.534 r1 = X.C102716Wg.A00
            X.7DS[] r4 = X.AnonymousClass7DS.A01(r1, r4, r2)
            r3 = -1193460702(0xffffffffb8dd3c22, float:-1.0549302E-4)
            java.lang.Object r2 = r0.A00
            r1 = 10
            kotlin.jvm.internal.KtLambdaShape48S0200000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape48S0200000_I2
            r0.<init>(r1, r2, r5)
            X.AnonymousClass7JR.A05(r11, r0, r4, r3)
            goto L_0x004a
        L_0x086f:
            r4 = r3
            goto L_0x084e
        L_0x0871:
            r4 = r3
            goto L_0x0833
        L_0x0873:
            r1 = 0
            goto L_0x081c
        L_0x0875:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0886
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0886:
            java.lang.Object r1 = r0.A01
            androidx.compose.ui.platform.WrappedComposition r1 = (androidx.compose.ui.platform.WrappedComposition) r1
            androidx.compose.ui.platform.AndroidComposeView r2 = r1.A04
            java.lang.Object r1 = r0.A00
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r0 = 8
            X.AnonymousClass7DA.A00(r11, r2, r1, r0)
            goto L_0x004a
        L_0x0897:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x08a8
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x08a8:
            java.lang.Object r1 = r0.A01
            X.6lL r1 = (X.C110236lL) r1
            X.8pE r1 = r1.A04
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
            java.lang.Object r2 = r0.A00
            X.0YP r2 = (X.AnonymousClass0YP) r2
            r0 = 207(0xcf, float:2.9E-43)
            r11.Cve(r0, r1)
            boolean r1 = r11.ACZ(r3)
            if (r3 == 0) goto L_0x08e7
            java.lang.Integer r0 = X.C18220wO.A0d()
            r2.invoke(r11, r0)
        L_0x08ce:
            X.7W3 r11 = (X.AnonymousClass7W3) r11
            boolean r0 = r11.A0T
            r2 = 0
            if (r0 == 0) goto L_0x08e2
            X.7AV r0 = r11.A0D
            int r1 = r0.A05
            int r0 = r11.A08
            if (r1 != r0) goto L_0x08e2
            r0 = -1
            r11.A08 = r0
            r11.A0T = r2
        L_0x08e2:
            X.AnonymousClass7W3.A0w(r11, r2)
            goto L_0x004a
        L_0x08e7:
            r7 = r11
            X.7W3 r7 = (X.AnonymousClass7W3) r7
            int r0 = r7.A03
            if (r0 != 0) goto L_0x0bd8
            boolean r0 = r7.A0P
            if (r0 != 0) goto L_0x08ce
            if (r1 != 0) goto L_0x08f8
            X.AnonymousClass7W3.A0o(r7)
            goto L_0x08ce
        L_0x08f8:
            X.7AV r0 = r7.A0D
            int r6 = r0.A01
            int r8 = r0.A00
            r4 = r6
        L_0x08ff:
            if (r4 >= r8) goto L_0x0951
            X.7AV r1 = r7.A0D
            int[] r0 = r1.A09
            boolean r0 = X.C121627Hb.A04(r4, r0)
            if (r0 == 0) goto L_0x091c
            java.lang.Object r1 = r1.A05(r4)
            boolean r0 = r1 instanceof X.C145718ky
            if (r0 == 0) goto L_0x091c
            r0 = 12
            kotlin.jvm.internal.KtLambdaShape171S0100000_I2 r0 = X.C86164wN.A0w(r1, r0)
            X.AnonymousClass7W3.A0r(r7, r0)
        L_0x091c:
            X.7AV r9 = r7.A0D
            r0 = 11
            kotlin.jvm.internal.KtLambdaShape21S0101000_I2 r5 = new kotlin.jvm.internal.KtLambdaShape21S0101000_I2
            r5.<init>(r7, r4, r0)
            int[] r0 = r9.A09
            int r10 = X.C121627Hb.A01(r4, r0)
            int r4 = r4 + 1
            X.7yb r1 = r9.A08
            int r0 = r1.A00
            if (r4 >= r0) goto L_0x094e
            int[] r1 = r1.A06
            int r0 = r4 * 5
            int r0 = r0 + 4
            r3 = r1[r0]
        L_0x093b:
            r2 = r10
        L_0x093c:
            if (r2 >= r3) goto L_0x08ff
            int r0 = r2 - r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = r9.A0A
            r0 = r0[r2]
            r5.invoke(r1, r0)
            int r2 = r2 + 1
            goto L_0x093c
        L_0x094e:
            int r3 = r1.A02
            goto L_0x093b
        L_0x0951:
            java.util.List r0 = r7.A0m
            X.AnonymousClass7J4.A03(r0, r6, r8)
            X.7AV r0 = r7.A0D
            r0.A0B(r6)
            X.7AV r0 = r7.A0D
            r0.A09()
            goto L_0x08ce
        L_0x0962:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0973
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0973:
            java.lang.Object r3 = r0.A01
            X.6Ej r3 = (X.C98146Ej) r3
            X.54A r3 = (X.AnonymousClass54A) r3
            java.lang.Object r2 = r0.A00
            java.util.Map r2 = (java.util.Map) r2
            r1 = 64
            r0 = 0
            X.C98156Ek.A00(r11, r3, r2, r1, r0)
            goto L_0x004a
        L_0x0985:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0996
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0996:
            java.lang.Object r3 = r0.A00
            X.0YC r3 = (X.AnonymousClass0YC) r3
            java.lang.Object r0 = r0.A01
            X.540 r0 = (X.AnonymousClass540) r0
            X.547 r1 = r0.A06
            float r0 = r1.A01
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            float r0 = r1.A00
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.Integer r0 = X.C18220wO.A0d()
            r3.invoke(r2, r1, r11, r0)
            goto L_0x004a
        L_0x09b5:
            X.8nY r11 = (X.C147188nY) r11
            int r0 = X.AnonymousClass0wJ.A04(r1)
            r1 = r0 & 11
            r0 = 2
            if (r1 != r0) goto L_0x09c6
            boolean r0 = r11.BCM()
            if (r0 != 0) goto L_0x0a62
        L_0x09c6:
            java.lang.String r0 = "getContent"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x09cd:
            float r5 = X.C18240wQ.A00(r11)
            float r4 = X.C18240wQ.A00(r1)
            java.lang.Object r3 = r0.A01
            androidx.compose.material.SwipeableV2State r3 = (androidx.compose.material.SwipeableV2State) r3
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            X.8pE r1 = r3.A08
            r1.CrC(r2)
            java.lang.Object r0 = r0.A00
            X.0Ma r0 = (X.C04040Ma) r0
            r0.A00 = r5
            X.8pE r0 = r3.A07
            X.C147368pE.A02(r0, r4)
            goto L_0x004a
        L_0x09ef:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r1)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0a00
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x0a62
        L_0x0a00:
            java.lang.Object r2 = r0.A00
            X.6rp r2 = (X.C113626rp) r2
            X.0ZU r1 = r2.A01
            java.lang.Object r7 = r1.invoke()
            X.8p8 r7 = (X.C147308p8) r7
            java.util.Map r1 = r7.Aqt()
            java.lang.Object r5 = r0.A01
            X.6lI r5 = (X.C110206lI) r5
            java.lang.Object r4 = r5.A02
            java.lang.Number r1 = X.C86124wJ.A0j(r4, r1)
            if (r1 == 0) goto L_0x0a57
            int r6 = r1.intValue()
            X.8pE r0 = r5.A01
            r0.CrC(r1)
        L_0x0a25:
            r0 = -715770513(0xffffffffd556356f, float:-1.47203115E13)
            r11.Cvb(r0)
            int r0 = r7.getItemCount()
            if (r6 >= r0) goto L_0x0a4a
            java.lang.Object r3 = r7.Aql(r6)
            boolean r0 = X.C04220Ms.A0I(r3, r4)
            if (r0 == 0) goto L_0x0a4a
            X.8jq r2 = r2.A00
            r1 = -1238863364(0xffffffffb62871fc, float:-2.5100298E-6)
            r0 = 3
            X.8sI r1 = X.AnonymousClass7JR.A02(r11, r7, r6, r0, r1)
            r0 = 568(0x238, float:7.96E-43)
            r2.A4s(r11, r3, r1, r0)
        L_0x0a4a:
            X.AnonymousClass7W3.A0y(r11)
            r0 = 3
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r0 = X.C86154wM.A0z(r5, r0)
            X.AnonymousClass7K5.A04(r11, r4, r0)
            goto L_0x004a
        L_0x0a57:
            X.8pE r0 = r5.A01
            java.lang.Object r0 = r0.getValue()
            int r6 = X.AnonymousClass0wJ.A04(r0)
            goto L_0x0a25
        L_0x0a62:
            r11.CuJ()
            goto L_0x004a
        L_0x0a67:
            float r3 = X.C18240wQ.A00(r11)
            java.lang.Number r1 = (java.lang.Number) r1
            r1.floatValue()
            java.lang.Object r2 = r0.A01
            X.0Ma r2 = (X.C04040Ma) r2
            float r1 = r2.A00
            java.lang.Object r0 = r0.A00
            X.8fT r0 = (X.C142718fT) r0
            float r3 = r3 - r1
            float r0 = r0.CgC(r3)
            float r1 = r1 + r0
            r2.A00 = r1
            goto L_0x004a
        L_0x0a84:
            X.7Es r11 = (X.C121197Es) r11
            X.7KC r1 = (X.AnonymousClass7KC) r1
            long r2 = r1.A00
            r1 = 0
            X.C04220Ms.A0B(r11, r1)
            java.lang.Object r1 = r0.A01
            X.6rr r1 = (X.C113636rr) r1
            X.C98216Eq.A00(r11, r1)
            r11.A01()
            java.lang.Object r0 = r0.A00
            X.0MQ r0 = (X.AnonymousClass0MQ) r0
            r0.A00 = r2
            goto L_0x004a
        L_0x0aa0:
            X.C2c r11 = (X.C21827C2c) r11
            X.BKG r1 = (X.BKG) r1
            boolean r3 = X.AnonymousClass0wJ.A1Z(r11, r1)
            java.lang.Object r6 = r0.A01
            X.Awi r6 = (X.C19461Awi) r6
            java.lang.String r2 = r6.A0B
            X.C2o r4 = r6.A05
            int r5 = X.BL6.A00(r4, r2)
            if (r5 != r3) goto L_0x0adb
            X.C2u r3 = r6.A02
            X.8jC r2 = r3.B99()
            X.C24 r13 = r2.getScrollingViewProxy()
            java.lang.Object r2 = r0.A00
            X.BKU r2 = (X.BKU) r2
            X.Agl r12 = X.C19461Awi.A02(r6, r2)
            X.Byu r10 = r3.BHI()
            com.instagram.service.session.UserSession r0 = r6.A09
            X.BL6 r6 = new X.BL6
            r7 = r6
            r8 = r4
            r9 = r2
            r14 = r1
            r15 = r0
            r16 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r6
        L_0x0adb:
            com.instagram.service.session.UserSession r1 = r6.A09
            X.C2u r0 = r6.A02
            X.Byu r9 = r0.BHI()
            r15 = 2
            r8 = 0
            X.BL6 r6 = new X.BL6
            r7 = r4
            r10 = r11
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r6
        L_0x0af1:
            int r3 = X.AnonymousClass0wJ.A04(r11)
            r2 = 1
            X.C04220Ms.A0B(r1, r2)
            java.lang.Object r2 = r0.A01
            X.Dd3 r2 = (X.C24968Dd3) r2
            X.Jqm r2 = r2.A00
            if (r2 == 0) goto L_0x0b04
            r2.A06()
        L_0x0b04:
            java.lang.Object r2 = r0.A00
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r2.invoke(r0, r1)
            return r6
        L_0x0b11:
            X.8nY r9 = X.C86104wH.A0H(r11, r1)
            r1 = 935231726(0x37be80ee, float:2.2709803E-5)
            r9.Cvb(r1)
            java.lang.Object r10 = r0.A01
            X.7DS[] r10 = (X.AnonymousClass7DS[]) r10
            java.lang.Object r11 = r0.A00
            X.8s3 r11 = (X.AnonymousClass8s3) r11
            r0 = 721128344(0x2afb8b98, float:4.468342E-13)
            r9.Cvb(r0)
            X.MVu r1 = X.C41622MVu.A02
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>"
            X.C04220Ms.A0C(r1, r0)
            X.MVz r8 = new X.MVz
            r8.<init>(r1)
            r7 = 0
            int r6 = r10.length
        L_0x0b37:
            if (r7 >= r6) goto L_0x0ba1
            r2 = r10[r7]
            r0 = 680853375(0x2894ff7f, float:1.6542105E-14)
            r9.Cvb(r0)
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0b51
            X.6b9 r1 = r2.A00
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            boolean r0 = r11.containsKey(r1)
            if (r0 != 0) goto L_0x0b6f
        L_0x0b51:
            X.6b9 r5 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"
            X.C04220Ms.A0C(r5, r0)
            java.lang.Object r4 = r2.A01
            boolean r0 = r5 instanceof X.AnonymousClass533
            if (r0 == 0) goto L_0x0b75
            r0 = -1121811719(0xffffffffbd2282f9, float:-0.039675687)
            r9.Cvb(r0)
            X.7WV r1 = new X.7WV
            r1.<init>(r4)
            X.AnonymousClass7W3.A0y(r9)
        L_0x0b6c:
            r8.put(r5, r1)
        L_0x0b6f:
            X.AnonymousClass7W3.A0y(r9)
            int r7 = r7 + 1
            goto L_0x0b37
        L_0x0b75:
            r3 = r5
            X.532 r3 = (X.AnonymousClass532) r3
            r0 = -84026900(0xfffffffffafdd9ec, float:-6.5903554E35)
            r9.Cvb(r0)
            X.7W3 r2 = X.C147188nY.A0Y(r9)
            java.lang.Object r1 = r2.A13()
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x0b94
            X.8fh r0 = r3.A00
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r1.<init>(r0, r4)
            r2.A14(r1)
        L_0x0b94:
            r0 = 0
            X.AnonymousClass7W3.A0w(r2, r0)
            X.8pE r1 = (X.C147368pE) r1
            r1.CrC(r4)
            X.AnonymousClass7W3.A0w(r2, r0)
            goto L_0x0b6c
        L_0x0ba1:
            X.8s3 r6 = r8.AB2()
            X.7W3 r9 = (X.AnonymousClass7W3) r9
            X.AnonymousClass7W3.A0g(r9)
            return r6
        L_0x0bab:
            X.8pc r11 = (X.C147608pc) r11
            androidx.compose.ui.unit.Constraints r1 = (androidx.compose.ui.unit.Constraints) r1
            long r2 = r1.A00
            r1 = 0
            X.C04220Ms.A0B(r11, r1)
            java.lang.Object r1 = r0.A00
            X.6rp r1 = (X.C113626rp) r1
            X.7Xx r4 = new X.7Xx
            r4.<init>(r1, r11)
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            androidx.compose.ui.unit.Constraints r0 = new androidx.compose.ui.unit.Constraints
            r0.<init>(r2)
            java.lang.Object r6 = r1.invoke(r4, r0)
            return r6
        L_0x0bcc:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0bd3:
            X.C86124wJ.A19()
            r0 = 0
            throw r0
        L_0x0bd8:
            java.lang.String r0 = "No nodes can be emitted before calling dactivateToEndGroup"
            X.AnonymousClass7J4.A02(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape48S0200000_I2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
