package com.instagram.common.api.base;

import X.AnonymousClass1cM;
import X.AnonymousClass3IK;
import X.AnonymousClass3XX;
import X.AnonymousClass5z0;
import X.C14030oh;
import X.C18230wP;
import X.C203014d;
import X.C203114e;
import X.C203214f;
import X.C203714k;
import X.C203814l;
import X.C203914m;
import X.C24711ju;
import X.C37408JrQ;
import X.C554733i;
import X.C58933Ih;
import X.C63873iU;
import X.C73084Qw;
import X.C73094Qx;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.business.Address;
import com.instagram.model.business.PublicPhoneContact;
import java.util.Map;

public class IDxACallbackShape0S3100000_1_I2 extends C63873iU {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    public IDxACallbackShape0S3100000_1_I2(AnonymousClass1cM r1, String str, String str2, String str3, int i) {
        this.A04 = i;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A022;
        int i;
        if (this.A04 != 0) {
            A022 = C63873iU.A02(this, r3, -1990084757);
            i = 1224318089;
        } else {
            A022 = C63873iU.A02(this, r3, 843841303);
            i = 1114856851;
        }
        C14030oh.A0A(i, A022);
    }

    public final void onFinish() {
        int A032;
        int i;
        if (this.A04 != 0) {
            A032 = C14030oh.A03(1676437148);
            super.onFinish();
            AnonymousClass1cM r1 = (AnonymousClass1cM) this.A00;
            C24711ju r0 = r1.A0D;
            if (r0 != null) {
                r0.A00();
            }
            AnonymousClass1cM.A04(r1);
            i = 1254874893;
        } else {
            A032 = C14030oh.A03(1586426898);
            super.onFinish();
            AnonymousClass1cM r12 = (AnonymousClass1cM) this.A00;
            C24711ju r02 = r12.A0D;
            if (r02 != null) {
                r02.A00();
            }
            AnonymousClass1cM.A04(r12);
            i = -968023246;
        }
        C14030oh.A0A(i, A032);
    }

