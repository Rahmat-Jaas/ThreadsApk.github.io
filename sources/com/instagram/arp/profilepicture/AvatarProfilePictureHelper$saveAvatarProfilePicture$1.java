package com.instagram.arp.profilepicture;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass24Z;
import X.AnonymousClass3GB;
import X.C04220Ms;
import X.C146958n9;
import X.C18220wO;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository;
import com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository$saveAndSetAvatarProfilePicture$1;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.arp.profilepicture.AvatarProfilePictureHelper$saveAvatarProfilePicture$1", f = "AvatarProfilePictureHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarProfilePictureHelper$saveAvatarProfilePicture$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ AnonymousClass3GB A00;
    public final /* synthetic */ AnonymousClass24Z A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePictureHelper$saveAvatarProfilePicture$1(AnonymousClass3GB r2, AnonymousClass24Z r3, String str, String str2, C146958n9 r6) {
        super(2, r6);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = str;
        this.A02 = str2;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        return new AvatarProfilePictureHelper$saveAvatarProfilePicture$1(this.A00, this.A01, this.A03, this.A02, r8);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarProfilePictureHelper$saveAvatarProfilePicture$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        EditAvatarProfilePictureRepository editAvatarProfilePictureRepository = this.A00.A04;
        AnonymousClass24Z r3 = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        C04220Ms.A0B(r3, 0);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new EditAvatarProfilePictureRepository$saveAndSetAvatarProfilePicture$1(r3, editAvatarProfilePictureRepository, str, str2, (C146958n9) null), editAvatarProfilePictureRepository.A09, 3);
        return Unit.A00;
    }
}
