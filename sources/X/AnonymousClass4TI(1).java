package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.4TI  reason: invalid class name */
public abstract class AnonymousClass4TI implements Runnable {
    public long A00;
    public long A01;
    public boolean A02;

    public final long A01() {
        return this.A00;
    }

    public final long A02() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0626, code lost:
        if (X.C63803iN.A0E(r3, r0, 36320012981769857L) == false) goto L_0x0628;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.AnonymousClass1Ub
            if (r0 == 0) goto L_0x0045
            r5 = r13
            X.1Ub r5 = (X.AnonymousClass1Ub) r5
            X.1Ud r4 = r5.A01
            X.0i6 r3 = r4.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36315391597152802(0x8104a800070a22, double:3.029338104159574E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0044
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0044
            r0 = 1
            r5.A00 = r0
            X.0i6 r0 = r4.A00
            X.C04220Ms.A06(r0)
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r0 = "app_reliability/push_blocking/"
            X.C18220wO.A1K(r2, r0)
            java.lang.Class<X.1SV> r1 = X.AnonymousClass1SV.class
            java.lang.Class<X.3OD> r0 = X.AnonymousClass3OD.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 6
            com.instagram.common.api.base.IDxACallbackShape44S0000000_1_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape44S0000000_1_I2
            r0.<init>(r1)
            r2.A00 = r0
            X.C31155GhB.A03(r2)
        L_0x0044:
            return
        L_0x0045:
            boolean r0 = r13 instanceof X.AnonymousClass1US
            if (r0 == 0) goto L_0x0057
            r0 = 0
            com.facebook.redex.IDxConsumerShape376S0100000_1_I2 r2 = new com.facebook.redex.IDxConsumerShape376S0100000_1_I2
            r2.<init>(r13, r0)
            java.lang.String r1 = "update_push_token"
            java.util.Map r0 = X.C60683Qc.A00
            r0.put(r1, r2)
            return
        L_0x0057:
            boolean r0 = r13 instanceof X.AnonymousClass1UW
            if (r0 == 0) goto L_0x00ce
            r0 = r13
            X.1UW r0 = (X.AnonymousClass1UW) r0
            android.content.Context r9 = r0.A00
            X.0f3 r0 = X.AnonymousClass0f3.A01
            if (r0 != 0) goto L_0x006b
            X.0f3 r0 = new X.0f3
            r0.<init>(r9)
            X.AnonymousClass0f3.A01 = r0
        L_0x006b:
            android.content.Context r1 = r9.getApplicationContext()
            X.GUJ r0 = new X.GUJ
            r0.<init>(r1)
            X.GUJ.A02 = r0
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 18862667435409531(0x43037f0001007b, double:2.1153395145941243E-307)
            java.lang.String r8 = X.C63173fJ.A04(r4, r0)
            X.3YE[] r7 = X.AnonymousClass3YE.A01(r8)
            r6 = 0
            X.0sT[] r5 = new X.C16090sT[r6]
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r3 = ""
            java.lang.Class<X.0sU> r2 = X.C16100sU.class
            monitor-enter(r2)
            X.0IZ r0 = new X.0IZ     // Catch:{ all -> 0x0739 }
            r0.<init>(r1, r5, r7)     // Catch:{ all -> 0x0739 }
            X.C16100sU.A00 = r0     // Catch:{ all -> 0x0739 }
            java.lang.String r0 = "com.facebook.secure.switchoff"
            android.content.SharedPreferences r0 = r9.getSharedPreferences(r0, r6)     // Catch:{ all -> 0x0739 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0739 }
            java.lang.String r0 = "last_criteria"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r3)     // Catch:{ all -> 0x0739 }
            java.lang.String r0 = "last_custom_config"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r8)     // Catch:{ all -> 0x0739 }
            java.lang.String r0 = "last_deeplink_config"
            X.C18180wK.A0v(r1, r0, r3)     // Catch:{ all -> 0x0739 }
            monitor-exit(r2)
            r0 = 18299717482055476(0x41037f00020734, double:1.8928321287699877E-307)
            boolean r2 = X.C63173fJ.A05(r4, r0)
            X.47b r0 = X.AnonymousClass47b.A01
            if (r0 != 0) goto L_0x0044
            X.47b r1 = new X.47b
            r1.<init>(r2)
            X.AnonymousClass47b.A01 = r1
            X.0iH r0 = X.C10410iI.A00
            r0.A00(r1)
            return
        L_0x00ce:
            boolean r0 = r13 instanceof X.C22271Ue
            if (r0 == 0) goto L_0x0156
            r7 = r13
            X.1Ue r7 = (X.C22271Ue) r7
            X.1Ud r0 = r7.A02
            X.0i6 r0 = r0.A00
            X.C04220Ms.A06(r0)
            com.instagram.service.session.UserSession r5 = X.C05030Qo.A03(r0)
            if (r5 == 0) goto L_0x0124
            boolean r1 = X.C19573AyZ.A02(r5)
            if (r1 == 0) goto L_0x0124
            X.0KY r1 = X.AnonymousClass0KY.A00()
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x0124
            X.0dH r2 = X.C09120et.A3D
            X.0et r1 = r2.A00()
            X.0dK r1 = r1.A1G
            java.lang.Object r1 = X.C18220wO.A0f(r1)
            int r8 = X.AnonymousClass0wJ.A04(r1)
            if (r8 <= 0) goto L_0x0124
            X.0et r1 = r2.A00()
            android.content.SharedPreferences r3 = r1.A00
            java.lang.String r2 = "instacrash_loop_test_crash_time"
            r1 = 5
            int r1 = r3.getInt(r2, r1)
            android.os.Handler r6 = X.C18250wR.A08()
            X.4OC r4 = new X.4OC
            r4.<init>(r8)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = (long) r1
            long r1 = r3.toMillis(r1)
            r6.postDelayed(r4, r1)
        L_0x0124:
            android.content.Context r4 = r7.A00
            X.0g9 r6 = X.AnonymousClass0g9.A00()
            X.0ci r3 = new X.0ci
            r3.<init>(r4)
            r1 = 10000(0x2710, double:4.9407E-320)
            r6.A01(r3, r1)
            java.lang.String r1 = r4.getPackageName()
            r2 = 0
            android.content.SharedPreferences r1 = r4.getSharedPreferences(r1, r2)
            java.lang.String r6 = "APPIRATER_USE_COUNT"
            int r3 = r1.getInt(r6, r2)
            java.lang.String r1 = r4.getPackageName()
            android.content.SharedPreferences r1 = r4.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r2 = r1.edit()
            int r1 = r3 + 1
            X.AnonymousClass0wJ.A11(r2, r6, r1)
            goto L_0x04b1
        L_0x0156:
            boolean r0 = r13 instanceof X.C22261Ud
            if (r0 == 0) goto L_0x0196
            r1 = r13
            X.1Ud r1 = (X.C22261Ud) r1
            X.1UZ r0 = r1.A01
            X.0dD r4 = r0.A00
            X.Ios r5 = new X.Ios
            r5.<init>()
            X.0bW r6 = r1.A03
            X.3Dt r8 = new X.3Dt
            r8.<init>()
            X.3GU r3 = new X.3GU
            r3.<init>()
            X.AnonymousClass0gN.A00()
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            X.0bU r7 = new X.0bU
            r7.<init>()
            X.0Oa r0 = X.AnonymousClass0RF.A00
            if (r0 != 0) goto L_0x018d
            X.02T r2 = new X.02T
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.0Oa r0 = X.AnonymousClass0OY.A02(r2)
            X.AnonymousClass0RF.A00 = r0
        L_0x018d:
            X.0ie r0 = r1.A02
            X.0i6 r0 = X.C18200wM.A0W(r0)
            r1.A00 = r0
            return
        L_0x0196:
            boolean r0 = r13 instanceof X.AnonymousClass1UR
            if (r0 == 0) goto L_0x019f
            X.8QA r0 = X.AnonymousClass8QA.A00
            X.AnonymousClass31K.A00 = r0
            return
        L_0x019f:
            boolean r0 = r13 instanceof X.AnonymousClass1Ua
            if (r0 == 0) goto L_0x025f
            r2 = r13
            X.1Ua r2 = (X.AnonymousClass1Ua) r2
            X.KJ8 r6 = X.KJ8.A0G
            java.lang.String r0 = "QE_INIT_START"
            r6.A0K(r0)
            android.content.Context r1 = r2.A00
            X.1to r0 = new X.1to
            r0.<init>(r1)
            X.C61823Vx.A01 = r0
            X.1Ud r0 = r2.A01
            X.0i6 r2 = r0.A00
            X.C04220Ms.A06(r2)
            X.3Vx r1 = X.C61823Vx.A01
            X.C04220Ms.A0A(r1)
            r1.A03()
            boolean r0 = r2 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x06dc
            com.instagram.service.session.UserSession r4 = X.C05030Qo.A02(r2)
            r1.A04(r4)
            java.lang.Class<X.0e9> r2 = X.C08720e9.class
            X.0Bg r1 = X.C02420Bg.A00
            java.lang.Object r0 = r4.A01(r2, r1)
            X.0e9 r0 = (X.C08720e9) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x06dc
            java.lang.Object r1 = r4.A01(r2, r1)
            X.0e9 r1 = (X.C08720e9) r1
            r0 = 1
            r1.A00 = r0
            android.content.SharedPreferences r0 = X.C07960cV.A00
            android.content.SharedPreferences$Editor r3 = r0.edit()
            r3.clear()
            java.util.Set r0 = X.C07960cV.A02
            java.util.Iterator r7 = r0.iterator()
        L_0x01f6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x06d9
            java.lang.Object r5 = r7.next()
            X.0cU r5 = (X.C07950cU) r5
            java.lang.String r2 = X.C07960cV.A02(r5)
            boolean r1 = r5 instanceof X.AnonymousClass0e5
            java.util.Set r0 = X.C07960cV.A03
            boolean r0 = r0.contains(r5)
            if (r1 == 0) goto L_0x0251
            X.0e5 r5 = (X.AnonymousClass0e5) r5
            if (r0 == 0) goto L_0x024c
            java.lang.Object r1 = r5.A01(r4)
        L_0x0218:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0224
            boolean r0 = X.AnonymousClass0wJ.A1X(r1)
            r3.putBoolean(r2, r0)
            goto L_0x01f6
        L_0x0224:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0230
            long r0 = X.C18190wL.A08(r1)
            r3.putLong(r2, r0)
            goto L_0x01f6
        L_0x0230:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0242
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x023e
            java.lang.String r1 = (java.lang.String) r1
            r3.putString(r2, r1)
            goto L_0x01f6
        L_0x023e:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x01f6
        L_0x0242:
            java.lang.Number r1 = (java.lang.Number) r1
            float r0 = r1.floatValue()
            r3.putFloat(r2, r0)
            goto L_0x01f6
        L_0x024c:
            java.lang.Object r1 = r5.A02(r4)
            goto L_0x0218
        L_0x0251:
            X.0ea r5 = (X.C08960ea) r5
            if (r0 == 0) goto L_0x025a
            java.lang.Object r1 = r5.A01()
            goto L_0x0218
        L_0x025a:
            java.lang.Object r1 = r5.A02()
            goto L_0x0218
        L_0x025f:
            boolean r0 = r13 instanceof X.AnonymousClass1UZ
            if (r0 == 0) goto L_0x0272
            r1 = r13
            X.1UZ r1 = (X.AnonymousClass1UZ) r1
            android.content.Context r0 = r1.A01
            X.C08360dF.A01(r0)
            X.0dD r0 = X.C08360dF.A00()
            r1.A00 = r0
            return
        L_0x0272:
            boolean r0 = r13 instanceof X.AnonymousClass1Uc
            if (r0 == 0) goto L_0x029b
            r2 = r13
            X.1Uc r2 = (X.AnonymousClass1Uc) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0044
            X.Gb1 r1 = r2.A01
            X.1Ud r0 = r2.A00
            X.0i6 r0 = r0.A00
            r1.A06(r0)
            X.C30916Gb1.A00 = r1
            r0 = 1
            X.C30916Gb1.A01 = r0
            r0 = 36324930719064867(0x810d5500002323, double:3.035370683267725E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            X.C07960cV.A05(r0)
            X.C31103Gfm.A04()
            return
        L_0x029b:
            boolean r0 = r13 instanceof X.AnonymousClass1UY
            if (r0 == 0) goto L_0x0329
            r2 = r13
            X.1UY r2 = (X.AnonymousClass1UY) r2
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x0044
            android.content.Context r1 = r2.A00
            r0 = 389(0x185, float:5.45E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r1 = r1.getSystemService(r0)
            r0 = 13
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1
            r1.cancelAll()
            X.1Ud r5 = r2.A01
            X.0i6 r0 = r5.A00
            boolean r0 = r0 instanceof com.instagram.service.session.UserSession
            if (r0 != 0) goto L_0x031d
            java.lang.String r2 = "ig.e2e.e2e_method"
            r1 = 1
            r0 = 0
            java.lang.String r1 = com.facebook.endtoend.EndToEnd.A00(r2, r1, r0)
            if (r1 == 0) goto L_0x031d
            java.lang.String r0 = "AUTH"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x031d
            X.0i6 r1 = r5.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.service.session.LoggedOutSession"
            X.C04220Ms.A0C(r1, r0)
            java.lang.String r0 = "ig.e2e.e2e_igid"
            r3 = 1
            r2 = 0
            java.lang.String r4 = com.facebook.endtoend.EndToEnd.A00(r0, r3, r2)
            java.lang.String r0 = "ig.e2e.e2e_username"
            java.lang.String r1 = com.facebook.endtoend.EndToEnd.A00(r0, r3, r2)
            java.lang.String r0 = "ig.e2e.e2e_auth_header"
            java.lang.String r3 = com.facebook.endtoend.EndToEnd.A00(r0, r3, r2)
            if (r4 == 0) goto L_0x0321
            if (r1 == 0) goto L_0x0321
            if (r3 == 0) goto L_0x0321
            com.instagram.user.model.User r2 = new com.instagram.user.model.User
            r2.<init>(r4, r1)
            java.lang.String r0 = ""
            r2.A2D(r0)
            X.4K8 r1 = new X.4K8
            r1.<init>(r2, r3)
            X.0RA r0 = X.AnonymousClass0RG.A00()
            com.instagram.service.session.UserSession r1 = r0.A02(r1, r2)
            r5.A00 = r1
            X.3Vx r0 = X.C61823Vx.A01
            if (r0 == 0) goto L_0x0715
            r0.A06(r1)
        L_0x031d:
            r0 = 1
            X.C10240hx.A00 = r0
            return
        L_0x0321:
            java.lang.String r1 = "JESTE2EHeadlessLoginInitializer"
            java.lang.String r0 = "Failed to initialize headless login as one or more inputs was null."
            X.AnonymousClass0LU.A0C(r1, r0)
            goto L_0x031d
        L_0x0329:
            boolean r0 = r13 instanceof X.AnonymousClass1UQ
            if (r0 == 0) goto L_0x035d
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = "enable_dark_mode"
            r0 = 0
            java.lang.String r1 = com.facebook.endtoend.EndToEnd.A00(r1, r0, r0)
            java.lang.String r0 = "true"
            boolean r2 = r0.equals(r1)
            X.0dD r0 = X.C08360dF.A00()
            r1 = 1
            if (r2 == 0) goto L_0x0348
            r1 = 2
        L_0x0348:
            android.content.SharedPreferences$Editor r2 = X.C18220wO.A0B(r0)
            X.C04220Ms.A06(r2)
            java.lang.String r0 = "dark_mode_toggle_setting"
            r2.putInt(r0, r1)
            java.lang.String r0 = "dark_mode_toggle_override_previous_value"
            r2.putInt(r0, r1)
        L_0x0359:
            r2.apply()
            return
        L_0x035d:
            boolean r0 = r13 instanceof X.AnonymousClass1UV
            if (r0 == 0) goto L_0x0378
            r1 = r13
            X.1UV r1 = (X.AnonymousClass1UV) r1
            X.KJ8 r5 = X.KJ8.A0G
            java.lang.String r0 = "FB_ACCOUNT_INIT_START"
            r5.A0K(r0)
            android.content.Context r4 = r1.A00
            java.lang.String r3 = X.C10380iF.A02(r4)
            java.lang.String r1 = "124024574287414"
            java.lang.Class<X.3Re> r2 = X.C60943Re.class
            monitor-enter(r2)
            goto L_0x071a
        L_0x0378:
            boolean r0 = r13 instanceof X.AnonymousClass1UU
            if (r0 == 0) goto L_0x0398
            r1 = r13
            X.1UU r1 = (X.AnonymousClass1UU) r1
            java.lang.String r4 = "Failed to initialize DebugHeapPluginImpl"
            X.0et r0 = X.C09120et.A02()
            boolean r0 = r0.A0S()
            if (r0 == 0) goto L_0x0044
            android.content.Context r3 = r1.A00
            android.content.res.Resources r0 = r3.getResources()
            X.AnonymousClass5FV.A00(r0)
            java.lang.String r2 = "DebugHeadInitializer"
            goto L_0x073c
        L_0x0398:
            boolean r0 = r13 instanceof X.AnonymousClass1UX
            if (r0 == 0) goto L_0x0754
            r5 = r13
            X.1UX r5 = (X.AnonymousClass1UX) r5
            X.1Ud r0 = r5.A01
            X.0i6 r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36601178720833141(0x82089400040e75, double:3.2100710319474E-306)
            java.lang.Long r0 = X.C63803iN.A07(r2, r3, r0)
            long r3 = r0.longValue()
            int r0 = (int) r3
            if (r0 != 0) goto L_0x0044
            X.0TJ r3 = X.AnonymousClass0TJ.A06
            r0 = 18860730405421111(0x4301bc00050037, double:2.1145738986163303E-307)
            java.lang.String r12 = X.C63173fJ.A04(r3, r0)
            X.C04220Ms.A06(r12)
            r0 = 18860730405486648(0x4301bc00060038, double:2.114573898642234E-307)
            java.lang.String r9 = X.C63173fJ.A04(r3, r0)
            X.C04220Ms.A06(r9)
            android.content.Context r1 = r5.A00
            java.lang.String r0 = "uimode"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x03e1 }
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0     // Catch:{ Exception -> 0x03e1 }
            if (r0 != 0) goto L_0x03dc
            goto L_0x03e3
        L_0x03dc:
            int r1 = r0.getNightMode()     // Catch:{ Exception -> 0x03e1 }
            goto L_0x03e4
        L_0x03e1:
            r1 = -1
            goto L_0x03e4
        L_0x03e3:
            r1 = -1
        L_0x03e4:
            X.0dD r0 = X.C08360dF.A00()
            android.content.SharedPreferences r0 = r0.A00
            java.lang.String r4 = "dark_mode_toggle_setting"
            r3 = -1
            int r8 = r0.getInt(r4, r3)
            java.lang.String r11 = "any"
            boolean r0 = r11.equals(r12)
            r10 = 2
            java.lang.String r6 = "light_mode"
            java.lang.String r7 = "dark_mode"
            r5 = 1
            if (r0 != 0) goto L_0x041c
            boolean r0 = r7.equals(r12)
            if (r0 == 0) goto L_0x0407
            if (r1 == r10) goto L_0x041c
        L_0x0407:
            boolean r0 = r6.equals(r12)
            if (r0 == 0) goto L_0x040f
            if (r1 == r5) goto L_0x041c
        L_0x040f:
            java.lang.String r0 = "schedule"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0497
            if (r1 == 0) goto L_0x041c
            r0 = 3
            if (r1 != r0) goto L_0x0497
        L_0x041c:
            r1 = 1
        L_0x041d:
            boolean r0 = r11.equals(r9)
            if (r0 != 0) goto L_0x043d
            boolean r0 = r7.equals(r9)
            if (r0 == 0) goto L_0x042b
            if (r8 == r10) goto L_0x043d
        L_0x042b:
            boolean r0 = r6.equals(r9)
            if (r0 == 0) goto L_0x0433
            if (r8 == r5) goto L_0x043d
        L_0x0433:
            java.lang.String r0 = "follow_system"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0495
            if (r8 != r3) goto L_0x0495
        L_0x043d:
            r0 = 1
        L_0x043e:
            if (r1 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            r0 = 18579255428383729(0x4201bc000003f1, double:2.003320205561831E-307)
            java.lang.Long r0 = X.C63173fJ.A02(r2, r0)
            long r0 = r0.longValue()
            int r10 = (int) r0
            r0 = 18860730405158966(0x4301bc00010036, double:2.1145738985127168E-307)
            java.lang.String r9 = X.C63173fJ.A04(r2, r0)
            X.C04220Ms.A06(r9)
            android.content.SharedPreferences r1 = X.C18200wM.A0C()
            java.lang.String r12 = "dark_mode_toggle_override_iteration_id"
            int r11 = r1.getInt(r12, r3)
            int r0 = r1.getInt(r4, r3)
            if (r11 == r10) goto L_0x0044
            android.content.SharedPreferences$Editor r2 = X.C18250wR.A06(r1)
            java.lang.String r8 = "dark_mode_toggle_override_previous_value"
            int r1 = r1.getInt(r8, r0)
            java.lang.String r0 = "dark_mode_toggle_override_previous_iteration_id"
            r2.putInt(r0, r11)
            r2.putInt(r12, r10)
            r2.putInt(r8, r1)
            java.lang.String r0 = "not_selected"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0490
            boolean r0 = r7.equals(r9)
            if (r0 == 0) goto L_0x0499
            r1 = 2
        L_0x0490:
            r2.putInt(r4, r1)
            goto L_0x0359
        L_0x0495:
            r0 = 0
            goto L_0x043e
        L_0x0497:
            r1 = 0
            goto L_0x041d
        L_0x0499:
            boolean r0 = r6.equals(r9)
            if (r0 == 0) goto L_0x04a4
            r2.putInt(r4, r5)
            goto L_0x0359
        L_0x04a4:
            java.lang.String r0 = "follow_system"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0359
            r2.putInt(r4, r3)
            goto L_0x0359
        L_0x04b1:
            r8 = 1
            boolean r1 = com.facebook.systrace.Systrace.A0F(r8)     // Catch:{ all -> 0x06c4 }
            if (r1 == 0) goto L_0x04c1
            java.lang.String r2 = "enableCustomDrawables"
            r1 = 418116989(0x18ebf57d, float:6.0993956E-24)
            X.C13930oX.A01(r2, r1)     // Catch:{ all -> 0x06c4 }
        L_0x04c1:
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ all -> 0x06c4 }
            X.AnonymousClass5FV.A00(r1)     // Catch:{ all -> 0x06c4 }
            boolean r1 = com.facebook.systrace.Systrace.A0F(r8)
            if (r1 == 0) goto L_0x04d4
            r1 = 1737070518(0x678997b6, float:1.2995256E24)
            X.C13930oX.A00(r1)
        L_0x04d4:
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.C10110hk.A06 = r1
            X.01V r2 = X.AnonymousClass01V.A0p
            java.lang.String r1 = X.C05030Qo.A04(r0)
            r2.A0l(r1)
            X.ITF r6 = X.ITF.A00()
            if (r5 == 0) goto L_0x058b
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36316873360412019(0x81060100000d73, double:3.030275177211285E-306)
            boolean r2 = X.C63803iN.A0E(r3, r5, r1)
        L_0x04f6:
            r5 = 478940264(0x1c8c0c68, float:9.26763E-22)
            r1 = 685265049(0x28d85099, float:2.4015771E-14)
            if (r2 == 0) goto L_0x0504
            r1 = 478940264(0x1c8c0c68, float:9.26763E-22)
            r5 = 685265049(0x28d85099, float:2.4015771E-14)
        L_0x0504:
            r3 = 0
            java.io.File r2 = r6.BMF(r3, r1)
            X.6kY r1 = new X.6kY
            r1.<init>(r3, r2, r3)
            java.io.File r1 = r6.AOC(r1, r5)
            java.lang.String r1 = r1.getPath()
            X.C63253h7.A00 = r1
            android.content.SharedPreferences r1 = X.C18200wM.A0C()
            java.lang.String r8 = "preference_emergency_push_should_log_after_induced_crash"
            boolean r1 = r1.contains(r8)
            if (r1 == 0) goto L_0x0555
            java.lang.String r1 = "ig_emergency_push_did_restart_after_crash"
            X.0rn r6 = X.C18230wP.A0T(r1)
            android.content.SharedPreferences r5 = X.C18200wM.A0C()
            java.lang.String r2 = "preference_emergency_push_version"
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r5.getInt(r2, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "current_version"
            r6.A08(r2, r1)
            X.0kZ r1 = X.C12090lI.A00(r0)
            r1.Ce1(r6)
            android.content.SharedPreferences r1 = X.C18200wM.A0C()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.remove(r8)
            r1.commit()
        L_0x0555:
            android.view.Choreographer r1 = r7.A01
            X.AnonymousClass0hK.A00 = r1
            X.KJ8 r2 = X.KJ8.A0G
            boolean r1 = r2.A0B
            if (r1 != 0) goto L_0x0563
            boolean r1 = r2.A0C
            if (r1 == 0) goto L_0x05b1
        L_0x0563:
            X.0nS r2 = X.C13330nS.A01(r3, r0)
            java.lang.String r1 = "android_apk_testing_exposure"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 26
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r6 = X.C18180wK.A0I(r2, r1)
            X.0A2 r5 = r6.A00
            boolean r1 = r5.isSampled()
            if (r1 == 0) goto L_0x05b1
            android.content.pm.PackageManager r2 = r4.getPackageManager()
            if (r2 == 0) goto L_0x0595
            java.lang.String r1 = r4.getPackageName()
            X.C04220Ms.A06(r1)
            java.lang.String r3 = ""
            goto L_0x058e
        L_0x058b:
            r2 = 0
            goto L_0x04f6
        L_0x058e:
            java.lang.String r1 = r2.getInstallerPackageName(r1)     // Catch:{ IllegalArgumentException -> 0x059a }
            if (r1 != 0) goto L_0x059b
            goto L_0x059c
        L_0x0595:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            throw r1
        L_0x059a:
            r1 = r3
        L_0x059b:
            r3 = r1
        L_0x059c:
            int r1 = X.C10380iF.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "build_num"
            r5.A6J(r1, r2)
            java.lang.String r1 = "installer"
            r6.A0T(r1, r3)
            r6.Bb4()
        L_0x05b1:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36311148169068985(0x8100cc000101b9, double:3.026654543152455E-306)
            boolean r6 = X.C63803iN.A0E(r3, r0, r1)
            r1 = 36311148169003448(0x8100cc000001b8, double:3.026654543111009E-306)
            boolean r5 = X.C63803iN.A0E(r3, r0, r1)
            if (r5 != 0) goto L_0x05c9
            if (r6 == 0) goto L_0x05f2
        L_0x05c9:
            android.view.Choreographer r2 = android.view.Choreographer.getInstance()
            X.JOS r1 = X.JOS.A07
            if (r1 != 0) goto L_0x06bd
            X.JOS r1 = new X.JOS
            r1.<init>(r2)
            X.JOS.A07 = r1
            X.KIs r1 = new X.KIs
            r1.<init>()
            X.C691847d.A02(r1)
            if (r6 == 0) goto L_0x05e5
            r1 = 1
            X.C37210JmY.A0B = r1
        L_0x05e5:
            if (r5 == 0) goto L_0x05f2
            X.GC4 r1 = X.GC4.A06
            if (r1 != 0) goto L_0x06d2
            X.GC4 r1 = new X.GC4
            r1.<init>()
            X.GC4.A06 = r1
        L_0x05f2:
            X.0iB r1 = X.C10340iB.A00()
            int r2 = r1.ordinal()
            r1 = 1
            if (r2 == r1) goto L_0x06b6
            r1 = 2
            if (r2 == r1) goto L_0x06af
            r1 = 3
            if (r2 == r1) goto L_0x06a8
            r1 = 36317719469166533(0x8106c600030fc5, double:3.030810259794646E-306)
        L_0x0608:
            X.C63803iN.A0E(r3, r0, r1)
            boolean r1 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r1 == 0) goto L_0x0690
            r1 = 36320012981835394(0x8108dc00051682, double:3.032260686441668E-306)
            boolean r1 = X.C63803iN.A0E(r3, r0, r1)
            if (r1 == 0) goto L_0x0628
            r1 = 36320012981769857(0x8108dc00041681, double:3.032260686400222E-306)
            boolean r2 = X.C63803iN.A0E(r3, r0, r1)
            r1 = 1
            if (r2 != 0) goto L_0x0629
        L_0x0628:
            r1 = 0
        L_0x0629:
            X.01V r5 = X.AnonymousClass01V.A0p
            r6 = 217329005(0xcf42d6d, float:3.7621492E-31)
            r7 = 3
            if (r1 == 0) goto L_0x0632
            r7 = 2
        L_0x0632:
            r8 = 0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r5.markerGenerate(r6, r7, r8, r10)
            r1 = 36320012981507709(0x8108dc0000167d, double:3.0322606862344385E-306)
            boolean r1 = X.C63803iN.A0E(r3, r0, r1)
            if (r1 == 0) goto L_0x064d
            X.01V r5 = X.AnonymousClass01V.A0p
            r6 = 217317378(0xcf40002, float:3.7594157E-31)
            r7 = 2
            r5.markerGenerate(r6, r7, r8, r10)
        L_0x064d:
            r1 = 36320012981573246(0x8108dc0001167e, double:3.0322606862758843E-306)
            boolean r1 = X.C63803iN.A0E(r3, r0, r1)
            if (r1 == 0) goto L_0x0661
            X.01V r5 = X.AnonymousClass01V.A0p
            r6 = 217317377(0xcf40001, float:3.7594155E-31)
            r7 = 2
            r5.markerGenerate(r6, r7, r8, r10)
        L_0x0661:
            X.0TJ r5 = X.C18200wM.A0Q()
            r1 = 1
            r5.A02 = r1
            r1 = 36320012981704320(0x8108dc00031680, double:3.032260686358776E-306)
            boolean r1 = X.C63803iN.A0E(r5, r0, r1)
            if (r1 == 0) goto L_0x0694
            X.01V r5 = X.AnonymousClass01V.A0p
            r6 = 217325397(0xcf41f55, float:3.761301E-31)
            r7 = 2
            r5.markerGenerate(r6, r7, r8, r10)
        L_0x067c:
            r1 = 36320012981638783(0x8108dc0002167f, double:3.03226068631733E-306)
            boolean r0 = X.C63803iN.A0E(r3, r0, r1)
            if (r0 == 0) goto L_0x0690
            X.01V r5 = X.AnonymousClass01V.A0p
            r6 = 217325944(0xcf42178, float:3.7614296E-31)
            r7 = 2
            r5.markerGenerate(r6, r7, r8, r10)
        L_0x0690:
            X.AnonymousClass2FR.A00(r4)
            return
        L_0x0694:
            java.lang.String r1 = "E2E test User not passing a launched GK, value source: "
            java.lang.StringBuilder r2 = X.C18190wL.A0s(r1)
            X.0TO r1 = r5.A00
            X.0TN r1 = r1.A00
            java.lang.String r2 = X.C18200wM.A0m(r1, r2)
            java.lang.String r1 = "jest-e2e-client-error"
            X.AnonymousClass0LU.A0B(r1, r2)
            goto L_0x067c
        L_0x06a8:
            r1 = 36317719469035459(0x8106c600010fc3, double:3.030810259711754E-306)
            goto L_0x0608
        L_0x06af:
            r1 = 36317719468969922(0x8106c600000fc2, double:3.030810259670308E-306)
            goto L_0x0608
        L_0x06b6:
            r1 = 36317719469100996(0x8106c600020fc4, double:3.0308102597532E-306)
            goto L_0x0608
        L_0x06bd:
            java.lang.String r0 = "instance cannot be created twice"
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
            throw r1
        L_0x06c4:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0F(r8)
            if (r0 == 0) goto L_0x06d8
            r0 = 1894073156(0x70e54344, float:5.676271E29)
            X.C13930oX.A00(r0)
            throw r1
        L_0x06d2:
            java.lang.String r0 = "Already initialized"
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
        L_0x06d8:
            throw r1
        L_0x06d9:
            r3.apply()
        L_0x06dc:
            X.3YJ r5 = X.AnonymousClass3YJ.A08
            java.lang.Object r4 = r5.A04
            monitor-enter(r4)
            java.util.List r3 = r5.A05     // Catch:{ all -> 0x0712 }
            r3.size()     // Catch:{ all -> 0x0712 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0712 }
        L_0x06ea:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0712 }
            if (r0 == 0) goto L_0x0702
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0712 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0712 }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0712 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0712 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0712 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0712 }
            X.AnonymousClass3YJ.A00(r5, r1, r0)     // Catch:{ all -> 0x0712 }
            goto L_0x06ea
        L_0x0702:
            r3.clear()     // Catch:{ all -> 0x0712 }
            monitor-exit(r4)     // Catch:{ all -> 0x0712 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A06
            r0 = 1
            r1.set(r0)
            java.lang.String r0 = "QE_INIT_END"
            r6.A0K(r0)
            return
        L_0x0712:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0712 }
            throw r1
        L_0x0715:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            throw r1
        L_0x071a:
            java.lang.Boolean r0 = X.C60943Re.A01     // Catch:{ all -> 0x0739 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0739 }
            if (r0 != 0) goto L_0x0732
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ all -> 0x0739 }
            X.C60943Re.A00 = r0     // Catch:{ all -> 0x0739 }
            X.C60943Re.A02 = r1     // Catch:{ all -> 0x0739 }
            X.C60943Re.A03 = r3     // Catch:{ all -> 0x0739 }
            java.lang.Boolean r0 = X.C18180wK.A0Y()     // Catch:{ all -> 0x0739 }
            X.C60943Re.A01 = r0     // Catch:{ all -> 0x0739 }
        L_0x0732:
            monitor-exit(r2)
            java.lang.String r0 = "FB_ACCOUNT_INIT_END"
            r5.A0K(r0)
            return
        L_0x0739:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x073c:
            java.lang.String r0 = "com.instagram.debug.devoptions.debughead.DebugHeadPluginImpl"
            java.lang.Object r1 = X.C18230wP.A0g(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x074f }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.debug.devoptions.apiperf.DebugHeadPlugin"
            X.C04220Ms.A0C(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x074f }
            com.instagram.debug.devoptions.apiperf.DebugHeadPlugin r1 = (com.instagram.debug.devoptions.apiperf.DebugHeadPlugin) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x074f }
            com.instagram.debug.devoptions.apiperf.DebugHeadPlugin.sInstance = r1     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x074f }
            r1.onCreate(r3)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x074f }
            return
        L_0x074f:
            r0 = move-exception
            X.AnonymousClass0LU.A0E(r2, r4, r0)
            return
        L_0x0754:
            r0 = r13
            X.1UT r0 = (X.AnonymousClass1UT) r0
            X.1Ud r0 = r0.A00
            X.0i6 r1 = r0.A00
            X.C04220Ms.A06(r1)
            X.44r r0 = new X.44r
            r0.<init>(r1)
            X.C60813Qp.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TI.A03():void");
    }

    public final void run() {
        if (!this.A02) {
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
            this.A01 = awakeTimeSinceBootClock.now();
            A03();
            this.A00 = awakeTimeSinceBootClock.now();
            this.A02 = true;
        }
    }
}
