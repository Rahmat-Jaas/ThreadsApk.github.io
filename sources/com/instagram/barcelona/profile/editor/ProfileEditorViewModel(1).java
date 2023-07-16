package com.instagram.barcelona.profile.editor;

import X.AnonymousClass37V;
import X.AnonymousClass3J5;
import X.AnonymousClass5Im;
import X.AnonymousClass6NV;
import X.AnonymousClass74I;
import X.AnonymousClass8HV;
import X.C04220Ms;
import X.C04620Ok;
import X.C06810aP;
import X.C105546db;
import X.C107856hQ;
import X.C121177En;
import X.C146958n9;
import X.C18190wL;
import X.C25753DrP;
import X.C25807DsL;
import X.C27457Enn;
import X.C62793ak;
import X.C84714tk;
import X.C86074wE;
import X.C86094wG;
import X.C970667u;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0030000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0500000_I2;
import com.instagram.barcelona.profile.editor.data.EditProfileRepositoryProfileEditorImpl;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0500000_I2;
import kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16;

public final class ProfileEditorViewModel extends C62793ak {
    public final AnonymousClass37V A00;
    public final ProfilePictureDelegateImpl A01;
    public final EditProfileRepositoryProfileEditorImpl A02;
    public final UserSession A03;
    public final C86074wE A04;
    public final C86074wE A05;
    public final C86094wG A06;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (X.C04220Ms.A0I(r6.A01, r1) == false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.barcelona.profile.editor.ProfileEditorViewModel r13, X.C146958n9 r14) {
        /*
            r4 = 6
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r4, r14)
            if (r0 == 0) goto L_0x00e1
            r3 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e1
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r3.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r5) goto L_0x00ed
            java.lang.Object r13 = r3.A01
            com.instagram.barcelona.profile.editor.ProfileEditorViewModel r13 = (com.instagram.barcelona.profile.editor.ProfileEditorViewModel) r13
            X.AnonymousClass0OU.A00(r0)
        L_0x0027:
            boolean r1 = r0 instanceof X.AnonymousClass1jA
            if (r1 == 0) goto L_0x0035
            X.67u r1 = X.C970667u.Success
        L_0x002d:
            X.4wE r0 = r13.A04
            r0.CrC(r1)
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0035:
            boolean r0 = r0 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00e8
            X.67u r1 = X.C970667u.Failed
            goto L_0x002d
        L_0x003c:
            X.AnonymousClass0OU.A00(r0)
            com.instagram.barcelona.profile.editor.data.EditProfileRepositoryProfileEditorImpl r0 = r13.A02
            X.4wG r0 = r0.A05
            java.lang.Object r6 = r0.getValue()
            X.5Im r6 = (X.AnonymousClass5Im) r6
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.service.session.UserSession r0 = r13.A03
            com.instagram.user.model.User r0 = r1.A01(r0)
            X.5Im r0 = X.AnonymousClass6NV.A00(r0)
            X.6NY r0 = r0.A01
            X.5wP r1 = X.AnonymousClass5wP.A00
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 != 0) goto L_0x0068
            X.6NY r0 = r6.A01
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            r12 = 1
            if (r0 != 0) goto L_0x0069
        L_0x0068:
            r12 = 0
        L_0x0069:
            X.6NY r2 = r6.A01
            boolean r7 = r2 instanceof X.AnonymousClass5wN
            X.37V r11 = r13.A00
            java.lang.String r10 = r6.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = r6.A00
            java.lang.String r9 = r0.A01
            java.lang.String r8 = r0.A00
            boolean r6 = r6.A06
            boolean r1 = r2.equals(r1)
            r0 = 0
            if (r1 != 0) goto L_0x008e
            if (r7 != 0) goto L_0x008e
            boolean r1 = r2 instanceof X.AnonymousClass5wM
            if (r1 != 0) goto L_0x008e
            boolean r0 = r2 instanceof X.AnonymousClass5wO
            if (r0 == 0) goto L_0x00f2
            X.5wO r2 = (X.AnonymousClass5wO) r2
            java.lang.String r0 = r2.A01
        L_0x008e:
            r3.A01 = r13
            r3.A00 = r5
            com.instagram.service.session.UserSession r1 = r11.A01
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r1)
            X.7u8 r1 = r11.A00
            r2.A09(r1)
            r1 = 777(0x309, float:1.089E-42)
            java.lang.String r1 = X.C18170wI.A00(r1)
            r2.A0J(r1)
            java.lang.String r1 = "biography"
            r2.A0O(r1, r10)
            r1 = 1035(0x40b, float:1.45E-42)
            java.lang.String r1 = X.C18170wI.A00(r1)
            r2.A0O(r1, r9)
            java.lang.String r1 = "url_title"
            r2.A0O(r1, r8)
            java.lang.String r1 = "is_private"
            r2.A0R(r1, r6)
            if (r0 == 0) goto L_0x00d4
            java.lang.String r1 = "upload_id"
            r2.A0O(r1, r0)
        L_0x00c5:
            X.H8c r2 = r2.A02()
            r1 = 1999711432(0x77312cc8, float:3.5935344E33)
            r0 = 0
            java.lang.Object r0 = X.C63623hv.A00(r2, r3, r1, r0)
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x00d4:
            if (r7 == 0) goto L_0x00dc
            java.lang.String r0 = "copy_ig_profile_picture_to_text_post_app"
        L_0x00d8:
            r2.A0R(r0, r5)
            goto L_0x00c5
        L_0x00dc:
            if (r12 == 0) goto L_0x00c5
            java.lang.String r0 = "remove_profile_picture"
            goto L_0x00d8
        L_0x00e1:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r3.<init>(r13, r14, r4)
            goto L_0x0015
        L_0x00e8:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00f2:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.profile.editor.ProfileEditorViewModel.A00(com.instagram.barcelona.profile.editor.ProfileEditorViewModel, X.8n9):java.lang.Object");
    }

    public /* synthetic */ ProfileEditorViewModel(C121177En r18, C107856hQ r19, UserSession userSession) {
        UserSession userSession2 = userSession;
        AnonymousClass37V r2 = new AnonymousClass37V(userSession2);
        EditProfileRepositoryProfileEditorImpl editProfileRepositoryProfileEditorImpl = (EditProfileRepositoryProfileEditorImpl) userSession2.A01(EditProfileRepositoryProfileEditorImpl.class, new KtLambdaShape36S0100000_I2_16(userSession2, 0));
        C04220Ms.A0B(editProfileRepositoryProfileEditorImpl, 5);
        this.A03 = userSession2;
        this.A00 = r2;
        this.A02 = editProfileRepositoryProfileEditorImpl;
        C121177En r8 = r18;
        C107856hQ r9 = r19;
        ProfilePictureDelegateImpl profilePictureDelegateImpl = new ProfilePictureDelegateImpl(r8, r9, editProfileRepositoryProfileEditorImpl, (C105546db) userSession2.A01(C105546db.class, AnonymousClass8HV.A00), AnonymousClass3J5.A00(this));
        this.A01 = profilePictureDelegateImpl;
        C27457Enn A0z = C18190wL.A0z(C970667u.Initial);
        this.A04 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(new KtCSuperShape0S0030000_I2(7, 1, false, false, false));
        this.A05 = A0z2;
        C84714tk A032 = C25807DsL.A03(new KtSLambdaShape2S0500000_I2(this, (C146958n9) null, 0), editProfileRepositoryProfileEditorImpl.A05, A0z, profilePictureDelegateImpl.A04, A0z2);
        this.A06 = C25753DrP.A04(new KtCSuperShape0S0500000_I2(), AnonymousClass3J5.A00(this), A032, AnonymousClass74I.A00);
        editProfileRepositoryProfileEditorImpl.A02.CrC((Object) null);
        editProfileRepositoryProfileEditorImpl.A03.CrC(AnonymousClass6NV.A00(C06810aP.A01.A01(editProfileRepositoryProfileEditorImpl.A01)));
    }

    public static final boolean A01(ProfileEditorViewModel profileEditorViewModel, AnonymousClass5Im r4) {
        C04620Ok r2 = C06810aP.A01;
        UserSession userSession = profileEditorViewModel.A03;
        if (!C04220Ms.A0I(AnonymousClass6NV.A00(r2.A01(userSession)).A03, r4.A03) || !C04220Ms.A0I(AnonymousClass6NV.A00(r2.A01(userSession)).A00, r4.A00) || !C04220Ms.A0I(AnonymousClass6NV.A00(r2.A01(userSession)).A01, r4.A01) || AnonymousClass6NV.A00(r2.A01(userSession)).A06 != r4.A06) {
            return true;
        }
        return false;
    }

    public final void A02() {
        Object value;
        KtCSuperShape0S0030000_I2 ktCSuperShape0S0030000_I2;
        C86074wE r6 = this.A05;
        do {
            value = r6.getValue();
            ktCSuperShape0S0030000_I2 = (KtCSuperShape0S0030000_I2) value;
        } while (!r6.ADi(value, new KtCSuperShape0S0030000_I2(1, ktCSuperShape0S0030000_I2.A01, ktCSuperShape0S0030000_I2.A00, false)));
    }
}
