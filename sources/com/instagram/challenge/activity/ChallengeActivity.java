package com.instagram.challenge.activity;

import X.AnonymousClass006;
import X.AnonymousClass0PA;
import X.AnonymousClass0wJ;
import X.AnonymousClass322;
import X.AnonymousClass3GW;
import X.AnonymousClass49P;
import X.C09650fs;
import X.C10300i6;
import X.C10450iM;
import X.C11630kW;
import X.C12560m7;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18230wP;
import X.C32059H2y;
import X.C34642Ki;
import X.C38040KHr;
import X.C54482zW;
import X.C562136f;
import X.C61873Wd;
import X.C63873iU;
import X.C697449w;
import X.C82394pY;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ChallengeActivity extends BaseFragmentActivity implements C11630kW {
    public Bundle A00;
    public C12560m7 A01;
    public C10300i6 A02;
    public C32059H2y A03;
    public String A04;
    public String A05;
    public String A06;
    public C38040KHr A07;
    public Integer A08;
    public final C82394pY A09 = C18220wO.A0P(this, 19);

    public final String getModuleName() {
        return "challenge";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a0, code lost:
        r0.setArguments(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        X.C10450iM.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        X.C61873Wd.A01(r8.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        X.AnonymousClass0wJ.A19(r0, r8, r8.A02);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r8 = this;
            java.lang.Integer r0 = r8.A08
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x008d;
                case 1: goto L_0x00a5;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x001e;
                case 5: goto L_0x0059;
                case 6: goto L_0x0051;
                case 7: goto L_0x0095;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r1 = "Challenge"
            java.lang.String r0 = "unknown challenge type found"
        L_0x000d:
            X.C10450iM.A03(r1, r0)
        L_0x0010:
            r0 = 0
        L_0x0011:
            X.0m7 r1 = r8.A01
            X.C61873Wd.A01(r1)
            if (r0 == 0) goto L_0x001d
            X.0i6 r1 = r8.A02
            X.AnonymousClass0wJ.A19(r0, r8, r1)
        L_0x001d:
            return
        L_0x001e:
            X.0m7 r0 = r8.A01
            X.C61873Wd.A02(r0)
            X.0i6 r0 = r8.A02
            if (r0 == 0) goto L_0x004c
            X.JmN r7 = X.C37200JmN.A00()
            X.0i6 r6 = r8.A02
            r5 = 1
            X.FfK r0 = X.C28979FfK.IGWB_SELFIE_CAPTCHA_CHALLENGE
            X.FfK[] r0 = new X.C28979FfK[]{r0}
            r4 = 0
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            X.C18240wQ.A1Q(r3, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A00
            com.facebook.redex.IDxCCallbackShape583S0100000_1_I2 r1 = new com.facebook.redex.IDxCCallbackShape583S0100000_1_I2
            r1.<init>(r8, r5)
            X.Jf5 r0 = new X.Jf5
            r0.<init>(r4, r1, r2, r3)
            r7.A02(r6, r0)
            goto L_0x0010
        L_0x004c:
            java.lang.String r1 = "Challenge"
            java.lang.String r0 = "Session is null"
            goto L_0x000d
        L_0x0051:
            android.os.Bundle r1 = r8.A00
            X.1bU r0 = new X.1bU
            r0.<init>()
            goto L_0x00a0
        L_0x0059:
            X.0i6 r0 = r8.A02
            boolean r0 = r0.hasEnded()
            if (r0 == 0) goto L_0x0064
            r8.finish()
        L_0x0064:
            X.0i6 r1 = r8.A02
            r0 = 0
            X.7qT r2 = X.C130667qT.A00(r0, r8, r8, r1)
            r0 = 1
            r2.A00 = r0
            android.os.Bundle r1 = r8.A00
            java.lang.String r0 = "ChallengeFragment.bloksAction"
            int r1 = r1.getInt(r0)
            X.0i6 r0 = r8.A02
            X.49P r0 = X.AnonymousClass49P.A00(r0)
            java.lang.Object r0 = r0.A02(r1)
            X.3St r0 = (X.C61323St) r0
            if (r0 == 0) goto L_0x0088
            X.C33492Fx.A00(r2, r0)
            goto L_0x0010
        L_0x0088:
            java.lang.String r1 = "bloks_challenge_action"
            java.lang.String r0 = "Challenge action was expected but was null"
            goto L_0x000d
        L_0x008d:
            android.os.Bundle r1 = r8.A00
            X.1bR r0 = new X.1bR
            r0.<init>()
            goto L_0x00a0
        L_0x0095:
            android.os.Bundle r1 = r8.A00
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.FOI r0 = new X.FOI
            r0.<init>()
        L_0x00a0:
            r0.setArguments(r1)
            goto L_0x0011
        L_0x00a5:
            X.GU8 r0 = X.GU8.A01
            r0.A00()
            X.0i6 r4 = r8.A02
            java.lang.Integer r3 = X.AnonymousClass006.A01
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            X.GU8 r0 = X.GU8.A01
            r0.A00()
            java.lang.String r1 = "direct_blocking"
            android.os.Bundle r0 = X.C18180wK.A06()
            X.1qE r0 = X.C23161cb.A00(r0, r4, r3, r1, r2)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.challenge.activity.ChallengeActivity.A00():void");
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void A0D(Bundle bundle) {
        if (C18230wP.A0I(this) == null) {
            A00();
        }
    }

    public final void finish() {
        C697449w A002;
        super.finish();
        C10300i6 r1 = this.A02;
        if (r1 != null && (A002 = AnonymousClass3GW.A00.A00(r1)) != null) {
            A002.A01();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i != 64) {
            return;
        }
        if (i2 == -1) {
            C61873Wd.A02(this.A01);
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("challenge_id", this.A04);
            A0y.put("entity_id", this.A05);
            if (intent != null) {
                String stringExtra = intent.getStringExtra("result_upload_response");
                if (!TextUtils.isEmpty(stringExtra)) {
                    try {
                        C562136f parseFromJson = C54482zW.parseFromJson(C18180wK.A0L(stringExtra));
                        if (!(parseFromJson == null || (str = parseFromJson.A00) == null)) {
                            A0y.put("age_verification_result", str);
                        }
                    } catch (IOException unused) {
                        C10450iM.A03("ChallengeActivity", "Unable to parse response string");
                    }
                }
            }
            AnonymousClass322.A00(getApplicationContext(), C63873iU.A06(this, 36), this.A02, AnonymousClass006.A01, "challenge/", A0y);
            return;
        }
        C10450iM.A00().CYW("challenges_finish_source", "c");
        AnonymousClass322.A00(getApplicationContext(), C63873iU.A06(this, 37), this.A02, AnonymousClass006.A01, "challenge/rewind/", (Map) null);
        finish();
    }

    public final void onBackPressed() {
        C10450iM.A00().CYW("challenges_finish_source", "f");
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1837165060);
        Bundle bundleExtra = getIntent().getBundleExtra("ChallengeFragment.arguments");
        this.A00 = bundleExtra;
        this.A02 = C18190wL.A0S(bundleExtra);
        this.A04 = this.A00.getString("challenge_id");
        this.A06 = this.A00.getString("user_fbid");
        this.A05 = this.A00.getString("entity_id");
        this.A01 = getSupportFragmentManager();
        this.A08 = C34642Ki.A00(getIntent().getStringExtra("ChallengeFragment.challengeType"));
        this.A03 = new C32059H2y(this.A02);
        Context applicationContext = getApplicationContext();
        if (applicationContext != null && C09650fs.A02(applicationContext)) {
            C38040KHr kHr = C38040KHr.A01;
            kHr.A03(this.A09, AnonymousClass0PA.class);
            this.A07 = kHr;
        }
        super.onCreate(bundle);
        C14030oh.A07(1893283964, A002);
    }

    public final void onDestroy() {
        int A002 = C14030oh.A00(396778084);
        super.onDestroy();
        if (isFinishing() && this.A08 == AnonymousClass006.A0j) {
            AnonymousClass49P.A00(this.A02).A03(this.A00.getInt("ChallengeFragment.bloksAction"));
        }
        C14030oh.A07(-729301537, A002);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bundle bundleExtra = intent.getBundleExtra("ChallengeFragment.arguments");
        this.A00 = bundleExtra;
        this.A04 = bundleExtra.getString("challenge_id");
        this.A06 = this.A00.getString("user_fbid");
        this.A05 = this.A00.getString("entity_id");
        this.A08 = C34642Ki.A00(intent.getStringExtra("ChallengeFragment.challengeType"));
        getSupportFragmentManager().A11((String) null, 1);
        A00();
    }
}
