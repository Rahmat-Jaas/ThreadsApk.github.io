package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import kotlin.Unit;

/* renamed from: X.8QE  reason: invalid class name */
public final class AnonymousClass8QE extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8QE A00 = new AnonymousClass8QE();

    public AnonymousClass8QE() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        VideoEffectCommunicationApi videoEffectCommunicationApi = C86134wK.A0Z(obj).A00;
        if (videoEffectCommunicationApi != null) {
            videoEffectCommunicationApi.participantModuleReset();
        }
        return Unit.A00;
    }
}
