package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxObjectShape119S0200000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.49u  reason: invalid class name and case insensitive filesystem */
public final class C697249u implements AnonymousClass0i1, CallerContextable {
    public static final CallerContext A07 = CallerContext.A00(C697249u.class);
    public static final String __redex_internal_original_name = "StartupManager";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;

    private int A00() {
        String A0C = C63803iN.A0C(AnonymousClass0TJ.A05, this.A06, 36889396795998729L);
        if ("anytime".equalsIgnoreCase(A0C)) {
            return 5;
        }
        if ("low".equalsIgnoreCase(A0C)) {
            return 4;
        }
        return 3;
    }

    private void A02(C83484rS r8) {
        UserSession userSession = this.A06;
        AnonymousClass0TJ r5 = AnonymousClass0TJ.A05;
        int i = 5;
        if (C63803iN.A0E(r5, userSession, 36326562807096979L)) {
            i = 2;
        }
        C25541np r2 = new C25541np(this, i, C63803iN.A0E(r5, userSession, 36326562806900368L), C63803iN.A0E(r5, userSession, 36326562806965905L));
        if (C63803iN.A0E(r5, userSession, 36326562807031442L)) {
            r8.CwT(r2);
        } else {
            r8.CwU(r2);
        }
    }

    public static void A03(C697249u r6) {
        Context context = r6.A05;
        C31152Gh4 A002 = C60833Qr.A00(context).A00("caa_full_test_restarted");
        if (!A002.A0D("caa_triage_oe_group_number")) {
            C31029Gdw A09 = A002.A09();
            UserSession userSession = r6.A06;
            A09.A08("caa_triage_oe_group_number", new JSP(context, userSession).A00(new C212119m(), AnonymousClass0wJ.A1Y(context, userSession)));
            A09.A05();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x037b, code lost:
        if (X.C63173fJ.A05(r2, 18309003201421103L) == false) goto L_0x037d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C697249u r12, boolean r13) {
        /*
            com.instagram.service.session.UserSession r3 = r12.A06
            boolean r0 = r3.hasEnded()
            if (r0 != 0) goto L_0x04da
            boolean r0 = r12.A03
            if (r0 != 0) goto L_0x04da
            r5 = 1
            r12.A03 = r5
            r6 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)
            if (r0 == 0) goto L_0x001f
            r1 = 166658086(0x9ef0026, float:5.7537297E-33)
            java.lang.String r0 = "StartupManager.runJobs"
            X.C13930oX.A01(r0, r1)
        L_0x001f:
            if (r13 == 0) goto L_0x00d7
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)     // Catch:{ all -> 0x04cc }
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = "scheduleNetworkJobs"
            r0 = -1943015948(0xffffffff8c2fedf4, float:-1.3553116E-31)
            X.C13930oX.A01(r1, r0)     // Catch:{ all -> 0x04cc }
        L_0x002f:
            X.4rS r2 = X.GQH.A03     // Catch:{ all -> 0x00bf }
            X.1mw r0 = new X.1mw     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwU(r0)     // Catch:{ all -> 0x00bf }
            X.Cck r0 = new X.Cck     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwT(r0)     // Catch:{ all -> 0x00bf }
            X.1nD r0 = new X.1nD     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwT(r0)     // Catch:{ all -> 0x00bf }
            android.content.Context r0 = r12.A05     // Catch:{ all -> 0x00bf }
            com.instagram.casper.IgSignalsCasper r0 = X.C34622Kg.A00(r0, r3)     // Catch:{ all -> 0x00bf }
            X.DRg r0 = r0.A0C     // Catch:{ all -> 0x00bf }
            com.instagram.service.session.UserSession r10 = r0.A00     // Catch:{ all -> 0x00bf }
            X.0TJ r9 = X.AnonymousClass0TJ.A05     // Catch:{ all -> 0x00bf }
            r0 = 36320846205425947(0x81099e0004191b, double:3.0327876203954556E-306)
            boolean r8 = X.C63803iN.A0E(r9, r10, r0)     // Catch:{ all -> 0x00bf }
            r0 = 36320846205753628(0x81099e0009191c, double:3.0327876206026824E-306)
            boolean r4 = X.C63803iN.A0E(r9, r10, r0)     // Catch:{ all -> 0x00bf }
            r0 = 36320846206015775(0x81099e000d191f, double:3.032787620768465E-306)
            boolean r0 = X.C63803iN.A0E(r9, r10, r0)     // Catch:{ all -> 0x00bf }
            if (r8 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x0076
            if (r0 == 0) goto L_0x007e
        L_0x0076:
            X.1nM r0 = new X.1nM     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwT(r0)     // Catch:{ all -> 0x00bf }
        L_0x007e:
            X.1nX r0 = new X.1nX     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwU(r0)     // Catch:{ all -> 0x00bf }
            X.1nd r0 = new X.1nd     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwU(r0)     // Catch:{ all -> 0x00bf }
            X.IkP r0 = new X.IkP     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwT(r0)     // Catch:{ all -> 0x00bf }
            X.1nq r0 = new X.1nq     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwU(r0)     // Catch:{ all -> 0x00bf }
            X.1nr r0 = new X.1nr     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwT(r0)     // Catch:{ all -> 0x00bf }
            X.IkL r0 = new X.IkL     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwT(r0)     // Catch:{ all -> 0x00bf }
            X.1mr r0 = new X.1mr     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwT(r0)     // Catch:{ all -> 0x00bf }
            X.1ms r0 = new X.1ms     // Catch:{ all -> 0x00bf }
            r0.<init>(r12)     // Catch:{ all -> 0x00bf }
            r2.CwT(r0)     // Catch:{ all -> 0x00bf }
            goto L_0x00cb
        L_0x00bf:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)     // Catch:{ all -> 0x04cc }
            if (r0 == 0) goto L_0x04cb
            r0 = -906186335(0xffffffffc9fcb1a1, float:-2070068.1)
            goto L_0x04c8
        L_0x00cb:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)     // Catch:{ all -> 0x04cc }
            if (r0 == 0) goto L_0x00d7
            r0 = 1723040653(0x66b3838d, float:4.2386514E23)
            X.C13930oX.A00(r0)     // Catch:{ all -> 0x04cc }
        L_0x00d7:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)     // Catch:{ all -> 0x04cc }
            if (r0 == 0) goto L_0x00e5
            java.lang.String r1 = "scheduleStartupJobs"
            r0 = -530183289(0xffffffffe0660b87, float:-6.6305965E19)
            X.C13930oX.A01(r1, r0)     // Catch:{ all -> 0x04cc }
        L_0x00e5:
            X.4rS r4 = X.GQH.A03     // Catch:{ all -> 0x04be }
            X.1mu r0 = new X.1mu     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwU(r0)     // Catch:{ all -> 0x04be }
            X.0TJ r2 = X.AnonymousClass0TJ.A05     // Catch:{ all -> 0x04be }
            r0 = 36326562806834831(0x810ed10003268f, double:3.03640282214534E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x00ff
            r12.A02(r4)     // Catch:{ all -> 0x04be }
        L_0x00ff:
            r0 = 36320850500262178(0x81099f00021922, double:3.032790336467182E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x0112
            X.1mv r0 = new X.1mv     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x0112:
            r0 = 36320850500327715(0x81099f00031923, double:3.032790336508628E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x0127
            X.4rS r1 = X.GQH.A03     // Catch:{ all -> 0x04be }
            X.1mt r0 = new X.1mt     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r1.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x0127:
            X.4rS r1 = X.GQH.A03     // Catch:{ all -> 0x04be }
            X.61V r0 = new X.61V     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r1.CwT(r0)     // Catch:{ all -> 0x04be }
            X.4rS r1 = X.GQH.A03     // Catch:{ all -> 0x04be }
            X.61W r0 = new X.61W     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r1.CwT(r0)     // Catch:{ all -> 0x04be }
            X.IkM r0 = new X.IkM     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.LY9 r0 = new X.LY9     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.FU4 r0 = new X.FU4     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.61X r0 = new X.61X     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1mx r0 = new X.1mx     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1my r0 = new X.1my     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwU(r0)     // Catch:{ all -> 0x04be }
            X.1mz r0 = new X.1mz     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwU(r0)     // Catch:{ all -> 0x04be }
            X.1n0 r0 = new X.1n0     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwU(r0)     // Catch:{ all -> 0x04be }
            X.1n1 r0 = new X.1n1     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1n2 r0 = new X.1n2     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwU(r0)     // Catch:{ all -> 0x04be }
            X.1n3 r0 = new X.1n3     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwU(r0)     // Catch:{ all -> 0x04be }
            X.1n4 r0 = new X.1n4     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwU(r0)     // Catch:{ all -> 0x04be }
            X.1n5 r0 = new X.1n5     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1n6 r0 = new X.1n6     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1n7 r0 = new X.1n7     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1n8 r0 = new X.1n8     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1n9 r0 = new X.1n9     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nA r0 = new X.1nA     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nB r0 = new X.1nB     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.Ccl r0 = new X.Ccl     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            r0 = 36321030888757719(0x8109c9000019d7, double:3.032904414878128E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x01ee
            X.1nC r0 = new X.1nC     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x01ee:
            X.IkN r0 = new X.IkN     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.IkO r0 = new X.IkO     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nE r0 = new X.1nE     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nF r0 = new X.1nF     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nG r0 = new X.1nG     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nH r0 = new X.1nH     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            r0 = 36326562806703757(0x810ed10001268d, double:3.0364028220624483E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 != 0) goto L_0x0237
            r0 = 36326562806834831(0x810ed10003268f, double:3.03640282214534E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 != 0) goto L_0x0237
            r12.A02(r4)     // Catch:{ all -> 0x04be }
        L_0x0237:
            X.1nI r0 = new X.1nI     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwU(r0)     // Catch:{ all -> 0x04be }
            int r1 = r12.A00()     // Catch:{ all -> 0x04be }
            X.1nJ r0 = new X.1nJ     // Catch:{ all -> 0x04be }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.49q r1 = X.AnonymousClass3Zs.A03(r3)     // Catch:{ all -> 0x04be }
            X.D2R r0 = X.D2R.A2d     // Catch:{ all -> 0x04be }
            android.content.SharedPreferences r8 = r1.A01(r0)     // Catch:{ all -> 0x04be }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04be }
            java.lang.String r1 = r3.getUserId()     // Catch:{ all -> 0x04be }
            java.lang.String r0 = "_pref_prefix_xposting_last_fetched_time_ms"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x04be }
            long r0 = X.C18180wK.A05(r8, r0)     // Catch:{ all -> 0x04be }
            long r10 = r10 - r0
            r8 = 10800000(0xa4cb80, double:5.335909E-317)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0277
            X.1nK r0 = new X.1nK     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x0277:
            X.1nL r0 = new X.1nL     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nN r0 = new X.1nN     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            int r1 = r12.A00()     // Catch:{ all -> 0x04be }
            X.1nO r0 = new X.1nO     // Catch:{ all -> 0x04be }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            int r1 = r12.A00()     // Catch:{ all -> 0x04be }
            X.1nP r0 = new X.1nP     // Catch:{ all -> 0x04be }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            int r8 = r12.A00()     // Catch:{ all -> 0x04be }
            r0 = 18306671036275211(0x4109d200231a0b, double:1.89558053857516E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x02b0
            r8 = 1
            goto L_0x02bc
        L_0x02b0:
            r0 = 18306671035619844(0x4109d200191a04, double:1.8955805383161246E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x02bc
            r8 = 2
        L_0x02bc:
            r0 = 18306671036144137(0x4109d200211a09, double:1.8955805385233528E-307)
            boolean r9 = X.C63173fJ.A05(r2, r0)     // Catch:{ all -> 0x04be }
            r0 = 18306671036209674(0x4109d200221a0a, double:1.8955805385492564E-307)
            boolean r1 = X.C63173fJ.A05(r2, r0)     // Catch:{ all -> 0x04be }
            X.1nQ r0 = new X.1nQ     // Catch:{ all -> 0x04be }
            r0.<init>(r12, r8, r9, r1)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nR r0 = new X.1nR     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            int r8 = r12.A00()     // Catch:{ all -> 0x04be }
            r0 = 18306671036275211(0x4109d200231a0b, double:1.89558053857516E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x02ef
            r8 = 1
            goto L_0x02fb
        L_0x02ef:
            r0 = 18306671035619844(0x4109d200191a04, double:1.8955805383161246E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x02fb
            r8 = 2
        L_0x02fb:
            r0 = 18306671036144137(0x4109d200211a09, double:1.8955805385233528E-307)
            boolean r9 = X.C63173fJ.A05(r2, r0)     // Catch:{ all -> 0x04be }
            r0 = 18306671036209674(0x4109d200221a0a, double:1.8955805385492564E-307)
            boolean r1 = X.C63173fJ.A05(r2, r0)     // Catch:{ all -> 0x04be }
            X.1nS r0 = new X.1nS     // Catch:{ all -> 0x04be }
            r0.<init>(r12, r8, r9, r1)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nT r0 = new X.1nT     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.3Qo r9 = X.C84744tn.A00     // Catch:{ all -> 0x04be }
            r0 = 36327816937089208(0x810ff5000028b8, double:3.037195939168185E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x0351
            r0 = 36609291913925568(0x820ff5000213c0, double:3.215201847928257E-306)
            int r8 = X.C63803iN.A01(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r5 > r8) goto L_0x0339
            r0 = 6
            if (r8 >= r0) goto L_0x0339
            goto L_0x0349
        L_0x0339:
            java.lang.Class r5 = r9.getClass()     // Catch:{ all -> 0x04be }
            java.lang.String r1 = "SHOPS_INTERNAL_QPL_USERFLOW getStartupJobPriority: expected value to be between 1..5 but "
            java.lang.String r0 = " was received."
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r8)     // Catch:{ all -> 0x04be }
            X.AnonymousClass0LU.A01(r5, r0)     // Catch:{ all -> 0x04be }
            r8 = 5
        L_0x0349:
            X.1nU r0 = new X.1nU     // Catch:{ all -> 0x04be }
            r0.<init>(r12, r8)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x0351:
            X.1nV r0 = new X.1nV     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            boolean r0 = X.C63793iM.A02()     // Catch:{ all -> 0x04be }
            if (r0 != 0) goto L_0x037d
            boolean r0 = X.C63793iM.A03()     // Catch:{ all -> 0x04be }
            if (r0 != 0) goto L_0x037d
            boolean r0 = X.C63793iM.A0A(r3)     // Catch:{ all -> 0x04be }
            if (r0 != 0) goto L_0x037d
            boolean r0 = X.C63793iM.A04()     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x037d
            r0 = 18309003201421103(0x410bf100031f2f, double:1.896502332718371E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)     // Catch:{ all -> 0x04be }
            r1 = 1
            if (r0 != 0) goto L_0x037e
        L_0x037d:
            r1 = 2
        L_0x037e:
            X.1nW r0 = new X.1nW     // Catch:{ all -> 0x04be }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nY r0 = new X.1nY     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nZ r0 = new X.1nZ     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1na r0 = new X.1na     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            int r1 = r12.A00()     // Catch:{ all -> 0x04be }
            X.1nb r0 = new X.1nb     // Catch:{ all -> 0x04be }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nc r0 = new X.1nc     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.0TJ r5 = X.AnonymousClass0TJ.A06     // Catch:{ all -> 0x04be }
            r0 = 36321576349604785(0x810a4800001bb1, double:3.0332493665142074E-306)
            boolean r0 = X.C63803iN.A0E(r5, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x03c7
            X.61Y r0 = new X.61Y     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x03c7:
            r0 = 36323676588613624(0x810c3100001ff8, double:3.034577566120381E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x049e
            X.61Z r0 = new X.61Z     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
        L_0x03d7:
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            r0 = 36324398143119845(0x810cd9000021e5, double:3.035033880095582E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x0497
            X.61b r0 = new X.61b     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
        L_0x03ea:
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            r0 = 36322426753129814(0x810b0e00001d56, double:3.033787165127736E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x0400
            X.1ne r0 = new X.1ne     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x0400:
            X.1nf r0 = new X.1nf     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1ng r0 = new X.1ng     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.49L r0 = X.AnonymousClass2MV.A00(r3)     // Catch:{ all -> 0x04be }
            com.instagram.service.session.UserSession r5 = r0.A00     // Catch:{ all -> 0x04be }
            r0 = 36320232025954143(0x81090f0011175f, double:3.0323992108243845E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x0429
            X.1nh r0 = new X.1nh     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x0429:
            int r1 = r12.A00()     // Catch:{ all -> 0x04be }
            X.1ni r0 = new X.1ni     // Catch:{ all -> 0x04be }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.1nj r0 = new X.1nj     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            r0 = 36320871977130345(0x8109a400211969, double:3.032803918525091E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x0450
            X.1nk r0 = new X.1nk     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x0450:
            r0 = 36327722447808634(0x810fdf0000287a, double:3.0371361837666725E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x0463
            X.1nl r0 = new X.1nl     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x0463:
            r0 = 36327722448201855(0x810fdf0006287f, double:3.037136184015347E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            if (r0 == 0) goto L_0x0476
            X.1nm r0 = new X.1nm     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
        L_0x0476:
            X.FU5 r0 = new X.FU5     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            r0 = 36321228457974400(0x8109f7000b1a80, double:3.033029358446305E-306)
            X.C63803iN.A0E(r2, r3, r0)     // Catch:{ all -> 0x04be }
            X.1nn r0 = new X.1nn     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            X.Ccm r0 = new X.Ccm     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            r4.CwT(r0)     // Catch:{ all -> 0x04be }
            goto L_0x04a5
        L_0x0497:
            X.61c r0 = new X.61c     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            goto L_0x03ea
        L_0x049e:
            X.61a r0 = new X.61a     // Catch:{ all -> 0x04be }
            r0.<init>(r12)     // Catch:{ all -> 0x04be }
            goto L_0x03d7
        L_0x04a5:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)     // Catch:{ all -> 0x04cc }
            if (r0 == 0) goto L_0x04b1
            r0 = 1527506004(0x5b0be454, float:3.9376071E16)
            X.C13930oX.A00(r0)     // Catch:{ all -> 0x04cc }
        L_0x04b1:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)
            if (r0 == 0) goto L_0x04da
            r0 = 74979090(0x4781712, float:2.9162853E-36)
            X.C13930oX.A00(r0)
            return
        L_0x04be:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)     // Catch:{ all -> 0x04cc }
            if (r0 == 0) goto L_0x04cb
            r0 = -2107037527(0xffffffff826928a9, float:-1.7129805E-37)
        L_0x04c8:
            X.C13930oX.A00(r0)     // Catch:{ all -> 0x04cc }
        L_0x04cb:
            throw r1     // Catch:{ all -> 0x04cc }
        L_0x04cc:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)
            if (r0 == 0) goto L_0x04d9
            r0 = 1992819192(0x76c801f8, float:2.028319E33)
            X.C13930oX.A00(r0)
        L_0x04d9:
            throw r1
        L_0x04da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C697249u.A04(X.49u, boolean):void");
    }

    public final void A05(boolean z) {
        if (!this.A01) {
            boolean z2 = true;
            this.A01 = true;
            this.A00 = z;
            if (this.A02) {
                if (!C63803iN.A0E(AnonymousClass0TJ.A05, this.A06, 36324338013643188L)) {
                    if (!this.A00 || !this.A04) {
                        z2 = false;
                    }
                    A04(this, z2);
                }
            }
        }
    }

    public final void A06(boolean z) {
        if (!this.A02) {
            boolean z2 = true;
            this.A02 = true;
            this.A04 = z;
            if (this.A01) {
                if (!C63803iN.A0E(AnonymousClass0TJ.A05, this.A06, 36324338013643188L)) {
                    if (!this.A00 || !this.A04) {
                        z2 = false;
                    }
                    A04(this, z2);
                }
            }
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        UserSession userSession = this.A06;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36320850500327715L)) {
            AnonymousClass6HV.A00(this.A05, userSession).onUserSessionWillEnd(z);
        }
    }

    public C697249u(Context context, UserSession userSession) {
        this.A05 = context;
        this.A06 = userSession;
    }

    public static C697249u A01(Context context, UserSession userSession) {
        return (C697249u) userSession.A01(C697249u.class, new IDxObjectShape119S0200000_1_I2(4, context.getApplicationContext(), userSession));
    }
}
