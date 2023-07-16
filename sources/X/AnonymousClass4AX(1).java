package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxAListenerShape459S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.facebook.redex.IDxListenerShape824S0100000_1_I2;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110;

/* renamed from: X.4AX  reason: invalid class name */
public final class AnonymousClass4AX implements C84534tJ, C82394pY {
    public static final C63273h9 A0J = new C63273h9();
    public int A00;
    public int A01;
    public C82434pc A02;
    public C67233zC A03;
    public AnonymousClass49N A04;
    public AnonymousClass3H0 A05;
    public AnonymousClass4MC A06 = null;
    public AnonymousClass4MC A07;
    public Integer A08;
    public boolean A09;
    public AnonymousClass228 A0A;
    public final Context A0B;
    public final Resources A0C;
    public final FragmentActivity A0D;
    public final UserSession A0E;
    public final C57333Aq A0F;
    public final C23411dm A0G;
    public final C83964sH A0H;
    public final List A0I = AnonymousClass0wJ.A0v();

    private void A00() {
        AnonymousClass228 r1 = this.A0A;
        if (r1 == AnonymousClass228.ALL_SETTINGS || r1 == AnonymousClass228.CAMERA_SETTINGS) {
            List list = this.A0I;
            AnonymousClass4MC.A08(new IDxCListenerShape267S0100000_1_I2(this, 43), list, 2131834295, C18190wL.A1X(C28161tl.A04(this.A0E), "auto_save_reel_media_to_gallery"));
            list.add(new C63293hC(2131834294));
        }
        UserSession userSession = this.A0E;
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36327189871863707L)) {
            ReelAutoArchiveSettingStr B6D = AnonymousClass0wJ.A0Y(userSession).A05.B6D();
            if (B6D == null) {
                B6D = ReelAutoArchiveSettingStr.UNSET;
            }
            boolean A1Y = C18240wQ.A1Y(B6D, ReelAutoArchiveSettingStr.OFF);
            List list2 = this.A0I;
            AnonymousClass4MC.A08(new IDxCListenerShape267S0100000_1_I2(this, 42), list2, 2131834293, A1Y);
            A02(this.A0B, 2131834292, list2);
        }
    }

    private void A01() {
        C23411dm r3 = this.A0G;
        UserSession userSession = this.A0E;
        C32165H8c A022 = C19566AyS.A02(userSession);
        C63873iU.A0E(A022, this, 129);
        r3.schedule(A022);
        C04220Ms.A0B(userSession, 0);
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("archive/live/live_archive_settings/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, C21631Ro.class, C59313Ki.class);
        C63873iU.A0E(A0T, this, 130);
        r3.schedule(A0T);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x026f, code lost:
        if (X.C61453Tm.A00(r6) == false) goto L_0x0271;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass4AX r21) {
        /*
            r9 = r21
            java.util.List r8 = r9.A0I
            r8.clear()
            X.3h9 r7 = A0J
            r8.add(r7)
            X.228 r1 = r9.A0A
            X.228 r0 = X.AnonymousClass228.AUTO_SAVE_SETTINGS_ONLY
            if (r1 != r0) goto L_0x0016
            r9.A00()
        L_0x0015:
            return
        L_0x0016:
            com.instagram.service.session.UserSession r6 = r9.A0E
            r5 = 0
            X.C04220Ms.A0B(r6, r5)
            X.0Ok r10 = X.C06810aP.A01
            X.MeW r0 = X.C18240wQ.A0W(r6, r10)
            java.lang.Boolean r0 = r0.BYR()
            if (r0 == 0) goto L_0x0053
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0053
            r3 = 2131835787(0x7f113b8b, float:1.9304722E38)
            X.3H0 r0 = r9.A05
            X.0Oa r0 = r0.A01
            java.lang.Object r0 = X.C18180wK.A0d(r0)
            boolean r2 = X.AnonymousClass0wJ.A1X(r0)
            r1 = 40
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((X.AnonymousClass4AX) r9, (int) r1)
            X.4MC r1 = X.AnonymousClass4MC.A03(r0, r3, r2)
            r0 = 2131835788(0x7f113b8c, float:1.9304724E38)
            r1.A02 = r0
            r8.add(r1)
            r8.add(r7)
        L_0x0053:
            r0 = 2131834318(0x7f1135ce, float:1.9301743E38)
            X.C63613hu.A04(r8, r0)
            r0 = 2131834316(0x7f1135cc, float:1.9301739E38)
            X.C63613hu.A04(r8, r0)
            r0 = 71
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r12 = X.C18210wN.A0H(r9, r0)
            java.lang.Integer r1 = r9.A08
            java.lang.Integer r13 = X.AnonymousClass006.A01
            r4 = 1
            if (r1 == r13) goto L_0x0370
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 != r0) goto L_0x0369
            android.content.Context r1 = r9.A0B
            r0 = 2131831772(0x7f112bdc, float:1.929658E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0079:
            X.4MA r0 = X.AnonymousClass4MA.A01(r12, r0)
        L_0x007d:
            r8.add(r0)
            android.content.Context r3 = r9.A0B
            int r1 = X.C04000Lv.A00(r3)
            r0 = 2011(0x7db, float:2.818E-42)
            if (r1 < r0) goto L_0x0090
            r0 = 2131834314(0x7f1135ca, float:1.9301735E38)
            A02(r3, r0, r8)
        L_0x0090:
            r0 = 2131834317(0x7f1135cd, float:1.930174E38)
            X.C63613hu.A04(r8, r0)
            r0 = 72
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r11 = X.C18210wN.A0H(r9, r0)
            java.lang.Integer r1 = r9.A08
            if (r1 == r13) goto L_0x0358
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 == r0) goto L_0x0358
            X.39A r0 = new X.39A
            r0.<init>(r12)
        L_0x00a9:
            r8.add(r0)
            r0 = 2131834313(0x7f1135c9, float:1.9301733E38)
            A02(r3, r0, r8)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36311277018022396(0x8100ea000001fc, double:3.026736027749425E-306)
            boolean r0 = X.C63803iN.A0E(r2, r6, r0)
            if (r0 == 0) goto L_0x0118
            r0 = 2131835596(0x7f113acc, float:1.9304335E38)
            X.C63613hu.A04(r8, r0)
            X.1tl r0 = X.AnonymousClass3WS.A01(r6)
            java.lang.String r1 = "reel"
            java.util.Set r0 = r0.A0H(r1)
            java.util.ArrayList r12 = X.C18200wM.A0s(r0)
            X.1tl r0 = X.AnonymousClass3WS.A01(r6)
            boolean r11 = r0.A0R(r1)
            if (r11 == 0) goto L_0x034f
            android.content.res.Resources r14 = r9.A0C
            r13 = 2131689684(0x7f0f00d4, float:1.900839E38)
            int r1 = r12.size()
            int r0 = r12.size()
            java.lang.Object[] r0 = X.C18210wN.A1X(r0)
            java.lang.String r13 = r14.getQuantityString(r13, r1, r0)
        L_0x00f2:
            r1 = 2
            com.facebook.redex.IDxCListenerShape4S0210000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape4S0210000_1_I2
            r0.<init>(r1, r12, r9, r11)
            X.4MA r0 = X.AnonymousClass4MA.A01(r0, r13)
            r8.add(r0)
            r0 = 2131836288(0x7f113d80, float:1.9305739E38)
            A02(r3, r0, r8)
            if (r11 == 0) goto L_0x0118
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0118
            androidx.fragment.app.FragmentActivity r1 = r9.A0D
            r0 = 144(0x90, float:2.02E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = X.C18220wO.A0O(r9, r0)
            X.AnonymousClass3OS.A00(r1, r0)
        L_0x0118:
            r8.add(r7)
            r0 = 2131834302(0x7f1135be, float:1.930171E38)
            X.C63613hu.A04(r8, r0)
            r0 = 2131834301(0x7f1135bd, float:1.9301708E38)
            X.C63613hu.A04(r8, r0)
            r0 = 2131834296(0x7f1135b8, float:1.9301698E38)
            A02(r3, r0, r8)
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            X.9tz r0 = X.C18200wM.A0a(r6, r10)
            X.9tz r11 = X.C169839tz.PrivacyStatusPrivate
            java.lang.String r13 = "anyone"
            if (r0 != r11) goto L_0x033e
            r0 = 2131834300(0x7f1135bc, float:1.9301706E38)
            java.lang.String r0 = r3.getString(r0)
            X.C62563aI.A01(r13, r0, r12)
            java.lang.String r1 = "following"
            r0 = 2131834299(0x7f1135bb, float:1.9301704E38)
        L_0x014a:
            java.lang.String r0 = r3.getString(r0)
            X.C62563aI.A01(r1, r0, r12)
            java.lang.String r1 = "off"
            r0 = 2131831950(0x7f112c8e, float:1.929694E38)
            java.lang.String r0 = r3.getString(r0)
            X.C62563aI.A01(r1, r0, r12)
            X.1tl r1 = X.AnonymousClass3WS.A01(r6)
            java.lang.String r0 = "reel_message_prefs"
            java.lang.String r13 = X.C28161tl.A06(r1, r0, r13)
            r0 = 4
            com.facebook.redex.IDxCListenerShape512S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape512S0100000_1_I2
            r1.<init>(r9, r0)
            X.3Sw r0 = new X.3Sw
            r0.<init>(r1, r13, r12)
            r8.add(r0)
            r8.add(r7)
            r0 = 2131821668(0x7f110464, float:1.9276086E38)
            X.C63613hu.A04(r8, r0)
            r9.A00()
            r8.add(r7)
            r0 = 36310405139660850(0x81001f00000032, double:3.026184648362811E-306)
            boolean r0 = X.C63803iN.A0E(r2, r6, r0)
            if (r0 == 0) goto L_0x01ad
            r0 = 2131834307(0x7f1135c3, float:1.930172E38)
            java.lang.String r0 = r3.getString(r0)
            X.C63613hu.A02(r0, r8)
            r12 = 2131832934(0x7f113066, float:1.9298936E38)
            r0 = 73
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r9, r0)
            X.3aM r0 = new X.3aM
            r0.<init>(r1, r12)
            r8.add(r0)
            r8.add(r7)
        L_0x01ad:
            int r15 = r8.size()
            X.9tz r0 = X.C18200wM.A0a(r6, r10)
            if (r0 != r11) goto L_0x01df
            r0 = 36319184052818909(0x81081b000013dd, double:3.0317364683938134E-306)
            boolean r0 = X.C63803iN.A0E(r2, r6, r0)
            if (r0 == 0) goto L_0x01df
            r13 = 2131834304(0x7f1135c0, float:1.9301715E38)
            android.content.SharedPreferences r1 = X.C28161tl.A04(r6)
            java.lang.String r0 = "allow_story_mention_sharing"
            boolean r12 = r1.getBoolean(r0, r4)
            r1 = 37
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((X.AnonymousClass4AX) r9, (int) r1)
            X.AnonymousClass4MC.A08(r0, r8, r13, r12)
            r0 = 2131834303(0x7f1135bf, float:1.9301713E38)
            A02(r3, r0, r8)
        L_0x01df:
            X.3Aq r13 = r9.A0F
            com.instagram.service.session.UserSession r12 = r13.A02
            X.9tz r0 = X.C18200wM.A0a(r12, r10)
            if (r0 == r11) goto L_0x0224
            X.C04220Ms.A0B(r12, r5)
            r0 = 36319153988047830(0x810814000013d6, double:3.031717455311522E-306)
            boolean r0 = X.C63803iN.A0E(r2, r12, r0)
            if (r0 != 0) goto L_0x0224
            r14 = 2131821294(0x7f1102ee, float:1.9275327E38)
            X.MeW r0 = X.C18240wQ.A0W(r12, r10)
            java.lang.Boolean r0 = r0.Ai5()
            boolean r0 = X.C18210wN.A1T(r0)
            r1 = r0 ^ 1
            r0 = 45
            X.4MC r0 = X.AnonymousClass4MC.A05(r13, r0, r14, r1)
            r8.add(r0)
            com.instagram.user.model.User r0 = r10.A01(r12)
            boolean r1 = r0.A31()
            r0 = 2131821292(0x7f1102ec, float:1.9275323E38)
            if (r1 == 0) goto L_0x0221
            r0 = 2131821293(0x7f1102ed, float:1.9275325E38)
        L_0x0221:
            A02(r3, r0, r8)
        L_0x0224:
            r0 = 36319153988047830(0x810814000013d6, double:3.031717455311522E-306)
            boolean r0 = X.C63803iN.A0E(r2, r6, r0)
            if (r0 != 0) goto L_0x0255
            r13 = 2131834291(0x7f1135b3, float:1.9301688E38)
            android.content.SharedPreferences r1 = X.C28161tl.A04(r6)
            java.lang.String r0 = "allow_story_reshare"
            boolean r12 = r1.getBoolean(r0, r4)
            r1 = 41
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((X.AnonymousClass4AX) r9, (int) r1)
            X.AnonymousClass4MC.A08(r0, r8, r13, r12)
            X.9tz r1 = X.C18200wM.A0a(r6, r10)
            r0 = 2131834309(0x7f1135c5, float:1.9301725E38)
            if (r1 != r11) goto L_0x0252
            r0 = 2131834308(0x7f1135c4, float:1.9301723E38)
        L_0x0252:
            A02(r3, r0, r8)
        L_0x0255:
            boolean r0 = X.C67373zR.A06(r6)
            if (r0 == 0) goto L_0x028a
            boolean r0 = X.C67253zE.A02(r6)
            if (r0 != 0) goto L_0x028a
            r11 = 2131836198(0x7f113d26, float:1.9305556E38)
            boolean r0 = X.C67373zR.A05(r6)
            if (r0 == 0) goto L_0x0271
            boolean r0 = X.C61453Tm.A00(r6)
            r10 = 1
            if (r0 != 0) goto L_0x0272
        L_0x0271:
            r10 = 0
        L_0x0272:
            r0 = 38
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r1.<init>((X.AnonymousClass4AX) r9, (int) r0)
            r0 = 22
            X.4MC r0 = X.AnonymousClass4MC.A04(r1, r9, r0, r11, r10)
            r9.A07 = r0
            r8.add(r0)
            r0 = 2131834311(0x7f1135c7, float:1.9301729E38)
            A02(r3, r0, r8)
        L_0x028a:
            boolean r0 = X.C67373zR.A0H(r6)
            if (r0 == 0) goto L_0x02dc
            r11 = 2131836286(0x7f113d7e, float:1.9305735E38)
            android.content.SharedPreferences r1 = X.AnonymousClass3Zu.A02(r6)
            java.lang.String r0 = "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS"
            boolean r10 = r1.getBoolean(r0, r5)
            r1 = 39
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((X.AnonymousClass4AX) r9, (int) r1)
            X.4MC r0 = X.AnonymousClass4MC.A03(r0, r11, r10)
            r9.A06 = r0
            r8.add(r0)
            r0 = 2131836285(0x7f113d7d, float:1.9305732E38)
            A02(r3, r0, r8)
            X.2AC r17 = X.AnonymousClass2AC.A0T
            X.2AD r18 = X.AnonymousClass2AD.A04
            X.14U r10 = X.AnonymousClass14U.A00()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_account_linked"
            r10.A07(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "newly_linked_accounts"
            r10.A07(r0, r1)
            X.49N r0 = new X.49N
            r19 = r10
            r20 = r6
            r21 = r5
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r9.A04 = r0
        L_0x02dc:
            int r0 = r8.size()
            int r0 = r0 - r15
            if (r0 <= 0) goto L_0x02f7
            int r10 = r8.size()
            int r10 = r10 - r0
            r0 = 2131834310(0x7f1135c6, float:1.9301727E38)
            java.lang.String r1 = r3.getString(r0)
            X.3hu r0 = new X.3hu
            r0.<init>((java.lang.CharSequence) r1)
            r8.add(r10, r0)
        L_0x02f7:
            r0 = 36311977097691958(0x81018d00000336, double:3.0271787609514506E-306)
            boolean r0 = X.C63803iN.A0E(r2, r6, r0)
            if (r0 == 0) goto L_0x0328
            r8.add(r7)
            r0 = 2131834315(0x7f1135cb, float:1.9301737E38)
            X.C63613hu.A04(r8, r0)
            r7 = 2131836206(0x7f113d2e, float:1.9305572E38)
            android.content.SharedPreferences r1 = X.C28161tl.A04(r6)
            java.lang.String r0 = "generate_captions_for_story_videos"
            boolean r2 = r1.getBoolean(r0, r5)
            r1 = 36
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((X.AnonymousClass4AX) r9, (int) r1)
            X.AnonymousClass4MC.A08(r0, r8, r7, r2)
            r0 = 2131836207(0x7f113d2f, float:1.9305574E38)
            A02(r3, r0, r8)
        L_0x0328:
            int r0 = r8.size()
            int r0 = r0 - r4
            java.lang.Object r0 = r8.get(r0)
            boolean r0 = r0 instanceof X.C63273h9
            if (r0 == 0) goto L_0x0015
            int r0 = r8.size()
            int r0 = r0 - r4
            r8.remove(r0)
            return
        L_0x033e:
            r0 = 2131834297(0x7f1135b9, float:1.93017E38)
            java.lang.String r0 = r3.getString(r0)
            X.C62563aI.A01(r13, r0, r12)
            java.lang.String r1 = "following"
            r0 = 2131834298(0x7f1135ba, float:1.9301702E38)
            goto L_0x014a
        L_0x034f:
            r0 = 2131835595(0x7f113acb, float:1.9304333E38)
            java.lang.String r13 = r3.getString(r0)
            goto L_0x00f2
        L_0x0358:
            android.content.res.Resources r2 = r9.A0C
            r1 = 2131689796(0x7f0f0144, float:1.9008617E38)
            int r0 = r9.A01
            java.lang.String r0 = X.AnonymousClass0wJ.A0m(r2, r0, r1)
            X.4MA r0 = X.AnonymousClass4MA.A01(r11, r0)
            goto L_0x00a9
        L_0x0369:
            X.39A r0 = new X.39A
            r0.<init>(r12)
            goto L_0x007d
        L_0x0370:
            android.content.res.Resources r2 = r9.A0C
            r1 = 2131689796(0x7f0f0144, float:1.9008617E38)
            int r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass0wJ.A0m(r2, r0, r1)
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4AX.A03(X.4AX):void");
    }

    public final List AvI() {
        return this.A0I;
    }

    public final int BH6() {
        if (this.A0A == AnonymousClass228.AUTO_SAVE_SETTINGS_ONLY) {
            return 2131835530;
        }
        return 2131836287;
    }

    public final boolean Csv() {
        return C18240wQ.A1Y(this.A0A, AnonymousClass228.CAMERA_SETTINGS);
    }

    public final String getModuleName() {
        int ordinal = this.A0A.ordinal();
        if (ordinal == 0) {
            return "reel_settings";
        }
        if (ordinal == 1) {
            return "reel_auto_save_settings";
        }
        if (ordinal == 2) {
            return "stories_camera_settings";
        }
        throw C18190wL.A0a("invalid_settings_module_name");
    }

    public final void onDestroy() {
        AnonymousClass3LY.A00(this.A0E).A02(this, C688945w.class);
    }

    public AnonymousClass4AX(Context context, Resources resources, FragmentActivity fragmentActivity, AnonymousClass228 r7, UserSession userSession, C23411dm r9) {
        Integer num = AnonymousClass006.A00;
        this.A08 = num;
        this.A0E = userSession;
        this.A0D = fragmentActivity;
        this.A0G = r9;
        this.A0B = context;
        this.A0C = resources;
        this.A0A = r7;
        this.A09 = C18240wQ.A1S(r9.requireArguments(), "ReelSettingsFragment.ARGUMENTS_SEND_CHECK_PENDING_ARCHIVE_FLAG");
        this.A0F = new C57333Aq(r9, r9);
        this.A0H = new IDxAListenerShape459S0100000_1_I2(this, 12);
        this.A03 = C60303Om.A01(userSession, new IDxListenerShape824S0100000_1_I2(this, 1));
        this.A08 = num;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass3H0 r0 = (AnonymousClass3H0) userSession.A01(AnonymousClass3H0.class, new KtLambdaShape130S0100000_I2_110(userSession, 40));
        this.A05 = r0;
        C18190wL.A1C(r9, C18230wP.A0J(r0.A01), this, 44);
        AnonymousClass3LY.A00(userSession).A01(this, C688945w.class);
        A03(this);
        A01();
    }

    public static void A02(Context context, int i, List list) {
        list.add(new C63293hC((CharSequence) context.getString(i)));
    }

    public static /* synthetic */ void A04(AnonymousClass4AX r0) {
        A03(r0);
        C82434pc r02 = r0.A02;
        if (r02 != null) {
            r02.C78();
        }
    }

    public static void A05(AnonymousClass4AX r4, Integer num, boolean z) {
        AnonymousClass49N r3;
        if (num.intValue() == 0) {
            r4.A03.A04(num, "ig_settings", z);
            r4.A07.A0C = z;
            C67373zR.A03(r4.A0G, r4.A0E, z);
        } else if (!z || AnonymousClass3Zu.A02(r4.A0E).getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS_EDUCATION_HAS_SHOWN", false) || (r3 = r4.A04) == null) {
            r4.A03.A04(num, "ig_settings", z);
        } else {
            r3.A02(r4.A0G.requireActivity(), r4.A0B, new AnonymousClass4L6(r4, num));
        }
        A03(r4);
        C82434pc r0 = r4.A02;
        if (r0 != null) {
            r0.C78();
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = C14030oh.A03(1536116216);
        int A033 = C14030oh.A03(2056272421);
        if (!this.A0G.mDetached) {
            A01();
        }
        C14030oh.A0A(879175082, A033);
        C14030oh.A0A(-1635916748, A032);
    }

    public final void Cp1(C82434pc r1) {
        this.A02 = r1;
    }
}
