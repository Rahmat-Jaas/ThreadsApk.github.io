package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Kt  reason: invalid class name and case insensitive filesystem */
public final class C34752Kt {
    public static final boolean A00(SocialContextType socialContextType, UserSession userSession) {
        AnonymousClass0TJ r2;
        long j;
        switch (C18230wP.A04(socialContextType, 1)) {
            case 7:
                r2 = AnonymousClass0TJ.A05;
                j = 36327267181602752L;
                break;
            case 8:
                r2 = AnonymousClass0TJ.A05;
                j = 36327267181537215L;
                break;
            case 9:
                r2 = AnonymousClass0TJ.A05;
                j = 36327267181668289L;
                break;
            case 10:
                r2 = AnonymousClass0TJ.A05;
                j = 36327267181799363L;
                break;
            case 11:
                r2 = AnonymousClass0TJ.A05;
                j = 36327267181340604L;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r2 = AnonymousClass0TJ.A05;
                j = 36327267181471678L;
                break;
            case 13:
                r2 = AnonymousClass0TJ.A05;
                j = 36327267181406141L;
                break;
            case 14:
                r2 = AnonymousClass0TJ.A05;
                j = 36327267181733826L;
                break;
            case 15:
                r2 = AnonymousClass0TJ.A05;
                j = 36327267181864900L;
                break;
            default:
                return false;
        }
        return C63803iN.A0E(r2, userSession, j);
    }
}