    public final void onStart() {
        int A032;
        int i;
        if (this.A04 != 0) {
            A032 = C14030oh.A03(-1377550040);
            super.onStart();
            AnonymousClass1cM r1 = (AnonymousClass1cM) this.A00;
            C24711ju r0 = r1.A0D;
            if (r0 != null) {
                r0.A01();
            }
            AnonymousClass1cM.A04(r1);
            i = 1459498639;
        } else {
            A032 = C14030oh.A03(-1204032299);
            super.onStart();
            AnonymousClass1cM r12 = (AnonymousClass1cM) this.A00;
            C24711ju r02 = r12.A0D;
            if (r02 != null) {
                r02.A01();
            }
            AnonymousClass1cM.A04(r12);
            i = -396712933;
        }
        C14030oh.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        Object obj2;
        String A05;
        Object obj3;
        String A052;
        Object obj4 = obj;
        if (this.A04 != 0) {
            A032 = C14030oh.A03(-481441560);
            AnonymousClass5z0 r3 = (AnonymousClass5z0) obj4;
            int A033 = C14030oh.A03(-1281619433);
            if (!(r3 == null || (obj3 = r3.A01) == null)) {
                C58933Ih r11 = (C58933Ih) obj3;
                Class<C203914m> cls = C203914m.class;
                if (r11.A00(cls, "page_create") != null) {
                    Class<C203814l> cls2 = C203814l.class;
                    if (r11.A00(cls, "page_create").A00(cls2, "page") != null) {
                        Class<C203714k> cls3 = C203714k.class;
                        if (C63873iU.A05(r11, cls, cls2, "page_create").A00(cls3, "admin_info") != null) {
                            AnonymousClass1cM r5 = (AnonymousClass1cM) this.A00;
                            String str = this.A03;
                            String str2 = this.A02;
                            String str3 = this.A01;
                            String A053 = C63873iU.A05(r11, cls, cls2, "page_create").A05("id");
                            if (!r5.A0K) {
                                Map A012 = AnonymousClass1cM.A01(str, str3);
                                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r5.A07;
                                if (businessFlowAnalyticsLogger != null) {
                                    businessFlowAnalyticsLogger.Bdx(new C37408JrQ("create_page", r5.A0F, "create_page", (String) null, (String) null, (Map) null, A012, (Map) null));
                                }
                            }
                            if (AnonymousClass1cM.A09(r5, A053, C63873iU.A05(r11, cls, cls2, "page_create").A00(cls3, "admin_info").A05("access_token"))) {
                                AnonymousClass1cM.A06(r5, C63873iU.A05(r11, cls, cls2, "page_create").A05("id"));
                            } else {
                                C58933Ih A054 = C63873iU.A05(r11, cls, cls2, "page_create");
                                String A055 = A054.A05("id");
                                A055.getClass();
                                if (A054.A00(cls3, "admin_info") == null) {
                                    A052 = null;
                                } else {
                                    A052 = A054.A00(cls3, "admin_info").A05("access_token");
                                }
                                AnonymousClass1cM.A05(r5, new AnonymousClass3IK((C554733i) null, (ImageUrl) null, (Address) null, (PublicPhoneContact) null, A055, str, A052, str2, (String) null, (String) null, (String) null, 0, false));
                            }
                            C14030oh.A0A(-1693333644, A033);
                            i = -1641939278;
                        }
                    }
                }
            }
            AnonymousClass1cM r52 = (AnonymousClass1cM) this.A00;
            String A0l = C18230wP.A0l(r52);
            r52.A0S.post(new C73094Qx(this, A0l));
            AnonymousClass1cM.A08(r52, this.A03, this.A01, A0l, A0l);
            C14030oh.A0A(-1693333644, A033);
            i = -1641939278;
        } else {
            A032 = C14030oh.A03(-74343686);
            AnonymousClass5z0 r32 = (AnonymousClass5z0) obj4;
            int A034 = C14030oh.A03(-300801714);
            if (!(r32 == null || (obj2 = r32.A01) == null)) {
                C58933Ih r9 = (C58933Ih) obj2;
                Class<C203214f> cls4 = C203214f.class;
                if (r9.A00(cls4, "additional_profile_plus_create") != null) {
                    Class<C203114e> cls5 = C203114e.class;
                    if (r9.A00(cls4, "additional_profile_plus_create").A00(cls5, "page") != null) {
                        AnonymousClass1cM r4 = (AnonymousClass1cM) this.A00;
                        String str4 = this.A03;
                        String str5 = this.A02;
                        String str6 = this.A01;
                        String A056 = C63873iU.A05(r9, cls4, cls5, "additional_profile_plus_create").A05("id");
                        if (!r4.A0K) {
                            Map A013 = AnonymousClass1cM.A01(str4, str6);
                            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = r4.A07;
                            if (businessFlowAnalyticsLogger2 != null) {
                                businessFlowAnalyticsLogger2.Bdx(new C37408JrQ("create_page", r4.A0F, "create_page", (String) null, (String) null, (Map) null, A013, (Map) null));
                            }
                        }
                        Class<C203014d> cls6 = C203014d.class;
                        if (AnonymousClass1cM.A09(r4, A056, C63873iU.A05(r9, cls4, cls5, "additional_profile_plus_create").A00(cls6, "admin_info").A05("access_token"))) {
                            AnonymousClass1cM.A06(r4, C63873iU.A05(r9, cls4, cls5, "additional_profile_plus_create").A05("id"));
                        } else {
                            C58933Ih A057 = C63873iU.A05(r9, cls4, cls5, "additional_profile_plus_create");
                            String A058 = A057.A05("id");
                            A058.getClass();
                            if (A057.A00(cls6, "admin_info") == null) {
                                A05 = null;
                            } else {
                                A05 = A057.A00(cls6, "admin_info").A05("access_token");
                            }
                            AnonymousClass1cM.A05(r4, new AnonymousClass3IK((C554733i) null, (ImageUrl) null, (Address) null, (PublicPhoneContact) null, A058, str4, A05, str5, (String) null, (String) null, (String) null, 0, false));
                        }
                        C14030oh.A0A(295938762, A034);
                        i = -1563457968;
                    }
                }
            }
            AnonymousClass1cM r6 = (AnonymousClass1cM) this.A00;
            String A0l2 = C18230wP.A0l(r6);
            r6.A0S.post(new C73084Qw(this, A0l2));
            AnonymousClass1cM.A08(r6, this.A03, this.A01, A0l2, A0l2);
            C14030oh.A0A(295938762, A034);
            i = -1563457968;
        }
        C14030oh.A0A(i, A032);
    }
}
