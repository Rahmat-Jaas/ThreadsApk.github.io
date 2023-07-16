package com.instagram.fanclub.gifting;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1", f = "FanClubGiftingViewModel.kt", i = {1, 1}, l = {89, 93}, m = "invokeSuspend", n = {"destination$iv$iv", "it"}, s = {"L$6", "L$8"})
public final class FanClubGiftingViewModel$fetchGiftOptions$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final /* synthetic */ Context A0A;
    public final /* synthetic */ FragmentActivity A0B;
    public final /* synthetic */ FanClubGiftingViewModel A0C;
    public final /* synthetic */ User A0D;
    public final /* synthetic */ String A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FanClubGiftingViewModel$fetchGiftOptions$1(Context context, FragmentActivity fragmentActivity, FanClubGiftingViewModel fanClubGiftingViewModel, User user, String str, C146958n9 r7) {
        super(2, r7);
        this.A0C = fanClubGiftingViewModel;
        this.A0D = user;
        this.A0B = fragmentActivity;
        this.A0A = context;
        this.A0E = str;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        FanClubGiftingViewModel fanClubGiftingViewModel = this.A0C;
        User user = this.A0D;
        return new FanClubGiftingViewModel$fetchGiftOptions$1(this.A0A, this.A0B, fanClubGiftingViewModel, user, this.A0E, r9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014f, code lost:
        if (r10 != null) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r14 = r21
            X.D0E r13 = X.D0E.COROUTINE_SUSPENDED
            r15 = r20
            int r0 = r15.A00
            r19 = 2
            r12 = 1
            if (r0 == 0) goto L_0x00de
            if (r0 == r12) goto L_0x00f4
            java.lang.Object r1 = r15.A09
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            java.lang.Object r11 = r15.A08
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r10 = r15.A07
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r9 = r15.A06
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r9 = (com.instagram.fanclub.gifting.FanClubGiftingViewModel) r9
            java.lang.Object r8 = r15.A05
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r15.A04
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r6 = r15.A03
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.Object r5 = r15.A02
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            java.lang.Object r4 = r15.A01
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r4 = (com.instagram.fanclub.gifting.FanClubGiftingViewModel) r4
            X.AnonymousClass0OU.A00(r14)
        L_0x0036:
            java.lang.String r14 = (java.lang.String) r14
            X.C04220Ms.A09(r1)
            if (r14 == 0) goto L_0x0091
            java.lang.String r0 = "sku"
            java.lang.String r18 = r1.getStringValue(r0)
            if (r18 == 0) goto L_0x0091
            java.lang.String r3 = X.C18250wR.A0X(r1)
            if (r3 == 0) goto L_0x0091
            X.20G r2 = X.AnonymousClass20G.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "billing_type"
            java.lang.Enum r2 = r1.getEnumValue(r0, r2)
            X.20G r2 = (X.AnonymousClass20G) r2
            if (r2 == 0) goto L_0x0091
            java.lang.String r0 = "billing_length"
            int r17 = r1.getIntValue(r0)
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            r16 = 3
            int r1 = r2.ordinal()
            r0 = 6
            if (r1 == r0) goto L_0x00c9
            r0 = r16
            if (r1 == r0) goto L_0x00c5
            r0 = 5
            if (r1 == r0) goto L_0x00c1
            if (r1 == r12) goto L_0x00cd
            r0 = r19
            if (r1 == r0) goto L_0x00bd
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "FanClubGiftingDurationString: "
            X.C10450iM.A03(r0, r1)
            java.lang.String r2 = ""
        L_0x0082:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2
            r0 = r18
            r1.<init>((com.instagram.user.model.User) r6, (java.lang.String) r0, (java.lang.String) r3, (java.lang.String) r8)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2
            r0.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2) r1, (java.lang.String) r14, (java.lang.String) r2)
            r10.add(r0)
        L_0x0091:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r1 = r11.next()
            com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl$XigUserByIgidV2$FanClub$Package$GiftOptions r1 = (com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl.XigUserByIgidV2.FanClub.Package.GiftOptions) r1
            X.C04220Ms.A04(r1)
            r15.A01 = r4
            r15.A02 = r5
            r15.A03 = r6
            r15.A04 = r7
            r15.A05 = r8
            r15.A06 = r9
            r15.A07 = r10
            r15.A08 = r11
            r15.A09 = r1
            r0 = r19
            r15.A00 = r0
            java.lang.Object r14 = com.instagram.fanclub.gifting.FanClubGiftingViewModel.A00(r5, r1, r4, r15)
            if (r14 != r13) goto L_0x0036
            return r13
        L_0x00bd:
            r2 = 2131689577(0x7f0f0069, float:1.9008173E38)
            goto L_0x00d0
        L_0x00c1:
            r2 = 2131689579(0x7f0f006b, float:1.9008177E38)
            goto L_0x00d0
        L_0x00c5:
            r2 = 2131689578(0x7f0f006a, float:1.9008175E38)
            goto L_0x00d0
        L_0x00c9:
            r2 = 2131689580(0x7f0f006c, float:1.900818E38)
            goto L_0x00d0
        L_0x00cd:
            r2 = 2131689576(0x7f0f0068, float:1.9008171E38)
        L_0x00d0:
            android.content.res.Resources r1 = r7.getResources()
            r0 = r17
            java.lang.String r2 = X.AnonymousClass0wJ.A0m(r1, r0, r2)
            X.C04220Ms.A06(r2)
            goto L_0x0082
        L_0x00de:
            X.AnonymousClass0OU.A00(r14)
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r0 = r15.A0C
            com.instagram.fanclub.gifting.FanClubGiftingApi r1 = r0.A02
            com.instagram.user.model.User r0 = r15.A0D
            java.lang.String r0 = r0.getId()
            r15.A00 = r12
            java.lang.Object r14 = r1.A00(r0, r15)
            if (r14 != r13) goto L_0x00f7
            return r13
        L_0x00f4:
            X.AnonymousClass0OU.A00(r14)
        L_0x00f7:
            X.3b6 r14 = (X.C62903b6) r14
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r9 = r15.A0C
            androidx.fragment.app.FragmentActivity r5 = r15.A0B
            com.instagram.user.model.User r6 = r15.A0D
            android.content.Context r7 = r15.A0A
            java.lang.String r8 = r15.A0E
            boolean r0 = r14 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0144
            X.1jA r14 = (X.AnonymousClass1jA) r14
            java.lang.Object r2 = r14.A00
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0142
            java.lang.Class<com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl$XigUserByIgidV2> r1 = com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl.XigUserByIgidV2.class
            java.lang.String r0 = "xig_user_by_igid_v2(id:$user_id)"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x0142
            java.lang.Class<com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl$XigUserByIgidV2$FanClub> r1 = com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl.XigUserByIgidV2.FanClub.class
            java.lang.String r0 = "fan_club"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x0142
            java.lang.Class<com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl$XigUserByIgidV2$FanClub$Package> r1 = com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl.XigUserByIgidV2.FanClub.Package.class
            java.lang.String r0 = "package"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x0142
            java.lang.Class<com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl$XigUserByIgidV2$FanClub$Package$GiftOptions> r1 = com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl.XigUserByIgidV2.FanClub.Package.GiftOptions.class
            java.lang.String r0 = "gift_options"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x0142
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r11 = r0.iterator()
            r4 = r9
            goto L_0x0091
        L_0x0142:
            r4 = r9
            goto L_0x0151
        L_0x0144:
            boolean r0 = r14 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0168
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x014d:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L_0x0153
        L_0x0151:
            X.0ZV r10 = X.AnonymousClass0ZV.A00
        L_0x0153:
            r9.A00 = r10
            java.util.List r0 = r4.A00
            boolean r0 = r0.isEmpty()
            X.4wE r1 = r4.A05
            if (r0 == 0) goto L_0x017c
            X.1pP r2 = X.AnonymousClass1pP.A00
        L_0x0161:
            r1.CrC(r2)
            X.1jA r14 = X.C62903b6.A03()
        L_0x0168:
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r1 = r15.A0C
            boolean r0 = r14 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0179
            boolean r0 = r14 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0184
            X.4wE r1 = r1.A05
            X.1pP r0 = X.AnonymousClass1pP.A00
            r1.CrC(r0)
        L_0x0179:
            kotlin.Unit r13 = kotlin.Unit.A00
            return r13
        L_0x017c:
            java.util.List r0 = r4.A00
            X.1pO r2 = new X.1pO
            r2.<init>(r0, r12)
            goto L_0x0161
        L_0x0184:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FanClubGiftingViewModel$fetchGiftOptions$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
