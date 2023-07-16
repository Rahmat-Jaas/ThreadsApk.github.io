package com.instagram.share.facebook.upsell.manager;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0MJ;
import X.AnonymousClass0OU;
import X.AnonymousClass0TJ;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass2AC;
import X.AnonymousClass3CX;
import X.AnonymousClass3HR;
import X.AnonymousClass3P2;
import X.AnonymousClass3VY;
import X.AnonymousClass6ZB;
import X.AnonymousClass7C3;
import X.AnonymousClass8A0;
import X.C03480Iw;
import X.C04220Ms;
import X.C141478bg;
import X.C146958n9;
import X.C18190wL;
import X.C18220wO;
import X.C25599DoZ;
import X.C313425p;
import X.C39142Kno;
import X.C49392rJ;
import X.C49402rK;
import X.C61813Vs;
import X.C61843Wa;
import X.C63803iN;
import X.C83024qf;
import X.D0E;
import android.app.Activity;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0600000_I2;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.graphql.FetchCXPNoticesQueryResponseImpl;
import com.instagram.share.facebook.upsell.api.CLNoticeApi;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0500000_I2;

@DebugMetadata(c = "com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1", f = "CLNoticeManager.kt", i = {0, 6, 7}, l = {198, 216, 224, 235, 242, 254, 264, 276}, m = "invokeSuspend", n = {"results", "variantConfig", "variantConfig"}, s = {"L$0", "L$0", "L$0"})
public final class CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Activity A03;
    public final /* synthetic */ AnonymousClass2AC A04;
    public final /* synthetic */ ImmutableList A05;
    public final /* synthetic */ AnonymousClass3CX A06;
    public final /* synthetic */ C83024qf A07;
    public final /* synthetic */ AnonymousClass3HR A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    @DebugMetadata(c = "com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1$1", f = "CLNoticeManager.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int A00;
        public Object A01;

        public final C146958n9 create(Object obj, C146958n9 r12) {
            AnonymousClass0MJ r6 = r12;
            AnonymousClass3HR r3 = r9;
            return new AnonymousClass1(activity, immutableList, r3, A0n, r12, r6, j, z);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0MJ r1;
            KtCSuperShape0S0060000_I2 ktCSuperShape0S0060000_I2;
            Object obj2 = obj;
            D0E d0e = D0E.COROUTINE_SUSPENDED;
            if (this.A00 != 0) {
                r1 = (AnonymousClass0MJ) this.A01;
                AnonymousClass0OU.A00(obj2);
            } else {
                AnonymousClass0OU.A00(obj2);
                r1 = r12;
                CLNoticeApi cLNoticeApi = CLNoticeApi.A00;
                AnonymousClass3HR r5 = r9;
                UserSession userSession = r5.A00;
                GQLCallInputCInputShape0S0000000 A002 = C61843Wa.A00(activity.getApplicationContext(), A0n);
                AnonymousClass3VY r11 = r5.A01;
                CXPNoticeStateRepository cXPNoticeStateRepository = r5.A02;
                boolean z = z;
                if (z) {
                    ktCSuperShape0S0060000_I2 = AnonymousClass3P2.A00(userSession);
                } else {
                    ktCSuperShape0S0060000_I2 = null;
                }
                ImmutableList immutableList = immutableList;
                C04220Ms.A05(immutableList);
                long j = j;
                this.A01 = r1;
                this.A00 = 1;
                obj2 = cLNoticeApi.A01(A002, ktCSuperShape0S0060000_I2, immutableList, userSession, r11, cXPNoticeStateRepository, this, j, z);
                if (obj2 == d0e) {
                    return d0e;
                }
            }
            r1.A00 = obj2;
            return Unit.A00;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1(Activity activity, AnonymousClass2AC r3, ImmutableList immutableList, AnonymousClass3CX r5, C83024qf r6, AnonymousClass3HR r7, String str, C146958n9 r9, long j, boolean z, boolean z2) {
        super(2, r9);
        this.A08 = r7;
        this.A09 = str;
        this.A0A = z;
        this.A04 = r3;
        this.A03 = activity;
        this.A0B = z2;
        this.A05 = immutableList;
        this.A02 = j;
        this.A07 = r6;
        this.A06 = r5;
    }

    public final C146958n9 create(Object obj, C146958n9 r15) {
        AnonymousClass3HR r6 = this.A08;
        String str = this.A09;
        boolean z = this.A0A;
        AnonymousClass2AC r2 = this.A04;
        Activity activity = this.A03;
        boolean z2 = this.A0B;
        ImmutableList immutableList = this.A05;
        long j = this.A02;
        return new CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1(activity, r2, immutableList, this.A06, this.A07, r6, str, r15, j, z, z2);
    }

    public final Object invokeSuspend(Object obj) {
        C61813Vs r10;
        final AnonymousClass0MJ r12;
        FetchCXPNoticesQueryResponseImpl.XcxpFetchNoticeUser.NoticeEligibility noticeEligibility;
        AnonymousClass0YP ktSLambdaShape16S0100000_I2_5;
        int i;
        C141478bg r7;
        KtSLambdaShape16S0100000_I2_5 ktSLambdaShape16S0100000_I2_52;
        int i2;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        switch (this.A00) {
            case 0:
                AnonymousClass0OU.A00(obj);
                final String A0n = C18190wL.A0n(C03480Iw.A00());
                r12 = new AnonymousClass0MJ();
                final AnonymousClass3HR r9 = this.A08;
                long A032 = C63803iN.A03(AnonymousClass0TJ.A05, r9.A00, 36607195969950356L);
                final Activity activity = this.A03;
                final boolean z = this.A0B;
                final ImmutableList immutableList = this.A05;
                final long j = this.A02;
                AnonymousClass1 r6 = new AnonymousClass1((C146958n9) null);
                this.A01 = r12;
                this.A00 = 1;
                if (AnonymousClass7C3.A00(this, r6, A032) == d0e) {
                    return d0e;
                }
                break;
            case 1:
                r12 = (AnonymousClass0MJ) this.A01;
                try {
                    AnonymousClass0OU.A00(obj);
                    break;
                } catch (AnonymousClass8A0 unused) {
                    AnonymousClass0LU.A0B("CLNoticeManager", AnonymousClass00U.A0L("Timeout exception: Failed to fetch notice eligibility for ", this.A09));
                    this.A08.A01.A03(113);
                    C141478bg r62 = AnonymousClass6ZB.A00;
                    KtSLambdaShape16S0100000_I2_5 ktSLambdaShape16S0100000_I2_53 = new KtSLambdaShape16S0100000_I2_5(this.A07, (C146958n9) null, 16);
                    this.A01 = null;
                    this.A00 = 2;
                    if (C25599DoZ.A00(this, r62, ktSLambdaShape16S0100000_I2_53) == d0e) {
                        return d0e;
                    }
                }
                break;
            case 7:
            case 8:
                r10 = (C61813Vs) this.A01;
                AnonymousClass0OU.A00(obj);
                break;
            default:
                AnonymousClass0OU.A00(obj);
                break;
        }
        Map map = (Map) r12.A00;
        if (map != null) {
            noticeEligibility = (FetchCXPNoticesQueryResponseImpl.XcxpFetchNoticeUser.NoticeEligibility) map.get(this.A09);
        } else {
            noticeEligibility = null;
        }
        if (noticeEligibility == null) {
            this.A08.A01.A03(3);
            r7 = AnonymousClass6ZB.A00;
            ktSLambdaShape16S0100000_I2_52 = new KtSLambdaShape16S0100000_I2_5(this.A07, (C146958n9) null, 17);
            this.A01 = null;
            this.A00 = 3;
        } else {
            AnonymousClass3HR r92 = this.A08;
            UserSession userSession = r92.A00;
            C49392rJ.A00(userSession, noticeEligibility);
            if (this.A0A) {
                r92.A01.A03(2);
                r7 = AnonymousClass6ZB.A00;
                ktSLambdaShape16S0100000_I2_52 = new KtSLambdaShape16S0100000_I2_5(this.A07, (C146958n9) null, 18);
                this.A01 = null;
                i2 = 4;
            } else if (noticeEligibility.A00() == C313425p.A0F) {
                AnonymousClass0LU.A0B("CLNoticeManager", AnonymousClass00U.A0L(this.A09, ": No available notice variant"));
                r92.A01.A03(2);
                r7 = AnonymousClass6ZB.A00;
                ktSLambdaShape16S0100000_I2_52 = new KtSLambdaShape16S0100000_I2_5(this.A07, (C146958n9) null, 19);
                this.A01 = null;
                i2 = 5;
            } else {
                r10 = C49402rK.A00(userSession, noticeEligibility);
                if (r10 == null) {
                    AnonymousClass0LU.A0B("CLNoticeManager", "Unexpected Failure: Unsupported notice variant on the client");
                    AnonymousClass3VY r4 = r92.A01;
                    r4.A02(TraceFieldType.FailureReason, AnonymousClass0wJ.A0t("unmapped_variant:", noticeEligibility.A00()));
                    r4.A03(3);
                    r7 = AnonymousClass6ZB.A00;
                    ktSLambdaShape16S0100000_I2_52 = new KtSLambdaShape16S0100000_I2_5(this.A07, (C146958n9) null, 20);
                    this.A01 = null;
                    i2 = 6;
                } else {
                    String stringValue = noticeEligibility.getStringValue("client_session_id");
                    if (stringValue == null) {
                        stringValue = "";
                    }
                    AnonymousClass2AC r8 = this.A04;
                    boolean A012 = AnonymousClass3P2.A01(r8, (KtCSuperShape0S0600000_I2) null, userSession, r92.A01, r10, stringValue);
                    C141478bg r42 = AnonymousClass6ZB.A00;
                    if (A012) {
                        ktSLambdaShape16S0100000_I2_5 = new KtSLambdaShape1S0500000_I2(this.A06, this.A07, r8, r92, r10, (C146958n9) null, 12);
                        this.A01 = r10;
                        i = 7;
                    } else {
                        ktSLambdaShape16S0100000_I2_5 = new KtSLambdaShape16S0100000_I2_5(this.A07, (C146958n9) null, 21);
                        this.A01 = r10;
                        i = 8;
                    }
                    this.A00 = i;
                    if (C25599DoZ.A00(this, r42, ktSLambdaShape16S0100000_I2_5) == d0e) {
                        return d0e;
                    }
                    AnonymousClass3VY r2 = this.A08.A01;
                    r2.A02("notice_variant", r10.A02());
                    r2.A03(2);
                    return Unit.A00;
                }
            }
            this.A00 = i2;
        }
        if (C25599DoZ.A00(this, r7, ktSLambdaShape16S0100000_I2_52) == d0e) {
            return d0e;
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
