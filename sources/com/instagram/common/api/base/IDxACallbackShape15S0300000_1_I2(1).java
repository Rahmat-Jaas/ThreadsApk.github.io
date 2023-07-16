package com.instagram.common.api.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass1UI;
import X.AnonymousClass3HF;
import X.AnonymousClass3HV;
import X.AnonymousClass3Za;
import X.AnonymousClass49C;
import X.AnonymousClass49T;
import X.C10300i6;
import X.C10450iM;
import X.C14030oh;
import X.C18180wK;
import X.C18230wP;
import X.C26743EUq;
import X.C31155GhB;
import X.C32165H8c;
import X.C567838n;
import X.C567938o;
import X.C62083Xb;
import X.C63873iU;
import X.C85964w3;
import X.E2V;
import X.MMp;
import android.app.Activity;
import android.content.SharedPreferences;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

public class IDxACallbackShape15S0300000_1_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxACallbackShape15S0300000_1_I2(C10300i6 r1, C85964w3 r2, AnonymousClass3HV r3, int i) {
        this.A03 = i;
        this.A00 = r3;
        if (10 - i != 0) {
            this.A01 = r2;
            this.A02 = r1;
        } else {
            this.A02 = r1;
            this.A01 = r2;
        }
    }

    public final void A00(AnonymousClass1UI r10) {
        C10300i6 r2 = (C10300i6) this.A02;
        AnonymousClass49C r1 = (AnonymousClass49C) r2.A01(AnonymousClass49C.class, new KtLambdaShape95S0100000_I2_75(r2, 18));
        r1.A00 = C62083Xb.A04.A00(r10);
        UserSession userSession = r1.A01;
        if (r10 == null) {
            AnonymousClass49T.A01(userSession);
        } else {
            long j = AnonymousClass49C.A02;
            SharedPreferences sharedPreferences = ((AnonymousClass49T) C18180wK.A0c(userSession, AnonymousClass49T.class, 26)).A00;
            try {
                Long l = r10.A00;
                long currentTimeMillis = System.currentTimeMillis();
                if (l != null) {
                    j = TimeUnit.SECONDS.toMillis(l.longValue());
                }
                AnonymousClass0wJ.A12(sharedPreferences.edit(), "qp_cooldown_response_expiration_time", currentTimeMillis + j);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                StringWriter A0d = C18230wP.A0d();
                MMp A0K = C18180wK.A0K(A0d);
                if (r10.A04 != null) {
                    A0K.A0U("surfaces");
                    A0K.A0I();
                    for (C567938o r7 : r10.A04) {
                        if (r7 != null) {
                            A0K.A0J();
                            Integer num = r7.A00;
                            if (num != null) {
                                A0K.A0b("surface_id", num.intValue());
                            }
                            Long l2 = r7.A01;
                            if (l2 != null) {
                                A0K.A0c("cooldown", l2.longValue());
                            }
                            A0K.A0G();
                        }
                    }
                    A0K.A0F();
                }
                if (r10.A03 != null) {
                    A0K.A0U("slots");
                    A0K.A0I();
                    for (C567838n r72 : r10.A03) {
                        if (r72 != null) {
                            A0K.A0J();
                            String str = r72.A01;
                            if (str != null) {
                                A0K.A0d("slot", str);
                            }
                            Long l3 = r72.A00;
                            if (l3 != null) {
                                A0K.A0c("cooldown", l3.longValue());
                            }
                            A0K.A0G();
                        }
                    }
                    A0K.A0F();
                }
                Long l4 = r10.A02;
                if (l4 != null) {
                    A0K.A0c("global", l4.longValue());
                }
                Long l5 = r10.A01;
                if (l5 != null) {
                    A0K.A0c(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, l5.longValue());
                }
                Long l6 = r10.A00;
                if (l6 != null) {
                    A0K.A0c("ttl", l6.longValue());
                }
                AnonymousClass3Za.A00(A0K, r10);
                C18180wK.A0v(edit, "qp_cooldown_response_json", C18180wK.A0h(A0K, A0d));
            } catch (IOException e) {
                C10450iM.A06("IG-QP", "failed to update QP cooldown response.", e);
                AnonymousClass49T.A01(userSession);
            }
        }
        C32165H8c h8c = (C32165H8c) this.A01;
        h8c.A00 = (C63873iU) this.A00;
        C31155GhB.A03(h8c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x028c, code lost:
        if (r0 == null) goto L_0x028e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r14) {
        /*
            r13 = this;
            int r0 = r13.A03
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0029;
                case 2: goto L_0x0048;
                case 3: goto L_0x005b;
                case 4: goto L_0x006e;
                case 5: goto L_0x00a2;
                case 6: goto L_0x00c9;
                case 7: goto L_0x00f0;
                case 8: goto L_0x0116;
                case 9: goto L_0x0147;
                case 10: goto L_0x0169;
                case 11: goto L_0x0175;
                case 12: goto L_0x018b;
                case 13: goto L_0x01a9;
                case 14: goto L_0x01c1;
                case 15: goto L_0x01ec;
                case 16: goto L_0x01fc;
                case 17: goto L_0x023e;
                case 18: goto L_0x0307;
                case 19: goto L_0x0321;
                case 20: goto L_0x0339;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onFail(r14)
            return
        L_0x0009:
            r0 = -2063123415(0xffffffff85073c29, float:-6.358719E-36)
            int r4 = X.AnonymousClass0wJ.A00(r0, r14)
            java.lang.Object r1 = r13.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r0 = r13.A01
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r0 = (com.instagram.api.schemas.ReelAutoArchiveSettingStr) r0
            r1.A1o(r0)
            java.lang.Object r0 = r13.A00
            X.3iU r0 = (X.C63873iU) r0
            if (r0 == 0) goto L_0x0024
            r0.onFail(r14)
        L_0x0024:
            r0 = -2114585894(0xffffffff81f5fada, float:-9.035874E-38)
            goto L_0x034b
        L_0x0029:
            r0 = 222697385(0xd4617a9, float:6.104194E-31)
            int r4 = X.AnonymousClass0wJ.A00(r0, r14)
            java.lang.Throwable r3 = r14.A01
            if (r3 == 0) goto L_0x0043
            java.lang.Object r0 = r13.A02
            X.37g r0 = (X.C564537g) r0
            X.3I4 r2 = r0.A00
            X.42T r1 = X.AnonymousClass42T.A00
            java.lang.String r0 = r3.getMessage()
            r2.A02(r1, r0)
        L_0x0043:
            r0 = -1500774842(0xffffffffa68bfe46, float:-9.713983E-16)
            goto L_0x034b
        L_0x0048:
            r0 = -1147504635(0xffffffffbb9a7805, float:-0.0047140145)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r13.A00
            android.content.Context r0 = (android.content.Context) r0
            X.C63813iO.A06(r0)
            r0 = -595206526(0xffffffffdc85de82, float:-3.01446575E17)
            goto L_0x034b
        L_0x005b:
            r0 = 2096897243(0x7cfc1cdb, float:1.04723525E37)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r13.A00
            android.content.Context r0 = (android.content.Context) r0
            X.C63813iO.A06(r0)
            r0 = -1674028190(0xffffffff9c385b62, float:-6.0998603E-22)
            goto L_0x034b
        L_0x006e:
            r0 = -415077839(0xffffffffe7426a31, float:-9.18098E23)
            int r4 = X.AnonymousClass0wJ.A00(r0, r14)
            java.lang.Object r1 = r13.A00
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131836513(0x7f113e61, float:1.9306195E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r3 = X.C63483hZ.A04(r14, r0)
            X.C04220Ms.A06(r3)
            java.lang.String r2 = X.C63483hZ.A02(r14)
            X.C04220Ms.A06(r2)
            java.lang.String r1 = X.C63483hZ.A01(r14)
            if (r1 != 0) goto L_0x0096
            java.lang.String r1 = "NO_INTERNET"
        L_0x0096:
            java.lang.Object r0 = r13.A01
            com.instagram.business.fragment.CategorySearchFragment r0 = (com.instagram.business.fragment.CategorySearchFragment) r0
            r0.CGJ(r3, r2, r1)
            r0 = 556874892(0x21313c8c, float:6.0050066E-19)
            goto L_0x034b
        L_0x00a2:
            r0 = -1920367168(0xffffffff8d8985c0, float:-8.475476E-31)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Throwable r1 = r14.A01
            if (r1 == 0) goto L_0x00b2
            java.lang.String r0 = "Failed to get RN checkpoint"
            X.C10450iM.A07(r0, r1)
        L_0x00b2:
            java.lang.Object r2 = r13.A00
            X.49w r2 = (X.C697449w) r2
            r0 = 0
            r2.A02 = r0
            java.lang.Object r1 = r13.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r13.A01
            X.3Xf r0 = (X.C62123Xf) r0
            X.C697449w.A00(r1, r2, r0)
            r0 = -470660642(0xffffffffe3f249de, float:-8.9388695E21)
            goto L_0x034b
        L_0x00c9:
            r0 = -2100533047(0xffffffff82cc68c9, float:-3.003525E-37)
            int r4 = X.C14030oh.A03(r0)
            r3 = 0
            X.C04220Ms.A0B(r14, r3)
            super.onFail(r14)
            java.lang.Object r0 = r13.A02
            android.content.Context r2 = X.C18240wQ.A0C(r0)
            r1 = 0
            r0 = 2131826172(0x7f1115fc, float:1.928522E38)
            X.C63813iO.A03(r2, r1, r0, r3)
            java.lang.Object r0 = r13.A01
            X.0i6 r0 = (X.C10300i6) r0
            X.AnonymousClass3LY.A01(r0)
            r0 = 951714949(0x38ba0485, float:8.870013E-5)
            goto L_0x034b
        L_0x00f0:
            r0 = 493592360(0x1d6b9f28, float:3.1184273E-21)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r13.A00
            com.instagram.igds.components.button.IgdsButton r0 = (com.instagram.igds.components.button.IgdsButton) r0
            r5 = 0
            r0.setLoading(r5)
            java.lang.Object r3 = r13.A02
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            r1 = 0
            r0 = 2131826051(0x7f111583, float:1.9284975E38)
            X.C63813iO.A03(r2, r1, r0, r5)
            X.C18180wK.A13(r3)
            r0 = -1803402282(0xffffffff948243d6, float:-1.3153402E-26)
            goto L_0x034b
        L_0x0116:
            r0 = 1486917524(0x58a08f94, float:1.41230819E15)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r13.A00
            X.3hX r2 = (X.C63473hX) r2
            java.lang.Object r1 = r13.A02
            X.3DE r1 = (X.AnonymousClass3DE) r1
            if (r1 == 0) goto L_0x0145
            java.lang.String r0 = "upgrade_screen_failed"
            r1.A04 = r0
        L_0x012b:
            r2.A08(r1)
            java.lang.Object r1 = r13.A01
            X.3GR r1 = (X.AnonymousClass3GR) r1
            java.lang.Throwable r0 = r14.A01
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = r0.getMessage()
        L_0x013a:
            r1.onFail(r0)
            r0 = -2121370636(0xffffffff818e73f4, float:-5.2328946E-38)
            goto L_0x034b
        L_0x0142:
            java.lang.String r0 = "gating_manager_unknown_error"
            goto L_0x013a
        L_0x0145:
            r1 = 0
            goto L_0x012b
        L_0x0147:
            r0 = -1085943266(0xffffffffbf45d21e, float:-0.7727374)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r13.A02
            X.3HF r0 = (X.AnonymousClass3HF) r0
            r0.A00()
            java.lang.Object r0 = r13.A00
            android.content.Context r3 = X.C18220wO.A0A(r0)
            r2 = 2131826851(0x7f1118a3, float:1.9286598E38)
            r1 = 0
            java.lang.String r0 = "onLocationDetailDirectMessage onFail"
            X.C63813iO.A03(r3, r0, r2, r1)
            r0 = 10123719(0x9a79c7, float:1.4186352E-38)
            goto L_0x034b
        L_0x0169:
            r0 = 87787373(0x53b876d, float:8.8175715E-36)
            int r4 = X.C14030oh.A03(r0)
            r0 = -1861886172(0xffffffff9105df24, float:-1.056061E-28)
            goto L_0x034b
        L_0x0175:
            r0 = 1602560911(0x5f85238f, float:1.9187338E19)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r13.A00
            X.3HV r1 = (X.AnonymousClass3HV) r1
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r1.A00 = r0
            r0 = 702405433(0x29dddb39, float:9.8524006E-14)
            goto L_0x034b
        L_0x018b:
            r0 = -24904074(0xfffffffffe83fe76, float:-8.772505E37)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Throwable r0 = r14.A01
            if (r0 == 0) goto L_0x01a6
            java.lang.String r1 = r0.getMessage()
        L_0x019a:
            java.lang.Object r0 = r13.A02
            X.3FL r0 = (X.AnonymousClass3FL) r0
            r0.A00(r1)
            r0 = 1521376544(0x5aae5d20, float:2.4539519E16)
            goto L_0x034b
        L_0x01a6:
            java.lang.String r1 = "unknown"
            goto L_0x019a
        L_0x01a9:
            r0 = -2088218087(0xffffffff83885219, float:-8.01221E-37)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r13.A01
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Boolean r1 = X.C18180wK.A0X()
            r0 = 0
            r2.invoke(r1, r0)
            r0 = 559189897(0x21548f89, float:7.201836E-19)
            goto L_0x034b
        L_0x01c1:
            r0 = 260780448(0xf8b31a0, float:1.3725573E-29)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r13.A00
            X.1dZ r3 = (X.AnonymousClass1dZ) r3
            android.content.Context r1 = r3.getContext()
            java.lang.String r0 = "Error loading QPs"
            X.C63813iO.A01(r1, r0)
            java.util.Set r2 = r3.A05
            java.lang.Object r0 = r13.A02
            r2.remove(r0)
            com.instagram.ui.widget.refresh.RefreshableListView r1 = r3.A04
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            r1.setIsLoading(r0)
            r0 = 439254222(0x1a2e7cce, float:3.6083173E-23)
            goto L_0x034b
        L_0x01ec:
            r0 = -1769212026(0xffffffff968bf786, float:-2.261287E-25)
            int r4 = X.C14030oh.A03(r0)
            r0 = 0
            r13.A00(r0)
            r0 = 1644609081(0x6206be39, float:6.213927E20)
            goto L_0x034b
        L_0x01fc:
            r0 = 128917163(0x7af1eab, float:2.6349098E-34)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r13.A00
            com.facebook.redex.IDxCListenerShape512S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape512S0100000_1_I2) r0
            java.lang.Object r5 = r0.A00
            X.4AX r5 = (X.AnonymousClass4AX) r5
            com.instagram.service.session.UserSession r0 = r5.A0E
            X.1tl r1 = X.AnonymousClass3WS.A01(r0)
            java.lang.Object r0 = r13.A02
            int r0 = X.AnonymousClass0wJ.A04(r0)
            switch(r0) {
                case 0: goto L_0x023b;
                case 1: goto L_0x0238;
                default: goto L_0x021a;
            }
        L_0x021a:
            java.lang.String r2 = "following"
        L_0x021c:
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r1)
            java.lang.String r0 = "reel_message_prefs"
            X.C18180wK.A0v(r1, r0, r2)
            android.content.Context r3 = r5.A0B
            r2 = 2131826851(0x7f1118a3, float:1.9286598E38)
            r1 = 0
            java.lang.String r0 = "setReelMessagePrefs_error"
            X.C63813iO.A03(r3, r0, r2, r1)
            X.AnonymousClass4AX.A04(r5)
            r0 = 1375944481(0x52033f21, float:1.40924961E11)
            goto L_0x034b
        L_0x0238:
            java.lang.String r2 = "anyone"
            goto L_0x021c
        L_0x023b:
            java.lang.String r2 = "off"
            goto L_0x021c
        L_0x023e:
            r0 = -247827506(0xfffffffff13a73ce, float:-9.232674E29)
            int r4 = X.C14030oh.A03(r0)
            r3 = 0
            X.C04220Ms.A0B(r14, r3)
            super.onFail(r14)
            java.lang.Object r2 = r13.A00
            X.3D3 r2 = (X.AnonymousClass3D3) r2
            if (r2 == 0) goto L_0x026e
            X.3DL r0 = r2.A04
            com.instagram.igds.components.button.IgdsButton r1 = r0.A09
            r1.setLoading(r3)
            r0 = 1
            r1.setEnabled(r0)
            X.CUV r0 = r2.A05
            X.CWS r0 = r0.A0B
            r0.notifyDataSetChanged()
            android.content.Context r2 = r2.A00
            r1 = 2131827439(0x7f111aef, float:1.928779E38)
            java.lang.String r0 = "feed_share_auto_xpost_upsell_failure"
            X.C63813iO.A03(r2, r0, r1, r3)
        L_0x026e:
            java.lang.Object r9 = r13.A02
            com.instagram.service.session.UserSession r9 = (com.instagram.service.session.UserSession) r9
            java.util.HashMap r11 = X.C67303zK.A02(r9)
            java.lang.Object r1 = r14.A00
            X.1TZ r1 = (X.AnonymousClass1TZ) r1
            r0 = 0
            if (r1 == 0) goto L_0x027f
            java.lang.String r0 = r1.A03
        L_0x027f:
            r8 = 1
            if (r0 == 0) goto L_0x02fe
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x02fe
            if (r1 == 0) goto L_0x028e
            java.lang.String r0 = r1.A03
        L_0x028c:
            if (r0 != 0) goto L_0x0290
        L_0x028e:
            java.lang.String r0 = ""
        L_0x0290:
            java.lang.String r1 = "error_message"
            r11.put(r1, r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r12 = X.C18200wM.A0P(r9)
            java.lang.String r2 = "server_fetch_failure"
            java.lang.String r1 = "event_name"
            r12.A0T(r1, r2)
            java.lang.String r2 = X.C04660Oo.A02(r9)
            java.lang.String r1 = "ig_account_type"
            r12.A0T(r1, r2)
            java.lang.Object r1 = r13.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r7 = X.C49202r0.A00(r1)
            java.lang.String r10 = "entry_point"
            java.lang.Boolean r6 = X.C18190wL.A0Z(r12, r10, r7, r3)
            java.lang.String r5 = "user_interaction"
            r12.A0Q(r5, r6)
            java.lang.String r3 = "debug_test_data"
            r12.A0V(r3, r11)
            r12.Bb4()
            boolean r1 = X.C62953bC.A04(r9)
            if (r1 != 0) goto L_0x02f3
            java.lang.String r1 = "Linked fb user has privacy risk."
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02f3
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "reason"
            r2.put(r0, r1)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18200wM.A0P(r9)
            java.lang.String r0 = "destination_picker_flag_set"
            X.C63873iU.A0B(r1, r9, r0)
            r1.A0T(r10, r7)
            r1.A0Q(r5, r6)
            r1.A0V(r3, r2)
            r1.Bb4()
            X.C62953bC.A03(r9, r8)
        L_0x02f3:
            X.49g r0 = X.C62173Xp.A00(r9)
            r0.A01(r7)
            r0 = 52599027(0x32298f3, float:4.77831E-37)
            goto L_0x034b
        L_0x02fe:
            java.lang.Throwable r0 = r14.A01
            if (r0 == 0) goto L_0x028e
            java.lang.String r0 = r0.getMessage()
            goto L_0x028c
        L_0x0307:
            r0 = -2108864352(0xffffffff824d48a0, float:-1.5081864E-37)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r13.A02
            X.BTX r0 = (X.BTX) r0
            androidx.fragment.app.FragmentActivity r3 = r0.A00
            java.lang.String r2 = "get_push_notification_setting_for_live_failed"
            r1 = 2131827947(0x7f111ceb, float:1.928882E38)
            r0 = 0
            X.C63813iO.A03(r3, r2, r1, r0)
            r0 = 1655281256(0x62a99668, float:1.5641688E21)
            goto L_0x034b
        L_0x0321:
            r0 = -1760362767(0xffffffff9712fef1, float:-4.7496926E-25)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r13.A01
            X.6jp r2 = (X.C109326jp) r2
            X.3iY r1 = X.C63893iY.A01
            java.lang.Object r0 = r13.A00
            X.601 r0 = (X.AnonymousClass601) r0
            X.C61043Rr.A00(r0, r1, r2)
            r0 = 666246656(0x27b61e00, float:5.0547674E-15)
            goto L_0x034b
        L_0x0339:
            r0 = 1660029569(0x62f20a81, float:2.2324345E21)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r13.A02
            android.content.Context r1 = (android.content.Context) r1
            r0 = 0
            X.C63813iO.A0E(r1, r0)
            r0 = -91717616(0xfffffffffa888010, float:-3.543749E35)
        L_0x034b:
            X.C14030oh.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2.onFail(X.3XX):void");
    }

    public final void onFailInBackground(C26743EUq eUq) {
        if (this.A03 != 0) {
            super.onFailInBackground(eUq);
            return;
        }
        int A002 = AnonymousClass0wJ.A00(72850390, eUq);
        C63873iU r0 = (C63873iU) this.A00;
        if (r0 != null) {
            r0.onFailInBackground(eUq);
        }
        C14030oh.A0A(-936571694, A002);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A03) {
            case 0:
                i = C14030oh.A03(1638675820);
                C63873iU r0 = (C63873iU) this.A00;
                if (r0 != null) {
                    r0.onFinish();
                }
                i2 = 931451157;
                break;
            case 4:
                i = C14030oh.A03(-960267287);
                ((CategorySearchFragment) this.A01).CGO();
                i2 = -1336131747;
                break;
            case 13:
                i = C14030oh.A03(624592712);
                E2V.A03((Activity) this.A00).setIsLoading(false);
                i2 = -1338419643;
                break;
            default:
                super.onFinish();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A03) {
            case 0:
                i = C14030oh.A03(326382319);
                C63873iU r0 = (C63873iU) this.A00;
                if (r0 != null) {
                    r0.onStart();
                }
                i2 = -1772195725;
                break;
            case 4:
                i = C14030oh.A03(406808165);
                ((CategorySearchFragment) this.A01).CGY();
                i2 = -1934511278;
                break;
            case 9:
                i = C14030oh.A03(1795612933);
                ((AnonymousClass3HF) this.A02).A01();
                i2 = -226099876;
                break;
            case 13:
                i = C14030oh.A03(-1473274373);
                E2V.A03((Activity) this.A00).setIsLoading(true);
                i2 = -1502608685;
                break;
            default:
                super.onStart();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0551, code lost:
        r7 = (X.AnonymousClass3BO) r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0bd0, code lost:
        X.C14030oh.A0A(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0bd3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0c81, code lost:
        X.C14030oh.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0c84, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x026b, code lost:
        if ("true".equals(r1.get("big_blue_token")) == false) goto L_0x026d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x09b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r42) {
        /*
            r41 = this;
            r1 = r41
            r0 = r42
            int r2 = r1.A03
            switch(r2) {
                case 0: goto L_0x000d;
                case 1: goto L_0x002f;
                case 2: goto L_0x0091;
                case 3: goto L_0x00e3;
                case 4: goto L_0x0141;
                case 5: goto L_0x0203;
                case 6: goto L_0x0353;
                case 7: goto L_0x03a5;
                case 8: goto L_0x040f;
                case 9: goto L_0x046a;
                case 10: goto L_0x0517;
                case 11: goto L_0x061f;
                case 12: goto L_0x066e;
                case 13: goto L_0x06d4;
                case 14: goto L_0x070c;
                case 15: goto L_0x0903;
                case 16: goto L_0x0921;
                case 17: goto L_0x094a;
                case 18: goto L_0x0b4d;
                case 19: goto L_0x0bf9;
                case 20: goto L_0x0c1e;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.onSuccess(r0)
            return
        L_0x000d:
            r2 = 82915879(0x4f13227, float:5.6704885E-36)
            int r2 = X.C14030oh.A03(r2)
            r3 = 790200731(0x2f19819b, float:1.3961314E-10)
            int r3 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r1 = r1.A00
            X.3iU r1 = (X.C63873iU) r1
            if (r1 == 0) goto L_0x0024
            r1.onSuccess(r0)
        L_0x0024:
            r0 = -1636869653(0xffffffff9e6f59eb, float:-1.2671149E-20)
            X.C14030oh.A0A(r0, r3)
            r0 = -1384434117(0xffffffffad7b363b, float:-1.427974E-11)
            goto L_0x0c81
        L_0x002f:
            r2 = 1810398676(0x6be87dd4, float:5.6213E26)
            int r7 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -1834856259(0xffffffff92a250bd, float:-1.0243541E-27)
            int r2 = X.AnonymousClass0wJ.A00(r2, r0)
            java.lang.Object r8 = r1.A02
            X.37g r8 = (X.C564537g) r8
            java.lang.Object r6 = r1.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2) r6
            java.lang.Object r5 = r1.A00
            X.4pI r5 = (X.C82234pI) r5
            r4 = 0
            java.lang.Object r3 = r0.A01
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x0082
            java.lang.Class<com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkLoggedOutWAMiddlewareQueryResponseImpl$XfbOneLinkLoggedOutWhatsappInfoMonoschema> r1 = com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkLoggedOutWAMiddlewareQueryResponseImpl.XfbOneLinkLoggedOutWhatsappInfoMonoschema.class
            java.lang.String r0 = "xfb_one_link_logged_out_whatsapp_info_monoschema(input:$input)"
            com.facebook.pando.TreeJNI r1 = r3.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0082
            java.lang.String r0 = "linked_whatsapp_phone_number"
            java.lang.String r1 = r1.getStringValue(r0)
            if (r1 == 0) goto L_0x006f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x006f
            X.3EH r4 = new X.3EH
            r4.<init>(r1)
        L_0x006f:
            X.33j r0 = new X.33j
            r0.<init>(r4)
            r5.onSuccess(r0)
        L_0x0077:
            r0 = 874719988(0x34232af4, float:1.5196184E-7)
            X.C14030oh.A0A(r0, r2)
            r0 = 1631764759(0x6142c117, float:2.2453637E20)
            goto L_0x0bd0
        L_0x0082:
            X.3I4 r1 = r8.A00
            X.42T r0 = X.AnonymousClass42T.A00
            r1.A01(r6, r0)
            java.lang.String r1 = "WhatsApp Business response is null."
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            goto L_0x0077
        L_0x0091:
            r2 = 1644664208(0x62079590, float:6.252719E20)
            int r7 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -775851613(0xffffffffd1c171a3, float:-1.03854399E11)
            int r3 = X.C14030oh.A03(r2)
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            java.lang.Object r0 = r0.A01
            X.4uJ r0 = (X.C84974uJ) r0
            r2 = 1
            if (r0 == 0) goto L_0x00d7
            X.4uI r0 = r0.BMX()
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r0.BEt()
            if (r0 != r2) goto L_0x00d7
            java.lang.Object r0 = r1.A02
            X.0i6 r0 = (X.C10300i6) r0
            X.KHq r2 = X.AnonymousClass3LY.A00(r0)
            java.lang.Object r1 = r1.A01
            X.BKU r1 = (X.BKU) r1
            X.46G r0 = new X.46G
            r0.<init>(r1)
            r2.CWx(r0)
        L_0x00cc:
            r0 = -1215716006(0xffffffffb789a55a, float:-1.640867E-5)
            X.C14030oh.A0A(r0, r3)
            r0 = -438970503(0xffffffffe5d5d779, float:-1.2622985E23)
            goto L_0x0bd0
        L_0x00d7:
            java.lang.Object r2 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            r1 = 0
            r0 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A03(r2, r1, r0, r4)
            goto L_0x00cc
        L_0x00e3:
            r2 = -1380755301(0xffffffffadb3589b, float:-2.0389293E-11)
            int r7 = X.C14030oh.A03(r2)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            r2 = -934438831(0xffffffffc84d9851, float:-210529.27)
            int r5 = X.C14030oh.A03(r2)
            r3 = 0
            X.C04220Ms.A0B(r0, r3)
            java.lang.Object r0 = r0.A01
            X.4uL r0 = (X.C84994uL) r0
            r2 = 1
            if (r0 == 0) goto L_0x0135
            X.4uK r0 = r0.BMY()
            if (r0 == 0) goto L_0x0135
            boolean r0 = r0.BEt()
            if (r0 != r2) goto L_0x0135
            java.lang.Object r4 = r1.A02
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            X.KHq r3 = X.AnonymousClass3LY.A00(r4)
            java.lang.Object r2 = r1.A01
            X.BKU r2 = (X.BKU) r2
            X.46G r0 = new X.46G
            r0.<init>(r2)
            r3.CWx(r0)
            r1 = 0
            X.BKN r0 = r2.A0f
            r0.A05 = r1
            X.Awj r0 = X.C19462Awj.A01(r4)
            r0.A03(r2)
        L_0x012a:
            r0 = -1310894512(0xffffffffb1dd5650, float:-6.441759E-9)
            X.C14030oh.A0A(r0, r5)
            r0 = 217262820(0xcf32ae4, float:3.7465892E-31)
            goto L_0x0bd0
        L_0x0135:
            java.lang.Object r2 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            r1 = 0
            r0 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A03(r2, r1, r0, r3)
            goto L_0x012a
        L_0x0141:
            r2 = -69831578(0xfffffffffbd67466, float:-2.2270247E36)
            int r7 = X.C14030oh.A03(r2)
            X.4vm r0 = (X.C85794vm) r0
            r2 = -936424477(0xffffffffc82f4be3, float:-179503.55)
            int r3 = X.C14030oh.A03(r2)
            r9 = 0
            X.C04220Ms.A0B(r0, r9)
            java.lang.Object r0 = r0.D7H()
            X.345 r0 = (X.AnonymousClass345) r0
            com.instagram.user.model.User r8 = r0.A00
            java.lang.Object r6 = r1.A02
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            X.KHq r5 = X.AnonymousClass3LY.A00(r6)
            java.lang.String r4 = r8.getId()
            r2 = 1
            X.46D r0 = new X.46D
            r0.<init>(r4)
            r5.CWx(r0)
            android.content.SharedPreferences$Editor r4 = X.C28161tl.A03(r6)
            java.lang.String r0 = "show_business_welcome_dialog"
            X.AnonymousClass0wJ.A13(r4, r0, r2)
            android.content.SharedPreferences$Editor r4 = X.C28161tl.A03(r6)
            java.lang.String r0 = "show_business_onboarding_check_list_tooltip"
            X.AnonymousClass0wJ.A13(r4, r0, r9)
            X.C18210wN.A1J(r6, r8)
            r8.A1t(r6)
            java.lang.Object r4 = r1.A01
            com.instagram.business.fragment.CategorySearchFragment r4 = (com.instagram.business.fragment.CategorySearchFragment) r4
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A05
            if (r0 == 0) goto L_0x01a8
            java.lang.String r9 = X.C18220wO.A0n(r4)
            r12 = 0
            java.lang.String r10 = r4.A0C
            java.lang.String r11 = "switch_to_professional"
            X.JrQ r8 = new X.JrQ
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.Bdx(r8)
        L_0x01a8:
            X.1ju r0 = r4.A09
            r0.A00()
            r4.AHz()
            X.0i6 r0 = r4.A0A
            boolean r0 = X.C67333zN.A01(r0)
            if (r0 == 0) goto L_0x01f8
            X.0i6 r0 = r4.A0A
            com.instagram.service.session.UserSession r6 = X.C05030Qo.A02(r0)
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.String r0 = r4.A0C
            X.C18210wN.A0x(r5, r0)
            java.lang.String r0 = "ARG_POP_TO_SELF_PROFILE_WHEN_DONE"
            r5.putBoolean(r0, r2)
            java.lang.String r0 = "ARG_DISABLE_BACK_BUTTON"
            r5.putBoolean(r0, r2)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1 = 2131306509(0x7f09280d, float:1.823122E38)
            X.42O r0 = new X.42O
            r0.<init>(r4)
            r2.put(r1, r0)
            X.Dd0 r0 = X.C62883b4.A01()
            X.DeW r1 = r0.A00()
            X.24p r0 = X.C311924p.SHORTENED_CREATOR_CONVERSION_FLOW
            androidx.fragment.app.Fragment r2 = r1.A00(r5, r2, r0, r6)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0i6 r0 = r4.A0A
            X.AnonymousClass0wJ.A19(r2, r1, r0)
        L_0x01f8:
            r0 = -1523961679(0xffffffffa52a30b1, float:-1.4761647E-16)
            X.C14030oh.A0A(r0, r3)
            r0 = -372688477(0xffffffffe9c939a3, float:-3.0408284E25)
            goto L_0x0bd0
        L_0x0203:
            r2 = 2092295604(0x7cb5e5b4, float:7.555717E36)
            int r2 = X.C14030oh.A03(r2)
            X.1qv r0 = (X.C26611qv) r0
            r3 = -345758912(0xffffffffeb642340, float:-2.7580155E26)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r10 = r1.A00
            X.49w r10 = (X.C697449w) r10
            boolean r3 = r10.A04
            if (r3 != 0) goto L_0x0227
            java.lang.String r5 = r0.A02
            if (r5 == 0) goto L_0x0235
            java.lang.String r3 = "close"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0235
        L_0x0227:
            r0 = 0
            r10.A02 = r0
            r0 = -1919426367(0xffffffff8d97e0c1, float:-9.360201E-31)
        L_0x022d:
            X.C14030oh.A0A(r0, r4)
            r0 = -1198388860(0xffffffffb8920984, float:-6.963595E-5)
            goto L_0x0c81
        L_0x0235:
            java.lang.String r14 = r0.A08
            X.AnonymousClass322.A01 = r14
            java.lang.String r15 = r0.A06
            X.AnonymousClass322.A00 = r15
            java.lang.String r3 = r0.A05
            X.AnonymousClass322.A02 = r3
            java.lang.Integer r6 = r0.A00
            java.lang.Integer r5 = X.AnonymousClass006.A0N
            if (r6 != r5) goto L_0x027d
            java.lang.Object r11 = r1.A02
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r12 = r1.A01
            X.3Xf r12 = (X.C62123Xf) r12
            java.lang.String r13 = r0.A03
            java.lang.String r5 = r0.A04
            java.util.HashMap r1 = r0.A09
            if (r1 != 0) goto L_0x025d
            java.util.Map r1 = java.util.Collections.emptyMap()
            if (r1 == 0) goto L_0x026d
        L_0x025d:
            java.lang.String r0 = "big_blue_token"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            r18 = 1
            if (r0 != 0) goto L_0x026f
        L_0x026d:
            r18 = 0
        L_0x026f:
            r16 = r5
            r17 = r3
            r10.A03(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0276:
            r0 = 0
            r10.A02 = r0
            r0 = -1751974693(0xffffffff9792fcdb, float:-9.498859E-25)
            goto L_0x022d
        L_0x027d:
            java.lang.Integer r3 = X.AnonymousClass006.A0Y
            if (r6 != r3) goto L_0x02be
            java.lang.Object r8 = r1.A02
            java.lang.Object r9 = r1.A01
            java.lang.String r7 = r0.A03
            java.lang.Long r1 = r0.A01
            r0 = 1
            r10.A02 = r0
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            if (r1 == 0) goto L_0x029b
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "enrollment_id"
            r6.put(r0, r1)
        L_0x029b:
            java.lang.String r5 = X.C18180wK.A0e()
            r3 = 21
            r1 = 10
            r0 = 110(0x6e, float:1.54E-43)
            java.lang.String r0 = X.AnonymousClass3QD.A00(r3, r1, r0)
            r6.put(r0, r5)
            r0 = 4
            com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2 r1 = new com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2
            r1.<init>(r0, r8, r10, r9)
            X.0i6 r0 = r10.A06
            X.4A9 r0 = X.C63263h8.A00(r0, r7, r6)
            r0.A00 = r1
            X.C31155GhB.A03(r0)
            goto L_0x0276
        L_0x02be:
            java.lang.Integer r3 = X.AnonymousClass006.A01
            java.lang.Object r5 = r1.A02
            android.content.Context r5 = (android.content.Context) r5
            if (r6 != r3) goto L_0x02d9
            java.lang.String r1 = r0.A07
            java.lang.Integer r3 = X.C34642Ki.A00(r1)
            java.util.HashMap r1 = r0.A09
            if (r1 != 0) goto L_0x02d4
            java.util.Map r1 = java.util.Collections.emptyMap()
        L_0x02d4:
            r0 = 0
            r10.A04(r5, r3, r0, r1)
            goto L_0x0276
        L_0x02d9:
            X.0i6 r6 = r10.A06
            java.lang.String r8 = r0.A07
            java.util.HashMap r0 = r0.A09
            if (r0 != 0) goto L_0x02e5
            java.util.Map r0 = java.util.Collections.emptyMap()
        L_0x02e5:
            monitor-enter(r10)
            android.os.Bundle r7 = X.C18180wK.A06()     // Catch:{ all -> 0x0350 }
            java.util.Iterator r3 = X.AnonymousClass0wJ.A0z(r0)     // Catch:{ all -> 0x0350 }
        L_0x02ee:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x0304
            java.util.Map$Entry r0 = X.C18180wK.A0o(r3)     // Catch:{ all -> 0x0350 }
            java.lang.String r1 = X.C18200wM.A0p(r0)     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = X.C18230wP.A0u(r0)     // Catch:{ all -> 0x0350 }
            r7.putString(r1, r0)     // Catch:{ all -> 0x0350 }
            goto L_0x02ee
        L_0x0304:
            android.os.Bundle r3 = X.C18180wK.A06()     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = "screenName"
            r3.putString(r0, r8)     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = "screenData"
            r3.putBundle(r0, r7)     // Catch:{ all -> 0x0350 }
            java.lang.String r1 = "countryCode"
            java.util.Locale r0 = X.C31103Gfm.A02()     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = r0.getCountry()     // Catch:{ all -> 0x0350 }
            r3.putString(r1, r0)     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = "userId"
            r3.putString(r0, r14)     // Catch:{ all -> 0x0350 }
            boolean r0 = r10.A03     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x034d
            X.C63343hJ.getInstance()     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = "CheckpointApp"
            X.4Ja r1 = new X.4Ja     // Catch:{ all -> 0x0350 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x0350 }
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0350 }
            r1.A02 = r0     // Catch:{ all -> 0x0350 }
            r1.Cod(r3)     // Catch:{ all -> 0x0350 }
            r3 = 1
            r1.A0A = r3     // Catch:{ all -> 0x0350 }
            boolean r1 = r1.BaN(r5)     // Catch:{ all -> 0x0350 }
            boolean r0 = r10.A04     // Catch:{ all -> 0x0350 }
            if (r0 != 0) goto L_0x034b
            if (r1 != 0) goto L_0x034b
            r3 = 0
        L_0x034b:
            r10.A04 = r3     // Catch:{ all -> 0x0350 }
        L_0x034d:
            monitor-exit(r10)
            goto L_0x0276
        L_0x0350:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0353:
            r2 = -1807413557(0xffffffff94450ecb, float:-9.948876E-27)
            int r2 = X.C14030oh.A03(r2)
            r3 = -322086578(0xffffffffeccd594e, float:-1.9860122E27)
            int r6 = X.C14030oh.A03(r3)
            r3 = 0
            X.C04220Ms.A0B(r0, r3)
            super.onSuccess(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            X.C62423Zt.A02(r5)
            java.lang.Object r0 = r1.A00
            X.0kW r0 = (X.C11630kW) r0
            X.AnonymousClass3h4.A05(r0, r5, r3)
            java.lang.String r4 = "contact_settings"
            X.0nS r1 = X.C13330nS.A01(r0, r5)
            java.lang.String r0 = "disconnect_contacts_import"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 556(0x22c, float:7.79E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            X.C18210wN.A1B(r3, r4)
            java.lang.Boolean r1 = X.C18180wK.A0Y()
            java.lang.String r0 = "is_user_initiated"
            r3.A0Q(r0, r1)
            r3.Bb4()
            X.AnonymousClass3LY.A01(r5)
            r0 = 1989574086(0x76967dc6, float:1.5261631E33)
            X.C14030oh.A0A(r0, r6)
            r0 = -1594029616(0xffffffffa0fd09d0, float:-4.286636E-19)
            goto L_0x0c81
        L_0x03a5:
            r0 = 74382164(0x46efb54, float:2.809217E-36)
            int r2 = X.C14030oh.A03(r0)
            r0 = 259716807(0xf7af6c7, float:1.2373479E-29)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A00
            com.instagram.igds.components.button.IgdsButton r0 = (com.instagram.igds.components.button.IgdsButton) r0
            r5 = 0
            r0.setLoading(r5)
            java.lang.Object r4 = r1.A02
            X.1dU r4 = (X.AnonymousClass1dU) r4
            X.0Oa r0 = r4.A04
            r0.getValue()
            r0 = 1
            r4.A02 = r0
            X.34H r0 = r4.A01
            if (r0 == 0) goto L_0x0401
            X.1of r1 = r0.A00
            X.0Oa r0 = r1.A06
            com.instagram.service.session.UserSession r7 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r1.A01
            java.lang.String r8 = X.C18200wM.A0q(r0)
            X.0Oa r0 = r1.A02
            java.lang.String r9 = X.C18200wM.A0q(r0)
            X.0Oa r0 = r1.A00
            java.lang.Object r0 = r0.getValue()
            int r10 = X.AnonymousClass0wJ.A04(r0)
            X.4Bj r6 = new X.4Bj
            r6.<init>(r1)
            X.C04220Ms.A0B(r7, r5)
            if (r8 == 0) goto L_0x0401
            X.H8c r0 = X.AnonymousClass2NS.A00(r7, r8)
            X.1UN r5 = new X.1UN
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A00 = r5
            X.C31155GhB.A03(r0)
        L_0x0401:
            X.C18180wK.A13(r4)
            r0 = 1106557496(0x41f4ba38, float:30.590927)
            X.C14030oh.A0A(r0, r3)
            r0 = 10149946(0x9ae03a, float:1.4223104E-38)
            goto L_0x0c81
        L_0x040f:
            r2 = -35725828(0xfffffffffddeddfc, float:-3.7030153E37)
            int r2 = X.C14030oh.A03(r2)
            X.1SA r0 = (X.AnonymousClass1SA) r0
            r3 = 1842280206(0x6dcef70e, float:8.006573E27)
            int r6 = X.C14030oh.A03(r3)
            java.lang.Object r7 = r1.A00
            X.3hX r7 = (X.C63473hX) r7
            X.1tl r3 = r7.A03
            boolean r4 = r0.A00
            android.content.SharedPreferences r5 = r3.A00
            android.content.SharedPreferences$Editor r3 = r5.edit()
            java.lang.String r0 = "has_interop_enable"
            X.AnonymousClass0wJ.A13(r3, r0, r4)
            r4 = 0
            android.content.SharedPreferences$Editor r3 = r5.edit()
            java.lang.String r0 = "has_been_xac_auto_upgraded"
            X.AnonymousClass0wJ.A13(r3, r0, r4)
            X.KHq r3 = r7.A01
            r7.A06()
            X.45j r0 = new X.45j
            r0.<init>()
            r3.CWx(r0)
            java.lang.Object r0 = r1.A01
            X.3GR r0 = (X.AnonymousClass3GR) r0
            r0.onSuccess()
            java.lang.Object r1 = r1.A02
            X.3DE r1 = (X.AnonymousClass3DE) r1
            if (r1 == 0) goto L_0x0468
            java.lang.String r0 = "upgrade_screen_finished"
            r1.A04 = r0
        L_0x045a:
            r7.A08(r1)
            r0 = -2066508255(0xffffffff84d39621, float:-4.9743733E-36)
            X.C14030oh.A0A(r0, r6)
            r0 = 1181358050(0x466a17e2, float:14981.971)
            goto L_0x0c81
        L_0x0468:
            r1 = 0
            goto L_0x045a
        L_0x046a:
            r0 = 1693699078(0x64f3cc06, float:3.5978082E22)
            int r2 = X.C14030oh.A03(r0)
            r0 = -1223017602(0xffffffffb71a3b7e, float:-9.192967E-6)
            int r7 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r1.A02
            X.3HF r0 = (X.AnonymousClass3HF) r0
            r0.A00()
            java.lang.Object r3 = r1.A00
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r3 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r3
            X.3yl r6 = r3.A0H
            android.view.View r0 = r3.requireView()
            r0.getHeight()
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.C31164GhX.A01(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.discovery.mediamap.model.MediaMapPin r3 = (com.instagram.discovery.mediamap.model.MediaMapPin) r3
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r5 = r6.A01
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x04fa
            X.DrH r9 = X.C18220wO.A0b(r1)
            r9.getClass()
            r0 = 2
            X.C18240wQ.A1K(r6, r0, r9)
            r4 = 0
            com.facebook.redex.IDxCListenerShape280S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape280S0200000_1_I2
            r0.<init>(r4, r1, r6)
            r9.A0A(r0)
            com.instagram.discovery.mediamap.model.LocationPageInformation r0 = r3.A06
            if (r0 == 0) goto L_0x0505
            com.instagram.user.model.User r0 = r0.A00()
            if (r0 == 0) goto L_0x0505
            java.lang.String r8 = r0.getId()
            com.instagram.service.session.UserSession r6 = r6.A02
            android.content.Context r3 = r5.requireContext()
            X.06E r1 = X.AnonymousClass06E.A00(r5)
            X.C18180wK.A1P(r6, r4, r8)
            r0 = 34
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r5 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2
            r5.<init>(r0, r6, r9)
            X.H8Q r4 = new X.H8Q
            r4.<init>(r3, r1)
            X.H1T r3 = X.AnonymousClass0wJ.A0P(r6)
            X.C18250wR.A17(r3, r8)
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "location_page"
            r3.A0O(r1, r0)
            java.lang.String r0 = "business/account/validate_share_business_profile_via_story/"
            r3.A0J(r0)
            java.lang.Class<X.1SU> r1 = X.AnonymousClass1SU.class
            java.lang.Class<X.3OB> r0 = X.AnonymousClass3OB.class
            X.H8c r0 = X.AnonymousClass0wJ.A0T(r3, r1, r0)
            r0.A00 = r5
            r4.schedule(r0)
        L_0x04fa:
            r0 = 1089568127(0x40f17d7f, float:7.5465693)
            X.C14030oh.A0A(r0, r7)
            r0 = 1039760046(0x3df97aae, float:0.121816024)
            goto L_0x0c81
        L_0x0505:
            com.instagram.service.session.UserSession r3 = r6.A02
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320708766210231(0x81097e000018b7, double:3.0327007032820135E-306)
            boolean r1 = X.C63803iN.A0E(r2, r3, r0)
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x0517:
            r2 = 1510524159(0x5a08c4ff, float:9.6242991E15)
            int r2 = X.C14030oh.A03(r2)
            X.1SH r0 = (X.AnonymousClass1SH) r0
            r3 = -892075303(0xffffffffcad402d9, float:-6947180.5)
            int r6 = X.C14030oh.A03(r3)
            java.util.List r3 = r0.A00
            if (r3 == 0) goto L_0x05f6
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            if (r3 == 0) goto L_0x05f6
            java.util.List r3 = r0.A00
            if (r3 == 0) goto L_0x05f3
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
        L_0x0539:
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x05f6
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x05f0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x0547:
            java.util.Iterator r11 = r0.iterator()
        L_0x054b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x05fa
            java.lang.Object r7 = r11.next()
            X.3BO r7 = (X.AnonymousClass3BO) r7
            java.util.List r0 = r7.A03
            if (r0 == 0) goto L_0x05fa
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x05fa
            X.37y r0 = r7.A01
            if (r0 == 0) goto L_0x05fa
            java.util.List r0 = r7.A03
            if (r0 == 0) goto L_0x05ed
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x056d:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x05fa
            X.37y r0 = r7.A01
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x05fa
            java.util.List r0 = r7.A03
            if (r0 == 0) goto L_0x05eb
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x0581:
            java.util.Iterator r10 = r0.iterator()
        L_0x0585:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x054b
            java.lang.Object r5 = r10.next()
            X.3AC r5 = (X.AnonymousClass3AC) r5
            X.3DU r0 = r5.A00
            if (r0 == 0) goto L_0x054b
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x054b
            java.lang.Object r8 = r1.A00
            X.3HV r8 = (X.AnonymousClass3HV) r8
            X.44X r4 = X.AnonymousClass44X.A00()
            java.lang.Object r3 = r1.A02
            X.0i6 r3 = (X.C10300i6) r3
            java.lang.String r0 = "ig_android_growth_fx_access_fb_ig_autocomplete"
            java.lang.String r4 = r4.A03(r3, r0)
            X.3DU r3 = r5.A00
            X.37y r0 = r7.A01
            java.lang.String r0 = r0.A01
            X.1s2 r5 = new X.1s2
            r5.<init>(r3, r4, r0)
            java.util.List r0 = r8.mFacebookAutoCompleteAccountList
            java.util.Iterator r9 = r0.iterator()
        L_0x05bc:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x05e5
            java.lang.Object r3 = r9.next()
            X.1s2 r3 = (X.C27141s2) r3
            X.3DU r0 = r3.A00
            java.lang.String r4 = r0.A0F
            if (r4 == 0) goto L_0x05bc
            java.lang.String r3 = r3.A02
            if (r3 == 0) goto L_0x05bc
            X.3DU r0 = r5.A00
            java.lang.String r0 = r0.A0F
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x05bc
            java.lang.String r0 = r5.A02
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x05bc
            goto L_0x0585
        L_0x05e5:
            java.util.List r0 = r8.mFacebookAutoCompleteAccountList
            r0.add(r5)
            goto L_0x0585
        L_0x05eb:
            r0 = 0
            goto L_0x0581
        L_0x05ed:
            r0 = 0
            goto L_0x056d
        L_0x05f0:
            r0 = 0
            goto L_0x0547
        L_0x05f3:
            r3 = 0
            goto L_0x0539
        L_0x05f6:
            r0 = 906280941(0x3604bfed, float:1.9781248E-6)
            goto L_0x0617
        L_0x05fa:
            java.lang.Object r4 = r1.A00
            X.3HV r4 = (X.AnonymousClass3HV) r4
            java.lang.Object r3 = r1.A01
            X.4w3 r3 = (X.C85964w3) r3
            java.lang.Object r0 = r1.A02
            X.0i6 r0 = (X.C10300i6) r0
            r4.A01(r0, r3)
            X.KHr r3 = X.C38040KHr.A01
            r1 = 0
            X.45H r0 = new X.45H
            r0.<init>(r1)
            r3.CWx(r0)
            r0 = 1456122983(0x56caac67, float:1.11420906E14)
        L_0x0617:
            X.C14030oh.A0A(r0, r6)
            r0 = 1765651637(0x693db4b5, float:1.4333772E25)
            goto L_0x0c81
        L_0x061f:
            r2 = -2138640032(0xffffffff8086f160, float:-1.2392546E-38)
            int r2 = X.C14030oh.A03(r2)
            X.1SK r0 = (X.AnonymousClass1SK) r0
            r3 = -1085362952(0xffffffffbf4eacf8, float:-0.8073268)
            int r7 = X.C14030oh.A03(r3)
            java.util.List r0 = r0.A00
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r5 = r0.iterator()
        L_0x0639:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0652
            java.lang.Object r0 = r5.next()
            X.38K r0 = (X.AnonymousClass38K) r0
            X.3DU r4 = r0.A00
            java.lang.String r3 = r0.A01
            X.1s1 r0 = new X.1s1
            r0.<init>(r4, r3)
            r6.add(r0)
            goto L_0x0639
        L_0x0652:
            java.lang.Object r4 = r1.A00
            X.3HV r4 = (X.AnonymousClass3HV) r4
            r4.A00 = r6
            java.lang.Object r3 = r1.A01
            X.4w3 r3 = (X.C85964w3) r3
            java.lang.Object r0 = r1.A02
            X.0i6 r0 = (X.C10300i6) r0
            r4.A01(r0, r3)
            r0 = -773839023(0xffffffffd1e02751, float:-1.20341537E11)
            X.C14030oh.A0A(r0, r7)
            r0 = 1629635723(0x6122448b, float:1.8708197E20)
            goto L_0x0c81
        L_0x066e:
            r2 = -2054850567(0xffffffff858577f9, float:-1.2551331E-35)
            int r2 = X.C14030oh.A03(r2)
            java.lang.String r0 = (java.lang.String) r0
            r3 = -549177011(0xffffffffdf44394d, float:-1.4139417E19)
            int r5 = X.C14030oh.A03(r3)
            java.lang.Object r4 = r1.A00
            X.3SY r4 = (X.AnonymousClass3SY) r4
            X.3FL r3 = r4.A00
            if (r3 != 0) goto L_0x0691
            r0 = -578401393(0xffffffffdd864b8f, float:-1.20962318E18)
        L_0x0689:
            X.C14030oh.A0A(r0, r5)
            r0 = 1009869749(0x3c3163b5, float:0.010826995)
            goto L_0x0c81
        L_0x0691:
            java.lang.Object r1 = r1.A01
            android.content.Context r1 = (android.content.Context) r1
            boolean r1 = X.AnonymousClass0fO.A00(r1)
            if (r1 == 0) goto L_0x06cf
            java.lang.String r6 = X.AnonymousClass3XK.A01(r0)
        L_0x069f:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x06c7
            X.3FL r4 = r4.A00
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            X.6jp r3 = r4.A02
            java.lang.String r1 = "success"
            X.3HX r0 = r4.A00
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r1, r0}
            java.util.List r0 = X.C06750aI.A17(r0)
            X.3iY r1 = new X.3iY
            r1.<init>(r0)
            X.601 r0 = r4.A01
            X.C61043Rr.A00(r0, r1, r3)
        L_0x06c3:
            r0 = -253773186(0xfffffffff0dfba7e, float:-5.539249E29)
            goto L_0x0689
        L_0x06c7:
            X.3FL r1 = r4.A00
            java.lang.String r0 = "parse_error"
            r1.A00(r0)
            goto L_0x06c3
        L_0x06cf:
            java.lang.String r6 = X.AnonymousClass3XK.A00(r0)
            goto L_0x069f
        L_0x06d4:
            r2 = 770498264(0x2decded8, float:2.6929056E-11)
            int r2 = X.C14030oh.A03(r2)
            X.1Ti r0 = (X.C22091Ti) r0
            r3 = 2094803027(0x7cdc2853, float:9.1449854E36)
            int r5 = X.AnonymousClass0wJ.A00(r3, r0)
            java.lang.Object r3 = r1.A02
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.Dnj r4 = X.AnonymousClass6VR.A00(r3)
            com.instagram.user.model.User r3 = r0.A00
            X.C04220Ms.A06(r3)
            r4.A04(r3)
            java.lang.Object r3 = r1.A01
            X.0YP r3 = (X.AnonymousClass0YP) r3
            java.lang.Boolean r1 = X.C18180wK.A0Y()
            com.instagram.user.model.User r0 = r0.A00
            r3.invoke(r1, r0)
            r0 = 626046495(0x2550b61f, float:1.8102829E-16)
            X.C14030oh.A0A(r0, r5)
            r0 = 546556680(0x2093cb08, float:2.5037123E-19)
            goto L_0x0c81
        L_0x070c:
            r2 = -567213786(0xffffffffde310126, float:-3.18862935E18)
            int r7 = X.C14030oh.A03(r2)
            X.64g r0 = (X.C963064g) r0
            r2 = -2082357816(0xffffffff83e1bdc8, float:-1.3267883E-36)
            int r20 = X.C14030oh.A03(r2)
            java.lang.Object r4 = r1.A00
            X.1dZ r4 = (X.AnonymousClass1dZ) r4
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r10 = r1.A02
            com.instagram.quickpromotion.intf.QuickPromotionSlot r10 = (com.instagram.quickpromotion.intf.QuickPromotionSlot) r10
            java.util.HashMap r19 = X.AnonymousClass0wJ.A0y()
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r37 = r12.toSeconds(r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r35 = r12.toSeconds(r2)
            java.util.List r2 = X.M5W.A01(r10)
            java.util.Iterator r18 = r2.iterator()
        L_0x0742:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x08a1
            java.lang.Object r5 = r18.next()
            X.Lct r5 = (X.C40337Lct) r5
            com.instagram.quickpromotion.intf.QuickPromotionSurface r2 = r5.A00
            r40 = r2
            java.util.List r2 = r0.A00(r2)
            if (r2 == 0) goto L_0x0742
            r2 = r40
            java.util.List r3 = r0.A00(r2)
            if (r3 == 0) goto L_0x0742
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0742
            java.util.Iterator r17 = r3.iterator()
        L_0x076a:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x0742
            java.lang.Object r6 = r17.next()
            X.3Cq r6 = (X.C57833Cq) r6
            X.3EU r8 = r4.A01
            com.instagram.service.session.UserSession r3 = r4.A03
            java.util.EnumSet r2 = r5.A01
            java.lang.Class<X.268> r9 = X.AnonymousClass268.class
            java.util.EnumSet r34 = java.util.EnumSet.allOf(r9)
            r13 = 0
            android.content.Context r29 = r4.getContext()
            r28 = r8
            r30 = r40
            r31 = r6
            r32 = r3
            r33 = r2
            r39 = r13
            X.3aJ r8 = r28.A00(r29, r30, r31, r32, r33, r34, r35, r37, r39)
            X.3GI r9 = r6.A02
            java.lang.String r14 = r9.A05
            boolean r2 = r8.A02
            if (r2 == 0) goto L_0x088b
            boolean r2 = r8.A01
            if (r2 != 0) goto L_0x088b
            java.lang.Long r2 = r6.A03
            if (r2 == 0) goto L_0x089d
            long r15 = r2.longValue()
        L_0x07ab:
            X.38p r2 = r6.A01
            if (r2 == 0) goto L_0x0892
            java.lang.Long r2 = r2.A00
            if (r2 == 0) goto L_0x0892
            long r2 = r2.longValue()
        L_0x07b7:
            X.3XY r11 = X.AnonymousClass3XY.A01()
            com.instagram.service.session.UserSession r8 = r4.A03
            java.lang.String r8 = r8.getUserId()
            X.3Ye r8 = X.AnonymousClass3XY.A00(r11, r8, r14)
            if (r8 != 0) goto L_0x07d4
            com.instagram.service.session.UserSession r8 = r4.A03
            java.lang.String r11 = r8.getUserId()
            java.lang.String r9 = r9.A05
            X.3Ye r8 = new X.3Ye
            r8.<init>(r11, r9, r2)
        L_0x07d4:
            X.3GI r11 = r6.A02
            com.instagram.service.session.UserSession r9 = r4.A03
            java.lang.String r25 = r9.getUserId()
            java.util.List r9 = r11.A06
            r9.getClass()
            java.lang.Object r9 = r9.get(r13)
            X.1tt r9 = (X.C28221tt) r9
            int r15 = r6.A00
            boolean r6 = r6.A04
            r27 = 0
            r21 = r40
            r22 = r9
            r23 = r11
            r24 = r8
            r26 = r15
            r29 = r2
            r31 = r27
            r33 = r13
            r34 = r6
            X.1u0 r3 = X.C36802Ss.A00(r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r34)
            X.0Oa r2 = X.C61563Ua.A03
            java.lang.Object r2 = r2.getValue()
            X.3Ua r2 = (X.C61563Ua) r2
            java.util.List r6 = r3.A0F
            java.util.EnumSet r9 = java.util.EnumSet.copyOf(r6)
            com.instagram.quickpromotion.intf.QuickPromotionSurface r6 = r3.A06
            int r6 = r6.A00
            java.lang.String r8 = java.lang.Integer.toString(r6)
            android.content.Context r22 = X.C18230wP.A0A(r4)
            com.instagram.service.session.UserSession r6 = r4.A03
            r23 = 0
            X.C04220Ms.A0B(r9, r13)
            X.AnonymousClass0wJ.A1P(r8, r6)
            r21 = r2
            r24 = r6
            r25 = r8
            r26 = r9
            X.1Pw r8 = r21.A00(r22, r23, r24, r25, r26, r27)
            X.38k r6 = r4.A02
            com.instagram.service.session.UserSession r9 = r4.A03
            X.3Vz r2 = X.C36622Sa.A00()
            X.44Y r11 = r2.A02(r9)
            X.3EB r6 = r6.A00
            X.18L r2 = new X.18L
            r2.<init>(r3)
            X.3DC r2 = r6.A00(r8, r2)
            X.3aJ r8 = X.C62573aJ.A01(r2)
            boolean r2 = r8.A02
            if (r2 != 0) goto L_0x085c
            java.lang.String r6 = r8.A00
            java.lang.String r2 = "In holdout"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x088b
        L_0x085c:
            com.instagram.quickpromotion.intf.QuickPromotionSurface r9 = r3.A06
            java.lang.String r6 = r3.A0D
            java.lang.String r3 = r3.A0C
            X.C18200wM.A1S(r9, r6)
            java.lang.String r2 = "qp_exposure"
            X.0rn r2 = X.C15730rn.A00(r11, r2)
            com.instagram.service.session.UserSession r13 = r11.A00
            int r9 = r9.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.String r9 = "nux_id"
            r2.A08(r11, r9)
            java.lang.String r9 = "promotion_id"
            r2.A0D(r9, r6)
            if (r3 == 0) goto L_0x0884
            java.lang.String r6 = "instance_log_data"
            r2.A0D(r6, r3)
        L_0x0884:
            X.0kZ r3 = X.C12090lI.A00(r13)
            r3.Ce1(r2)
        L_0x088b:
            r2 = r19
            r2.put(r14, r8)
            goto L_0x076a
        L_0x0892:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r12.toSeconds(r2)
            long r2 = r2 + r15
            goto L_0x07b7
        L_0x089d:
            r15 = 0
            goto L_0x07ab
        L_0x08a1:
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.util.List r2 = X.M5W.A01(r10)
            java.util.Iterator r5 = r2.iterator()
        L_0x08ad:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x08c9
            java.lang.Object r3 = r5.next()
            X.Lct r3 = (X.C40337Lct) r3
            com.instagram.quickpromotion.intf.QuickPromotionSurface r2 = r3.A00
            java.util.List r2 = r0.A00(r2)
            if (r2 != 0) goto L_0x08c5
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x08c5:
            r6.put(r3, r2)
            goto L_0x08ad
        L_0x08c9:
            X.3vj r3 = r4.A00
            java.lang.Object r1 = r1.A01
            java.io.File r1 = (java.io.File) r1
            X.3HO r2 = new X.3HO
            r0 = r19
            r2.<init>(r10, r1, r0, r6)
            java.util.List r1 = r3.A02
            r1.remove(r2)
            r1.add(r2)
            java.util.Comparator r0 = r3.A01
            java.util.Collections.sort(r1, r0)
            X.C65763vj.A00(r3)
            java.util.Set r0 = r4.A05
            r0.remove(r10)
            com.instagram.ui.widget.refresh.RefreshableListView r1 = r4.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1.setIsLoading(r0)
            r1 = -129611755(0xfffffffff8464815, float:-1.6086512E34)
            r0 = r20
            X.C14030oh.A0A(r1, r0)
            r0 = -810738344(0xffffffffcfad1d58, float:-5.8087629E9)
            goto L_0x0bd0
        L_0x0903:
            r2 = 1898680438(0x712b9076, float:8.495453E29)
            int r2 = X.C14030oh.A03(r2)
            X.1UI r0 = (X.AnonymousClass1UI) r0
            r3 = -1217850905(0xffffffffb76911e7, float:-1.389205E-5)
            int r3 = X.C14030oh.A03(r3)
            r1.A00(r0)
            r0 = -1956680810(0xffffffff8b5f6b96, float:-4.3029176E-32)
            X.C14030oh.A0A(r0, r3)
            r0 = 1545407784(0x5c1d0d28, float:1.76824147E17)
            goto L_0x0c81
        L_0x0921:
            r2 = 1559507240(0x5cf43128, float:5.49871537E17)
            int r2 = X.C14030oh.A03(r2)
            r3 = 1999475311(0x772d926f, float:3.5204585E33)
            int r3 = X.C14030oh.A03(r3)
            super.onSuccess(r0)
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxCListenerShape512S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape512S0100000_1_I2) r0
            java.lang.Object r0 = r0.A00
            X.4AX r0 = (X.AnonymousClass4AX) r0
            com.instagram.service.session.UserSession r0 = r0.A0E
            X.C62423Zt.A02(r0)
            r0 = -1652642489(0xffffffff9d7ead47, float:-3.3706202E-21)
            X.C14030oh.A0A(r0, r3)
            r0 = -1786991706(0xffffffff957caba6, float:-5.10264E-26)
            goto L_0x0c81
        L_0x094a:
            r2 = -1969347691(0xffffffff8a9e2395, float:-1.5228231E-32)
            int r7 = X.C14030oh.A03(r2)
            X.1TZ r0 = (X.AnonymousClass1TZ) r0
            r2 = -2103599593(0xffffffff829d9e17, float:-2.3159816E-37)
            int r2 = X.C14030oh.A03(r2)
            r8 = 0
            X.C04220Ms.A0B(r0, r8)
            super.onSuccess(r0)
            java.lang.Object r6 = r1.A02
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            java.lang.Object r3 = r1.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r5 = X.C49202r0.A00(r3)
            r3 = 2
            X.C04220Ms.A0B(r5, r3)
            com.instagram.user.model.User r9 = X.C04660Oo.A00(r6)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            if (r9 == 0) goto L_0x098b
            X.266 r4 = X.AnonymousClass266.A06
            X.266 r3 = r9.A0g()
            if (r4 == r3) goto L_0x09ce
            X.266 r4 = X.AnonymousClass266.A05
            X.266 r3 = r9.A0g()
            if (r4 == r3) goto L_0x09ce
        L_0x098b:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18200wM.A0P(r6)
            java.lang.String r0 = "fetch_success_but_not_personal_or_creator_user"
            X.C18190wL.A1H(r3, r6, r0)
            X.C18210wN.A1B(r3, r5)
            java.lang.String r10 = "user_interaction"
        L_0x0999:
            r3.A0Q(r10, r11)
            java.util.HashMap r0 = X.C67303zK.A02(r6)
            X.C18220wO.A1G(r3, r0)
        L_0x09a3:
            X.49g r0 = X.C62173Xp.A00(r6)
            r0.A01(r5)
            java.lang.Object r3 = r1.A00
            X.3D3 r3 = (X.AnonymousClass3D3) r3
            if (r3 == 0) goto L_0x09c3
            X.BKU r10 = r3.A02
            android.content.Context r8 = r3.A00
            X.3DL r12 = r3.A04
            X.CUV r1 = r3.A05
            java.lang.String r0 = r3.A06
            com.instagram.service.session.UserSession r11 = r3.A03
            X.IcN r9 = r3.A01
            r13 = r1
            r14 = r0
            X.C63023bL.A02(r8, r9, r10, r11, r12, r13, r14)
        L_0x09c3:
            r0 = -133052419(0xfffffffff811c7fd, float:-1.1827176E34)
            X.C14030oh.A0A(r0, r2)
            r0 = -1200751442(0xffffffffb86dfcae, float:-5.674053E-5)
            goto L_0x0bd0
        L_0x09ce:
            X.18T r14 = r0.A00
            X.3B0 r13 = r0.A01
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18200wM.A0P(r6)
            java.lang.String r9 = "server_fetch_success"
            java.lang.String r3 = "event_name"
            r4.A0T(r3, r9)
            java.lang.String r9 = X.C04660Oo.A02(r6)
            java.lang.String r3 = "ig_account_type"
            r4.A0T(r3, r9)
            java.lang.String r9 = "entry_point"
            r4.A0T(r9, r5)
            java.lang.String r10 = "user_interaction"
            r4.A0Q(r10, r11)
            if (r13 == 0) goto L_0x0a60
            java.lang.String r12 = r13.A02
        L_0x09f4:
            java.lang.String r3 = "target_destination_type"
            r4.A0T(r3, r12)
            java.util.HashMap r3 = X.C67303zK.A02(r6)
            java.lang.String r12 = "debug_test_data"
            r4.A0V(r12, r3)
            r4.Bb4()
            if (r14 != 0) goto L_0x0a62
            X.1z6 r4 = X.C35692Ol.A00(r6)
            com.facebook.common.callercontext.CallerContext r3 = X.C67303zK.A00
            java.lang.String r0 = "ig_android_linking_cache_ig_to_fb_crossposting_destination_picker"
            boolean r0 = r4.A05(r3, r0)
            if (r0 == 0) goto L_0x0a2e
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18200wM.A0P(r6)
            java.lang.String r0 = "drop_legacy_linkage"
            X.C63873iU.A0B(r3, r6, r0)
            r3.A0T(r9, r5)
            r3.A0Q(r10, r11)
            java.util.HashMap r0 = X.C67303zK.A02(r6)
            r3.A0V(r12, r0)
            r3.Bb4()
        L_0x0a2e:
            r0 = 0
            X.C67303zK.A04(r0, r0, r6, r5)
            X.3z4 r3 = new X.3z4
            r3.<init>(r6)
            r0 = 4
            X.AnonymousClass3z4.A00(r3, r0, r8, r8)
            java.util.HashMap r4 = X.C67303zK.A02(r6)
            java.lang.String r3 = "reason"
            java.lang.String r0 = "no_server_link"
            r4.put(r3, r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18200wM.A0P(r6)
            java.lang.String r0 = "destination_picker_flag_reset"
            X.C63873iU.A0B(r3, r6, r0)
            r3.A0T(r9, r5)
            r3.A0Q(r10, r11)
            r3.A0V(r12, r4)
            r3.Bb4()
            X.C62953bC.A03(r6, r8)
            goto L_0x09a3
        L_0x0a60:
            r12 = 0
            goto L_0x09f4
        L_0x0a62:
            X.1tl r4 = X.AnonymousClass3WS.A01(r6)
            boolean r3 = X.AnonymousClass0wJ.A1W(r13)
            r4.A0L(r6, r3)
            com.instagram.user.model.User r3 = X.C04660Oo.A00(r6)
            if (r3 == 0) goto L_0x0a92
            if (r13 == 0) goto L_0x0afc
            java.lang.String r4 = r13.A02
            java.lang.String r3 = "fb_page"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0afc
            long r3 = r13.A00
            java.lang.String r15 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r13.A01
            X.C04220Ms.A06(r4)
            X.18S r3 = new X.18S
            r3.<init>(r15, r4)
        L_0x0a8f:
            X.C67303zK.A04(r3, r14, r6, r5)
        L_0x0a92:
            java.lang.Boolean r0 = r0.A02
            boolean r4 = X.C18210wN.A1T(r0)
            boolean r0 = X.C62953bC.A04(r6)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18200wM.A0P(r6)
            if (r0 == 0) goto L_0x0ad9
            java.lang.String r0 = "destination_picker_flag_set_already"
            X.C63873iU.A0B(r3, r6, r0)
            r3.A0T(r9, r5)
            r3.A0Q(r10, r11)
            java.util.HashMap r0 = X.C67303zK.A02(r6)
            r3.A0V(r12, r0)
            r3.Bb4()
        L_0x0ab7:
            if (r13 != 0) goto L_0x0b07
            X.1j1 r3 = X.C67363zQ.A02(r6)
            java.lang.String r11 = r3.A01
            boolean r0 = X.AnonymousClass8bQ.A0n(r11)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0afe
            X.49e r9 = X.C60333Op.A00(r6)
            java.lang.String r12 = r3.A02
            java.lang.String r13 = r3.A00
            r15 = 1
            r10 = 0
            r14 = r5
            r16 = r8
            r9.A01(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x09a3
        L_0x0ad9:
            if (r4 == 0) goto L_0x0af4
            java.lang.String r0 = "destination_inconsistent"
        L_0x0add:
            X.C63873iU.A0B(r3, r6, r0)
            r3.A0T(r9, r5)
            r3.A0Q(r10, r11)
            java.util.HashMap r0 = X.C67303zK.A02(r6)
            r3.A0V(r12, r0)
            r3.Bb4()
            X.C62953bC.A03(r6, r4)
            goto L_0x0ab7
        L_0x0af4:
            if (r13 != 0) goto L_0x0af9
            java.lang.String r0 = "server_has_no_destination"
            goto L_0x0add
        L_0x0af9:
            java.lang.String r0 = "destination_consistent"
            goto L_0x0add
        L_0x0afc:
            r3 = 0
            goto L_0x0a8f
        L_0x0afe:
            X.49e r3 = X.C60333Op.A00(r6)
            r0 = 1
            r3.A00 = r0
            goto L_0x09a3
        L_0x0b07:
            X.49e r0 = X.C60333Op.A00(r6)
            r0.A00 = r8
            com.instagram.user.model.User r3 = X.C04660Oo.A00(r6)
            if (r3 == 0) goto L_0x09a3
            java.lang.String r0 = "page_id"
            java.lang.String r12 = X.C62953bC.A02(r6, r0)
            X.4sQ r0 = X.C67303zK.A00(r6, r3)
            if (r0 == 0) goto L_0x0b4b
            java.lang.String r3 = X.C59123Jp.A00(r0)
        L_0x0b23:
            boolean r0 = X.AnonymousClass8bQ.A0n(r12)
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x09a3
            boolean r0 = r12.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x09a3
            X.49e r3 = X.C60333Op.A00(r6)
            r0 = 0
            r3.A02(r0, r5, r8, r8)
            X.C62953bC.A03(r6, r4)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18200wM.A0P(r6)
            java.lang.String r0 = "local_mismatch_page_token_delete"
            X.C63873iU.A0B(r3, r6, r0)
            r3.A0T(r9, r5)
            goto L_0x0999
        L_0x0b4b:
            r3 = 0
            goto L_0x0b23
        L_0x0b4d:
            r2 = 1598257176(0x5f437818, float:1.4085034E19)
            int r7 = X.C14030oh.A03(r2)
            X.1Tx r0 = (X.C22231Tx) r0
            r2 = -1449971323(0xffffffffa9933185, float:-6.5367017E-14)
            int r4 = X.C14030oh.A03(r2)
            r8 = 0
            X.C04220Ms.A0B(r0, r8)
            java.util.List r0 = r0.A01
            java.util.Iterator r10 = r0.iterator()
            r9 = 0
        L_0x0b68:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0bb6
            java.lang.Object r0 = r10.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2) r0
            java.lang.Object r3 = r0.A00
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0b68
            java.lang.Object r0 = r3.get(r8)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r0
            java.lang.String r2 = r0.A01
            java.lang.String r0 = "live_broadcast"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0b68
            java.util.Iterator r6 = r3.iterator()
            r5 = 1
        L_0x0b93:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0b68
            java.lang.Object r0 = r6.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r0
            java.lang.String r3 = r0.A03
            java.lang.String r2 = "off"
            if (r3 != 0) goto L_0x0ba6
            r3 = r2
        L_0x0ba6:
            java.lang.Object r0 = r0.A00
            boolean r0 = X.C18190wL.A1Z(r0, r5)
            if (r0 == 0) goto L_0x0b93
            boolean r0 = X.C04220Ms.A0I(r3, r2)
            if (r0 != 0) goto L_0x0b93
            r9 = 1
            goto L_0x0b93
        L_0x0bb6:
            java.lang.Object r3 = r1.A02
            X.BTX r3 = (X.BTX) r3
            if (r9 == 0) goto L_0x0bd4
            java.lang.Object r2 = r1.A00
            X.BKU r2 = (X.BKU) r2
            java.lang.Object r0 = r1.A01
            com.instagram.model.upcomingevents.UpcomingEvent r0 = (com.instagram.model.upcomingevents.UpcomingEvent) r0
            X.BTX.A00(r2, r0, r3)
        L_0x0bc7:
            r0 = -350358829(0xffffffffeb1df2d3, float:-1.9094806E26)
            X.C14030oh.A0A(r0, r4)
            r0 = 541336060(0x204421fc, float:1.661309E-19)
        L_0x0bd0:
            X.C14030oh.A0A(r0, r7)
            return
        L_0x0bd4:
            androidx.fragment.app.FragmentActivity r0 = r3.A00
            X.Dsm r2 = X.C18190wL.A0W(r0)
            r0 = 2131837385(0x7f1141c9, float:1.9307964E38)
            r2.A0L(r0)
            r0 = 2131837384(0x7f1141c8, float:1.9307962E38)
            r2.A0K(r0)
            r1 = 2131837383(0x7f1141c7, float:1.930796E38)
            r0 = 169(0xa9, float:2.37E-43)
            X.C18180wK.A1O(r2, r3, r0, r1)
            r1 = 2131831869(0x7f112c3d, float:1.9296776E38)
            r0 = 0
            r2.A0O(r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
            goto L_0x0bc7
        L_0x0bf9:
            r0 = 860863469(0x334fbbed, float:4.836686E-8)
            int r2 = X.C14030oh.A03(r0)
            r0 = -2038827289(0xffffffff8679f6e7, float:-4.701309E-35)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r1.A02
            X.6jp r4 = (X.C109326jp) r4
            X.3iY r3 = X.C63893iY.A01
            java.lang.Object r0 = r1.A00
            X.601 r0 = (X.AnonymousClass601) r0
            X.C61043Rr.A00(r0, r3, r4)
            r0 = 1913687471(0x72108daf, float:2.863176E30)
            X.C14030oh.A0A(r0, r5)
            r0 = 1633997776(0x6164d3d0, float:2.6382002E20)
            goto L_0x0c81
        L_0x0c1e:
            r0 = 838435892(0x31f98434, float:7.2618835E-9)
            int r2 = X.C14030oh.A03(r0)
            r0 = -647945432(0xffffffffd9612328, float:-3.96065778E15)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r7 = r1.A01
            X.IcE r7 = (X.C34635IcE) r7
            java.lang.Object r5 = r1.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r8 = r1.A00
            r4 = 1
            r0 = 2131232463(0x7f0806cf, float:1.8081036E38)
            android.graphics.drawable.Drawable r9 = r5.getDrawable(r0)
            if (r9 == 0) goto L_0x0c47
            int r1 = r7.A05
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r9.setColorFilter(r1, r0)
        L_0x0c47:
            X.3iD r3 = X.C63733iD.A01()
            r3.A0C()
            r1 = 2131837481(0x7f114229, float:1.9308158E38)
            X.0Oa r0 = r7.A09
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r5, r0, r1)
            r3.A0A = r0
            r0 = 2131837480(0x7f114228, float:1.9308156E38)
            X.C63733iD.A06(r5, r9, r3, r0)
            r0 = 2131837479(0x7f114227, float:1.9308154E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r5, r0)
            r3.A0D = r0
            com.facebook.redex.IDxCBackShape83S0300000_6_I2 r0 = new com.facebook.redex.IDxCBackShape83S0300000_6_I2
            r0.<init>(r4, r5, r8, r7)
            r3.A07 = r0
            r3.A0I = r4
            X.C63733iD.A0A(r3)
            r0 = -1397296449(0xffffffffacb6f2bf, float:-5.1997013E-12)
            X.C14030oh.A0A(r0, r6)
            r0 = 1274568524(0x4bf85f4c, float:3.2554648E7)
        L_0x0c81:
            X.C14030oh.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        if (this.A03 != 0) {
            super.onSuccessInBackground(obj);
            return;
        }
        int A032 = C14030oh.A03(-1027514751);
        int A002 = AnonymousClass0wJ.A00(-1479147455, obj);
        C63873iU r0 = (C63873iU) this.A00;
        if (r0 != null) {
            r0.onSuccessInBackground(obj);
        }
        C14030oh.A0A(2051485954, A002);
        C14030oh.A0A(43006761, A032);
    }

    public IDxACallbackShape15S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
