package com.instagram.arp.profilepicture.repository;

import X.AnonymousClass0YP;
import X.AnonymousClass24Z;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository$saveAndSetAvatarProfilePicture$1", f = "EditAvatarProfilePictureRepository.kt", i = {1, 1, 1}, l = {177, 194}, m = "invokeSuspend", n = {"assets", "poseId", "backgroundId"}, s = {"L$0", "L$1", "L$2"})
public final class EditAvatarProfilePictureRepository$saveAndSetAvatarProfilePicture$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final /* synthetic */ AnonymousClass24Z A04;
    public final /* synthetic */ EditAvatarProfilePictureRepository A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditAvatarProfilePictureRepository$saveAndSetAvatarProfilePicture$1(AnonymousClass24Z r2, EditAvatarProfilePictureRepository editAvatarProfilePictureRepository, String str, String str2, C146958n9 r6) {
        super(2, r6);
        this.A05 = editAvatarProfilePictureRepository;
        this.A04 = r2;
        this.A07 = str;
        this.A06 = str2;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        return new EditAvatarProfilePictureRepository$saveAndSetAvatarProfilePicture$1(this.A04, this.A05, this.A07, this.A06, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r14.A00
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x00f6
            if (r0 == r4) goto L_0x0127
            java.lang.Object r9 = r14.A03
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r14.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r14.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2) r3
            X.AnonymousClass0OU.A00(r15)
        L_0x0019:
            X.37N r15 = (X.AnonymousClass37N) r15
            boolean r2 = r15.A01
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository r1 = r14.A05
            if (r2 != 0) goto L_0x0085
            X.4wE r4 = r1.A0B
            X.1Uj r3 = X.C22321Uj.A00
            X.Dos r0 = new X.Dos
            r0.<init>(r3)
            r4.D7t(r0)
        L_0x002d:
            X.43x r6 = r1.A02
            X.24Z r4 = r14.A04
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            X.C18180wK.A1P(r8, r5, r9)
            X.0nS r1 = r6.A01
            java.lang.String r0 = "avatar_profile_pic_updated"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 62
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            if (r2 == 0) goto L_0x0082
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
        L_0x004a:
            java.lang.String r0 = X.C33262Fa.A00(r0)
            X.C18210wN.A1A(r3, r0)
            java.lang.String r0 = r4.A00
            X.C18210wN.A1B(r3, r0)
            com.instagram.service.session.UserSession r0 = r6.A02
            java.lang.String r1 = r0.getUserId()
            java.lang.String r0 = "ig_user_id"
            r3.A0T(r0, r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 0
            long r0 = r2.toSeconds(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration"
            r3.A0S(r0, r1)
            java.lang.String r0 = "background_id"
            r3.A0T(r0, r9)
            java.lang.String r0 = "pose_id"
            r3.A0T(r0, r8)
            r3.Bb4()
        L_0x007f:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x0082:
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            goto L_0x004a
        L_0x0085:
            X.4wE r7 = r1.A0B
            X.1Ul r6 = X.C22341Ul.A00
            X.Dos r0 = new X.Dos
            r0.<init>(r6)
            r7.D7t(r0)
            X.4wE r6 = r1.A0A
            java.lang.String r10 = r3.A05
            java.lang.String r11 = r3.A03
            java.lang.Object r12 = r3.A01
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r3.A00
            java.util.List r13 = (java.util.List) r13
            X.C18210wN.A0n(r4, r8, r9)
            X.C04220Ms.A0B(r10, r5)
            X.AnonymousClass0wJ.A1R(r11, r12)
            r0 = 5
            X.C04220Ms.A0B(r13, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2 r7 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2
            r7.<init>((java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.util.List) r12, (java.util.List) r13)
            X.5z2 r0 = new X.5z2
            r0.<init>(r7)
            r6.D7t(r0)
            X.4wG r0 = r1.A0F
            java.lang.Object r3 = r0.getValue()
            X.6Pk r3 = (X.C100976Pk) r3
            boolean r0 = r3 instanceof X.AnonymousClass5z2
            r7 = 0
            if (r0 == 0) goto L_0x00dd
            X.4wE r6 = r1.A0C
            X.5z2 r3 = (X.AnonymousClass5z2) r3
            java.lang.Object r0 = r3.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2) r0
            boolean r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2 r3 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2
            r3.<init>(r0, r4, r4)
            X.5z2 r0 = new X.5z2
            r0.<init>(r3)
            r6.D7t(r0)
        L_0x00dd:
            X.0Ok r0 = X.C06810aP.A01
            com.instagram.service.session.UserSession r4 = r1.A08
            com.instagram.user.model.User r3 = r0.A01(r4)
            java.lang.String r0 = r15.A00
            r3.A2D(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r3.A25(r0)
            r3.A1s(r4)
            goto L_0x002d
        L_0x00f6:
            X.AnonymousClass0OU.A00(r15)
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository r6 = r14.A05
            X.24Z r3 = r14.A04
            r14.A00 = r4
            X.24Z r2 = X.AnonymousClass24Z.EDIT_PROFILE_UPSELL
            X.24Z r1 = X.AnonymousClass24Z.SETTING_CREATE_AVATAR_UPSELL
            X.24Z r0 = X.AnonymousClass24Z.SETTING_EDIT_PROFILE_UPSELL
            X.24Z[] r0 = new X.AnonymousClass24Z[]{r2, r1, r0}
            java.util.List r0 = X.C06750aI.A17(r0)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0122
            boolean r0 = X.C63713iA.A01
            if (r0 == 0) goto L_0x0122
            X.5z0 r0 = X.C63713iA.A00
            if (r0 == 0) goto L_0x0122
            java.lang.Object r15 = com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository.A00(r6, r14)
        L_0x011f:
            if (r15 != r7) goto L_0x012a
            return r7
        L_0x0122:
            java.lang.Boolean r15 = X.C18180wK.A0X()
            goto L_0x011f
        L_0x0127:
            X.AnonymousClass0OU.A00(r15)
        L_0x012a:
            boolean r0 = X.AnonymousClass0wJ.A1X(r15)
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository r6 = r14.A05
            if (r0 == 0) goto L_0x0149
            X.4wE r4 = r6.A0B
            X.24Z r3 = r14.A04
            java.lang.String r2 = r14.A07
            java.lang.String r0 = r14.A06
            X.1Ug r1 = new X.1Ug
            r1.<init>(r3, r2, r0)
        L_0x013f:
            X.Dos r0 = new X.Dos
            r0.<init>(r1)
            r4.D7t(r0)
            goto L_0x007f
        L_0x0149:
            X.4wE r0 = r6.A0A
            java.lang.Object r1 = r0.getValue()
            X.6Pk r1 = (X.C100976Pk) r1
            boolean r0 = r1 instanceof X.AnonymousClass5z2
            if (r0 != 0) goto L_0x015a
            X.4wE r4 = r6.A0B
            X.1Uj r1 = X.C22321Uj.A00
            goto L_0x013f
        L_0x015a:
            X.5z2 r1 = (X.AnonymousClass5z2) r1
            java.lang.Object r3 = r1.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2) r3
            java.lang.String r8 = r14.A07
            if (r8 != 0) goto L_0x0166
            java.lang.String r8 = r3.A04
        L_0x0166:
            java.lang.String r9 = r14.A06
            if (r9 != 0) goto L_0x016c
            java.lang.String r9 = r3.A02
        L_0x016c:
            X.4wE r2 = r6.A0B
            X.1Uk r1 = X.C22331Uk.A00
            X.Dos r0 = new X.Dos
            r0.<init>(r1)
            r2.D7t(r0)
            com.instagram.arp.api.AvatarProfilePictureApiController r0 = r6.A00
            r14.A01 = r3
            r14.A02 = r8
            r14.A03 = r9
            r14.A00 = r5
            java.lang.Object r15 = r0.A01(r8, r9, r14)
            if (r15 != r7) goto L_0x0019
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository$saveAndSetAvatarProfilePicture$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EditAvatarProfilePictureRepository$saveAndSetAvatarProfilePicture$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
