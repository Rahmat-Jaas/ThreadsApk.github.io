package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1cv;
import X.AnonymousClass2SN;
import X.AnonymousClass37O;
import X.AnonymousClass3Rp;
import X.C04220Ms;
import X.C111686o9;
import X.C147138nS;
import X.C18190wL;
import X.C19510zz;
import X.C32242Ay;
import X.C35162Mi;
import X.C37744K2e;
import X.C60113Ns;
import X.C62793ak;
import X.C98376Fg;
import X.C9M;
import X.CT6;
import X.GX6;
import com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository;
import com.instagram.arp.profilepicture.upsell.AvatarProfilePictureUpsellViewModel;
import com.instagram.direct.headmojis.service.HeadmojiRepository;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;

public class IDxFactoryShape557S0100000_1_I2 implements C147138nS {
    public Object A00;
    public final int A01;

    public IDxFactoryShape557S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final C62793ak create(Class cls) {
        switch (this.A01) {
            case 0:
                C04220Ms.A0B(cls, 0);
                if (cls.isAssignableFrom(AvatarProfilePictureUpsellViewModel.class)) {
                    UserSession userSession = (UserSession) this.A00;
                    new GX6(userSession);
                    userSession.A01(EditAvatarProfilePictureRepository.class, new KtLambdaShape29S0100000_I2_9(userSession, 19));
                    AnonymousClass2SN.A00(userSession);
                    new AnonymousClass3Rp((C32242Ay) null, (C37744K2e) null, (DefaultConstructorMarker) null, 3);
                    new AnonymousClass37O(userSession);
                    C60113Ns.A00();
                    throw null;
                }
                throw C18190wL.A0a(AnonymousClass0wJ.A0t("Unknown ViewModel class: ", cls));
            case 1:
                return new C9M((HeadmojiRepository) ((CT6) this.A00).A06.getValue());
            default:
                return new C19510zz(C35162Mi.A00(AnonymousClass0wJ.A0X(((AnonymousClass1cv) this.A00).A06)));
        }
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }
}
