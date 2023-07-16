package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.49w  reason: invalid class name and case insensitive filesystem */
public final class C697449w implements AnonymousClass0i1, AnonymousClass0i4 {
    public C13330nS A00;
    public String A01;
    public boolean A02 = false;
    public boolean A03 = true;
    public boolean A04 = false;
    public boolean A05 = false;
    public final C10300i6 A06;
    public final C10420iJ A07;

    public final synchronized void A01() {
        this.A04 = false;
    }

    public final synchronized void A02(Context context, C62123Xf r13) {
        String str;
        UserSession A022;
        if (!this.A02 && !this.A04) {
            C10300i6 r7 = this.A06;
            if ((r7 instanceof UserSession) && (A022 = C05030Qo.A02(r7)) != null) {
                AnonymousClass3LY.A00(A022).CWx(new C687345g());
            }
            this.A02 = true;
            Context context2 = context;
            IDxACallbackShape15S0300000_1_I2 iDxACallbackShape15S0300000_1_I2 = new IDxACallbackShape15S0300000_1_I2(5, (Object) r13, (Object) context, (Object) this);
            AnonymousClass322.A02 = r13.A01;
            String str2 = r13.A00;
            if (str2 != null) {
                AnonymousClass322.A03 = C15430rJ.A01(str2).getQueryParameter("challenge_node_id");
                String str3 = r13.A00;
                int indexOf = str3.indexOf("challenge/");
                if (indexOf >= 0) {
                    String[] split = str3.substring(indexOf).split("/");
                    if (split.length >= 3) {
                        AnonymousClass322.A01 = split[1];
                        str = split[2];
                    } else {
                        str = null;
                        AnonymousClass322.A01 = null;
                    }
                    AnonymousClass322.A00 = str;
                }
            }
            AnonymousClass322.A00(context2, iDxACallbackShape15S0300000_1_I2, r7, AnonymousClass006.A0N, "challenge/", (Map) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r6, X.C62123Xf r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            r5 = this;
            r0 = 1
            r5.A02 = r0
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "user_id"
            r2.put(r0, r9)
        L_0x0012:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "nonce_code"
            r2.put(r0, r10)
        L_0x001d:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "cni"
            r2.put(r0, r11)
        L_0x0028:
            if (r13 == 0) goto L_0x006e
            X.44X r0 = X.AnonymousClass44X.A00()
            X.0i6 r4 = r5.A06
            java.lang.String r3 = "igwb_identity_safety_FX_access_safety_security_integrity"
            boolean r0 = X.AnonymousClass44X.A01(r4, r0, r3)
            if (r0 == 0) goto L_0x006e
            java.lang.String r1 = "choice"
            java.lang.String r0 = "3"
            r2.put(r1, r0)
            X.44X r0 = X.AnonymousClass44X.A00()
            java.lang.String r1 = r0.A03(r4, r3)
            java.lang.String r0 = "big_blue_token"
            r2.put(r0, r1)
        L_0x004c:
            if (r12 == 0) goto L_0x0053
            java.lang.String r0 = "challenge_context"
            r2.put(r0, r12)
        L_0x0053:
            X.0i6 r3 = r5.A06
            java.lang.String r1 = X.C18190wL.A0l(r3)
            java.lang.String r0 = "fb_family_device_id"
            r2.put(r0, r1)
            r0 = 4
            com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2 r1 = new com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2
            r1.<init>(r0, r6, r5, r7)
            X.4A9 r0 = X.C63263h8.A00(r3, r8, r2)
            r0.A00 = r1
            X.C31155GhB.A03(r0)
            return
        L_0x006e:
            java.lang.String r1 = "get_challenge"
            java.lang.String r0 = "true"
            r2.put(r1, r0)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C697449w.A03(android.content.Context, X.3Xf, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final synchronized void A04(Context context, Integer num, String str, Map map) {
        if (this.A03) {
            Bundle A062 = C18180wK.A06();
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                A062.putString(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            this.A04 = true;
            this.A05 = false;
            if (num != AnonymousClass006.A1C) {
                if (str != null) {
                    AnonymousClass322.A02 = str;
                }
                C34632Kh.A00(context, A062, num, 805306368, this.A06.getToken());
            } else {
                this.A04 = false;
                C10450iM.A03("Challenge", "Challenge Type Invalid");
            }
        }
    }

    public static void A00(Context context, C697449w r18, C62123Xf r19) {
        C697449w r1 = r18;
        if (r1.A03 && !r1.A04) {
            C62123Xf r2 = r19;
            if (!TextUtils.isEmpty(r2.A02)) {
                r1.A04 = true;
                Context context2 = context;
                Intent A002 = AnonymousClass3Xr.A00(context2, r1.A06, new SimpleWebViewConfig(AnonymousClass3W8.A02(context2, r2.A02), (String) null, (String) null, (String) null, false, false, false, false, false, !r2.A05, true, true, r2.A03, false, false));
                A002.addFlags(335544320);
                C10650ih.A02(context2, A002);
            }
        }
    }

    public final void A05(String str) {
        if ("IG_PAYOUT_EDIT".equals(str)) {
            AnonymousClass3LY.A00(this.A06).CWx(new AnonymousClass460());
        }
    }

    public final void onSessionWillEnd() {
        C10410iI.A00.A01(this.A07);
        this.A00 = null;
        this.A01 = null;
        A01();
    }

    public final void onUserSessionWillEnd(boolean z) {
        C10410iI.A00.A01(this.A07);
    }

    public C697449w(C10300i6 r3) {
        this.A06 = r3;
        this.A00 = C13330nS.A02(r3);
        this.A01 = C18180wK.A0e();
        AnonymousClass1k6 r1 = new AnonymousClass1k6(this);
        this.A07 = r1;
        C10410iI.A00.A00(r1);
    }
}
