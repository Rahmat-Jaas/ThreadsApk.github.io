package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import kotlin.Unit;

/* renamed from: X.8QF  reason: invalid class name */
public final class AnonymousClass8QF extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8QF A00 = new AnonymousClass8QF();

    public AnonymousClass8QF() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C91165fi A0Z = C86134wK.A0Z(obj);
        if (A0Z.A04 != null) {
            A0Z.A04 = null;
            VideoEffectCommunicationApi videoEffectCommunicationApi = A0Z.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.participantModuleReset();
            }
            A0Z.A02 = null;
            A0Z.A07.A02 = null;
            A0Z.A06.clear();
        }
        return Unit.A00;
    }
}
